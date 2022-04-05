package br.dev.multicode.models;

import br.dev.multicode.enums.OrderStatus;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInventoryStatus {

  private UUID eventId;
  private UUID orderId;
  private OrderStatus status;

}
