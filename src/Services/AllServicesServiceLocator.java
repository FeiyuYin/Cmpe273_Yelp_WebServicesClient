/**
 * AllServicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class AllServicesServiceLocator extends org.apache.axis.client.Service implements Services.AllServicesService {

    public AllServicesServiceLocator() {
    }


    public AllServicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AllServicesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AllServices
    private java.lang.String AllServices_address = "http://localhost:8080/273Lab_Yelp_WebServices/services/AllServices";

    public java.lang.String getAllServicesAddress() {
        return AllServices_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AllServicesWSDDServiceName = "AllServices";

    public java.lang.String getAllServicesWSDDServiceName() {
        return AllServicesWSDDServiceName;
    }

    public void setAllServicesWSDDServiceName(java.lang.String name) {
        AllServicesWSDDServiceName = name;
    }

    public Services.AllServices getAllServices() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AllServices_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAllServices(endpoint);
    }

    public Services.AllServices getAllServices(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Services.AllServicesSoapBindingStub _stub = new Services.AllServicesSoapBindingStub(portAddress, this);
            _stub.setPortName(getAllServicesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAllServicesEndpointAddress(java.lang.String address) {
        AllServices_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Services.AllServices.class.isAssignableFrom(serviceEndpointInterface)) {
                Services.AllServicesSoapBindingStub _stub = new Services.AllServicesSoapBindingStub(new java.net.URL(AllServices_address), this);
                _stub.setPortName(getAllServicesWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AllServices".equals(inputPortName)) {
            return getAllServices();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Services", "AllServicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Services", "AllServices"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AllServices".equals(portName)) {
            setAllServicesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
