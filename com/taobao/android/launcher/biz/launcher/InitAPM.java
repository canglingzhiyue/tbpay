package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.monitor.adapter.TBAPMAdapterLauncher;
import com.taobao.monitor.adapter.TBAPMInitiator;
import java.util.HashMap;
import tb.gtn;
import tb.gvm;
import tb.mpe;

/* loaded from: classes.dex */
public class InitAPM extends com.taobao.android.launcher.biz.task.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(InitAPM initAPM, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public InitAPM(String str) {
        super(str);
        shouldRunImmediately(true);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        if (LauncherRuntime.m) {
            new TBAPMAdapterLauncher().init(application, hashMap);
        } else {
            new WelcomeBAPMInitiator().init(application, hashMap);
        }
        com.taobao.monitor.adapter.b.a("isLinkOptOpened", Boolean.valueOf(gtn.a(application)));
        gvm.a(application, hashMap);
    }

    @Override // com.taobao.android.launcher.biz.task.g, com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue() : super.intercept(cVar) && !BootstrapMode.c();
    }

    /* loaded from: classes.dex */
    public static class WelcomeBAPMInitiator extends TBAPMInitiator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WelcomeBAPMInitiator welcomeBAPMInitiator, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1273028391) {
                super.initPage((Application) objArr[0]);
                return null;
            } else if (hashCode != 247898730) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.initExpendLauncher((Application) objArr[0]);
                return null;
            }
        }

        private WelcomeBAPMInitiator() {
        }

        @Override // com.taobao.monitor.adapter.TBAPMInitiator, com.taobao.monitor.adapter.AbsAPMInitiator
        public void initPage(Application application) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b41f20d9", new Object[]{this, application});
                return;
            }
            super.initPage(application);
            mpe.b("com.taobao.tao.welcome.Welcome");
            mpe.d("com.taobao.tao.welcome.Welcome");
            com.taobao.monitor.adapter.b.a("welBreak", true);
        }

        @Override // com.taobao.monitor.adapter.AbsAPMInitiator
        public void initExpendLauncher(Application application) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec6a26a", new Object[]{this, application});
            } else {
                super.initExpendLauncher(application);
            }
        }
    }
}
