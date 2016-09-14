package entity;

import javax.persistence.*;

/**
 * Created by 四个石头 on 2016/9/14.
 */
@Entity
@Table(name="system_user")
public class sysUser {
    private int id;
    private double account;
    private double password;

    public sysUser(int id, double account, double password) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true,nullable = false)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "account",length = 100)
    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
    @Column(name = "password",length = 100)
    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }
}
