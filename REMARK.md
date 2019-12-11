# 踩过的坑

### v1.1.0

```
src/main/resources/generatorConfig.xml

自动生成 mybatis 的 model和mapper时出现：The specified target project directory src\main/resources does not exist

错误定位在：generatorConfig.xml

<!--指定生成model的路径-->
<javaModelGenerator targetPackage="com.fyy.saas.mbg.model" targetProject="src/main/java"/>
<!--指定生成mapper.xml的路径-->
<sqlMapGenerator targetPackage="com.fyy.saas.mbg.mapper" targetProject="src/main/resources"/>
<!--指定生成mapper接口的的路径-->
<javaClientGenerator type="XMLMAPPER" targetPackage="com.fyy.saas.mbg.mapper" targetProject="src/main/java"/>

1. targetProject 为相对路径
2. 路径为 '/' 不是 '\'
3. 不用加项目名
```