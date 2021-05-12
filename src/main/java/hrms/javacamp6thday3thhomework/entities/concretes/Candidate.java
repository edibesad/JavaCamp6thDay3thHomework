package hrms.javacamp6thday3thhomework.entities.concretes;

import lombok.Data;
import org.apache.tomcat.jni.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "candidates")
@Data
public class Candidate
{
    @Id
    @GeneratedValue
    @Column(name = "candidates_id")
    private int candidateId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_identity")
    private String nationalIdentity;

    @Column(name = "birtgdate")
    private Date birthDate;

}
