package cn.ihoway.redis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordCacheTest {

    private RecordCache recordCache = new RecordCache();

    @Test
    void getSize() {
        System.out.println(recordCache.getSize());
    }
}