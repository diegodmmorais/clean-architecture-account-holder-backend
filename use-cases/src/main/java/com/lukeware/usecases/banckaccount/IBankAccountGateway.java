package com.lukeware.usecases.banckaccount;

import com.lukeware.usecases.banckaccount.ds.BankAccountDsRequest;
import com.lukeware.usecases.banckaccount.ds.BankAccountDsResponse;

import java.util.Optional;
import java.util.Set;

/**
 * @author Diego Morais
 */
public interface IBankAccountGateway {
  Optional<IBankAccountMapper>save(BankAccountDsRequest dataMapper);

  Set<IBankAccountMapper> findAll(String identifierCode);
}