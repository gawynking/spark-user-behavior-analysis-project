package chavin.king.sparkproject.dao.factory;

import chavin.king.sparkproject.dao.IAdBlacklistDAO;
import chavin.king.sparkproject.dao.IAdClickTrendDAO;
import chavin.king.sparkproject.dao.IAdProvinceTop3DAO;
import chavin.king.sparkproject.dao.IAdStatDAO;
import chavin.king.sparkproject.dao.IAdUserClickCountDAO;
import chavin.king.sparkproject.dao.IAreaTop3ProductDAO;
import chavin.king.sparkproject.dao.IPageSplitConvertRateDAO;
import chavin.king.sparkproject.dao.ISessionAggrStatDAO;
import chavin.king.sparkproject.dao.ISessionDetailDAO;
import chavin.king.sparkproject.dao.ISessionRandomExtractDAO;
import chavin.king.sparkproject.dao.ITaskDAO;
import chavin.king.sparkproject.dao.ITop10CategoryDAO;
import chavin.king.sparkproject.dao.ITop10SessionDAO;
import chavin.king.sparkproject.dao.impl.AdBlacklistDAOImpl;
import chavin.king.sparkproject.dao.impl.AdClickTrendDAOImpl;
import chavin.king.sparkproject.dao.impl.AdProvinceTop3DAOImpl;
import chavin.king.sparkproject.dao.impl.AdStatDAOImpl;
import chavin.king.sparkproject.dao.impl.AdUserClickCountDAOImpl;
import chavin.king.sparkproject.dao.impl.AreaTop3ProductDAOImpl;
import chavin.king.sparkproject.dao.impl.PageSplitConvertRateDAOImpl;
import chavin.king.sparkproject.dao.impl.SessionAggrStatDAOImpl;
import chavin.king.sparkproject.dao.impl.SessionDetailDAOImpl;
import chavin.king.sparkproject.dao.impl.SessionRandomExtractDAOImpl;
import chavin.king.sparkproject.dao.impl.TaskDAOImpl;
import chavin.king.sparkproject.dao.impl.Top10CategoryDAOImpl;
import chavin.king.sparkproject.dao.impl.Top10SessionDAOImpl;

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
	
	public static IAdUserClickCountDAO getAdUserClickCountDAO() {
		return new AdUserClickCountDAOImpl();
	}
	
	public static IAdBlacklistDAO getAdBlacklistDAO() {
		return new AdBlacklistDAOImpl();
	}
	
	public static IAdStatDAO getAdStatDAO() {
		return new AdStatDAOImpl();
	}
	
	public static IAdProvinceTop3DAO getAdProvinceTop3DAO() {
		return new AdProvinceTop3DAOImpl();
	}
	
	public static IAdClickTrendDAO getAdClickTrendDAO() {
		return new AdClickTrendDAOImpl();
	}
	
}
