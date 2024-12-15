package id.my.hendisantika.elasticsearch;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.io.IOException;

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

    public String createOrUpdateDocument(Product product) throws IOException {
        IndexResponse response = elasticsearchClient.index(i -> i
                .index(indexName)
                .id(product.getId())
                .document(product)
        );
        if (response.result().name().equals("Created")) {
            return "Document has been successfully created.";
        } else if (response.result().name().equals("Updated")) {
            return "Document has been successfully updated.";
        }
        return "Error while performing the operation.";
    }
}
