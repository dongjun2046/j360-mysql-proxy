Simple Mysql Proxy For Java

模拟Mysql代理服务器, 后期可用于分表分库代理, 类似于MyCat

## 运行Proxy代理服务器

1. 配置DataSourceManager

- url
- username
- password

2. 启动服务 Bootstrap

3. 本地安装Mysql Client

-mysql -u root -h 127.0.0.1 -P3307

: show tables


## Test
1. 验证底层服务

DatasourceTest.druidTest()