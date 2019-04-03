package exercicio3.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;

import exercicio3.model.vo.NivelVO;
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
			System.out.println("Erro ao executar a Query de Cadastro do Usu�rio. Erro: " + e.getMessage());
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return statusPersistencia;
	}

	public ArrayList<UsuarioVO> listarTodos() {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		ArrayList<UsuarioVO> usuariosVO = new ArrayList<UsuarioVO>();
		String query = "SELECT USUARIO.IDUSUARIO, USUARIO.NOME, USUARIO.EMAIL, NIVEL.IDNIVEL, NIVEL.DESCRICAO FROM USUARIO INNER JOIN NIVEL ON USUARIO.IDNIVEL = NIVEL.IDNIVEL";
		try {
			resultado = stmt.executeQuery(query);
			while (resultado.next()) {
				UsuarioVO usuarioVO = new UsuarioVO();
				usuarioVO.setId(Integer.parseInt(resultado.getString(1)));
				usuarioVO.setNome(resultado.getString(2));
				usuarioVO.setEmail((resultado.getString(3)));
				NivelVO nivelVO = new NivelVO();
				nivelVO.setDescricao(resultado.getString(4));
				nivelVO.setId(Integer.parseInt(resultado.getString(5)));
				usuariosVO.add(usuarioVO);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de Consulta de Usu�rios.");
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return usuariosVO;
	}

	public UsuarioVO listarPorNome(String nome) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		UsuarioVO usuarioVO = null;

		String query = "SELECT USUARIO.IDUSUARIO, USUARIO.NOME, USUARIO.EMAIL, NIVEL.IDNIVEL, NIVEL.DESCRICAO FROM USUARIO INNER JOIN NIVEL ON USUARIO.IDNIVEL = NIVEL.IDNIVEL WHERE UPPER(USUARIO.NOME) = '"
				+ nome.toUpperCase() + "'";

		try {
			resultado = stmt.executeQuery(query);
			while (resultado.next()) {
				usuarioVO = new UsuarioVO();
				usuarioVO.setId(Integer.parseInt(resultado.getString(1)));
				usuarioVO.setNome(resultado.getString(2));
				usuarioVO.setEmail((resultado.getString(3)));
				NivelVO nivelVO = new NivelVO();
				nivelVO.setDescricao(resultado.getString(4));
				nivelVO.setId(Integer.parseInt(resultado.getString(5)));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de Consulta de Usu�rio por nome. Erro: " + e.getMessage());
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return usuarioVO;
	}
}
