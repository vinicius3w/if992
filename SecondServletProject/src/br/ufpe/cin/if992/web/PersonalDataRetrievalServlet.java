package br.ufpe.cin.if992.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PersonalDataRetrievalServlet
 */
@WebServlet("/PersonalDataRetrievalServlet")
public class PersonalDataRetrievalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalDataRetrievalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// recupera o parâmetro personalID informado pelo usuário
        String personalID = request.getParameter("personalID");
        // cria o objeto de negócios que manipula uma implementação para obtenção de
        // dados para um dado id.
        DataService service = new DataService();
        // recupera o objeto person que contém os detalhes necessários
        Person person = service.retrievePersonalDetails(personalID);
        // armazena os dados no escopo requisição utilizando uma chave
        request.setAttribute(ApplicationConstants.PERSON, person);
        // forward da requisição para o componente que exibirá os detalhes
        RequestDispatcher dispatcher =
          request.getRequestDispatcher("/DisplayServlet");
        dispatcher.forward(request, response);

        HttpSession session = request.getSession();
        //realizar aqui outras tarefas do logout
        //invalidar a sessao do usuario
        session.invalidate();
        //redirecionar o usuario para a pagina de login
        response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
