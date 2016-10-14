package br.com.learning.test;

import br.com.learning.factory.SenderFactory;
import br.com.learning.interfaces.ISender;

public class SenderMain {

	public static void main(String[] args) {
		
		SenderFactory factory = new SenderFactory();
		toSend(factory.create(SenderFactory.SMS), "Padrão Factory Method: envio SMS");
		toSend(factory.create(SenderFactory.EMAIL), "Padrão Factory Method: envio EMAIL");
		toSend(factory.create(SenderFactory.JMS), "Padrão Factory Method: envio JMS");
		
	}
	
	/**
	 * A implementação de ISender pode ser alterada em qualquer momento sem que tenha que alterar este método, 
	 * diminuindo o acoplamento.
	 * @param sender
	 * @param msg
	 */
	private static void toSend(ISender sender, String msg) {
		sender.send(msg);
	}
}
