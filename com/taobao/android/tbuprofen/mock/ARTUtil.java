package com.taobao.android.tbuprofen.mock;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.h;
import com.taobao.android.tbuprofen.log.c;
import tb.kge;

/* loaded from: classes6.dex */
public class ARTUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERR_INVALID_LOCK_STATE = -2;
    public static final int ERR_NONE = 0;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15493a;

    private static native void enterGCCriticalSectionNative();

    private static native void exitGCCriticalSectionNative();

    private static native void exitProcessNative();

    private static native int forkProcessNative(boolean z, String str, int i);

    private static native int getMutatorLockStateNative();

    private static native void resumeAllNative();

    private static native void suspendAllNative();

    private static native void testNative();

    private static native int waitChildProcessNative(int i);

    static {
        kge.a(1928237049);
        f15493a = false;
        try {
            if (!StringUtils.isEmpty(h.b().a("tbuprofen-util"))) {
                return;
            }
            f15493a = true;
        } catch (Throwable unused) {
            c.a("TBUPROF", "Failed to load tbuprofen-util", new Object[0]);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f15493a;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (f15493a) {
            return getMutatorLockStateNative();
        }
        return -2;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!f15493a) {
        } else {
            enterGCCriticalSectionNative();
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (!f15493a) {
        } else {
            exitGCCriticalSectionNative();
        }
    }
}
