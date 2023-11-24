package com.mavndemo.quizapp.controller;

import com.mavndemo.quizapp.model.Question;
import com.mavndemo.quizapp.service.questionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("question")
@RestController
public class QuestionController
{
   @Autowired
   questionService questionservice;


   // get questions by category

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category)
    {
        return questionservice.getQuestionsByCategory(category);
    }


    // add
 @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question)
    {
       return  questionservice.addQuestion(question);

    }

   // get all questions
    @GetMapping("allQuestions")
public ResponseEntity<List<Question>> getAllQuestions()
{

    return questionservice.getAllQuestions();
}



}
