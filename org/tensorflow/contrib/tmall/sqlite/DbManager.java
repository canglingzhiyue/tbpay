package org.tensorflow.contrib.tmall.sqlite;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAIKVStoreage;
import com.tmall.android.dai.internal.dataservice.DataServiceImpl;
import com.tmall.android.dai.internal.util.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;
import tb.rkp;
import tb.rkq;

/* loaded from: classes9.dex */
public class DbManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean ENABLE_LOG = false;
    public static final String TAG = "DAI.DbManager";
    private static DbManager sInstance;
    public volatile boolean initedSuccess = false;
    private long nativeHandle;

    private static native long nativeExecSQLInner(long j, String str, String str2, String[] strArr, String str3, String str4, Map<String, String> map);

    private static native long nativeGetNativeHandle();

    private static native String nativeInit(long j);

    private static native ArrayList<ArrayList<String>> nativeQuery(long j, String str, String str2, String[] strArr, String str3, String str4, Map<String, String> map);

    static {
        kge.a(-1503540122);
        ENABLE_LOG = false;
        sInstance = null;
    }

    public static synchronized DbManager getInstance() {
        synchronized (DbManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DbManager) ipChange.ipc$dispatch("27dd8b9d", new Object[0]);
            }
            if (sInstance == null) {
                sInstance = new DbManager();
            }
            return sInstance;
        }
    }

    public String getBasePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("813b226d", new Object[]{this});
        }
        File file = new File(rkq.d().e().getFilesDir() + rkp.a.DATABASE_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public boolean initIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a24ff3ed", new Object[]{this})).booleanValue();
        }
        if (!this.initedSuccess) {
            return intInner();
        }
        return true;
    }

    public boolean intInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b50bcb2", new Object[]{this})).booleanValue();
        }
        if (this.nativeHandle == 0) {
            Log.e(TAG, "nativeHandle is 0");
            return false;
        }
        DAIKVStoreage.putToMemory("WalleContext", "DBPath", getBasePath());
        DAIKVStoreage.putToMemory("WalleContext", "cpu32", String.valueOf(!DAI.is64Runtime()));
        String nativeInit = nativeInit(this.nativeHandle);
        if ("SUCCESS".equals(nativeInit)) {
            DataServiceImpl.getInstance().detectAppEnterBackground();
            this.initedSuccess = true;
            return true;
        }
        a.a("DAI", 19999, "initDBFailed", nativeInit, null, null);
        return false;
    }

    private DbManager() {
        this.nativeHandle = 0L;
        this.nativeHandle = nativeGetNativeHandle();
    }

    public int insert(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1e51848", new Object[]{this, str, strArr})).intValue() : insert(str, strArr, null, null, null);
    }

    public int insert(String str, String[] strArr, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d542856f", new Object[]{this, str, strArr, str2, str3, map})).intValue();
        }
        if (ENABLE_LOG) {
            String str4 = "insert sql" + str;
        }
        return nativeInsert("edge_compute.db", str, strArr, str2, str3, map);
    }

    public int nativeInsert(String str, String str2, String[] strArr, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21deaff0", new Object[]{this, str, str2, strArr, str3, str4, map})).intValue();
        }
        long j = this.nativeHandle;
        if (str3 == null) {
            str3 = "biz_id_db_jni_insert";
        }
        String str5 = str3;
        if (str4 == null) {
            str4 = "tri_id_db_jni_insert";
        }
        return (int) nativeExecSQLInner(j, str, str2, strArr, str5, str4, map);
    }

    public int update(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e705b438", new Object[]{this, str, strArr})).intValue() : update(str, strArr, null, null, null);
    }

    public int update(String str, String[] strArr, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecaac37f", new Object[]{this, str, strArr, str2, str3, map})).intValue();
        }
        if (ENABLE_LOG) {
            String str4 = "update sql" + str;
        }
        return nativeUpdate("edge_compute.db", str, strArr, str2, str3, map);
    }

    public int nativeUpdate(String str, String str2, String[] strArr, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d998a00", new Object[]{this, str, str2, strArr, str3, str4, map})).intValue();
        }
        long j = this.nativeHandle;
        if (str3 == null) {
            str3 = "biz_id_db_jni_update";
        }
        String str5 = str3;
        if (str4 == null) {
            str4 = "tri_id_db_jni_update";
        }
        return (int) nativeExecSQLInner(j, str, str2, strArr, str5, str4, map);
    }

    public int delete(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("27dcd96", new Object[]{this, str, strArr})).intValue() : delete(str, strArr, null, null, null);
    }

    public int delete(String str, String[] strArr, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4aceb961", new Object[]{this, str, strArr, str2, str3, map})).intValue();
        }
        if (ENABLE_LOG) {
            String str4 = "delete sql" + str;
        }
        return nativeDelete("edge_compute.db", str, strArr, str2, str3, map);
    }

    public int nativeDelete(String str, String str2, String[] strArr, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28f48b62", new Object[]{this, str, str2, strArr, str3, str4, map})).intValue();
        }
        long j = this.nativeHandle;
        if (str3 == null) {
            str3 = "biz_id_db_jni_delete";
        }
        String str5 = str3;
        if (str4 == null) {
            str4 = "tri_id_db_jni_delete";
        }
        return (int) nativeExecSQLInner(j, str, str2, strArr, str5, str4, map);
    }

    public Cursor query(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Cursor) ipChange.ipc$dispatch("f26853e0", new Object[]{this, str, strArr}) : query(str, strArr, null, null, null);
    }

    public Cursor query(String str, String[] strArr, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("4caf8edb", new Object[]{this, str, strArr, str2, str3, map});
        }
        if (ENABLE_LOG) {
            String str4 = "query sql" + str;
        }
        return nativeQuery("edge_compute.db", str, strArr, str2, str3, map);
    }

    public Cursor nativeQuery(String str, String str2, String[] strArr, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("9f619088", new Object[]{this, str, str2, strArr, str3, str4, map});
        }
        long j = this.nativeHandle;
        if (str3 == null) {
            str3 = "biz_id_db_jni_query";
        }
        String str5 = str3;
        if (str4 == null) {
            str4 = "tri_id_db_jni_query";
        }
        return new CursorImpl(nativeQuery(j, str, str2, strArr, str5, str4, map));
    }

    public boolean execSQL(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7e01415", new Object[]{this, str, strArr})).booleanValue() : execSQL(str, strArr, null, null, null);
    }

    public boolean execSQL(String str, String[] strArr, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b750844", new Object[]{this, str, strArr, str2, str3, map})).booleanValue();
        }
        if (ENABLE_LOG) {
            String str4 = "execSQL sql" + str;
        }
        return nativeExecSQL("edge_compute.db", str, strArr, str2, str3, map);
    }

    public boolean nativeExecSQL(String str, String str2, String[] strArr, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ae7e337", new Object[]{this, str, str2, strArr, str3, str4, map})).booleanValue();
        }
        return nativeExecSQLInner(this.nativeHandle, str, str2, strArr, str3 == null ? "tri_id_db_jni_exec_sql" : str3, str4 == null ? "biz_id_db_jni_exec_sql" : str4, map) > 0;
    }

    public static String[] argsToStringArray(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("4e738529", new Object[]{objArr});
        }
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            String str = "NULL";
            if (obj == null) {
                strArr[i] = str;
            } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Long)) {
                strArr[i] = String.valueOf(obj);
            } else if (obj instanceof Float) {
                strArr[i] = String.valueOf(obj);
            } else if (obj instanceof String) {
                strArr[i] = (String) obj;
            } else {
                strArr[i] = obj.toString();
            }
            if (obj != null) {
                str = String.valueOf(obj);
            }
            strArr[i] = str;
        }
        return strArr;
    }

    public void beginTransaction(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e757b1f5", new Object[]{this, str, str2, map});
            return;
        }
        if (str == null) {
            str = "biz_id_db_jni_begin_transaction";
        }
        String str3 = str;
        if (str2 == null) {
            str2 = "tri_id_db_jni_begin_transaction";
        }
        execSQL("BEGIN", null, str3, str2, map);
    }

    public void beginTransaction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f900707c", new Object[]{this});
        } else {
            beginTransaction(null, null, null);
        }
    }

    public void endTransaction(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160aeda7", new Object[]{this, str, str2, map});
            return;
        }
        if (str == null) {
            str = "biz_id_db_jni_begin_transaction";
        }
        String str3 = str;
        if (str2 == null) {
            str2 = "tri_id_db_jni_begin_transaction";
        }
        execSQL("COMMIT", null, str3, str2, map);
    }

    public void endTransaction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634eb60a", new Object[]{this});
        } else {
            endTransaction(null, null, null);
        }
    }
}
