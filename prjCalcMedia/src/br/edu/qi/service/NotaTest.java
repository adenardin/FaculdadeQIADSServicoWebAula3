package br.edu.qi.service;

import br.edu.qi.dto.Nota;

public class NotaTest {
	public static void main(String[] args) {
		try {
			NotaWs notaWs = new NotaWs();

			float ret = notaWs.media(1, "123", 20191);

			System.out.println("média é " + ret);
		} catch (Exception e) {
		}
	}
}
