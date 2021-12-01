package servlets;

import db.DBManager;
import db.Footballer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/add")
public class AddFootballerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("f_name");
        String surname = request.getParameter("f_surname");
        String club = request.getParameter("club");
        int salary = Integer.parseInt(request.getParameter("salary"));
        int price = Integer.parseInt(request.getParameter("price"));

        Footballer footballer = new Footballer();
        footballer.setName(name);
        footballer.setSurname(surname);
        footballer.setClub(club);
        footballer.setSalary(salary);
        footballer.setTransferPrice(price);

        DBManager.addFootballer(footballer);

        response.sendRedirect("/index");

    }
}
