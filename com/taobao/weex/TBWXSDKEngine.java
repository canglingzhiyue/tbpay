package com.taobao.weex;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class TBWXSDKEngine implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1722641394);
        kge.a(1028243835);
    }

    public static void initSDKEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1172673", new Object[0]);
        } else {
            j.a(null, false, false, false, null);
        }
    }

    public static void initSDKEngine(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ce5ac1", new Object[]{new Boolean(z)});
        } else {
            initSDKEngine(z, false);
        }
    }

    public static void initSDKEngine(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fdb033", new Object[]{new Boolean(z), new Boolean(z2)});
        } else {
            j.a(null, false, z, z2, null);
        }
    }
}
