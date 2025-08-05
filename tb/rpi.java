package tb;

import android.content.ContentValues;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes9.dex */
public class rpi extends rph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static rpi f33299a;
    private static rkv b;

    public static /* synthetic */ Object ipc$super(rpi rpiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1312798264);
        f33299a = null;
        b = null;
    }

    private rpi() {
        b = riq.c().a();
    }

    public static synchronized rpi getInstance() {
        synchronized (rpi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rpi) ipChange.ipc$dispatch("201488a9", new Object[0]);
            }
            if (f33299a == null) {
                f33299a = new rpi();
            }
            return f33299a;
        }
    }

    @Override // tb.rph
    public long commit(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("519dce5d", new Object[]{this, str, str2, str3, map})).longValue() : a(str, str2, map);
    }

    @Override // tb.rph
    public long update(String str, String str2, String str3, String str4, String[] strArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d351e772", new Object[]{this, str, str2, str3, str4, strArr, map})).longValue() : a(str, str2, str4, strArr, map);
    }

    private rkv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rkv) ipChange.ipc$dispatch("f0a1761", new Object[]{this}) : b;
    }

    private long a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8416267d", new Object[]{this, str, str2, map})).longValue();
        }
        if (map == null) {
            return -2L;
        }
        if (a() == null) {
            return -3L;
        }
        ContentValues contentValues = new ContentValues();
        for (String str3 : map.keySet()) {
            contentValues.put(str3, a(map.get(str3)));
        }
        String a2 = a(str, str2);
        apr.b("WalleDataCollectorAdapter", "save table", a2);
        return a().a(a2, "", contentValues, 0);
    }

    private int a(String str, String str2, String str3, String[] strArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ca5133f", new Object[]{this, str, str2, str3, strArr, map})).intValue();
        }
        if (map == null || a() == null || str3 == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        for (String str4 : map.keySet()) {
            contentValues.put(str4, a(map.get(str4)));
        }
        String a2 = a(str, str2);
        apr.b("WalleDataCollectorAdapter", "update table", a2);
        return a().a(a2, contentValues, str3, strArr, 0);
    }

    private String a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : obj == null ? "" : obj.toString();
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        return "dc_" + str + "_" + str2;
    }

    @Override // tb.rph
    public void createTable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155e1143", new Object[]{this, str});
            return;
        }
        if (str.endsWith("node")) {
            a(str);
        } else if (str.endsWith("edge")) {
            b(str);
        }
        c(str);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            apr.b("WalleDataCollectorAdapter", "create node table", str);
            rkv a2 = a();
            a2.a("CREATE TABLE IF NOT EXISTS " + str + "(id INTEGER PRIMARY KEY AUTOINCREMENT, cold_start_id  VARCHAR, session_id  VARCHAR, pv_key  VARCHAR, pv_id VARCHAR, scene  VARCHAR, from_scene  VARCHAR, event_id VARCHAR, create_time  VARCHAR, user_id  VARCHAR, update_time  VARCHAR, page VARCHAR, arg1 VARCHAR,arg2 VARCHAR,arg3 VARCHAR,args VARCHAR,spm_cnt VARCHAR,spm_url VARCHAR,spm_pre VARCHAR,scm VARCHAR,scm_pre VARCHAR,utparam_cnt VARCHAR,utparam_url VARCHAR,utparam_pre VARCHAR,utlogmap VARCHAR,utlogmapedge VARCHAR,object_id  VARCHAR,object_type  VARCHAR,biz_arg1  VARCHAR, biz_arg2  VARCHAR, biz_arg3  VARCHAR, biz_arg4  VARCHAR, biz_arg5  VARCHAR, biz_arg6  VARCHAR, biz_arg7  VARCHAR, biz_arg8  VARCHAR, biz_arg9  VARCHAR, biz_arg10  VARCHAR, biz_args  VARCHAR, sys_arg1  VARCHAR, sys_arg2  VARCHAR, sys_arg3  VARCHAR, sys_arg4  VARCHAR, sys_arg5  VARCHAR,sys_args  VARCHAR )");
        } catch (Exception e) {
            apr.c("WalleDataCollectorAdapter", "create db error", e);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            apr.b("WalleDataCollectorAdapter", "create edge table", str);
            rkv a2 = a();
            a2.a("CREATE TABLE IF NOT EXISTS " + str + "(id INTEGER PRIMARY KEY AUTOINCREMENT, left_node_id INTEGER, right_node_id INTEGER, left_table  VARCHAR,right_table VARCHAR,left_event_id VARCHAR,right_event_id VARCHAR,left_event_name VARCHAR,right_event_name VARCHAR,left_scene VARCHAR,right_scene VARCHAR,create_time VARCHAR)");
        } catch (Exception e) {
            apr.c("WalleDataCollectorAdapter", "create db error", e);
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            apr.b("WalleDataCollectorAdapter", "clearLegacyData table", str);
            rkv a2 = a();
            a2.a("DELETE FROM " + str + " WHERE id < (SELECT MAX(id) FROM " + str + ") - 5000;");
        } catch (Exception e) {
            apr.c("WalleDataCollectorAdapter", "clearLegacyData db error", e);
        }
    }
}
