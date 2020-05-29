package com.lzh.financialManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lzh.financialManage.mapper.ShouzhiCategoryMapper;
import com.lzh.financialManage.pojo.ShouzhiCategory;
import com.lzh.financialManage.pojo.ShouzhiRecord;

@Transactional
@Service
public class ShouzhiCategoryServiceImpl implements ShouzhiCategoryService {

	@Autowired
	private ShouzhiCategoryMapper shouzhiCategoryMapper;
	
	//ͨ�������ͣ��Ӷ���ѯ���ø����͵�����������
	@Override
	public List<String> findSonCategoryByParent(String parent_category) {
		
		List<String> resultList=shouzhiCategoryMapper.findSonCategoryByParent(parent_category);
		return resultList;
	}

	//������֧�����ͣ������֧����id  ����
	@Override
	public ShouzhiCategory findCategoryBySonCategory(String son_category) {
		return shouzhiCategoryMapper.findCategoryBySonCategory(son_category);
	}

	//��ѯ�������֧��������   --ͨ�������࣬�Ӷ���ѯ���µ������ӷ���
	@Override
	public List<ShouzhiCategory> findShouzhiCategoryByParent(String parent_category) {
		return shouzhiCategoryMapper.findShouzhiCategoryByParent(parent_category);
	}

	//������֧����
	@Override
	public void addShouzhiCategory(ShouzhiCategory shouzhiCategory) {
		shouzhiCategoryMapper.addShouzhiCategory(shouzhiCategory);	
	}

}