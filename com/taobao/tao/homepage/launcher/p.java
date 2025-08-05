package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.gmn;
import tb.kge;
import tb.kyu;
import tb.ook;
import tb.oql;

/* loaded from: classes8.dex */
public class p extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1155877701);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
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
            return;
        }
        super.a(application, hashMap);
        this.f20600a.a("HomeVisibleLauncher", 4);
        com.taobao.tao.recommend3.a.a();
        gmn.a();
        ook.a();
        if (com.taobao.android.home.component.utils.j.a("disableCallFirstFrameFinishedOnIdle", true)) {
            com.taobao.gateway.dispatch.a.b().c(new Runnable() { // from class: com.taobao.tao.homepage.launcher.p.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    kyu.a();
                    oql.a().c();
                }
            });
        }
        this.f20600a.b("HomeVisibleLauncher");
    }
}
