package com.entity.vo;

import com.entity.QicaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 器材信息
 * @author 
 * @email 
 * @date 2024-05-06 13:14:29
 */
public class QicaixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 器材名称
	 */
	
	private String qicaimingcheng;
		
	/**
	 * 器材图片
	 */
	
	private String qicaitupian;
		
	/**
	 * 租用费用
	 */
	
	private Double zuyongfeiyong;
		
	/**
	 * 器材状态
	 */
	
	private String qicaizhuangtai;
		
	/**
	 * 备注信息
	 */
	
	private String beizhuxinxi;
		
	/**
	 * 器材介绍
	 */
	
	private String qicaijieshao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：器材名称
	 */
	 
	public void setQicaimingcheng(String qicaimingcheng) {
		this.qicaimingcheng = qicaimingcheng;
	}
	
	/**
	 * 获取：器材名称
	 */
	public String getQicaimingcheng() {
		return qicaimingcheng;
	}
				
	
	/**
	 * 设置：器材图片
	 */
	 
	public void setQicaitupian(String qicaitupian) {
		this.qicaitupian = qicaitupian;
	}
	
	/**
	 * 获取：器材图片
	 */
	public String getQicaitupian() {
		return qicaitupian;
	}
				
	
	/**
	 * 设置：租用费用
	 */
	 
	public void setZuyongfeiyong(Double zuyongfeiyong) {
		this.zuyongfeiyong = zuyongfeiyong;
	}
	
	/**
	 * 获取：租用费用
	 */
	public Double getZuyongfeiyong() {
		return zuyongfeiyong;
	}
				
	
	/**
	 * 设置：器材状态
	 */
	 
	public void setQicaizhuangtai(String qicaizhuangtai) {
		this.qicaizhuangtai = qicaizhuangtai;
	}
	
	/**
	 * 获取：器材状态
	 */
	public String getQicaizhuangtai() {
		return qicaizhuangtai;
	}
				
	
	/**
	 * 设置：备注信息
	 */
	 
	public void setBeizhuxinxi(String beizhuxinxi) {
		this.beizhuxinxi = beizhuxinxi;
	}
	
	/**
	 * 获取：备注信息
	 */
	public String getBeizhuxinxi() {
		return beizhuxinxi;
	}
				
	
	/**
	 * 设置：器材介绍
	 */
	 
	public void setQicaijieshao(String qicaijieshao) {
		this.qicaijieshao = qicaijieshao;
	}
	
	/**
	 * 获取：器材介绍
	 */
	public String getQicaijieshao() {
		return qicaijieshao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
