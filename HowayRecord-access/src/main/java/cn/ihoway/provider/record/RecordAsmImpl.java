package cn.ihoway.provider.record;

import cn.ihoway.api.record.RecordAsm;
import cn.ihoway.processor.RecordAddProcessor;
import cn.ihoway.processor.RecordSearchProcessor;
import cn.ihoway.util.HowayContainer;
import com.alibaba.fastjson.JSON;
import java.util.HashMap;

public class RecordAsmImpl implements RecordAsm {

    private final RecordSearchProcessor recordSearchProcessor = (RecordSearchProcessor) HowayContainer.getBean("recordSearchProcessor");

    private final RecordAddProcessor recordAddProcessor = (RecordAddProcessor) HowayContainer.getBean("recordAddProcessor");

    @Override
    public int addRecord(HashMap<String, String> addInput) {
        return recordAddProcessor.doExecute(addInput);
    }

    @Override
    public HashMap<String,Object> findByEventNo(String eventNo) throws Exception {
        return recordSearchProcessor.doExecute(eventNo);
    }
}
