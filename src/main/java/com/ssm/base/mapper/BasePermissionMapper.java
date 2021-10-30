package com.ssm.base.mapper;

import com.ssm.base.model.BasePermission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasePermissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(BasePermission record);

    int insertSelective(BasePermission record);

    BasePermission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BasePermission record);

    int updateByPrimaryKey(BasePermission record);

    List<BasePermission> selectAllPermissions();
}