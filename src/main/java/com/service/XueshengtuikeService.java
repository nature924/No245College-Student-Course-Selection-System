package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengtuikeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengtuikeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengtuikeView;


/**
 * 学生退课
 *
 * @author 
 * @email 
 * @date 2022-12-07 15:12:22
 */
public interface XueshengtuikeService extends IService<XueshengtuikeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengtuikeVO> selectListVO(Wrapper<XueshengtuikeEntity> wrapper);
   	
   	XueshengtuikeVO selectVO(@Param("ew") Wrapper<XueshengtuikeEntity> wrapper);
   	
   	List<XueshengtuikeView> selectListView(Wrapper<XueshengtuikeEntity> wrapper);
   	
   	XueshengtuikeView selectView(@Param("ew") Wrapper<XueshengtuikeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengtuikeEntity> wrapper);
   	

}

