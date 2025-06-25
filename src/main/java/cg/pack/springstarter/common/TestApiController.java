package cg.pack.springstarter.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

    @GetMapping("/")
    public ResponseEntity<String> main() {
        return new ResponseEntity<>("통신 성공입니다.", HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("통신 성공입니다.", HttpStatus.OK);
    }

    @GetMapping("/test/{str}")
    public ResponseEntity<String> test(@PathVariable String str) {
        return new ResponseEntity<>("통신 성공입니다: "+str, HttpStatus.OK);
    }
}
