package com.ming.projectboard.repository.querydsl;

import java.util.List;

public interface ArticleRepositoryCustom {
    // 도메인이 아니라서 Query DSL 을 이용하려고 하는거임
    List<String> findAllDistinctHashtags();
}