package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/home")
public class FoodServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        String food = request.getParameter("user_food");

        String info = name + " " + surname + " ordered " + food;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>" +info+"</h1>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
