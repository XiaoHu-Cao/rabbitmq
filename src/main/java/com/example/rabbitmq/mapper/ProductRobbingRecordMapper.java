package com.example.rabbitmq.mapper;


import com.example.rabbitmq.entity.ProductRobbingRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductRobbingRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductRobbingRecord record);

    int insertSelective(ProductRobbingRecord record);

    ProductRobbingRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductRobbingRecord record);

    int updateByPrimaryKey(ProductRobbingRecord record);
}