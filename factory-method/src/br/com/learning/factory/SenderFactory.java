package br.com.learning.factory;

import br.com.learning.interfaces.ISender;
import br.com.learning.interfaces.impl.SenderEmail;
import br.com.learning.interfaces.impl.SenderJMS;
import br.com.learning.interfaces.impl.SenderSMS;

public class SenderFactory {

	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	
	public ISender create(int senderType) {
		
		if(senderType == SenderFactory.SMS) {
			return new SenderSMS();
		} else if(senderType == SenderFactory.EMAIL) {
			return new SenderEmail();
		} else if(senderType == SenderFactory.JMS) {
			return new SenderJMS();
		} else {
			throw new IllegalArgumentException("Tipo de emissor não suportado!");
		}
		
	}
	
}
