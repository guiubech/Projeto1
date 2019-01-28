package servicos;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService(name = "CalculadoraServer")
public class calculadoraServicerImpl implements CalculadoraServicer {
	
	@Resource
	private WebServiceContext wsctx;
	
	
	public float soma(float num1, float num2) {
		
		MessageContext mctx = wsctx.getMessageContext();
		Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		List<String> userList = (List) http_headers.get("Username");
		List<String> passList = (List) http_headers.get("Password");
		
		String username = "";
		String password = "";
		
		if(userList != null) {
			username = userList.get(0);
		}
		if(passList != null) {
			password = passList.get(0);
			
		}
		if(username.equals("guiubech") && password.equals("root")) {
			return num1 + num2;
			
		}
	    return 0;
	  }
	   
	  public float subtracao(float num1, float num2) {
	    return num1 - num2;
	  }
	 
	  public float multiplicacao(float num1, float num2) {
	    return num1 * num2;
	  }
	 
	  public float divisao(float num1, float num2) {
	    return num1 / num2;
	  }
}
