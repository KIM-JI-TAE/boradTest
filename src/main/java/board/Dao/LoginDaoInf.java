package board.Dao;

import java.sql.SQLException;

import board.Model.WebMemberVO;

public interface LoginDaoInf {

	public WebMemberVO userLogin(WebMemberVO wmv);
}
