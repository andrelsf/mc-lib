package br.dev.multicode.utils.deserializers;

import br.dev.multicode.models.OrderMessage;
import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class OrderMessageDeserializer extends JsonbDeserializer<OrderMessage> {
  public OrderMessageDeserializer() {
    super(OrderMessage.class);
  }
}
