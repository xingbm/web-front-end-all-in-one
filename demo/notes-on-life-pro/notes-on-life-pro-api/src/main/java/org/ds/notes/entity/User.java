package org.ds.notes.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.StringJoiner;

/**
 * Created by xingbm on 2021/1/10 18:04
 */
@Entity
@Table(name = "automated_testing_demo_user", schema = "python_all_in_one")
public class User implements Serializable {

    private static final long serialVersionUID = 389736262518186967L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_age")
    private Integer userAge;

    @Column(name = "user_address")
    private String userAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("userName='" + userName + "'")
                .add("userAge=" + userAge)
                .add("userAddress='" + userAddress + "'")
                .toString();
    }

}
