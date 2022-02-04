package cn.ihoway.record;

import cn.ihoway.api.record.RecordAsm;
import cn.ihoway.processor.RecordAddProcessor;
import cn.ihoway.processor.RecordSearchProcessor;
import cn.ihoway.processor.RecordUpdateProcessor;

import java.util.HashMap;

public class RecordAsmImpl implements RecordAsm {

    @Override
    public int addRecord(HashMap<String, String> addInput) {
        RecordAddProcessor recordAddProcessor = new RecordAddProcessor();
        return recordAddProcessor.doExecute(addInput);
    }

    @Override
    public int updateRecord(HashMap<String, String> updateInput) {
        RecordUpdateProcessor recordUpdateProcessor = new RecordUpdateProcessor();
        return recordUpdateProcessor.doExecute(updateInput);
    }

    @Override
    public HashMap<String,Object> findByEventNo(String eventNo) {
        RecordSearchProcessor recordSearchProcessor = new RecordSearchProcessor();
        return recordSearchProcessor.doExecute(eventNo);
    }
}
