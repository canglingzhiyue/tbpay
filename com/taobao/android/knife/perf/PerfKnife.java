package com.taobao.android.knife.perf;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ihq;

/* loaded from: classes5.dex */
public class PerfKnife {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f13007a = new AtomicBoolean(false);

    private static native int autoBindBigCoreNative();

    private static native int bindBigCoreNative(int[] iArr);

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!ABGlobal.isFeatureOpened(null, "enableBindBigCore")) {
            Log.e("PerfKnife", "the feature of enableBindBigCore is off");
            return false;
        }
        if (ihq.a().b("perfKnife").g()) {
            f13007a.compareAndSet(false, true);
        }
        return f13007a.get();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (!f13007a.get()) {
            return -1;
        }
        return autoBindBigCoreNative();
    }
}
