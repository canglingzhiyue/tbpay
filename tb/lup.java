package tb;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes.dex */
public class lup {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30927a;
    private FrameLayout b;
    private luq c;
    private int d = 8;
    private final nvi e;

    static {
        kge.a(1735416821);
    }

    public lup(ljs ljsVar) {
        this.f30927a = ljsVar;
        this.e = new nvi(ljsVar);
    }

    public FrameLayout a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b87ee879", new Object[]{this, context});
        }
        this.b = new FrameLayout(context);
        this.b.setBackgroundColor(0);
        this.b.setVisibility(this.d);
        ldf.d("ThemeWaiter", "onGlobalThemeVisible mVisibility : " + this.d);
        return this.b;
    }

    public void a(String str, lur lurVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337057f9", new Object[]{this, str, lurVar});
        } else {
            this.c = new luq(this.f30927a, str, lurVar);
        }
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c != null) {
            nuw.a("ThemeWaiter", "updateGlobalThemeView");
            this.c.c();
            nuw.b("ThemeWaiter", "updateGlobalThemeView");
        } else {
            a(this.f30927a);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ldf.d("ThemeWaiter", "onGlobalThemeChange");
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) this.f30927a.a(IDxItemRenderService.class);
        if (iDxItemRenderService != null) {
            iDxItemRenderService.reset();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30927a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        iMainFeedsViewService.reloadUi();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        ldf.d("ThemeWaiter", "onGlobalThemeVisible isVisible : " + z);
        if (z) {
            i = 8;
        }
        this.d = i;
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(this.d);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        luq luqVar = this.c;
        if (luqVar == null) {
            return;
        }
        luqVar.a();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        luq luqVar = this.c;
        if (luqVar == null) {
            return -1;
        }
        return luqVar.b();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (n.n().x()) {
            ldf.d("ThemeWaiter", "onFestivalRefresh.onFestivalRefresh");
            this.e.a();
        } else if (!ldj.a("enableResponseFestivalRefresh", true)) {
        } else {
            ldf.d("ThemeWaiter", "onFestivalRefresh.onGlobalThemeChange");
            b();
        }
    }

    private void a(ljs ljsVar) {
        ljz e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        IHostService iHostService = (IHostService) ljsVar.a(IHostService.class);
        if (iHostService == null || (e = iHostService.getInvokeCallback().e()) == null) {
            return;
        }
        e.a(null);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        luq luqVar = this.c;
        if (luqVar == null) {
            return;
        }
        luqVar.j();
    }
}
