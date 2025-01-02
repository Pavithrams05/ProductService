package com.scaler.ProductService.InheritanceDemo.JoinedTable;

import jakarta.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "jt_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String email;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    /*
    required for joined table
    @Inheritance(strategy = InheritanceType.JOINED)
    @Entity(name = "jt_user")
    @PrimaryKeyJoinColumn(name = "user_id") //gives two columns of id one is from user
    and other as user_id as mentioned in annotation

     */
}
