package daw.pedroe.proyectoFinal.controller.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daw.pedroe.proyectoFinal.model.Patient;


/**
 * Servlet Filter implementation class PrivateAreaFilter
 */
@WebFilter(urlPatterns = { "/profile.jsp","/notifierarea.jsp"})
//@WebFilter("/profile.jsp")
public class PrivateAreaFilter implements Filter {

	private ServletContext context;

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		Patient patient = (Patient) session.getAttribute("login");

		if (session.getAttribute("login") != null) {
			if (patient.getJob().equalsIgnoreCase("doctor")) {
				chain.doFilter(request, response);
			} else {
				res.sendRedirect("index.jsp");
			}
		} else {
			res.sendRedirect("index.jsp");
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
