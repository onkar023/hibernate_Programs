

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codefiles.RegiDao;
import com.codefiles.RegiPojo;

/**
 * Servlet implementation class RegisterCtrl
 */
@WebServlet("/RegisterCtrl")
public class RegisterCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterCtrl() {
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
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String pwd=request.getParameter("pwd");
		String gender=request.getParameter("gender");
		String country=request.getParameter("country");
		String phno=request.getParameter("phno");
		
		LocalDate rdate=LocalDate.now();
		
		RegiPojo rpojo=new RegiPojo(name, email, pwd, gender, country, Long.parseLong(phno), rdate.toString());
	
		String result=new RegiDao().addUser(rpojo);
	
		if(result.equals("success"))
		{
			pw.print("Registration Successful");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
	}
}