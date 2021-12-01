package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/gender")
public class GenderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullname = request.getParameter("user_fullname");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");

        String result = "Hello, ";
        if (age <= 18) {
            result += "Dude ";
        } else {
            result += "Dear ";
        }

        if (gender.equals("male")) {
             result += "Mister ";
        } else {
            result += "Miss ";
        }

        result += fullname + " !";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h2>" + result + "</h2>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
