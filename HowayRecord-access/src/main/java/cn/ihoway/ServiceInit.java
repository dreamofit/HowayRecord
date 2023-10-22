package cn.ihoway;

import cn.ihoway.redis.RecordCache;
import cn.ihoway.scheduler.MyScheduler;
import cn.ihoway.util.HowayContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

//--add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.rmi/sun.rmi.transport=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.base/java.util=ALL-UNNAMED --add-opens java.base/java.math=ALL-UNNAMED
@SpringBootApplication
public class ServiceInit {

    public static void main( String[] args ) throws IOException {

        HowayContainer container = new HowayContainer();
        container.start();
        MyScheduler.execute();
        RecordCache recordCache = (RecordCache) HowayContainer.getBean("recordCache");
        recordCache.init();
        System.out.println("*** HowayRecord服务已经启动 ***");
        System.in.read();
        SpringApplication.run(ServiceInit.class, args);

    }
}
