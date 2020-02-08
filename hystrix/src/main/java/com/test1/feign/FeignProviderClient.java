package com.test1.feign;

import com.test1.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

//声明feign要访问的服务提供者（服务注册的名称provider），
// 访问接口不通的话，就走fallback降级处理，访问自己编写的 FeignError.class（声明式接口的实现类）
@FeignClient(value = "provider")
//声明式接⼝，要调用哪个服务中的方法
public interface FeignProviderClient {

    //通过注解去映射（对应的provider服务）请求。声明接口即可，不用像ribbon一样，还要自己RestTemplate写出完整方法。
    //相当于请求的是 /provider/student/findAll ,provider有2个（2个不同的端口号），feign也有负载均衡功能
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
