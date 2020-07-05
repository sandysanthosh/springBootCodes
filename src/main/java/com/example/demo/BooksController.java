package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class BooksController   
{  
@RequestMapping("/books")  
public String getAllBooks(Model model)  
{  
//application code  
return "Hello welcome";  
}  
@RequestMapping("/home")  
public String getAllHome(Model model)  
{  
//application code  
return "home.jsp";  
}  
}
