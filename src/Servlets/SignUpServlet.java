package Servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DaoStudent;
import DAO.DaoStudentImp;
import METIER.SignUp;
import METIER.Student;

/**
 * Servlet implementation class SignUpServlet
 */
//@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DaoStudent daoStudentImp;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.print("papapapapa");
		 this.daoStudentImp= new DaoStudentImp();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("aaaaaaaaaaaaaa");
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("lalalalallala");

		// TODO Auto-generated method stub
		SignUp signUpForm=new SignUp(this.daoStudentImp);
		Student student=signUpForm.verifySignUp(request);
		
		if(!signUpForm.getErr().isEmpty()) {
			request.setAttribute("erreur", signUpForm.getErr());
			request.setAttribute("student", student);
			request.getServletContext().getRequestDispatcher("/SignUp.jsp").forward(request, response);
		}else request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
		//doGet(request, response);
	}

}
