package com.zua.howzhi.service;

import com.zua.howzhi.model.User;


/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-01 12:39
 */

public interface UserService {

    boolean isExist(String username);

    User getByName(String username);

    User geById(Integer id);

    void add(User user);

}
