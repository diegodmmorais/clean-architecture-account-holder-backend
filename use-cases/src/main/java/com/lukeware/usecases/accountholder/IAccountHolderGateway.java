package com.lukeware.usecases.accountholder;

import com.lukeware.usecases.IGateway;

import java.util.Set;

/**
 * @author Diego Morais
 */
public interface IAccountHolderGateway extends IGateway<String, AccountHolderResponse> {
  @Override
  Set<AccountHolderResponse> findAll(String identifierCode);
}
