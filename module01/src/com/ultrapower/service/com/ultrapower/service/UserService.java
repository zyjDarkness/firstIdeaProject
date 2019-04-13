package com.ultrapower.service.com.ultrapower.service;

/**
 * @auther zhangYunjiao
 * @date 2019/4/12 - 20:53
 */
public interface UserService {
    /**
     * 获取用户信息
     * @return
     */
    public int getUserInfo();

    /**
     * 根据Id获取用户信息
     * @param id
     * @return
     */
    public int getUserInfoById(int id);
}
