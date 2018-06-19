package br.ufpe.cin.if992.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//"request" eh utilizado para ler os dados do formulario HTML dos cabecalhos 
		// HTTP (um exemplo sao os dados digitados e submetidos) 
		// e outros dados que podem ser obtidos a partir da requisicao do cliente.
		// "response" eh para especificar a linha e o cabecalho de resposta do HTTP 
		// (exemplo: especificar o tipo do conteudo, definir cookies). 
		// Tambem contem metodos que permitem ao Servlet gerar respostas para o cliente.
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html> <title>Hello Page</title> <body><br>");
        out.println("<h1>Viu que n‹o era mentira</h1>");
        out.println("</body> </html>");
        //"out" para enviar o conteudo para o browser.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
