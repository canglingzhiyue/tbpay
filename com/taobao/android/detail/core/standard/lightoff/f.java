package com.taobao.android.detail.core.standard.lightoff;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.DialogFragment;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView;
import com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffPicComponent;
import com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffVideoComponent;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.standard.video.m;
import com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.taobao.R;
import java.util.Map;
import tb.eir;
import tb.elq;
import tb.emd;
import tb.emu;
import tb.epj;
import tb.eps;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DialogFragment f9840a;
    private com.taobao.android.detail.core.standard.video.d b;
    private TransAnimLayout c;
    private Drawable d;
    private Rect e;
    private elq f;
    private View g;
    private c h;
    private a i;
    private AbsPicGalleryVideoPlayer j;
    private TouchImageView k;
    private boolean l;
    private boolean m;
    private boolean n;
    private String o;
    private Context q;
    private Handler p = new Handler(Looper.getMainLooper());
    private boolean r = false;
    private View.OnKeyListener s = new View.OnKeyListener() { // from class: com.taobao.android.detail.core.standard.lightoff.f.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
            }
            if (i != 4 || keyEvent.getAction() != 1 || f.b(f.this) == null) {
                return false;
            }
            f.b(f.this).runExitAnim(f.d(f.this));
            return true;
        }
    };
    private TransAnimLayout.a t = new TransAnimLayout.a() { // from class: com.taobao.android.detail.core.standard.lightoff.f.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
        public void a(FrameLayout.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b016271", new Object[]{this, layoutParams});
                return;
            }
            f.a(f.this, true);
            i.d("LightOffTransController", "enterAnimEnd");
            f.e(f.this);
            f.f(f.this);
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (f.g(f.this)) {
            } else {
                f.b(f.this).showTransImage(f.h(f.this));
                f.c(f.this).getView().setVisibility(4);
                f.b(f.this, true);
                f.c(f.this, false);
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            AbsPicGalleryVideoPlayer g = f.i(f.this).g();
            if (g != null) {
                Object tag = g.o().getTag(R.id.standard_detail_gallery_weex_video);
                if (tag instanceof PicGalleryLightOffVideoComponent) {
                    ((PicGalleryLightOffVideoComponent) tag).detach();
                }
            }
            if (f.j(f.this) == null || !f.j(f.this).isAdded() || f.j(f.this).getFragmentManager() == null || f.j(f.this).getFragmentManager().isDestroyed()) {
                return;
            }
            f.j(f.this).dismissAllowingStateLoss();
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            } else {
                f.d(f.this).setAlpha(1.0f - f);
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            f.c(f.this, true);
            Drawable h = f.h(f.this);
            f.c(f.this).getView().setVisibility(4);
            f.b(f.this).showTransImage(h);
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            AbsPicGalleryVideoPlayer g = f.i(f.this).g();
            if (g != null && g.p() != AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING && AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING.equals(f.k(f.this))) {
                g.a();
            }
            i.d("LightOffTransController", "resetPull realView visible hideTransView");
            f.c(f.this).getView().setVisibility(0);
            f.b(f.this).hideTransView();
            f.d(f.this).setAlpha(1.0f);
            f.c(f.this, false);
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.a
        public boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : f.b(f.this).isTransViewHiden() && (f.l(f.this) == null || !f.l(f.this).isScaled());
        }
    };
    private b u = new AnonymousClass3();
    private View.OnLayoutChangeListener v = new View.OnLayoutChangeListener() { // from class: com.taobao.android.detail.core.standard.lightoff.f.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (!eir.c(f.n(f.this)) || f.l(f.this) != null) {
            } else {
                f fVar = f.this;
                f.a(fVar, f.o(fVar));
                if (f.l(f.this) == null) {
                    return;
                }
                f.e(f.this);
                Log.e("LightOffTransController", "onLayoutChange mCurrentTouchImageView:" + f.l(f.this));
            }
        }
    };

    static {
        kge.a(-1690652166);
    }

    public static /* synthetic */ TouchImageView a(f fVar, TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TouchImageView) ipChange.ipc$dispatch("3f45acea", new Object[]{fVar, touchImageView});
        }
        fVar.k = touchImageView;
        return touchImageView;
    }

    public static /* synthetic */ AbsPicGalleryVideoPlayer a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsPicGalleryVideoPlayer) ipChange.ipc$dispatch("c62f3188", new Object[]{fVar}) : fVar.j;
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30f438fe", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.l = z;
        return z;
    }

    public static /* synthetic */ TransAnimLayout b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransAnimLayout) ipChange.ipc$dispatch("c083fe41", new Object[]{fVar}) : fVar.c;
    }

    public static /* synthetic */ boolean b(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bde1501d", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.m = z;
        return z;
    }

    public static /* synthetic */ c c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("f0d953cf", new Object[]{fVar}) : fVar.h;
    }

    public static /* synthetic */ boolean c(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ace673c", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.n = z;
        return z;
    }

    public static /* synthetic */ View d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("40f9e31f", new Object[]{fVar}) : fVar.g;
    }

    public static /* synthetic */ boolean d(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7bb7e5b", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.r = z;
        return z;
    }

    public static /* synthetic */ void e(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8760411e", new Object[]{fVar});
        } else {
            fVar.e();
        }
    }

    public static /* synthetic */ void f(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf44a1f", new Object[]{fVar});
        } else {
            fVar.c();
        }
    }

    public static /* synthetic */ boolean g(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2885324", new Object[]{fVar})).booleanValue() : fVar.m;
    }

    public static /* synthetic */ Drawable h(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("7cba91f9", new Object[]{fVar}) : fVar.f();
    }

    public static /* synthetic */ com.taobao.android.detail.core.standard.video.d i(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.standard.video.d) ipChange.ipc$dispatch("552885b0", new Object[]{fVar}) : fVar.b;
    }

    public static /* synthetic */ DialogFragment j(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogFragment) ipChange.ipc$dispatch("c43fa39d", new Object[]{fVar}) : fVar.f9840a;
    }

    public static /* synthetic */ String k(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("200229fc", new Object[]{fVar}) : fVar.o;
    }

    public static /* synthetic */ TouchImageView l(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TouchImageView) ipChange.ipc$dispatch("7d37243f", new Object[]{fVar}) : fVar.k;
    }

    public static /* synthetic */ elq m(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (elq) ipChange.ipc$dispatch("4bf7e336", new Object[]{fVar}) : fVar.f;
    }

    public static /* synthetic */ Context n(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ece6ac1f", new Object[]{fVar}) : fVar.q;
    }

    public static /* synthetic */ TouchImageView o(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TouchImageView) ipChange.ipc$dispatch("4c7fff82", new Object[]{fVar}) : fVar.g();
    }

    public static /* synthetic */ Handler p(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("94d7dffd", new Object[]{fVar}) : fVar.p;
    }

    public static /* synthetic */ void q(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a50ad2a", new Object[]{fVar});
        } else {
            fVar.d();
        }
    }

    public static /* synthetic */ boolean r(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6fe4b62f", new Object[]{fVar})).booleanValue() : fVar.n;
    }

    public f(DialogFragment dialogFragment) {
        this.f9840a = dialogFragment;
        emu.a("com.taobao.android.detail.core.standard.lightoff.PicGalleryLightOffTransController");
    }

    /* loaded from: classes4.dex */
    public class a implements AbsPicGalleryVideoPlayer.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(362467589);
            kge.a(-764126303);
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85bc85f", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Float(f)});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8fd815", new Object[]{this, absPicGalleryVideoPlayer, mVar, str, str2});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9a88720", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            }
        }

        private a() {
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            } else if (!absPicGalleryVideoPlayer.equals(f.a(f.this)) || f.b(f.this) == null || f.c(f.this).getView() == null) {
            } else {
                i.d("LightOffTransController", "onPlay hideTransView");
                f.c(f.this).getView().setVisibility(0);
                f.b(f.this).hideTransView();
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void c(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acda7ebf", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            } else if (f.b(f.this) == null) {
            } else {
                epj.b().a(emd.a(mVar.c()), f.b(f.this).getContext(), -1, new c.a() { // from class: com.taobao.android.detail.core.standard.lightoff.f.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
                    public void a(Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        } else if (f.b(f.this) == null) {
                        } else {
                            f.b(f.this).updataTransImage(drawable);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.taobao.android.detail.core.standard.lightoff.f$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3() {
        }

        @Override // com.taobao.android.detail.core.standard.lightoff.b
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (jSONObject == null || f.m(f.this) == null) {
            } else {
                f.p(f.this).post(new Runnable() { // from class: com.taobao.android.detail.core.standard.lightoff.f.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (f.m(f.this) == null || f.n(f.this) == null) {
                        } else {
                            String k = f.m(f.this).k();
                            if (StringUtils.isEmpty(k)) {
                                return;
                            }
                            if (eir.c(f.n(f.this))) {
                                if (f.l(f.this) != null) {
                                    f.l(f.this).resetScale();
                                }
                                f.a(f.this, f.o(f.this));
                                i.d("LightOffTransController", "onLocatorTo:" + f.l(f.this));
                            }
                            if (f.b(f.this) == null) {
                                return;
                            }
                            epj.b().a(emd.a(k), f.b(f.this).getContext(), -1, new c.a() { // from class: com.taobao.android.detail.core.standard.lightoff.f.3.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
                                public void a(Drawable drawable) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                                    } else {
                                        f.b(f.this).updataTransImage(drawable);
                                    }
                                }
                            });
                        }
                    }
                });
            }
        }

        @Override // com.taobao.android.detail.core.standard.lightoff.b
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            i.d("LightOffTransController", "onWeexRenderOver:" + z);
            f.q(f.this);
            f.d(f.this, z ^ true);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TransAnimLayout transAnimLayout = this.c;
        if (transAnimLayout == null && !transAnimLayout.isTransViewHiden()) {
            return;
        }
        this.p.postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.standard.lightoff.f.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (f.b(f.this) == null || f.c(f.this).getView() == null || f.r(f.this)) {
                } else {
                    i.d("LightOffTransController", "checkHideTransImg realView visible");
                    f.c(f.this).getView().setVisibility(0);
                    f.b(f.this).hideTransView();
                }
            }
        }, 1500L);
    }

    private void d() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f == null || (context = this.q) == null) {
        } else {
            if (eir.a(context) && this.d != null) {
                eps.a(this.q, "Page_Detail", 19999, "Page_Detail_lightoff_with_trans", "", null, new String[0]);
            } else {
                eps.a(this.q, "Page_Detail", 19999, "Page_Detail_lightoff_no_trans", "", null, new String[0]);
            }
        }
    }

    public void a(elq elqVar, c cVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f733baa2", new Object[]{this, elqVar, cVar, map});
            return;
        }
        this.f = elqVar;
        if (this.f.b() != null) {
            this.q = this.f.b().getContext();
        }
        this.h = cVar;
        this.h.getView().addOnLayoutChangeListener(this.v);
        this.h.setTransHelpCallback(this.u);
        if (!eir.a(this.q) || map == null) {
            return;
        }
        Object obj = map.get(b.TRANS_IMGE_KEY);
        Object obj2 = map.get(b.TRANS_FROME_RECT_KEY);
        if (!(obj instanceof Drawable) || !(obj2 instanceof Rect)) {
            return;
        }
        this.d = (Drawable) obj;
        this.e = (Rect) obj2;
        if (cVar.getView() != null) {
            cVar.getView().setVisibility(0);
        }
        this.b = this.f.h();
    }

    public View a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bf78576a", new Object[]{this, view, view2});
        }
        if (!eir.a(this.q) || this.d == null || this.e == null || this.h.getView() == null) {
            return null;
        }
        this.g = view2;
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(this.s);
        this.j = this.b.g();
        if (this.j != null) {
            this.i = new a();
            this.b.a(this.i);
        }
        this.m = false;
        this.n = false;
        this.c = new TransAnimLayout(this.f9840a.getActivity());
        this.h.getView().setVisibility(4);
        this.c.init(this.e, this.d, true);
        this.c.setTransListener(this.t);
        this.c.addPullInnerView(this.h.getView());
        this.c.runEnterAnim(this.g);
        return this.c;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        TransAnimLayout transAnimLayout = this.c;
        if (transAnimLayout == null) {
            return false;
        }
        transAnimLayout.runExitAnim(this.g);
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TouchImageView touchImageView = this.k;
        if (touchImageView != null) {
            touchImageView.resetScale();
        }
        TransAnimLayout transAnimLayout = this.c;
        if (transAnimLayout != null) {
            transAnimLayout.removeAllViews();
        }
        com.taobao.android.detail.core.standard.video.d dVar = this.b;
        if (dVar != null) {
            dVar.b(this.i);
        }
        c cVar = this.h;
        if (cVar == null) {
            return;
        }
        cVar.setTransHelpCallback(null);
        this.h.getView().removeOnLayoutChangeListener(this.v);
    }

    private void e() {
        TouchImageView touchImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.r && this.c != null && this.l) {
            i.d("LightOffTransController", "swithTransView mHasWeexRenderFailed hideTransView");
            this.h.getView().setVisibility(0);
            this.c.hideTransView();
        }
        if (this.c == null || !this.l || this.j != null) {
            return;
        }
        if (eir.c(this.q) && ((touchImageView = this.k) == null || touchImageView.getDrawable() == null)) {
            return;
        }
        this.p.postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.standard.lightoff.f.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                i.d("LightOffTransController", "swithTransView realView visible");
                if (f.b(f.this) == null || f.c(f.this).getView() == null || f.r(f.this)) {
                    return;
                }
                f.c(f.this).getView().setVisibility(0);
                if (eir.c(f.n(f.this))) {
                    f fVar = f.this;
                    f.a(fVar, f.o(fVar));
                    i.d("LightOffTransController", "swithTransView getImage:" + f.l(f.this));
                }
                f.b(f.this).hideTransView();
            }
        }, 300L);
    }

    private Drawable f() {
        elq elqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("d20ed8ad", new Object[]{this});
        }
        AbsPicGalleryVideoPlayer g = this.b.g();
        if (g == null || (elqVar = this.f) == null || elqVar.h() == null) {
            return null;
        }
        this.o = g.p();
        if ("init".equals(g.p())) {
            return null;
        }
        if (AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING.equals(g.p())) {
            g.b();
        }
        return this.f.h().a(this.b.b((ViewGroup) g.o()));
    }

    private TouchImageView g() {
        TouchImageView touchImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TouchImageView) ipChange.ipc$dispatch("4a6a8e48", new Object[]{this});
        }
        String k = this.f.k();
        if (StringUtils.isEmpty(k) || (touchImageView = PicGalleryLightOffPicComponent.getTouchImageView(k)) == null) {
            return null;
        }
        touchImageView.setOnSinglePointLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.core.standard.lightoff.f.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                f.c(f.this).onLongClick();
                return false;
            }
        });
        return touchImageView;
    }
}
