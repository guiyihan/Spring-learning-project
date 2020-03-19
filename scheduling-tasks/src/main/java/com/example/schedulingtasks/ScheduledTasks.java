package com.example.schedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;
import java.util.StringJoiner;

@Component
public class ScheduledTasks {
    private static final Logger logger= LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    @Scheduled(fixedRate = 1000)
    public void currentTime(){
        logger.info("The time is now:"+dateFormat.format(new Date()));
    }
}



