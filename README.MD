## bye-crud-common

配套 [bye-crud-generate](https://gitee.com/mrc1999/bye-crud-generate) 生成器使用的工具类

[![程序猿小码/bye-crud-generate](https://gitee.com/mrc1999/bye-crud-generate/widgets/widget_card.svg?colors=4183c4,ffffff,ffffff,e3e9ed,666666,9b9b9b)](https://gitee.com/mrc1999/bye-crud-generate)

请使用 `maven` 工具构建，使用当前最新版本

```xml
<dependency>
  <groupId>xyz.chaobei</groupId>
  <artifactId>bye-crud-common</artifactId>
  <version>1.4.1</version>
</dependency>
```

### 结构组成

- api
  - ComonResult 用于Controller返回JSON数据的封装
  - IErrorCode 定义错误码接口
  - ResultCode 实现的具体类型，参考了http code
- domain 
  - BaseModel Controller 层分页AO 入参信息父类
- exception
  - ApiException 通用自定义异常信息
  - Asserts 断言抛出异常信息
- validation
  - enums 配置注解用到的枚举信息
  - interfaces 验证注解

## bye-crud-generate

