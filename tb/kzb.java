package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import java.util.Map;
import tb.shm;
import tb.snd;
import tb.snn;

/* loaded from: classes5.dex */
public final class kzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final psw f30412a;
    private final FluidContext b;
    private boolean c;
    private long d;
    private long e;
    private lzc f;
    private VideoTracker g;

    static {
        kge.a(-1516106354);
    }

    public static /* synthetic */ psw a(kzb kzbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("5606216d", new Object[]{kzbVar}) : kzbVar.f30412a;
    }

    public static /* synthetic */ void a(kzb kzbVar, a.c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b97531b", new Object[]{kzbVar, cVar, new Integer(i)});
        } else {
            kzbVar.a(cVar, i);
        }
    }

    public static /* synthetic */ void a(kzb kzbVar, psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92dd1b41", new Object[]{kzbVar, pswVar});
        } else {
            kzbVar.a(pswVar);
        }
    }

    public kzb(FluidContext fluidContext, psw pswVar) {
        this.b = fluidContext;
        this.f30412a = pswVar;
        h();
        g();
    }

    public lzc b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lzc) ipChange.ipc$dispatch("16b93888", new Object[]{this}) : this.f;
    }

    public void a(lzc lzcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c58623", new Object[]{this, lzcVar});
        } else {
            this.f = lzcVar;
        }
    }

    public VideoTracker c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoTracker) ipChange.ipc$dispatch("fee47592", new Object[]{this}) : this.g;
    }

    public void a(VideoTracker videoTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dac80e", new Object[]{this, videoTracker});
        } else {
            this.g = videoTracker;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        if (spj.c(this.f30412a.z())) {
            snn.a offsetPosition = ((IDataService) this.b.getService(IDataService.class)).getOffsetPosition();
            if (offsetPosition != null) {
                i = offsetPosition.a(this.f30412a.E());
            }
            return this.f30412a.G().getAdapterPosition() - i;
        }
        snn.a offsetPosition2 = ((IDataService) this.b.getService(IDataService.class)).getOffsetPosition();
        if (offsetPosition2 != null) {
            return offsetPosition2.a(this.f30412a.E());
        }
        return this.f30412a.G().getAdapterPosition();
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.e;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.d;
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        spz.c("FluidCardTrackManager", "FluidCardTrackManager -- addCardLifecycleListener");
        this.f30412a.t().addCardLifecycleListener(new shm.a() { // from class: tb.kzb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.shm.a, tb.shm
            public void onActive(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cababae8", new Object[]{this, pswVar});
                    return;
                }
                kzb kzbVar = kzb.this;
                kzb.a(kzbVar, kzb.a(kzbVar).D(), kzb.a(kzb.this).v().a());
                kzb.a(kzb.this, pswVar);
            }
        });
    }

    private void a(psw pswVar) {
        a.c D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3f5b84", new Object[]{this, pswVar});
        } else if (pswVar != null && (D = pswVar.D()) != null) {
            Object b = slm.b(D.d, "grayParamsCard");
            if (!(b instanceof Map)) {
                return;
            }
            t trackTint = ((ITrackService) this.b.getService(ITrackService.class)).getTrackTint();
            for (Map.Entry entry : ((Map) b).entrySet()) {
                trackTint.a((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            ((ILifecycleService) this.b.getService(ILifecycleService.class)).addPageLifecycleListener(new snd.a() { // from class: tb.kzb.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snd.a, tb.snd
                public void cI_() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6eaece0", new Object[]{this});
                        return;
                    }
                    ljq.e(kzb.a(kzb.this), "destroy");
                    ljq.b(kzb.a(kzb.this), kzb.a(kzb.this).w());
                }
            });
        }
    }

    private void a(a.c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7ce15e", new Object[]{this, cVar, new Integer(i)});
        } else if (cVar == null) {
        } else {
            int a2 = a.a(cVar.i());
            if (a2 == 1 || a2 == 3) {
                pil.a(this.f30412a.B().getContext(), spj.j(this.f30412a.z()), "gg_videoMutiTab_picPlay");
                ljm.a(this.f30412a.z(), 2, i);
                pil.a(this.f30412a.B().getContext(), spj.j(this.f30412a.z()), "gg_videoMutiTab_picPlay", null);
            } else if (a2 == 4) {
                pil.a(this.f30412a.B().getContext(), spj.j(this.f30412a.z()), "gg_videoMutiTab_extendPlay");
                ljm.a(this.f30412a.z(), 4, i);
                pil.a(this.f30412a.B().getContext(), spj.j(this.f30412a.z()), "gg_videoMutiTab_extendPlay", null);
            }
            com.taobao.tao.flexbox.layoutmanager.usertracker.a.a().b(spj.j(this.f30412a.z()), com.taobao.tao.flexbox.layoutmanager.usertracker.a.FIRST_FRAME_RENDER_FINISH);
        }
    }
}
