package chavin.king.sparkproject.dao.factory;

import chavin.king.sparkproject.dao.ISessionRandomExtractDAO;
import chavin.king.sparkproject.dao.impl.SessionRandomExtractDAOImpl;

import chavin.king.sparkproject.dao.ISessionDetailDAO;
import chavin.king.sparkproject.dao.impl.SessionDetailDAOImpl;

import chavin.king.sparkproject.dao.ITop10CategoryDAO;
import chavin.king.sparkproject.dao.impl.Top10CategoryDAOImpl;

import chavin.king.sparkproject.dao.ITop10SessionDAO;
import chavin.king.sparkproject.dao.impl.Top10SessionDAOImpl;

import chavin.king.sparkproject.dao.ISessionAggrStatDAO;
import chavin.king.sparkproject.dao.impl.SessionAggrStatDAOImpl;
import chavin.king.sparkproject.dao.impl.TaskDAOImpl;
import chavin.king.sparkproject.dao.ITaskDAO;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {


	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}
	
	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
		return new SessionAggrStatDAOImpl();
	}
	
	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
		return new SessionRandomExtractDAOImpl();
	}
	
	public static ISessionDetailDAO getSessionDetailDAO() {
		return new SessionDetailDAOImpl();
	}
	
	public static ITop10CategoryDAO getTop10CategoryDAO() {
		return new Top10CategoryDAOImpl();
	}
	
	public static ITop10SessionDAO getTop10SessionDAO() {
		return new Top10SessionDAOImpl();
	}
}
