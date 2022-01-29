package cn.ihoway.record;

import cn.ihoway.api.record.RecordAsm;
import cn.ihoway.processor.RecordAddProcessor;
import cn.ihoway.processor.RecordSearchProcessor;
import cn.ihoway.processor.RecordUpdateProcessor;

import java.util.HashMap;

public class RecordAsmImpl implements RecordAsm {

    @Override
    public int addRecor(HashMap<String, String> addInput) {
        RecordAddProcessor recordAddProcessor = new RecordAddProcessor();
        return recordAddProcessor.doExcute(addInput);
    }

    @Override
    public int updateRecord(HashMap<String, String> updateInput) {
        RecordUpdateProcessor recordUpdateProcessor = new RecordUpdateProcessor();
        return recordUpdateProcessor.doExcute(updateInput);
    }

    @Override
    public HashMap<String,Object> findByEventNo(String eventNo) {
        RecordSearchProcessor recordSearchProcessor = new RecordSearchProcessor();
        return recordSearchProcessor.doExcute(eventNo);
    }
}
