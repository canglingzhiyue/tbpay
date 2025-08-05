package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.b;
import com.taobao.tao.homepage.a;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.topmultitab.c;
import com.uc.webview.export.media.MessageID;

/* loaded from: classes7.dex */
public class lbp extends lbr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1565692426);
    }

    public static /* synthetic */ Object ipc$super(lbp lbpVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode == 91915241) {
            super.b();
            return null;
        } else if (hashCode != 92838762) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c();
            return null;
        }
    }

    public lbp(lbq lbqVar) {
        super(lbqVar);
    }

    @Override // tb.lbr, tb.lbm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        lap.a("【Homepage_PageLifeCycle】", "hotStartOnStart", "HotStartWorkflow.onStart;生命周期:onStart");
        super.a();
        this.f30455a.getHomePageManager().l().a();
        c.a().k();
    }

    @Override // tb.lbr, tb.lbm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        lap.a("【Homepage_PageLifeCycle】", "hotStartOnResume", "HotStartWorkflow.onResume;生命周期onResume");
        super.b();
        try {
            g();
        } catch (Exception e) {
            e.printStackTrace();
        }
        kxf.a().c(50034);
        kxf.a().c(50044);
        this.f30455a.getHomePageManager().m().a();
        a.a(g.a(), b.REFRESH_SOURCE_HOT_START);
        las.a();
        c.a().e(b.REFRESH_SOURCE_HOT_START);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.homepage.view.widgets.bgcontainer.c d = this.f30455a.getHomePageManager().d();
        if (d != null) {
            d.a();
        }
        oqq.b(null);
        this.f30455a.getHomePageManager().p().c();
    }

    @Override // tb.lbr, tb.lbm
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        lap.a("【Homepage_PageLifeCycle】", "hotStartOnPause", "HotStartWorkflow.onPause;生命周期:onPause");
        super.c();
        this.f30455a.getHomePageManager().p().e();
        c.a().m();
    }

    @Override // tb.lbr, tb.lbm
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ksp.a("HotStartWorkflow", MessageID.onStop);
        c.a().n();
    }
}
