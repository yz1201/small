package cn.dbdj1201.small.coupon.dao;

import cn.dbdj1201.small.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:45:21
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {

}
