package cn.zhku.jsj144.zk.financialManage.interceptor;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.zhku.jsj144.zk.financialManage.pojo.News;

/**
 * ȫ���ļ����������� .txt,doc,docx
 */
public class FileTypeInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		boolean flag = true;

		// �ж��Ƿ�Ϊ�ļ��ϴ�����
		if (request instanceof MultipartHttpServletRequest) {
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			Map<String, MultipartFile> files = multipartRequest.getFileMap();
			Iterator<String> iterator = files.keySet().iterator();
			// �Զಿ��������Դ���б���
			while (iterator.hasNext()) {
				String formKey = (String) iterator.next();
				
				MultipartFile multipartFile = multipartRequest.getFile(formKey);
				
				String filename = multipartFile.getOriginalFilename();//�ļ���
				
				// �ж��Ƿ�Ϊ�����ļ�����
				if (!checkFile(filename)) {
					
					News news=new News();
					String nTitle=request.getParameter("nTitle");
					String author=request.getParameter("author");
					String keyword=request.getParameter("keyword");
					String recordTime=request.getParameter("recordTime");
					news.setKeyword(keyword);
					news.setAuthor(author);
					news.setnTitle(nTitle);
					news.setRecordTime(recordTime);
					// �����ļ����ͣ�����ת����ԭʼ����ҳ�棬��Я��������ʾ��Ϣ
					
					request.setAttribute("myMsg", "��֧�ֵ��ļ����ͣ��������ʧ�ܣ�������ѡ����ȷ�ļ�����");
					request.setAttribute("errormessage", "��֧�ֵ��ļ����ͣ�");
					request.setAttribute("news", news);//���ظ�ҳ��ֵ
					request.getRequestDispatcher("/admin/news/addnews.jsp").forward(request, response);
					flag = false;//����
				}
			}
		}
		return flag;
	}

	/**
	 * �ж��Ƿ�Ϊ������ϴ��ļ�����,true��ʾ����
	 */
	private boolean checkFile(String fileName) {
		// ���������ϴ��ļ�����
		String suffixList = ".txt,doc,docx";

		// ��ȡ�ļ���׺
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1,
				fileName.length());
		if (suffixList.contains(suffix.trim().toLowerCase())) {// ƥ��
			return true;
		}
		return false;// ��ƥ��
	}
}