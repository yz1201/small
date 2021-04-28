package cn.dbdj1201.small.member.feign;

import cn.dbdj1201.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yz1201
 * @Date: 2021/4/28 23:03
 */
@FeignClient("small-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    R memberCall();
}
