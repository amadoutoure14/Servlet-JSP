<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Accueil</title>
</head>
<body>
    <%-- Récupérer le nom d'utilisateur à partir de la session --%>
    <% String username = (String) request.getSession().getAttribute("username"); %>
    <h1>Bienvenue <%= username %>!</h1>
    <p>Liste des utilisateurs inscrits:</p>
    <ul>
        <%-- Afficher les utilisateurs inscrits --%>
        <% ArrayList<String> registeredUsers = (ArrayList<String>) getServletContext().getAttribute("registeredUsers");
           if (registeredUsers != null) {
               for (String user : registeredUsers) { %>
                   <li><%= user %></li>
        <%     }
           } %>
    </ul>
    <form action="MonServlet2" method="post">
        <input type="submit" value="Déconnecter">
    </form>
</body>
</html>
