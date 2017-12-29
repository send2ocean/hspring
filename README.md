# hspring
a project ...nothing.ha 


#  Application Property Files

SpringApplication loads properties from application.properties files in the following locations and adds them to the Spring Environment:

1. A /config subdirectory of the current directory.
2. The current directory
3. A classpath /config package
4. The classpath root

The list is ordered by precedence (properties defined in locations higher in the list override those defined in lower locations).

该列表是按优先级排序的（列表中较高位置定义的属性覆盖在较低位置定义的属性）。

也可以使用YAML，也就是.yml文件替换.properties文件，感觉.yml更优雅一些 嘿嘿。

如果你不想使用``application.properties``作为配置文件，可以通过配置``spring.config.name``属性，用你自己喜欢的文件，比如下面的
> $ java -jar myproject.jar --spring.config.name=myproject

还可以通过``spring.config.location``指定配置文件的位置，例如
> $ java -jar myproject.jar --spring.config.location=classpath:/default.properties,classpath:/override.properties

这两个属性配置都是最先加载的，所以一定要在程序开始的地方，如命令行 环境变量等地方配置

如果``spring.config.location``包含目录，要已/结尾，并且在运行时、加载之前 be appended with the names generated from ``spring.config.name ``

``spring.config.addition-location`` 这个和``spring.config.location``的功能差不多，只是前置是附加在默认配置文件加载顺序上，后者完全不考虑默认的加载顺序，关于加载顺序的资料  点这里 
[详细资料链接](https://docs.spring.io/spring-boot/docs/2.0.0.M7/reference/htmlsingle/#boot-features-external-config-application-property-files)
