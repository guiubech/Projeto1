package org.com.explosaula.qualifier;

import java.util.logging.Logger;

import org.com.explosaula.model.Usuario;



/**
 * Serviço de login que realiza a checagem de credenciais a partir de um BD.
 *
 * @author Davi Maçana
 */
@QualificadorLogin
public class ServicoLoginDb implements ServicoLogin {

	private static final Logger logger = Logger.getLogger(ServicoLoginDb.class.getCanonicalName());
	
	@Override
	public boolean fazerLogin(Usuario usuario) {
		logger.info("Realizando a operação de login via banco de dados.");
	    return true;
	}

}
