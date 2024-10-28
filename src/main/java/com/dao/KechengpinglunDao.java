package com.dao;

import com.entity.KechengpinglunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengpinglunVO;
import com.entity.view.KechengpinglunView;


/**
 * 课程评论
 * 
 * @author 
 * @email 
 * @date 2022-12-07 15:12:23
 */
public interface KechengpinglunDao extends BaseMapper<KechengpinglunEntity> {
	
	List<KechengpinglunVO> selectListVO(@Param("ew") Wrapper<KechengpinglunEntity> wrapper);
	
	KechengpinglunVO selectVO(@Param("ew") Wrapper<KechengpinglunEntity> wrapper);
	
	List<KechengpinglunView> selectListView(@Param("ew") Wrapper<KechengpinglunEntity> wrapper);

	List<KechengpinglunView> selectListView(Pagination page,@Param("ew") Wrapper<KechengpinglunEntity> wrapper);
	
	KechengpinglunView selectView(@Param("ew") Wrapper<KechengpinglunEntity> wrapper);
	

}
