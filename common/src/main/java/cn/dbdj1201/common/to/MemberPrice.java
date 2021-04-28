package cn.dbdj1201.common.to;


import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yz1201
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}