

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codefiles.LoginDao;
import com.codefiles.LoginPojo;

/**
 * Servlet implementation class LoginCtrl
 */
@WebServlet("/LoginCtrl")
public class LoginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCtrl() {
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
		
		PrintWriter pw=response.getWriter();
		
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		if(uname.equals("onkar@org.com")&& pwd.equals("pass321"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Menu.jsp");
			rd.forward(request, response);
		}
		else
		{
			LoginPojo lpojo=new LoginPojo(uname, pwd);
			
			String str=new LoginDao().validateUser(lpojo);
				if(str.equals("success"))
				{
					RequestDispatcher rd=request.getRequestDispatcher("ShowBooks.jsp");
					rd.forward(request, response);
				}
				else
				{
					pw.print("<center><font color='white'>Incorrect Username or Password</font></center>");
					RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
					rd.include(request, response);
				}
		}
		
	}

}
