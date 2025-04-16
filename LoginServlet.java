
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get user credentials from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded credentials (For demonstration purposes)
        String correctUsername = "admin";
        String correctPassword = "password123";

        // Set the response content type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            out.println("<h2>Welcome, " + username + "!</h2>");
        } else {
            out.println("<h2>Login Failed! Incorrect username or password.</h2>");
        }
    }
}
