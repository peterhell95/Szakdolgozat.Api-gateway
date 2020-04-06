package szakdolgozat.apigateway.main;

import org.springframework.boot.SpringApplication;

import szakdolgozat.apigateway.ApiGatewayServiceConfiguration;

/**
 * Created by Main on 19.01.2016.
 */
public class ApiGatewayServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayServiceConfiguration.class, args);
    }
}
