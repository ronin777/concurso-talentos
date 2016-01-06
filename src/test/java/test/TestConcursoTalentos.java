package test;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.ronin.concursantes.Concursante;
import mx.com.ronin.concursantes.Malabarista;

public class TestConcursoTalentos {

	private static Log logger = LogFactory.getLog("TestConcursoTalentos");
	private Concursante malabarista;
	
	@Before
	public void before(){
		ApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		malabarista= (Concursante) contexto.getBean("solei");
	}
	
	@Test
	public void testMalabarista(){
		logger.info("Ejecuta Malabarista");
		int numPelotas=5;
		malabarista.ejecutar();
		assertEquals(numPelotas, ((Malabarista)malabarista).getPelotas());
		logger.info("Fin de la ejecucion del Malabarista");
	}
	
}
