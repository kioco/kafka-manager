package com.xiaojukeji.kafka.manager.dao;

import com.xiaojukeji.kafka.manager.common.entity.po.RegionDO;

import java.util.List;

public interface RegionDao {
    int insert(RegionDO regionDO);

    int deleteById(Long id);

    int updateById(RegionDO regionDO);

    RegionDO getById(Long id);

    List<RegionDO> getByClusterId(Long clusterId);

    List<RegionDO> listAll();
}