package tycontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
public class MyController {
    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String about(Model model){
        System.out.println("inside about handler");
        model.addAttribute("name","Anupam Sharma");
        model.addAttribute("currentDate",new Date().toLocaleString());

        return "about";
        //about.html
    }

    @GetMapping("/example-loop")
    public String iterateHandler(Model m){
        List<String> name=List.of("Ankit","laxmi","karan","John");
//        System.out.println(name);
        m.addAttribute("names",name);
        return "iterate";
    }

    //Handler for conditional Statement


    @GetMapping("/condition")
    public String conditionalHandler(Model m){
        System.out.println("condition is calling ");
        m.addAttribute("isActive",true);
        m.addAttribute("gender","F");

        List<Integer> list = List.of(233);
        m.addAttribute("mylist",list);
        System.out.println("Conditional Handler executed");
        return "condition";
    }

    // handler for including fragments


    @GetMapping("/service")
    public String serviceHandler(Model m){
        m.addAttribute("title","i like to eat samosa");
        m.addAttribute("subtitle", LocalDateTime.now().toString());
        return "service";


    }
     //for new about
     @GetMapping("/aboutneww")
     public String newAboutFunc() {
         System.out.println("About new is calling");
         return "aboutneww";  ///jgjkjhjbhjl
     }
}
