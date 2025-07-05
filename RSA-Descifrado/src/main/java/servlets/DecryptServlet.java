package servlets;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DecryptServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            // Recuperar datos del formulario
            String cifradoTexto = request.getParameter("cifrado");
            BigInteger d = new BigInteger(request.getParameter("d"));
            BigInteger n = new BigInteger(request.getParameter("n"));

            // Separar bloques por coma
            String[] bloques = cifradoTexto.split(",");

            // Lista para almacenar los bytes descifrados
            ArrayList<Byte> byteList = new ArrayList<>();

            for (String bloque : bloques) {
                BigInteger C = new BigInteger(bloque);
                BigInteger M = C.modPow(d, n); // Descifrar bloque
                byteList.add(M.byteValue());
            }

            // Convertir lista de bytes a arreglo
            byte[] byteArray = new byte[byteList.size()];
            for (int i = 0; i < byteList.size(); i++) {
                byteArray[i] = byteList.get(i);
            }

            // Reconstruir el mensaje original
            String mensajeFinal = new String(byteArray, "UTF-8");

            request.setAttribute("mensaje", mensajeFinal);
        } catch (Exception e) {
            request.setAttribute("mensaje", "Error al descifrar: " + e.getMessage());
        }

        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
