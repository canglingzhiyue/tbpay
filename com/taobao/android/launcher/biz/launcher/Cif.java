package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import java.util.HashMap;
import tb.gtn;

/* renamed from: com.taobao.android.launcher.biz.launcher.if  reason: invalid class name */
/* loaded from: classes.dex */
public class Cif extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(Cif cif, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Cif(String str) {
        super(str);
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        return intercept ? gtn.a(LauncherRuntime.g) : intercept;
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        android.taobao.safemode.k d = LauncherRuntime.d();
        if (d == null || !d.f1531a || d.e == null) {
            return;
        }
        d.h = a(application, d.e);
    }

    private String a(Context context, Intent intent) {
        ComponentName component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f484623", new Object[]{this, context, intent});
        }
        Uri data = intent.getData();
        if (data == null) {
            return "";
        }
        String a2 = TFCCommonUtils.a(data.toString());
        if (!LauncherRuntime.o || (component = intent.getComponent()) == null) {
            return a2;
        }
        Pair<LinkRule, ComponentName> a3 = com.taobao.android.launcher.bootstrap.tao.ability.h.a(context, component.getPackageName(), data);
        ComponentName componentName = a3.second;
        LinkRule linkRule = a3.first;
        String str = linkRule == null ? null : linkRule.name;
        if (gtn.a(LauncherRuntime.h, componentName)) {
            intent.setComponent(componentName).putExtra("cold_startup_h5", true).putExtra("__link_module_name__", str);
        }
        return a2;
    }
}
