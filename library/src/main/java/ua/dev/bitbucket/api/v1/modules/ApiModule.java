package ua.dev.bitbucket.api.v1.modules;

import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Endpoint;
import retrofit.Endpoints;
import retrofit.RestAdapter;
import retrofit.client.Client;
import retrofit.client.OkClient;

@Module(complete = false, library = true)
public class ApiModule {

    public static final String API_V1_ENDPOINT = "https://bitbucket.org/api/1.0";
    public static final String API_V2_ENDPOINT = "https://bitbucket.org/api/2.0";
    private static String KEY = "aZpcmnEUVM4qMrHBe4";
    private static String SECRET = "bEwDprhWgVyg7C4d4VNnq7TpHsmpSWbq";

    @Provides
    String provideKey(){
        return KEY;
    }

    @Provides
    String provideSecretKey(){
        return SECRET;
    }

    @Provides @Singleton
    Client provideOkClient(OkHttpClient client){
        return new OkClient(client);
    }

    @Provides @Singleton
    Endpoint provideV1Endpoint() {
        return Endpoints.newFixedEndpoint(API_V1_ENDPOINT);
    }

    @Provides @Singleton
    Endpoint provideV2Endpoint(){
        return Endpoints.newFixedEndpoint(API_V2_ENDPOINT);
    }

    @Provides @Singleton
    RestAdapter provideRestAdapter(Endpoint endpoint, Client client){
        return new RestAdapter.Builder() //
                .setClient(client) //
                .setEndpoint(endpoint) //
                .build();
    }
}
