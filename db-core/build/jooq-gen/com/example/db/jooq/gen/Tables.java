/*
 * This file is generated by jOOQ.
 */
package com.example.db.jooq.gen;


import com.example.db.jooq.gen.tables.JFlywaySchemaHistory;
import com.example.db.jooq.gen.tables.JItem;
import com.example.db.jooq.gen.tables.JMsvUser;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in msv_db
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>msv_db.flyway_schema_history</code>.
     */
    public static final JFlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = JFlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>msv_db.item</code>.
     */
    public static final JItem ITEM = JItem.ITEM;

    /**
     * The table <code>msv_db.msv_user</code>.
     */
    public static final JMsvUser MSV_USER = JMsvUser.MSV_USER;
}
