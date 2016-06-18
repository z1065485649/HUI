package com.hui.admin.model.system;

import java.sql.Timestamp;

/***
 * 权限对应表
 * @author hzw 时间:2016年6月18日
 *
 */
public class RoleResource {
	private String id;
	private int createOperate;
	private int editOperate;
	private int deleteOperate;
	private int queryOperate;
	private Timestamp createTime;
	private Timestamp updateTime;  
	
	private String role_id;
	private String resource_id;
}
