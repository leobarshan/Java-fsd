import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/question4")
public class question4 implements Servlet {

    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Complex Servlet Demo</h1>");
        response.getWriter().println("<p>This servlet implements the Servlet interface.</p>");
    }

    @Override
    public String getServletInfo() {
        return "ServletDemo4";
    }

    @Override
    public void destroy() {
        // Cleanup code, if any
    }
}

