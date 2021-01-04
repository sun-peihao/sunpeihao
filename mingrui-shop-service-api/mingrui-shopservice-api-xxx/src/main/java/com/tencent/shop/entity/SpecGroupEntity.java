package com.tencent.shop.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName SpecGroupEntity
 * @Description: TODO
 * @Author sunpeihao
 * @Date 2021/1/4
 * @Version V1.0
 **/
@Table(name = "tb_spec_group")
@Data
public class SpecGroupEntity {

    @Id
    private Integer id;

    private Integer cid;

    private String name;

}
