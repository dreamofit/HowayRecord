package cn.ihoway.processor;

import cn.ihoway.Impl.RecordService;
import cn.ihoway.Impl.RecordServiceImpl;
import cn.ihoway.entity.Record;

import java.util.HashMap;

public class RecordUpdateProcessor {
    public int doExecute(HashMap<String,String> updateInput){
        RecordService recordService = new RecordServiceImpl();
        String eventNo = updateInput.get("eventNo");
        Record record = recordService.findByEventNo(eventNo);
        if(record != null){
            String output = updateInput.get("output");
            String outputToken = updateInput.get("outputToken");
            String outputTime = updateInput.get("outputTime");
            String outputTimestamp = updateInput.get("outputTimestamp");
            Integer responseCode = Integer.parseInt(updateInput.get("responseCode"));

            record.setOutput(output);
            record.setOutputTime(outputTime);
            record.setOutputToken(outputToken);
            record.setOutputTimestamp(outputTimestamp);
            record.setResponseCode(responseCode);
            int time = (int) (Long.parseLong(outputTimestamp) - Long.parseLong(record.getInputTimestamp()));
            record.setTime(time);
            return recordService.UpdateRecord(record);
        }
        return -1;
    }
}
