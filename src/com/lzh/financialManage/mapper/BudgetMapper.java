package com.lzh.financialManage.mapper;

import com.lzh.financialManage.pojo.Budget;

public interface BudgetMapper {

	//���Ԥ��
	void addBudget(Budget budget);

	//���ҵ�ǰ�·��Ƿ����Ԥ��
	Budget findBudget(Budget budget);

	//�༭Ԥ��
	void editBudget(Budget budget);

	//ɾ��Ԥ��
	void deleteBudget(int wid);

}
