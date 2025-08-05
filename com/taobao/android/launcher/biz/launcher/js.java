package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.guc;

/* loaded from: classes5.dex */
public class js extends com.taobao.android.launcher.biz.task.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public js(String str) {
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
        new com.taobao.tao.homepage.launcher.q().a(application, hashMap);
        if (guc.a(application, "minKernelDXMerged")) {
            com.taobao.android.revisionswitch.a.a(application, hashMap);
        }
        new com.taobao.tao.homepage.launcher.e().a(application, hashMap);
        if (guc.a(application, "disableHomePrepareParamsLauncher")) {
            return;
        }
        new com.taobao.tao.homepage.launcher.k().a(application, hashMap);
    }
}
