package board.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.Dao.BoardDao;
import board.Dao.BoardDaoInf;
import board.Model.BoardVO;

public class BoardService implements BoardServiceInf {

	private BoardDaoInf boardDao;
	private List<BoardVO> boardList;

	public BoardService() {
		boardDao = new BoardDao();
	}

	@Override
	public Map<String, Object> getBoardPageList(int page, int pageSize) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		List<BoardVO> boardList = boardDao.getBoardPageList(page, pageSize);
		int boardTotalCnt = boardDao.getBoardTotalCnt();
		String pageNav = makePageNav(page, boardTotalCnt);
		
		resultMap.put("boardList", boardList);
		resultMap.put("pageNav", pageNav);
		
		return resultMap;
	}

	private String makePageNav(int page, int boardTotalCnt) {

		int pageTotalCnt = (int) Math.ceil((double) (boardTotalCnt) / 10);

		StringBuffer pageNav = new StringBuffer();
		pageNav.append("<nav>");
		pageNav.append("	<ul class=\"pagination\">");
		pageNav.append("		<li>");
		pageNav.append(
				"			<a href=\"getBoardPageList\" aria-label=\"Previous\"> <span aria-hidden=\"true\">&laquo;</span></a>");
		pageNav.append("		</li>");

		for (int i = 1; i <= pageTotalCnt; i++) {
			if (page == i) {
				pageNav.append("		<li class='active'><a href=\"getBoardPageList?page=" + i + "&pageSize=10\">" + i
						+ "</a></li>");
			} else {
				pageNav.append("		<li><a href=\"getBoardPageList?page=" + i + "&pageSize=10\">" + i + "</a></li>");
			}
		}
		// pageNav.append(" <li><a href=\"#\">1</a></li>");
		// pageNav.append(" <li><a href=\"#\">2</a></li>");
		// pageNav.append(" <li><a href=\"#\">3</a></li>");
		pageNav.append("		<li><a href=\"getBoardPageList?page=" + pageTotalCnt
				+ "&pageSize=10\" aria-label=\"Next\"> <span aria-hidden=\"true\">&raquo;</span></a></li>");
		pageNav.append("	</ul>");
		pageNav.append("</nav>");

		return pageNav.toString();
	}

	@Override
	public int getBoardTotalCnt() {
		// TODO Auto-generated method stub
		return boardDao.getBoardTotalCnt();
	}

	@Override
	public BoardVO getboard(int board_seq) {
		// TODO Auto-generated method stub
		return boardDao.getboard(board_seq);
	}

}
