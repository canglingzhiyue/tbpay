package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.taobao.windvane.extra.PrefetchInitTask;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class cc extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(cc ccVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public cc(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        android.taobao.safemode.k c = android.taobao.safemode.h.a().c();
        if (c == null || StringUtils.isEmpty(c.h)) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("startupUrl", c.h);
        PrefetchInitTask.init(application, hashMap2);
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        if (!intercept) {
            return intercept;
        }
        android.taobao.safemode.k c = android.taobao.safemode.h.a().c();
        if (c != null && !StringUtils.isEmpty(c.h)) {
            return intercept;
        }
        return false;
    }
}
