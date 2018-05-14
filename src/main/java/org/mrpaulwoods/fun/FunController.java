package org.mrpaulwoods.fun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

    @GetMapping
    String index() {
        return "having fun yet?";
    }

}
