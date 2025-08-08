package org.webrtc;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class ConStringUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ConStringUtils";
    private static Context applicationContext;

    static {
        kge.a(1293804793);
    }

    public static void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
        } else if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null for ConStringUtils.initialize.");
        } else {
            applicationContext = context;
        }
    }

    @Deprecated
    public static Context getApplicationContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c5c75d34", new Object[0]) : applicationContext;
    }
}
