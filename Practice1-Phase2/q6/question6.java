import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/question6")
public class question6 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create or retrieve the session object
        HttpSession session = request.getSession();

        // Set session attribute
        String username = (String) session.getAttribute("username");
        if (username == null) {
            // If username is not set, set it as "Guest"
            username = "Guest";
            session.setAttribute("username", username);
        }

        // Get the value of the visited count attribute and increment it
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
        out.println("<html><head><title>Session Tracking with Cookies</title></head><body>");
        out.println("<h1>Session Tracking with Cookies</h1>");
        out.println("<p>Welcome, " + username + "!</p>");
        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Number of visits: " + visitCount + "</p>");
        out.println("<form action=\"question6\" method=\"post\">");
        out.println("<input type=\"submit\" value=\"Logout\">");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Invalidate the session on logout
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("question6");
    }
}

