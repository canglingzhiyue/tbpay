package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.b;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.tao.topmultitab.protocol.a;
import com.taobao.tao.topmultitab.protocol.c;

/* loaded from: classes8.dex */
public class qzk extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f33073a;
    private final JSONObject b;
    private final IMultiTabPerformanceListener c;
    private final IMultiTabStabilityListener d;
    private final int e;

    static {
        kge.a(691674637);
    }

    public static /* synthetic */ Object ipc$super(qzk qzkVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1819431438:
                super.onAppToBackground();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1326718709:
                return super.getTabBarButtonShowState();
            case -1061013293:
                super.onAppToFront();
                return null;
            case 151698896:
                super.onPageSelected();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 258939967:
                return new Boolean(super.isOnRocketState());
            case 413640386:
                super.onCreate();
                return null;
            case 497921929:
                super.onPageUnSelected();
                return null;
            case 606228094:
                super.onPullRefresh();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1101850916:
                super.onClickRocket();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
        }
    }

    public qzk(c cVar, JSONObject jSONObject, IMultiTabPerformanceListener iMultiTabPerformanceListener, IMultiTabStabilityListener iMultiTabStabilityListener, int i) {
        super(cVar);
        this.b = jSONObject;
        this.c = iMultiTabPerformanceListener;
        this.d = iMultiTabStabilityListener;
        this.e = i;
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.f33073a = com.taobao.tao.infoflow.multitab.a.a(this.b);
        b bVar = this.f33073a;
        if (bVar == null) {
            g.a("BaseSubMultiTab", "createView: containerProvider is null");
            return new View(context);
        }
        bVar.a(this.c);
        this.f33073a.a(this.e);
        g.a("BaseSubMultiTab", "containerProvider createView: ");
        return this.f33073a.a(context, this.b);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        b bVar = this.f33073a;
        if (bVar == null) {
            return false;
        }
        return StringUtils.equals(bVar.j(), syc.DX_CONTAINER);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        g.a("BaseSubMultiTab", "onCreate: ");
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        g.a("BaseSubMultiTab", "onStart: ");
        b bVar = this.f33073a;
        if (bVar == null) {
            return;
        }
        bVar.g();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        g.a("BaseSubMultiTab", "onResume: ");
        b bVar = this.f33073a;
        if (bVar == null) {
            return;
        }
        bVar.f();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        g.a("BaseSubMultiTab", "onPause: ");
        b bVar = this.f33073a;
        if (bVar == null) {
            return;
        }
        bVar.e();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        g.a("BaseSubMultiTab", "onStop: ");
        b bVar = this.f33073a;
        if (bVar == null) {
            return;
        }
        bVar.h();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        b bVar = this.f33073a;
        if (bVar != null) {
            bVar.a();
        }
        g.a("BaseSubMultiTab", "onDestroy: ");
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        super.onAppToBackground();
        g.a("BaseSubMultiTab", "onAppToBackground: ");
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        super.onAppToFront();
        g.a("BaseSubMultiTab", "onAppToFront: ");
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        super.onPageSelected();
        b bVar = this.f33073a;
        if (bVar != null) {
            bVar.c();
        }
        g.a("BaseSubMultiTab", "onPageSelected: ");
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        super.onPageUnSelected();
        g.a("BaseSubMultiTab", "onPageUnSelected: ");
        b bVar = this.f33073a;
        if (bVar == null) {
            return;
        }
        bVar.d();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        super.onClickRocket();
        g.a("BaseSubMultiTab", "onClickRocket: ");
        b bVar = this.f33073a;
        if (bVar == null) {
            return;
        }
        bVar.i();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        super.onPullRefresh();
        g.a("BaseSubMultiTab", "onPullRefresh: ");
        b bVar = this.f33073a;
        if (bVar == null) {
            return;
        }
        bVar.k();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        b bVar = this.f33073a;
        if (bVar == null) {
            return super.isOnRocketState();
        }
        String b = bVar.b();
        g.a("BaseSubMultiTab", "isOnRocketState：" + b);
        return StringUtils.equals(b, NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getTabBarButtonShowState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0ebe10b", new Object[]{this});
        }
        b bVar = this.f33073a;
        if (bVar == null) {
            return super.getTabBarButtonShowState();
        }
        String b = bVar.b();
        g.a("BaseSubMultiTab", "getTabBarButtonShowState：" + b);
        return b;
    }
}
