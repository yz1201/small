package cn.dbdj1201.small.coupon.dao;

import cn.dbdj1201.small.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:45:22
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
