package com.apress.springpersistence.service;

import com.apress.springpersistence.domain.Member;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
}
