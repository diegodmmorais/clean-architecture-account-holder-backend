package com.lukeware.controllers.bankaccount;

import com.lukeware.apigateway.bankAccount.IBankAccountRegisterDsGateway;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author Diego Morais
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("Bank account controller factory test")
class BankAccountControllerFactoryTest {

  @Mock
  IBankAccountRegisterDsGateway bankAccountRegisterDsGateway;

  @Test
  @DisplayName("1 - Create customer controller")
  void CreateCustomerController() {

    final var bankAccountController = BankAccountControllerFactory.builder().create(bankAccountRegisterDsGateway);

    Assertions.assertThat(bankAccountController).isNotNull();
  }

}