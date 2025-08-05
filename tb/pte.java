package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.List;

/* loaded from: classes5.dex */
public class pte extends pta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private shm c;
    private long d;

    static {
        kge.a(-967765066);
    }

    public static /* synthetic */ Object ipc$super(pte pteVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ptc
    public String cL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e3f2f83", new Object[]{this}) : "InteractiveLayer";
    }

    public pte(FluidContext fluidContext, psw pswVar) {
        super(fluidContext, pswVar);
    }

    public ptf c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ptf) ipChange.ipc$dispatch("1e6c993a", new Object[]{this}) : (ptf) this.c;
    }

    @Override // tb.pta, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
        } else {
            this.c = new ptf(this.b, snpVar);
        }
    }

    @Override // tb.pta, tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
        } else {
            this.c.onBindData(pswVar, aVar, i);
        }
    }

    @Override // tb.pta, tb.shm
    public void onBindData(psw pswVar, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
        } else {
            this.c.onBindData(pswVar, aVar, i, list);
        }
    }

    @Override // tb.pta, tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
        } else {
            this.c.onAppear(pswVar);
        }
    }

    @Override // tb.pta, tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
        } else {
            this.c.onDisAppear(pswVar);
        }
    }

    @Override // tb.pta, tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
        } else {
            this.c.onActive(pswVar);
        }
    }

    @Override // tb.pta, tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
        } else {
            this.c.onDisActive(pswVar);
        }
    }

    @Override // tb.pta, tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
        } else {
            this.c.onRecycle(pswVar);
        }
    }

    @Override // tb.pta, tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        spz.c("InteractiveLayer", "onResume");
        if ((!d() && !this.b.H()) || !this.b.L()) {
            return;
        }
        spz.c("InteractiveLayer", "页面appear，卡片处于active状态且tab被选中，position: " + this.b.r());
        this.d = System.nanoTime();
        ((ptf) this.c).f();
    }

    @Override // tb.pta, tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        spz.c("InteractiveLayer", "onPauseMedia");
        if ((!d() && !this.b.H()) || !this.b.L()) {
            return;
        }
        spz.c("InteractiveLayer", "页面disappear，卡片处于active状态且tab被选中，position: " + this.b.r());
        b.a(this.b, ((ITrackService) this.f32873a.getService(ITrackService.class)).getActiveCardCommonTrack(), e());
        ((ptf) this.c).g();
    }

    @Override // tb.pta, tb.sne
    public void onTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ab5df8", new Object[]{this});
        } else if (!this.b.H()) {
        } else {
            this.d = System.nanoTime();
            ((ptf) this.c).h();
        }
    }

    @Override // tb.pta, tb.sne
    public void onTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a6e5b1", new Object[]{this});
        } else if (!this.b.H()) {
        } else {
            b.a(this.b, ((ITrackService) this.f32873a.getService(ITrackService.class)).getActiveCardCommonTrack(), e());
            ((ptf) this.c).i();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (c() != null) {
            c().a(z);
        }
        ((IInteractionService) this.f32873a.getService(IInteractionService.class)).setGlobalLayerVisibility(z);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableFixSendPageAppearAndDisappearMessage", true);
    }

    private long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
        }
        long nanoTime = System.nanoTime();
        long j = this.d;
        long j2 = nanoTime - j;
        if (j > 0) {
            return j2;
        }
        return 0L;
    }
}
