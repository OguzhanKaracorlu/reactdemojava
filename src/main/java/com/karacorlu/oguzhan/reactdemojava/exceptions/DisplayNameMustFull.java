package com.karacorlu.oguzhan.reactdemojava.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author oguzhan.karacorlu on 12.04.2023
 * @project reactdemojava
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DisplayNameMustFull extends RuntimeException {
 public DisplayNameMustFull(){super("Displayname must be full");}
}
