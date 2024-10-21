//package com.redisApplication.RedisApplication.Controller;
//
//import com.redisApplication.RedisApplication.Service.RedisService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/redis")
//public class RedisController {
//
//
//    @Autowired
//    private RedisService redisService;
//
//    @PostMapping("/save")
//    public String saveData(@RequestParam String key, @RequestParam String value) {
//        redisService.saveData(key, value);
//        return "Data saved successfully!";
//    }
//
////    @PostMapping("/save")
////
////    public String saveData(@RequestBody)
//
//    @GetMapping("/get")
//    public String getData(@RequestParam String key) {
//        Object data = redisService.getData(key);
//        return data != null ? data.toString() : "No data found!";
//    }
//}
