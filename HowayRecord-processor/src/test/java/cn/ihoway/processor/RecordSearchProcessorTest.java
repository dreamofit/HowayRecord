package cn.ihoway.processor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordSearchProcessorTest {

    @Test
    void doExcute() {
        RecordSearchProcessor processor = new RecordSearchProcessor();
        System.out.println(processor.doExcute("001") == null);
    }
}