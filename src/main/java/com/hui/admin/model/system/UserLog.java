package com.hui.admin.model.system;

import java.sql.Timestamp;

/***
 * 用户登录日志记录
 * @author hzw 时间:2016年6月18日
 *
 */
public class UserLog {
	private String id;//编号
	private String ip;//登录ip
	private String userAgent;//浏览器
	private Timestamp createTime;//登录时间  
	private String user_id;//用户id
}
