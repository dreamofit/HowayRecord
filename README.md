# HowayRecord 说明文档
## 项目用途
    使用该项目可以快速创建另外一个项目

## 使用方法
    运行Main.java程序，输入你的项目名，很快对吧，哈哈


## 技术准备
    后端服务拟采用java，其中jdk版本基于17进行开发，使用springboot框架，数据库使用mybatis，使用dubbo进行分布式开发。

## 项目框架
    HowayRecord-core: 数据库核心层
    HowayRecord-processor： 处理器层，各服务核心处理逻辑
    HowayRecord-util: 工具库
    HowayRecord-api: dubbo api
    HowayRecord-provider: api服务提供
    HowayRecord-web: restful api提供

## 启动参数
    --add-opens java.base/java.lang=ALL-UNNAMED

