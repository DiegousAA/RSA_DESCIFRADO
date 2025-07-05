<html>
  <head>
    <meta charset="UTF-8">
    <title>RSA Descifrado</title>
  </head>
  <body>
    <h2>RSA Descifrado</h2>
    <form action="decrypt" method="post">
      <label>Mensaje cifrado:</label><br/>
      <input type="text" name="cifrado" required /><br/><br/>

      <label>d:</label><br/>
      <input type="text" name="d" required /><br/><br/>

      <label>n:</label><br/>
      <input type="text" name="n" required /><br/><br/>

      <input type="submit" value="Descifrar"/>
    </form>
  </body>
</html>
