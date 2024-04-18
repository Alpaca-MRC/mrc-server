package com.alpaca.mrc.domain.member.repository;

import com.alpaca.mrc.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MemberRepository extends JpaRepository<Member, Long> {
}
