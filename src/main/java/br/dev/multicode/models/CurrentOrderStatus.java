package br.dev.multicode.models;

import br.dev.multicode.enums.OrderStatus;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CurrentOrderStatus {

  private UUID orderId;
  private OrderStatus status;

}
