package ua.dev.bitbucket.utils;

import dagger.ObjectGraph;

/**
 * Init modules and injector in Application onCreate
 */
public final class Injector {
    public static ObjectGraph objectGraph = null;

    public static void init(final Object... modules) {

        if (objectGraph == null) {
            objectGraph = ObjectGraph.create(modules);
        } else {
            objectGraph = objectGraph.plus(modules);
        }

        // Inject statics
        objectGraph.injectStatics();
    }

    public static void inject(final Object target) {
        objectGraph.inject(target);
    }

    public static <T> T resolve(Class<T> type) {
        return objectGraph.get(type);
    }
}
