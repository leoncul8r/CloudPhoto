package com.photo.photo.repository;

import com.photo.photo.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Integer>
{
    List<Tag> findByUserId (String userId);
    List<Tag> findByUserIdAndFirstRoot (String userId, String firstRoot);
    List<Tag> findByUserIdAndFirstRootAndSecondRoot (String userId, String firstRoot, String  secondRoot);
    List<Tag> findByUserIdAndFirstRootAndSecondRootAndKeyword (String userId, String firstRoot, String  secondRoot, String keyword);
}