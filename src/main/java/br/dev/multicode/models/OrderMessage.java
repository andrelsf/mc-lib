package br.dev.multicode.models;

import br.dev.multicode.enums.OrderStatus;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderMessage {

  private UUID eventId;
  private UUID userId;
  private UUID orderId;
  private OrderStatus status;
  private Set<ItemMessage> items = new HashSet<>();
  private BigDecimal price;

}
