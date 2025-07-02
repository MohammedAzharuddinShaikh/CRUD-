package details;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class Fetch extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	int id = Integer.parseInt(req.getParameter("id"));
	
	EntityManagerFactory f=Persistence.createEntityManagerFactory("wed");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	t.begin();
	Employee e = m.find(Employee.class, id);
	t.commit();
	resp.getWriter().print(e);
}
}
