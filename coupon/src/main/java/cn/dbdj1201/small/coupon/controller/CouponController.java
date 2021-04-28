package cn.dbdj1201.small.coupon.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import cn.dbdj1201.common.utils.PageUtils;
import cn.dbdj1201.common.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.dbdj1201.small.coupon.entity.CouponEntity;
import cn.dbdj1201.small.coupon.service.CouponService;



/**
 * 优惠券信息
 *
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:45:21
 */
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    /**
    test open feign
     */
    @RequestMapping("/member/list")
    public R memberCall(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("test");
        couponEntity.setCouponImg("asdasdasd");
        couponEntity.setCouponType(2);
        couponEntity.setCode("543125");
        couponEntity.setMemberLevel(3);
        return R.ok().put("coupons", couponEntity);
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
