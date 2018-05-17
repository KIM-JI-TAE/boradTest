package board.Dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.Model.WebMemberVO;

public class LoginDao implements LoginDaoInf{
	
	private SqlSessionFactory sqlSessionFactory;
	
	public LoginDao() {
		String resource = "db/mybatis/mybatisConfig.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public WebMemberVO userLogin(WebMemberVO wmv) throws SQLException {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		WebMemberVO webMemberVo = sqlSession.selectOne("board.userLogin", wmv);
		sqlSession.close();
		return webMemberVo;
	}
	


}
