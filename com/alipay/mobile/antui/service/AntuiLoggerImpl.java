package com.alipay.mobile.antui.service;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AntuiLoggerImpl implements IAntuiLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.antui.service.IAntuiLogger
    public void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.mobile.antui.service.IAntuiLogger
    public void info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.mobile.antui.service.IAntuiLogger
    public void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
        } else {
            Log.e(str, str2);
        }
    }
}
