package cn.ihoway.scheduler;

import org.quartz.SchedulerException;

public class MyScheduler {
    public static void execute(){
        try {
            SchedulerConfig scheduler = new SchedulerConfig();
            scheduler.init();
            //每五分钟持久化一次数据库
            scheduler.addJob(AutoWriteToDb.class,"* 0/5 * * * ?");
            scheduler.run();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
