package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.Award;
import org.example.infrastructure.persistent.po.StrategyAward;

import java.util.List;

//奖品表DAO
@Mapper
public interface IAwardDao {
    List<Award> queryAwardList();

}
