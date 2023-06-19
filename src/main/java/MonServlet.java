import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

@WebServlet("/MonServlet")
public class MonServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Gérer la logique de connexion ici

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Vérifier les informations d'identification et effectuer les actions nécessaires

        response.sendRedirect("Accueil.jsp?fullName=" + username);
    }
}