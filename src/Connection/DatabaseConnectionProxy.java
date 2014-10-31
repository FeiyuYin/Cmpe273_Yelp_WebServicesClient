package Connection;

public class DatabaseConnectionProxy implements Connection.DatabaseConnection {
  private String _endpoint = null;
  private Connection.DatabaseConnection databaseConnection = null;
  
  public DatabaseConnectionProxy() {
    _initDatabaseConnectionProxy();
  }
  
  public DatabaseConnectionProxy(String endpoint) {
    _endpoint = endpoint;
    _initDatabaseConnectionProxy();
  }
  
  private void _initDatabaseConnectionProxy() {
    try {
      databaseConnection = (new Connection.DatabaseConnectionServiceLocator()).getDatabaseConnection();
      if (databaseConnection != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)databaseConnection)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)databaseConnection)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (databaseConnection != null)
      ((javax.xml.rpc.Stub)databaseConnection)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Connection.DatabaseConnection getDatabaseConnection() {
    if (databaseConnection == null)
      _initDatabaseConnectionProxy();
    return databaseConnection;
  }
  
  public java.lang.String signUp(java.lang.String email, java.lang.String password, java.lang.String firstname, java.lang.String lastname, java.lang.String zipcode) throws java.rmi.RemoteException{
    if (databaseConnection == null)
      _initDatabaseConnectionProxy();
    return databaseConnection.signUp(email, password, firstname, lastname, zipcode);
  }
  
  
}