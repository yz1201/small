package cn.dbdj1201.small.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.dbdj1201.common.utils.PageUtils;
import cn.dbdj1201.small.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:39:30
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

