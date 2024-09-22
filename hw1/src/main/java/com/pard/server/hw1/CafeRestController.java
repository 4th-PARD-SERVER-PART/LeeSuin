package com.pard.server.hw1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class CafeRestController {
    @RequestMapping("/cafeRest")
    public String cafe(){
        return "Welcome to Suin's Cafe!";
    }

    @RequestMapping("/menu/{type}")
    public String menuList(@PathVariable String type) {
        String result = "";
        if(type.equals("Drink")){
            result = "***** Drink Menu ***** " + "\n"
                    + "Americano" + "\n"
                    + "Cafe Latte" + "\n"
                    + "Cappuccino" + "\n"
                    + "Espresso" + "\n"
                    + "Mocha" + "\n";
        }else if(type.equals("Dessert")){
            result = "***** Dessert Menu ***** " + "\n"
                    + "Cheesecake" + "\n"
                    + "Chocolate Brownie" + "\n"
                    + "Macarons" + "\n"
                    + "Tiramisu" + "\n"
                    + "Croissant" + "\n"
                    + "Donut" + "\n";
        }else{
            result = "Please choose 'Dink' or 'Dessert'.";
        }
        return "You can pick the menu: " + "\n" + result;
    }
    @RequestMapping("/menu/{type}/{menu}/{price}")
    public String menuList(@PathVariable String type, @PathVariable String menu, @PathVariable Long price) {
        return "I will check your menu. Type:  " + type + ", menu: " + menu + ", price: " + price;
    }

    @RequestMapping("/menu1")
    public String menu1(@RequestParam String type,@RequestParam String menu, @RequestParam(required=false) Integer price){
        if(price == null){
            return "Your menu: Type: " + type + ", Menu: " + menu + ", Price: " + "제공되지 않음";
        }
        return "Your menu: Type: " + type + ", Menu: " + menu + ", Price: " + price;
    }

    @RequestMapping("/menu2")
    public String menu2(@RequestParam Map<String, Objects> map){
        return "Your menu : " + map.get("type") +", " + map.get("menu");
    }
}
