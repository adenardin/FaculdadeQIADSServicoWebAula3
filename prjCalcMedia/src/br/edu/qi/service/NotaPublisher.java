package br.edu.qi.service;

import javax.xml.ws.Endpoint;

import br.edu.qi.service.NotaWs;

public class NotaPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/notaWS", new NotaWs());
	}
}
