package hrms.javacamp6thday3thhomework.business.concretes;

import hrms.javacamp6thday3thhomework.business.abstracts.JobService;
import hrms.javacamp6thday3thhomework.dataAccess.abstracts.JobDao;
import hrms.javacamp6thday3thhomework.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService
{
    private JobDao jobDao;

    @Autowired

    public JobManager(JobDao jobDao)
    {
        super();
        this.jobDao = jobDao;
    }
    public JobManager(){}

    @Override
    public List<Job> getAll()
    {
        return this.jobDao.findAll();
    }
}
