package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;
import tb.guc;
import tb.gvk;

/* loaded from: classes.dex */
public class gr extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public gr(String str) {
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
            SecurityGuardManager.getInstance(application);
        } catch (SecException unused) {
        }
    }

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.equals(LauncherRuntime.b, LauncherRuntime.c)) {
            return true;
        }
        gvk a2 = gvk.a();
        if (a2 != null && !a2.f28515a) {
            return guc.a(LauncherRuntime.h, "ngSecurityAsync");
        }
        return false;
    }
}
