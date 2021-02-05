package com.quiz.quizapp.repository;

import com.quiz.quizapp.api.Profile;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProfileRepository extends PagingAndSortingRepository <Profile, String> {

}
