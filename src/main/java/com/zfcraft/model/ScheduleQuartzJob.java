package com.zfcraft.model;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
@Slf4j
public class ScheduleQuartzJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String group = context.getJobDetail().getJobDataMap().get("group").toString();
        String name = context.getJobDetail().getJobDataMap().get("name").toString();
        log.info("执行了task...group:{}, name:{}", group, name);
        // 可在此执行定时任务的具体业务
        // ...
    }
}