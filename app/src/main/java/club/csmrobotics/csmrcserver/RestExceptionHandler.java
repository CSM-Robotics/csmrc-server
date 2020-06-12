package club.csmrobotics.csmrcserver;


import club.csmrobotics.csmrcserver.wss.data.PackageNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;
import static org.springframework.http.ResponseEntity.*;

@RestControllerAdvice
@Slf4j
public class RestExceptionHandler {

    @ExceptionHandler(value = {PackageNotFoundException.class})
    public ResponseEntity<?> vehicleNotFound(PackageNotFoundException ex, WebRequest request) {
        return notFound().build();
    }

//    @ExceptionHandler(value = {InvalidJwtAuthenticationException.class})
//    public ResponseEntity<?> invalidJwtAuthentication(InvalidJwtAuthenticationException ex, WebRequest request) {
//        log.debug("handling InvalidJwtAuthenticationException from" + request.toString() + "\n with exception: " + ex.getMessage());
//        return status(UNAUTHORIZED).build();
//    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<?> vehicleNotFound(Exception ex, WebRequest request) {
        System.out.println(ex.getMessage());
        return badRequest().body("errer");
    }
}