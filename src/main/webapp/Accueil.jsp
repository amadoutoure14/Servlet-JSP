<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Accueil</title>
</head>
<body>
    <h1>Bienvenue</h1>
    <% UserServletJSP user = (UserServletJSP) session.getAttribute("user"); %>
    <p>Bienvenue, <%= user.getPrenom() %> <%= user.getNom() %> !</p>
    
    <h2>Utilisateurs inscrits :</h2>
    <ul>
       
        <% List<UserServletJSP> utilisateursInscrits = (List<UserServletJSP>) session.getAttribute("utilisateursInscrits"); %>
       
        <% for (UserServletJSP utilisateur : utilisateursInscrits) { %>
            <li><%= utilisateur.getPrenom() %> <%= utilisateur.getNom() %></li>
        <% } %>
    </ul>
    
    <form action="MonServlet2" method="post">
        <input type="submit" value="Déconnecter">
    </form>
</body>
</html>
