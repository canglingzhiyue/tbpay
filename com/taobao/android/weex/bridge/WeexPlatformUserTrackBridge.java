package com.taobao.android.weex.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.util.WeexAppMonitor;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_framework.util.o;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexPlatformUserTrackBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1632134486);
        kge.a(1028243835);
    }

    public static void AppMonitorCommitPerformance(final int i, final WeexValue weexValue, final WeexValue weexValue2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c1577c", new Object[]{new Integer(i), weexValue, weexValue2});
            return;
        }
        try {
            j.c(new o() { // from class: com.taobao.android.weex.bridge.WeexPlatformUserTrackBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    WeexAppMonitor.Performance.Point fromInt = WeexAppMonitor.Performance.Point.fromInt(i);
                    if (fromInt == null) {
                        return;
                    }
                    fromInt.commit(weexValue, weexValue2);
                }
            });
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static void AppMonitorCommitAvailableSuccess(final int i, final WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c482637a", new Object[]{new Integer(i), weexValue});
            return;
        }
        try {
            j.c(new o() { // from class: com.taobao.android.weex.bridge.WeexPlatformUserTrackBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    WeexAppMonitor.Avail.Point fromInt = WeexAppMonitor.Avail.Point.fromInt(i);
                    if (fromInt == null) {
                        return;
                    }
                    fromInt.commitSuccess(weexValue);
                }
            });
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static void AppMonitorCommitAvailableFail(final int i, final WeexValue weexValue, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eec6cfb", new Object[]{new Integer(i), weexValue, str, str2});
            return;
        }
        try {
            j.c(new o() { // from class: com.taobao.android.weex.bridge.WeexPlatformUserTrackBridge.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    WeexAppMonitor.Avail.Point fromInt = WeexAppMonitor.Avail.Point.fromInt(i);
                    if (fromInt == null) {
                        return;
                    }
                    fromInt.commitFail(weexValue, str, str2);
                }
            });
        } catch (Throwable th) {
            g.a(th);
        }
    }
}
