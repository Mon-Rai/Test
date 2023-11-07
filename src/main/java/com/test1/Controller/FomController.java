package com.test1.Controller;

import com.test1.Payload.FomDto;
import com.test1.Service.FomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@CrossOrigin(origins = "http://localhost")
@RestController
@RequestMapping("/api/fom")
public class FomController {

    private FomService fomService;

    public FomController(FomService fomService) {
        this.fomService = fomService;
    }

    //Open Index page
//    @GetMapping("/index")
//    public String homePage(){
//        return "index";
//    }
//
//
//    @ModelAttribute("fomDto")
//    public FomDto getFomDto() {
//        return new FomDto();
//    }
//
//
//    //Open form page
//    @GetMapping("/form")
//    public String bookTicket(){
//        return "form";
//    }

    @PostMapping("/po")
    public ResponseEntity<?> saveFom(@RequestBody FomDto fomDto) {
        FomDto fomDto1 = fomService.enterData(fomDto);
        return new ResponseEntity<>(fomDto1, HttpStatus.CREATED);
    }

}
