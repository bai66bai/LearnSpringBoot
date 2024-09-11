package com.yang.boot.config;


import com.yang.boot.bean.Pet;
import com.yang.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 1.配置类里面使用@Bean标注方法上给容器注册组件，默认也是单实例的
 * 2.配置类本身也是一个组件
 * 3.proxyBeanMethods: 代理bean的方法
 * Full(proxyBeanMethods = true)
 * Lite(proxyBeanMethods = false)
 */
@Configuration(proxyBeanMethods = true) //告诉springboot这是一个配置类 == 配置文件
public class MyConfig {


    /**
     * 外部无论对配置类中的这个组件注册的方法调用多少次获取的都是之前注册容器中的单实例对象
     * @return
     */
    @Bean //给容器添加组件。以方法名作为组件的id，返回类型就是组件类型。返回的值就是组件在容器中的实例。
    public User user01(){
        return new User("张三",18);
    }

    @Bean("tom")
    public Pet tomcatPet(){

        return new Pet("tomcat");
    }

}
