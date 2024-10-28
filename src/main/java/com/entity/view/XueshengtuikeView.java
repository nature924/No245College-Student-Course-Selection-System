package com.entity.view;

import com.entity.XueshengtuikeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生退课
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-07 15:12:22
 */
@TableName("xueshengtuike")
public class XueshengtuikeView  extends XueshengtuikeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengtuikeView(){
	}
 
 	public XueshengtuikeView(XueshengtuikeEntity xueshengtuikeEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengtuikeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
