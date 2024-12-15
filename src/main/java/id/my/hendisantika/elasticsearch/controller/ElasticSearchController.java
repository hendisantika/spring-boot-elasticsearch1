package id.my.hendisantika.elasticsearch.controller;

import id.my.hendisantika.elasticsearch.ElasticSearchQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elasticsearch1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/12/24
 * Time: 10.29
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequiredArgsConstructor
public class ElasticSearchController {

    private final ElasticSearchQuery elasticSearchQuery;
}
