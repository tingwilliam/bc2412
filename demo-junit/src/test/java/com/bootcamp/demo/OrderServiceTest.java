package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// ! Mockito
@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
  @Mock
  private PaymentService paymentService; // mock object (without real implementation)
  @Mock
  private InventoryService inventoryService; // mock object (without real implementation)

  @Test
  void testOrder() {
    // ! For this scenario, how do we perform Unit Test?
    // OrderService -> Inventory Service
    // -> Payment Service
    Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10);
    Mockito.when(this.inventoryService.deductStock()).thenReturn(true);
    Mockito.when(this.paymentService.pay()).thenReturn(true);
    OrderService os =
        new OrderService(this.paymentService, this.inventoryService);
    boolean orderResult = os.order();
    assertEquals(true, orderResult);
  }
}