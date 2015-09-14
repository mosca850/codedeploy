package cart;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/create_cart")
    public Cart greeting(@RequestParam(value="customer", defaultValue="null") String customer) {
        return new Cart(counter.incrementAndGet(),customer);
    }
}
