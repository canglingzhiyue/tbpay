package com.taobao.android.dinamic;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.fpb;
import tb.fpr;
import tb.kge;

/* loaded from: classes.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Dinamic";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11744a;
    private static Map<String, m> b;
    private static boolean c;
    private static Context d;

    static {
        kge.a(1089428284);
        f11744a = false;
        b = new HashMap();
        c = false;
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else if (c) {
        } else {
            f11744a = z;
            d = context.getApplicationContext();
            b.put("default", m.a("default"));
            fpb.a("monitor");
            c = true;
        }
    }

    public static m a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("c5827119", new Object[]{str});
        }
        if (b.containsKey(str)) {
            return b.get(str);
        }
        m a2 = m.a(str);
        b.put(str, a2);
        return a2;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f11744a;
    }

    public static com.taobao.android.dinamic.dinamic.h b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamic.dinamic.h) ipChange.ipc$dispatch("54de649d", new Object[]{str}) : DinamicViewHelper.getViewConstructor(str);
    }

    public static com.taobao.android.dinamic.dinamic.d c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamic.dinamic.d) ipChange.ipc$dispatch("5ae22f80", new Object[]{str}) : DinamicViewHelper.getEventHandler(str);
    }

    public static Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[0]) : d;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            d = context;
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        try {
            boolean b2 = fpr.b();
            if (a()) {
                String str = "Dinamic processWindowChanged checkRet" + b2;
            }
            if (!b2 && !z) {
                return;
            }
            fpr.a();
        } catch (Exception e) {
            if (!a()) {
                return;
            }
            e.printStackTrace();
        }
    }
}
