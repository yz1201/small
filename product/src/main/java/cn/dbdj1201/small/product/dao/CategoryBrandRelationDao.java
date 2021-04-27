package cn.dbdj1201.small.product.dao;

import cn.dbdj1201.small.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 22:39:43
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
