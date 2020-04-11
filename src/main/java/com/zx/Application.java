package com.zx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

/**主程序
 * SpringApplication 则是用于从main方法启动Spring应用的类。
 * 它会执行以下步骤：
 * 1.创建一个合适的ApplicationContext实例 （取决于classpath）。
 * 2.注册一个CommandLinePropertySource，以便将命令行参数作为Spring properties。
 * 3.刷新application context，加载所有单例beans。
 * 4.激活所有CommandLineRunner beans。
 * 直接使用main启动该类，SpringBoot便自动化配置了。
 * SpringBootApplication：开启组件扫描和自动配置。
 * MapperScan: mapper 接口类扫描包配置
 */
@SpringBootApplication
@MapperScan("com.zx.dao")
public class Application {
public static void main(String[] args){
    //启动嵌入式Tomcat并初始化Spring环境及其Spring组件
    String version = SpringVersion.getVersion();
    String version1 = SpringBootVersion.getVersion();
    System.out.println(version+"  "+version1);
    SpringApplication.run(Application.class,args);
    System.out.println("程序正在运行。。");
}
}
