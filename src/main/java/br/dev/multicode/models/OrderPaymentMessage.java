package br.dev.multicode.models;

import br.dev.multicode.enums.TypePayment;
import java.math.BigDecimal;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderPaymentMessage {

  private UUID orderId;
  private UUID userId;
  private TypePayment typePayment;
  private BigDecimal price;

}
