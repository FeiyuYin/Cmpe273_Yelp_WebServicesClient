package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Services.AllServicesProxy;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AllServicesProxy proxy=new AllServicesProxy();    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String qdone;		 
		 try{			
			 	String email = request.getParameter("email");
			 	String pass = request.getParameter("password");
			 	String firstname = request.getParameter("firstname");
			 	String lastname = request.getParameter("lastname");
			 	String zipcode = request.getParameter("zipcode");
			 	proxy.setEndpoint("http://localhost:8080/273Lab_Yelp_WebServices/services/AllServices");
			 	
				qdone = proxy.signUp(email, pass, firstname, lastname, zipcode);
				HttpSession session = request.getSession();
				if(qdone.substring(0,4).equals("true")){
					session.setAttribute("userSession", session);
					//out.println("WELCOME to Yelp :"+ email);//Displaying the message on the servlet itself.

					response.sendRedirect("/273Lab_Yelp_WebServicesClient/View/homepage.jsp");
				}
				else{
					out.println(qdone.substring(6));
					out.println("\n <a href=\"SignUp.jsp\"><br>Go back to SignUp again</a>");
				}
		 }
		 catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}

}
