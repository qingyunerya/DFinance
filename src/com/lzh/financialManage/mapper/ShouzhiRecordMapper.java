package com.lzh.financialManage.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lzh.financialManage.pojo.DayCount;
import com.lzh.financialManage.pojo.MonthCount;
import com.lzh.financialManage.pojo.ShouzhiRecord;
import com.lzh.financialManage.pojo.ShouzhiRecordQueryVo;
import com.lzh.financialManage.pojo.User;

public interface ShouzhiRecordMapper {

	int findShouzhiRecordCount(Map<String, Object> map);// ��ѯ�û�����֧��ϸ��¼��

	// ��ҳ��ѯ��ǰ�û��ģ���ǰҳ��¼��
	List<ShouzhiRecord> findCurrenPageRecordList(ShouzhiRecordQueryVo queryVo);
/*	List<ShouzhiRecord> findCurrenPageRecordList( 
			@Param("user_id") int user_id,
			@Param("startPosition") int startPosition,
			@Param("pageRecord") int pageRecord);*/

	
	//����id��ѯ��֧��¼��Ϣ
	ShouzhiRecord findShouzhiRecordById(Map<String, Integer> map);

	//�޸��û���֧��Ϣ
	void editShouzhiRecord(ShouzhiRecord shouzhiRecord);

	//ɾ���û���֧��Ϣ��һ����
	void deleteOneShouzhiRecord(int id);

	//�����֧��¼��Ϣ������ ����  ֧����  
	void addShouzhiRecord(ShouzhiRecord shouzhiRecord);
	/*------------------------���ͳ��---------------------------------------------*/
	//ÿ���µ����룬֧��ͳ��      ÿ���µ����� -->�� �����
	List<MonthCount> findYearInMonthCountIncome(Map<String, String> paramMap);

	//ÿ���µ����룬֧��ͳ��     ÿ���µ�֧�� -->�� �����
	List<MonthCount> findYearInMonthCountSpend(Map<String, String> paramMap);

	//һ��ģ������������ͳ��     
	List<MonthCount> findYearInCategoryCountIncome(Map<String, String> paramMap);

	//һ��ģ�����֧�����ͳ��     
	List<MonthCount> findYearInCategoryCountSpend(Map<String, String> paramMap);

	/*------------------------�·�ͳ��---------------------------------------------*/
	//ÿ�������ͳ��       ->�죺���
	List<DayCount> findMonthInDayCountIncome(Map<String, String> paramMap);

	//ÿ���֧��ͳ��    -->�죺���
	List<DayCount> findMonthInDayCountSpend(Map<String, String> paramMap);

	//һ���µģ������������ͳ��    
	List<DayCount> findMonthInCategoryCountIncome(Map<String, String> paramMap);

	//һ���£�����֧�����ͳ��
	List<DayCount> findMonthInCategoryCountSpend(Map<String, String> paramMap);

	/*------------------------ʱ���ͳ��---------------------------------------------*/
	//ĳ��ʱ��εĲ�ͬ���͵�����ͳ��
	List<DayCount> findDayInTimeCountIncomes(Map<String, String> paramMap);
	//ĳ��ʱ��εĲ�ͬ���͵�֧��ͳ��
	List<DayCount> findDayInTimeCountSpends(Map<String, String> paramMap);

	
	//ͨ����֧���id ��ѯ������ ���� ֧��
	String findParentCategoryById(int szcid);

}
