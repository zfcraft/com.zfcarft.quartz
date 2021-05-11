package com.zfcraft.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
//@Proxy(lazy = false)
@Table(name = "tbl_schedule_job")
//@Entity
public class ScheduleJobPo {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    // 任务group名称
    @Column(name = "group_name")
    private String groupName;
    // 任务job名称
    @Column(name = "job_name")
    private String jobName;
    // cron表达式
    @Column(name = "cron")
    private String cron;
    // 0 - 代表正在执行 1 - 已删除 2 - 暂停
    @Column(name = "status")
    private Integer status;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "modified_time")
    private Date modifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
