<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h1>Connexion</h1>
    <%-- Afficher un message d'erreur en cas d'erreur d'authentification --%>
    <% String error = request.getParameter("error");
       if (error != null && error.equals("auth")) { %>
        <p style="color: red;">Identifiants invalides. Veuillez réessayer.</p>
    <% } else if (error != null && error.equals("password")) { %>
        <p style="color: red;">Les mots de passe ne correspondent pas. Veuillez réessayer.</p>
    <% } %>
    <form action="MonServlet" method="post">
        <label for="username">Pseudo:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="password">Mot de passe:</label>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Se connecter">
    </form>
</body>
</html>
