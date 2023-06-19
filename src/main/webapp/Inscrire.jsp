<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inscription</title>
</head>
<body>
    <h1>Inscription</h1>
    <form action="MonServlet" method="post">
        <label for="nom">Nom :</label>
        <input type="text" name="nom" required><br>
        
        <label for="prenom">Prénom :</label>
        <input type="text" name="prenom" required><br>
        
        <label for="pseudo">Pseudo :</label>
        <input type="text" name="pseudo" required><br>
        
        <label for="email">Email :</label>
        <input type="email" name="email" required><br>
        
        <label for="password">Mot de passe :</label>
        <input type="password" name="password" required><br>
        
        <label for="confirmPassword">Confirmer le mot de passe :</label>
        <input type="password" name="confirmPassword" required><br>
        
        <input type="submit" value="S'inscrire">
    </form>
</body>
</html>
