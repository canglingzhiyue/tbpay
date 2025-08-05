package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.kge;
import tb.mto;
import tb.sys;
import tb.szp;

/* loaded from: classes5.dex */
public class o extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n> implements View.OnClickListener, View.OnLongClickListener, com.taobao.android.detail.ttdetail.communication.g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETAIL_IMG_BIZ_CODE = 15;
    public static final String DETAIL_IMG_BIZ_NAME = "detail";
    private static Set<Integer> m;
    public ImageView g;
    private int h;
    private int i;
    private ObserverFrameLayout j;
    private ArrayList<u> k;
    private String l;
    private boolean n;

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(o oVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37499d8b", new Object[]{oVar, new Integer(i)})).intValue();
        }
        oVar.h = i;
        return i;
    }

    public static /* synthetic */ Set a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[0]) : m;
    }

    public static /* synthetic */ void a(o oVar, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e82fcb", new Object[]{oVar, new Double(d), new Double(d2)});
        } else {
            oVar.a(d, d2);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, nVar})).booleanValue() : d(nVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b8fe0", new Object[]{this, nVar});
        } else {
            c2(nVar);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, nVar}) : b2(nVar);
    }

    static {
        kge.a(-23234167);
        kge.a(-1201612728);
        kge.a(1426707756);
        kge.a(-767194759);
        m = new HashSet();
    }

    public o(Context context) {
        super(context);
        this.n = false;
        this.h = com.taobao.android.detail.ttdetail.utils.f.a(context);
        this.j = new ObserverFrameLayout(this.f10821a);
        if (com.taobao.android.detail.ttdetail.utils.e.b()) {
            this.j.setOnSizeChangedListener(new ObserverFrameLayout.a() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.o.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout.a
                public void a(int i) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    } else if (!com.taobao.android.detail.ttdetail.utils.e.b()) {
                    } else {
                        o.a(o.this, i);
                    }
                }
            });
        }
        TUrlImageView tUrlImageView = new TUrlImageView(this.f10821a);
        tUrlImageView.setErrorImageResId(R.drawable.tt_detail_img_load_fail);
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tUrlImageView.setStrategyConfig(ImageStrategyConfig.a("detail", 15));
        this.g = tUrlImageView;
        this.j.addView(this.g);
        c();
    }

    public void a(ArrayList<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else if (arrayList == null || arrayList.isEmpty()) {
        } else {
            try {
                Iterator<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> it = arrayList.iterator();
                while (it.hasNext()) {
                    com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e next = it.next();
                    if (next.i()) {
                        e<? extends com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> a2 = com.taobao.android.detail.ttdetail.skeleton.desc.natives.d.a(this.f10821a, next);
                        if (a2 instanceof u) {
                            if (this.k == null) {
                                this.k = new ArrayList<>();
                            }
                            u uVar = (u) a2;
                            this.k.add(uVar);
                            View d = uVar.d((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u) next);
                            uVar.e((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u) next);
                            if (d != null) {
                                int c = (int) (this.h * uVar.c());
                                int d2 = (int) (this.i * uVar.d());
                                d.measure(-2, -2);
                                if (d.getMeasuredWidth() + c > this.h) {
                                    c = this.h - d.getMeasuredWidth();
                                }
                                if (d.getMeasuredHeight() + d2 > this.i) {
                                    d2 = this.i - d.getMeasuredHeight();
                                }
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d.getLayoutParams();
                                if (layoutParams == null) {
                                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                }
                                layoutParams.leftMargin = c;
                                layoutParams.topMargin = d2;
                                d.setLayoutParams(layoutParams);
                                this.j.addView(d);
                            }
                        } else if (a2 instanceof j) {
                            j jVar = (j) a2;
                            jVar.d((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j) next);
                            jVar.e((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j) next);
                            jVar.a(this.j, this.h, this.i);
                        }
                    }
                }
            } catch (Exception e) {
                com.taobao.android.detail.ttdetail.utils.i.a("PicContainerViewHolder", "drawChildrenView", e);
            }
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(final com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf17c76", new Object[]{this, nVar});
            return;
        }
        this.l = nVar.c;
        this.i = (int) Math.round(((this.h * 1.0d) * nVar.b) / nVar.f10884a);
        this.g.setLayoutParams(new FrameLayout.LayoutParams(-1, this.i));
        this.g.setScaleType(ImageView.ScaleType.FIT_XY);
        final TUrlImageView tUrlImageView = (TUrlImageView) this.g;
        if (com.taobao.android.detail.ttdetail.utils.j.aq()) {
            tUrlImageView.setSkipAutoSize(!TextUtils.isEmpty(this.l) && this.l.toLowerCase().endsWith(".gif"));
        }
        if (!m.contains(Integer.valueOf(nVar.c.hashCode()))) {
            tUrlImageView.setFadeIn(true);
            tUrlImageView.setImageUrl(nVar.c, new PhenixOptions().preloadWithSmall(true).scaleFromLarge(true));
        } else {
            tUrlImageView.setFadeIn(false);
            if (com.taobao.android.detail.ttdetail.utils.j.ae()) {
                tUrlImageView.asyncSetImageUrl(nVar.c);
            } else {
                tUrlImageView.setImageUrl(nVar.c);
            }
        }
        tUrlImageView.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.o.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                return false;
            }

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }
        });
        tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.o.3
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
                TUrlImageView tUrlImageView2 = tUrlImageView;
                if (tUrlImageView2 == null) {
                    return false;
                }
                if (tUrlImageView2.getDrawable() != null) {
                    o.a(o.this, tUrlImageView.getDrawable().getIntrinsicWidth(), tUrlImageView.getDrawable().getIntrinsicHeight());
                }
                o.a().add(Integer.valueOf(nVar.c.hashCode()));
                return false;
            }
        });
        this.g.setTag(nVar.c);
    }

    private void a(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0efa28", new Object[]{this, new Double(d), new Double(d2)});
            return;
        }
        ImageView imageView = this.g;
        if (imageView == null || d2 <= mto.a.GEO_NOT_SUPPORT || d <= mto.a.GEO_NOT_SUPPORT) {
            return;
        }
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.i));
        double d3 = d2 / d;
        if (Math.abs(d3 - (this.i / this.h)) < 0.001d) {
            return;
        }
        this.i = (int) Math.round(this.h * d3);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.i);
        } else {
            layoutParams.height = this.i;
        }
        this.g.setLayoutParams(layoutParams);
        d();
    }

    private void d() {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ObserverFrameLayout observerFrameLayout = this.j;
        if (observerFrameLayout == null || observerFrameLayout.getChildCount() <= 1 || (layoutParams = this.j.getLayoutParams()) == null) {
            return;
        }
        int i = layoutParams.height;
        int i2 = this.i;
        if (i == i2) {
            return;
        }
        layoutParams.height = i2;
        this.j.setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!(view.getTag() instanceof String)) {
        } else {
            String str = (String) view.getTag();
            if (((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n) this.f).u != null && !((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n) this.f).u.isEmpty()) {
                sys.a(this.f10821a, ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n) this.f).u);
            }
            com.taobao.android.detail.ttdetail.widget.desc.picgallery.c cVar = new com.taobao.android.detail.ttdetail.widget.desc.picgallery.c();
            cVar.f11018a = true;
            cVar.c = 0;
            cVar.f = view;
            cVar.e.add(str);
            com.taobao.android.detail.ttdetail.communication.c.a(this.f10821a, new szp(cVar));
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public View b2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("75bd7fb9", new Object[]{this, nVar}) : this.j;
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public void c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("354dd1f8", new Object[]{this, nVar});
        } else if (TextUtils.isEmpty(nVar.c)) {
        } else {
            a2(nVar);
            this.g.setOnClickListener(this);
            this.g.setOnLongClickListener(this);
            a(nVar.f());
        }
    }

    public boolean d(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68fbfcbd", new Object[]{this, nVar})).booleanValue() : TextUtils.isEmpty(nVar.c);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(this.f10821a, com.taobao.android.detail.ttdetail.bizmessage.o.class, this);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(this.f10821a, com.taobao.android.detail.ttdetail.bizmessage.o.class);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f();
        m.clear();
        super.b();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        if (this.n) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("share_businessId", (Object) "picture-desc");
        jSONObject.put("share_imageUrl", (Object) this.l);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("detailShareParams", (Object) jSONObject);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10821a, new com.taobao.android.detail.ttdetail.bizmessage.h("share", jSONObject2, new RuntimeAbilityParam[0]));
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public boolean receiveMessage(com.taobao.android.detail.ttdetail.communication.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, dVar})).booleanValue();
        }
        if (!(dVar instanceof com.taobao.android.detail.ttdetail.bizmessage.o)) {
            return false;
        }
        this.n = com.taobao.android.detail.ttdetail.bizmessage.o.SCROLLING.equals(((com.taobao.android.detail.ttdetail.bizmessage.o) dVar).a());
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }
}
