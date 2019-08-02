package cn.itsource.common.controller;

import cn.itsource.basic.util.AjaxResult;
import cn.itsource.basic.util.RedisUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    //缓存数据
    @PostMapping("/redis")
    public AjaxResult set(String key,String value){
        try {
            RedisUtils.INSTANCE.set(key, value);
            return AjaxResult.me().setSuccess(true).setMessage("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("保存失败："+e.getMessage()).setSuccess(false);
        }
    }

    //取缓存数据
    @GetMapping("/redis")
    public AjaxResult get(String key){
        try {
            RedisUtils.INSTANCE.get(key);
            return AjaxResult.me().setSuccess(true).setMessage("获取成功");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("获取失败"+e.getMessage());

        }

    }
}
