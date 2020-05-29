package com.lzh.financialManage.mapper;

import com.lzh.financialManage.pojo.Budget;

public interface BudgetMapper {

	//Ìí¼ÓÔ¤Ëã
	void addBudget(Budget budget);

	//²éÕÒµ±Ç°ÔÂ·İÊÇ·ñ´æÔÚÔ¤Ëã
	Budget findBudget(Budget budget);

	//±à¼­Ô¤Ëã
	void editBudget(Budget budget);

	//É¾³ıÔ¤Ëã
	void deleteBudget(int wid);

}
