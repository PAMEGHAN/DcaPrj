package com.cg.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.cg.exception.FeedNotFoundException;

	@ControllerAdvice
	public class UserExceptionController {

		@ExceptionHandler(value=FeedNotFoundException.class)
		public ResponseEntity<Object> developerCodeExceptionHandler(Exception ex){
		
			return new ResponseEntity("User Not Found",HttpStatus.NOT_FOUND);
		}
		
		
	}
