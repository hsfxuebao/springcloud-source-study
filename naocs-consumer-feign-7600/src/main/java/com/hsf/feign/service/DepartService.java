package com.hsf.feign.service;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.hsf.feign.bean.Depart;

// 1)Feign接口名无需与业务接口名称相同，叫什么都可以，
// 但一般起名与业务接口名相同，好用
// 2)方法签名要与业务接口的相同，但具体的方法名称不一定
// 非要与业务方法名称相同，叫什么都可以。
// 但一般起名与业务方法名相同，好用
// 3)必须要有@FeignClient注解
@FeignClient(value = "nacos-provider-depart")
@RequestMapping("/provider/depart")
public interface DepartService {

    @PostMapping("/save")
    boolean saveDepart(@RequestBody Depart depart);

    @DeleteMapping("/del/{id}")
    boolean removeDepartById(@PathVariable("id") int id);

    @PutMapping("/update")
    boolean modifyDepart(@RequestBody Depart depart);

    @GetMapping("/get/{id}")
    Depart getDepartById(@PathVariable("id") int id);

    @GetMapping("/list")
    List<Depart> listAllDeparts();
}
