package com.alipay.mobile.common.transport.config.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.SoftReference;

/* loaded from: classes3.dex */
public class NetworkConfigDAO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static SoftReference<NetworkConfigDAO> networkConfigDAORef;

    public static final NetworkConfigDAO getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkConfigDAO) ipChange.ipc$dispatch("f2d655a9", new Object[0]);
        }
        SoftReference<NetworkConfigDAO> softReference = networkConfigDAORef;
        if (softReference != null && softReference.get() != null) {
            return networkConfigDAORef.get();
        }
        synchronized (NetworkConfigDAO.class) {
            if (networkConfigDAORef != null && networkConfigDAORef.get() != null) {
                return networkConfigDAORef.get();
            }
            NetworkConfigDAO networkConfigDAO = new NetworkConfigDAO();
            networkConfigDAORef = new SoftReference<>(networkConfigDAO);
            return networkConfigDAO;
        }
    }

    public synchronized String getConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d74258f7", new Object[]{this, str});
        }
        Cursor rawQuery = NetworkConfigDBHelper.getInstance(TransportEnvUtil.getContext()).getReadableDatabase().rawQuery(SqlConstants.QUERY_BY_KEY_SQL, new String[]{str});
        if (rawQuery.getCount() <= 0) {
            LogCatUtil.info("NetworkConfigDAO", "getConfig. " + str + " value is null.");
            if (rawQuery != null && !rawQuery.isClosed()) {
                close(rawQuery);
            }
            return "";
        } else if (!rawQuery.moveToNext()) {
            if (rawQuery != null && !rawQuery.isClosed()) {
                close(rawQuery);
            }
            return "";
        } else {
            String string = rawQuery.getString(rawQuery.getColumnIndex("value"));
            LogCatUtil.info("NetworkConfigDAO", "getConfig. " + str + ":" + string);
            if (rawQuery != null && !rawQuery.isClosed()) {
                close(rawQuery);
            }
            return string;
        }
    }

    public synchronized boolean saveOrUpdateConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0dbdcea", new Object[]{this, str, str2})).booleanValue();
        } else if (isExistsConfig(str)) {
            return updateConfigByKey(str, str2);
        } else {
            return insertConfigByKey(str, str2);
        }
    }

    public synchronized boolean insertConfigByKey(String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba0a50c", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            sQLiteDatabase = NetworkConfigDBHelper.getInstance(TransportEnvUtil.getContext()).getWritableDatabase();
        } catch (Throwable th2) {
            sQLiteDatabase = null;
            th = th2;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("switch_key", str);
            contentValues.put("value", str2);
            long currentTimeMillis = System.currentTimeMillis();
            contentValues.put("gmt_modified", Long.valueOf(currentTimeMillis));
            contentValues.put("gmt_created", Long.valueOf(currentTimeMillis));
            sQLiteDatabase.insert(NetworkConfigDBHelper.TB_NAME, null, contentValues);
            LogCatUtil.info("NetworkConfigDAO", "insertConfigByKey finish. key:" + str + ", value:" + str2);
            if (sQLiteDatabase != null) {
                close(sQLiteDatabase);
            }
            return true;
        } catch (Throwable th3) {
            th = th3;
            MonitorErrorLogHelper.log("NetworkConfigDAO", new RuntimeException("insertConfigByKey fail. key:" + str + ", value:" + str2, th));
            if (sQLiteDatabase != null) {
                close(sQLiteDatabase);
            }
            return false;
        }
    }

    public synchronized boolean updateConfigByKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76314fc", new Object[]{this, str, str2})).booleanValue();
        }
        SQLiteDatabase writableDatabase = NetworkConfigDBHelper.getInstance(TransportEnvUtil.getContext()).getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str2);
        contentValues.put("gmt_modified", Long.valueOf(System.currentTimeMillis()));
        int update = writableDatabase.update(NetworkConfigDBHelper.TB_NAME, contentValues, "switch_key = ?", new String[]{str});
        LogCatUtil.info("NetworkConfigDAO", "updateConfigByKey. update finish. rows: " + update + ", key:" + str + ", value:" + str2);
        if (update <= 0) {
            z = false;
        }
        if (writableDatabase != null) {
            close(writableDatabase);
        }
        return z;
    }

    public boolean isExistsConfig(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da68e59d", new Object[]{this, str})).booleanValue() : countConfigByKey(str) > 0;
    }

    public synchronized int countConfigByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5e5831b", new Object[]{this, str})).intValue();
        }
        Cursor rawQuery = NetworkConfigDBHelper.getInstance(TransportEnvUtil.getContext()).getReadableDatabase().rawQuery(SqlConstants.COUNT_BY_KEY_SQL, new String[]{str});
        int count = rawQuery.getCount();
        LogCatUtil.info("NetworkConfigDAO", "countConfigByKey. key:" + str + " count:" + count);
        if (rawQuery != null && !rawQuery.isClosed()) {
            close(rawQuery);
        }
        return count;
    }

    public synchronized int deleteConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a69bb91", new Object[]{this, str})).intValue();
        }
        SQLiteDatabase writableDatabase = NetworkConfigDBHelper.getInstance(TransportEnvUtil.getContext()).getWritableDatabase();
        int delete = writableDatabase.delete(NetworkConfigDBHelper.TB_NAME, " switch_key = ? ", new String[]{str});
        LogCatUtil.info("NetworkConfigDAO", "deleteConfig. update finish. rows: " + delete + ", key:" + str);
        if (writableDatabase != null) {
            close(writableDatabase);
        }
        return delete;
    }

    public synchronized void close(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90aea338", new Object[]{this, sQLiteDatabase});
        } else if (sQLiteDatabase == null) {
        } else {
            sQLiteDatabase.close();
        }
    }

    public synchronized void close(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578f43f8", new Object[]{this, cursor});
        } else if (cursor == null || cursor.isClosed()) {
        } else {
            cursor.close();
        }
    }
}
