package com.taobao.tao.homepage.launcher;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAUNCHER_NAME = "launcherName";
    public static final String LAUNCHER_TRIGGER = "triggerLauncher";
    public static final String LAUNCHER_TYPE = "launcherType";

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.tao.recommend3.tracelog.b f20600a = com.taobao.tao.recommend3.tracelog.b.a();

    static {
        kge.a(-1101434530);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else if (com.taobao.homepage.utils.i.a()) {
            n.a(getClass());
        } else {
            if (com.taobao.homepage.utils.n.n().v()) {
                com.taobao.tao.topmultitab.c.a();
            }
            n.a(getClass());
            com.taobao.android.home.component.utils.m.a().a(application);
        }
    }

    public boolean a(HashMap<String, Object> hashMap) {
        boolean f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("656bbc4f", new Object[]{this, hashMap})).booleanValue();
        }
        try {
            f = com.taobao.homepage.utils.n.n().f();
        } catch (Throwable unused) {
        }
        if (hashMap == null) {
            return f;
        }
        String str = (String) hashMap.get(LAUNCHER_TYPE);
        com.taobao.android.home.component.utils.e.e("HomeBaseLauncher", ((String) hashMap.get(LAUNCHER_NAME)) + " enableLoadLauncher : " + f + " ,launcherType: " + str);
        if (f) {
            if (!StringUtils.equals(str, LAUNCHER_TRIGGER)) {
                return true;
            }
        }
        return false;
    }
}
