package com.taobao.android.tbuprofen.mock;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.common.d;
import com.taobao.android.tbuprofen.f;
import com.taobao.android.tbuprofen.log.c;
import tb.kge;

/* loaded from: classes6.dex */
public class JDWPMockUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15494a;
    private static boolean b;

    private static native int initNative();

    private static native boolean isJdwpAllowed();

    private static native boolean setJdwpAllowed(boolean z);

    static {
        kge.a(-1076445944);
        f15494a = false;
        b = false;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        try {
            if (f15494a) {
                return 0;
            }
            c.d("JDWPMockUtils", "init...", new Object[0]);
            int initNative = initNative();
            if (initNative != 0) {
                c.a("JDWPMockUtils", "Failed to init JDWP native", new Object[0]);
                return initNative;
            }
            f15494a = true;
            return initNative;
        } catch (Exception e) {
            c.a("JDWPMockUtils", "Exception to init JDWP native", new Object[0]);
            e.printStackTrace();
            return -1;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            if (f15494a) {
                return isJdwpAllowed();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        try {
            if (f15494a) {
                return setJdwpAllowed(z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f3a188e", new Object[]{fVar})).booleanValue();
        }
        c.d("JDWPMockUtils", "mock....", new Object[0]);
        try {
            int a2 = a();
            if (a2 != 0) {
                fVar.a(f.ERR_JDWP_MOCK_INIT, String.valueOf(a2));
                c.a("JDWPMockUtils", "Failed to init JDWPMockUtils!", new Object[0]);
                return false;
            }
            if (!b()) {
                if (!a(true)) {
                    fVar.a(f.ERR_JDWP_MOCK_MODIFY, "");
                    c.a("JDWPMockUtils", "Failed to set JDWP debuggable!", new Object[0]);
                    return false;
                }
                b = !b;
                c.c("JDWPMockUtils", "Mock jdwp debuggable successfully!!!", new Object[0]);
            }
            return true;
        } catch (Exception e) {
            fVar.a(f.ERR_JDWP_MOCK_EXCEPTION, d.a(e));
            e.printStackTrace();
            c.a("JDWPMockUtils", e, "Failed to mockNoneDebuggable!!", new Object[0]);
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (!b) {
            return true;
        }
        c.d("JDWPMockUtils", "restore....", new Object[0]);
        return a(false);
    }
}
