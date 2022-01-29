package cn.ihoway.Impl;

import cn.ihoway.entity.Record;

public interface RecordService {

    int addRecord(Record record);
    int UpdateRecord(Record record);
    Record findByEventNo(String eventNo);

}
