package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class getCredentialsServlet extends HttpServlet{

public void service(HttpServletRequest req, HttpServletResponse res  ) throws IOException {
	String fname  = req.getParameter("fname");
	String name  = req.getParameter("login");
	PrintWriter out = res.getWriter();
	out.println(fname);
	out.println(name);
}
}
