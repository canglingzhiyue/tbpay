package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class jw extends com.taobao.android.launcher.biz.task.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public jw(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        com.taobao.android.virtual_thread.adapter.tb.c.a(application, hashMap);
        new Thread(new Runnable() { // from class: com.taobao.android.launcher.biz.launcher.jw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                new ak("InitBasicParam").R_();
                new jy("InitMtopMin").R_();
                new jz("InitNetworkMin").R_();
            }
        }, "launcher-homeOpt").start();
        new gh("InitRevisionSwitch").R_();
        new jx("InitHomeThreadInitLauncher").R_();
        new jv("InitHomeFrameLauncher").R_();
        new jt("InitHomePreCreateNativeView").R_();
        new ci("InitHomeGatewayLauncher").R_();
    }
}
