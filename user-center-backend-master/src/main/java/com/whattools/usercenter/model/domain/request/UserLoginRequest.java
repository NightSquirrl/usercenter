package com.whattools.usercenter.model.domain.request;

// [编程学习交流圈](https://www.code-nav.cn/) 快速入门编程不走弯路！30+ 原创学习路线和专栏、500+ 编程学习指南、1000+ 编程精华文章、20T+ 编程资源汇总

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author  <a href="https://soft-vault.com/">wahttools</a>
 *  
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 用户账号
     */
    @ApiModelProperty(value = "用户名",required = true,example = "admin")
    private String userAccount;

    /**
     * 用户密码
     */
    @ApiModelProperty(value = "密码",required = true,example = "12345678")
    private String userPassword;

}
