package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.epf;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class q extends b<com.taobao.android.detail.core.model.viewmodel.desc.n> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout k;
    private final int l;
    private final int m;
    private int n;
    private LinearLayout o;
    private ArrayList<b<epf>> p;

    static {
        kge.a(610037297);
    }

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.core.model.viewmodel.desc.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a6d7d75", new Object[]{this, nVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.SplitableContainerViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((com.taobao.android.detail.core.model.viewmodel.desc.n) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, nVar})).booleanValue() : c2(nVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, nVar}) : a2(nVar);
    }

    public q(Activity activity) {
        super(activity);
        this.l = epo.b(9);
        this.m = epo.b(12);
        this.n = (int) Math.ceil((epo.b - this.l) / 2);
        this.p = new ArrayList<>();
        this.k = new LinearLayout(this.g);
        this.k.setOrientation(1);
        this.k.setPadding(0, 0, 0, this.l);
    }

    private void a(epf epfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba2297", new Object[]{this, epfVar, new Boolean(z)});
            return;
        }
        b<epf> a2 = com.taobao.android.detail.core.open.j.a(this.g, epfVar);
        if (a2 == null) {
            return;
        }
        this.p.add(a2);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        View d = a2.d((b<epf>) epfVar);
        if (d == null) {
            return;
        }
        if (d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) d.getLayoutParams();
        }
        if (marginLayoutParams == null) {
            marginLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        if (this.o == null) {
            this.o = new LinearLayout(this.g);
            this.o.setOrientation(0);
        }
        marginLayoutParams.width = this.n;
        if (!z) {
            marginLayoutParams.rightMargin = this.l;
        } else {
            marginLayoutParams.rightMargin = 0;
        }
        this.o.addView(d, marginLayoutParams);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("29995835", new Object[]{this, nVar});
        }
        if (!nVar.d().isEmpty()) {
            this.n = (int) Math.ceil(((epo.b - (this.m << 1)) - (this.l * (nVar.d().size() - 1))) / nVar.d().size());
            Iterator<epf> it = nVar.d().iterator();
            while (it.hasNext()) {
                epf next = it.next();
                if (nVar.d().indexOf(next) == nVar.d().size() - 1) {
                    a(next, true);
                } else {
                    a(next, false);
                }
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i = this.m;
            layoutParams.setMargins(i, 0, i, 0);
            this.k.addView(this.o, layoutParams);
        }
        return this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(com.taobao.android.detail.core.model.viewmodel.desc.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9469b212", new Object[]{this, nVar});
            return;
        }
        int size = nVar.d().size();
        for (int i = 0; i < size; i++) {
            b<epf> bVar = this.p.get(i);
            if (i <= size - 1) {
                bVar.b(h());
                bVar.e((b<epf>) nVar.d().get(i));
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        Iterator<b<epf>> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().a(z, z2);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        Iterator<b<epf>> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().G_();
        }
    }
}
