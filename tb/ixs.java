package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.monitor.a;

/* loaded from: classes4.dex */
public class ixs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f29399a;

    static {
        kge.a(1425674684);
    }

    public static ixs a(Application application) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ixs) ipChange.ipc$dispatch("f2456e8b", new Object[]{application}) : new ixs(application);
    }

    private ixs(Application application) {
        this.f29399a = application;
    }

    public void a(kgm kgmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1097aa7", new Object[]{this, kgmVar});
            return;
        }
        tcr.a().b();
        if (!kgmVar.a("useMonitor", false)) {
            return;
        }
        tcr.a().a(new a(this.f29399a));
    }
}
