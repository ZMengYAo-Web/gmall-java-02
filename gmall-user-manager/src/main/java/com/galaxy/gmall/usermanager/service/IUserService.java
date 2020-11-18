package com.galaxy.gmall.usermanager.service;

import com.galaxy.gmall.usermanager.bean.UserInfo;

import java.util.List;

public interface IUserService {

    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(UserInfo userInfo);
}
