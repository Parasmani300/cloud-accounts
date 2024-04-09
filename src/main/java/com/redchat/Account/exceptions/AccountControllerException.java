package com.redchat.Account.exceptions;

import com.redchat.Account.controller.UserNotFoundException;
import com.redchat.Account.dto.ExceptionMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AccountControllerException {

//    @ExceptionHandler(UserNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public ResponseEntity<ExceptionMessage> resolveUserNotFound(UserNotFoundException ex)
//    {
//        ExceptionMessage exceptionMessage = new ExceptionMessage(ex.getMessage(),400);
//        return new ResponseEntity<>(exceptionMessage,HttpStatus.NOT_FOUND);
//    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ExceptionMessage> commonException(Exception ex)
    {
        ExceptionMessage exceptionMessage = new ExceptionMessage(ex.getMessage(),400);
        return new ResponseEntity<>(exceptionMessage,HttpStatus.NOT_FOUND);
    }
}
