package cn.ihoway.processor;

import cn.ihoway.Impl.RecordService;
import cn.ihoway.Impl.RecordServiceImpl;
import cn.ihoway.entity.Record;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class RecordSearchProcessor {
    public HashMap<String,Object> doExecute(String eventNo){
        RecordService recordService = new RecordServiceImpl();
        Record record = recordService.findByEventNo(eventNo);
        recordService.free();
        return JSON.parseObject(JSON.toJSONString(record),HashMap.class);
    }
}
