package br.dev.multicode.utils.deserializers;

import br.dev.multicode.models.OrderInventoryStatus;
import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class OrderInventoryStatusDeserializer extends JsonbDeserializer<OrderInventoryStatus> {
  public OrderInventoryStatusDeserializer()
  {
    super(OrderInventoryStatus.class);
  }
}
