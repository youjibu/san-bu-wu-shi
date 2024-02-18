package com.sky.mapper;

import com.sky.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface ProductMapper {

    /**
     * 根据主键查询商品
     *
     * @param id
     * @return
     */
    @Select("select * from product where id = #{id}")
    Product getById(Long id);


    /**
     * 动态条件查询商品
     *
     * @param product
     * @return
     */
    List<Product> list(Product product);

    /**
     * 动态搜索查询商品
     *
     * @param productName
     * @return
     */
    List<Product> search(String productName);
}
