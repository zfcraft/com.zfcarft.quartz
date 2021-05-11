package com.zfcraft.model;

import lombok.Data;

@Data
public class ScheduleJobModel {
    private Integer id;
    private String groupName;
    private String jobName;
    private String cron;
}