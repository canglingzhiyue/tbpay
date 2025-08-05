package com.alipay.mobile.verifyidentity.module.password.pay.customized;

import android.app.Activity;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.LongPwdInputWidget;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.SafeInputWidget;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PwdInputAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5920a = "PwdInputAdapter";

    public VISafeInputInterface getVISafeInput(Activity activity, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VISafeInputInterface) ipChange.ipc$dispatch("743c0b91", new Object[]{this, activity, new Boolean(z), str});
        }
        if ("myBank".equalsIgnoreCase(str)) {
            return a(activity, z);
        }
        return new VISafeInput(activity, z);
    }

    public VISafeInputInterface getVISafeInputForNew(Activity activity, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VISafeInputInterface) ipChange.ipc$dispatch("e4a28308", new Object[]{this, activity, new Boolean(z), str});
        }
        if ("myBank".equalsIgnoreCase(str)) {
            return a(activity, z);
        }
        if (z) {
            return new VISafeInput(activity, z);
        }
        return new LongPwdInputWidget(activity);
    }

    private static VISafeInputInterface a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VISafeInputInterface) ipChange.ipc$dispatch("a0fdc408", new Object[]{activity, new Boolean(z)});
        }
        String str = f5920a;
        VerifyLogCat.d(str, "MYBANK:" + z);
        return new SafeInputWidget(activity, z);
    }
}
