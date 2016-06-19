package com.hui.admin.constant;

public class Constants {
	public static final String STATE_USER_OPEN = "1";
	public static final String STATE_USER_CLOSE = "0";

	public static final String SESSION_USER_KEY = "user";
	public static final String SESSION_IP_KEY = "ip";
	public static final String SESSION_USER_RESOURCE_KEY = "resources";
	public static final String SESSION_BUSSINESS = "bussiness";
	public static final String SESSION_CHARGE = "charge";
	public static final String SESSION_SALESMAN = "salesman";

	public static final String SESSION_OPERATE_KEY = "operate";
	public static final String SEESION_OPERATE_MAP_KEY = "operatemap";
	
	public static final String NO_INTERCEPTOR_PATH = ".*/((/user/login)|(websocket)).*";	//不对匹配该值的访问路径拦截（正则）
	public static final String LOGIN = "/login";				//登录地址
}
