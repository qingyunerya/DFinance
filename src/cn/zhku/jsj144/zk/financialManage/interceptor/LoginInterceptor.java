package cn.zhku.jsj144.zk.financialManage.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.zhku.jsj144.zk.financialManage.pojo.User;

//��¼������
public class LoginInterceptor implements HandlerInterceptor {

	private List<String> exceptUrls;//���е���Դ�б�
	public List<String> getExceptUrls() {
		return exceptUrls;
	}
	public void setExceptUrls(List<String> exceptUrls) {
		this.exceptUrls = exceptUrls;
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// System.out.println("Interceptor1 preHandle........");
		// ִ�е�ʱ������Handlerִ��֮ǰִ�д˷���
		// ����ֵ���������true���ͷ��У������أ�����ִ��Handler���д���
		// ����ֵ���������false���Ǿ����أ�Handler�Ͳ�������������

		// ������Դ·��
		String requestUri = request.getRequestURI();
		
//		//   /financialManage/memorandum/listMemorandum.action
//		System.out.println("requestUri:"+requestUri);// ������Դ·��  
//		//   /financialManage
//		System.out.println("request.getContextPath() :"+ request.getContextPath());//��Ŀ��
		
		if (requestUri.startsWith(request.getContextPath())) {// /financialManage
			requestUri = requestUri.substring(
					request.getContextPath().length(), requestUri.length());
		}
		
		
//		  <value>/user/**</value>  
//        <value>/index.jsp</value> 
//        <value>/regist.jsp </value>  
		
		// ����exceptUrls�����õ�url
		for (String url : exceptUrls) {
			if (url.endsWith("/**")) {
				if (requestUri.startsWith(url.substring(0, url.length() - 3))) {
					return true;//����
				}
			} 
			else if (requestUri.startsWith(url)) {//�������Դƥ��
				return true;//����
			}
		}

		// 1) �����û������ж��û��Ƿ��¼
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user != null) {
			return true;// 2) ����û��Ѿ���¼������
		}
		// 3) ����û�δ��¼����ת����¼ҳ�棬��ת�Ĺ������п��ܱ����أ����Ե���һ���ж�
		response.sendRedirect(request.getContextPath() + "/index.jsp");//��¼ҳ��
		return false;//����
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// Handlerִ��֮���ڷ���ModelAndView֮ǰ����modelAndView��Щ�ֽ�
		// System.out.println("Interceptor1 postHandle........");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// ����ModelAndView֮��
		// Handlerִ�й����г����쳣�������ڴ˴����쳣
		// System.out.println("Interceptor1 afterCompletion........");
	}

}
