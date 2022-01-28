package com.lukeware.gateways.bankAccount;

import java.time.LocalDate;

/**
 * @author Diego Silva Morais
 */
public final record BankAccountDsRequest(String identifierCode,
                                         String customerId,
                                         boolean active,
                                         boolean externalMovement,
                                         String type,
                                         LocalDate openDate,
                                         LocalDate lastMoveDate) {
}
