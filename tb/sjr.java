package tb;

import android.util.Pair;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.tao.flexbox.layoutmanager.player.b;

/* loaded from: classes5.dex */
public class sjr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33636a;
    private final sii b;
    private sjq c;
    private FrameLayout.LayoutParams d;

    static {
        kge.a(-692868558);
    }

    public sjr(sii siiVar) {
        this.f33636a = siiVar.z();
        this.b = siiVar;
    }

    public FrameLayout.LayoutParams a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("1aeba7b1", new Object[]{this}) : this.d;
    }

    public void a(FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b016271", new Object[]{this, layoutParams});
        } else {
            this.d = layoutParams;
        }
    }

    public sjq b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjq) ipChange.ipc$dispatch("16bc2cc3", new Object[]{this}) : this.c;
    }

    public void a(sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fedc579e", new Object[]{this, sjqVar});
        } else {
            this.c = sjqVar;
        }
    }

    public Pair<Integer, Integer> a(int i, a.c cVar) {
        odz a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("7fd6ff7c", new Object[]{this, new Integer(i), cVar});
        }
        Pair<Integer, Integer> create = Pair.create(Integer.valueOf(cVar.K()), Integer.valueOf(cVar.q()));
        if (i != 0 || !((IQuickOpenService) this.f33636a.getService(IQuickOpenService.class)).isUsePreSize() || (a2 = ody.a().a(c())) == null) {
            return create;
        }
        int a3 = a2.a();
        int b = a2.b();
        ogg.b("AVSDK_TBVideoComponentSharePlayer,onBindData,视频宽：" + a3 + ",视频高：" + b);
        return new Pair<>(Integer.valueOf(a3), Integer.valueOf(b));
    }

    private String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b.z().getInstanceConfig().getPreCoverKey();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e800264", new Object[]{this, aVar});
            return;
        }
        Pair<Integer, Integer> a2 = a(this.b.r(), aVar.a());
        this.c = new sjq(((Integer) a2.first).intValue(), ((Integer) a2.second).intValue());
        boolean z = b.a().a(c()) && sjt.m();
        spz.c("VideoPicSizeManager", "全屏页内部画幅计算，onBindData触发");
        sjs.a(this.b.z(), ((IContainerService) this.f33636a.getService(IContainerService.class)).getWindowWidth(), ((IContainerService) this.f33636a.getService(IContainerService.class)).getWindowHeight(), ((IContainerService) this.f33636a.getService(IContainerService.class)).isHighActionbar(), ((IContainerService) this.f33636a.getService(IContainerService.class)).getActionBarHeight(), this.c, z);
        spz.a("VideoPicSizeManager", "resizeVideo2:" + this.c);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        spz.c("VideoPicSizeManager", "onAppear");
        if (!((ICardService) this.f33636a.getService(ICardService.class)).getConfig().e()) {
            return;
        }
        boolean a2 = b.a().a(c());
        if (this.c.l == 0 || a2) {
            return;
        }
        this.c.e = 0;
        spz.c("VideoPicSizeManager", "全屏页内部画幅计算，onAppear触发");
        sjs.a(this.b.z(), ((IContainerService) this.f33636a.getService(IContainerService.class)).getWindowWidth(), ((IContainerService) this.f33636a.getService(IContainerService.class)).getWindowHeight(), ((IContainerService) this.f33636a.getService(IContainerService.class)).isHighActionbar(), ((IContainerService) this.f33636a.getService(IContainerService.class)).getActionBarHeight(), this.c, false);
    }
}
