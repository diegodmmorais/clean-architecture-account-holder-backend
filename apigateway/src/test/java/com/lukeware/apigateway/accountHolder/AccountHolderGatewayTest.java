package com.lukeware.apigateway.accountHolder;

import com.lukeware.usecases.accountholder.AccountHolderResponse;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Diego Morais
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("Account holder gateway Test")
class AccountHolderGatewayTest {

  @InjectMocks
  AccountHolderGateway accountHolderGateway;

  @Test
  @DisplayName("1 - Find all account holders")
  void FindAllAccountHolders(){
    final var accountHolders = accountHolderGateway.findAll("789123456");

    Assertions.assertThat(accountHolders).isNotNull().isNotEmpty().hasSize(3);
    Assertions.assertThat(accountHolders.stream().findFirst().isPresent()).isTrue();
    Assertions.assertThat(accountHolders.stream().findFirst().get().identifierCode()).isNotBlank().isEqualTo("789123741");
    Assertions.assertThat(accountHolders.stream().findFirst().get().owner()).isFalse();
    Assertions.assertThat(accountHolders.stream().findFirst().get().sequence()).isEqualTo(3);
  }

}