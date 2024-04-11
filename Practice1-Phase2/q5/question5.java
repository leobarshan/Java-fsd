import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/question5")
public class question5 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Filter Demo</title></head><body>");
        out.println("<h1>Welcome to Filter Demo</h1>");
        out.println("<p>This is a servlet that demonstrates Servlet Filter.</p>");
        out.println("</body></html>");
    }
}
