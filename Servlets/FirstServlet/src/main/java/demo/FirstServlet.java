package demo;

import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 2376899699873237398L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		final Enumeration<String> names = request.getParameterNames();
		
		while (names.hasMoreElements()) {
			final String name = names.nextElement();
			final String value = request.getParameter(name);
			
			System.out.println(name + " = " + value);
		}
		
	}

}
