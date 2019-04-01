package exercicio3.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import exercicio3.model.vo.UsuarioVO;

public class UsuarioDAO {

	public int salvarUsuarioDAO(UsuarioVO usuarioVO) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int statusPersistencia = 0;

		String query = "INSERT INTO USUARIOVO (NOME, EMAIL, SENHA, IDNIVEL) VALUES ('" + usuarioVO.getNome() + "', "
				+ usuarioVO.getEmail() + "', " + usuarioVO.getSenha() + ", " + usuarioVO.getNivelVO().getId() + ")";

		try {
			statusPersistencia = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de Cadastro do Usuário. Erro: " + e.getMessage());
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return statusPersistencia;
	}

}
