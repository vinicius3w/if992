package br.ufpe.cin.if992.web;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JPEGOutputServlet
 */
@WebServlet("/JPEGOutputServlet")
public class JPEGOutputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JPEGOutputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// definir um array de byte para armazenamento dos dados
        byte bufferArray[] = new byte[1024];
        // retornar o ServletContext que ser‡ utilizado para o retorno
        ServletContext ctxt = getServletContext();

        // informar ao browser que est‡ enviando uma imagem
        response.setContentType("image/png");

        // criar o objeto de sa’da em stream que ser‡ produzida
        ServletOutputStream os = response.getOutputStream();

        // criar o objeto de recurso para o input stream
        InputStream is = ctxt.getResource("/WEB-INF/images/logo.png").openStream();

        // ler o conteœdo do recurso de escrita e gerar a sa’da
        int read = is.read(bufferArray);
        while (read != -1) {
            os.write(bufferArray);
            read = is.read(bufferArray);
        }
        // fechar os objetos utilizados
        is.close();
        os.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
