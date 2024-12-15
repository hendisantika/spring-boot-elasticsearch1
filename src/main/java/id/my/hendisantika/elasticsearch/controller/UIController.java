package id.my.hendisantika.elasticsearch.controller;

import id.my.hendisantika.elasticsearch.ElasticSearchQuery;
import id.my.hendisantika.elasticsearch.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) throws IOException {
        elasticSearchQuery.createOrUpdateDocument(product);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") String id, Model model) throws IOException {
        Product product = elasticSearchQuery.getDocumentById(id);
        model.addAttribute("product", product);
        return "updateProductDocument";
    }
}
