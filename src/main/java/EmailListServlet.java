package murach.email;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import murach.business.User;
import murach.data.UserDB;

public class EmailListServlet extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL
        if (action.equals("join")) {
            url = "/index.html";    
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirth = request.getParameter("dateOfBirth");
            String heardFrom = request.getParameter("heardFrom");
            String contactVia = request.getParameter("contactVia");
            boolean wantsUpdates = (request.getParameter("wantsUpdates") != null);
            boolean emailOK = (request.getParameter("emailOK") != null);

            // store data in User object
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setDateOfBirth(dateOfBirth);
            user.setHeardFrom(heardFrom);
            user.setContactVia(contactVia);
            user.setWantsUpdates(wantsUpdates);
            user.setEmailOK(emailOK);

            // save user
            UserDB.insert(user);

            // set User object in request
            request.setAttribute("user", user);
            url = "/thanks.jsp";   // the "thanks" page
        }
        
        // forward request
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    

    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
}