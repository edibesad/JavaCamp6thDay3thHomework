package hrms.javacamp6thday3thhomework.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "job_position")
@Data
public class Job
{
    @Id
    @GeneratedValue
    @Column(name = "job_id")
    private int jobId;
    @Column(name = "job_title")
    private String jobTitle;
}
