package io.simplesource.kafka.internal.streams;

import io.simplesource.kafka.api.ResourceNamingStrategy;

public final class PrefixResourceNamingStrategy implements ResourceNamingStrategy {
    private final String prefix;
    private final String separator;

    public PrefixResourceNamingStrategy() {
        this("", "-");
    }

    public PrefixResourceNamingStrategy(final String prefix) {
        this(prefix, "-");
    }

    public PrefixResourceNamingStrategy(final String prefix, final String separator) {
        this.prefix = prefix;
        this.separator = separator;
    }

    @Override
    public String topicName(final String aggregateName, final String topicEntity) {
        return prefix + aggregateName + separator + topicEntity;
    }

    @Override
    public String storeName(final String aggregateName, final String stateStoreEntity) {
        return prefix + aggregateName + separator + stateStoreEntity + "_store";
    }

}
