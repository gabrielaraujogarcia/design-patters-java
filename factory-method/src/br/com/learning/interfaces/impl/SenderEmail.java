package br.com.learning.interfaces.impl;

import br.com.learning.interfaces.ISender;

public class SenderEmail implements ISender {

	@Override
	public void send(String message) {
		System.out.println("Envio da mensagem por e-mail");
		System.out.println(message);
	}
}
