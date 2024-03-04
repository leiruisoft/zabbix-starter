package com.lrsoft.starter.zabbix.domain.user;


import com.lrsoft.starter.zabbix.core.ZabbixRequest;
import com.lrsoft.starter.zabbix.domain.base.User;

public class UserLoginRequest extends ZabbixRequest {
    public UserLoginRequest() {
        super("user.login");
    }

    private UserLoginParamsParams params = new UserLoginParamsParams();

    public void setParams(UserLoginParamsParams params) {
        this.params = params;
    }

    public UserLoginParamsParams getParams() {
        return params;
    }

    public static class UserLoginParamsParams extends User {
        private String password;
        private String user;
        private Boolean userData;

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setUserData(Boolean userData) {
            this.userData = userData;
        }

        public Boolean getUserData() {
            return userData;
        }
    }
}
