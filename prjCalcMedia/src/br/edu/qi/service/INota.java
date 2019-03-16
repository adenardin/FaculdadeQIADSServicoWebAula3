package br.edu.qi.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface INota {
	@WebMethod
	public float media(int codDisc, String ra, int anoSem);
}
