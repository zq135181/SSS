package cn.itsource.common.client;

import cn.itsource.basic.util.AjaxResult;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "COMMON-SERVICE",fallbackFactory = RedisFallBackFactory.class)
public interface RedisClient {

    //缓存数据
    @PostMapping("/redis")
    public AjaxResult set(@RequestParam("key") String key, @RequestParam("value")String value);

    //获取缓存数据
    @GetMapping("/redis")
    public AjaxResult get(@RequestParam("key")String key);
}
