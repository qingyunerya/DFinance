package com.lzh.financialManage.service;

import java.util.List;

import com.lzh.financialManage.pojo.ShouzhiCategory;
import com.lzh.financialManage.pojo.ShouzhiRecord;

public interface ShouzhiCategoryService {

	//ͨ�������ͣ��Ӷ���ѯ���ø����͵�����������
	List<String> findSonCategoryByParent(String parent_category);

	//������֧�����ͣ������֧����id  ����
	ShouzhiCategory findCategoryBySonCategory(String son_category);

	//��ѯ�������֧��������   --ͨ�������࣬�Ӷ���ѯ���µ������ӷ���
	List<ShouzhiCategory> findShouzhiCategoryByParent(String parent_category);

	//�����֧����
	void addShouzhiCategory(ShouzhiCategory shouzhiCategory);

}
