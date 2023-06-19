import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MonServlet")
public class MonServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String pseudo = request.getParameter("pseudo");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        if (password.equals(confirmPassword)) {
            // Ajouter l'utilisateur à la liste des utilisateurs déjà inscrits
            addUser(nom, prenom, pseudo, email, password);

            request.getSession().setAttribute("username", pseudo);
            response.sendRedirect("Accueil.jsp");
        } else {
            response.sendRedirect("Inscrire.jsp?error=password");
        }
    }

    private void addUser(String nom, String prenom, String pseudo, String email, String password) {
        // Ajouter l'utilisateur à la base de données ou à la liste des utilisateurs enregistrés
        // Vous pouvez utiliser une structure de données telle qu'une liste ou une base de données pour stocker les utilisateurs inscrits
    }
}
