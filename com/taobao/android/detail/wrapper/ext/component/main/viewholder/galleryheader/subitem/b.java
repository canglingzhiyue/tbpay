package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.DetailEvent;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaRelativeLayout;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bd;
import com.taobao.avplayer.bh;
import com.taobao.avplayer.common.n;
import com.taobao.avplayer.common.x;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.dzh;
import tb.ecu;
import tb.ecv;
import tb.emu;
import tb.eno;
import tb.epj;
import tb.epl;
import tb.fac;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b, j, av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f11225a;
    private DWInstance b;
    private boolean c;
    private boolean d;
    private GalleryVideoModel e;
    private MultiMediaRelativeLayout f;
    private ImageView g;
    private View h;
    private MultiMediaViewModel.a i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private x n;
    private boolean o;
    private DetailImageView p;
    private DetailImageView q;
    private ArrayList<Boolean> r;
    private Map<GalleryVideoModel, DWInstance> s;
    private boolean t;

    static {
        kge.a(-480418336);
        kge.a(-1917972144);
        kge.a(688755897);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    public static /* synthetic */ DWInstance a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInstance) ipChange.ipc$dispatch("8adee125", new Object[]{bVar}) : bVar.k();
    }

    public static /* synthetic */ void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef436ac2", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.a(z);
        }
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66fc5f1", new Object[]{bVar});
        } else {
            bVar.f();
        }
    }

    public static /* synthetic */ void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ff990", new Object[]{bVar});
        } else {
            bVar.h();
        }
    }

    public static /* synthetic */ DetailImageView d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("ee90f408", new Object[]{bVar}) : bVar.p;
    }

    public b(Context context, boolean z) {
        this(context);
        this.t = z;
    }

    public b(Context context) {
        this.m = true;
        this.o = false;
        this.p = null;
        this.q = null;
        this.s = new HashMap();
        this.f11225a = context;
        com.taobao.android.trade.event.d a2 = f.a(context);
        if (a2 != null) {
            a2.a(eno.a(com.taobao.android.detail.wrapper.ext.event.c.class), this);
            a2.a(eno.a(com.taobao.android.detail.wrapper.ext.event.d.class), this);
            a2.a(eno.a(com.taobao.android.detail.wrapper.ext.event.b.class), this);
            a2.a(eno.a(com.taobao.android.detail.wrapper.ext.event.a.class), this);
        }
        this.r = new ArrayList<>();
        this.r.add(true);
        this.r.add(true);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.GalleryVideoViewModel");
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a getViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a) ipChange.ipc$dispatch("852695bd", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new MultiMediaRelativeLayout(this.f11225a);
        }
        this.f.setSupposedWidth(this.i.c());
        this.f.setLayoutParams(new ViewGroup.LayoutParams(this.i.c(), -1));
        com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar = new com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a(this.f) { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b.1
        };
        aVar.a(this);
        return aVar;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (k() != null) {
        } else {
            DetailImageView detailImageView = this.p;
            if (detailImageView != null) {
                this.f.removeView(detailImageView);
            }
            DetailImageView detailImageView2 = this.q;
            if (detailImageView2 != null) {
                this.f.removeView(detailImageView2);
            }
            DWInstance.a a2 = fac.f27709a.a((Activity) this.f11225a);
            a2.e("DETAILMAIN");
            a2.c("TBVideo");
            a2.b(this.e.getVideoId());
            a2.f(true);
            a2.q(true);
            a2.g(false);
            a2.a(this.e.getVideoUrl());
            a2.c(this.i.c());
            a2.d(this.i.e(this.e));
            a2.N(true);
            a2.H(false);
            a2.r(this.e.isHiddenPlayingIcon());
            if (ecu.e) {
                a2.P(true);
                a2.a(this.r);
                a2.g(true);
                a2.F(true);
                a2.p(false);
                a2.E(false);
                a2.G(false);
                a2.I(true);
                a2.L(false);
                a2.J(true);
                a2.K(false);
            }
            if (!StringUtils.isEmpty(this.e.parentModel.sellerId) && StringUtils.isDigitsOnly(this.e.parentModel.sellerId)) {
                a2.b(Long.parseLong(this.e.parentModel.sellerId));
            }
            if (!StringUtils.isEmpty(this.e.getCoverUrl())) {
                a2.i(true);
                com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
                aVar.a(new DWFrontCoverBean(0L, null, this.e.getCoverUrl()));
                a2.a(aVar);
            }
            if (this.t) {
                DWInstance b = a2.b();
                b.setNeedGesture(false);
                b.setToastTopMargin(ecv.a(25.0f));
                b.setVideoLifecycleListener(this);
                b.setShowCustomIconOrNotList(this.r);
                b.setNormalControllerListener(this.n);
                b.hideCloseView();
                b.hideController();
                b.hideMiniProgressBar();
                b.addWhiteWeexCmpList(e());
                b.addWeexAddViewCallback(new bd() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.avplayer.bd
                    public boolean a(View view, String str, String str2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("2ced2b82", new Object[]{this, view, str, str2})).booleanValue() : "timeBox".equals(str) && "NORMAL".equals(str2);
                    }
                });
                b.setHookStartListener(new n() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.avplayer.common.n
                    public boolean a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                        }
                        if (b.a(b.this) != null) {
                            b.a(b.this).mute(false);
                        }
                        b.b(b.this);
                        return false;
                    }
                });
                b.addWXCmpUtilsCallback(new bh() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b.4
                });
                this.s.put(this.e, b);
                return;
            }
            this.b = a2.b();
            this.b.setNeedGesture(false);
            this.b.setToastTopMargin(ecv.a(25.0f));
            this.b.setVideoLifecycleListener(this);
            this.b.setShowCustomIconOrNotList(this.r);
            this.b.setNormalControllerListener(this.n);
            this.b.hideCloseView();
            this.b.hideController();
            this.b.hideMiniProgressBar();
            this.b.addWhiteWeexCmpList(e());
            this.b.addWeexAddViewCallback(new bd() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.bd
                public boolean a(View view, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("2ced2b82", new Object[]{this, view, str, str2})).booleanValue() : "timeBox".equals(str) && "NORMAL".equals(str2);
                }
            });
            this.b.setHookStartListener(new n() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.n
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                    }
                    if (b.a(b.this) != null) {
                        b.a(b.this).mute(false);
                    }
                    b.b(b.this);
                    return false;
                }
            });
            this.b.addWXCmpUtilsCallback(new bh() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b.7
            });
        }
    }

    private ArrayList<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("bbce4046", new Object[]{this});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("timeBox");
        arrayList.add("detailLabel");
        arrayList.add("detailAnchor");
        return arrayList;
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        int eventId = event.getEventId();
        if (eventId == eno.a(com.taobao.android.detail.wrapper.ext.event.c.class)) {
            if (k() != null) {
                this.j = k().getVideoState();
                k().pauseVideo();
                this.k = true;
            }
            this.h.requestLayout();
            return i.SUCCESS;
        } else if (eventId == eno.a(com.taobao.android.detail.wrapper.ext.event.d.class)) {
            if (k() != null && this.k && this.j == 1) {
                k().playVideo();
                this.k = false;
            }
            this.h.requestLayout();
            return i.SUCCESS;
        } else if (eventId == eno.a(com.taobao.android.detail.wrapper.ext.event.b.class)) {
            if (k() != null) {
                k().playVideo();
                return com.taobao.android.detail.core.event.a.SUCCESS;
            }
            return com.taobao.android.detail.core.event.a.FAILURE;
        } else if (eventId != eno.a(com.taobao.android.detail.wrapper.ext.event.a.class)) {
            return null;
        } else {
            if (k() != null) {
                k().pauseVideo();
                return com.taobao.android.detail.core.event.a.SUCCESS;
            }
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            dzh.q(this.f11225a);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void reRenderViewHolder(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48afe97e", new Object[]{this, aVar});
            return;
        }
        this.f = (MultiMediaRelativeLayout) aVar.a();
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!ecu.f27202a && k() == null) {
            g();
        } else {
            a(false);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.e == null) {
        } else {
            this.p = new DetailImageView(this.f11225a);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(15, -1);
            try {
                this.p.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                        }
                        try {
                            b.c(b.this);
                            b.d(b.this).getViewTreeObserver().removeOnPreDrawListener(this);
                        } catch (Throwable unused) {
                        }
                        return true;
                    }
                });
            } catch (Throwable unused) {
                h();
            }
            this.f.addView(this.p, layoutParams);
            this.q = new DetailImageView(this.f11225a);
            int a2 = ecv.a(69.0f);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams2.addRule(13, -1);
            this.q.setImageBitmap(BitmapFactory.decodeResource(this.f11225a.getResources(), R.drawable.detail_tbavsdk_video_play));
            this.f.addView(this.q, layoutParams2);
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        b.a(b.this, true);
                    }
                }
            });
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        GalleryVideoModel galleryVideoModel = this.e;
        if (galleryVideoModel == null || StringUtils.isEmpty(galleryVideoModel.getCoverUrl())) {
            return;
        }
        epj.b().a(this.e.getCoverUrl(), this.p, new epl.a().a(R.drawable.detail_img_load_fail).a(), (com.taobao.android.detail.datasdk.protocol.image.b) null);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        j();
        d();
        i();
        if (this.g == null) {
            this.g = new ImageView(this.f11225a);
        }
        if (this.g.getParent() != null) {
            ((ViewGroup) this.g.getParent()).removeView(this.g);
        }
        if (k() == null) {
            return;
        }
        k().addFullScreenCustomView(this.g);
        if (!z) {
            return;
        }
        k().start();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (k() == null) {
        } else {
            this.h = k().getView();
            this.h.setTag(k());
            a(this.h);
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            b(view);
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (k() == null) {
        } else {
            a(this.f, view);
            if (k().getVideoState() == 1) {
                k().hideController();
            } else {
                k().showController();
            }
            k().setLikeBtnShown(true);
            k().setShowCustomIconOrNotList(this.r);
            k().showOrHideInteractive(true);
            k().orientationDisable();
            k().hideMiniProgressBar();
            k().setVideoLifecycleListener(this);
            k().setFrame(this.i.c(), this.i.e(this.e));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.i.c(), this.i.e(this.e));
            layoutParams.addRule(13);
            layoutParams.addRule(15);
            layoutParams.addRule(14);
            layoutParams.addRule(3);
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }

    private void a(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39d30cb", new Object[]{this, viewGroup, view});
            return;
        }
        try {
            if (view.getParent() != null) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2.getAnimation() != null) {
                    viewGroup2.getAnimation().cancel();
                }
                viewGroup2.setLayoutTransition(null);
                viewGroup2.removeView(view);
            }
            viewGroup.addView(view);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onAppeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8a3efa", new Object[]{this});
        } else if (k() == null) {
        } else {
            if (this.l) {
                int i = this.j;
                if (i == 1 || i == 5 || i == 8) {
                    k().playVideo();
                }
                this.l = false;
            } else if (NetworkUtils.ConnectType.CONNECT_TYPE_WIFI == NetworkUtils.c(this.f11225a) && ecu.f27202a) {
                if (k().getVideoState() == 0) {
                    k().mute(true);
                }
                k().start();
            } else if (k().getVideoState() != 2) {
            } else {
                k().playVideo();
            }
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDisappeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b8232a", new Object[]{this});
        } else if (k() == null) {
        } else {
            this.j = k().getVideoState();
            this.l = true;
            if (1 != this.j) {
                return;
            }
            k().pauseVideo();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        com.taobao.android.trade.event.d a2 = f.a(this.f11225a);
        if (a2 != null) {
            a2.b(eno.a(com.taobao.android.detail.core.event.basic.n.class), this);
            a2.b(eno.a(DetailEvent.class), this);
            a2.b(eno.a(com.taobao.android.detail.wrapper.ext.event.c.class), this);
            a2.b(eno.a(com.taobao.android.detail.wrapper.ext.event.d.class), this);
            a2.b(eno.a(com.taobao.android.detail.wrapper.ext.event.b.class), this);
            a2.b(eno.a(com.taobao.android.detail.wrapper.ext.event.a.class), this);
        }
        if (k() == null) {
            return;
        }
        k().setVideoLifecycleListener(null);
        k().orientationDisable();
        k().destroy();
        if (!this.t) {
            return;
        }
        this.s.remove(this.e);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onPause(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (k() == null) {
        } else {
            k().orientationDisable();
            k().pauseVideo();
            this.d = true;
            this.c = k().isMute();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        if (!this.m) {
            if (k() != null) {
                k().mute(this.c);
            }
            this.d = false;
        }
        this.m = false;
        a(this.h);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void bindModel(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347cdd", new Object[]{this, subItemModel});
        } else if (!(subItemModel instanceof GalleryVideoModel)) {
        } else {
            this.e = (GalleryVideoModel) subItemModel;
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void setParentModelUtils(MultiMediaViewModel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8356acef", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        long a2 = com.taobao.android.detail.core.detail.kit.utils.c.a();
        String d = NetworkUtils.d(this.f11225a);
        if (i >= 17 && a2 >= 1000000 && !d.equals("2g") && !StringUtils.isEmpty(this.e.getVideoUrl()) && !StringUtils.isEmpty(this.e.getCoverUrl())) {
            return;
        }
        this.i.a(this.e);
    }

    public static boolean a(Context context, SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a50c014", new Object[]{context, subItemModel})).booleanValue();
        }
        if (ecu.c || !(subItemModel instanceof GalleryVideoModel)) {
            return false;
        }
        GalleryVideoModel galleryVideoModel = (GalleryVideoModel) subItemModel;
        if (!StringUtils.isEmpty(galleryVideoModel.getVideoUrl()) && !StringUtils.isEmpty(galleryVideoModel.getCoverUrl())) {
            int i = Build.VERSION.SDK_INT;
            long a2 = com.taobao.android.detail.core.detail.kit.utils.c.a();
            String d = NetworkUtils.d(context);
            if (i >= 17 && a2 >= 1000000 && !d.equals("2g")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        } else if (!z || k() == null) {
        } else {
            this.c = k().isMute();
            this.d = true;
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else if (k() == null) {
        } else {
            if (this.d) {
                k().mute(this.c);
            } else {
                k().mute(false);
            }
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        if (k() != null) {
            k().setDWLifecycleType(DWLifecycleType.BEFORE);
        }
        if (k() != null && k().isFullScreen()) {
            k().toggleScreen();
        }
        if (k() == null) {
            return;
        }
        k().orientationDisable();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        } else if (k() == null) {
        } else {
            k().showOrHideInteractive(false);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        } else if (k() == null) {
        } else {
            k().showOrHideInteractive(false);
        }
    }

    public DWInstance b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInstance) ipChange.ipc$dispatch("d36b7cae", new Object[]{this}) : k();
    }

    public void a(x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410cfe7d", new Object[]{this, xVar});
        } else {
            this.n = xVar;
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (k() == null) {
            return 0;
        }
        return k().getNormalControllerHeight();
    }

    private DWInstance k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInstance) ipChange.ipc$dispatch("e9a47805", new Object[]{this});
        }
        if (this.t) {
            return this.s.get(this.e);
        }
        return this.b;
    }
}
