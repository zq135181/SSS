package cn.itsource.aibuy.service;

import cn.itsource.aibuy.domain.ProductType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author breeze
 * @since 2019-07-31
 */
public interface IProductTypeService extends IService<ProductType> {

    List<ProductType> loadTree();

}
