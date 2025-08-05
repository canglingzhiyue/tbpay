package com.taobao.android.weex.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.r;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_framework.util.o;
import java.io.Serializable;
import tb.dpl;
import tb.jvm;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexPlatformDownLoadBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2146118800);
        kge.a(1028243835);
    }

    private static native void nativeDownloadFail(long j, String str, String str2, long j2);

    private static native void nativeDownloadSuccess(long j, byte[] bArr, boolean z, String str, long j2);

    public static /* synthetic */ void access$000(WeexInstanceImpl weexInstanceImpl, String str, boolean z, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b3928f", new Object[]{weexInstanceImpl, str, new Boolean(z), new Long(j), new Long(j2), new Long(j3)});
        } else {
            downloadInternal(weexInstanceImpl, str, z, j, j2, j3);
        }
    }

    public static void ClearCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9c2a26", new Object[]{str});
            return;
        }
        try {
            dpl.a().c(str);
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static WeexValue GetLegacyCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("e89597f0", new Object[]{str});
        }
        try {
            jvm.c d = ((dpl) dpl.a()).d(str);
            if (d != null) {
                return WeexValueImpl.ofArrayBuffer(d.a());
            }
            return null;
        } catch (Throwable th) {
            g.a(th);
            return null;
        }
    }

    public static void DownloadScript(final WeexInstanceImpl weexInstanceImpl, final String str, final boolean z, boolean z2, final long j, final long j2, final long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87edf542", new Object[]{weexInstanceImpl, str, new Boolean(z), new Boolean(z2), new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        o oVar = new o() { // from class: com.taobao.android.weex.bridge.WeexPlatformDownLoadBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    WeexPlatformDownLoadBridge.access$000(WeexInstanceImpl.this, str, z, j, j2, j3);
                }
            }
        };
        if (z2) {
            j.c(oVar);
        } else {
            oVar.run();
        }
    }

    private static void downloadInternal(WeexInstanceImpl weexInstanceImpl, String str, boolean z, final long j, final long j2, final long j3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f29884", new Object[]{weexInstanceImpl, str, new Boolean(z), new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        r rVar = new r(str, str);
        if (weexInstanceImpl != null) {
            i = weexInstanceImpl.getInstanceId();
        }
        rVar.a(i);
        dpl.a().b(str, null, null, z, rVar, new jvm.a() { // from class: com.taobao.android.weex.bridge.WeexPlatformDownLoadBridge.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jvm.a
            public void a(jvm.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("850799b8", new Object[]{this, cVar});
                } else {
                    WeexPlatformDownLoadBridge.DownloadSuccess(j2, cVar.a(), cVar.d(), cVar.e(), j);
                }
            }

            @Override // tb.jvm.a
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                } else {
                    WeexPlatformDownLoadBridge.DownloadFail(j3, str2, str3, j);
                }
            }
        });
    }

    public static void DownloadSuccess(long j, byte[] bArr, boolean z, String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fa5a6f", new Object[]{new Long(j), bArr, new Boolean(z), str, new Long(j2)});
            return;
        }
        try {
            nativeDownloadSuccess(j, bArr, z, str, j2);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }

    public static void DownloadFail(long j, String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de7a399", new Object[]{new Long(j), str, str2, new Long(j2)});
            return;
        }
        try {
            nativeDownloadFail(j, str, str2, j2);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }
}
