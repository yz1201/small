package cn.dbdj1201.small.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.dbdj1201.common.utils.PageUtils;
import cn.dbdj1201.small.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 22:39:44
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

