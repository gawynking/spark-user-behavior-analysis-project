package chavin.king.sparkproject.dao.factory;

import chavin.king.sparkproject.dao.ISessionRandomExtractDAO;
import chavin.king.sparkproject.dao.impl.SessionRandomExtractDAOImpl;

import chavin.king.sparkproject.dao.ISessionDetailDAO;
import chavin.king.sparkproject.dao.impl.SessionDetailDAOImpl;

import chavin.king.sparkproject.dao.ITop10CategoryDAO;
import chavin.king.sparkproject.dao.impl.Top10CategoryDAOImpl;

import chavin.king.sparkproject.dao.ITop10SessionDAO;
import chavin.king.sparkproject.dao.impl.Top10SessionDAOImpl;

import chavin.king.sparkproject.dao.IAreaTop3ProductDAO;
import chavin.king.sparkproject.dao.impl.AreaTop3ProductDAOImpl;

import chavin.king.sparkproject.dao.IPageSplitConvertRateDAO;
import chavin.king.sparkproject.dao.impl.PageSplitConvertRateDAOImpl;

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
	
	public static IPageSplitConvertRateDAO getPageSplitConvertRateDAO() {
		return new PageSplitConvertRateDAOImpl();
	}
	
	public static IAreaTop3ProductDAO getAreaTop3ProductDAO() {
		return new AreaTop3ProductDAOImpl();
	}
}
