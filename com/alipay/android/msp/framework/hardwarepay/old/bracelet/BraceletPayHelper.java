package com.alipay.android.msp.framework.hardwarepay.old.bracelet;

import android.content.Context;
import com.alipay.android.msp.framework.hardwarepay.old.base.BaseCommonPayHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BraceletPayHelper extends BaseCommonPayHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static BraceletPayHelper hg;

    public abstract String[] getAuthInfo();

    public abstract int initHardwarePay(Context context, int i, String str);

    public abstract String process(int i, String str, int i2);

    public abstract void process(int i, int i2, String str, int i3, Object obj, Context context);

    public static BraceletPayHelper getInstance() {
        if (hg == null) {
            synchronized (BraceletPayHelper.class) {
                if (hg == null) {
                    hg = (BraceletPayHelper) Class.forName("com.alipay.android.app.hardwarepay.bracelet.impl.BraceletPayHelperImpl").newInstance();
                }
            }
        }
        return hg;
    }
}
