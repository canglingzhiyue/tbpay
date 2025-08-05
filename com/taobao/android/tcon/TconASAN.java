package com.taobao.android.tcon;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes.dex */
public class TconASAN extends TconMallocBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static native void nativeAsanStart(String str, long j, long j2);

    public static /* synthetic */ boolean access$000(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e5d75dc5", new Object[]{str, new Long(j), new Long(j2)})).booleanValue() : startAsan(str, j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean init(android.app.Application r16) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tcon.TconASAN.init(android.app.Application):boolean");
    }

    private static boolean startAsan(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20aeeb36", new Object[]{str, new Long(j), new Long(j2)})).booleanValue();
        }
        nativeAsanStart(str, j, j2);
        replaceSystemMalloc();
        return true;
    }
}
