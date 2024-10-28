package com.dao;

import com.entity.XueshengtuikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengtuikeVO;
import com.entity.view.XueshengtuikeView;


/**
 * 学生退课
 * 
 * @author 
 * @email 
 * @date 2022-12-07 15:12:22
 */
public interface XueshengtuikeDao extends BaseMapper<XueshengtuikeEntity> {
	
	List<XueshengtuikeVO> selectListVO(@Param("ew") Wrapper<XueshengtuikeEntity> wrapper);
	
	XueshengtuikeVO selectVO(@Param("ew") Wrapper<XueshengtuikeEntity> wrapper);
	
	List<XueshengtuikeView> selectListView(@Param("ew") Wrapper<XueshengtuikeEntity> wrapper);

	List<XueshengtuikeView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengtuikeEntity> wrapper);
	
	XueshengtuikeView selectView(@Param("ew") Wrapper<XueshengtuikeEntity> wrapper);
	

}
