package ch.samt.Customer.controller;

import ch.samt.Customer.domain.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("customer", new Customer());
        return "home";
    }

    @GetMapping("/customerList")
    public String loadCustomers(@RequestParam(value="id", required = false, defaultValue = "0") Model model) {
        model.addAttribute("customers", customers);
        if(id = null){

        }
        return "customerList";
    }

   @PostMapping("/insert")
   public String saveCustomer(@ModelAttribute Customer customer){
       System.out.println(customer);
       customers.add(customer);
       return "redirect:/customerList";
   }
}

