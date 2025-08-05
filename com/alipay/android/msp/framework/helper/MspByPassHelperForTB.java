package com.alipay.android.msp.framework.helper;

import android.content.Context;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspByPassHelperForTB {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void processByPassOnStartUp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6f6d5a", new Object[]{context});
            return;
        }
        if (GlobalHelper.getInstance().getContext() == null) {
            GlobalHelper.getInstance().init(context);
        }
        MspByPassProcessor.getInstance().triggerByPassProcess(LogItem.TemplateUpdateScene.MpassIDEL);
    }
}
