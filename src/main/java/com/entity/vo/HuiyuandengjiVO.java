package com.entity.vo;

import com.entity.HuiyuandengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员等级
 * @author 
 * @email 
 * @date 2024-05-06 13:14:30
 */
public class HuiyuandengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会员折扣
	 */
	
	private String huiyuanzhekou;
		
	/**
	 * 会员价格
	 */
	
	private Double huiyuanjiage;
				
	
	/**
	 * 设置：会员折扣
	 */
	 
	public void setHuiyuanzhekou(String huiyuanzhekou) {
		this.huiyuanzhekou = huiyuanzhekou;
	}
	
	/**
	 * 获取：会员折扣
	 */
	public String getHuiyuanzhekou() {
		return huiyuanzhekou;
	}
				
	
	/**
	 * 设置：会员价格
	 */
	 
	public void setHuiyuanjiage(Double huiyuanjiage) {
		this.huiyuanjiage = huiyuanjiage;
	}
	
	/**
	 * 获取：会员价格
	 */
	public Double getHuiyuanjiage() {
		return huiyuanjiage;
	}
			
}
