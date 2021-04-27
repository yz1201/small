package cn.dbdj1201.small.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.dbdj1201.common.utils.PageUtils;
import cn.dbdj1201.small.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:48:43
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

