package br.ufpe.cin.if992.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetParameterServlet
 */
@WebServlet("/GetParameterServlet")
public class GetParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetParameterServlet() {
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
		// retorna o valor solicitado pelo usu‡rio
        String userName = request.getParameter("userName");
        System.out.println(userName);
        // retorna um objeto PrintWriter e utiliza-o para a mensagem de sa’da
        PrintWriter out = response.getWriter();
        out.println("<HTML><BODY><H1>");
        out.println("AJAIï! AJAIï para os que chegam! AJAIï " + userName + "!");
        out.println("</H1></BODY></HTML>");
        out.close();
	}

}
