package com.entity.view;

import com.entity.KechengpinglunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程评论
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-07 15:12:23
 */
@TableName("kechengpinglun")
public class KechengpinglunView  extends KechengpinglunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengpinglunView(){
	}
 
 	public KechengpinglunView(KechengpinglunEntity kechengpinglunEntity){
 	try {
			BeanUtils.copyProperties(this, kechengpinglunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
