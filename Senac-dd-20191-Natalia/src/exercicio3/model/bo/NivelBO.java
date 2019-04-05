package exercicio3.model.bo;

import java.util.ArrayList;
import exercicio3.model.dao.NivelDAO;
import exercicio3.model.vo.NivelVO;

public class NivelBO {

	public ArrayList<NivelVO> consultarNivel() {
		NivelDAO nivelDAO = new NivelDAO();
		return nivelDAO.consultarNivel();
	}

}
