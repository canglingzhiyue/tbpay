package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.i;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.page.weexv2.a;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;

/* loaded from: classes7.dex */
public class lbs extends lbr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(174077888);
    }

    public static /* synthetic */ Object ipc$super(lbs lbsVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 90991720:
                super.a();
                return null;
            case 91915241:
                super.b();
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public lbs(lbq lbqVar) {
        super(lbqVar);
    }

    @Override // tb.lbr, tb.lbm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ksp.a("WakeUpWorkflow", "onStart");
        super.a();
        this.f30455a.getHomePageManager().l().a();
        c.a().k();
    }

    @Override // tb.lbr, tb.lbm
    public void b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ksp.a("WakeUpWorkflow", "onResume");
        super.b();
        ChangeContainerProcess.a().b();
        String a2 = i.a();
        c.a().e("backToHome");
        IHomeSubTabController z2 = c.a().z();
        if (z2 == null || z2.isAllowProcessPageBack()) {
            z = true;
        }
        if (z && !a.d()) {
            g();
        }
        this.f30455a.getHomePageManager().m().a();
        kxf.a().c(50034);
        kxf.a().c(50044);
        if (c.a().D()) {
            kss.a(this.f30455a.getCurActivity(), lbo.b().a(a2).a());
        }
        kss.a(this.f30455a.getCurActivity(), lbo.b().a(a2).c());
    }

    @Override // tb.lbr, tb.lbm
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        c.a().m();
    }

    @Override // tb.lbr, tb.lbm
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        c.a().n();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!"true".equals(j.a("homePageBackRequestEnable", "true"))) {
        } else {
            f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (j.a("enableNotLoggedInNotPageBack", true) && !com.taobao.homepage.utils.i.c()) {
        } else {
            oqc.a().a(new String[]{oqc.a().l(), oqc.a().m()});
        }
    }
}
