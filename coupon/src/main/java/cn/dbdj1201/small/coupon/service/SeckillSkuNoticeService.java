package cn.dbdj1201.small.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.dbdj1201.common.utils.PageUtils;
import cn.dbdj1201.small.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:45:22
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

