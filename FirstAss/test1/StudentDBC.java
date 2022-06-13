package com.java.app2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDBC {
	public final static String DB_DRIVER_CLASS="org.postgresql.Driver";
public static String DB_URL="jdbc:postgresql://localhost:5432/vastpro";
public static String DB_USERNAME="postgres";
public static String DB_PASSWORD="postgres";

	
	 
    public static Connection getConnection(){  
        Connection conn=null;  
        try{  
            Class.forName(DB_DRIVER_CLASS);  
            conn= DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        	}  
        return conn;  
    }  
    public static int insert(StudentModel sm)
    { int status=0;
    	try{  
            Connection con=StudentDBC.getConnection();  
            PreparedStatement ps=con.prepareStatement("insert into students11 (id,Rollnumber,name,Age,totalmark,grade) values(?,?,?,?,?,?);");
                          
            ps.setString(1,sm.getId());  
            ps.setInt(2,sm.getRollNumber());  
            ps.setString(3,sm.getName());  
            ps.setInt(4,sm.getAge());  
            ps.setInt(5, sm.getTotalmark());
            ps.setString(6,sm.getGrade());
              
            status=ps.executeUpdate();  
              
            con.close();  
        }
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    		}
		return status;  
          
         
    }
    public static int update(StudentModel sm){  
        int status=0;  
        try{  
            Connection con=StudentDBC.getConnection();  
            PreparedStatement ps=con.prepareStatement("update students11 set totalmark=? , grade=? where Rollnumber=?");
           
            ps.setInt(3,sm.getRollNumber());  
            ps.setInt(1, sm.getTotalmark());
            ps.setString(2,sm.getGrade());
              
              
            status=ps.executeUpdate();  
              
            con.close();  
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        	}  
        return status;  
        }
    public static int delete(StudentModel sm)
    {
    	int status=0;
    	try
    	{
    		Connection con = StudentDBC.getConnection();
    		PreparedStatement ps = con.prepareStatement("delete from students11 where Rollnumber=?;");
    		ps.setInt(1, sm.getRollNumber());
    		 status=ps.executeUpdate();  
             
             con.close();  
    		
    	}
    	  catch(Exception ex)
        {
        	ex.printStackTrace();
        	}  
    	return status;
    	
    }
          
       

}
