package echo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EchoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {
			out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("<meta content='text/html; charset=UTF-8'>");
			out.println("<title>Echo</title></head>");
			out.println("<body>");
			out.println("<h2>Text echo:</h2>");

			String textInput = request.getParameter("text");
			if (textInput.isEmpty()) {
				out.println("<p>Input field was empty!</p>");
			}
			else {
				out.println("<p>" + textInput + "</p>");
			}

			out.println("</body>");
			out.println("</html>");
		}
		finally {
			out.close();
		}
	}
}
