import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/question10a")
public class question10a extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve username and password from request parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Dummy authentication check (replace with actual authentication logic)
        boolean isAuthenticated = authenticate(username, password);

        if (isAuthenticated) {
            // If authentication succeeds, create a session and set username attribute
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Redirect to welcome page
            response.sendRedirect("welcome.jsp");
        } else {
            // If authentication fails, display error message
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>Login Failed</title></head><body>");
            out.println("<h1>Login Failed</h1>");
            out.println("<p>Invalid username or password. Please try again.</p>");
            out.println("</body></html>");
        }
    }

    // Dummy authentication method (replace with actual authentication logic)
    private boolean authenticate(String username, String password) {
        // Check if username and password match some predefined values
        // In real application, this should be replaced with database lookup or other authentication mechanism
        return username.equals("gowtham") && password.equals("g@123");
    }
}
