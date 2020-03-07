/*
 * This file is generated by jOOQ.
 */
package com.example.db.jooq.gen.tables;


import com.example.db.jooq.gen.JMsvDb;
import com.example.db.jooq.gen.Keys;
import com.example.db.jooq.gen.tables.records.MsvUserRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class JMsvUser extends TableImpl<MsvUserRecord> {

    private static final long serialVersionUID = 1948077944;

    /**
     * The reference instance of <code>msv_db.msv_user</code>
     */
    public static final JMsvUser MSV_USER = new JMsvUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MsvUserRecord> getRecordType() {
        return MsvUserRecord.class;
    }

    /**
     * The column <code>msv_db.msv_user.id</code>.
     */
    public final TableField<MsvUserRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>msv_db.msv_user.name</code>.
     */
    public final TableField<MsvUserRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>msv_db.msv_user.created_at</code>.
     */
    public final TableField<MsvUserRecord, Timestamp> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>msv_db.msv_user.updated_at</code>.
     */
    public final TableField<MsvUserRecord, Timestamp> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>msv_db.msv_user</code> table reference
     */
    public JMsvUser() {
        this(DSL.name("msv_user"), null);
    }

    /**
     * Create an aliased <code>msv_db.msv_user</code> table reference
     */
    public JMsvUser(String alias) {
        this(DSL.name(alias), MSV_USER);
    }

    /**
     * Create an aliased <code>msv_db.msv_user</code> table reference
     */
    public JMsvUser(Name alias) {
        this(alias, MSV_USER);
    }

    private JMsvUser(Name alias, Table<MsvUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private JMsvUser(Name alias, Table<MsvUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> JMsvUser(Table<O> child, ForeignKey<O, MsvUserRecord> key) {
        super(child, key, MSV_USER);
    }

    @Override
    public Schema getSchema() {
        return JMsvDb.MSV_DB;
    }

    @Override
    public Identity<MsvUserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MSV_USER;
    }

    @Override
    public UniqueKey<MsvUserRecord> getPrimaryKey() {
        return Keys.KEY_MSV_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<MsvUserRecord>> getKeys() {
        return Arrays.<UniqueKey<MsvUserRecord>>asList(Keys.KEY_MSV_USER_PRIMARY);
    }

    @Override
    public JMsvUser as(String alias) {
        return new JMsvUser(DSL.name(alias), this);
    }

    @Override
    public JMsvUser as(Name alias) {
        return new JMsvUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JMsvUser rename(String name) {
        return new JMsvUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JMsvUser rename(Name name) {
        return new JMsvUser(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
