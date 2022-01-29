package cn.ihoway.processor;

import cn.ihoway.Impl.RecordService;
import cn.ihoway.Impl.RecordServiceImpl;
import cn.ihoway.entity.Record;

import java.util.HashMap;

public class RecordAddProcessor {
    public int doExcute(HashMap<String,String> addInput){
        String eventNo = addInput.get("eventNo");
        String input = addInput.get("input");
        String inputToken = addInput.get("inputToken");
        String inputTime = addInput.get("inputTime");
        String inputTimestamp = addInput.get("inputTimestamp");
        String ip = addInput.get("ip");
        String sysName = addInput.get("sysName");
        String method = addInput.get("method");

        Record record = new Record();
        record.setEventNo(eventNo);
        record.setInput(input);
        record.setInputTime(inputTime);
        record.setInputToken(inputToken);
        record.setIp(ip);
        record.setInputTimestamp(inputTimestamp);
        record.setSysName(sysName);
        record.setMethod(method);

        RecordService recordService = new RecordServiceImpl();
        return recordService.addRecord(record);
    }
}
