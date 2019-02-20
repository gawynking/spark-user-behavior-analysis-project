package chavin.king.sparkproject.dao;

import java.util.List;

import chavin.king.sparkproject.domain.AreaTop3Product;

/**
 * 各区域top3热门商品DAO接口
 * @author Administrator
 *
 */
public interface IAreaTop3ProductDAO {

	void insertBatch(List<AreaTop3Product> areaTopsProducts);
	
}
