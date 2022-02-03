package cn.ihoway.Impl;

import cn.ihoway.dao.RecordDao;
import cn.ihoway.entity.Record;
import cn.ihoway.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class RecordServiceImpl implements RecordService {

    private final SqlSession sqlSession = MybatisUtils.getSqlSession();
    private final RecordDao recordDao = sqlSession.getMapper(RecordDao.class);

    @Override
    public int addRecord(Record record) {
        int rs = recordDao.insertSelective(record);
        if(rs > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        return rs;
    }

    @Override
    public int UpdateRecord(Record record) {
        int rs = recordDao.updateByEventNo(record);
        if(rs > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        return rs;
    }

    @Override
    public Record findByEventNo(String eventNo) {
        return recordDao.selectByEventNo(eventNo);
    }
}