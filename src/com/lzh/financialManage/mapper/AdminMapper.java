package com.lzh.financialManage.mapper;

import com.lzh.financialManage.pojo.Admin;

public interface AdminMapper {

	//�����û��Ƿ����
	Admin findAdmin(Admin admin);

	int countShouzhiRecord(int uid);

	int countBudget(int uid);

	int countWishList(int uid);

	int countMemorandum(int uid);

}
