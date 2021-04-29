package cn.dbdj1201.small.order.dao;

import cn.dbdj1201.small.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:39:30
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {

}
