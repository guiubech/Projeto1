package org.com.explosaula.produces;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@ApplicationScoped
public class EntityManagerProducer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(EntityManagerProducer.class.getCanonicalName());
	
	@PersistenceContext private EntityManager em;
		
	@PostConstruct
	public void init() {
		logger.info("Criando o entityManager");
	}
	
	@Produces
	public EntityManager produces() {
		return em;
	}
	
	public void close(@Disposes EntityManager em) {
		if (em.isOpen()) {
			em.close();
		}
	}
	
	@PreDestroy
	public void finaliza() {
		logger.info("Finalizando o entityManager");
		em.close();
	}
}
