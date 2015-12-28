package br.com.learning.test;

import br.com.learning.factory.SenderFactory;
import br.com.learning.interfaces.ISender;

public class SenderMain {

	public static void main(String[] args) {
		
		SenderFactory factory = new SenderFactory();
		
		ISender sender = factory.create(SenderFactory.SMS);
		sender.send("Padrão Factory Method: envio SMS");
		
		sender = factory.create(SenderFactory.EMAIL);
		sender.send("Padrão Factory Method: envio EMAIL");
		
		sender = factory.create(SenderFactory.JMS);
		sender.send("Padrão Factory Method: envio JMS");
		
	}
	
	
}
