package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.taobao.windvane.extra.InitWVParamsTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class hz extends com.taobao.android.launcher.biz.task.g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13052a = false;

    public static /* synthetic */ Object ipc$super(hz hzVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hz(String str) {
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
        com.taobao.android.launcher.bootstrap.tao.h.b("InitUCParam", "finish task");
        f13052a = true;
    }

    @Override // com.taobao.android.launcher.biz.task.g, com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        return intercept ? !f13052a : intercept;
    }
}
