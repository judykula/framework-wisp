
# 概要

整套架构的命名规则以中国古代神话人物拼音生成，全部小写

## wisp

公共依赖项目，主要包含各个项目的公共"无状态"内容，比如rpc之间的requestDto与responseDto

## 1.0.0
    
    项目结构：
        - constant: 常量定义放到这里
        - enm: enum定义放到这里
        - exception: exception定义放到这里
        - pojo: 对应的各种"dto"定义放到这里
        - util: 工具类放到这里