package com.belajarspring.candidatapp.repo;
// repository ini adalah berfungsi untuk memanipulasi data dari database


import com.belajarspring.candidatapp.entity.Candidate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

//fungsi2 dasar untuk memanipulasi data sudah tersedia hanya dengan melakukan proses extends CrudRepository
public interface CandidateRepo extends CrudRepository<Candidate, Long> {
    //list ini untuk menampilkan semua candidate
    @Query("SELECT c FROM Candidate c")
    List<Candidate> findAllCandidate();
    @Query("SELECT c FROM Candidate c WHERE LOWER(c.fullname) LIKE LOWER(:name)")
    List<Candidate> findByName(@Param("name") String name);

    void delete(Long id);
}
