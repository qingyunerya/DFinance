package com.lzh.financialManage.service;

import com.lzh.financialManage.pojo.Budget;

public interface BudgetService {

	void addBudget(Budget budget);//���Ԥ��

	Budget findBudget(Budget budget);//���ҵ�ǰ�·��Ƿ����Ԥ��

	void editBudget(Budget budget);//�༭Ԥ��

	void deleteBudget(int wid);//ɾ��Ԥ��

}
