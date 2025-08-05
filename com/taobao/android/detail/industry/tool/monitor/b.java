package com.taobao.android.detail.industry.tool.monitor;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final c f10124a;

    static {
        kge.a(2118406400);
    }

    public b(q qVar) {
        this.f10124a = new c(qVar);
        emu.a("com.taobao.android.detail.industry.tool.monitor.DIComponentMonitorAspect");
    }

    public void a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ccdc08", new Object[]{this, aURARenderComponentContainer, viewGroup, new Integer(i)});
            return;
        }
        this.f10124a.c = System.currentTimeMillis();
        if (aURARenderComponentContainer == null) {
            return;
        }
        this.f10124a.b = aURARenderComponentContainer.containerType;
    }

    public void a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2fb4c", new Object[]{this, aURARenderComponentContainer, viewGroup, view, new Integer(i)});
        } else {
            this.f10124a.d = System.currentTimeMillis();
        }
    }

    public void a(q qVar, AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b751c88", new Object[]{this, qVar, aURARenderComponent, view});
            return;
        }
        this.f10124a.e = System.currentTimeMillis();
        this.f10124a.b(aURARenderComponent);
        if (!this.f10124a.b()) {
            return;
        }
        a.a(qVar.e(), aURARenderComponent.key, this);
    }

    public void a(AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4392661f", new Object[]{this, aURARenderComponent, view});
            return;
        }
        this.f10124a.f = System.currentTimeMillis();
        this.f10124a.a();
    }

    public void b(AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2197760", new Object[]{this, aURARenderComponent, view});
            return;
        }
        this.f10124a.g = System.currentTimeMillis();
        this.f10124a.a(true);
    }

    public void c(AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20a088a1", new Object[]{this, aURARenderComponent, view});
            return;
        }
        this.f10124a.g = System.currentTimeMillis();
        this.f10124a.a(false);
    }

    public void a(com.alibaba.android.aura.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
        } else {
            this.f10124a.a(bVar);
        }
    }
}
