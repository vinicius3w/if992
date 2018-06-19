package br.ufpe.cin.if992.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// recupera o objeto Person que contém os detalhes
        Person person = (Person) request.getAttribute(ApplicationConstants.PERSON);
        // constrói a resposta baseado nas informações
        StringBuffer buffer = new StringBuffer();
        buffer.append("<HTML><TITLE>Personal Info</TITLE>");
        buffer.append("<BODY><H1>Details : </H1><br/>");
        buffer.append("Name : ");
        buffer.append(person.getName());
        buffer.append("<br> Address : ");
        buffer.append(person.getAddress());
        buffer.append("</BODY>");
        // gerar um novo session ID para o usuário
        String sessionID = generateSessionID();
        // criar novo mapa que será utilizado para armazenar os dados a serem mantidos na sessão
        HashMap map = new HashMap();
        // recuperar um mapa utilizado como contêiner para as informações do usuário
        HashMap containerMap = retrieveSessionMaps();
        // adicionar o novo mapa criado no mapa contendo todas as informações de sessão
        containerMap.put(sessionID, map);
        // criar o cookie que será armazenado no browser
        Cookie sessionCookie = new Cookie("JSESSIONID", sessionID);
        // adicionar o cookie à resposta e pedir ao browser para armazená-lo
        response.addCookie(sessionCookie);
        // exibe a resposta
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(buffer.toString());
        out.close();
	}
	
	private String generateSessionID() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private HashMap retrieveSessionMaps() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
