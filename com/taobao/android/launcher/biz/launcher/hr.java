package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.taobao.impl.TBTMSColdLaunchTask;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hr extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(hr hrVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hr(String str) {
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
        if (c == null) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("uriString", c.e.getDataString());
        LinkRule b = com.taobao.android.launcher.bootstrap.tao.ability.h.b();
        hashMap2.put(AliFestivalWVPlugin.PARAMS_MODULE_NAME, b == null ? null : b.name);
        TBTMSColdLaunchTask.init(application, hashMap2);
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        LinkRule b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        if (!super.intercept(cVar) || (b = com.taobao.android.launcher.bootstrap.tao.ability.h.b()) == null) {
            return false;
        }
        return TMSCalendarBridge.namespace.equals(b.name);
    }
}
