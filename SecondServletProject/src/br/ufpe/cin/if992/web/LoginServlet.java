package br.ufpe.cin.if992.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
        // recupera os parâmetros do formulário do usuário
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");
        User user = null;
        // cria o JavaBean implementando a funcionalidade de autenticação
        UserService service = new UserService();
        user = service.authenticateUser(loginName, password);
        if (user == null) {
            // gera a mensagem de erro
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("User does not exist with given login and/or password");
            // retorna para a página de login do usuário
            rd = request.getRequestDispatcher("/login.html");
            rd.include(request, response);
            out.close();
        } else {
            // armazena o objeto User na sessão
            HttpSession session = request.getSession();
            session.setAttribute(ApplicationConstants.USER_OBJECT, user);
            // constrói a resposta a partir de múltiplos componentes HTML
            rd = request.getRequestDispatcher("/header.html");
            rd.include(request, response);
            rd = request.getRequestDispatcher("/mainContent.html");
            rd.include(request, response);
            rd = request.getRequestDispatcher("/footer.html");
            rd.include(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
