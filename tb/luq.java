package tb;

import android.graphics.Canvas;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.homepage.utils.n;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.globaltheme.compose.GlobalThemeConfig;
import com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.globaltheme.compose.b;
import java.util.List;
import tb.lks;

/* loaded from: classes.dex */
public class luq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ljs b;
    private lks.a c;
    private ThemeFrameLayout d;
    private GlobalThemeConfig e;
    private final IHostService f;
    private final IMainFeedsViewService<?> g;
    private final com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.globaltheme.compose.a h = new com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.globaltheme.compose.a();
    private final b i;
    private lur j;
    private int k;

    static {
        kge.a(1333570891);
    }

    public static /* synthetic */ ThemeFrameLayout a(luq luqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThemeFrameLayout) ipChange.ipc$dispatch("7ddd3253", new Object[]{luqVar}) : luqVar.d;
    }

    public static /* synthetic */ void a(luq luqVar, Canvas canvas, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d075f2d4", new Object[]{luqVar, canvas, viewGroup});
        } else {
            luqVar.a(canvas, viewGroup);
        }
    }

    public static /* synthetic */ void a(luq luqVar, ThemeFrameLayout themeFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3920fda0", new Object[]{luqVar, themeFrameLayout, new Integer(i)});
        } else {
            luqVar.a(themeFrameLayout, i);
        }
    }

    public static /* synthetic */ int b(luq luqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2087444", new Object[]{luqVar})).intValue() : luqVar.k;
    }

    public luq(ljs ljsVar, String str, lur lurVar) {
        this.b = ljsVar;
        this.f = (IHostService) this.b.a(IHostService.class);
        this.g = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.i = new b(str);
        this.j = lurVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f();
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        ThemeFrameLayout themeFrameLayout = this.d;
        if (themeFrameLayout != null) {
            return themeFrameLayout.hashCode();
        }
        return -1;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!d()) {
            ldf.d("HostGlobalThemeHandler", "isEnableGlobalTheme is false");
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nuw.a("HostGlobalThemeHandler", "getGlobalBgThemeConfig");
            GlobalThemeConfig a2 = a(this.j.a());
            if (a2 != null && a2.themeData != null) {
                a2.themeData.isComplexTexture = String.valueOf(com.taobao.homepage.view.widgets.bgcontainer.a.b());
            }
            nuw.b("HostGlobalThemeHandler", "getGlobalBgThemeConfig");
            nuw.a("HostGlobalThemeHandler", "refreshGlobalThemeView");
            a(a2);
            nuw.b("HostGlobalThemeHandler", "refreshGlobalThemeView");
            ldf.e("HostGlobalThemeHandler", "Theme refreshGlobalThemeView use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.f;
        return (iHostService == null || iHostService.getInvokeCallback().e() == null || this.g == null) ? false : true;
    }

    private void a(GlobalThemeConfig globalThemeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715d99ad", new Object[]{this, globalThemeConfig});
        } else if (globalThemeConfig == null || k()) {
            f();
        } else {
            if (!globalThemeConfig.equals(this.e)) {
                b(globalThemeConfig);
                if (this.d == null) {
                    nuw.a("HostGlobalThemeHandler", "createThemeFrameLayout");
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.d = this.i.a();
                    ldf.d("HostGlobalThemeHandler", "Theme createThemeFrameLayout use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    nuw.b("HostGlobalThemeHandler", "createThemeFrameLayout");
                }
                if (this.d == null) {
                    return;
                }
                this.k = c(globalThemeConfig);
                nuw.a("HostGlobalThemeHandler", "updateThemeFrameLayoutHeight");
                a(this.d, this.k);
                nuw.b("HostGlobalThemeHandler", "updateThemeFrameLayoutHeight");
            }
            nuw.a("HostGlobalThemeHandler", "checkAddToHost");
            a(this.d);
            nuw.b("HostGlobalThemeHandler", "checkAddToHost");
            e();
        }
    }

    private boolean k() {
        lkc i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.f;
        if (iHostService == null || (i = iHostService.getInvokeCallback().i()) == null) {
            return false;
        }
        return com.taobao.android.home.component.utils.b.a(i.b() == null ? lcz.a() : i.b());
    }

    private void b(GlobalThemeConfig globalThemeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d8af4c", new Object[]{this, globalThemeConfig});
            return;
        }
        this.h.a(globalThemeConfig.separatorImageUrl);
        this.h.b(globalThemeConfig.maskBackgroundColor);
        this.i.a(globalThemeConfig.themeData);
        this.e = globalThemeConfig;
    }

    private GlobalThemeConfig a(JSONObject jSONObject) {
        GlobalThemeConfig globalThemeConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalThemeConfig) ipChange.ipc$dispatch("7b8d850d", new Object[]{this, jSONObject});
        }
        if (!j.b() || jSONObject == null) {
            return null;
        }
        try {
            globalThemeConfig = (GlobalThemeConfig) JSON.parseObject(jSONObject.toJSONString(), GlobalThemeConfig.class);
        } catch (Throwable th) {
            ldf.a("HostGlobalThemeHandler", "getGlobalBgThemeConfig error ", th);
            globalThemeConfig = null;
        }
        return d(globalThemeConfig);
    }

    private GlobalThemeConfig d(GlobalThemeConfig globalThemeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalThemeConfig) ipChange.ipc$dispatch("6f01aa0f", new Object[]{this, globalThemeConfig});
        }
        if (!n.n().w() || !StringUtils.equals(globalThemeConfig.separatorImageUrl, "https://gw.alicdn.com/imgextra/i2/O1CN01gGJZH91CMGxw2F5Ru_!!6000000000066-0-tps-1125-180.jpg") || !StringUtils.equals(globalThemeConfig.themeData.skinPic, "https://gw.alicdn.com/imgextra/i4/O1CN018T87Vf1J6syBsDMJA_!!6000000000980-0-tps-1125-1125.jpg")) {
            return globalThemeConfig;
        }
        ldf.d("HostGlobalThemeHandler", "discardEmptyTheme");
        return null;
    }

    private void a(ThemeFrameLayout themeFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ec922b", new Object[]{this, themeFrameLayout});
        } else if (themeFrameLayout == null || themeFrameLayout.getParent() != null) {
        } else {
            this.f.getInvokeCallback().e().a(themeFrameLayout);
        }
    }

    private int c(GlobalThemeConfig globalThemeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f253c4de", new Object[]{this, globalThemeConfig})).intValue();
        }
        int i = -1;
        IContainerDataService iContainerDataService = (IContainerDataService) this.b.a(IContainerDataService.class);
        List list = null;
        if (iContainerDataService != null && iContainerDataService.getContainerData() != null) {
            list = iContainerDataService.getContainerData().getTotalData();
        }
        if (globalThemeConfig != null && list != null && !list.isEmpty()) {
            i = lix.a(this.e.bgEndSection, list);
        }
        if (i < 0) {
            i = a(this.b);
        }
        if (i < 0) {
            ldf.d("HostGlobalThemeHandler", "统一背景找不到锚点");
        }
        ldf.d("HostGlobalThemeHandler", "themeBgEndSectionPosition = " + i);
        return i;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.c != null) {
        } else {
            this.c = new a();
            this.g.mo1084getLifeCycleRegister().a(this.c);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.h.c();
        if (!com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.b.b()) {
            return;
        }
        f();
        c();
        ldf.d("HostGlobalThemeHandler", "reset global bg view for fold device");
    }

    /* loaded from: classes7.dex */
    public class a implements lks.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(576594402);
            kge.a(79409827);
        }

        private a() {
        }

        @Override // tb.lks.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            luq luqVar = luq.this;
            luq.a(luqVar, luq.a(luqVar), luq.b(luq.this));
        }

        @Override // tb.lks.a
        public void a(Canvas canvas, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eedd573c", new Object[]{this, canvas, viewGroup});
            } else {
                luq.a(luq.this, canvas, viewGroup);
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.i.b();
        this.h.a();
        this.d = null;
        this.e = null;
        if (!d()) {
            return;
        }
        g();
        this.f.getInvokeCallback().e().a(null);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.g.mo1084getLifeCycleRegister().b(this.c);
            this.c = null;
        }
    }

    private void a(ThemeFrameLayout themeFrameLayout, int i) {
        int[] itemViewHeights;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a62638", new Object[]{this, themeFrameLayout, new Integer(i)});
        } else if (themeFrameLayout != null && (itemViewHeights = this.g.getItemViewHeights()) != null && itemViewHeights.length != 0 && i >= 0) {
            int i2 = i();
            int max = Math.max(0, i2 != 0 ? 0 - i2 : 0);
            for (int i3 = 0; i3 <= i; i3++) {
                max += itemViewHeights[i3];
            }
            this.i.a(themeFrameLayout, max + h());
        }
    }

    private int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        lkb c = this.f.getInvokeCallback().c();
        if (c == null) {
            return 0;
        }
        return (int) c.a();
    }

    private int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        lke a2 = this.f.getInvokeCallback().a();
        if (a2 == null) {
            return 0;
        }
        return a2.c();
    }

    private void a(Canvas canvas, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eedd573c", new Object[]{this, canvas, viewGroup});
            return;
        }
        int a2 = a(this.b);
        this.h.a(canvas, viewGroup, a(a2), a2, this.g.getVisiblePositionRange());
    }

    private int a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2eb53f6", new Object[]{this, ljsVar})).intValue();
        }
        IRocketSubService iRocketSubService = (IRocketSubService) ljsVar.a(IRocketSubService.class);
        if (iRocketSubService == null) {
            return -1;
        }
        return iRocketSubService.getRocketAnchorPosition();
    }

    private View a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
        }
        if (i != -1) {
            return this.g.findItemViewByPosition(i);
        }
        return null;
    }
}
