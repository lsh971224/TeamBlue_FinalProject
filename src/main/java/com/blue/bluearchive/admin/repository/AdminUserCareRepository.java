package com.blue.bluearchive.admin.repository;

import com.blue.bluearchive.admin.dto.AdminUserCareDto;
import com.blue.bluearchive.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface AdminUserCareRepository extends JpaRepository<Member,Long>, QuerydslPredicateExecutor<Member>,
        AdminUserCareAdminUserCareRepositoryCustom {

    List<Member> findByIdx(Long idx);

}
