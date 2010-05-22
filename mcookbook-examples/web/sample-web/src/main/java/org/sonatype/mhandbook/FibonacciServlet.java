package org.sonatype.mcookbook;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FibonacciServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int index = Integer.parseInt(req.getParameter("index"));
		resp.getWriter().write( fib(index) + "" );
		resp.getWriter().flush();
		resp.getWriter().close();
	}

    public long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }
}
