package com.alipay.mobile.common.amnet.api;

import android.content.Context;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class AmnetEnvHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Context CONTEXT;

    public static final void setAppContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0c5cd1", new Object[]{context});
        } else {
            CONTEXT = context;
        }
    }

    public static final Context getAppContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[0]);
        }
        if (CONTEXT == null) {
            CONTEXT = TransportEnvUtil.getContext();
        }
        return CONTEXT;
    }
}
