package com.briup.apps.poll.dao.extend;

import java.util.List;

import com.briup.apps.poll.bean.extend.QuestionVM;

public interface QuestionVMMapper {
	/**
	 * 查询所有
	 * @return
	 */
	List<QuestionVM> selectAll();
	
	List<QuestionVM> selectByQuestionnaireId(long id);

}
