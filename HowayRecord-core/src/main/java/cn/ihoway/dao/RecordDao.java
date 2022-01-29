package cn.ihoway.dao;

import cn.ihoway.entity.Record;

public interface RecordDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);

    Record selectByEventNo(String eventNo);

    int updateByPrimaryKeySelective(Record record);

    int updateByEventNo(Record record);

    int updateByPrimaryKey(Record record);
}