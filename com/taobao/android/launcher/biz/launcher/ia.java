package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.taobao.windvane.extra.InitWVParamsTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;
import tb.guc;

/* loaded from: classes.dex */
public class ia extends com.taobao.android.launcher.biz.task.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ia iaVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ia(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        new InitWVParamsTask().init(application, hashMap);
        com.taobao.android.launcher.bootstrap.tao.h.b("InitUCParamB", "finish task");
        hz.f13052a = true;
    }

    @Override // com.taobao.android.launcher.biz.task.g, com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        if (!super.intercept(cVar)) {
            com.taobao.android.launcher.bootstrap.tao.h.b("InitUCParamB", "super.intercept returns false");
            return false;
        } else if (hz.f13052a) {
            return false;
        } else {
            if (LauncherRuntime.k != 0) {
                boolean a2 = guc.a(LauncherRuntime.g, "prewvWeb");
                com.taobao.android.launcher.bootstrap.tao.h.b("InitUCParamB", "prewvWeb switch hit : " + a2);
                return a2;
            }
            com.taobao.android.launcher.bootstrap.tao.h.b("InitUCParamB", "sLaunchType is normal");
            return false;
        }
    }
}
