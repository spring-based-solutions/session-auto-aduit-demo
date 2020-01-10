package com.rjh.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 账户实体
 * @author Null
 * @date 2020-01-10
 */
@Data
@Entity
public class Account implements Serializable {
    /**
     * 自增ID
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    /**
     * 用户名
     */
    @Column(length = 50)
    private String username;

    @Column(length = 50)
    private String password;

    @CreatedDate
    private Date createTime;

    @LastModifiedDate
    private Date updateTime;

}
