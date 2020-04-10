package cn.zhku.jsj144.zk.financialManage.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UeditorServlet extends HttpServlet {

	//���ڽ���form���е�editorValueֵ
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			//�����������Ӧ�ı���ͳһΪUTF-8
	        request.setCharacterEncoding("UTF-8");
	        response.setCharacterEncoding("UTF-8");
	        //�õ��༭��������
	        String content = request.getParameter("editorValue");
	        //�����Ϊ��
	        if(content != null){
	            //���������ý�����
	            request.setAttribute("content",content);
	            //ת����content.jsp
	            request.getRequestDispatcher("/test/content.jsp").forward(request, response);
	        }else{
	            response.getWriter().append("����Ϊ��!");
	        }
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
