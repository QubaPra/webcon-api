package com.example.webcon_api.repository;

import com.example.webcon_api.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentsRepository extends JpaRepository<Students, com.example.webcon_api.model.StudentsId> {

    @Query(value = "WITH RECURSIVE StudentFinder AS ( " +
                   "    SELECT index, address " +
                   "    FROM students " +
                   "    WHERE address = ?1 " +
                   "    UNION " +
                   "    SELECT o.index, o.address " +
                   "    FROM students o " +
                   "    INNER JOIN StudentFinder po ON o.index = po.index OR o.address = po.address " +
                   ") " +
                   "SELECT DISTINCT address " +
                   "FROM StudentFinder " +
                   "ORDER BY address", nativeQuery = true)
    List<String> findEmailsByAddress(String address);

    @Query(value = "WITH RECURSIVE StudentFinder AS ( " +
                   "    SELECT index, address " +
                   "    FROM students " +
                   "    WHERE index = ?1 " +
                   "    UNION " +
                   "    SELECT o.index, o.address " +
                   "    FROM students o " +
                   "    INNER JOIN StudentFinder po ON o.index = po.index OR o.address = po.address " +
                   ") " +
                   "SELECT DISTINCT address " +
                   "FROM StudentFinder " +
                   "ORDER BY address", nativeQuery = true)
    List<String> findEmailsByIndex(String index);
}
