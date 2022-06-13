package com.java.app2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet12
 */
@WebServlet("/UpdateServlet12")
public class UpdateServlet12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet12() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw= response.getWriter();
		int userroll=Integer.parseInt(request.getParameter("roll"));
		int total= Integer.parseInt(request.getParameter("total"));
		//String grade= request.getParameter("grade");
		StudentModel sm = new StudentModel();
		sm.setRollNumber(userroll);
		sm.setTotalmark(total);
		//sm.setGrade(grade);
		int status =StudentDBC.update(sm);
		 if(status>0){  
	            pw.print("<h1>update successfully!</h1>");  
	            
	        }else{  
	            pw.println("Sorry! unable to update record");  
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
