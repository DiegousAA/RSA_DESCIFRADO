<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Resultado del Descifrado</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
  <h2>Resultado del Descifrado</h2>

  <% 
      String mensaje = (String) request.getAttribute("mensaje");
      if (mensaje != null) {
  %>
      <p><strong>Mensaje Descifrado:</strong> <%= mensaje %></p>
  <%
      } else {
  %>
      <p style="color:red;">No se pudo descifrar el mensaje. Verifica los valores.</p>
  <%
      }
  %>

  <br/>
  <a href="index.jsp">Volver</a>
</body>
</html>
