import main.java.com.example.demo.Exception.NotFoundException;

public class EmployeeController {
    






















    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handle(NotFoundException e){
        return new ResponseEntity<String>("Not found" +e.getMessage(),HttpStatus.NOT_FOUND);
    }
}
