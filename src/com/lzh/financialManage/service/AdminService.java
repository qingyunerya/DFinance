package com.lzh.financialManage.service;

import com.lzh.financialManage.pojo.Admin;

public interface AdminService {

	Admin findAdmin(Admin admin);//��̨��¼

	int countShouzhiRecord(int uid);//��֧��¼

	int countBudget(int uid);//Ԥ���¼

	int countWishList(int uid);//��Ը����¼

	int countMemorandum(int uid);//����¼��¼

}
