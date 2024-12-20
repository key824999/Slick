package toy.slick.feign.inheritable;

import feign.Response;
import org.apache.commons.io.IOUtils;

import java.io.IOException;

public interface FeignResponseReader {
    default String getResponseBody(Response feignResponse) throws IOException {
        return IOUtils.toString(feignResponse.body().asReader(feignResponse.charset()));
    }
}
