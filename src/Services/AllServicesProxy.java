package Services;

public class AllServicesProxy implements Services.AllServices {
  private String _endpoint = null;
  private Services.AllServices allServices = null;
  
  public AllServicesProxy() {
    _initAllServicesProxy();
  }
  
  public AllServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initAllServicesProxy();
  }
  
  private void _initAllServicesProxy() {
    try {
      allServices = (new Services.AllServicesServiceLocator()).getAllServices();
      if (allServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)allServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)allServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (allServices != null)
      ((javax.xml.rpc.Stub)allServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Services.AllServices getAllServices() {
    if (allServices == null)
      _initAllServicesProxy();
    return allServices;
  }
  
  public java.lang.String signUp(java.lang.String email, java.lang.String password, java.lang.String firstname, java.lang.String lastname, java.lang.String zipcode) throws java.rmi.RemoteException{
    if (allServices == null)
      _initAllServicesProxy();
    return allServices.signUp(email, password, firstname, lastname, zipcode);
  }
  
  public boolean signIn(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (allServices == null)
      _initAllServicesProxy();
    return allServices.signIn(email, password);
  }
  
  
}