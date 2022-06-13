package com.java.app2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet12
 */
@WebServlet("/InsertServlet12")
public class InsertServlet12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet12() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");  
	        
	          
	        PrintWriter pw = response.getWriter();
			String userid =request.getParameter("id");
			int userroll=Integer.parseInt(request.getParameter("roll"));
			String username =request.getParameter("name");
			int userage=Integer.parseInt(request.getParameter("age"));
			int usertotal=Integer.parseInt(request.getParameter("total"));
			String usergrade =request.getParameter("grade");
			
	        StudentModel s=new StudentModel();  
	        s.setId(userid);
	        s.setRollNumber(userroll);
	        s.setName(username);
	        s.setAge(userage);
	        s.setTotalmark(usertotal);
	        s.setGrade(usergrade);
	        
	          
	        int status=StudentDBC.insert(s);  
	        if(status>0){  
	            pw.print("<p>Record saved successfully!</p>");  
	            
	        }else{  
	            pw.println("Sorry! unable to save record");  
	        }  
	          
	        pw.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
