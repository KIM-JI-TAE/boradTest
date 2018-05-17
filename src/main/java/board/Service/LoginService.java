package board.Service;

import java.util.List;

import board.Dao.LoginDao;
import board.Dao.LoginDaoInf;
import board.Model.WebMemberVO;

public class LoginService implements LoginServiceInf {

	private LoginDaoInf loginDao;
	private List<WebMemberVO> webMemberList;
	
	public LoginService() {
		loginDao = new LoginDao();
	}

	@Override
	public boolean loginProcess(WebMemberVO wmv) {
		boolean result = false;		
		for(WebMemberVO vo : webMemberList){
			if(vo.getMem_id().equals(wmv.getMem_id()) && vo.getMem_pass().equals(wmv.getMem_pass())){
				result = true;
				break;
			}
		}
		return result;

	}
	
}
