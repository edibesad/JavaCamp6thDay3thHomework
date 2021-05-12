package hrms.javacamp6thday3thhomework.api.controller;

import hrms.javacamp6thday3thhomework.business.abstracts.JobService;
import hrms.javacamp6thday3thhomework.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/jobs")
public class JobController
{
    private JobService jobService;

    @Autowired
    public JobController(JobService jobService)
    {
        super();
        this.jobService = jobService;
    }

    @RequestMapping(value = "/getAll")
    public List<Job> getAll(){return this.jobService.getAll();}
}
