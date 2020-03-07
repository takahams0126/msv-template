/*
 * This file is generated by jOOQ.
 */
package com.example.db.jooq.gen;


import com.example.db.jooq.gen.tables.JFlywaySchemaHistory;
import com.example.db.jooq.gen.tables.JItem;
import com.example.db.jooq.gen.tables.JMsvUser;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JMsvDb extends SchemaImpl {

    private static final long serialVersionUID = 1151911175;

    /**
     * The reference instance of <code>msv_db</code>
     */
    public static final JMsvDb MSV_DB = new JMsvDb();

    /**
     * The table <code>msv_db.flyway_schema_history</code>.
     */
    public final JFlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = JFlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>msv_db.item</code>.
     */
    public final JItem ITEM = JItem.ITEM;

    /**
     * The table <code>msv_db.msv_user</code>.
     */
    public final JMsvUser MSV_USER = JMsvUser.MSV_USER;

    /**
     * No further instances allowed
     */
    private JMsvDb() {
        super("msv_db", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            JFlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            JItem.ITEM,
            JMsvUser.MSV_USER);
    }
}