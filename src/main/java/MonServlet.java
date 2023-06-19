import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
@WebServlet("/UserServletJSP")
public class MonServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private List<User> registeredUsers = new ArrayList<>();

    @SuppressWarnings("unchecked")
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve user information from the request parameters
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String pseudo = request.getParameter("pseudo");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        // Validate password
        if (!password.equals(confirmPassword)) {
            response.sendRedirect("Inscrire.jsp");
            return;
        }

      
        UserServletJSP user = new UserServletJSP(nom, prenom, pseudo, email, password);


        HttpSession session = request.getSession();
        List<UserServletJSP> utilisateursInscrits = (List<UserServletJSP>) session.getAttribute("utilisateursInscrits");

  
        if (utilisateursInscrits == null) {
        
            utilisateursInscrits = new ArrayList<>();
        }

   
        utilisateursInscrits.add(user);

        
        session.setAttribute("utilisateursInscrits", utilisateursInscrits);

       
        response.sendRedirect("Accueil.jsp");
    	}
	}
