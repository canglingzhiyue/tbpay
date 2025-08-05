package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;
import tb.gti;
import tb.gtn;

/* loaded from: classes.dex */
public class bj extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f13032a = false;

    public static /* synthetic */ Object ipc$super(bj bjVar, String str, Object... objArr) {
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

    public bj(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        gti.a(application, hashMap);
        f13032a = true;
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        if (intercept && gtn.a(LauncherRuntime.g)) {
            return false;
        }
        return intercept;
    }
}
