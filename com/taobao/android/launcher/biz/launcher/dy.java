package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.alipay.android.init.Launcher_minipaysdk;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.gsl;

/* loaded from: classes.dex */
public class dy extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public dy(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        try {
            new Launcher_minipaysdk().init(application, hashMap);
        } catch (Exception e) {
            gsl.b("InitMiniPay", "InitMiniPay failed:", e);
        }
    }
}
