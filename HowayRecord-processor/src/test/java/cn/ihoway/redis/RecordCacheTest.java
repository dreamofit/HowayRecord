package cn.ihoway.redis;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class RecordCacheTest {

    private RecordCache recordCache = new RecordCache();

    @Test
    void getSize() {
        System.out.println(recordCache.getSize());
    }

    @Test
    void test(){
        String str = "这是一个字符串";
        String pattern = "\\$\\{([^}]*)\\}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while (m.find()) {
            String k = m.group();
            System.out.println("k:"+k);
            String v = m.group(1);
            System.out.println(v);
            System.out.println("准备替换");
            if(v.equals("num")){
                str = str.replace(k,"1");
            }
            if(v.contains("SERVER_PORT")){
                str = str.replace(k,"3300");
            }
            System.out.println(str);

        }
    }

}