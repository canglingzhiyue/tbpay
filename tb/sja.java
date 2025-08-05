package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.avplayer.bl;
import com.taobao.tao.flexbox.layoutmanager.player.b;
import tb.sny;

/* loaded from: classes5.dex */
public class sja {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33620a;
    private final sii b;

    static {
        kge.a(1923966273);
        kge.a(-1336580603);
    }

    public sja(sii siiVar) {
        this.f33620a = siiVar.z();
        this.b = siiVar;
    }

    public snv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snv) ipChange.ipc$dispatch("f0a9703", new Object[]{this});
        }
        spz.c("OutsideContinuedPlayManager", "createInstance");
        bl c = c();
        c.e(f.g(this.b.z()));
        sny.a aVar = new sny.a((Activity) this.b.y());
        f.a(aVar, this.f33620a);
        aVar.d(this.f33620a.getInstanceConfig().getPlayScenes());
        return aVar.a(c);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return c() != null && d();
    }

    public bl c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bl) ipChange.ipc$dispatch("6a79e14b", new Object[]{this}) : b.a().e(e());
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : b.a().a(e());
    }

    private String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b.z().getInstanceConfig().getPreCoverKey();
    }
}
