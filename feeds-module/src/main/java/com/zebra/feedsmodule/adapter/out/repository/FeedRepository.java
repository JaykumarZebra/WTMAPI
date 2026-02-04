package com.zebra.feedsmodule.adapter.out.repository;

import com.zebra.feedsmodule.adapter.out.entity.FeedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FeedRepository extends JpaRepository<FeedEntity, UUID> {
}
