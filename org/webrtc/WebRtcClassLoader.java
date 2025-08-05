package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class WebRtcClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1834609831);
    }

    public static Object getClassLoader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4366ca36", new Object[0]) : WebRtcClassLoader.class.getClassLoader();
    }
}
