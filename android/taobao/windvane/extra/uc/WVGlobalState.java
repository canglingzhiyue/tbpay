package android.taobao.windvane.extra.uc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVGlobalState {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean sUrlHasBeenLoaded;

    static {
        kge.a(-1920657039);
        sUrlHasBeenLoaded = false;
    }

    private WVGlobalState() {
    }

    public static boolean urlHasBeenLoaded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5e3c2e7", new Object[0])).booleanValue() : sUrlHasBeenLoaded;
    }

    public static void markLoadUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb0eda3", new Object[0]);
        } else {
            sUrlHasBeenLoaded = true;
        }
    }
}
