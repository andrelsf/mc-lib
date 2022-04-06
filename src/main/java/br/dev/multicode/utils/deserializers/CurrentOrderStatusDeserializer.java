package br.dev.multicode.utils.deserializers;

import br.dev.multicode.models.CurrentOrderStatus;
import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class CurrentOrderStatusDeserializer extends JsonbDeserializer<CurrentOrderStatus> {
  public CurrentOrderStatusDeserializer() {
    super(CurrentOrderStatus.class);
  }
}
