package com.taobao.android.fluid.framework.card.cards.video.manager.landscape;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.datamodel.a;
import tb.kge;
import tb.sii;
import tb.sje;
import tb.sjh;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final sje f12509a;
    private final sii b;
    private LandscapeController c;

    static {
        kge.a(-414926242);
    }

    public c(sii siiVar) {
        this.b = siiVar;
        this.f12509a = new sjh(siiVar.z());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = new LandscapeController(this.b.z(), this.b.y(), this.b.P(), this.f12509a, this.b.k().f(), this.b.ah().b(), a.c.a(this.b.D()));
        }
    }

    public LandscapeController b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LandscapeController) ipChange.ipc$dispatch("d324dd6f", new Object[]{this}) : this.c;
    }

    public sje c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sje) ipChange.ipc$dispatch("1e6dd0ae", new Object[]{this}) : this.f12509a;
    }
}
