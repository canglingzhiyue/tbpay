package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.content.res.Resources;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.d;
import java.util.ArrayList;
import tb.kge;
import tb.syt;

/* loaded from: classes5.dex */
public abstract class e<T extends com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f10821a;
    public LayoutInflater b;
    public Resources c;
    public View d;
    public com.taobao.android.detail.ttdetail.communication.a e;
    public T f;
    private int g;

    static {
        kge.a(1072546435);
        kge.a(78488411);
        kge.a(1871053391);
    }

    public abstract boolean a(T t);

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public abstract void b(T t);

    public void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public abstract View c(T t);

    public void cG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3813ba2", new Object[]{this});
        }
    }

    public e(Context context) {
        this.f10821a = context;
        this.b = LayoutInflater.from(context);
        this.c = this.f10821a.getResources();
    }

    public View d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8660a924", new Object[]{this, t});
        }
        this.f = t;
        try {
            this.d = c(t);
        } catch (Exception e) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescViewHolder", "Detail view holder get view error:", e);
            this.d = null;
        }
        return this.d;
    }

    public boolean e(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ca61027", new Object[]{this, t})).booleanValue();
        }
        this.f = t;
        if (this.d != null && this.f != null) {
            if (a(t)) {
                this.d.setVisibility(8);
            } else {
                if (this.d.getVisibility() == 8) {
                    this.d.setVisibility(0);
                }
                f(t);
                if (this.e != null && !t.o) {
                    com.taobao.android.detail.ttdetail.communication.c.a(this.f10821a, this.e);
                    t.o = true;
                }
                b((e<T>) t);
            }
        }
        return true;
    }

    public void f(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0543ae4", new Object[]{this, t});
            return;
        }
        T t2 = this.f;
        if (t2 == null || t2.s == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (com.taobao.android.detail.ttdetail.communication.a aVar : t.u) {
            if (aVar != null && (aVar instanceof com.taobao.android.detail.ttdetail.bizmessage.h)) {
                String b = ((com.taobao.android.detail.ttdetail.bizmessage.h) aVar).b();
                if ("user_track".equals(b) || "open_url".equals(b)) {
                    arrayList.add(aVar);
                } else if ("ut_exposure".equals(b)) {
                    this.e = aVar;
                }
            }
        }
        syt.a(this.f10821a, t, this.d, arrayList);
    }

    public void a(DetailImageView detailImageView, String str, com.taobao.android.detail.ttdetail.widget.desc.image.g gVar, com.taobao.android.detail.ttdetail.widget.desc.image.c cVar, com.taobao.android.detail.ttdetail.widget.desc.image.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2384d19", new Object[]{this, detailImageView, str, gVar, cVar, dVar});
            return;
        }
        if (dVar == null) {
            dVar = new d.a().a();
        }
        if (detailImageView == null || StringUtils.isEmpty(str)) {
            return;
        }
        com.taobao.android.detail.ttdetail.widget.desc.image.d dVar2 = null;
        if (dVar != null) {
            d.a c = new d.a().b(dVar.a()).b(dVar.e()).a(dVar.c()).a(dVar.d()).c(dVar.b());
            if (gVar != null) {
                c.c(gVar.f11003a).d(gVar.b);
            }
            dVar2 = c.a();
        }
        com.taobao.android.detail.ttdetail.widget.desc.image.i a2 = com.taobao.android.detail.ttdetail.widget.desc.image.i.a();
        if (a2 == null) {
            return;
        }
        if (cVar == null) {
            a2.a(str, detailImageView, dVar2);
        } else {
            a2.a(str, detailImageView, dVar2, cVar);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.g;
    }
}
