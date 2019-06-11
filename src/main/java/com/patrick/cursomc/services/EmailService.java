package com.patrick.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.patrick.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}