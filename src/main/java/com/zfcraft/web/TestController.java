package com.zfcraft.web;

import com.zfcraft.model.ScheduleJobModel;
import com.zfcraft.service.ScheduleJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/api")
public class TestController {
    @Autowired
    private ScheduleJobService scheduleJobService;
    /**
     * 开启
     * @param model
     * @return
     */
    @PostMapping("start")
    public String startSchedule(@RequestBody ScheduleJobModel model){
        scheduleJobService.startSchedule(model);
        return "ok";
    }

    /**
     * 更新
     * @param model
     * @return
     */
    @PostMapping("update")
    public String scheduleUpdateCorn(@RequestBody ScheduleJobModel model){
        scheduleJobService.scheduleUpdateCorn(model);
        return "ok";
    }

}