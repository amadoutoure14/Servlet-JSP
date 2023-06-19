import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

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
            addUser(nom, prenom, pseudo, email, password, request);

            request.getSession().setAttribute("username", pseudo);
            response.sendRedirect("Accueil.jsp");
        } else {
            response.sendRedirect("Inscrire.jsp?error=password");
        }
    }

    private void addUser(String nom, String prenom, String pseudo, String email, String password, HttpServletRequest request) {
        // Récupérer la liste des utilisateurs inscrits depuis le contexte de l'application
        ArrayList<String> registeredUsers = (ArrayList<String>) getServletContext().getAttribute("registeredUsers");

        // Vérifier si la liste existe, sinon la créer
        if (registeredUsers == null) {
            registeredUsers = new ArrayList<String>();
        }

        // Ajouter l'utilisateur à la liste
        String user = nom + " " + prenom + " (" + pseudo + ")";
        registeredUsers.add(user);

        // Mettre à jour la liste dans le contexte de l'application
        getServletContext().setAttribute("registeredUsers", registeredUsers);
    }
}
