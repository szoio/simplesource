package io.simplesource.kafka.serialization.avro.mappers.domain;

import lombok.Value;

import java.math.BigDecimal;

@Value
public final class UserAccountDomain {
    final String username;
    final BigDecimal balance;
}
