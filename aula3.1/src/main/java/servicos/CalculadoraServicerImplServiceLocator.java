/**
 * CalculadoraServicerImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicos;

public class CalculadoraServicerImplServiceLocator extends org.apache.axis.client.Service implements servicos.CalculadoraServicerImplService {

    public CalculadoraServicerImplServiceLocator() {
    }


    public CalculadoraServicerImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculadoraServicerImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculadoraServerPort
    private java.lang.String CalculadoraServerPort_address = "http://localhost:8080/aula3-0.0.1-SNAPSHOT/calculadoraServicerImpl";

    public java.lang.String getCalculadoraServerPortAddress() {
        return CalculadoraServerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculadoraServerPortWSDDServiceName = "CalculadoraServerPort";

    public java.lang.String getCalculadoraServerPortWSDDServiceName() {
        return CalculadoraServerPortWSDDServiceName;
    }

    public void setCalculadoraServerPortWSDDServiceName(java.lang.String name) {
        CalculadoraServerPortWSDDServiceName = name;
    }

    public servicos.CalculadoraServicer getCalculadoraServerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculadoraServerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculadoraServerPort(endpoint);
    }

    public servicos.CalculadoraServicer getCalculadoraServerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            servicos.CalculadoraServicerImplServiceSoapBindingStub _stub = new servicos.CalculadoraServicerImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculadoraServerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculadoraServerPortEndpointAddress(java.lang.String address) {
        CalculadoraServerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (servicos.CalculadoraServicer.class.isAssignableFrom(serviceEndpointInterface)) {
                servicos.CalculadoraServicerImplServiceSoapBindingStub _stub = new servicos.CalculadoraServicerImplServiceSoapBindingStub(new java.net.URL(CalculadoraServerPort_address), this);
                _stub.setPortName(getCalculadoraServerPortWSDDServiceName());
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
        if ("CalculadoraServerPort".equals(inputPortName)) {
            return getCalculadoraServerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicos/", "calculadoraServicerImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicos/", "CalculadoraServerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculadoraServerPort".equals(portName)) {
            setCalculadoraServerPortEndpointAddress(address);
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
