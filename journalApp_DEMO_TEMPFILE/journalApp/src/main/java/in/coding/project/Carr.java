package in.coding.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@GetMapping('/car')
//public class Carr {
//}


// here this car class is depended on dog class and we have injected dog in car class
// this is called dependency injection
// not just depended on class it can be anything else

//@RestController is also a @Componend but also something else
@RestController
public class Carr {

    // this autowired helps to skip object creation part and automate process

//    @Autowired
//    private Dog dog;

    // or we can do this also

    private Dog dog = new Dog();      // without @autowired both does same thing

    @GetMapping("Carr")
    public String ok() {
        return Dog.fun();
    }
}