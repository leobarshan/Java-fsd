import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/question8")
public class question8 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve or create session object
        HttpSession session = request.getSession();

        // Retrieve session attribute
        String username = (String) session.getAttribute("username");
        if (username == null) {
            // If username is not set, set it as "Guest"
            username = "Guest";
            session.setAttribute("username", username);
        }

        // Retrieve visit count attribute and increment it
        Integer visitCount = (Integer) session.getAttribute("visitCount");
        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }
        session.setAttribute("visitCount", visitCount);

        // Set response content type
        response.setContentType("text/html");

        // Create response writer
        PrintWriter out = response.getWriter();

        // Write HTML content with hidden form field
        out.println("<html><head><title>Session Tracking with Hidden Form Field</title></head><body>");
        out.println("<h1>Session Tracking with Hidden Form Field</h1>");
        out.println("<form action=\"question8\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"sessionId\" value=\"" + session.getId() + "\">");
        out.println("<p>Welcome, " + username + "!</p>");
        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Number of visits: " + visitCount + "</p>");
        out.println("<input type=\"submit\" value=\"Reload Page\">");
        out.println("</form>");
        out.println("</body></html>");
    }
}
