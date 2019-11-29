package premierProjetWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServlet
 */
@SuppressWarnings("serial")
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("ça marche");
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<HTML>");
	out.println("<HEAD><TITLE>Liste des formations du catalogue </TITLE></HEAD>");
	out.println("<BODY>");
	out.println("<CENTER><h1>Liste des formations : Java, Webservices</h1> </CENTER");
	out.println("</BODY>");
	out.println("</HTML>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
