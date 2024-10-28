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


import com.dao.KechengpinglunDao;
import com.entity.KechengpinglunEntity;
import com.service.KechengpinglunService;
import com.entity.vo.KechengpinglunVO;
import com.entity.view.KechengpinglunView;

@Service("kechengpinglunService")
public class KechengpinglunServiceImpl extends ServiceImpl<KechengpinglunDao, KechengpinglunEntity> implements KechengpinglunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengpinglunEntity> page = this.selectPage(
                new Query<KechengpinglunEntity>(params).getPage(),
                new EntityWrapper<KechengpinglunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengpinglunEntity> wrapper) {
		  Page<KechengpinglunView> page =new Query<KechengpinglunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengpinglunVO> selectListVO(Wrapper<KechengpinglunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengpinglunVO selectVO(Wrapper<KechengpinglunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengpinglunView> selectListView(Wrapper<KechengpinglunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengpinglunView selectView(Wrapper<KechengpinglunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
