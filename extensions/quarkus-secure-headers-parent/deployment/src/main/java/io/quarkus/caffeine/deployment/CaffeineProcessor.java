package io.quarkus.caffeine.deployment;

import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.CombinedIndexBuildItem;
import io.quarkus.deployment.builditem.nativeimage.ReflectiveClassBuildItem;

public class CaffeineProcessor {

    private static final String CACHE_LOADER_CLASS_NAME = "com.github.benmanes.caffeine.cache.CacheLoader";

    @BuildStep
    void toggleHeaders(CombinedIndexBuildItem combinedIndex,
                       BuildProducer<ReflectiveClassBuildItem> reflectiveClasses) {
        // add headers
    }
}
