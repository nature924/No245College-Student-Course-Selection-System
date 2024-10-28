package com.entity.vo;

import com.entity.KechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课程信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-07 15:12:22
 */
public class KechengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 课程类型
	 */
	
	private String kechengleixing;
		
	/**
	 * 课时
	 */
	
	private String keshi;
		
	/**
	 * 学分
	 */
	
	private String xuefen;
		
	/**
	 * 上课时间
	 */
	
	private String shangkeshijian;
		
	/**
	 * 上课地点
	 */
	
	private String shangkedidian;
		
	/**
	 * 学期
	 */
	
	private String xueqi;
		
	/**
	 * 年限
	 */
	
	private String nianxian;
		
	/**
	 * 课程详情
	 */
	
	private String kechengxiangqing;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：课程类型
	 */
	 
	public void setKechengleixing(String kechengleixing) {
		this.kechengleixing = kechengleixing;
	}
	
	/**
	 * 获取：课程类型
	 */
	public String getKechengleixing() {
		return kechengleixing;
	}
				
	
	/**
	 * 设置：课时
	 */
	 
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	
	/**
	 * 获取：课时
	 */
	public String getKeshi() {
		return keshi;
	}
				
	
	/**
	 * 设置：学分
	 */
	 
	public void setXuefen(String xuefen) {
		this.xuefen = xuefen;
	}
	
	/**
	 * 获取：学分
	 */
	public String getXuefen() {
		return xuefen;
	}
				
	
	/**
	 * 设置：上课时间
	 */
	 
	public void setShangkeshijian(String shangkeshijian) {
		this.shangkeshijian = shangkeshijian;
	}
	
	/**
	 * 获取：上课时间
	 */
	public String getShangkeshijian() {
		return shangkeshijian;
	}
				
	
	/**
	 * 设置：上课地点
	 */
	 
	public void setShangkedidian(String shangkedidian) {
		this.shangkedidian = shangkedidian;
	}
	
	/**
	 * 获取：上课地点
	 */
	public String getShangkedidian() {
		return shangkedidian;
	}
				
	
	/**
	 * 设置：学期
	 */
	 
	public void setXueqi(String xueqi) {
		this.xueqi = xueqi;
	}
	
	/**
	 * 获取：学期
	 */
	public String getXueqi() {
		return xueqi;
	}
				
	
	/**
	 * 设置：年限
	 */
	 
	public void setNianxian(String nianxian) {
		this.nianxian = nianxian;
	}
	
	/**
	 * 获取：年限
	 */
	public String getNianxian() {
		return nianxian;
	}
				
	
	/**
	 * 设置：课程详情
	 */
	 
	public void setKechengxiangqing(String kechengxiangqing) {
		this.kechengxiangqing = kechengxiangqing;
	}
	
	/**
	 * 获取：课程详情
	 */
	public String getKechengxiangqing() {
		return kechengxiangqing;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}
