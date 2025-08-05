package com.alibaba.secutiry.mnn.pykit;

import android.content.Context;
import com.alibaba.security.ccrc.service.build.Xb;
import com.alibaba.security.client.smart.core.core.WuKongNativeManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PythonKitManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!WuKongNativeManager.a().b()) {
            WuKongNativeManager.a().a(new Xb());
        } else {
            nPyKitInit();
        }
    }

    public static native void nPyKitInit();
}
