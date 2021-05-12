package hrms.javacamp6thday3thhomework.dataAccess.abstracts;

import hrms.javacamp6thday3thhomework.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobDao extends JpaRepository<Job,Integer>
{
}
