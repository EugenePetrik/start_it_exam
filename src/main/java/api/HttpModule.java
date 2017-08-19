package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;

import java.io.IOException;

public class HttpModule {

    private static HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BASIC);

    private static final MediaType MediaTypeJson = MediaType
            .parse("application/json; charset=utf-8");

    private static final String URI_LOGIN = "https://test-maven.cogniance.com/api/v1/login";

    public String methodPostLogin() throws IOException {

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();

        String json = "{\"login\":\"maventests+patient+20@gmail.com\", \"password\":\"Password11\"}";

        RequestBody body = RequestBody.create(MediaTypeJson, json);

        Request request = new Request.Builder()
                .url(URI_LOGIN)
                .post(body)
                .build();

        String response = client
                .newCall(request)
                .execute()
                .body()
                .string();

        LoginHTTP loginHTTP = new ObjectMapper().readValue(response, LoginHTTP.class);

        return loginHTTP.getMustConfirmSafetyInfo();

    }

}
