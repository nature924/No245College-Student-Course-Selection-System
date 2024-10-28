package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengpinglunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengpinglunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengpinglunView;


/**
 * 课程评论
 *
 * @author 
 * @email 
 * @date 2022-12-07 15:12:23
 */
public interface KechengpinglunService extends IService<KechengpinglunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengpinglunVO> selectListVO(Wrapper<KechengpinglunEntity> wrapper);
   	
   	KechengpinglunVO selectVO(@Param("ew") Wrapper<KechengpinglunEntity> wrapper);
   	
   	List<KechengpinglunView> selectListView(Wrapper<KechengpinglunEntity> wrapper);
   	
   	KechengpinglunView selectView(@Param("ew") Wrapper<KechengpinglunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengpinglunEntity> wrapper);
   	

}

