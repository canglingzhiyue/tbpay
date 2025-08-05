package com.alipay.mobile.verifyidentity.module.internal.password.pay.customized;

import android.app.Activity;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.ui.IPaySafeInputWidget;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PwdInputAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public VISafeInputInterface getVISafeInput(Activity activity, boolean z, String str, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VISafeInputInterface) ipChange.ipc$dispatch("f607522b", new Object[]{this, activity, new Boolean(z), str, new Boolean(z2), str2}) : (z || !z2 || !str2.equals("full")) ? new VISafeInput(activity, z) : new IPaySafeInputWidget(activity);
    }
}
