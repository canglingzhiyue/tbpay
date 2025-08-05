package com.alipay.vi.android.phone.mrpc.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class MiscUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RC_PACKAGE_NAME = "com.eg.android.AlipayGphoneRC";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f6205a;

    public static final boolean isDebugger(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4275d9a", new Object[]{context})).booleanValue();
        }
        Boolean bool = f6205a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f6205a = valueOf;
            return valueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
