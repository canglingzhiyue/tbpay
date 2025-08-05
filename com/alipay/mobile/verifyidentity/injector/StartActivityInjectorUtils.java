package com.alipay.mobile.verifyidentity.injector;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class StartActivityInjectorUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static StartActivityInjector f5873a;

    public static void setStartActivityInjector(StartActivityInjector startActivityInjector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3788ed6b", new Object[]{startActivityInjector});
        } else {
            f5873a = startActivityInjector;
        }
    }

    public static boolean injectorHandled(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b30190b0", new Object[]{intent})).booleanValue();
        }
        StartActivityInjector startActivityInjector = f5873a;
        if (startActivityInjector == null) {
            return false;
        }
        return startActivityInjector.startActivity(intent);
    }
}
