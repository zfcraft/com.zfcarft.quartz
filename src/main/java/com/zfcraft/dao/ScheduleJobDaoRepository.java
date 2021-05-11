package com.zfcraft.dao;


import com.zfcraft.model.ScheduleJobPo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ScheduleJobDaoRepository extends Mapper<ScheduleJobPo> {
    @Select("select * from tbl_schedule_job where id = #{id} and status = #{status}")
    ScheduleJobPo findByIdAndStatus(@Param("id") Integer id,
                                    @Param("status") Integer status);

    public List<ScheduleJobPo> findAllByStatus(Integer status);

    @Select("select * from tbl_schedule_job where group_name=#{groupName} and job_name=#{jobName} and status=#{status}")
    public List<ScheduleJobPo> findByGroupNameAndJobNameAndStatus(@Param("groupName") String groupName,
                                                                  @Param("jobName") String jobName,
                                                                  @Param("status") Integer status);

    public List<ScheduleJobPo> findAllByStatusInOrderByCreateTimeDesc(List<Integer> statusList);

    @Update("update tbl_schedule_job set corn = #{corn} where id = #{id} and status = #{status}")
    void update(ScheduleJobPo po);
}