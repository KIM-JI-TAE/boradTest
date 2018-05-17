package board.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.Model.WebMemberVO;
import board.Service.LoginService;
import board.Service.LoginServiceInf;

/**
 * Servlet implementation class LoginProcessServlet
 */
@WebServlet("/LoginProcessServlet")
public class LoginProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		LoginServiceInf Service = new LoginService();
		
		WebMemberVO wmv = new WebMemberVO();
		wmv.setMem_id(request.getParameter("mem_id"));
		wmv.setMem_pass(request.getParameter("mem_pass"));
		
		boolean loginResult = Service.loginProcess(wmv);
		
		String mem_id = request.getParameter("mem_id");
		String mem_pass = request.getParameter("mem_pass");
		
		if(loginResult){
			request.setAttribute("mem_id", mem_id);
			
			HttpSession session = request.getSession();
			session.setAttribute("mem_id", mem_id);
			session.setAttribute("board", wmv);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("Board/board.jsp");
			rd.forward(request, response);
		}else{
			response.sendRedirect("login/login.jsp");
		}
	}

}
