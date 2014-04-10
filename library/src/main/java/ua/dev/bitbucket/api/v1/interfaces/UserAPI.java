package ua.dev.bitbucket.api.v1.interfaces;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;
import ua.dev.bitbucket.api.v1.models.User;

public interface UserAPI {

    @GET("/{user}")
    Observable<User> getUser(@Path("user") String user);
}
