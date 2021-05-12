package hrms.javacamp6thday3thhomework.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class Users
{
    @Id
    @GeneratedValue()
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "email_verify")
    private boolean emailVerify;
}
