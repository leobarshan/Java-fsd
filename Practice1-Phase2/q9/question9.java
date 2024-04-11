import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/question9")
public class question9 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
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

        // Write HTML content
        out.println("<html><head><title>Session Tracking with HttpSession</title></head><body>");
        out.println("<h1>Session Tracking with HttpSession</h1>");
        out.println("<p>Welcome, " + username + "!</p>");
        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Number of visits: " + visitCount + "</p>");
        out.println("</body></html>");
    }
}
