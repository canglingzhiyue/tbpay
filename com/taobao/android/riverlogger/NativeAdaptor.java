package com.taobao.android.riverlogger;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public final class NativeAdaptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-966960472);
    }

    private static native void onPlatformAPICallbackNative(long j, boolean z, String str);

    private static native void setLogLevelNative(int i);

    public static /* synthetic */ void access$000(long j, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c34e051", new Object[]{new Long(j), new Boolean(z), str});
        } else {
            onPlatformAPICallbackNative(j, z, str);
        }
    }

    public static void setLogLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addbd37a", new Object[]{new Integer(i)});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        setLogLevelNative(i);
    }

    public static void openRemote(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1b22d9", new Object[]{str, str2, new Long(j)});
        } else {
            j.a(str, str2, wrapCallback(j));
        }
    }

    public static void openPageRelatedRemote(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d908f231", new Object[]{str, str2, new Long(j)});
        } else {
            j.b(str, str2, wrapCallback(j));
        }
    }

    private static h wrapCallback(final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("ca74a575", new Object[]{new Long(j)});
        }
        if (j != 0) {
            return new h() { // from class: com.taobao.android.riverlogger.NativeAdaptor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.riverlogger.h
                public void a(boolean z, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
                    } else {
                        NativeAdaptor.access$000(j, z, str);
                    }
                }
            };
        }
        return null;
    }

    public static void closeRemote() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c138de5", new Object[0]);
        } else {
            j.a();
        }
    }

    public static void log(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508f0fac", new Object[]{new Integer(i), str, str2});
        } else {
            e.a(RVLLevel.valueOf(i, RVLLevel.Verbose), str, str2);
        }
    }

    public static void logInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b68b08", new Object[]{new Integer(i), str, str2, str3, str4, str5, str6, new Long(j), str7});
            return;
        }
        d dVar = new d(RVLLevel.valueOf(i, RVLLevel.Verbose), str, j);
        dVar.j = true;
        dVar.a(str2);
        dVar.b(str3);
        dVar.c(str4);
        if (dVar.a((Object) str5)) {
            dVar.g = str6;
        }
        dVar.i = str7;
        e.a(dVar);
    }
}
