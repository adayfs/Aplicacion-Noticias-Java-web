//---------------------------------
//--------------------------------->Variables Globales

var url;
//------------------------------------------------------------------------------

function crearAJAX(){
  var xmlhttp;

  if (window.XMLHttpRequest){
    //IE7+, Firefox, Chrome, Opera, Safari
    xmlhttp=new XMLHttpRequest();
    }else{
    //IE6, IE5
    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
  if(!xmlhttp && XMLHttpRequest!=='undefined'){
    xmlhttp=new XMLHttpRequest();
  }
  return xmlhttp;
}

function consultaAJAX(url,destino){
    objAjax=crearAJAX();
    objAjax.open("post",url,true);
    objAjax.onreadystatechange=function(){
    if(objAjax.readyState===4){
      document.getElementById(destino).innerHTML=objAjax.responseText;
    }};
    objAjax.send();
}

function setURLNoticia(noticia){
    var noticiaId=noticia.value;
    url= "\ControllerServlet?action=publica&idNoticia="+noticiaId;
}

function setURLSeccion(seccion){
    url = "\ControllerServlet?action=muestra&idSeccion=" + seccion.id;
}

function muestraNoticias(seccion){
    setURLSeccion(seccion);
    var destino="selectNoticias";
    consultaAJAX(url,destino);
}

function publicaNoticia(noticia){
    setURLNoticia(noticia);
    var destino="noticiaAjax";
    consultaAJAX(url,destino);
}

