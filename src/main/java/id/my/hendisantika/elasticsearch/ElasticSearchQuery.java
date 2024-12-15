package id.my.hendisantika.elasticsearch;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elasticsearch1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/12/24
 * Time: 10.26
 * To change this template use File | Settings | File Templates.
 */
@Repository
@RequiredArgsConstructor
public class ElasticSearchQuery {

    private final ElasticsearchClient elasticsearchClient;

    private final String indexName = "products";
}
