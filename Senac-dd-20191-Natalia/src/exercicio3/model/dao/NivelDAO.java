package exercicio3.model.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import exercicio3.model.vo.NivelVO;

public class NivelDAO {

	public ArrayList<NivelVO> consultarNiveis() {
		Connection conn = Banco.getConnection();
		Statement stmt = (Statement) Banco.getStatement(conn);
		ResultSet resultado = null;
		ArrayList<NivelVO> niveis = new ArrayList<NivelVO>();
		String query = "SELECT IDNIVEL, DESCRICAO" + " FROM  NIVEL";
		try {
			resultado = ((java.sql.Statement) stmt).executeQuery(query);
			while (resultado.next()) {
				NivelVO nivel = new NivelVO();
				nivel.setId(Integer.parseInt(resultado.getString(1)));
				nivel.setDescricao(resultado.getString(2));
				niveis.add(nivel);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de Consulta de Niveis");
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement((java.sql.Statement) stmt);
			Banco.closeConnection(conn);
		}
		return niveis;
	}

}