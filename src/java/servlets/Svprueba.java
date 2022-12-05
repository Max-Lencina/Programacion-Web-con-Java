
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Svprueba", urlPatterns = {"/Svprueba"})
public class Svprueba extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Cliente> listaClientes = new ArrayList<> ();
        listaClientes.add(new Cliente("1234585", "Luisina", "De Paula", "456987"));
        listaClientes.add(new Cliente("12345645", "Avril", "Gomez", "45698714"));
        listaClientes.add(new Cliente("12345612", "Pedro", "Lopez", "45697587"));
        
        HttpSession missesion = request.getSession();
        misession.setAttribute("listaClientes", listaClientes);
        
        response.sendRedirect("MostrarJSP.jsp");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        
        
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
