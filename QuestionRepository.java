package com.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.quiz.model.Question;



public interface QuestionRepository extends JpaRepository<Question, Long>{

	List<Question> findByDifficultyLevel(String difficultyLevel);
	

    @Query(value = "SELECT q.id FROM Question q where q.title=:title ORDER BY RAND() LIMIT :noOfQuestions", nativeQuery = true)
    List<Long> findRandomQuestionsByCategory(String title, Long noOfQuestions);


	List<Question> findByTitle(String title);


	
	

}
