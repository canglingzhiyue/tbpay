package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.adapter.TBAPMAdapterLauncherPart2;
import java.util.HashMap;

/* loaded from: classes.dex */
public class g extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public g(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else {
            new TBAPMAdapterLauncherPart2().init(application, hashMap);
        }
    }
}
