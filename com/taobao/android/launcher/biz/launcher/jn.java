package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.middleware.compat.MtopInitializer;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class jn extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(jn jnVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public jn(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else {
            MtopInitializer.initDelay(application, hashMap);
        }
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        if (intercept) {
            LinkRule b = com.taobao.android.launcher.bootstrap.tao.ability.h.b();
            if (b == null) {
                return false;
            }
            intercept = TMSCalendarBridge.namespace.equals(b.name);
        }
        if (intercept && !ABGlobal.isFeatureOpened(LauncherRuntime.h, "mtop_delay_init")) {
            return false;
        }
        return intercept;
    }
}
