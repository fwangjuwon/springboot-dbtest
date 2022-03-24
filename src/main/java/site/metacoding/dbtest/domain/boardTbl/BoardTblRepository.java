package site.metacoding.dbtest.domain.boardTbl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardTblRepository extends JpaRepository<boardTbl, Integer> {

}
