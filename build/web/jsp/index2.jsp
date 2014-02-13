<%-- 
    Document   : ajax
    Created on : 06-feb-2014, 8:58:23
    Author     : adayfloridosantana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <script type="text/javascript" src="js/ajax.js"></script>
        <title>JSP Page</title>
    </head>
   <body onload="init()">
        <h1>Formulario Ajax!</h1>
        <form name="autofillform" action="autocomplete">
          <table border="0" cellpadding="5">
            <thead>
              <tr>
                <th></th>
                <th></th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>
                    <input type="text" size="40" id="complete-field" onkeyup="doCompletion();">
                </td>
                 <td id="auto-row" colspan="2">
                     <table id="complete-table" /></table>
                </td>
              </tr>
              <tr>
                <td></td>
                <td></td>
              </tr>
            </tbody>
          </table>
        </form>
    </body>
</html>
