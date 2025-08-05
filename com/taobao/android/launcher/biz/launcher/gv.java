package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OConstant;
import java.util.HashMap;

/* loaded from: classes.dex */
public class gv extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public gv(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else {
            com.taobao.tao.shop.rule.a.a(application, (String) com.taobao.android.launcher.common.c.a(OConstant.LAUNCH_ONLINEAPPKEY, null), LauncherRuntime.d, ((Integer) com.taobao.android.launcher.common.c.a(OConstant.LAUNCH_ENVINDEX, 0)).intValue());
        }
    }
}
