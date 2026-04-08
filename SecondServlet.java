import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondServlet extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    Cookie ck[]=request.getCookies();  
    out.print("Cookie Name:="+ck[0].getName()+"<br/>");     out.print("Cookie Value:="+ck[0].getValue());  
  
    out.close();  
  
         }catch(Exception e){System.out.println(e);}  
    }  
      
  
}  