

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codefiles.BookDao;
import com.codefiles.BookPojo;

/**
 * Servlet implementation class BookCtrl
 */
@WebServlet("/BookCtrl")
public class BookCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		
		String isbn=request.getParameter("isbn");
		String bname=request.getParameter("bname");
		String bauthor=request.getParameter("bauthor");
		String bprice=request.getParameter("bprice");
		String bpubl=request.getParameter("bpubl");
		String bimg=request.getParameter("bimg");
		
		BookPojo bpojo=new BookPojo(isbn, bname, bauthor, Float.parseFloat(bprice), bpubl, bimg);
		
		String str=new BookDao().addBook(bpojo);
		if(str.equals("success"))
		{
			pw.print("Book Added successfully");
			RequestDispatcher rd=request.getRequestDispatcher("Menu.jsp");
			rd.include(request, response);
		}
		else
		{
			pw.print("Some error occured failed to add book");
			RequestDispatcher rd=request.getRequestDispatcher("Menu.jsp");
			rd.include(request, response);
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
