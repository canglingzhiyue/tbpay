package com.taobao.android.tbuprofen.mock;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.common.d;
import com.taobao.android.tbuprofen.f;
import com.taobao.android.tbuprofen.h;
import com.taobao.android.tbuprofen.log.TBPLogLevel;
import com.taobao.android.tbuprofen.log.a;
import com.taobao.android.tbuprofen.log.c;
import tb.kge;

/* loaded from: classes6.dex */
public class RuntimeMockUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15495a;
    private static boolean b;
    private static f c;
    private static boolean d;
    private static boolean e;

    private static native int findHeapFootprint();

    private static native int findRuntimeDebugFlag();

    private static native boolean isJavaDebuggableNative();

    private static native int nativeInit(int i, int i2, long j);

    private static native void restoreFootprintNative();

    private static native long setIdealFootprintDirectNative(long j);

    private static native long setIdealFootprintNative(long j);

    private static native boolean setJavaDebuggableNative(boolean z);

    private static native void setMockLogLevel(int i);

    static {
        kge.a(-718347301);
        f15495a = false;
        b = false;
        c = new a();
        d = true;
        e = false;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue() : a(context, TBPLogLevel.DEBUG, null);
    }

    public static int a(Context context, TBPLogLevel tBPLogLevel, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c0b7546", new Object[]{context, tBPLogLevel, fVar})).intValue();
        }
        if (f15495a) {
            return 0;
        }
        try {
            if (!TextUtils.isEmpty(h.b().a("tbuprofen-util"))) {
                return -100;
            }
            if (fVar != null) {
                c = fVar;
            }
            setMockLogLevel(tBPLogLevel.ordinal());
            int i = -1;
            int i2 = context.getApplicationInfo().targetSdkVersion;
            int i3 = Build.VERSION.SDK_INT;
            long maxMemory = Runtime.getRuntime().maxMemory();
            c.c("RuntimeMockUtils", "Init Mock tools on SDK: %s, Target version: %d. Heap max size: %dM", Integer.valueOf(i3), Integer.valueOf(i2), Long.valueOf(maxMemory >> 20));
            try {
                i = nativeInit(i2, i3, maxMemory);
            } catch (Throwable th) {
                c.a("RuntimeMockUtils", th, "Exception to init RuntimeMock native.", new Object[0]);
                f15495a = false;
            }
            if (i != 0) {
                c.a("RuntimeMockUtils", "Failed to init RuntimeMock native", new Object[0]);
                f15495a = false;
                return i;
            }
            f15495a = true;
            return i;
        } catch (Exception unused) {
            return -100;
        }
    }

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!f15495a) {
            c.b("RuntimeMockUtils", "Trying to call setJavaDebuggable() without init", new Object[0]);
            return false;
        }
        try {
            return setJavaDebuggableNative(z);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!f15495a) {
            c.b("RuntimeMockUtils", "Trying to call setJavaDebuggable() without init", new Object[0]);
            return false;
        }
        try {
            return isJavaDebuggableNative();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        c.d("RuntimeMockUtils", "mockRuntimeDebugFlag....", new Object[0]);
        try {
            if (findRuntimeDebugFlag() != 0) {
                c.a(f.ERR_RUNTIME_MOCK_FIND, "");
                c.a("RuntimeMockUtils", "Failed to set java debuggable!", new Object[0]);
                return false;
            }
            if (!a()) {
                if (!a(true)) {
                    c.a(f.ERR_RUNTIME_MOCK_MODIFY, "");
                    c.a("RuntimeMockUtils", "Failed to set java debuggable!", new Object[0]);
                    return false;
                }
                b = true;
                c.c("RuntimeMockUtils", "Mock java debuggable successfully!!!", new Object[0]);
            }
            return true;
        } catch (Exception e2) {
            c.a(f.ERR_RUNTIME_MOCK_EXCEPTION, d.a(e2));
            e2.printStackTrace();
            c.a("RuntimeMockUtils", e2, "Failed to mockNoneDebuggable!!", new Object[0]);
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
        c.d("RuntimeMockUtils", "restore....", new Object[0]);
        return a(false);
    }

    public static int a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821974f", new Object[]{new Long(j)})).intValue();
        }
        if (!f15495a) {
            c.b("RuntimeMockUtils", "Trying to call setIdealFootprint() without init", new Object[0]);
            return -1;
        }
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (j > maxMemory) {
            j = maxMemory;
        }
        c.c(f.MOCK_TYPE_HEAP_FOOTPRINT);
        long j2 = Runtime.getRuntime().totalMemory();
        if ((Build.VERSION.SDK_INT < 29 || !d) && j2 >= j) {
            c.c("RuntimeMockUtils", "No need to set footprint from %d to %d.", Long.valueOf(j2), Long.valueOf(j));
            return 1;
        } else if ("HONOR".equals(Build.BOARD) && Build.VERSION.SDK_INT == 31) {
            setIdealFootprintDirectNative(j);
            return 2;
        } else if (e) {
            setIdealFootprintDirectNative(j);
            return 4;
        } else {
            int findHeapFootprint = findHeapFootprint();
            if (findHeapFootprint != 0) {
                c.b("RuntimeMockUtils", "Can't find the heap footprint. err: %d", Integer.valueOf(findHeapFootprint));
                c.b(f.MOCK_TYPE_HEAP_FOOTPRINT, String.valueOf(findHeapFootprint), "Find Error");
                return findHeapFootprint;
            }
            try {
                ARTUtil.c();
                long idealFootprintNative = setIdealFootprintNative(j);
                long j3 = Runtime.getRuntime().totalMemory();
                if (j3 != idealFootprintNative) {
                    e = true;
                    restoreFootprintNative();
                    if (idealFootprintNative < 0) {
                        c.a("RuntimeMockUtils", "setIdealFootprintNative failed %d", Long.valueOf(idealFootprintNative));
                    } else {
                        c.a("RuntimeMockUtils", "setIdealFootprintNative value %d different with totalMemory %d", Long.valueOf(j), Long.valueOf(j3));
                        idealFootprintNative = idealFootprintNative > j3 ? -2L : -3L;
                    }
                    long idealFootprintDirectNative = setIdealFootprintDirectNative(j);
                    if (idealFootprintDirectNative == 0) {
                        long j4 = Runtime.getRuntime().totalMemory();
                        if (j4 == j) {
                            idealFootprintNative = 3;
                        } else {
                            c.a("RuntimeMockUtils", "setIdealFootprintDirectNative value %d different with totalMemory %d", Long.valueOf(j), Long.valueOf(j4));
                            idealFootprintNative = -4;
                        }
                    } else {
                        c.a("RuntimeMockUtils", "setIdealFootprintDirectNative failed %d", Long.valueOf(idealFootprintDirectNative));
                    }
                    c.b(f.MOCK_TYPE_HEAP_FOOTPRINT, String.valueOf(idealFootprintNative), "Set Error");
                    return (int) idealFootprintNative;
                }
                c.a("RuntimeMockUtils", "totalMemory %d, ret %d", Long.valueOf(j3), Long.valueOf(idealFootprintNative));
                c.d(f.MOCK_TYPE_HEAP_FOOTPRINT);
                return 0;
            } finally {
                ARTUtil.d();
                d = false;
            }
        }
    }
}
