package com.alipay.mobile.common.transport.httpdns.db;

/* loaded from: classes3.dex */
public class HttpdnsDBSql {
    public static final String CREATE_HTTPDNS = "create table httpdns (_id integer primary key autoincrement,domain varchar(32),ip varchar(50),ipType integer,port integer,time bigint,ttl bigint,netType integer,cname varchar(64),ttd integer)";
    public static final String Httpdns_tableName = "httpdns";
    public static final String ISHOSTINDB_INGORE_NETTYPE = "select ttl from httpdns where domain = ?";
    public static final String REMOVEIPINFOFROMDB_INGORE_NETTYPE = "delete from httpdns where domain = ?";
    public static final String clearHttpdns = "delete from httpdns";
    public static final String dropOldTable = "drop table if exists httpdns_original";
    public static final String dropTable = "drop table if exists httpdns";
    public static final String getAllIPFromDB = "select domain,ip,ipType,port,time,ttl,cname,ttd from httpdns where netType = ?";
    public static final String isHostInDB = "select ttl from httpdns where domain = ? and netType = ? ";
    public static final String queryIpInfoFromDB = "select ip,ipType,port,time,ttl,cname,ttd from httpdns where domain = ? and netType = ?";
    public static final String removeIpInfoFromDB = "delete from httpdns where domain = ? and netType = ? ";
    public static final String removeSingleIpInfoFromDB = "delete from httpdns where domain = ? and ip = ? and netType = ? ";
}
