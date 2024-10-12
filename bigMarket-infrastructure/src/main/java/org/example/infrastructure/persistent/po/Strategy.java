package org.example.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;
@Data
//抽奖策略
public class Strategy {
    //自增ID
    private Long id;
    //抽奖策略ID
    private Long strategy_id;
    //抽奖策略描述
    private String strategy_desc;
    //创建时间
    private Date create_time;
    //更新时间
    private Date uptate_time;

}
