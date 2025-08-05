package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.LauncherInitWeex;
import com.taobao.weex.LauncherInitWeex2;
import com.taobao.weex.LauncherInitWeexTask;
import java.util.HashMap;
import tb.guc;

/* loaded from: classes.dex */
public class iw extends com.taobao.android.launcher.biz.task.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public iw(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        if (!guc.a(application, "weexOpt_weex1_delay")) {
            new LauncherInitWeex().init(application, hashMap);
        }
        if (!guc.a(application, "weexOpt_weex2_delay")) {
            LauncherInitWeex2.init(application, hashMap);
        }
        LauncherInitWeexTask.init(application, hashMap);
    }
}
