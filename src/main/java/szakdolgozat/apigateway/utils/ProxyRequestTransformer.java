package szakdolgozat.apigateway.utils;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.client.methods.RequestBuilder;

public abstract class ProxyRequestTransformer {

    protected ProxyRequestTransformer predecessor;

    public abstract RequestBuilder transform(HttpServletRequest request) throws NoSuchMethodException, URISyntaxException, IOException;

    public void setPredecessor(ProxyRequestTransformer transformer) {
        this.predecessor = transformer;
    }
}
