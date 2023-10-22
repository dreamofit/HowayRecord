package cn.ihoway.processor;

import cn.ihoway.entity.Record;
import cn.ihoway.redis.RecordCache;
import cn.ihoway.util.HowayContainer;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class RecordSearchProcessor {
    public HashMap<String,Object> doExecute(String eventNo){
        RecordCache recordCache = (RecordCache) HowayContainer.getBean("recordCache");
        Record record = recordCache.get(eventNo);
        return JSON.parseObject(JSON.toJSONString(record),HashMap.class);
    }
}
