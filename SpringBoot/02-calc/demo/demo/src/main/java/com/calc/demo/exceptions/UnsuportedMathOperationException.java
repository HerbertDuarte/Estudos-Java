package com.calc.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException  extends RuntimeException{

 private static final long serialVersionUUID = 1L;

 public UnsuportedMathOperationException(String msg){
  super(msg);
 }
 
}

