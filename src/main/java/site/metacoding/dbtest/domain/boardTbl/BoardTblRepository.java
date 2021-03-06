package site.metacoding.dbtest.domain.boardTbl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardTblRepository extends JpaRepository<boardTbl, Integer> {

    @Query(value = "SELECT * FROM boardtbl WHERE title LIKE %:keyword%", nativeQuery = true)
    List<boardTbl> mSearch(@Param("keyword") String keyword);
}
