package hello;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sys.entity.Txl;
import com.sys.mapper.TxlInterface;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    private TxlInterface txlInterface;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/test")
    public List<Txl> test(@RequestParam(value="name", defaultValue="World") String name) {
        return  txlInterface.getAll();
    }
    @RequestMapping("/txls")
    public Map txls(@RequestParam(value="name", defaultValue="World") String name) {
    		Map ret = new HashMap();
    		ret.put("data", txlInterface.getAll());
        return  ret;
    }
    
}
