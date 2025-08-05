package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import tb.jqm;
import tb.nlc;
import tb.nld;

/* loaded from: classes.dex */
public class al extends com.taobao.android.launcher.biz.task.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public al(String str) {
        super(str);
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean shouldRunImmediately() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9c79391", new Object[]{this})).booleanValue() : BootstrapMode.c();
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        HashMap hashMap2 = new HashMap(6);
        hashMap2.put("usingNGNextLaunch", Boolean.valueOf(nlc.a(64)));
        hashMap2.put("isDebuggable", Boolean.valueOf(jqm.a()));
        hashMap2.put("process", LauncherRuntime.c);
        hashMap2.put("packageName", LauncherRuntime.b);
        hashMap2.put("ttid", LauncherRuntime.d);
        hashMap2.put("userId", nld.a(application, Login.getUserId()));
        hashMap2.put("appVersion", LauncherRuntime.e);
        hashMap2.put(OConstant.LAUNCH_ENVINDEX, Integer.valueOf(EnvironmentSwitcher.a()));
        com.taobao.android.behavix.d.a(application, hashMap2);
    }
}
