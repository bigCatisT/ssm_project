package com.ssm.utils;


import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class MyRealm extends AuthorizingRealm {

    @Autowired
//    private IUserService userService;

//    @Override
//    public void setName(String name) {
//        super.setName("MyRealm");
//    }

//    @Override
//    public boolean supports(AuthenticationToken token) {
//        return token instanceof UsernamePasswordToken;
//    }

    //提供用户的授权信息
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取用户名
        String username = principals.getPrimaryPrincipal().toString();

        //根据用户名查询用户的角色
//        Set<String> roles = userService.findRoles(username);

        //过呢据用户名查询用户的权限
//        Set<String> permissions = userService.findPermissions(username);


        SimpleAuthorizationInfo authorizationInfo
                =new SimpleAuthorizationInfo();

        //设置角色
//        authorizationInfo.setRoles(roles);

        //设置权限
//        authorizationInfo.setStringPermissions(permissions);


        return authorizationInfo;
    }

    //安全数据库中提供的认证信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取用户输入的用户名
        String username = token.getPrincipal().toString();
        //获取用户输入的密码
        String password = token.getCredentials().toString();
        System.out.println(username+"  "+password);

        //从数据库查询该用户的信息
//        User u = userService.login(username);

//        if(null==u){//如果u为null，表示数据库没用相关信息
//            throw new RuntimeException("账号不存在");
//        }

        SimpleAuthenticationInfo simpleAuthenticationInfo=
                new SimpleAuthenticationInfo(
//                        u.getUsername(),
//                        u.getPassword(),
//                        ByteSource.Util.bytes(u.getSalt()),
//                        this.getName()
                );
        return simpleAuthenticationInfo;
    }
}
