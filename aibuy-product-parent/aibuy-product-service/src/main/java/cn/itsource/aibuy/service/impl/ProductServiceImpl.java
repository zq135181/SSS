package cn.itsource.aibuy.service.impl;

import cn.itsource.aibuy.domain.Product;
import cn.itsource.aibuy.mapper.ProductMapper;
import cn.itsource.aibuy.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author breeze
 * @since 2019-07-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
