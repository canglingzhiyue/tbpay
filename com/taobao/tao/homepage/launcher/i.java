package com.taobao.tao.homepage.launcher;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.lap;

/* loaded from: classes.dex */
public class i extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Context b;

    static {
        kge.a(-892412073);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == -193894180) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.homepage.launcher.b
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else if (!com.taobao.homepage.utils.n.n().v()) {
            com.taobao.android.home.component.utils.e.e("HomePreCreateViewLauncher", "HomePreCreateViewLauncher do it");
            b(application, hashMap);
        } else {
            com.taobao.android.home.component.utils.e.e("HomePreCreateViewLauncher", "HomePreCreateViewLauncher empty");
        }
    }

    public void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb02dd", new Object[]{this, application, hashMap});
            return;
        }
        this.f20600a.a("HomePreCreateViewLauncher", 4);
        if (a(hashMap)) {
            lap.a("LauncherTask", "HomePreCreateViewLauncher", "HomePreCreateViewLauncher.offline switcher on");
            return;
        }
        super.a(application, hashMap);
        if (com.taobao.android.autosize.l.e(application)) {
            a();
            return;
        }
        b = application.getApplicationContext();
        com.taobao.prefork.b.a().c();
        lap.a("LauncherTask", "HomePreCreateViewLauncher", "HomePreCreateViewLauncher.init; 预创建dx视图");
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f20600a.b("HomePreCreateViewLauncher");
        this.f20600a.b("homeLauncher");
        this.f20600a.a("homeFragmentBefore", 1);
    }
}
