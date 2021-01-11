## bye-crud-common

配套 `bye-crud-generate` 生成器使用的工具类

请使用 `maven` 工具构建，使用当前最新版本
```xml
<dependency>
  <groupId>xyz.chaobei</groupId>
  <artifactId>bye-crud-common</artifactId>
  <version>1.4.0</version>
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

## bye-crud-generate

