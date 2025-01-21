package com.entity.vo;

import com.entity.QicaizuyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 器材租用
 * @author 
 * @email 
 * @date 2024-05-06 13:14:29
 */
public class QicaizuyongVO  implements Serializable {
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
	 * 租用状态
	 */
	
	private String zuyongzhuangtai;
		
	/**
	 * 租用费用
	 */
	
	private Double zuyongfeiyong;
		
	/**
	 * 会员折扣
	 */
	
	private Double huiyuanzhekou;
		
	/**
	 * 合计费用
	 */
	
	private Double hejifeiyong;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 会员等级
	 */
	
	private String huiyuandengji;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 租借时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zujieshijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：租用状态
	 */
	 
	public void setZuyongzhuangtai(String zuyongzhuangtai) {
		this.zuyongzhuangtai = zuyongzhuangtai;
	}
	
	/**
	 * 获取：租用状态
	 */
	public String getZuyongzhuangtai() {
		return zuyongzhuangtai;
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
	 * 设置：会员折扣
	 */
	 
	public void setHuiyuanzhekou(Double huiyuanzhekou) {
		this.huiyuanzhekou = huiyuanzhekou;
	}
	
	/**
	 * 获取：会员折扣
	 */
	public Double getHuiyuanzhekou() {
		return huiyuanzhekou;
	}
				
	
	/**
	 * 设置：合计费用
	 */
	 
	public void setHejifeiyong(Double hejifeiyong) {
		this.hejifeiyong = hejifeiyong;
	}
	
	/**
	 * 获取：合计费用
	 */
	public Double getHejifeiyong() {
		return hejifeiyong;
	}
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：会员等级
	 */
	 
	public void setHuiyuandengji(String huiyuandengji) {
		this.huiyuandengji = huiyuandengji;
	}
	
	/**
	 * 获取：会员等级
	 */
	public String getHuiyuandengji() {
		return huiyuandengji;
	}
				
	
	/**
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：租借时间
	 */
	 
	public void setZujieshijian(Date zujieshijian) {
		this.zujieshijian = zujieshijian;
	}
	
	/**
	 * 获取：租借时间
	 */
	public Date getZujieshijian() {
		return zujieshijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
