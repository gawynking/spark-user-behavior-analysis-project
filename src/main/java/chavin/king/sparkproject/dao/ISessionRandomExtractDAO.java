package chavin.king.sparkproject.dao;

import chavin.king.sparkproject.domain.SessionRandomExtract;

/**
 * session随机抽取模块DAO接口
 * @author Administrator
 *
 */
public interface ISessionRandomExtractDAO {

	/**
	 * 插入session随机抽取
	 * @param sessionAggrStat 
	 */
	void insert(SessionRandomExtract sessionRandomExtract);
	
}
