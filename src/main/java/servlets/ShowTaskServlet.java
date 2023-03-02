
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.http.*;
import up3zad1.TaskList;
import up3zad1.Tasks;

public class ShowTaskServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int id = Integer.parseInt(req.getParameter("id"));
//		String title  = req.getParameter("title");
//		String desc = req.getParameter("desc");
//		String endDate = req.getParameter("end");
//		Tasks task = new Tasks();
//		task.setDescription(desc);
//		task.setEndDate(endDate);
//		task.setId(id);
//		ArrayList<Tasks> taskList = new ArrayList<Tasks>();
//		taskList.add(task);
//		TaskList.getInstance().setTaskList(taskList);
		PrintWriter out = res.getWriter();
		for (Tasks task : TaskList.getInstance().getTaskList()) {
			if(task.getId() == id) {
				
			}
		}
	}
}
