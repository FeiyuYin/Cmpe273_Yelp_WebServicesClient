/**
 * DatabaseConnectionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Connection;

public interface DatabaseConnectionService extends javax.xml.rpc.Service {
    public java.lang.String getDatabaseConnectionAddress();

    public Connection.DatabaseConnection getDatabaseConnection() throws javax.xml.rpc.ServiceException;

    public Connection.DatabaseConnection getDatabaseConnection(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
