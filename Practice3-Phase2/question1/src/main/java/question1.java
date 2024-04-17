// Import statements
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ecommerce.HibernateUtil;
// Servlet class
@WebServlet("/question1")
public class question1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // doGet method
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try {
            // Create Hibernate configuration
            Configuration config = new Configuration();
            config.configure(); // Load configuration from hibernate.cfg.xml
            
            // Build session factory
            SessionFactory factory = config.buildSessionFactory();
            
            // Open session
            Session session = factory.openSession();
            out.println("Hibernate Session opened.<br>");
            
            // Close session
            session.close();
            out.println("Hibernate Session closed.<br>");
            
            factory.close(); // Close session factory
            
        } catch (Exception ex) {
            out.println("Error: " + ex.getMessage());
            ex.printStackTrace(out);
        }
    }

    // doPost method
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
