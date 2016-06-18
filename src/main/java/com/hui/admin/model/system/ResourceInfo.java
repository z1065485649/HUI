package com.hui.admin.model.system;

import java.sql.Timestamp;

/**
 * 菜单资源
 * @author hzw 时间:2016年6月18日
 *
 */
public class ResourceInfo {
	private String id;
	private String name;//名称
	private String path;//路径
	private String parent_id;
	private int index;//页面排序
	private int orderIndex;//菜单排序
	private Timestamp createTime;
	private Timestamp updateTime;  
}
