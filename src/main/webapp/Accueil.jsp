<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Accueil</title>
</head>
<body>
    <h1>Bienvenue <%= request.getParameter("fullName") %>!</h1>
    <p>Liste des utilisateurs inscrits:</p>
    <ul>
        <%
        ArrayList<String> registeredUsers = (ArrayList<String>) request.getServletContext().getAttribute("registeredUsers");
        if (registeredUsers != null) {
            for (String user : registeredUsers) {
                out.println("<li>" + user + "</li>");
            }
        }
        %>
    </ul>
    <form action="MonServlet2" method="post">
        <input type="submit" value="Déconnecter">
    </form>
</body>
</html>
