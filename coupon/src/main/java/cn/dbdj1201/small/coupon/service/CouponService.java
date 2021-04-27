package cn.dbdj1201.small.coupon.service;

import cn.dbdj1201.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.dbdj1201.small.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:45:21
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

