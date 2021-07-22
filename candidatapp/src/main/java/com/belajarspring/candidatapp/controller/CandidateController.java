package com.belajarspring.candidatapp.controller;

import com.belajarspring.candidatapp.dao.CandidateDao;
import com.belajarspring.candidatapp.entity.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    @Autowired
    private CandidateDao candidateDao;

    @RequestMapping(method = RequestMethod.POST)
    public Candidate insert(@RequestBody Candidate candidate){
        return candidateDao.insert(candidate);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Candidate> findAll(){
        return candidateDao.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable Long id){
        return candidateDao.delete(id);
    }
}
