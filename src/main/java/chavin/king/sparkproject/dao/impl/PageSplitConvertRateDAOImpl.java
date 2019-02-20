package chavin.king.sparkproject.dao.impl;

import chavin.king.sparkproject.dao.IPageSplitConvertRateDAO;
import chavin.king.sparkproject.domain.PageSplitConvertRate;
import chavin.king.sparkproject.jdbc.JDBCHelper;

/**
 * 页面切片转化率DAO实现类
 * @author Administrator
 *
 */
public class PageSplitConvertRateDAOImpl implements IPageSplitConvertRateDAO {

	public void insert(PageSplitConvertRate pageSplitConvertRate) {
		String sql = "insert into page_split_convert_rate values(?,?)";  
		Object[] params = new Object[]{pageSplitConvertRate.getTaskid(), 
				pageSplitConvertRate.getConvertRate()};
		
		JDBCHelper jdbcHelper = JDBCHelper.getInstance();
		jdbcHelper.executeUpdate(sql, params);
	}

}
