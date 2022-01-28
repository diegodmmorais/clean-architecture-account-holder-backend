package com.lukeware.apigateway.bankAccount;

import com.lukeware.gateways.bankAccount.BankAccountGatewayFactory;
import com.lukeware.gateways.bankAccount.IBankAccountRegisterDsGateway;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author diegomorais
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("Account holder gateway builder test")
class BankAccountGatewayFactoryTest {
  @Mock
  IBankAccountRegisterDsGateway bankAccountRepository;

  @Test
  @DisplayName("1 - create bankaccount holder gateway")
  void createAccountHolderGateway() {
    final var bankAccountGateway = BankAccountGatewayFactory.builder().create(bankAccountRepository);
    Assertions.assertThat(bankAccountGateway).isNotNull();
  }
}