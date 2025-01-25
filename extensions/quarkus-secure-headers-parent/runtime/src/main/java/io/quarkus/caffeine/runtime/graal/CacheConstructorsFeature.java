package io.quarkus.caffeine.runtime.graal;

import org.graalvm.nativeimage.hosted.Feature;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * This Automatic Feature for GraalVM will register for reflection
 * the most commonly used cache implementations from Caffeine.
 * It's implemented as an explicit @{@link Feature} rather than
 * using the Quarkus builditems because it doesn't need to be
 * dynamically tuned (the list is static), and to take advantage
 * of the reachability information we can infer from
 * @{@link org.graalvm.nativeimage.hosted.Feature.DuringAnalysisAccess}.
 * <p>
 * This allows us to register for reflection these resources only if
 * Caffeine is indeed being used: only if the cache builder is reachable
 * in the application code.
 */
public class CacheConstructorsFeature implements Feature {

    public static final String REGISTER_RECORD_STATS_IMPLEMENTATIONS = "io.quarkus.caffeine.graalvm.recordStats";

    /**
     * To set this, add `-J-Dio.quarkus.caffeine.graalvm.diagnostics=true` to the native-image parameters
     */
    private static final boolean log = Boolean.getBoolean("io.quarkus.caffeine.graalvm.diagnostics");

    private final AtomicBoolean triggered = new AtomicBoolean(false);

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
    }


}
