package br.edu.qi.service;

import javax.jws.WebService;

import br.edu.qi.dao.NotaDao;
import br.edu.qi.dto.Nota;

@WebService(endpointInterface = "br.edu.qi.service.INota")
public class NotaWs implements INota {

	public float media(int codDisc, String ra, int anoSem) {
		NotaDao dao = new NotaDao();
		try {
			Nota nota = new Nota();
			nota.setRa(ra);
			nota.setCodDisciplina(codDisc);
			nota.setAnoSem(anoSem);

			Nota resultado = dao.find(nota);
			float n1, n2;
			n1 = resultado.getN1();
			n2 = resultado.getN2();
			// tem exame
			if (resultado.getExame() > 0) {
				if (n1 > n2)
					n2 = resultado.getExame();
				else
					n1 = resultado.getExame();

			}
			return (n1 + n2) / 2;

		} catch (Exception e) {
			return -1;
		}
	}

}
