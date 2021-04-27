package cn.dbdj1201.small.coupon.service;

import cn.dbdj1201.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.dbdj1201.small.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:45:22
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

