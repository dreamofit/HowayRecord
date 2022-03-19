package cn.ihoway;

import cn.ihoway.redis.RecordCache;
import cn.ihoway.scheduler.MyScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 初始化dubbo服务
 */
public class DubboServerInit {
    public static void main(String[] args) throws IOException {
        RecordCache recordCache = new RecordCache();
        recordCache.init();
        MyScheduler.execute();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo/provider.xml");
        //System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("*** HowayRecord服务已经启动 ***");
        System.in.read();
    }
}
