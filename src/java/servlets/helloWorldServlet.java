package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import person.Person;

/**
 *
 * @author TyHalvorsen
 */
@WebServlet(name = "helloWorldServlet", urlPatterns = {"/helloWorldServlet"})
public class helloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorld.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        if (firstName == null || firstName.equals("") || lastName == null || lastName.equals("")) {
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
            request.setAttribute("invalid", true);
            getServletContext().getRequestDispatcher("/WEB-INF/helloWorld.jsp")
                    .forward(request, response);
            return;
        }

        Person person = new Person(firstName, lastName);

        request.setAttribute("person", person);

        getServletContext().getRequestDispatcher("/WEB-INF/hello.jsp")
                .forward(request, response);
    }
}
