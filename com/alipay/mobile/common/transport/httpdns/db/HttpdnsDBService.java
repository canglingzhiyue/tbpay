package com.alipay.mobile.common.transport.httpdns.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.HttpdnsIPEntry;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.network.diagnosis.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class HttpdnsDBService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f5589a = null;
    private HttpdnsDBManager b;

    public HttpdnsDBService(Context context) {
        this.b = HttpdnsDBManager.getInstance(context);
    }

    private List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<String> list = this.f5589a;
        if (list != null && !list.isEmpty()) {
            return this.f5589a;
        }
        this.f5589a = new ArrayList(3);
        this.f5589a.add(DnsUtil.getAmdcHost());
        this.f5589a.add("mugw.alipay.com");
        this.f5589a.add("mdgw.alipay.com");
        return this.f5589a;
    }

    public synchronized void insertIpinfo2DB(String str, HttpDns.HttpdnsIP httpdnsIP, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c1f2c4", new Object[]{this, str, httpdnsIP, new Integer(i)});
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            LogCatUtil.debug("HDNS_HttpdnsDBService", "insertIpinfo2DB,hostName : " + str + " ,ipInfo : " + httpdnsIP.toString());
            if (isHostInDB(str, i)) {
                removeIpInfoFromDB(str, i);
            }
            SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            try {
                if (!StringUtils.isEmpty(httpdnsIP.getCname())) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("domain", str);
                    contentValues.put("time", Long.valueOf(httpdnsIP.getTime()));
                    contentValues.put(RemoteMessageConst.TTL, Long.valueOf(httpdnsIP.getTtl()));
                    contentValues.put("netType", Integer.valueOf(i));
                    contentValues.put("cname", httpdnsIP.getCname());
                    contentValues.put("ttd", Integer.valueOf(httpdnsIP.getTtd()));
                    writableDatabase.insert("httpdns", null, contentValues);
                } else {
                    HttpdnsIPEntry[] ipEntries = httpdnsIP.getIpEntries();
                    for (int i2 = 0; i2 < ipEntries.length; i2++) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("domain", str);
                        contentValues2.put(c.IP, ipEntries[i2].ip);
                        contentValues2.put("ipType", Integer.valueOf(ipEntries[i2].ipType));
                        contentValues2.put("port", Integer.valueOf(ipEntries[i2].port));
                        contentValues2.put("time", Long.valueOf(httpdnsIP.getTime()));
                        contentValues2.put(RemoteMessageConst.TTL, Long.valueOf(httpdnsIP.getTtl()));
                        contentValues2.put("netType", Integer.valueOf(i));
                        contentValues2.put("ttd", Integer.valueOf(httpdnsIP.getTtd()));
                        writableDatabase.insert("httpdns", null, contentValues2);
                    }
                }
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = writableDatabase;
                LogCatUtil.debug("HDNS_HttpdnsDBService", "insertIpinfo2DB ex:" + th.toString());
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized void storeIp2DB(Map<String, HttpDns.HttpdnsIP> map, int i) {
        SQLiteDatabase writableDatabase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4462f7ed", new Object[]{this, map, new Integer(i)});
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = this.b.getWritableDatabase();
        } catch (Throwable th) {
            th = th;
        }
        try {
            for (Map.Entry<String, HttpDns.HttpdnsIP> entry : map.entrySet()) {
                if (!a(writableDatabase, entry)) {
                    if (isHostInDB(entry.getKey(), i)) {
                        removeIpInfoFromDB(entry.getKey(), i);
                    }
                    if (!StringUtils.isEmpty(entry.getValue().getCname())) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("domain", entry.getKey());
                        contentValues.put("time", Long.valueOf(entry.getValue().getTime()));
                        contentValues.put(RemoteMessageConst.TTL, Long.valueOf(entry.getValue().getTtl()));
                        contentValues.put("netType", Integer.valueOf(i));
                        contentValues.put("cname", entry.getValue().getCname());
                        contentValues.put("ttd", Integer.valueOf(entry.getValue().getTtd()));
                        writableDatabase.insert("httpdns", null, contentValues);
                    } else {
                        HttpdnsIPEntry[] ipEntries = entry.getValue().getIpEntries();
                        for (int i2 = 0; i2 < ipEntries.length; i2++) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("domain", entry.getKey());
                            contentValues2.put(c.IP, ipEntries[i2].ip);
                            contentValues2.put("ipType", Integer.valueOf(ipEntries[i2].ipType));
                            contentValues2.put("port", Integer.valueOf(ipEntries[i2].port));
                            contentValues2.put("time", Long.valueOf(entry.getValue().getTime()));
                            contentValues2.put(RemoteMessageConst.TTL, Long.valueOf(entry.getValue().getTtl()));
                            contentValues2.put("netType", Integer.valueOf(i));
                            contentValues2.put("ttd", Integer.valueOf(entry.getValue().getTtd()));
                            writableDatabase.insert("httpdns", null, contentValues2);
                        }
                    }
                }
            }
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            LogCatUtil.error("HDNS_HttpdnsDBService", "storeIp2DB ex:" + th.toString());
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
        }
    }

    private boolean a(SQLiteDatabase sQLiteDatabase, Map.Entry<String, HttpDns.HttpdnsIP> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfe66da", new Object[]{this, sQLiteDatabase, entry})).booleanValue();
        }
        if (!a().contains(entry.getKey())) {
            return false;
        }
        if (isHostInDBIngoreNetType(entry.getKey())) {
            removeIpInfoFromDB(entry.getKey());
        }
        sQLiteDatabase.beginTransaction();
        for (int i = 1; i <= 4; i++) {
            try {
                HttpdnsIPEntry[] ipEntries = entry.getValue().getIpEntries();
                for (int i2 = 0; i2 < ipEntries.length; i2++) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("domain", entry.getKey());
                    contentValues.put(c.IP, ipEntries[i2].ip);
                    contentValues.put("ipType", Integer.valueOf(ipEntries[i2].ipType));
                    contentValues.put("port", Integer.valueOf(ipEntries[i2].port));
                    contentValues.put("time", Long.valueOf(entry.getValue().getTime()));
                    contentValues.put(RemoteMessageConst.TTL, Long.valueOf(entry.getValue().getTtl()));
                    contentValues.put("netType", Integer.valueOf(i));
                    contentValues.put("ttd", (Integer) 21);
                    sQLiteDatabase.insert("httpdns", null, contentValues);
                }
            } catch (Throwable th) {
                try {
                    LogCatUtil.error("HDNS_HttpdnsDBService", "processAmdc ex:" + th.toString());
                    return false;
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
        }
        sQLiteDatabase.setTransactionSuccessful();
        return true;
    }

    public synchronized void updateIp2DB(Map<String, HttpDns.HttpdnsIP> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f5ed05", new Object[]{this, map, new Integer(i)});
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = null;
            for (Map.Entry<String, HttpDns.HttpdnsIP> entry : map.entrySet()) {
                try {
                    if (isHostInDB(entry.getKey(), i)) {
                        removeIpInfoFromDB(entry.getKey(), i);
                    }
                    sQLiteDatabase2 = this.b.getWritableDatabase();
                    if (!StringUtils.isEmpty(entry.getValue().getCname())) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("domain", entry.getKey());
                        contentValues.put("time", Long.valueOf(entry.getValue().getTime()));
                        contentValues.put(RemoteMessageConst.TTL, Long.valueOf(entry.getValue().getTtl()));
                        contentValues.put("netType", Integer.valueOf(i));
                        contentValues.put("cname", entry.getValue().getCname());
                        contentValues.put("ttd", Integer.valueOf(entry.getValue().getTtd()));
                        sQLiteDatabase2.insert("httpdns", null, contentValues);
                    } else {
                        HttpdnsIPEntry[] ipEntries = entry.getValue().getIpEntries();
                        for (int i2 = 0; i2 < ipEntries.length; i2++) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("domain", entry.getKey());
                            contentValues2.put(c.IP, ipEntries[i2].ip);
                            contentValues2.put("ipType", Integer.valueOf(ipEntries[i2].ipType));
                            contentValues2.put("port", Integer.valueOf(ipEntries[i2].port));
                            contentValues2.put("time", Long.valueOf(entry.getValue().getTime()));
                            contentValues2.put(RemoteMessageConst.TTL, Long.valueOf(entry.getValue().getTtl()));
                            contentValues2.put("netType", Integer.valueOf(i));
                            contentValues2.put("ttd", Integer.valueOf(entry.getValue().getTtd()));
                            sQLiteDatabase2.insert("httpdns", null, contentValues2);
                        }
                    }
                    LogCatUtil.debug("HDNS_HttpdnsDBService", "updateIp2DB hostName = " + entry.getKey());
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = sQLiteDatabase2;
                    LogCatUtil.warn("HDNS_HttpdnsDBService", "updateIp2DB ex :" + th.toString());
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        return;
                    }
                }
            }
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized void clearHttpdnsOriginal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc25c48c", new Object[]{this});
            return;
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        writableDatabase.execSQL(HttpdnsDBSql.clearHttpdns);
        if (writableDatabase == null) {
            return;
        }
        writableDatabase.close();
    }

    public boolean isHostInDB(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e261d981", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        Cursor cursor = null;
        try {
            if (StringUtils.isEmpty(str)) {
                LogCatUtil.debug("HDNS_HttpdnsDBService", "isHostInDB : host is null");
                return false;
            }
            Cursor rawQuery = this.b.getWritableDatabase().rawQuery(HttpdnsDBSql.isHostInDB, new String[]{str, String.valueOf(i)});
            if (rawQuery.getCount() <= 0) {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return false;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                LogCatUtil.warn("HDNS_HttpdnsDBService", "isHostInDB ex : " + th.toString());
                return false;
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
    }

    public boolean isHostInDBIngoreNetType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83577037", new Object[]{this, str})).booleanValue();
        }
        Cursor cursor = null;
        try {
            if (StringUtils.isEmpty(str)) {
                LogCatUtil.debug("HDNS_HttpdnsDBService", "isHostInDBIngoreNetType : host is null");
                return false;
            }
            Cursor rawQuery = this.b.getWritableDatabase().rawQuery(HttpdnsDBSql.ISHOSTINDB_INGORE_NETTYPE, new String[]{str});
            if (rawQuery.getCount() <= 0) {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return false;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                LogCatUtil.warn("HDNS_HttpdnsDBService", "isHostInDBIngoreNetType ex: " + th.toString());
                return false;
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
    }

    public synchronized void removeIpInfoFromDB(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1115baf2", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            LogCatUtil.debug("HDNS_HttpdnsDBService", "removeIpInfoFromDB : host is null");
        } else {
            this.b.getWritableDatabase().execSQL(HttpdnsDBSql.REMOVEIPINFOFROMDB_INGORE_NETTYPE, new String[]{str});
        }
    }

    public synchronized void removeIpInfoFromDB(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a21651", new Object[]{this, str, new Integer(i)});
        } else if (StringUtils.isEmpty(str)) {
            LogCatUtil.debug("HDNS_HttpdnsDBService", "removeIpInfoFromDB : host is null");
        } else {
            this.b.getWritableDatabase().execSQL(HttpdnsDBSql.removeIpInfoFromDB, new String[]{str, String.valueOf(i)});
        }
    }

    public synchronized void removeSingleIpInfoFromDB(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ec1df", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            this.b.getWritableDatabase().execSQL(HttpdnsDBSql.removeSingleIpInfoFromDB, new String[]{str, String.valueOf(str2), String.valueOf(i)});
            LogCatUtil.info("HDNS_HttpdnsDBService", "removeSingleIpInfoFromDB,host: " + str + ",ip:" + str2 + ",remove success");
        } catch (Exception e) {
            LogCatUtil.warn("HDNS_HttpdnsDBService", "removeSingleIpInfoFromDB ex: " + e.toString());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public synchronized java.util.Map<java.lang.String, com.alipay.mobile.common.transport.httpdns.HttpDns.HttpdnsIP> getAllIPFromDB(int r18) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.httpdns.db.HttpdnsDBService.getAllIPFromDB(int):java.util.Map");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public synchronized com.alipay.mobile.common.transport.httpdns.HttpDns.HttpdnsIP queryIpInfoFromDB(java.lang.String r17, int r18) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.httpdns.db.HttpdnsDBService.queryIpInfoFromDB(java.lang.String, int):com.alipay.mobile.common.transport.httpdns.HttpDns$HttpdnsIP");
    }
}
