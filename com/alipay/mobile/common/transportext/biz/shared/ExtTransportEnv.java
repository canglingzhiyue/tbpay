package com.alipay.mobile.common.transportext.biz.shared;

import android.content.Context;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class ExtTransportEnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Context f5695a;

    public static final void setAppContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0c5cd1", new Object[]{context});
        } else {
            f5695a = context.getApplicationContext();
        }
    }

    public static final Context getAppContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[0]);
        }
        if (f5695a == null) {
            f5695a = TransportEnvUtil.getContext();
        }
        return f5695a;
    }
}
