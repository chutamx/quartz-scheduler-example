package com.chuta.tasks.example.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {
    public void execute(JobExecutionContext context)throws JobExecutionException {
        System.out.println("Hello! ┌( ಠ_ಠ)┘");
    }
}