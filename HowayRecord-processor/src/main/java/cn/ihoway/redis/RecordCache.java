package cn.ihoway.redis;

import cn.ihoway.Impl.RecordService;
import cn.ihoway.Impl.RecordServiceImpl;
import cn.ihoway.entity.Record;
import cn.ihoway.util.HowayContainer;
import cn.ihoway.util.HowayRedisCache;
import org.mybatis.caches.redis.SerializeUtil;

import java.util.List;
import java.util.Map;

public class RecordCache {
    private HowayRedisCache cache = new HowayRedisCache("cn.ihoway.entity.Record");

    /**
     * 缓存初始化
     */
    public void init(){
        if(cache.getSize() == 0){
            getFormDb();
        }
    }

    public void add(Record record){
        cache.putObject(record.getEventNo(),record);
    }

    public Record get(String eventNo){
        return (Record) cache.getObject(eventNo);
    }

    public int getSize(){
        return cache.getSize();
    }

    /**
     * 持久化数据库
     * 将缓存内容存入数据库中
     */
    public void putDb(){
        RecordService service = (RecordServiceImpl) HowayContainer.getBean("recordServiceImpl");
        Map<byte[], byte[]> dataMap = cache.getAll();
        for(byte[] key:dataMap.keySet()){
            Record record = (Record) SerializeUtil.unserialize(dataMap.get(key));
            if(service.findByEventNo(record.getEventNo()) == null){
                service.addRecord(record);
            }
        }
    }

    /**
     * 重置缓存
     * 清空全部缓存并从数据库加载全部数据
     */
    public void resetCache(){
        cache.clear();
        //从数据库获取数据
        getFormDb();
    }

    /**
     * 从数据库获取数据
     */
    private void getFormDb(){
        RecordService service = (RecordServiceImpl) HowayContainer.getBean("recordServiceImpl");
        List<Record> list = service.selectAll();
        for(Record record:list){
            if(cache.getObject(record.getEventNo()) == null){
                cache.putObject(record.getEventNo(),record);
            }
        }
    }


}
