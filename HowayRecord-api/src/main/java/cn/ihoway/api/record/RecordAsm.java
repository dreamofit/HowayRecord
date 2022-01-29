package cn.ihoway.api.record;

import java.util.HashMap;

public interface RecordAsm {
    public int addRecor(HashMap<String,String> addInput);
    public int updateRecord(HashMap<String,String> updateInput);
    public HashMap<String,Object> findByEventNo(String eventNo);
}
