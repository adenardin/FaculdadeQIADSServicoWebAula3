package br.edu.qi.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.edu.qi.dto.Nota;

public class NotaDao extends GenericDao implements IDao<Nota> {

	private static final String INSERT = "" + "INSERT INTO nota(?,?,?,?,?,?,?)";
	private static final String SELECT = "" + "select n1,n2,exame from nota" + " where codDisciplina = ? and "
			+ " ra = ? and ano_semestre = ?";

	public int save(Nota obj) throws Exception {
		return super.executeNoQuery(INSERT, obj.getCodDisciplina(), obj.getRa(), obj.getAnoSem(), obj.getN1(),
				obj.getN2(), obj.getExame(), obj.isAprovado());

	}

	public int delete(Nota obj) throws Exception {
		return 0;
	}

	public Nota find(Nota obj) throws Exception {
		ResultSet rs = super.executeQuery(SELECT, obj.getCodDisciplina(), obj.getRa(), obj.getAnoSem());
		if (!rs.next())
			return null;
		Nota nota = new Nota();
		nota.setN1(rs.getFloat("n1"));
		nota.setN2(rs.getFloat("n2"));
		nota.setExame(rs.getFloat("exame"));
		return nota;
	}

	public ArrayList<Nota> findAll() throws Exception {
		return null;
	}

}
