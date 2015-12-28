package br.com.learning.interfaces.impl;

import br.com.learning.interfaces.ISender;

public class SenderSMS implements ISender{

	@Override
	public void send(String message) {
		System.out.println("Envio da mensagem por SMS");
		System.out.println(message);
	}
	
}
