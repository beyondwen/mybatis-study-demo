package com.wenhao.mybatisstudydemo.enity;

import lombok.Data;

import java.io.Serializable;


/**
 * @author beyond
 * Create at 2020-03-18 09:31
 */
@Data
public class User implements Serializable {

    private Long id;

    private String username;

    private String password;


}