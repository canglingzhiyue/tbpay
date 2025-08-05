package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.au;
import com.taobao.avplayer.bj;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String g;
    private FrameLayout h;
    private TUrlImageView i;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.d j;
    private bj k;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.d dVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19b1b85", new Object[]{this, dVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ bj a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bj) ipChange.ipc$dispatch("64ebd841", new Object[]{dVar}) : dVar.k;
    }

    public static /* synthetic */ FrameLayout b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("6b291024", new Object[]{dVar}) : dVar.h;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, dVar})).booleanValue() : b2(dVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, dVar}) : a2(dVar);
    }

    static {
        kge.a(-1211276157);
        g = "DescGifViewHolder";
    }

    public d(Context context) {
        super(context);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4ed8d902", new Object[]{this, dVar});
        }
        if (dVar == null) {
            return null;
        }
        this.j = dVar;
        this.h = (FrameLayout) LayoutInflater.from(this.f10821a).inflate(R.layout.tt_detail_main_gif, (ViewGroup) null);
        this.i = (TUrlImageView) this.h.findViewById(R.id.detail_gif_image);
        this.i.setPlaceHoldImageResId(R.drawable.tt_detail_img_load_fail);
        this.i.setSkipAutoSize(false);
        this.i.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.i.getLayoutParams().height = (int) ((dVar.d / ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.d) this.f).e) * com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a));
        this.i.getLayoutParams().width = com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a);
        this.i.setImageUrl(dVar.f10870a);
        c();
        f();
        this.k.c();
        return this.h;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        bj.a aVar = new bj.a((Activity) this.f10821a);
        aVar.c(this.j.c);
        aVar.a(this.j.b);
        aVar.b(this.j.f10870a);
        aVar.c(true);
        aVar.d(com.taobao.android.detail.wrapper.nav.c.STDPOP_POP_ID_DETAIL);
        aVar.d(true);
        aVar.a(d());
        aVar.b(true);
        aVar.a(com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a));
        aVar.b((int) ((this.j.d / ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.d) this.f).e) * com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a)));
        aVar.a(true);
        this.k = aVar.a();
        this.k.a(new a());
        this.k.a();
    }

    private HashMap<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.j.f != null) {
            for (String str : this.j.f.keySet()) {
                Object obj = this.j.f.get(str);
                if (obj instanceof String) {
                    hashMap.put(str, obj.toString());
                }
            }
        }
        return hashMap;
    }

    /* loaded from: classes5.dex */
    public class a implements au {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-50763204);
            kge.a(1497191039);
        }

        @Override // com.taobao.avplayer.au
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.au
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.au
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.au
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            }
        }

        private a() {
        }

        @Override // com.taobao.avplayer.au
        public void a(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b137f1a4", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else if (d.a(d.this) == null || d.a(d.this).b() == null) {
            } else {
                d.b(d.this).removeView(d.a(d.this).b());
                d.a(d.this).f();
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        View b = this.k.b();
        if (b.getParent() != null) {
            ((ViewGroup) b).removeView(b);
        }
        this.h.addView(b, new FrameLayout.LayoutParams(com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a), (int) ((this.j.d / ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.d) this.f).e) * com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a))));
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.h = null;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void cG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3813ba2", new Object[]{this});
            return;
        }
        bj bjVar = this.k;
        if (bjVar == null) {
            return;
        }
        bjVar.d();
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        bj bjVar = this.k;
        if (bjVar != null && bjVar.b() != null) {
            this.k.e();
            this.h.removeView(this.k.b());
            this.k.f();
        }
        g();
    }
}
