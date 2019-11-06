package com.nespot2.springrestsample.member.repository;

import com.nespot2.springrestsample.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
