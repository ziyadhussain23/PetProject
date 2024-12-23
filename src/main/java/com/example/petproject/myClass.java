package com.example.petproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.Optional;


@Controller
@RequestMapping("/pet")
public class myClass {
    @GetMapping("")
    public String home() {
        return "home";
    }@GetMapping("/")
    public String home1() {
        return "home";
    }
    @GetMapping("/home")
    public String home2() {
        return "home";
    }
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("p", userRepository.findAll());
        return "index";
    }

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/add")
    public String addUser(Model model) {
        pet p1 = new pet();
        model.addAttribute("p1", p1);
        return "newpet";
    }


    @PostMapping("/save")
    public String save(@ModelAttribute ("p1") pet p1) {

        userRepository.save(p1);

        return "redirect:/pet/index";
    }

    @GetMapping("/search")
    public String search(Model model) {
        pet p2 = new pet();
        model.addAttribute("p2", p2);
        return "search";
    }

    @PostMapping("/find")
    public String find(@ModelAttribute ("p2") pet p2, Model model) {
        try {
            Optional<pet> p = userRepository.findById(p2.getId());
            if(p.isPresent()){
                model.addAttribute("p3", p.get());
                return "show";
            }else{
                throw new IdNotFound("Id not found");
            }
        }catch (IdNotFound e){
            return "notfound";
        }
    }

    @PostMapping("/find2")
    public String find2(@ModelAttribute ("p2") pet p2, Model model) {
        try {

            if(userRepository.findAllByname(p2.getName()).iterator().hasNext()){
                model.addAttribute("p3", userRepository.findAllByname(p2.getName()));
                return "show2";
            }else{
                throw new NameNotFound("Name not found");
            }
        }catch (NameNotFound e){
            return "notfound2";
        }
    }

    @GetMapping("/show/{id}")
    public String showPet(@PathVariable(value = "id") int id, Model model) {
        try {
            Optional<pet> p = userRepository.findById(id);
            if(p.isPresent()){
                model.addAttribute("p1", p.get());
                return "update";
            }else{
                throw new IdNotFound("Id not found");
            }
        }catch (IdNotFound e){
            return "notfound";
        }

    }



    @GetMapping("delete/{id}")
    public String delete(@PathVariable(value = "id") int id) {
        userRepository.deleteById(id);
        return "redirect:/pet/index";
    }
}
