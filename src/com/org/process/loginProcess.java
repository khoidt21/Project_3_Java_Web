package com.org.process;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.org.db.DBMap;

/**
 * Servlet implementation class loginProcess
 */
@WebServlet("/loginProcess")
public class loginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginProcess() {
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
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession(true);
		
		DBMap dbMap = new DBMap();
		
		dbMap.addAccount("admin", "12345");
		
		//Integer visitCount = new Integer(0);
		//String visitCountKey = new String("visitCount");
		
		if(dbMap.checkAccount(username, password)==true) {
			session.setAttribute("username",username);
			dbMap.addAcountLogin(username,password);
			response.sendRedirect("index.jsp");
		}
		else if(dbMap.checkAccount(username, password)==false) {
			session.invalidate();
			String errLogin = "Sorry UserName or Password Error!";
			request.setAttribute("error", errLogin);
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);	
		}
	}
	
}
