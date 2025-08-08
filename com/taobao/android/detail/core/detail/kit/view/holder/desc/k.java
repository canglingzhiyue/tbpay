package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.a11y.ability.ocr.a;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.djt;
import tb.ead;
import tb.ecg;
import tb.eip;
import tb.eir;
import tb.eoi;
import tb.epf;
import tb.epl;
import tb.epm;
import tb.epo;
import tb.iuy;
import tb.kge;
import tb.mto;

/* loaded from: classes4.dex */
public class k extends b<com.taobao.android.detail.core.model.viewmodel.desc.g> implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Set<Integer> s;
    public ImageView k;
    private int l;
    private int m;
    private FrameLayout n;
    private ArrayList<p> o;
    private epl p;
    private String q;
    private boolean r;
    private com.taobao.android.a11y.ability.ocr.a t;

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.PicContainerViewHolder";
    }

    public static /* synthetic */ String a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("373574e1", new Object[]{kVar}) : kVar.q;
    }

    public static /* synthetic */ void a(k kVar, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c722d9f", new Object[]{kVar, new Double(d), new Double(d2)});
        } else {
            kVar.a(d, d2);
        }
    }

    public static /* synthetic */ com.taobao.android.a11y.ability.ocr.a b(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.a11y.ability.ocr.a) ipChange.ipc$dispatch("c9d4f2ca", new Object[]{kVar}) : kVar.t;
    }

    public static /* synthetic */ Set b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[0]) : s;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            c2((com.taobao.android.detail.core.model.viewmodel.desc.g) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, gVar})).booleanValue() : d(gVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ void b(com.taobao.android.detail.core.model.viewmodel.desc.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cb125e", new Object[]{this, gVar});
        } else {
            c2(gVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, gVar}) : b2(gVar);
    }

    static {
        kge.a(97476251);
        kge.a(-1201612728);
        kge.a(1426707756);
        s = new HashSet();
    }

    public k(Activity activity) {
        super(activity);
        this.l = epo.b;
        if (eip.C && s.a()) {
            this.l = iuy.d;
        }
        this.r = eir.g();
        this.n = new FrameLayout(this.g);
        com.taobao.android.detail.core.utils.i.d("[NativeDesc]PicContainerViewHolder", "EnablePicOption:" + this.r);
        if (this.r) {
            TUrlImageView tUrlImageView = new TUrlImageView(this.g);
            tUrlImageView.setErrorImageResId(R.drawable.detail_img_load_fail);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            tUrlImageView.setStrategyConfig(ImageStrategyConfig.a("detail", 15));
            this.k = tUrlImageView;
        } else {
            this.k = new DetailImageView(this.g);
            this.p = new epl.a().b(R.drawable.detail_img_load_fail).c(ImageView.ScaleType.CENTER_CROP).a();
        }
        this.n.addView(this.k);
        this.t = new a.C0340a().a(true).b(true).a("图像识别中").b("图文详情").a();
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!djt.a(this.g)) {
        } else {
            this.k.setFocusableInTouchMode(true);
            this.k.setFocusable(true);
            this.k.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    } else {
                        k.b(k.this).a(k.a(k.this), k.this.k);
                    }
                }
            });
        }
    }

    public void a(ArrayList<epf> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else if (arrayList == null || arrayList.isEmpty()) {
        } else {
            try {
                Iterator<epf> it = arrayList.iterator();
                while (it.hasNext()) {
                    epf next = it.next();
                    if (next.isValid()) {
                        b a2 = com.taobao.android.detail.core.open.j.a(this.g, next);
                        if (a2 instanceof p) {
                            if (this.o == null) {
                                this.o = new ArrayList<>();
                            }
                            p pVar = (p) a2;
                            this.o.add(pVar);
                            View d = pVar.d((p) ((com.taobao.android.detail.core.model.viewmodel.desc.m) next));
                            pVar.e((p) ((com.taobao.android.detail.core.model.viewmodel.desc.m) next));
                            if (d != null) {
                                int c = (int) (this.l * pVar.c());
                                int d2 = (int) (this.m * pVar.d());
                                d.measure(-2, -2);
                                if (d.getMeasuredWidth() + c > this.l) {
                                    c = this.l - d.getMeasuredWidth();
                                }
                                if (d.getMeasuredHeight() + d2 > this.m) {
                                    d2 = this.m - d.getMeasuredHeight();
                                }
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d.getLayoutParams();
                                if (layoutParams == null) {
                                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                }
                                layoutParams.leftMargin = c;
                                layoutParams.topMargin = d2;
                                d.setLayoutParams(layoutParams);
                                this.n.addView(d);
                            }
                        } else if (a2 instanceof f) {
                            f fVar = (f) a2;
                            fVar.d((f) ((com.taobao.android.detail.core.model.viewmodel.desc.c) next));
                            fVar.e((f) ((com.taobao.android.detail.core.model.viewmodel.desc.c) next));
                            fVar.a(this.n, this.l, this.m);
                        }
                    }
                }
            } catch (Exception e) {
                com.taobao.android.detail.core.utils.i.a("PicContainerViewHolder", "drawChildrenView", e);
            }
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(final com.taobao.android.detail.core.model.viewmodel.desc.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e62b81a", new Object[]{this, gVar});
            return;
        }
        this.q = gVar.c;
        this.m = (int) Math.round(((this.l * 1.0d) * gVar.b) / gVar.f9752a);
        this.k.setLayoutParams(new FrameLayout.LayoutParams(-1, this.m));
        this.k.setScaleType(ImageView.ScaleType.FIT_XY);
        com.taobao.android.detail.datasdk.protocol.image.b bVar = new com.taobao.android.detail.datasdk.protocol.image.b() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.k.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.datasdk.protocol.image.b
            public void onSuccess(com.taobao.android.detail.datasdk.protocol.image.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a8e27a", new Object[]{this, aVar});
                } else if (aVar == null || aVar.b == null) {
                } else {
                    double intrinsicHeight = aVar.b.getIntrinsicHeight();
                    double intrinsicWidth = aVar.b.getIntrinsicWidth();
                    if (!com.taobao.android.detail.core.detail.kit.utils.c.c()) {
                        return;
                    }
                    k.a(k.this, intrinsicWidth, intrinsicHeight);
                }
            }

            @Override // com.taobao.android.detail.datasdk.protocol.image.b
            public void onFailure(com.taobao.android.detail.datasdk.protocol.image.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("15b99301", new Object[]{this, aVar});
                } else if (aVar == null || StringUtils.isEmpty(aVar.f10068a)) {
                } else {
                    ecg.e(k.this.g, aVar.f10068a, null);
                }
            }
        };
        if (this.r) {
            final TUrlImageView tUrlImageView = (TUrlImageView) this.k;
            if (!s.contains(Integer.valueOf(gVar.c.hashCode()))) {
                tUrlImageView.setFadeIn(true);
                tUrlImageView.setImageUrl(gVar.c, new PhenixOptions().preloadWithSmall(true).scaleFromLarge(true));
            } else {
                tUrlImageView.setFadeIn(false);
                tUrlImageView.setImageUrl(gVar.c);
            }
            tUrlImageView.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.k.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    Activity activity = k.this.g;
                    String str = gVar.c;
                    ecg.e(activity, str, failPhenixEvent.getResultCode() + "");
                    return false;
                }
            });
            tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.k.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (tUrlImageView == null) {
                        return false;
                    }
                    if (com.taobao.android.detail.core.detail.kit.utils.c.c() && tUrlImageView.getDrawable() != null) {
                        k.a(k.this, tUrlImageView.getDrawable().getIntrinsicWidth(), tUrlImageView.getDrawable().getIntrinsicHeight());
                    }
                    k.b().add(Integer.valueOf(gVar.c.hashCode()));
                    return false;
                }
            });
        } else {
            a((DetailImageView) this.k, gVar.c, new epm(this.l, this.m), bVar, this.p);
        }
        this.k.setTag(gVar.c);
    }

    private void a(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0efa28", new Object[]{this, new Double(d), new Double(d2)});
            return;
        }
        ImageView imageView = this.k;
        if (imageView == null || d2 <= mto.a.GEO_NOT_SUPPORT || d <= mto.a.GEO_NOT_SUPPORT) {
            return;
        }
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.m));
        double d3 = d2 / d;
        if (Math.abs(d3 - (this.m / this.l)) < 0.001d) {
            return;
        }
        this.m = (int) Math.round(this.l * d3);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.m);
        } else {
            layoutParams.height = this.m;
        }
        this.k.setLayoutParams(layoutParams);
        f();
    }

    private void f() {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.n;
        if (frameLayout == null || frameLayout.getChildCount() <= 1 || (layoutParams = this.n.getLayoutParams()) == null || layoutParams.height == this.m || !com.taobao.android.detail.core.aura.utils.f.u()) {
            return;
        }
        layoutParams.height = this.m;
        this.n.setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!(view.getTag() instanceof String)) {
        } else {
            com.taobao.android.detail.core.event.params.c cVar = new com.taobao.android.detail.core.event.params.c();
            cVar.f9716a = true;
            cVar.c = 0;
            cVar.f = view;
            cVar.e.add((String) view.getTag());
            com.taobao.android.trade.event.f.a(this.g, new com.taobao.android.detail.core.event.basic.o(cVar));
            if (((com.taobao.android.detail.core.model.viewmodel.desc.g) this.c).events == null || ((com.taobao.android.detail.core.model.viewmodel.desc.g) this.c).events.isEmpty()) {
                return;
            }
            ead.a(this.g, ((com.taobao.android.detail.core.model.viewmodel.desc.g) this.c).events);
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public View b2(com.taobao.android.detail.core.model.viewmodel.desc.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("94f28f7b", new Object[]{this, gVar}) : this.n;
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public void c2(com.taobao.android.detail.core.model.viewmodel.desc.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6a4ed8", new Object[]{this, gVar});
        } else if (StringUtils.isEmpty(gVar.c)) {
        } else {
            a2(gVar);
            this.k.setOnClickListener(this);
            this.k.setOnLongClickListener(this);
            a(gVar.d());
            if (this.t == null || !djt.a(this.g)) {
                return;
            }
            this.t.a(gVar.c, this.k);
        }
    }

    public boolean d(com.taobao.android.detail.core.model.viewmodel.desc.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a06e1a3b", new Object[]{this, gVar})).booleanValue() : StringUtils.isEmpty(gVar.c);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.r) {
            s.clear();
        }
        super.a();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        if (StringUtils.equals("true", OrangeConfig.getInstance().getConfig("android_share_bizconfig", "DetailImageLongPressShare", "false"))) {
            eoi eoiVar = new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT);
            eoiVar.b = new HashMap();
            eoiVar.b.put("share_businessId", "picture-desc");
            eoiVar.b.put("share_imageUrl", this.q);
            com.taobao.android.trade.event.f.a(this.g, eoiVar);
        } else {
            com.taobao.android.trade.event.f.a(this.g, new com.taobao.android.detail.core.event.basic.q((ImageView) view));
        }
        return false;
    }
}
