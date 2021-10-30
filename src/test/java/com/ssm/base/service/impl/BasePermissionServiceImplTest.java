package com.ssm.base.service.impl;

import com.ssm.base.model.BasePermission;
import com.ssm.base.service.IBasePermissionService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class BasePermissionServiceImplTest extends BaseTestCase{


    @Autowired
    private IBasePermissionService basePermissionService;

    @Test
    public void selectAllPermissions() {
        List<BasePermission> basePermissions = basePermissionService.selectAllPermissions();
        for (BasePermission basePermission : basePermissions) {
            System.out.println(basePermission);
        }
    }
}