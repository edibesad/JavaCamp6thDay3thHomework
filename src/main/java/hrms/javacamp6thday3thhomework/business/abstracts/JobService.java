package hrms.javacamp6thday3thhomework.business.abstracts;

import hrms.javacamp6thday3thhomework.entities.concretes.Job;

import java.util.List;

public interface JobService
{
    List<Job> getAll();
}
