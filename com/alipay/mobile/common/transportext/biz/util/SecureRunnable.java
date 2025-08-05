package com.alipay.mobile.common.transportext.biz.util;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class SecureRunnable implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void call();

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            call();
        } catch (Exception e) {
            LogCatUtil.error("SecureRunnable", e);
        }
    }
}
