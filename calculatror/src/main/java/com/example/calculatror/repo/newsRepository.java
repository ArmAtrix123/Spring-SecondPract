package com.example.calculatror.repo;

import com.example.calculatror.model.news;
import org.springframework.data.repository.CrudRepository;

public interface newsRepository extends CrudRepository<news, Long> {
}
