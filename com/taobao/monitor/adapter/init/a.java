package com.taobao.monitor.adapter.init;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;
import tb.mms;
import tb.mna;
import tb.mpi;
import tb.mqe;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BATTERY_CANARY_SAMPLE = "battery_canary_sample";
    public static final String BLOCK_STACK_SAMPLE = "block_stack_sample";
    public static final String CLOSE_SAMPLE_ON_GREY = "close_sample_on_grey";
    public static final String FILTERED_PAGE_TAG_SAMPLE = "filtered_page_tag_sample";
    public static final String FIX_LEAK = "fix_leak";
    public static final String FRAGMENT_PAGE_LOAD_SAMPLE = "fragment_page_load_sample";
    public static final String GLOBAL_SAMPLE = "global_sample";
    public static final String IMAGE_PROCESSOR_SAMPLE = "image_processor_sample";
    public static final String LAUNCHER_PROCESSOR_SAMPLE = "launcher_sample";
    public static final String LOOPER_OBSERVER_SAMPLE = "looper_observer_sample";
    public static final String MAIN_THREAD_MONITOR_SAMPLE = "main_thread_monitor_sample";
    public static final String NEED_PAGE_PSS = "need_page_pss";
    public static final String NEED_RUNTIME_INFO = "need_runtime_info";
    public static final String NEED_WX_END_RUNTIME_INFO = "need_wx_runtime_info";
    public static final String NETWORK_PROCESSOR_SAMPLE = "network_processor_sample";
    public static final String NETWORK_SAMPLE = "network_sample";
    public static final String NEXT_LAUNCH_UPLOAD_SAMPLE = "next_launch_upload_sample";
    public static final String ORANGE_NAMESPACE = "applicationmonitor";
    public static final String PAGE_LOAD_SAMPLE = "page_load_sample";
    public static final String SPECIAL_PAGE_SAMPLE = "special_page_sample";
    public static final String SUBTASK_SAMPLE = "subtask_sample";
    public static final String USE_NEW_STANDARD = "use_new_standard";
    public static final String WEEX_PROCESSOR_SAMPLE = "weex_processor_sample";
    public static final String WINDVANE_H5_SAMPLE = "windvane_h5_sample";
    public static final String WINDVANE_UC_T2_SAMPLE = "windvane_uc_t2_sample";

    private static float a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821d35c", new Object[]{new Boolean(z)})).floatValue() : z ? 1.0f : 0.0f;
    }

    public static void a(Map<String, String> map) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map == null || map.size() <= 0) {
        } else {
            try {
                float a2 = a();
                SharedPreferences sharedPreferences = e.a().b().getSharedPreferences("apm", 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                a(a2, map);
                boolean a3 = a(map, a2, sharedPreferences, edit);
                a(map, a2, a3);
                b(map, a2, a3, edit);
                c(map, a2, a3, edit);
                d(map, a2, a3, edit);
                b(map, a2, a3);
                c(map, a2, a3);
                d(map, a2, a3);
                e(map, a3, edit);
                a(map, a3, a2, sharedPreferences, edit);
                a(map, a3, sharedPreferences, edit);
                k(map, a3, edit);
                a(map, a3, edit);
                d.G = a3 && a(map, a2, edit, NEXT_LAUNCH_UPLOAD_SAMPLE);
                mpi.c("ApmConfigChaneHelper", NEXT_LAUNCH_UPLOAD_SAMPLE, Boolean.valueOf(d.G));
                if (a3 && !a(map, edit, NEED_WX_END_RUNTIME_INFO, d.y)) {
                    z = false;
                    d.y = z;
                    mpi.c("ApmConfigChaneHelper", NEED_WX_END_RUNTIME_INFO, Boolean.valueOf(d.y));
                    d.O = !a3 && a(map, a2, edit, MAIN_THREAD_MONITOR_SAMPLE);
                    mpi.c("ApmConfigChaneHelper", MAIN_THREAD_MONITOR_SAMPLE, Boolean.valueOf(d.O));
                    d.V = !a3 && a(map, a2, edit, BATTERY_CANARY_SAMPLE);
                    mpi.c("ApmConfigChaneHelper", BATTERY_CANARY_SAMPLE, Boolean.valueOf(d.V));
                    d.aa = b(map, a2, edit, BLOCK_STACK_SAMPLE, d.aa);
                    mpi.c("ApmConfigChaneHelper", BLOCK_STACK_SAMPLE, Boolean.valueOf(d.aa));
                    d.k = a(map, a2, edit, FILTERED_PAGE_TAG_SAMPLE, d.k);
                    mpi.c("ApmConfigChaneHelper", FILTERED_PAGE_TAG_SAMPLE, Boolean.valueOf(d.k));
                    d.c = a(map, edit, CLOSE_SAMPLE_ON_GREY, d.c);
                    mpi.c("ApmConfigChaneHelper", CLOSE_SAMPLE_ON_GREY, Boolean.valueOf(d.c));
                    d.h = !a3 && a(map, a2, edit, WINDVANE_H5_SAMPLE, d.h);
                    mpi.c("ApmConfigChaneHelper", WINDVANE_H5_SAMPLE, Boolean.valueOf(d.h));
                    d.i = !a3 && a(map, a2, edit, WINDVANE_UC_T2_SAMPLE, d.i);
                    mpi.c("ApmConfigChaneHelper", WINDVANE_UC_T2_SAMPLE, Boolean.valueOf(d.i));
                    d.ad = !a3 && a(map, a2, edit, LOOPER_OBSERVER_SAMPLE, d.ad);
                    mpi.c("ApmConfigChaneHelper", LOOPER_OBSERVER_SAMPLE, Boolean.valueOf(d.ad));
                    d.aj = !a3 && a(map, edit, NEED_PAGE_PSS, d.aj);
                    mpi.c("ApmConfigChaneHelper", NEED_PAGE_PSS, Boolean.valueOf(d.aj));
                    ProcedureGlobal.a().b(map.get(SUBTASK_SAMPLE));
                    edit.apply();
                }
                z = true;
                d.y = z;
                mpi.c("ApmConfigChaneHelper", NEED_WX_END_RUNTIME_INFO, Boolean.valueOf(d.y));
                d.O = !a3 && a(map, a2, edit, MAIN_THREAD_MONITOR_SAMPLE);
                mpi.c("ApmConfigChaneHelper", MAIN_THREAD_MONITOR_SAMPLE, Boolean.valueOf(d.O));
                d.V = !a3 && a(map, a2, edit, BATTERY_CANARY_SAMPLE);
                mpi.c("ApmConfigChaneHelper", BATTERY_CANARY_SAMPLE, Boolean.valueOf(d.V));
                d.aa = b(map, a2, edit, BLOCK_STACK_SAMPLE, d.aa);
                mpi.c("ApmConfigChaneHelper", BLOCK_STACK_SAMPLE, Boolean.valueOf(d.aa));
                d.k = a(map, a2, edit, FILTERED_PAGE_TAG_SAMPLE, d.k);
                mpi.c("ApmConfigChaneHelper", FILTERED_PAGE_TAG_SAMPLE, Boolean.valueOf(d.k));
                d.c = a(map, edit, CLOSE_SAMPLE_ON_GREY, d.c);
                mpi.c("ApmConfigChaneHelper", CLOSE_SAMPLE_ON_GREY, Boolean.valueOf(d.c));
                d.h = !a3 && a(map, a2, edit, WINDVANE_H5_SAMPLE, d.h);
                mpi.c("ApmConfigChaneHelper", WINDVANE_H5_SAMPLE, Boolean.valueOf(d.h));
                d.i = !a3 && a(map, a2, edit, WINDVANE_UC_T2_SAMPLE, d.i);
                mpi.c("ApmConfigChaneHelper", WINDVANE_UC_T2_SAMPLE, Boolean.valueOf(d.i));
                d.ad = !a3 && a(map, a2, edit, LOOPER_OBSERVER_SAMPLE, d.ad);
                mpi.c("ApmConfigChaneHelper", LOOPER_OBSERVER_SAMPLE, Boolean.valueOf(d.ad));
                d.aj = !a3 && a(map, edit, NEED_PAGE_PSS, d.aj);
                mpi.c("ApmConfigChaneHelper", NEED_PAGE_PSS, Boolean.valueOf(d.aj));
                ProcedureGlobal.a().b(map.get(SUBTASK_SAMPLE));
                edit.apply();
            } catch (Throwable th) {
                mpi.c("ApmConfigChaneHelper", th);
            }
        }
    }

    private static void a(Map<String, String> map, boolean z, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f97a72", new Object[]{map, new Boolean(z), editor});
        } else if (!map.containsKey(FIX_LEAK)) {
        } else {
            String str = map.get(FIX_LEAK);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            editor.putBoolean(FIX_LEAK, Boolean.parseBoolean(str));
        }
    }

    private static void k(Map<String, String> map, boolean z, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d94a4fc", new Object[]{map, new Boolean(z), editor});
        } else if (!map.containsKey(USE_NEW_STANDARD)) {
        } else {
            String str = map.get(USE_NEW_STANDARD);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            editor.putBoolean(USE_NEW_STANDARD, Boolean.parseBoolean(str));
        }
    }

    private static boolean a(Map<String, String> map, float f, SharedPreferences.Editor editor, String str, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ee3130", new Object[]{map, new Float(f), editor, str, new Boolean(z)})).booleanValue();
        }
        if (f >= mqe.a((Object) map.get(str), a(z))) {
            z2 = false;
        }
        editor.putBoolean(str, z2);
        return z2;
    }

    private static boolean a(Map<String, String> map, float f, SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11bd56ac", new Object[]{map, new Float(f), editor, str})).booleanValue();
        }
        if (f >= mqe.a((Object) map.get(str), 1.0f)) {
            z = false;
        }
        editor.putBoolean(str, z);
        return z;
    }

    private static boolean a(Map<String, String> map, SharedPreferences.Editor editor, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12cac696", new Object[]{map, editor, str, new Boolean(z)})).booleanValue();
        }
        if (!map.containsKey(str)) {
            return z;
        }
        String str2 = map.get(str);
        if (TextUtils.isEmpty(str2)) {
            return z;
        }
        boolean equals = "true".equals(str2);
        editor.putBoolean(str, equals);
        return equals;
    }

    private static boolean b(Map<String, String> map, float f, SharedPreferences.Editor editor, String str, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("549f9b4f", new Object[]{map, new Float(f), editor, str, new Boolean(z)})).booleanValue();
        }
        if (map.containsKey(str)) {
            String str2 = map.get(str);
            if ("0".equals(str2)) {
                editor.putBoolean(str, false);
                mpi.c("ApmConfigChaneHelper", "Config shut down immediately", str, false);
                return false;
            }
            boolean z3 = f < mqe.a((Object) str2, a(false));
            editor.putBoolean(str, z3);
            mpi.c("ApmConfigChaneHelper", "save config and next launch work", str, Boolean.valueOf(z3));
            return z;
        }
        if (!e.a().h() && !e.a().i()) {
            z2 = false;
        }
        editor.putBoolean(str, z2);
        return z2;
    }

    private static float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[0])).floatValue();
        }
        float nextFloat = new Random(System.currentTimeMillis()).nextFloat();
        mpi.c("ApmConfigChaneHelper", "computeRandomSample", Float.valueOf(nextFloat));
        return nextFloat;
    }

    private static void a(float f, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3213982d", new Object[]{new Float(f), map});
            return;
        }
        try {
            str = new JSONObject(map).toString();
        } catch (Exception unused) {
            str = "";
        }
        mpi.c("ApmConfigChaneHelper", "orangeConfig", str);
    }

    private static boolean a(Map<String, String> map, float f, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83da8860", new Object[]{map, new Float(f), sharedPreferences, editor})).booleanValue();
        }
        boolean z = sharedPreferences.getBoolean(GLOBAL_SAMPLE, true);
        boolean z2 = f < mqe.a((Object) map.get(GLOBAL_SAMPLE), 1.0f);
        if (z2 != z) {
            editor.putBoolean(GLOBAL_SAMPLE, z2);
        }
        mpi.c("ApmConfigChaneHelper", GLOBAL_SAMPLE, Boolean.valueOf(z2));
        return z2;
    }

    @Deprecated
    private static void a(Map<String, String> map, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21341f1", new Object[]{map, new Float(f), new Boolean(z)});
            return;
        }
        mms.d = f < mqe.a((Object) map.get(NETWORK_SAMPLE), 1.0f) && z;
        mpi.c("ApmConfigChaneHelper", NETWORK_SAMPLE, Boolean.valueOf(mms.d));
    }

    @Deprecated
    private static void b(Map<String, String> map, float f, boolean z, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4853b6b", new Object[]{map, new Float(f), new Boolean(z), editor});
            return;
        }
        d.m = f < mqe.a((Object) map.get(LAUNCHER_PROCESSOR_SAMPLE), 1.0f) && z;
        editor.putBoolean(LAUNCHER_PROCESSOR_SAMPLE, d.m);
        mpi.c("ApmConfigChaneHelper", LAUNCHER_PROCESSOR_SAMPLE, Boolean.valueOf(d.m));
    }

    @Deprecated
    private static void c(Map<String, String> map, float f, boolean z, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e63f4a", new Object[]{map, new Float(f), new Boolean(z), editor});
            return;
        }
        d.d = f < mqe.a((Object) map.get(PAGE_LOAD_SAMPLE), 1.0f) && z;
        editor.putBoolean(PAGE_LOAD_SAMPLE, d.d);
        mpi.c("ApmConfigChaneHelper", PAGE_LOAD_SAMPLE, Boolean.valueOf(d.d));
    }

    @Deprecated
    private static void d(Map<String, String> map, float f, boolean z, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1474329", new Object[]{map, new Float(f), new Boolean(z), editor});
            return;
        }
        d.o = f < mqe.a((Object) map.get(FRAGMENT_PAGE_LOAD_SAMPLE), 1.0f) && z;
        editor.putBoolean(FRAGMENT_PAGE_LOAD_SAMPLE, d.o);
        mpi.c("ApmConfigChaneHelper", FRAGMENT_PAGE_LOAD_SAMPLE, Boolean.valueOf(d.o));
    }

    @Deprecated
    private static void b(Map<String, String> map, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5898fc90", new Object[]{map, new Float(f), new Boolean(z)});
            return;
        }
        d.f = f < mqe.a((Object) map.get(NETWORK_PROCESSOR_SAMPLE), 1.0f) && z;
        mpi.c("ApmConfigChaneHelper", NETWORK_PROCESSOR_SAMPLE, Boolean.valueOf(d.f));
    }

    @Deprecated
    private static void c(Map<String, String> map, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1eb72f", new Object[]{map, new Float(f), new Boolean(z)});
            return;
        }
        d.e = f < mqe.a((Object) map.get(IMAGE_PROCESSOR_SAMPLE), 1.0f) && z;
        mpi.c("ApmConfigChaneHelper", IMAGE_PROCESSOR_SAMPLE, Boolean.valueOf(d.e));
    }

    @Deprecated
    private static void d(Map<String, String> map, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a471ce", new Object[]{map, new Float(f), new Boolean(z)});
            return;
        }
        d.g = f < mqe.a((Object) map.get(WEEX_PROCESSOR_SAMPLE), 1.0f) && z;
        mpi.c("ApmConfigChaneHelper", WEEX_PROCESSOR_SAMPLE, Boolean.valueOf(d.g));
    }

    @Deprecated
    private static void e(Map<String, String> map, boolean z, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8378b76", new Object[]{map, new Boolean(z), editor});
        } else if (!z) {
            d.v = false;
            editor.putBoolean(NEED_RUNTIME_INFO, false);
        } else {
            if (map.containsKey(NEED_RUNTIME_INFO)) {
                d.v = "true".equals(map.get(NEED_RUNTIME_INFO));
                editor.putBoolean(NEED_RUNTIME_INFO, d.v);
            }
            mpi.c("ApmConfigChaneHelper", NEED_RUNTIME_INFO, Boolean.valueOf(d.v));
        }
    }

    @Deprecated
    private static void a(Map<String, String> map, boolean z, float f, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf51d16", new Object[]{map, new Boolean(z), new Float(f), sharedPreferences, editor});
        } else if (!z) {
            mna.a();
            editor.putString(SPECIAL_PAGE_SAMPLE, "");
        } else {
            String str = map.get(SPECIAL_PAGE_SAMPLE);
            try {
                mna.a();
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split(",");
                    if (split.length > 0) {
                        for (String str2 : split) {
                            String[] split2 = str2.split(":");
                            if (split2.length == 2 && f < mqe.a((Object) split2[1], 0.0f)) {
                                mna.a(split2[0]);
                                mpi.c("ApmConfigChaneHelper", SPECIAL_PAGE_SAMPLE, split2[0]);
                            }
                        }
                    }
                }
                if (str.equals(sharedPreferences.getString(SPECIAL_PAGE_SAMPLE, ""))) {
                    return;
                }
                editor.putString(SPECIAL_PAGE_SAMPLE, str);
            } catch (Exception e) {
                mpi.c("ApmConfigChaneHelper", "special_page_sample add error", e.getMessage());
            }
        }
    }

    @Deprecated
    private static void a(Map<String, String> map, boolean z, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dade7dc8", new Object[]{map, new Boolean(z), sharedPreferences, editor});
            return;
        }
        String str = map.get("isApm");
        boolean z2 = TextUtils.isEmpty(str) || !str.equalsIgnoreCase("close");
        boolean z3 = sharedPreferences.getBoolean("isApm", true);
        if (z2 != z3) {
            editor.putBoolean("isApm", z2);
        }
        mpi.c("ApmConfigChaneHelper", "isApm", Boolean.valueOf(z3));
    }
}
