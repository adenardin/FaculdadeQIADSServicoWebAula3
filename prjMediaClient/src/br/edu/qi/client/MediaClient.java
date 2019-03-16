package br.edu.qi.client;


import br.edu.qi.service.INota;
import br.edu.qi.service.NotaWsService;

public class MediaClient {

	public static void main(String[] args) {
    	NotaWsService service = new NotaWsService();
    	INota nota = service.getNotaWsPort();

    	System.out.println("A média é "+ 
    	nota.media(1, "126", 20191));
    	
	}
}
