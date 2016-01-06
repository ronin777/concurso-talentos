package test;

import static org.junit.Assert.assertEquals;

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
	private Concursante malabaristaRecitador;
	
	@Before
	public void before(){
		ApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		malabarista= (Concursante) contexto.getBean("solei");
		malabaristaRecitador= (Concursante) contexto.getBean("soleiRecitador");
	}
	
	@Test
	public void testMalabarista(){
		logger.info("Ejecuta Malabarista");
		int numPelotas=10;
		malabarista.ejecutar();
		assertEquals(numPelotas, ((Malabarista)malabarista).getPelotas());
		logger.info("Fin de la ejecucion del Malabarista");
		logger.info("Inicia el Malabarista Recitador");
		numPelotas=15;
		malabaristaRecitador.ejecutar();
		assertEquals(numPelotas, ((Malabarista)malabaristaRecitador).getPelotas());
		logger.info("Fin del Malabarista Recitador");
	}
	
}
