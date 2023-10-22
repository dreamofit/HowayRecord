package cn.ihoway.processor;

import cn.ihoway.entity.Record;
import cn.ihoway.redis.RecordCache;
import cn.ihoway.util.HowayContainer;

import java.util.HashMap;

public class RecordAddProcessor {

    public int doExecute(HashMap<String,String> addInput){
        RecordCache recordCache = (RecordCache) HowayContainer.getBean("recordCache");
        Record record = (Record) HowayContainer.getBean("record");
        String eventNo = addInput.get("eventNo");
        String input = addInput.get("input");
        String inputToken = addInput.get("inputToken");
        String inputTime = addInput.get("inputTime");
        String inputTimestamp = addInput.get("inputTimestamp");
        String ip = addInput.get("ip");
        String sysName = addInput.get("sysName");
        String method = addInput.get("method");
        String traceId = addInput.get("traceId");
        String output = addInput.get("output");
        if(output.length() >= 4096){
            output = output.replaceAll("\"data\":.*,",""); //去掉data
        }
        String outputToken = addInput.get("outputToken");
        String outputTime = addInput.get("outputTime");
        String outputTimestamp = addInput.get("outputTimestamp");
        Integer responseCode = Integer.parseInt(addInput.get("responseCode"));
        record.setEventNo(eventNo);
        record.setInput(input);
        record.setInputTime(inputTime);
        record.setInputToken(inputToken);
        record.setIp(ip);
        record.setInputTimestamp(inputTimestamp);
        record.setSysName(sysName);
        record.setMethod(method);
        record.setTraceId(traceId);
        record.setOutput(output);
        record.setOutputTime(outputTime);
        record.setOutputToken(outputToken);
        record.setOutputTimestamp(outputTimestamp);
        record.setResponseCode(responseCode);
        int time = (int) (Long.parseLong(outputTimestamp) - Long.parseLong(inputTimestamp));
        record.setTime(time);
        recordCache.add(record);
        return 1;
    }
}
