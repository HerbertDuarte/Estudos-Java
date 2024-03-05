package app.vercel.herbertduarte.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

 private static final String template = "Hello, %s!";
 /*
  * atomic long => um armazenamento atomico, aqui é usado para armazenar o id e
  * em seguida é usado para incrementar o id para que nos próximos registros
  * sempre seja um id diferente do que já foi registrado
  */
 private final AtomicLong counter = new AtomicLong();

 @GetMapping("/greeting")
 public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name ) {
  return new Greeting(counter.incrementAndGet(), String.format(template, name));
 }

}
