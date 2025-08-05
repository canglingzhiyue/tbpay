package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.aks;

/* loaded from: classes8.dex */
public class pac implements ppv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1954736481);
        kge.a(-1104835171);
    }

    @Override // tb.ppv
    public ppu a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppu) ipChange.ipc$dispatch("f094149", new Object[]{this});
        }
        aks.a e = aks.a().e();
        ppu ppuVar = new ppu();
        ppuVar.b = e.b;
        ppuVar.f32804a = e.f25404a;
        ppuVar.e = e.e;
        ppuVar.c = e.c;
        ppuVar.d = e.d;
        ppuVar.f = e.f;
        ppuVar.g = e.g;
        return ppuVar;
    }

    @Override // tb.ppv
    public ppw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppw) ipChange.ipc$dispatch("16bae6e6", new Object[]{this});
        }
        aks.c f = aks.a().f();
        ppw ppwVar = new ppw();
        ppwVar.g = f.g;
        ppwVar.j = f.j;
        ppwVar.f32805a = f.f25406a;
        ppwVar.b = f.b;
        ppwVar.c = f.c;
        ppwVar.d = f.d;
        ppwVar.h = f.h;
        ppwVar.e = f.e;
        ppwVar.f = f.f;
        ppwVar.k = f.k;
        ppwVar.i = f.i;
        return ppwVar;
    }

    @Override // tb.ppv
    public ppx c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppx) ipChange.ipc$dispatch("1e6c8c64", new Object[]{this});
        }
        aks.d g = aks.a().g();
        ppx ppxVar = new ppx();
        ppxVar.f32806a = g.f25407a;
        ppxVar.b = g.d;
        return ppxVar;
    }

    @Override // tb.ppv
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : akt.a();
    }
}
