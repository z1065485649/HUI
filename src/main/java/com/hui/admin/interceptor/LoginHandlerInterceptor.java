package com.hui.admin.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.hui.admin.constant.Constants;
import com.hui.admin.model.system.UserInfo;
import com.hui.admin.util.shiro.JurisdictionUtil;
public class LoginHandlerInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
				String path = request.getServletPath();
				if(path.matches(Constants.NO_INTERCEPTOR_PATH)){
					return true;
				}else{
					//shiro管理的session
					Subject currentUser = SecurityUtils.getSubject();  
					Session session = currentUser.getSession();
					UserInfo user = (UserInfo)session.getAttribute(Constants.SESSION_USER_KEY);
					if(user!=null){
						path = path.substring(1, path.length());
						boolean b = JurisdictionUtil.hasJurisdiction(path);
						if(!b){
							response.sendRedirect(request.getContextPath() + Constants.LOGIN);
						}
						return b;
					}else{
						//登陆过滤
						response.sendRedirect(request.getContextPath() + Constants.LOGIN);
						return false;		
					}
				}
	}
}
