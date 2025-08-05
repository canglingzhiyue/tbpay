package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.weex.LauncherInitWeex;
import com.taobao.weex.LauncherInitWeex2;
import java.util.HashMap;
import tb.gtn;

/* loaded from: classes.dex */
public class io extends com.taobao.android.launcher.biz.task.g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13054a = false;

    public static /* synthetic */ Object ipc$super(io ioVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public io(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        new LauncherInitWeex().init(application, hashMap);
        LauncherInitWeex2.init(application, hashMap);
        f13054a = true;
    }

    @Override // com.taobao.android.launcher.biz.task.g, com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        if (intercept) {
            intercept = !f13054a;
        }
        if (!intercept) {
            return intercept;
        }
        if (LauncherRuntime.k != 2 && !gtn.a(LauncherRuntime.g)) {
            return intercept;
        }
        return false;
    }
}
