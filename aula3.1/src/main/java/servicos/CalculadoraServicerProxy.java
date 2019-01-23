package servicos;

public class CalculadoraServicerProxy implements servicos.CalculadoraServicer {
  private String _endpoint = null;
  private servicos.CalculadoraServicer calculadoraServicer = null;
  
  public CalculadoraServicerProxy() {
    _initCalculadoraServicerProxy();
  }
  
  public CalculadoraServicerProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraServicerProxy();
  }
  
  private void _initCalculadoraServicerProxy() {
    try {
      calculadoraServicer = (new servicos.CalculadoraServicerImplServiceLocator()).getCalculadoraServerPort();
      if (calculadoraServicer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadoraServicer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadoraServicer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadoraServicer != null)
      ((javax.xml.rpc.Stub)calculadoraServicer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicos.CalculadoraServicer getCalculadoraServicer() {
    if (calculadoraServicer == null)
      _initCalculadoraServicerProxy();
    return calculadoraServicer;
  }
  
  public float divisao(float num1, float arg1) throws java.rmi.RemoteException{
    if (calculadoraServicer == null)
      _initCalculadoraServicerProxy();
    return calculadoraServicer.divisao(num1, arg1);
  }
  
  public float soma(float num1, float num2) throws java.rmi.RemoteException{
    if (calculadoraServicer == null)
      _initCalculadoraServicerProxy();
    return calculadoraServicer.soma(num1, num2);
  }
  
  public float subtracao(float num1, float arg1) throws java.rmi.RemoteException{
    if (calculadoraServicer == null)
      _initCalculadoraServicerProxy();
    return calculadoraServicer.subtracao(num1, arg1);
  }
  
  public float multiplicacao(float num1, float arg1) throws java.rmi.RemoteException{
    if (calculadoraServicer == null)
      _initCalculadoraServicerProxy();
    return calculadoraServicer.multiplicacao(num1, arg1);
  }
  
  
}