<%-- 
    Document   : index
    Created on : 27-ene-2014, 9:10:34
    Author     : adayfloridosantana
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="css/bootstrap.css" type="text/css"/>
         <link rel="stylesheet" href="css/style.css" type="text/css"/>



        <title>Noticias JSP</title>
    </head>
    <body>
        <div id="main">
        <section >
            <article>
                <br>
                <h1>Bienvenido a Noticias-DAW</h1>
                <p><a href="jsp/login.jsp" class="btn btn-primary btn-block letra" >Login</a></p>
                <ul>
                  <li><a href="#" id="1" onclick="muestraNoticias(this)">Flash</a></li>
                  <li><a href="#" id="2" onclick="muestraNoticias(this)">ActionScript</a></li>
                  <li><a href="#" id="3" onclick="muestraNoticias(this)">Multimedia</a></li>
                </ul>
                <select id="selectNoticias" name="selectNoticias" onchange="publicaNoticia(this)">
                    <option>Selecciona una noticia...</option>
                    <c:forEach items="${noticias}" var="news">
                        <option value="${news.id}">${news.cabecera}</option>
                    </c:forEach>
                </select>
              </article>
            <article id="noticiaAjax" class="ajax">
            </article>
            
        </section>
        </div> 
    </body>
     <script type="text/javascript" src="js/ajax.js"></script>
         <script type="text/javascript" src="js/jquery.js"></script>
   </html>
  