package com.ssm.base.service;

import com.ssm.base.model.BasePermission;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBasePermissionService {
    int deleteByPrimaryKey(String id);

    int insert(BasePermission record);

    int insertSelective(BasePermission record);

    BasePermission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BasePermission record);

    int updateByPrimaryKey(BasePermission record);

    List<BasePermission> selectAllPermissions();

}
