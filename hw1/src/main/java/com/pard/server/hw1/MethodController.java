package com.pard.server.hw1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menus")
public class MethodController {
    @GetMapping("")
    public String getMenu(){
        return "Get Menu controller";
    }

    @PostMapping("")
    public String addMenu(){
        return "add Menu to db";
    }
    
    @GetMapping("/{menuId}")
    public String getMenuById(@PathVariable Long menuId){
        return menuId + " 빈 메뉴 정보 불러오기";
    }

    @PatchMapping("/{menuId}")
    public String patchmenuById(@PathVariable Long menuId){
        return menuId + " 빈 메뉴 정보 수정";
    }

    @DeleteMapping("/{menuId}")
    public String deleteById(@PathVariable Long menuId){
        return menuId + " 빈 메뉴 삭제";
    }
}
