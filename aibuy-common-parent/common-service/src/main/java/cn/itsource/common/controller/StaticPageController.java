package cn.itsource.common.controller;

import cn.itsource.basic.util.AjaxResult;
import cn.itsource.basic.util.VelocityUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StaticPageController {
    public AjaxResult genStaticPage(@RequestBody Map<String , Object> map ){
        /**
         * 页面静态化
         * @param map model数据 templatePath模板路径 targetPath目标文件路径
         * @return 结果
         */
        Object model = map.get("model");
        String templatePath = (String) map.get("templatePath");
        String targetPath = (String) map.get("targetPath");

        try {
            VelocityUtils.staticByTemplate(model,templatePath,targetPath);
            return AjaxResult.me().setSuccess(true).setMessage("成功");
        } catch (Exception e) {

            e.printStackTrace();
            return AjaxResult.me().setMessage("系统异常:"+e.getMessage()).setSuccess(false);
        }
    }
}
