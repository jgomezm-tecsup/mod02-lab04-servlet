package pe.edu.tecsup.app.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

//  http://localhost:8080/mod02-lab04-servlet/HelloServlet

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		response.getWriter()
//				.append("Hello World...! ")
//				.append(request.getContextPath());
		
		response.getWriter()
				.append("<html>")
				.append("<h2>doGet => Hola Mundo</h2>")
				.append("<p>Este es mi primer Servlet</p>")
				.append("</html>");
		
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.getWriter()
				.append("<html>")
				.append("<h2>doPost => Hola Mundo</h2>")
				.append("<p>Este es mi primer Servlet</p>")
				.append("</html>");
			
	}

}
