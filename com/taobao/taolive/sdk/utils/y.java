package com.taobao.taolive.sdk.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;
import tb.sgq;
import tb.sgr;

/* loaded from: classes8.dex */
public class y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(522048507);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : b(context) || c(context);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        sgq E = pmd.a().E();
        if (E == null) {
            return false;
        }
        return E.a(context);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        sgq E = pmd.a().E();
        if (E == null) {
            return false;
        }
        return E.b(context);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        sgq E = pmd.a().E();
        if (E == null) {
            return false;
        }
        return E.e(context);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        sgq E = pmd.a().E();
        if (E == null) {
            return false;
        }
        return E.f(context);
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{context})).intValue();
        }
        sgq E = pmd.a().E();
        if (E != null) {
            return E.c(context);
        }
        return b.b(context);
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2296a0d", new Object[]{context})).intValue();
        }
        sgq E = pmd.a().E();
        if (E != null) {
            return E.d(context);
        }
        return b.c(context);
    }

    public static void a(sgr sgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb2857a", new Object[]{sgrVar});
            return;
        }
        sgq E = pmd.a().E();
        if (E == null) {
            return;
        }
        E.a(sgrVar);
    }

    public static void b(sgr sgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed358bfb", new Object[]{sgrVar});
            return;
        }
        sgq E = pmd.a().E();
        if (E == null) {
            return;
        }
        E.b(sgrVar);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        sgq E = pmd.a().E();
        if (E == null) {
            return true;
        }
        return E.a();
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{context})).booleanValue();
        }
        sgq E = pmd.a().E();
        if (E == null) {
            return false;
        }
        return E.g(context);
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue();
        }
        sgq E = pmd.a().E();
        if (E == null) {
            return false;
        }
        return E.h(context);
    }
}
