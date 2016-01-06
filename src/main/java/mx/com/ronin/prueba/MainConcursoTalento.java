package mx.com.ronin.prueba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.ronin.concursantes.Concursante;

public class MainConcursoTalento {

	public static void main(String[] args) {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		Concursante malabarista = (Concursante) contexto.getBean("solei");
		malabarista.ejecutar();
	}
}
