package com.briup.apps.poll.dao;

import com.briup.apps.poll.bean.Survey;
import com.briup.apps.poll.bean.SurveyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    long countByExample(SurveyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    int deleteByExample(SurveyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    int insert(Survey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    int insertSelective(Survey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    List<Survey> selectByExample(SurveyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    Survey selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") Survey record, @Param("example") SurveyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    int updateByExample(@Param("record") Survey record, @Param("example") SurveyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    int updateByPrimaryKeySelective(Survey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_survey
     *
     * @mbg.generated Mon Jul 02 17:25:11 CST 2018
     */
    int updateByPrimaryKey(Survey record);
}