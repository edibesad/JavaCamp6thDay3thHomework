package hrms.javacamp6thday3thhomework.entities.concretes;

import lombok.Data;
import org.apache.tomcat.jni.User;

import javax.persistence.*;

@Entity
@Table(name = "employers")
@Data
public class Employer
{
    @Id
    @GeneratedValue
    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website")
    private String website;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "admin_verify")
    private boolean adminVerify;

}
