# spring_boot_demo

从打开IDE开始算，构建一个maven的web项目需要多久？
上面这个概念太模糊了，再详细一点，从打开IDE开始算，利用maven，构建一个springmvc的项目，不需要连接数据库，
只需要简单的返回helloword需要多久？
半个小时？
新建项目，书写pom，配置springmvc.xml，配置spring.xml，配置web.xml   新建一个.java文件，return "hello word"，配置tomcat，启动tomcat。


以上是正常流程
麻不麻烦，累不累，

如果告诉你有一种5分钟就可以完事的框架你学不学？


如果再告诉你这项技术就是spring的东西呢？这项技术不是最新的技术，但是绝对是比springmvc要新的技术，这样技术已经流行很久了，你学不学？？？
想学？  
看看下面！！

## step1:pom文件中首先引入各种jar包
## step2:src/main/java目录下新建Application类
## step3:src/main/java目录下新建UserController类
## step4:在resources目录下新建templates目录在此之下再新建userView目录userView下新建hello.html
## step5:src/main/java/com/wpspace目录下新建HelloController类
## step6:在resources目录下新建static目录，static目录下新建js和css目录，再之后可以分模块创建
## step7:运行Application中的main函数
## step8:在浏览器中输入localhost:8080/users/wp
## step9:http://localhost:8080/hello/wp
## step10:最基本的springboot搭建完毕
