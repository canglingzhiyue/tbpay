package com.alipay.android.msp.framework.hardwarepay.old.fingerprint;

import android.content.Context;
import com.alipay.android.msp.framework.hardwarepay.old.base.BaseCommonPayHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class FingerprintPayHelper extends BaseCommonPayHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static FingerprintPayHelper hn;

    public abstract void cancel();

    public abstract int checkUserStatus(String str);

    public abstract String[] getAuthInfo();

    public abstract int initHardwarePay(Context context, int i, String str);

    public abstract String process(int i, String str, int i2);

    public abstract void process(int i, int i2, String str, int i3, Object obj, Context context);

    public abstract int registedFingerPrintNumber();

    public static FingerprintPayHelper getInstance() {
        if (hn == null) {
            synchronized (FingerprintPayHelper.class) {
                if (hn == null) {
                    hn = (FingerprintPayHelper) Class.forName("com.alipay.android.app.hardwarepay.fingerprint.impl.FingerprintPayHelperImpl").newInstance();
                }
            }
        }
        return hn;
    }
}
