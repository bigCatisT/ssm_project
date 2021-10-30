package com.ssm.base.service.impl;

import com.ssm.base.mapper.BasePermissionMapper;
import com.ssm.base.model.BasePermission;
import com.ssm.base.service.IBasePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasePermissionServiceImpl implements IBasePermissionService {

    @Autowired
    private BasePermissionMapper basePermissionMapper;


    @Override
    public int deleteByPrimaryKey(String id) {
        return basePermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BasePermission record) {
        return basePermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(BasePermission record) {
        return basePermissionMapper.insertSelective(record);
    }

    @Override
    public BasePermission selectByPrimaryKey(String id) {
        return basePermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BasePermission record) {
        return basePermissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BasePermission record) {
        return basePermissionMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<BasePermission> selectAllPermissions() {
        return basePermissionMapper.selectAllPermissions();
    }
}
