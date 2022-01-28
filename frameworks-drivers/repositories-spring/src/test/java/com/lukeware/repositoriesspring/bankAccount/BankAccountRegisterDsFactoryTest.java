package com.lukeware.repositoriesspring.bankAccount;

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
@DisplayName("Bank bankaccount register factory test")
class BankAccountRegisterDsFactoryTest {

  @Mock
  BankAccountRepository bankAccountRepository;

  @Test
  @DisplayName("1 - create builder bank bankaccount register")
  void createBuilderBankAccountRegister() {
    final var bankAccountRegisterDsGateway = BankAccountRegisterDsFactory.builder().create(bankAccountRepository);

    Assertions.assertThat(bankAccountRegisterDsGateway).isNotNull();
  }
}