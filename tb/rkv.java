package tb;

import android.content.ContentValues;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.contrib.tmall.sqlite.DbManager;

/* loaded from: classes9.dex */
public class rkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static rkv f33216a;

    static {
        kge.a(42856129);
    }

    public static synchronized rkv a() {
        synchronized (rkv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rkv) ipChange.ipc$dispatch("f0a1761", new Object[0]);
            }
            if (f33216a == null) {
                f33216a = new rkv();
            }
            return f33216a;
        }
    }

    private rkv() {
        DAI.loadNativeDBBeforeStart();
    }

    public void a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            DbManager.getInstance().execSQL(str, null, "SQLiteDatabase_execSQL", "SQLiteDatabase_execSQL", null);
        }
    }

    public long a(String str, String str2, ContentValues contentValues, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e0406037", new Object[]{this, str, str2, contentValues, new Integer(i)})).longValue() : a(str, str2, contentValues, i, "SQLiteDatabase_insertWithOnConflict", "SQLiteDatabase_insertWithOnConflict");
    }

    public long a(String str, String str2, ContentValues contentValues, int i, String str3, String str4) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24dfefcb", new Object[]{this, str, str2, contentValues, new Integer(i), str3, str4})).longValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT");
        sb.append(" INTO ");
        sb.append(str);
        sb.append('(');
        Object[] objArr = null;
        int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
        if (size > 0) {
            objArr = new Object[size];
            int i3 = 0;
            for (String str5 : contentValues.keySet()) {
                sb.append(i3 > 0 ? "," : "");
                sb.append(str5);
                objArr[i3] = contentValues.get(str5);
                i3++;
            }
            sb.append(')');
            sb.append(" VALUES (");
            while (i2 < size) {
                sb.append(i2 > 0 ? ",?" : "?");
                i2++;
            }
        } else {
            sb.append(str2 + ") VALUES (NULL");
        }
        sb.append(')');
        HashMap hashMap = new HashMap();
        hashMap.put("data_names", str);
        return DbManager.getInstance().insert(sb.toString(), DbManager.argsToStringArray(objArr), str3, str4, hashMap);
    }

    public int a(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b016404b", new Object[]{this, str, contentValues, str2, strArr, new Integer(i)})).intValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data_names", str);
        return a(str, contentValues, str2, strArr, i, "SQLiteDatabase_updateWithOnConflict", "SQLiteDatabase_updateWithOnConflict", hashMap);
    }

    public int a(String str, ContentValues contentValues, String str2, String[] strArr, int i, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51a2c8c", new Object[]{this, str, contentValues, str2, strArr, new Integer(i), str3, str4, map})).intValue();
        }
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(str);
        sb.append(" SET ");
        int size = contentValues.size();
        int length = strArr == null ? size : strArr.length + size;
        Object[] objArr = new Object[length];
        for (String str5 : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str5);
            objArr[i2] = contentValues.get(str5);
            sb.append("=?");
            i2++;
        }
        if (strArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr[i3] = strArr[i3 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        return DbManager.getInstance().update(sb.toString(), DbManager.argsToStringArray(objArr), str3, str4, map);
    }
}
