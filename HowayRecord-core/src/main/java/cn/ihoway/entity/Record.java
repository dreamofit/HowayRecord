package cn.ihoway.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * record 请求日志记录表
 * @author howay
 */
@Data
public class Record implements Serializable {
    private Integer id;

    /**
     * 事件编号
     */
    private String eventNo;

    private String traceId;

    /**
     * 请求json
     */
    private String input;

    /**
     * 响应json
     */
    private String output;

    /**
     * 请求token
     */
    private String inputToken;

    /**
     * 请求时间
     */
    private String inputTime;

    /**
     * 请求时间戳
     */
    private String inputTimestamp;

    private String ip;

    /**
     * 系统名称
     */
    private String sysName;

    /**
     * 响应token
     */
    private String outputToken;

    /**
     * 响应时间
     */
    private String outputTime;

    /**
     * 响应时间戳
     */
    private String outputTimestamp;

    /**
     * 请求所用时间
     */
    private Integer time;

    /**
     * get put post delete
     */
    private String method;

    /**
     * 响应码
     */
    private Integer responseCode;

    /**
     * 备用字段
     */
    private String backup;

    private static final long serialVersionUID = 1L;
}