package cn.ihoway.Impl;

import cn.ihoway.entity.Record;

import java.util.List;

public interface RecordService {

    int addRecord(Record record);
    int UpdateRecord(Record record);
    Record findByEventNo(String eventNo);
    void free();
    List<Record> selectAll();
}
