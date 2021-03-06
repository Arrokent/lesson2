package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a = req.getParameter("a");
        String b = req.getParameter("b");

        Integer intA = 0;
        Integer intB = 0;

        if (a != null)
            intA = Integer.parseInt(a);

        if (b != null)
            intA = Integer.parseInt(b);

        Integer c = intA + intB;
        String result = "{\"result\":" + c + "}";
        resp.getWriter().println(result);
    }
}
