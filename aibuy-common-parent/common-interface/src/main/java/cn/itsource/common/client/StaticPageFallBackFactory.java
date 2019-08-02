package cn.itsource.common.client;

import cn.itsource.basic.util.AjaxResult;
import feign.hystrix.FallbackFactory;

import java.util.Map;

public class StaticPageFallBackFactory implements FallbackFactory<StaticPageClient> {

    @Override
    public StaticPageClient create(Throwable throwable) {
        return new StaticPageClient() {
            @Override
            public AjaxResult genStaticPage(Map<String, Object> map) {
                return AjaxResult.me().setMessage("系统异常").setSuccess(false);
            }
        };
    }
}
