package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Data;
import Model.Logic;

/**
 * Servlet implementation class UseServlet
 */
@WebServlet("/UserServlet")
public class UseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Data d=new Data();
		d.setUsername(request.getParameter("uname"));
		d.setPassword(request.getParameter("pwd"));
		Logic l=new Logic();
		try
		{
		if(l.UserLogin(d)==true)
		{
		    RequestDispatcher rd=request.getRequestDispatcher("loginhome.jsp");
		    rd.forward(request, response);
		}
		}
		catch(Exception e)
		
		{
			pw.print(e.getMessage());
		}	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
