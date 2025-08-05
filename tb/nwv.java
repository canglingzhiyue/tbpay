package tb;

import android.os.Build;
import android.os.Trace;
import android.support.v4.os.TraceCompat;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.base.Versions;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class nwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f31821a;
    public static boolean b;
    public static long c;
    private static boolean d;
    private static Map<String, Long> e;

    static {
        kge.a(-1621724139);
        f31821a = 0L;
        c = 0L;
        b = false;
        d = false;
        e = new HashMap();
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (!b) {
        } else {
            Log.e("mtbDebug", str + " cost:" + (System.currentTimeMillis() - c));
            TLog.loge("mtbDebug", str + " cost:" + (System.currentTimeMillis() - c));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        b = ABGlobal.isFeatureOpened(Globals.getApplication(), "mtbDebugTrace3");
        d = ABGlobal.isFeatureOpened(Globals.getApplication(), "noMtbBigSale");
        if (!b) {
            return;
        }
        DXTraceUtil.a(true);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!b) {
        } else {
            f31821a = System.nanoTime();
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (!b) {
        } else {
            if (f31821a == 0) {
                f31821a = System.nanoTime();
            }
            Log.e("mtbDebug", "MyTaobaoFragment->>>>>>>>>>>>" + str + " cost" + (((float) (System.nanoTime() - f31821a)) / 1000000.0f) + "ms");
            TLog.loge("mtbDebug", "MyTaobaoFragment->>>>>>>>>>>>" + str + " cost" + (((float) (System.nanoTime() - f31821a)) / 1000000.0f) + "ms");
            f31821a = System.nanoTime();
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!b) {
        } else {
            Log.e(str, str2);
            TLog.loge(str, str2);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!b) {
        } else {
            TraceCompat.beginSection("[mtb]" + str);
            e.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else if (!b) {
        } else {
            a();
            Long l = e.get(str);
            long longValue = l == null ? 0L : l.longValue();
            TLog.loge("mtbDebug", str + " cost:" + (System.currentTimeMillis() - longValue));
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!b) {
        } else {
            TraceCompat.endSection();
        }
    }

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i)});
        } else if (!b) {
        } else {
            String str2 = "[mtb]" + str;
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            Trace.beginAsyncSection(str2, i);
        }
    }

    public static void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{str, new Integer(i)});
        } else if (!b) {
        } else {
            String str2 = "[mtb]" + str;
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            Trace.endAsyncSection(str2, i);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (Versions.isDebug()) {
            throw new RuntimeException(str);
        } else {
            TLog.loge("mtbMainLink", "非预期错误: " + str);
        }
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        try {
            if (!d) {
                return;
            }
            jSONObject.getJSONObject("data").getJSONObject("hierarchy").getJSONObject("structure").getJSONArray("mytaobaoCard_1").remove("bigSaleModule2023_1");
        } catch (Throwable unused) {
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
        } else {
            Log.e("newMtbDebugLog", str);
        }
    }
}
