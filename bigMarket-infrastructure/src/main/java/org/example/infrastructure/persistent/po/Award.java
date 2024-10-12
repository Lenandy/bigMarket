package org.example.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;
//奖品
@Data
public class Award {
    private Long id; // 自增ID
    private Integer awardId; // 抽奖奖品ID - 内部流转使用
    private String awardKey; // 奖品对接标识 - 每一个都是一个对应的发奖策略
    private String awardConfig; // 奖品配置信息
    private String awardDesc; // 奖品内容描述
    private Date createTime; // 创建时间
    private Date updateTime; // 更新时间

}
