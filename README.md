# Getting Started

Spring Boot & Flowable Application Demo
- Spring Boot: 2.1.4
- Flowable: 6.4.1

首先，安装MySQL数据库，创建用户并授权。确保本地配置的数据库连接字符串是有效的。

然后，运行 DemoApplication 工程，Flowable 将自动在 MySQL数据库上创建表。
本实例中的bpmn.xml文件，即为一个工作流程定义文件，启动时也会自动部署。

本工程样例中，提供了启动流程、审批通过、查询、显示流程图的API。

### 测试过程记录

**add 请求：**

http://localhost:8080/expense/add?userId=123&money=8000&description=%E6%89%93%E8%BD%A6%E6%8A%A5%E9%94%80

服务端响应：

Submit Success! Process ID: c0c8ad2e-59cf-11e9-9715-3ebe9c76af23

**list 请求：**

http://localhost:8080/expense/list?userId=123

服务端响应：

Task[id=c0cc7dc5-59cf-11e9-9715-3ebe9c76af23, name=出差报销],

**diagram 请求：**

http://localhost:8080/expense/diagram?processId=c0c8ad2e-59cf-11e9-9715-3ebe9c76af23

服务端响应：返回了流程图图片

### Reference Documentation

[Flowable官方在线说明文档](https://www.flowable.org/docs/userguide/index.html)

[采用springboot+flowable快速实现工作流](https://blog.csdn.net/puhaiyang/article/details/79845248)
