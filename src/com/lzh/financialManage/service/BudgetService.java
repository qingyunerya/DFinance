package com.lzh.financialManage.service;

import com.lzh.financialManage.pojo.Budget;

public interface BudgetService {

	void addBudget(Budget budget);//Ìí¼ÓÔ¤Ëã

	Budget findBudget(Budget budget);//²éÕÒµ±Ç°ÔÂ·İÊÇ·ñ´æÔÚÔ¤Ëã

	void editBudget(Budget budget);//±à¼­Ô¤Ëã

	void deleteBudget(int wid);//É¾³ıÔ¤Ëã

}
