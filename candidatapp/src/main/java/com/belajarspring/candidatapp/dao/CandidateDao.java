package com.belajarspring.candidatapp.dao;

//ini adalah class class bisnis proses

import com.belajarspring.candidatapp.entity.Candidate;
import com.belajarspring.candidatapp.repo.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("candidateDao")
@Transactional
public class CandidateDao {

    @Autowired
    private CandidateRepo repo;

    public Candidate insert(Candidate candidate){
        return repo.save(candidate);
    }

    public List<Candidate> findAll(){
        return repo.findAllCandidate();
    }

    public  List<Candidate> findByName(String name){
        return repo.findByName(name);
    }

    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
}
