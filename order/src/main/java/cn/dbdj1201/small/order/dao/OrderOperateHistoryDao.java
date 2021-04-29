package cn.dbdj1201.small.order.dao;

import cn.dbdj1201.small.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:39:30
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {

}
