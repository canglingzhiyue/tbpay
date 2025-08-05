package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes4.dex */
public class f extends b<com.taobao.android.detail.core.model.viewmodel.desc.c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public double k;
    public double l;
    public double m;
    public double n;
    private View o;

    static {
        kge.a(-440015240);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.core.model.viewmodel.desc.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a687d60", new Object[]{this, cVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.HotAreaViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((com.taobao.android.detail.core.model.viewmodel.desc.c) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, cVar})).booleanValue() : c2(cVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, cVar}) : a2(cVar);
    }

    public f(Activity activity) {
        super(activity);
        this.o = new View(this.g);
        this.o.setContentDescription("热区");
    }

    public void a(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
        } else if (this.o == null || viewGroup == null || ((com.taobao.android.detail.core.model.viewmodel.desc.c) this.c).b != 1) {
        } else {
            double d = i;
            int i3 = (int) (((com.taobao.android.detail.core.model.viewmodel.desc.c) this.c).c * d);
            double d2 = i2;
            int i4 = (int) (((com.taobao.android.detail.core.model.viewmodel.desc.c) this.c).d * d2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (d * (((com.taobao.android.detail.core.model.viewmodel.desc.c) this.c).e - ((com.taobao.android.detail.core.model.viewmodel.desc.c) this.c).c)), (int) (d2 * (((com.taobao.android.detail.core.model.viewmodel.desc.c) this.c).f - ((com.taobao.android.detail.core.model.viewmodel.desc.c) this.c).d)));
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i3;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
            viewGroup.addView(this.o, layoutParams);
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("61da5360", new Object[]{this, cVar}) : this.o;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(com.taobao.android.detail.core.model.viewmodel.desc.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9464b1fd", new Object[]{this, cVar});
            return;
        }
        this.k = cVar.c;
        this.l = cVar.d;
        this.m = cVar.e;
        this.n = cVar.f;
        if (cVar.b != 1) {
            return;
        }
        this.o.setBackgroundResource(R.color.detail_transparent);
    }
}
