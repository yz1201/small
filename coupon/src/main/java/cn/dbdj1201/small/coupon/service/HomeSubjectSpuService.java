package cn.dbdj1201.small.coupon.service;

import cn.dbdj1201.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.dbdj1201.small.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:45:22
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

