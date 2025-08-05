package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class sjk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33625a;
    private final sii b;
    private snv c;
    private boolean d;

    static {
        kge.a(-653036660);
        kge.a(-2078734836);
    }

    public sjk(sii siiVar) {
        this.f33625a = siiVar.z();
        this.b = siiVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        this.c = e();
        StringBuilder sb = new StringBuilder();
        sb.append("canReuseIdwInstance:");
        sb.append(this.c != null);
        spz.c("DWInstancePreCreateManager", sb.toString());
        snv snvVar = this.c;
        if (snvVar != null && snvVar.f() != null) {
            sor sorVar = (sor) this.c.f().getTag(R.id.fluid_sdk_tag_preloadVideo);
            if (sorVar != null) {
                return sorVar.a(this.b.y());
            }
            if (this.c.f().getContext() == this.b.y()) {
                return true;
            }
        }
        return false;
    }

    public snv b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("16bc3c62", new Object[]{this}) : d();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    private snv d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snv) ipChange.ipc$dispatch("261f8720", new Object[]{this});
        }
        snv snvVar = this.c;
        if (snvVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PickPreloadController VideoProcess ShortVideoCard.onRequestMediaPlayer (idwInstance != null)?");
        sb.append(snvVar != null);
        spz.c("DWInstancePreCreateManager", sb.toString());
        this.b.ag().b(snvVar.f());
        ((ITrackService) this.f33625a.getService(ITrackService.class)).setFirstSetAdapter(false);
        this.d = true;
        this.c = snvVar;
        boolean isFirstSetUTParams = ((ITrackService) this.f33625a.getService(ITrackService.class)).isFirstSetUTParams();
        if (isFirstSetUTParams) {
            int a2 = this.b.v().a();
            snvVar.a(this.b.ac().a(this.b.af()));
            snvVar.b(ljm.a(this.b.z(), ljm.a(this.b.z(), a2, this.b.af().f12530a), isFirstSetUTParams));
            ((ITrackService) this.f33625a.getService(ITrackService.class)).setFirstSetUTParams(false);
        }
        f();
        return this.c;
    }

    private snv e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("2dd12c7f", new Object[]{this}) : snu.a(this.b.z());
    }

    private void f() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c == null || !((IMediaService) this.f33625a.getService(IMediaService.class)).isUseDefaultValueCreateDW()) {
        } else {
            this.b.g(true);
            sps sessionParams = ((ISceneConfigService) this.b.z().getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams != null) {
                this.c.a(sessionParams.c);
            }
            if (this.b.ah().b().l == 0) {
                i = this.b.ah().b().c;
            } else {
                i = this.b.ah().b().l;
            }
            this.c.a(this.b.ah().b().d, i);
            this.c.b(ljm.a(true));
        }
    }
}
