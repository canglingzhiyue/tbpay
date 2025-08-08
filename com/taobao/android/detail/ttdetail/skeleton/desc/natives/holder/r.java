package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.HorizontalScrollView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes5.dex */
public class r extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.r> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float COUPONVIEW_DEFAULTWIDTH;
    private final int g;
    private LinearLayout h;
    private HorizontalScrollView i;
    private LinearLayout j;
    private int k;
    private ArrayList<e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e>> l;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.d m;

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("124e0bdb", new Object[]{rVar})).intValue() : rVar.k;
    }

    public static /* synthetic */ int a(r rVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3773e40e", new Object[]{rVar, new Integer(i)})).intValue();
        }
        rVar.k = i;
        return i;
    }

    public static /* synthetic */ ArrayList b(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("c98a7b21", new Object[]{rVar}) : rVar.l;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, rVar})).booleanValue() : c2(rVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, rVar}) : a2(rVar);
    }

    static {
        kge.a(301277290);
        COUPONVIEW_DEFAULTWIDTH = com.taobao.android.detail.ttdetail.utils.f.b * 154.0f;
    }

    public r(Context context) {
        super(context);
        this.g = (int) (com.taobao.android.detail.ttdetail.utils.f.b * 3.0f);
        this.k = -1;
        this.l = new ArrayList<>();
        this.m = new com.taobao.android.detail.ttdetail.skeleton.desc.natives.d();
        this.h = new LinearLayout(this.f10821a);
        this.h.setOrientation(1);
        this.i = new HorizontalScrollView(this.f10821a);
        this.i.setOverScrollMode(2);
        this.i.setHorizontalScrollBarEnabled(false);
        this.j = new LinearLayout(this.f10821a);
        this.j.setOrientation(0);
        this.i.addView(this.j, new LinearLayout.LayoutParams(-1, -2));
        this.i.setOnScrollListener(new HorizontalScrollView.a() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.r.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.HorizontalScrollView.a
            public void a(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                if (r.a(r.this) == -1) {
                    if (r.b(r.this).isEmpty()) {
                        return;
                    }
                    r rVar = r.this;
                    r.a(rVar, ((e) r.b(rVar).get(0)).c(null).getWidth());
                    int a2 = com.taobao.android.detail.ttdetail.utils.f.c / r.a(r.this);
                    if (a2 > 1) {
                        for (int i5 = 1; i5 < a2; i5++) {
                            if (i5 < r.b(r.this).size()) {
                                e eVar = (e) r.b(r.this).get(i5);
                                com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e eVar2 = ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.r) r.this.f).f().get(i5);
                                if (eVar.e != null && !eVar2.o) {
                                    com.taobao.android.detail.ttdetail.communication.c.a(r.this.f10821a, eVar.e);
                                    eVar2.o = true;
                                }
                            }
                        }
                    }
                }
                int a3 = (com.taobao.android.detail.ttdetail.utils.f.c + i) / r.a(r.this);
                if (a3 <= 0 || a3 >= r.b(r.this).size()) {
                    return;
                }
                e eVar3 = (e) r.b(r.this).get(a3);
                com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e eVar4 = ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.r) r.this.f).f().get(a3);
                if (eVar3.e == null || eVar4.o) {
                    return;
                }
                com.taobao.android.detail.ttdetail.communication.c.a(r.this.f10821a, eVar3.e);
                eVar4.o = true;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40265a5", new Object[]{this, eVar});
            return;
        }
        e<? extends com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> a2 = com.taobao.android.detail.ttdetail.skeleton.desc.natives.d.a(this.f10821a, eVar);
        if (a2 == null) {
            return;
        }
        this.l.add(a2);
        View d = a2.d(eVar);
        if (d == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams.rightMargin = this.g;
        this.j.addView(d, layoutParams);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("aa290db4", new Object[]{this, rVar});
        }
        this.h.addView(this.i, new LinearLayout.LayoutParams(-1, -2));
        int a2 = com.taobao.android.detail.ttdetail.utils.f.a(9.0f);
        this.h.setBackgroundColor(this.c.getColor(R.color.tt_detail_white));
        if (rVar.b != null) {
            this.h.setPadding(0, 0, 0, a2);
        } else {
            this.h.setPadding(a2, a2, 0, a2);
        }
        Iterator<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> it = rVar.f().iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        if (!StringUtils.isEmpty(rVar.f10891a)) {
            TextView textView = new TextView(this.f10821a);
            textView.setText(rVar.f10891a);
            textView.setGravity(17);
            textView.setTextColor(this.c.getColor(R.color.tt_detail_desc_container_style2_nomoretip_textcolor));
            textView.setTextSize(1, 16.0f);
            textView.setBackgroundColor(this.c.getColor(R.color.tt_detail_desc_container_style2_nomoretip_bg));
            LinearLayout linearLayout = this.j;
            ViewGroup.LayoutParams layoutParams = linearLayout.getChildAt(linearLayout.getChildCount() - 1).getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            textView.setLayoutParams(layoutParams);
            this.j.addView(textView, new LinearLayout.LayoutParams((int) COUPONVIEW_DEFAULTWIDTH, -1));
        }
        return this.h;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a178b3", new Object[]{this, rVar});
            return;
        }
        int size = rVar.f().size();
        for (int i = 0; i < size; i++) {
            e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> eVar = this.l.get(i);
            eVar.e(rVar.f().get(i));
            if (i == 0 && eVar.e != null && !rVar.o) {
                com.taobao.android.detail.ttdetail.communication.c.a(this.f10821a, this.e);
                rVar.o = true;
            }
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("354fa378", new Object[]{this, rVar})).booleanValue() : rVar.f().isEmpty();
    }
}
