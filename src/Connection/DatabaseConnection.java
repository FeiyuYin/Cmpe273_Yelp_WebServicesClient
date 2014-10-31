/**
 * DatabaseConnection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Connection;

public interface DatabaseConnection extends java.rmi.Remote {
    public java.lang.String signUp(java.lang.String email, java.lang.String password, java.lang.String firstname, java.lang.String lastname, java.lang.String zipcode) throws java.rmi.RemoteException;
}
