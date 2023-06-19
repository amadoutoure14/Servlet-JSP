<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inscription</title>
</head>
<body>
    <h1>Inscription</h1>
    <form action="ServletJSP" method="post">
        <label for="firstName">Prénom:</label>
        <input type="text" id="firstName" name="firstName" required><br><br>
        <label for="lastName">Nom:</label>
        <input type="text" id="lastName" name="lastName" required><br><br>
        <label for="username">Pseudo:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        <label for="password">Mot de passe:</label>
        <input type="password" id="password" name="password" required><br><br>
        <label for="confirmPassword">Confirmer le mot de passe:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required><br><br>
        <input type="submit" value="S'inscrire">
    </form>
</body>
</html>
