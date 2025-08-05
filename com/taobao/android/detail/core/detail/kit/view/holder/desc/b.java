package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import tb.eno;
import tb.enp;
import tb.enu;
import tb.eny;
import tb.epf;
import tb.epj;
import tb.epl;
import tb.epm;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class b<T extends epf> extends com.taobao.android.detail.core.detail.kit.view.holder.c<T> implements com.taobao.android.detail.core.detail.kit.view.holder.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Activity g;
    public LayoutInflater h;
    public Resources i;
    public Event j;
    private int k;

    static {
        kge.a(760666517);
        kge.a(885962108);
        kge.a(345226328);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public abstract boolean a(T t);

    public abstract void b(T t);

    public abstract View c(T t);

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.DescViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((b<T>) ((epf) bVar));
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ boolean b(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5839c995", new Object[]{this, bVar})).booleanValue() : e((b<T>) ((epf) bVar));
    }

    public b(Activity activity) {
        super(activity);
        this.g = activity;
        this.h = LayoutInflater.from(activity);
        this.i = this.g.getResources();
    }

    public View d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6aca9fa2", new Object[]{this, t});
        }
        this.c = t;
        try {
            this.b = c((b<T>) t);
            if (com.taobao.android.detail.core.debug.a.a(this.g) && TStudioHelper.a().b() && this.b != null) {
                this.b = TStudioHelper.a().a(this.b);
            }
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("DescViewHolder", "Detail view holder get view error:", e);
            this.b = null;
        }
        return this.b;
    }

    public boolean e(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a15425e5", new Object[]{this, t})).booleanValue();
        }
        this.c = t;
        if (this.b != null && this.c != 0) {
            if (com.taobao.android.detail.core.debug.a.a(this.g) && TStudioHelper.a().b() && this.b != null) {
                TStudioHelper.a().a(this.b, t);
            }
            if (a((b<T>) t)) {
                this.b.setVisibility(8);
            } else {
                if (this.b.getVisibility() == 8) {
                    this.b.setVisibility(0);
                }
                f(t);
                if (this.j != null && !t.x) {
                    com.taobao.android.trade.event.f.a(this.g, this.j);
                    t.x = true;
                }
                b((b<T>) t);
            }
        }
        return true;
    }

    public void f(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd72c62", new Object[]{this, t});
        } else if (this.c != 0 && ((epf) this.c).component != null) {
            ArrayList arrayList = new ArrayList();
            for (Event event : t.events) {
                if (event != null) {
                    if (event.getEventId() == eno.a(enu.class) || event.getEventId() == eno.a(eny.class)) {
                        arrayList.add(event);
                    } else if (event.getEventId() == eno.a(enp.class)) {
                        this.j = event;
                    }
                }
            }
            com.taobao.android.detail.core.detail.kit.utils.d.a(this.g, t, this.b, arrayList);
        }
    }

    public void a(DetailImageView detailImageView, String str, epm epmVar, com.taobao.android.detail.datasdk.protocol.image.b bVar, epl eplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ecdd69e", new Object[]{this, detailImageView, str, epmVar, bVar, eplVar});
            return;
        }
        if (eplVar == null) {
            eplVar = new epl.a().a();
        }
        if (detailImageView == null || TextUtils.isEmpty(str)) {
            return;
        }
        epl eplVar2 = null;
        if (eplVar != null) {
            epl.a c = new epl.a().b(eplVar.a()).b(eplVar.e()).a(eplVar.c()).a(eplVar.d()).c(eplVar.b());
            if (epmVar != null) {
                c.c(epmVar.f27510a).d(epmVar.b);
            }
            eplVar2 = c.a();
        }
        com.taobao.android.detail.datasdk.protocol.adapter.core.c b = epj.b();
        if (b == null) {
            return;
        }
        b.a(str, detailImageView, eplVar2, bVar);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup}) : c((b<T>) ((epf) this.c));
    }
}
