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
			System.out.println("Erro ao executar a Query de Cadastro do Usuário. Erro: " + e.getMessage());
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
			System.out.println("Erro ao executar a Query de Consulta de Usuários.");
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
			System.out.println("Erro ao executar a Query de Consulta de Usuário por nome. Erro: " + e.getMessage());
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return usuarioVO;
	}

	public ArrayList<UsuarioVO> listarPorNivel(NivelVO nivel) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		ArrayList<UsuarioVO> usuariosVO = new ArrayList<UsuarioVO>();

		String query = "SELECT USUARIO.IDUSUARIO, USUARIO.NOME, USUARIO.EMAIL, NIVEL.IDNIVEL, NIVEL.DESCRICAO"
				+ " FROM USUARIO INNER JOIN NIVEL ON USUARIO.IDNIVEL = NIVEL.IDNIVEL WHERE NIVEL.IDNIVEL = "
				+ nivel.getId() + "";

		try {
			resultado = stmt.executeQuery(query);
			while (resultado.next()) {
				UsuarioVO usuarioVO = new UsuarioVO();
				usuarioVO.setId(Integer.parseInt(resultado.getString(1)));
				usuarioVO.setNome(resultado.getString(2));
				usuarioVO.setEmail(resultado.getString(3));
				NivelVO nivelVO = new NivelVO();
				nivelVO.setId(Integer.parseInt(resultado.getString(4)));
				nivelVO.setDescricao(resultado.getString(5));
				usuarioVO.setNivelVO(nivelVO);
				usuariosVO.add(usuarioVO);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de Consulta de Usuarios por Nível.");
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return usuariosVO;
	}

	public boolean existeRegistroADM(UsuarioVO usuarioADM) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;

		String query = "SELECT USUARIO.EMAIL, USUARIO.SENHA, NIVEL.DESCRICAO "
				+ "FROM USUARIO INNER JOIN NIVEL ON USUARIO.IDNIVEL = NIVEL.IDNIVEL WHERE USUARIO.EMAIL = '"
				+ usuarioADM.getEmail() + "' " + "AND USUARIO.SENHA = '" + usuarioADM.getSenha()
				+ "' AND NIVEL.DESCRICAO = ADMIN";
		try {
			resultado = stmt.executeQuery(query);
			if (resultado.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de Registro por Admin. Erro: " + e.getMessage());
			return false;
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return false;
	}

	public int excluir(UsuarioVO usuarioNormal) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;

		String query = "DELETE FROM USUARIO WHERE IDUSUARIO = " + usuarioNormal.getId();
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de Exclusão do Usuario. Erro: " + e.getMessage());
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return resultado;
	}
}
