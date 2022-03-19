package cn.ihoway.processor;

import cn.ihoway.Impl.RecordService;
import cn.ihoway.Impl.RecordServiceImpl;
import cn.ihoway.entity.Record;
import cn.ihoway.redis.RecordCache;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class RecordSearchProcessor {
    public HashMap<String,Object> doExecute(String eventNo){
        RecordCache recordCache = new RecordCache();
        Record record = recordCache.get(eventNo);
        return JSON.parseObject(JSON.toJSONString(record),HashMap.class);
    }
}
