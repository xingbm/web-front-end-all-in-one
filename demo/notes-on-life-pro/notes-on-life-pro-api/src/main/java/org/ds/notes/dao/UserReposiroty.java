package org.ds.notes.dao;

import org.ds.notes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by xingbm on 2021/1/2 15:42
 */
public interface UserReposiroty extends JpaSpecificationExecutor<User>, JpaRepository<User, Long> {
}
