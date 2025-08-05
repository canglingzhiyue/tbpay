package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.wangxin.app.LauncherMessage;
import java.util.HashMap;
import tb.guc;

/* loaded from: classes5.dex */
public class ib extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ib ibVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ib(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else {
            new LauncherMessage().initMsgBundle(application, hashMap);
        }
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        if (!intercept) {
            return false;
        }
        android.taobao.safemode.k c = android.taobao.safemode.h.a().c();
        return c != null ? a(c) : intercept;
    }

    private boolean a(android.taobao.safemode.k kVar) {
        ComponentName component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edfc5550", new Object[]{this, kVar})).booleanValue();
        }
        Intent intent = kVar.e;
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        if (!"com.taobao.tao.msgcenter.activity.MsgCenterThirdPushActivity".equals(component.getClassName()) && !BundleSplitUtil.ACTIVITY_NAME.equals(component.getClassName())) {
            return false;
        }
        return guc.a(LauncherRuntime.g, "link_push_launch");
    }
}
