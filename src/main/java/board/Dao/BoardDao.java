package board.Dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.Model.BoardVO;

public class BoardDao implements BoardDaoInf {
	private SqlSessionFactory sqlSessionFactory;

	 public BoardDao() {
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
	public List<BoardVO> getBoardPageList(int page, int pageSize) {
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("page", page);
		paramMap.put("pageSize", pageSize);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<BoardVO> boardList = sqlSession.selectList("board.getBoardPageList", paramMap);
		sqlSession.close();
		
		
		return boardList;
	}

	@Override
	public int getBoardTotalCnt() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int boardTotalCnt = sqlSession.selectOne("board.getBoardTotalCnt");
		sqlSession.close();
		return boardTotalCnt;
	}

	@Override
	public BoardVO getboard(int board_seq) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BoardVO boardVo = sqlSession.selectOne("board.getboard", board_seq);
		sqlSession.close();
		
		return boardVo;
	}

}
