package br.dev.multicode.utils.deserializers;

import br.dev.multicode.models.OrderPaymentMessage;
import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class OrderPaymentMessageDeserializer extends JsonbDeserializer<OrderPaymentMessage> {
  public OrderPaymentMessageDeserializer() { super(OrderPaymentMessage.class); }
}
