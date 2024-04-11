import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/question1")
public class question1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>GET Method</h1>");
        out.println("<p>Parameters from the URL:</p>");
        out.println("<ul>");
        // Retrieve and display parameters from the URL
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        out.println("<li>Name: " + name + "</li>");
        out.println("<li>Age: " + age + "</li>");
        out.println("</ul>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>POST Method</h1>");
        out.println("<p>Parameters from the form:</p>");
        out.println("<ul>");
        // Retrieve and display parameters from the form
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        out.println("<li>Name: " + name + "</li>");
        out.println("<li>Age: " + age + "</li>");
        out.println("</ul>");
    }
}

