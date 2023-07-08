package Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
	
	@ExceptionHandler(value=BrandNotFound.class)
	public ResponseEntity<Object> brandNotFoundHandling(BrandNotFound ne){
		return new ResponseEntity<>(ne.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=ColourNotFound.class)
	public ResponseEntity<Object> colourNotFound(ColourNotFound ae){
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	}

