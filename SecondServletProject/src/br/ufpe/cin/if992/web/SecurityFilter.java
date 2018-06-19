package br.ufpe.cin.if992.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
*
* @author viniciusgarcia
*/
public class SecurityFilter implements Filter {
    private FilterConfig config;

    public void init(FilterConfig config) {
        this.config = config;
    }
    public void doFilter(ServletRequest request, ServletResponse response,
        FilterChain chain)
        throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        HttpServletResponse httpResponse = (HttpServletResponse)response;
        HttpSession session = httpRequest.getSession();
        User user = (User) session.getAttribute("userObject");
        if (user != null) {
            // se o usuario atender a certas condicoes, permitir o acesso aos recursos
            chain.doFilter(request, response);
        } else {
            PrintWriter out = response.getWriter();
            out.println("Bem-vindo, por favor, " +
            "faca o login antes de continuar utilizando a aplicacao.");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.include(request, response);
        }
  }
  public void destroy() {}
  public boolean isLoggable(LogRecord arg0) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
