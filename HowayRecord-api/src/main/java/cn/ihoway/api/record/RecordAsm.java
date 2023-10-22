package cn.ihoway.api.record;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public interface RecordAsm {
    public int addRecord(HashMap<String,String> addInput);
    //public int updateRecord(HashMap<String,String> updateInput);
    public HashMap<String,Object> findByEventNo(String eventNo) throws Exception;
}
