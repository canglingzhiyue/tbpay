package com.taobao.android.detail.core.perf;

import android.app.Activity;
import android.content.Context;
import com.alibaba.android.spindle.stage.StageType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.monitor.procedure.g;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_BIZ_NAME = "Page_Detail";

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<Activity, b> f9780a;

    static {
        kge.a(-1894158391);
        emu.a("com.taobao.android.detail.core.perf.StageTraceUtils");
        f9780a = new HashMap<>();
    }

    public static com.alibaba.android.spindle.stage.b a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.spindle.stage.b) ipChange.ipc$dispatch("7d0cfe15", new Object[]{context});
        }
        if (!(context instanceof a)) {
            return null;
        }
        return ((a) context).E();
    }

    public static boolean a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e36e85d2", new Object[]{activity, str, str2})).booleanValue() : a(activity, str, str2, StageType.STAGE_START);
    }

    public static boolean b(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6fe0a13", new Object[]{activity, str, str2})).booleanValue() : a(activity, str, str2, StageType.STAGE_END);
    }

    private static boolean a(Activity activity, String str, String str2, StageType stageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("278b6225", new Object[]{activity, str, str2, stageType})).booleanValue();
        }
        try {
            com.alibaba.android.spindle.stage.b a2 = a(activity);
            if (a2 == null) {
                return false;
            }
            a2.a(str, str2, stageType, activity);
            i.d("DetailTracing", "scene:" + str + " stage:" + str2 + " type=" + stageType.name());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Activity activity, String str, com.alibaba.android.spindle.stage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c2997e6", new Object[]{activity, str, aVar})).booleanValue();
        }
        try {
            com.alibaba.android.spindle.stage.b a2 = a(activity);
            if (a2 == null) {
                return false;
            }
            a2.a(str, aVar, activity);
            i.d("DetailTracing", "scene:" + str + " stage:" + aVar.f2422a + " timeCost=" + aVar.d);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Activity activity, String str, com.alibaba.android.spindle.stage.a aVar, g gVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("938d3ffb", new Object[]{activity, str, aVar, gVar, map})).booleanValue();
        }
        try {
            com.alibaba.android.spindle.stage.b a2 = a(activity);
            if (a2 == null) {
                return false;
            }
            a2.a(str, aVar, gVar, map);
            i.d("DetailTracing", "scene:" + str + " stage:" + aVar.f2422a + " timeCost=" + aVar.d);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        try {
            com.alibaba.android.spindle.stage.b a2 = a(context);
            if (a2 == null) {
                return false;
            }
            a2.a(str, str2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bbd7197", new Object[]{context, str, str2})).booleanValue();
        }
        try {
            com.alibaba.android.spindle.stage.b a2 = a(context);
            if (a2 == null) {
                return false;
            }
            a2.b(str, str2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            com.alibaba.android.spindle.stage.b a2 = a(context);
            if (a2 == null) {
                return false;
            }
            a2.b();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
