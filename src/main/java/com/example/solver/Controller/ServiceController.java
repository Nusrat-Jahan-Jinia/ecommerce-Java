package com.example.solver.Controller;

import com.example.solver.Entity.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ServiceController {

    @RequestMapping("/services")
    public List<Service> getAllServices(){
        return Arrays.asList(
            new Service("Spring","Spring Framework","Spring Framework description"),
                new Service("Spring","Spring Framework","description"),
                new Service("Spring","Spring Framework","description")
        );
    }
}
