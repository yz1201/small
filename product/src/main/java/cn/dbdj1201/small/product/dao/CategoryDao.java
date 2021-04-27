package cn.dbdj1201.small.product.dao;

import cn.dbdj1201.small.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 22:39:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
