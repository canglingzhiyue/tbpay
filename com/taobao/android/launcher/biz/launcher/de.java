package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.login4android.api.Login;
import com.taobao.message.kit.util.BundleSplitUtil;
import java.util.HashMap;
import tb.guc;

/* loaded from: classes5.dex */
public class de extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(de deVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public de(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else if (Login.checkSessionValid()) {
        } else {
            Login.triggerLoginBundle();
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
        return c != null ? a(c) || b(c) : intercept;
    }

    private boolean a(android.taobao.safemode.k kVar) {
        Uri data;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edfc5550", new Object[]{this, kVar})).booleanValue();
        }
        if (kVar.e == null || (data = kVar.e.getData()) == null || data.isOpaque()) {
            return false;
        }
        String queryParameter = data.getQueryParameter("h5Url");
        if (!TextUtils.isEmpty(queryParameter) && com.taobao.android.launcher.bootstrap.tao.ability.h.c(queryParameter) != null && (parse = Uri.parse(queryParameter)) != null) {
            return TextUtils.equals(parse.getPath(), "/taolive/video.html");
        }
        return false;
    }

    private boolean b(android.taobao.safemode.k kVar) {
        ComponentName component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("762c952f", new Object[]{this, kVar})).booleanValue();
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
