package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.HorizontalScrollView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.dzc;
import tb.dzu;
import tb.epf;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class n extends b<com.taobao.android.detail.core.model.viewmodel.desc.k> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int k;
    private LinearLayout l;
    private HorizontalScrollView m;
    private LinearLayout n;
    private int o;
    private ArrayList<b<epf>> p;
    private dzu q;

    static {
        kge.a(2090648344);
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.ScrollableContainerViewHolder";
    }

    public static /* synthetic */ int a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45256eaf", new Object[]{nVar})).intValue() : nVar.o;
    }

    public static /* synthetic */ int a(n nVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f88dbba", new Object[]{nVar, new Integer(i)})).intValue();
        }
        nVar.o = i;
        return i;
    }

    public static /* synthetic */ ArrayList b(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("96e8add7", new Object[]{nVar}) : nVar.p;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b c(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("8dc39c0", new Object[]{nVar}) : nVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b d(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("25158d1f", new Object[]{nVar}) : nVar.c;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((com.taobao.android.detail.core.model.viewmodel.desc.k) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, kVar})).booleanValue() : c2(kVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, kVar}) : a2(kVar);
    }

    public n(Activity activity) {
        super(activity);
        this.k = (int) (epo.f27511a * 3.0f);
        this.o = -1;
        this.p = new ArrayList<>();
        this.q = new dzu();
        this.l = new LinearLayout(this.g);
        this.l.setOrientation(1);
        this.m = new HorizontalScrollView(this.g);
        this.m.setOverScrollMode(2);
        this.m.setHorizontalScrollBarEnabled(false);
        this.n = new LinearLayout(this.g);
        this.n.setOrientation(0);
        this.m.addView(this.n, new LinearLayout.LayoutParams(-1, -2));
        this.m.setOnScrollListener(new HorizontalScrollView.a() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.n.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.kit.view.widget.main.HorizontalScrollView.a
            public void a(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                if (n.a(n.this) == -1) {
                    if (n.b(n.this).isEmpty()) {
                        return;
                    }
                    n nVar = n.this;
                    n.a(nVar, ((b) n.b(nVar).get(0)).c((b) null).getWidth());
                    int a2 = epo.b / n.a(n.this);
                    if (a2 > 1) {
                        for (int i5 = 1; i5 < a2; i5++) {
                            if (i5 < n.b(n.this).size()) {
                                b bVar = (b) n.b(n.this).get(i5);
                                epf epfVar = ((com.taobao.android.detail.core.model.viewmodel.desc.k) n.c(n.this)).d().get(i5);
                                if (bVar.j != null && !epfVar.x) {
                                    com.taobao.android.trade.event.f.a(n.this.g, bVar.j);
                                    epfVar.x = true;
                                }
                            }
                        }
                    }
                }
                int a3 = (epo.b + i) / n.a(n.this);
                if (a3 <= 0 || a3 >= n.b(n.this).size()) {
                    return;
                }
                b bVar2 = (b) n.b(n.this).get(a3);
                epf epfVar2 = ((com.taobao.android.detail.core.model.viewmodel.desc.k) n.d(n.this)).d().get(a3);
                if (bVar2.j == null || epfVar2.x) {
                    return;
                }
                com.taobao.android.trade.event.f.a(n.this.g, bVar2.j);
                epfVar2.x = true;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(epf epfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5a32e3", new Object[]{this, epfVar});
            return;
        }
        b<? extends epf> a2 = this.q.a(this.g, epfVar);
        if (a2 == null) {
            return;
        }
        this.p.add(a2);
        View d = a2.d((b<? extends epf>) epfVar);
        if (d == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams.rightMargin = this.k;
        this.n.addView(d, layoutParams);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("96082858", new Object[]{this, kVar});
        }
        this.l.addView(this.m, new LinearLayout.LayoutParams(-1, -2));
        int b = epo.b(9);
        this.l.setBackgroundColor(this.i.getColor(R.color.detail_white));
        if (kVar.b != null) {
            this.l.setPadding(0, 0, 0, b);
        } else {
            this.l.setPadding(b, b, 0, b);
        }
        Iterator<epf> it = kVar.d().iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        if (!StringUtils.isEmpty(kVar.f9759a)) {
            TextView textView = new TextView(this.g);
            textView.setText(kVar.f9759a);
            textView.setGravity(17);
            textView.setTextColor(this.i.getColor(R.color.detail_desc_container_style2_nomoretip_textcolor));
            textView.setTextSize(1, 16.0f);
            textView.setBackgroundColor(this.i.getColor(R.color.detail_desc_container_style2_nomoretip_bg));
            LinearLayout linearLayout = this.n;
            ViewGroup.LayoutParams layoutParams = linearLayout.getChildAt(linearLayout.getChildCount() - 1).getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            textView.setLayoutParams(layoutParams);
            this.n.addView(textView, new LinearLayout.LayoutParams((int) dzc.COUPONVIEW_DEFAULTWIDTH, -1));
        }
        return this.l;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(com.taobao.android.detail.core.model.viewmodel.desc.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946854f5", new Object[]{this, kVar});
            return;
        }
        int size = kVar.d().size();
        for (int i = 0; i < size; i++) {
            b<epf> bVar = this.p.get(i);
            bVar.e((b<epf>) kVar.d().get(i));
            if (i == 0 && bVar.j != null && !kVar.x) {
                com.taobao.android.trade.event.f.a(this.g, this.j);
                kVar.x = true;
            }
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.core.model.viewmodel.desc.k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a6c2058", new Object[]{this, kVar})).booleanValue() : kVar.d().isEmpty();
    }
}
