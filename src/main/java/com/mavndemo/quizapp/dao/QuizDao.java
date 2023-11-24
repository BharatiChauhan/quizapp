package com.mavndemo.quizapp.dao;

import com.mavndemo.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer>
{


}
