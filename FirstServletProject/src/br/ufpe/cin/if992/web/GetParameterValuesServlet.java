package br.ufpe.cin.if992.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetParameterValuesServlet
 */
@WebServlet("/GetParameterValuesServlet")
public class GetParameterValuesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetParameterValuesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		//String paramValues[] = request.getParameterValues("sports");
		//StringBuffer myResponse = new StringBuffer();
		Enumeration params = request.getParameterNames();

		PrintWriter out = response.getWriter();
        out.println("<HTML><TITLE>Suas escolhas</TITLE>");
        out.println("<BODY><H1>Suas escolhas foram : </H1>");
        
        //for (int i = 0; i < paramValues.length; i++) {
        //  out.println("<br/><li>");
        //  out.println(paramValues[i]);
        //}
        
        String param;
        while (params.hasMoreElements()){
            out.println("<br/><li>");
            param = (String)params.nextElement();
            out.println(param + " - " + request.getParameter(param));
        }
        
        out.println("</BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
