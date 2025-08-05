package com.taobao.android.fluid.business.undermode.helper;

import android.app.Activity;
import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.undermode.IUnderageModeService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import kotlin.jvm.internal.q;
import tb.bxt;
import tb.ghi;
import tb.ghm;
import tb.ghp;
import tb.jun;
import tb.kge;
import tb.obu;
import tb.soi;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a INSTANCE;
    public static final String TAG = "UnderageModeHelper";

    static {
        kge.a(1651434158);
        INSTANCE = new a();
    }

    private a() {
    }

    public final boolean a() {
        ghp queryCurrentVersionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ghm ghmVar = (ghm) ghi.a(ghm.class);
        String str = (ghmVar == null || (queryCurrentVersionInfo = ghmVar.queryCurrentVersionInfo()) == null) ? null : queryCurrentVersionInfo.c;
        spz.c("UnderageModeHelper", "isUnderageMode versionCode:" + str);
        return q.a((Object) "children_version", (Object) str);
    }

    public final void a(FluidContext fluidContext, Activity activity, String mode) {
        jun config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61641636", new Object[]{this, fluidContext, activity, mode});
            return;
        }
        q.d(fluidContext, "fluidContext");
        q.d(activity, "activity");
        q.d(mode, "mode");
        spz.c("UnderageModeHelper", "handlePoppingLimitDialog - start 触发未成年模式弹窗。activity=" + activity);
        bxt.a(activity, "tab2", mode);
        b.INSTANCE.a(fluidContext, activity);
        spy spyVar = new spy("VSMSG_pausePlayer", soi.c(fluidContext), null);
        IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
        if (iMessageService != null) {
            iMessageService.sendMessage(spyVar);
        }
        IUnderageModeService iUnderageModeService = (IUnderageModeService) fluidContext.getService(IUnderageModeService.class);
        if (iUnderageModeService == null || (config = iUnderageModeService.getConfig()) == null) {
            return;
        }
        config.b(true);
    }

    public final void a(FluidContext fluidContext, Activity activity) {
        jun config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1b6f6c", new Object[]{this, fluidContext, activity});
            return;
        }
        q.d(fluidContext, "fluidContext");
        q.d(activity, "activity");
        spz.c("UnderageModeHelper", "handleClosingLimitDialog, activity=" + activity);
        bxt.a(activity);
        b.INSTANCE.a();
        IUnderageModeService iUnderageModeService = (IUnderageModeService) fluidContext.getService(IUnderageModeService.class);
        if (iUnderageModeService == null || (config = iUnderageModeService.getConfig()) == null) {
            return;
        }
        config.b(false);
    }

    public final boolean a(FluidContext fluidContext) {
        jun config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{this, fluidContext})).booleanValue();
        }
        q.d(fluidContext, "fluidContext");
        IUnderageModeService iUnderageModeService = (IUnderageModeService) fluidContext.getService(IUnderageModeService.class);
        Boolean valueOf = (iUnderageModeService == null || (config = iUnderageModeService.getConfig()) == null) ? null : Boolean.valueOf(config.a());
        if (valueOf == null) {
            return false;
        }
        boolean a2 = a();
        spz.c("UnderageModeHelper", "isCurrentModeChanged isUnderageModeNow:" + a2 + "，isUnderageModeLast=" + valueOf);
        return !q.a(Boolean.valueOf(a2), valueOf);
    }

    public final boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{this, fluidContext})).booleanValue();
        }
        q.d(fluidContext, "fluidContext");
        boolean a2 = a();
        FluidService service = fluidContext.getService(IUnderageModeService.class);
        q.a(service);
        q.b(service, "fluidContext.getService(…odeService::class.java)!!");
        jun config = ((IUnderageModeService) service).getConfig();
        q.b(config, "fluidContext.getService(…ice::class.java)!!.config");
        boolean b = config.b();
        if (a2 && b) {
            b bVar = b.INSTANCE;
            Application e = obu.e();
            q.b(e, "AppUtils.getApplication()");
            boolean a3 = bVar.a(e);
            spz.c("UnderageModeHelper", "isForbiddenVideoPlayInUnderageMode isVideoForbidden:" + b + "; isTimeLockClosed:" + a3);
            if (!a3) {
                return true;
            }
        }
        return false;
    }
}
