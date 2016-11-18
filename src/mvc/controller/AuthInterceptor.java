package mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller) throws Exception {
		
		String uri = request.getRequestURI();
		
		if(uri.endsWith("login") || uri.endsWith("signup") || uri.endsWith("loginValidate") || uri.endsWith("signupValidate")) {
			return true;
		}
		
		if(request.getSession(false).getAttribute("LOGGED_USER_ID") != null) {
			return true;
		}
		
		response.sendRedirect("login");
		
		return false;
	}

}
