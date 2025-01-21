package com.entity.vo;

import com.entity.ShiwuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 失物管理
 * @author 
 * @email 
 * @date 2024-05-06 13:14:30
 */
public class ShiwuguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 失物图片
	 */
	
	private String shiwutupian;
		
	/**
	 * 失物详情
	 */
	
	private String shiwuxiangqing;
		
	/**
	 * 失物状态
	 */
	
	private String shiwuzhuangtai;
		
	/**
	 * 捡到时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiandaoshijian;
		
	/**
	 * 捡到地点
	 */
	
	private String jiandaodidian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：失物图片
	 */
	 
	public void setShiwutupian(String shiwutupian) {
		this.shiwutupian = shiwutupian;
	}
	
	/**
	 * 获取：失物图片
	 */
	public String getShiwutupian() {
		return shiwutupian;
	}
				
	
	/**
	 * 设置：失物详情
	 */
	 
	public void setShiwuxiangqing(String shiwuxiangqing) {
		this.shiwuxiangqing = shiwuxiangqing;
	}
	
	/**
	 * 获取：失物详情
	 */
	public String getShiwuxiangqing() {
		return shiwuxiangqing;
	}
				
	
	/**
	 * 设置：失物状态
	 */
	 
	public void setShiwuzhuangtai(String shiwuzhuangtai) {
		this.shiwuzhuangtai = shiwuzhuangtai;
	}
	
	/**
	 * 获取：失物状态
	 */
	public String getShiwuzhuangtai() {
		return shiwuzhuangtai;
	}
				
	
	/**
	 * 设置：捡到时间
	 */
	 
	public void setJiandaoshijian(Date jiandaoshijian) {
		this.jiandaoshijian = jiandaoshijian;
	}
	
	/**
	 * 获取：捡到时间
	 */
	public Date getJiandaoshijian() {
		return jiandaoshijian;
	}
				
	
	/**
	 * 设置：捡到地点
	 */
	 
	public void setJiandaodidian(String jiandaodidian) {
		this.jiandaodidian = jiandaodidian;
	}
	
	/**
	 * 获取：捡到地点
	 */
	public String getJiandaodidian() {
		return jiandaodidian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
