package br.dev.multicode.utils.deserializers;

import br.dev.multicode.models.OrderProcessingStatus;
import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class OrderProcessingStatusDeserializer extends JsonbDeserializer<OrderProcessingStatus> {
  public OrderProcessingStatusDeserializer()
  {
    super(OrderProcessingStatus.class);
  }
}
