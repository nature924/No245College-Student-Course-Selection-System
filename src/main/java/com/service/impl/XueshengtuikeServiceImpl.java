package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XueshengtuikeDao;
import com.entity.XueshengtuikeEntity;
import com.service.XueshengtuikeService;
import com.entity.vo.XueshengtuikeVO;
import com.entity.view.XueshengtuikeView;

@Service("xueshengtuikeService")
public class XueshengtuikeServiceImpl extends ServiceImpl<XueshengtuikeDao, XueshengtuikeEntity> implements XueshengtuikeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengtuikeEntity> page = this.selectPage(
                new Query<XueshengtuikeEntity>(params).getPage(),
                new EntityWrapper<XueshengtuikeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengtuikeEntity> wrapper) {
		  Page<XueshengtuikeView> page =new Query<XueshengtuikeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengtuikeVO> selectListVO(Wrapper<XueshengtuikeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengtuikeVO selectVO(Wrapper<XueshengtuikeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengtuikeView> selectListView(Wrapper<XueshengtuikeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengtuikeView selectView(Wrapper<XueshengtuikeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
