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

@WebServlet("/update")
public class Update extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	int id = Integer.parseInt(req.getParameter("id"));
	String name = req.getParameter("name");
	int age = Integer.parseInt(req.getParameter("age"));
	String email = req.getParameter("email");
	
	EntityManagerFactory f=Persistence.createEntityManagerFactory("wed");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	t.begin();
	Employee e = m.find(Employee.class, id);
	e.setName(name);
	e.setEmail(email);
	e.setAge(age);
	m.merge(e);
	t.commit();
	resp.getWriter().print("Object updated Successfully");
}
}
