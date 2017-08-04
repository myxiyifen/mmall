package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

public interface IUserService {
     ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);
    ServerResponse<String> checkVaild(String str, String type);
    ServerResponse<String> checkAnswer(String username, String question, String answer);
    ServerResponse<String> selectQuestion(String username);
    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);
    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);
    ServerResponse<User> updateInformation(User user);
    ServerResponse checkAdminRole(User user);
    ServerResponse getInformation(Integer userId);
}
