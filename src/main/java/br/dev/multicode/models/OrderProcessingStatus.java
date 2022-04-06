package br.dev.multicode.models;

import br.dev.multicode.enums.OrderStatus;
import br.dev.multicode.enums.OriginProcessing;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderProcessingStatus {

  private UUID eventId;
  private UUID orderId;
  private OrderStatus status;
  private OriginProcessing originProcessing;

  public static OrderProcessingStatus of(OrderMessage orderMessageReceived) {
    return OrderProcessingStatus.builder()
      .eventId(orderMessageReceived.getEventId())
      .orderId(orderMessageReceived.getOrderId())
      .status(OrderStatus.REJECTED_PRODUCT)
      .originProcessing(OriginProcessing.INVENTORY)
      .build();
  }
}
