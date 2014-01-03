package com.appmantras.micromonkey;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MicroMonkeyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Pong");
	}
}
