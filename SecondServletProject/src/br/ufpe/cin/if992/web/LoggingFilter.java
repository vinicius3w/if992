package br.ufpe.cin.if992.web;

import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
*
* @author viniciusgarcia
*/
public class LoggingFilter implements Filter {
    private FilterConfig config;
    public void init(FilterConfig config) {
        this.config = config;
    }
    public void doFilter(
        ServletRequest request, ServletResponse response, FilterChain chain)
        throws ServletException, IOException {
        // recupera o objeto ServletContext que sera usado para realizar o logging
        ServletContext context = config.getServletContext();

        // cria um registro da URL acessada pelo usuário
        String logEntry = request.getServerName() + ":" + request.getServerPort();
        logEntry += "/" + request.getLocalAddr() + "/" + request.getLocalName();
        logEntry += "--> acessado pelo usuário em " + new java.util.Date();

        // utilizando o recurso de logging disponível na classe ServletContext
        context.log(logEntry);
        // chama o próximo filtro na cadeia de filtros
        chain.doFilter(request, response);
    }
    public void destroy() {}
    public boolean isLoggable(LogRecord arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
