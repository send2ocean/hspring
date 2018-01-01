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

#Log Format

默认只在控制台输出日志信息
输出的默认格式为
- Date and Time — Millisecond precision and easily sortable.
- Log Level — ERROR, WARN, INFO, DEBUG, or TRACE.
- Process ID.
- A --- separator to distinguish the start of actual log messages.
- Thread name — Enclosed in square brackets (may be truncated for console output).
- Logger name — This is usually the source class name (often abbreviated).
The log message.

开启调试信息输出，可以在命令行执行增加``--debug``参数;
You can also specify ``debug=true ``in your ``application.properties``.

可以配置输出颜色。这个。。默认就好吧 

## 日志文件配置
- 默认文件10M大小，滚动记录，
- logging.file 不用说了吧，可以是绝对或相对位置或名称
- logging.path 同上
- logging.file.max-size 文件大小
- logging.file.max-history 文件历史，不配置永久保留之前的日志文件
## Log Levels
这个直接粘贴原文吧

All the supported logging systems can have the logger levels set in the Spring Environment (for example, in application.properties) by using ‘logging.level.*=LEVEL’ where ‘LEVEL’ is one of TRACE, DEBUG, INFO, WARN, ERROR, FATAL, or OFF. The root logger can be configured by using logging.level.root. The following example shows potential logging settings in application.properties:
```
logging.level.root=WARN
logging.level.org.springframework.web=DEBUG
logging.level.org.hibernate=ERROR
```

支持配置其他的日志记录系统

# Customizing the Banner

The banner that is printed on start up can be changed by adding a banner.txt file to your classpath or by setting the banner.location property to the location of such a file. If the file has an encoding other than UTF-8, you can set banner.charset. In addition to a text file, you can also add a banner.gif, banner.jpg, or banner.png image file to your classpath or set the banner.image.location property. Images are converted into an ASCII art representation and printed above any text banner.
