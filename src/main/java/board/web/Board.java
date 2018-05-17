package board.web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.Service.BoardService;
import board.Service.BoardServiceInf;

/**
 * Servlet implementation class Board
 */
@WebServlet("/boardServlet")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 private BoardServiceInf boardService;
	
    public Board() {
        super();
        boardService = new BoardService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageString = request.getParameter("page");
		int page = pageString == null ? 1 : Integer.parseInt(pageString); 
		String pageSizeString = request.getParameter("pageSize");
		int pageSize = pageSizeString == null ? 10 : Integer.parseInt(pageSizeString); 
		
		
		Map<String, Object> resultMap = boardService.getBoardPageList(page, pageSize);
		
		System.out.println("resultMap.get(boardList) : " + resultMap.get("boardList"));
		
		request.setAttribute("boardList", resultMap.get("boardList"));
		request.setAttribute("pageNav", resultMap.get("pageNav"));
		
		RequestDispatcher rd = request.getRequestDispatcher("/Board/board.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
