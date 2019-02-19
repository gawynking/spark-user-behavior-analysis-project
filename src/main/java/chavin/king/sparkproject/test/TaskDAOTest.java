package chavin.king.sparkproject.test;

import chavin.king.sparkproject.dao.ITaskDAO;
import chavin.king.sparkproject.dao.factory.DAOFactory;
import chavin.king.sparkproject.domain.Task;

/**
 * 任务管理DAO测试类
 * @author Administrator
 *
 */
public class TaskDAOTest {
	
	public static void main(String[] args) {
		ITaskDAO taskDAO = DAOFactory.getTaskDAO();
		Task task = taskDAO.findById(2);
		System.out.println(task.getTaskName());  
	}
	
}
