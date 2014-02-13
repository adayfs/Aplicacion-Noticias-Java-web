<%-- 
    Document   : login
    Created on : 12-feb-2014, 11:16:12
    Author     : adayfloridosantana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="../css/bootstrap.css" type="text/css"/>
         <link rel="stylesheet" href="../css/style.css" type="text/css"/>

        <title>Login - NoticiasDaw</title>
    </head>
    <body>
        
        <div>
            <section>
                <article><h1>Bienvenido</h1>
                <form name="loginForm" action="../ControllerServlet?action=login" method="POST">
                <input type="text" name="e-mail" value="yourmail@mail.com" />
                <input type="password" name="password" value="" />
                <input type="submit" value="Login" name="Login" class="btn btn-primary" />
                <input type="submit" value="Registrarse" name="Registrarse" class="btn btn-danger" />
                </form>
            </article>
            </section>
        </div>

    </body>
</html>
