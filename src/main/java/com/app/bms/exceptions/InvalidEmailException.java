package com.app.bms.exceptions;

/**
 * @author t0k02w6 on 27/01/23
 * @project bookmyshow-scalar
 */
public class InvalidEmailException extends RuntimeException{
  public InvalidEmailException(String message) {
    super(message);
  }
}
