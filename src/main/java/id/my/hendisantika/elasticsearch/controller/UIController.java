package id.my.hendisantika.elasticsearch.controller;

import id.my.hendisantika.elasticsearch.ElasticSearchQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elasticsearch1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/12/24
 * Time: 10.31
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequiredArgsConstructor
public class UIController {

    private final ElasticSearchQuery elasticSearchQuery;

    @GetMapping("/")
    public String viewHomePage(Model model) throws IOException {
        model.addAttribute("listProductDocuments", elasticSearchQuery.searchAllDocuments());
        return "index";
    }
}
