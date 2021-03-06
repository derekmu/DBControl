package com.dbcontrol.exceptions;

import java.sql.SQLException;

/**
 * Extension of SQLException to handle the specific case of >1 or <1 rows affected in a DBControl/ConnectionWrapper update or delete.
 *
 * @author Derek Mulvihill - Mar 18, 2014
 */
public class RowsAffectedSQLException extends SQLException {
    public RowsAffectedSQLException(String message) {
        super(message);
    }
}
