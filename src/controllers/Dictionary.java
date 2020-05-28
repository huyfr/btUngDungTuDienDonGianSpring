package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class Dictionary {
    @RequestMapping("")
    public String loadIndex() {
        return "index";
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String translates(@RequestParam("word") String key, ModelMap modelMap) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chao");
        dictionary.put("goodbye", "tam biet");
        dictionary.put("book", "quyen sach");
        dictionary.put("pen", "but");
        dictionary.put("bike", "xe dap");
        if (dictionary.containsKey(key)) {
            modelMap.addAttribute("result", dictionary.get(key));
        } else {
            modelMap.addAttribute("message", "Khong co");
        }
        return "index";
    }
}
