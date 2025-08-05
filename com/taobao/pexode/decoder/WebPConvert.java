package com.taobao.pexode.decoder;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ihq;
import tb.ihy;
import tb.ihz;
import tb.kge;
import tb.qol;

/* loaded from: classes7.dex */
public class WebPConvert {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_RETRY_TIME = 2;
    private static boolean remoteSoValid;
    public static boolean sIsSoInstalled;
    private static int sRetryTime;

    public static native int nativeProcess(byte[] bArr, String str);

    public static native void nativeUseBugFix(boolean z);

    public static /* synthetic */ int access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue() : sRetryTime;
    }

    public static /* synthetic */ int access$008() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd46c372", new Object[0])).intValue();
        }
        int i = sRetryTime;
        sRetryTime = i + 1;
        return i;
    }

    public static /* synthetic */ void access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            loadRemoteSo(str);
        }
    }

    static {
        kge.a(1717718461);
        try {
            Class.forName("tb.ihq");
            remoteSoValid = true;
        } catch (Throwable th) {
            qol.h(com.taobao.pexode.d.TAG, "remote so module not import", th);
        }
        try {
            loadRemoteSo("dwebp");
        } catch (Throwable th2) {
            qol.h(com.taobao.pexode.d.TAG, "system load lib%s.so error=%s", "WebPConvert", th2);
        }
    }

    private static void loadRemoteSo(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8840d9", new Object[]{str});
            return;
        }
        qol.h(com.taobao.pexode.d.TAG, "start load remote lib%s.so status=%b index=%d remoteSoValid=%b", str, Boolean.valueOf(sIsSoInstalled), Integer.valueOf(sRetryTime), Boolean.valueOf(remoteSoValid));
        if (remoteSoValid) {
            ihq.a().a(str, new ihy() { // from class: com.taobao.pexode.decoder.WebPConvert.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihy
                public void onLoadFinished(ihz ihzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                        return;
                    }
                    WebPConvert.sIsSoInstalled = ihzVar != null && ihzVar.g();
                    qol.h(com.taobao.pexode.d.TAG, "load remote lib%s.so finish status=%b index=%d", str, Boolean.valueOf(WebPConvert.sIsSoInstalled), Integer.valueOf(WebPConvert.access$000()));
                    if (WebPConvert.sIsSoInstalled || WebPConvert.access$000() >= 2) {
                        return;
                    }
                    WebPConvert.access$008();
                    WebPConvert.access$100(str);
                }
            });
            return;
        }
        System.loadLibrary("dwebp");
        sIsSoInstalled = true;
        qol.f(com.taobao.pexode.d.TAG, "system load lib%s.so result=%b", "WebPConvert", Boolean.valueOf(sIsSoInstalled));
    }
}
