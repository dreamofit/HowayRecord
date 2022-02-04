package cn.ihoway.processor;

import org.junit.jupiter.api.Test;

class RecordSearchProcessorTest {

    @Test
    void doExcute() {
        RecordSearchProcessor processor = new RecordSearchProcessor();
        System.out.println(processor.doExecute("001") == null);
    }
}