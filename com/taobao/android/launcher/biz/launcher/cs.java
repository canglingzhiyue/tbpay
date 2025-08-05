package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import java.util.Arrays;
import java.util.HashMap;
import tb.gtn;
import tb.guc;
import tb.gve;
import tb.gvk;

/* loaded from: classes.dex */
public class cs extends com.taobao.android.launcher.biz.task.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(cs csVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public cs(String str) {
        super(str);
        shouldRunImmediately(true);
    }

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!guc.a(LauncherRuntime.h, "Home_Page_SecondRefreshOpt")) {
            Application application = LauncherRuntime.h;
            if (!guc.a(application, getId() + "Async")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        android.taobao.safemode.k c;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (LauncherRuntime.k == 1 || LauncherRuntime.k == 2) {
            z = true;
        }
        hashMap2.put("linkLaunch", Boolean.valueOf(z));
        if (z && (c = android.taobao.safemode.h.a().c()) != null) {
            hashMap2.put("startupUrl", c.h);
            hashMap2.put("startIntent", c.e.getDataString());
        }
        new com.taobao.tao.homepage.launcher.j().a(application, hashMap2);
    }

    @Override // com.taobao.android.launcher.biz.task.g, com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        if (intercept && gtn.a(LauncherRuntime.g)) {
            intercept = false;
        }
        if (!intercept) {
            return false;
        }
        gvk a2 = gvk.a();
        String c = gvk.c(a2);
        TLog.loge(gve.MODULE, getId(), "startup context component = " + c);
        if (a2 != null && !a2.f28515a) {
            TLog.loge(gve.MODULE, getId(), "startup context is not from activity");
            return false;
        } else if (!"UNKNOWN".equals(c)) {
            return !guc.a(LauncherRuntime.g, "home_pre_request_off");
        } else {
            String a3 = com.taobao.android.home.component.utils.j.a("closeHomePreLauncherByManufacturer", "vivo,oppo");
            TLog.loge(gve.MODULE, getId(), "manufacturers from homepage = " + a3 + ", current manufacturer = " + Build.MANUFACTURER);
            if (!Arrays.asList(a3.split(",")).contains(Build.MANUFACTURER.toLowerCase())) {
                return true;
            }
            boolean a4 = com.taobao.android.home.component.utils.j.a("closeHomePreLauncherByUnknown", true);
            TLog.loge(gve.MODULE, getId(), "switch value from homepage = " + a4);
            return !a4;
        }
    }
}
