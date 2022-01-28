package com.lukeware.presenters;

/**
 * @author Diego Morais
 */
public final class CustomerPresenterException extends RuntimeException {
  public CustomerPresenterException(String error) {
    super(error);
  }
}