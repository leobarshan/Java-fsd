import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/question3")
public class question3 extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Generic Servlet Demo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to Generic Servlet Demo</h1>");
        out.println("<p>This is a simple demonstration of Generic Servlet.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
