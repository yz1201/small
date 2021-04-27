package cn.dbdj1201.small.member.dao;

import cn.dbdj1201.small.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author dbdj1201
 * @email 15957121194@163.com
 * @date 2021-04-27 21:48:42
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
