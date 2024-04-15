package com.alpaca.ARCRacing;

// DB 생성 테스트
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<Temp,Long> {
}
