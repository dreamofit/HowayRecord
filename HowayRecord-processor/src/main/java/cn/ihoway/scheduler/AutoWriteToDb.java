package cn.ihoway.scheduler;

import cn.ihoway.redis.RecordCache;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class AutoWriteToDb implements Job {

    private final RecordCache recordCache = new RecordCache();

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        recordCache.putDb();
    }
}
