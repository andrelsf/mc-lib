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

  public static OrderProcessingStatus of(OrderMessage orderMessageReceived, OrderStatus orderStatus)
  {
    return OrderProcessingStatus.builder()
      .eventId(orderMessageReceived.getEventId())
      .orderId(orderMessageReceived.getOrderId())
      .status(orderStatus)
      .originProcessing(OriginProcessing.INVENTORY)
      .build();
  }

  public static OrderProcessingStatus of(OrderPaymentMessage orderPaymentMessage, OrderStatus orderStatus)
  {
    return OrderProcessingStatus.builder()
        .eventId(orderPaymentMessage.getEventId())
        .orderId(orderPaymentMessage.getOrderId())
        .status(orderStatus)
        .originProcessing(OriginProcessing.PAYMENT)
        .build();
  }
}
