package ua.dev.bitbucket.api.v1.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ua.dev.bitbucket.api.v1.models.Repository;

@Module(complete = false, library = true)
public class RepositoryModule {

    @Provides @Singleton
    Repository provideRepository(){
        return new Repository();
    }
}
