package cn.itsource.aibuy.service;

import cn.itsource.aibuy.domain.Brand;
import cn.itsource.aibuy.query.BrandQuery;
import cn.itsource.basic.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author breeze
 * @since 2019-07-31
 */
public interface IBrandService extends IService<Brand> {

    PageList<Brand> queryPage(BrandQuery query);

}
