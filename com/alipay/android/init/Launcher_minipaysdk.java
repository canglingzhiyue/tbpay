package com.alipay.android.init;

import android.app.Application;
import com.alipay.android.msp.framework.helper.MspByPassHelperForTB;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class Launcher_minipaysdk implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            MspByPassHelperForTB.processByPassOnStartUp(application);
        } catch (Throwable unused) {
        }
    }
}
