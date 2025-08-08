package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.base.BaseActivity;
import com.taobao.android.detail.core.event.DetailEvent;
import com.taobao.android.detail.core.event.basic.n;
import com.taobao.android.detail.core.event.params.CollectionParams;
import com.taobao.android.detail.core.event.video.DetailVideoSource;
import com.taobao.android.detail.core.event.video.e;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.detail.datasdk.event.video.GallerySourceType;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaRelativeLayout;
import com.taobao.android.task.Coordinator;
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
import com.taobao.avplayer.common.x;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.dzh;
import tb.ecg;
import tb.ecu;
import tb.ecv;
import tb.emu;
import tb.eno;
import tb.epj;
import tb.epl;
import tb.epo;
import tb.epv;
import tb.eqb;
import tb.fac;
import tb.fbx;
import tb.fct;
import tb.fcu;
import tb.fcx;
import tb.fcy;
import tb.kge;

/* loaded from: classes5.dex */
public class d implements com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b, j, av {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ENABLE_ORIENTATION = "enable_orientation";
    public static final String K_SOURCE_TYPE = "sourcetype";
    public static final String V_POP_VIDEO_ARG1 = "Page_Detail_Show_PlayPage";
    public static final String V_POP_VIDEO_SPM = "a2141.7631564.5634305";
    public static final String V_SOURCE_TYPE = "Mainpic";

    /* renamed from: a  reason: collision with root package name */
    private static final int f11244a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private boolean D;
    private boolean E;
    private x G;
    private b H;
    private CollectionParams L;
    private ArrayList<Boolean> P;
    private boolean Q;
    private Context h;
    private DWInstance i;
    private boolean j;
    private boolean k;
    private VideoModel l;
    private MultiMediaRelativeLayout m;
    private ImageView n;
    private ImageView o;
    private View p;
    private MultiMediaViewModel.a q;
    private FrameLayout r;
    private HashMap<String, String> s;
    private HashMap<String, String> t;
    private HashMap<String, String> u;
    private LinearLayout v;
    private LinearLayout w;
    private int x;
    private boolean y;
    private boolean z;
    private boolean A = false;
    private boolean B = false;
    private boolean C = true;
    private float F = 1.0f;
    private int I = -1;
    private boolean J = false;
    private fbx.a K = null;
    private View M = null;
    private DetailImageView N = null;
    private DetailImageView O = null;

    /* loaded from: classes5.dex */
    public interface b {
        void enterBlacklightEvent();

        boolean onClicked();

        void onVerticalScroll(int i, int i2);

        void onVideoProgressChanged(int i, int i2, int i3);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
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
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    public static /* synthetic */ Context a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2ec0aa08", new Object[]{dVar}) : dVar.h;
    }

    public static /* synthetic */ FrameLayout a(d dVar, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("820a9e66", new Object[]{dVar, frameLayout});
        }
        dVar.r = frameLayout;
        return frameLayout;
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef5f99c8", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.B = z;
        return z;
    }

    public static /* synthetic */ FrameLayout b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("c0eea4ca", new Object[]{dVar}) : dVar.r;
    }

    public static /* synthetic */ void b(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a5da05", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.a(z);
        }
    }

    public static /* synthetic */ MultiMediaRelativeLayout c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiMediaRelativeLayout) ipChange.ipc$dispatch("3df30d8d", new Object[]{dVar}) : dVar.m;
    }

    public static /* synthetic */ void c(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fec1a46", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.b(z);
        }
    }

    public static /* synthetic */ DWInstance d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInstance) ipChange.ipc$dispatch("9963aa2a", new Object[]{dVar}) : dVar.i;
    }

    public static /* synthetic */ void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b1498c", new Object[]{dVar});
        } else {
            dVar.j();
        }
    }

    public static /* synthetic */ VideoModel f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoModel) ipChange.ipc$dispatch("925b3471", new Object[]{dVar}) : dVar.l;
    }

    public static /* synthetic */ b g(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c7473db4", new Object[]{dVar}) : dVar.H;
    }

    public static /* synthetic */ void h(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f1e469", new Object[]{dVar});
        } else {
            dVar.l();
        }
    }

    public static /* synthetic */ DetailImageView i(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("b4a6ac4f", new Object[]{dVar}) : dVar.N;
    }

    public static /* synthetic */ void j(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34724ba7", new Object[]{dVar});
        } else {
            dVar.q();
        }
    }

    public static /* synthetic */ ImageView k(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("28619b0a", new Object[]{dVar}) : dVar.n;
    }

    public static /* synthetic */ CollectionParams l(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CollectionParams) ipChange.ipc$dispatch("a477442d", new Object[]{dVar}) : dVar.L;
    }

    public static /* synthetic */ fbx.a m(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fbx.a) ipChange.ipc$dispatch("28548be9", new Object[]{dVar}) : dVar.K;
    }

    static {
        kge.a(-176517052);
        kge.a(-1917972144);
        kge.a(688755897);
        kge.a(-1453870097);
        f11244a = ecv.a(125.0f);
        b = ecv.a(30.0f);
        c = ecv.a(33.0f);
        d = ecv.a(77.0f);
        e = ecv.a(18.0f);
        f = ecv.a(15.0f);
        g = ecv.a(24.0f);
    }

    public d(Context context, boolean z) {
        this.h = context;
        this.Q = z;
        com.taobao.android.trade.event.d a2 = f.a(context);
        if (a2 != null) {
            a2.a(eno.a(n.class), this);
            a2.a(eno.a(DetailEvent.class), this);
            a2.a(eno.a(com.taobao.android.detail.wrapper.ext.event.c.class), this);
            a2.a(eno.a(com.taobao.android.detail.wrapper.ext.event.d.class), this);
            a2.a(eno.a(fcy.class), this);
            a2.a(eno.a(com.taobao.android.detail.wrapper.ext.event.b.class), this);
            a2.a(eno.a(com.taobao.android.detail.wrapper.ext.event.a.class), this);
        }
        this.P = new ArrayList<>();
        this.P.add(true);
        this.P.add(true);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.VideoViewModel");
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a getViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a) ipChange.ipc$dispatch("852695bd", new Object[]{this});
        }
        if (this.m == null) {
            this.m = new MultiMediaRelativeLayout(this.h);
            this.n = new ImageView(this.h);
            this.n.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.taobao.android.detail.core.detail.kit.utils.b.a(this.h, 108.0f), com.taobao.android.detail.core.detail.kit.utils.b.a(this.h, 62.0f));
            layoutParams.addRule(13);
            this.n.setLayoutParams(layoutParams);
            this.n.setVisibility(8);
        }
        this.m.setSupposedWidth(this.q.c());
        this.m.setLayoutParams(new ViewGroup.LayoutParams(this.q.c(), -1));
        com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar = new com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a(this.m) { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.1
        };
        aVar.a(this);
        return aVar;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.s == null) {
            this.s = new HashMap<>();
        }
        if (this.i != null) {
            return;
        }
        DetailImageView detailImageView = this.N;
        if (detailImageView != null) {
            this.m.removeView(detailImageView);
        }
        DetailImageView detailImageView2 = this.O;
        if (detailImageView2 != null) {
            this.m.removeView(detailImageView2);
        }
        DWInstance.a a2 = fac.f27709a.a((Activity) this.h);
        a2.e("DETAILMAIN");
        a2.c("TBVideo");
        a2.b(this.l.videoId);
        a2.f(true);
        a2.q(true);
        a2.g(false);
        a2.a(this.l.videoUrl);
        a2.c(this.q.c());
        a2.d(this.q.e(this.l));
        a2.N(true);
        a2.H(false);
        try {
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(this.l.itemId)) {
                hashMap.put("itemId", this.l.itemId);
            }
            if (!StringUtils.isEmpty(this.l.parentModel.sellerId) && StringUtils.isDigitsOnly(this.l.parentModel.sellerId)) {
                hashMap.put("sellerId", this.l.parentModel.sellerId);
            }
            a2.a((Map<String, String>) hashMap);
        } catch (Throwable unused) {
        }
        if (ecu.e) {
            a2.P(true);
            a2.a(this.P);
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
        a(this.s);
        a2.a(this.s);
        if (!StringUtils.isEmpty(this.l.parentModel.sellerId) && StringUtils.isDigitsOnly(this.l.parentModel.sellerId)) {
            a2.b(Long.parseLong(this.l.parentModel.sellerId));
        }
        if ((this.l != null) & (!StringUtils.isEmpty(this.l.thumbnailUrl))) {
            a2.i(true);
            com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
            aVar.a(new DWFrontCoverBean(0L, null, this.l.thumbnailUrl));
            a2.a(aVar);
        }
        if (this.Q) {
            a2.r(true);
        }
        this.i = a2.b();
        this.i.setNeedGesture(false);
        this.i.setToastTopMargin(ecv.a(25.0f));
        this.i.setVideoLifecycleListener(this);
        this.i.setShowCustomIconOrNotList(this.P);
        this.i.setRootViewClickListener(new a());
        this.i.setNormalControllerListener(this.G);
        this.i.hideCloseView();
        this.i.hideController();
        this.i.hideMiniProgressBar();
        this.i.addWhiteWeexCmpList(h());
        this.i.addWeexAddViewCallback(new bd() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.bd
            public boolean a(View view, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("2ced2b82", new Object[]{this, view, str, str2})).booleanValue();
                }
                if (!"timeBox".equals(str)) {
                    return false;
                }
                if (!"NORMAL".equals(str2)) {
                    return true;
                }
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                d dVar = d.this;
                d.a(dVar, new FrameLayout(d.a(dVar)));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                d.b(d.this).addView(view);
                view.setLayoutParams(layoutParams);
                if (d.b(d.this).getParent() != null) {
                    ((ViewGroup) d.b(d.this).getParent()).removeView(d.b(d.this));
                }
                d.c(d.this).addView(d.b(d.this));
                d.b(d.this).setTranslationY(ecv.a(36.0f));
                d.b(d.this).setTranslationX(-ecv.a(23.0f));
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(12);
                layoutParams2.addRule(9);
                layoutParams2.addRule(2);
                d.b(d.this).setPadding(epo.k, 0, 0, epo.k);
                d.b(d.this).setLayoutParams(layoutParams2);
                return true;
            }
        });
        this.i.setHookStartListener(new com.taobao.avplayer.common.n() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.n
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                if (d.d(d.this) != null) {
                    d.d(d.this).mute(false);
                }
                d.e(d.this);
                return false;
            }
        });
        this.i.addWXCmpUtilsCallback(new bh() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.8
        });
    }

    private ArrayList<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("485f2749", new Object[]{this});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("timeBox");
        arrayList.add("detailLabel");
        arrayList.add("detailAnchor");
        return arrayList;
    }

    private HashMap<String, String> a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("aefa94ee", new Object[]{this, hashMap});
        }
        Context context = this.h;
        if (context != null && (context instanceof BaseActivity)) {
            try {
                Uri data = ((Activity) context).getIntent().getData();
                String queryParameter = data.getQueryParameter("spm-url");
                String queryParameter2 = data.getQueryParameter("spm");
                String queryParameter3 = data.getQueryParameter("from");
                if (queryParameter == null && !StringUtils.isEmpty(queryParameter2)) {
                    queryParameter = queryParameter2;
                }
                if (queryParameter == null && queryParameter2 == null) {
                    queryParameter = "";
                }
                if (queryParameter3 == null) {
                    queryParameter3 = "";
                }
                hashMap.put("spm-url", queryParameter);
                hashMap.put("spm-cnt", "a2141.7631564");
                hashMap.put("detailfrom", queryParameter3);
                hashMap.put("item_id", this.l.parentModel.itemId);
                hashMap.put("seller_id", this.l.parentModel.sellerId);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return hashMap;
    }

    private void i() {
        VideoModel videoModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.i;
        if (dWInstance == null || dWInstance.getVideoState() == 0 || this.i.getVideoState() == 3 || (videoModel = this.l) == null || videoModel.parentModel == null || StringUtils.equals("false", OrangeConfig.getInstance().getConfig("android_detail", "enable_orientation", "true"))) {
            return;
        }
        if (!this.l.parentModel.isPopupMode) {
            this.i.orientationDisable();
        }
        this.p.requestLayout();
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        fbx.a aVar;
        fbx.a aVar2;
        DWInstance dWInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        int eventId = event.getEventId();
        if (eventId == eno.a(n.class)) {
            if (this.h == null || this.m == null) {
                return i.FAILURE;
            }
            if (ecu.e && (dWInstance = this.i) != null) {
                dWInstance.showOrHideInteractive(true);
                this.j = this.i.isMute();
                this.i.mute(false);
            }
            if (this.l.parentModel.popGallerySource == GallerySourceType.ACTION_BAR) {
                com.taobao.android.detail.core.event.video.c.c(this.h, null);
            }
            this.p.requestLayout();
            return i.SUCCESS;
        } else if ((event instanceof DetailEvent) && ((DetailEvent) event).getEventType() == 2) {
            if (this.i != null) {
                this.z = true;
            }
            this.A = true;
            fbx.a aVar3 = this.K;
            if (aVar3 != null) {
                aVar3.d();
                this.K = null;
            }
            if (this.l.parentModel.popGallerySource == GallerySourceType.ACTION_BAR) {
                com.taobao.android.detail.core.event.video.c.a(this.h, new com.taobao.android.trade.event.c<e>() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.trade.event.c
                    public void onEventException(j jVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                        }
                    }

                    @Override // com.taobao.android.trade.event.c
                    public void a(e eVar, j jVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5d70d478", new Object[]{this, eVar, jVar});
                        } else if (!eVar.f9738a && d.d(d.this) != null) {
                            d.d(d.this).pauseVideo();
                            d.f(d.this).parentModel.popGallerySource = GallerySourceType.UNKNOWN;
                        } else {
                            d.a(d.this, true);
                        }
                    }
                });
            } else if (this.l.parentModel.popGallerySource == GallerySourceType.MIN_VIDEO) {
                this.B = true;
            }
            this.p.requestLayout();
            return i.SUCCESS;
        } else if (eventId == eno.a(com.taobao.android.detail.wrapper.ext.event.c.class)) {
            DWInstance dWInstance2 = this.i;
            if (dWInstance2 != null) {
                this.x = dWInstance2.getVideoState();
                this.z = true;
                this.i.pauseVideo();
            }
            this.p.requestLayout();
            return i.SUCCESS;
        } else if (eventId == eno.a(com.taobao.android.detail.wrapper.ext.event.d.class)) {
            DWInstance dWInstance3 = this.i;
            if (dWInstance3 != null && this.z && this.x == 1) {
                dWInstance3.playVideo();
                this.z = false;
            }
            this.p.requestLayout();
            return i.SUCCESS;
        } else if (eventId == eno.a(fcy.class)) {
            if (event == null) {
                return com.taobao.android.detail.core.event.a.FAILURE;
            }
            a(((fcy) event).f27813a);
            this.p.requestLayout();
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eventId == eno.a(com.taobao.android.detail.wrapper.ext.event.b.class)) {
            if (this.l.parentModel.isPopupMode && NetworkUtils.ConnectType.CONNECT_TYPE_WIFI == NetworkUtils.c(this.h) && (aVar2 = this.K) != null) {
                aVar2.c();
            }
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eventId != eno.a(com.taobao.android.detail.wrapper.ext.event.a.class)) {
            return null;
        } else {
            if (this.l.parentModel.isPopupMode && (aVar = this.K) != null) {
                aVar.b();
            }
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    /* loaded from: classes5.dex */
    public class a implements z {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-736844504);
            kge.a(-1226623529);
        }

        private a() {
        }

        @Override // com.taobao.avplayer.common.z
        public boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            if (d.g(d.this) != null && d.g(d.this).onClicked()) {
                return false;
            }
            if (d.d(d.this) != null && (d.d(d.this).getVideoState() == 0 || d.d(d.this).getVideoState() == 4)) {
                d.d(d.this).start();
                d.e(d.this);
            } else if (d.d(d.this) != null && d.d(d.this).getVideoState() == 1) {
                if (!d.f(d.this).parentModel.isPopupMode && d.g(d.this) != null) {
                    d.g(d.this).enterBlacklightEvent();
                }
            } else if (d.d(d.this) != null && d.d(d.this).getVideoState() == 6) {
                d.d(d.this).start();
            }
            return false;
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        VideoModel videoModel = this.l;
        if (videoModel == null || videoModel.parentModel == null) {
            return;
        }
        if (this.l.parentModel.isPopupMode) {
            dzh.c(this.h, V_SOURCE_TYPE);
        } else {
            dzh.q(this.h);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void reRenderViewHolder(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48afe97e", new Object[]{this, aVar});
            return;
        }
        this.m = (MultiMediaRelativeLayout) aVar.a();
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.utils.i.d(com.taobao.android.detail.core.performance.j.a("VideoViewModel"), "render start");
        if (!ecu.f27202a && !this.l.parentModel.isPopupMode && this.i == null) {
            k();
        } else {
            a(false);
        }
        com.taobao.android.detail.core.utils.i.d(com.taobao.android.detail.core.performance.j.a("VideoViewModel"), "render end");
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        VideoModel videoModel = this.l;
        if (videoModel == null || videoModel.parentModel.isPopupMode) {
            return;
        }
        this.N = new DetailImageView(this.h);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(15, -1);
        try {
            this.N.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                    }
                    try {
                        d.h(d.this);
                        d.i(d.this).getViewTreeObserver().removeOnPreDrawListener(this);
                    } catch (Throwable th) {
                        com.taobao.android.detail.core.utils.i.a("VideoViewModel", "removeOnPreDrawListener", th);
                    }
                    return true;
                }
            });
        } catch (Throwable th) {
            com.taobao.android.detail.core.utils.i.a("VideoViewModel", "addOnPreDrawListener", th);
            l();
        }
        this.m.addView(this.N, layoutParams);
        this.O = new DetailImageView(this.h);
        int a2 = ecv.a(69.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a2, a2);
        layoutParams2.addRule(13, -1);
        this.O.setImageBitmap(BitmapFactory.decodeResource(this.h.getResources(), R.drawable.detail_tbavsdk_video_play));
        this.m.addView(this.O, layoutParams2);
        this.O.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    d.b(d.this, true);
                }
            }
        });
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            epj.b().a(this.l.thumbnailUrl, this.N, new epl.a().a(R.drawable.detail_img_load_fail).a(), (com.taobao.android.detail.datasdk.protocol.image.b) null);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        r();
        g();
        if (!this.E) {
            Coordinator.postTask(new Coordinator.TaggedRunnable("saveFamilyInfo") { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        d.j(d.this);
                    }
                }
            });
        }
        i();
        if (!this.l.parentModel.isPopupMode) {
            m();
            if (this.o == null) {
                this.o = new ImageView(this.h);
            }
            if (this.o.getParent() != null) {
                ((ViewGroup) this.o.getParent()).removeView(this.o);
            }
            try {
                this.i.addFullScreenCustomView(this.o);
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("VideoViewModel", "", th);
            }
            this.o.setOnClickListener(this.q.a(this.l.getIndex(), null));
        } else {
            o();
            try {
                this.i.removeFullScreenCustomView();
            } catch (Throwable th2) {
                com.taobao.android.detail.core.utils.i.a("VideoViewModel", "", th2);
            }
        }
        if (!z) {
            return;
        }
        this.i.start();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.B) {
            this.B = false;
            this.A = false;
        } else {
            this.p = this.i.getView();
            this.p.setTag(this.i);
            VideoModel videoModel = this.l;
            View view = this.p;
            videoModel.videoView = view;
            a(view);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout.getParent() != null) {
            ((ViewGroup) this.r.getParent()).removeView(this.r);
        }
        this.m.addView(this.r);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        layoutParams.addRule(2);
        this.r.setPadding(epo.k, 0, 0, epo.k);
        this.r.setLayoutParams(layoutParams);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.i == null || this.K != null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("videoRatio", this.l.spatialVideoDimension);
            hashMap.put("price", this.l.transmitPrice);
            hashMap.put("title", this.l.title);
            hashMap.put("totalSoldQuantity", StringUtils.isEmpty(this.l.totalSoldQuantity) ? "0" : this.l.totalSoldQuantity);
            hashMap.put("coverUrl", this.l.thumbnailUrl);
            hashMap.put(IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP, this.l.bitmap);
            try {
                this.K = fac.f27709a.b((Activity) this.h);
                this.i.showOrHideInteractive(false);
                this.i.setShowCustomIconOrNotList(this.P);
                this.i.setRootViewClickListener(new a());
                this.i.setVideoLifecycleListener(this);
                this.i.showController();
                this.K.a(new fbx.b() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.13
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.fbx.b
                    public void a(int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                        } else if (d.g(d.this) == null) {
                        } else {
                            d.g(d.this).onVerticalScroll(i, i2);
                        }
                    }

                    @Override // tb.fbx.b
                    public void a(int i, int i2, int i3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                        } else if (d.g(d.this) == null) {
                        } else {
                            d.g(d.this).onVideoProgressChanged(i, i2, i3);
                        }
                    }

                    @Override // tb.fbx.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        eqb.f(d.f(d.this).parentModel.nodeBundle).needVideoFlow = false;
                        dzh.i(d.a(d.this), d.f(d.this).parentModel);
                    }
                });
                this.K.a(this.i, this.l.videoId, this.l.itemId, this.l.parentModel.sellerId, this.l.needVideoFlow, hashMap);
                if (this.K != null) {
                    this.K.a(f());
                    this.p = this.K.a();
                }
                this.l.videoView = this.p;
                a(this.m, this.p);
                this.M = this.p;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.q.c(), -2);
                layoutParams.addRule(13);
                layoutParams.addRule(15);
                this.p.setLayoutParams(layoutParams);
            } catch (Exception e2) {
                com.taobao.android.detail.core.utils.i.a(RPCDataItems.SWITCH_TAG_LOG, e2.toString());
            }
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        b(view);
        n();
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (this.i == null) {
        } else {
            a(this.m, view);
            if (this.i.getVideoState() == 1) {
                this.i.hideController();
            } else {
                this.i.showController();
            }
            if (this.A) {
                if (this.i.getVideoState() == 6) {
                    this.i.start();
                }
                this.i.playVideo();
                this.i.mute(this.j);
            }
            this.A = false;
            this.i.setLikeBtnShown(true);
            this.i.setShowCustomIconOrNotList(this.P);
            this.i.showOrHideInteractive(true);
            this.i.setRootViewClickListener(new a());
            this.i.orientationDisable();
            this.i.hideMiniProgressBar();
            this.i.setVideoLifecycleListener(this);
            this.i.setFrame(this.q.c(), this.q.e(this.l));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.q.c(), this.q.e(this.l));
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
            if (this.M != null) {
                viewGroup.removeView(this.M);
                this.M = null;
            }
            viewGroup.addView(view);
        } catch (Exception unused) {
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.l.parentModel.isPopupMode || this.t != null) {
        } else {
            this.t = new HashMap<>();
            HashMap<String, String> hashMap = this.s;
            if (hashMap != null && hashMap.size() > 0) {
                this.t.putAll(this.s);
            } else {
                this.t.put("item_id", this.l.parentModel.itemId);
                this.t.put("shop_id", this.l.parentModel.shopId);
                this.t.put("seller_id", this.l.parentModel.sellerId);
            }
            this.t.put("spm", "a2141.7631564.1999020712");
            this.t.put("scm", "20140620.1.1.8");
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        VideoModel videoModel = this.l;
        if (videoModel == null || videoModel.parentModel == null || !this.l.parentModel.isPopupMode) {
            return;
        }
        if (this.u == null) {
            this.u = new HashMap<>();
            HashMap<String, String> hashMap = this.s;
            if (hashMap != null && hashMap.size() > 0) {
                this.u.putAll(this.s);
            } else {
                this.u.put("item_id", this.l.parentModel.itemId);
                this.u.put("shop_id", this.l.parentModel.shopId);
                this.u.put("seller_id", this.l.parentModel.sellerId);
            }
            this.u.put("spm", "a2141.7631564.5634305");
            this.u.put("sourcetype", V_SOURCE_TYPE);
        }
        com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.c.a(this.h, "Page_Detail_Show_PlayPage", this.u);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onAppeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8a3efa", new Object[]{this});
        } else if (this.i == null) {
        } else {
            i();
            p();
            q();
            this.E = false;
            com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.c.a(this.h, this.l.parentModel.sellerId, this.l.parentModel.itemId, this.l.parentModel.shopId);
            if (this.y) {
                int i = this.x;
                if (i == 1 || i == 5 || i == 8) {
                    this.i.playVideo();
                }
                this.y = false;
            } else if (NetworkUtils.ConnectType.CONNECT_TYPE_WIFI == NetworkUtils.c(this.h) && ecu.f27202a) {
                if (this.i.getVideoState() == 0) {
                    this.i.mute(true);
                }
                this.i.start();
            } else if (this.i.getVideoState() != 2) {
            } else {
                this.i.playVideo();
            }
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.i;
        if (dWInstance != null && dWInstance.isFullScreen() && this.l.parentModel.isPopupMode) {
            this.i.toggleScreen();
        }
        this.p.requestLayout();
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDisappeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b8232a", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.utils.i.a("fxj", "onDisappeared: ");
        if (this.l.parentModel.isPopupMode) {
            this.E = true;
        }
        DWInstance dWInstance = this.i;
        if (dWInstance == null) {
            return;
        }
        this.x = dWInstance.getVideoState();
        this.y = true;
        if (1 != this.x) {
            return;
        }
        this.i.pauseVideo();
        fbx.a aVar = this.K;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        com.taobao.android.trade.event.d a2 = f.a(this.h);
        if (a2 != null) {
            a2.b(eno.a(n.class), this);
            a2.b(eno.a(DetailEvent.class), this);
            a2.b(eno.a(com.taobao.android.detail.wrapper.ext.event.c.class), this);
            a2.b(eno.a(com.taobao.android.detail.wrapper.ext.event.d.class), this);
            a2.b(eno.a(fcy.class), this);
            a2.b(eno.a(com.taobao.android.detail.wrapper.ext.event.b.class), this);
            a2.b(eno.a(com.taobao.android.detail.wrapper.ext.event.a.class), this);
        }
        DWInstance dWInstance = this.i;
        if (dWInstance != null) {
            dWInstance.setRootViewClickListener(null);
            this.i.setVideoLifecycleListener(null);
            this.i.orientationDisable();
            this.i.destroy();
            this.i = null;
        }
        fbx.a aVar = this.K;
        if (aVar == null) {
            return;
        }
        aVar.d();
        this.K = null;
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onPause(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.i == null || this.l.parentModel.isPopupMode) {
        } else {
            this.i.orientationDisable();
            this.D = true;
            if (z && this.i.isFullScreen()) {
                this.i.toggleScreen();
            }
            int videoState = this.i.getVideoState();
            if (epv.b) {
                this.i.pauseVideo();
            } else if ((z && videoState == 1) || videoState == 5 || videoState == 8) {
                Context context = this.h;
                DWInstance dWInstance = this.i;
                DetailVideoSource detailVideoSource = DetailVideoSource.GALLERY;
                int i = f11244a;
                com.taobao.android.detail.wrapper.ext.video.d.a(context, dWInstance, null, detailVideoSource, i, (int) (i * this.F), 0, 0);
            }
            this.k = true;
            this.j = this.i.isMute();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.l.parentModel.isPopupMode) {
        } else {
            if (!this.C) {
                p();
                q();
                com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.c.a(this.h, this.l.parentModel.sellerId, this.l.parentModel.itemId, this.l.parentModel.shopId);
                DWInstance dWInstance = this.i;
                if (dWInstance != null) {
                    dWInstance.mute(this.j);
                }
                this.k = false;
            }
            this.C = false;
            if (this.i != null && this.D) {
                i();
                this.D = false;
            }
            if (!epv.b) {
                com.taobao.android.detail.core.event.video.c.a(this.h, (com.taobao.android.trade.event.c) null, false);
                DWInstance dWInstance2 = this.i;
                if (dWInstance2 != null) {
                    this.p = dWInstance2.getView();
                    this.p.setTag(this.i);
                    this.l.videoView = this.p;
                }
            }
            a(this.p);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void bindModel(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347cdd", new Object[]{this, subItemModel});
            return;
        }
        this.l = (VideoModel) subItemModel;
        this.p = this.l.videoView;
        if (StringUtils.isEmpty(this.l.spatialVideoDimension)) {
            return;
        }
        String[] split = this.l.spatialVideoDimension.split(":");
        if (split.length != 2 || !StringUtils.isDigitsOnly(split[0]) || !StringUtils.isDigitsOnly(split[1])) {
            return;
        }
        this.F = Float.parseFloat(split[1]) / Float.parseFloat(split[0]);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void setParentModelUtils(MultiMediaViewModel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8356acef", new Object[]{this, aVar});
        } else {
            this.q = aVar;
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        long a2 = com.taobao.android.detail.core.detail.kit.utils.c.a();
        String d2 = NetworkUtils.d(this.h);
        if (i >= 17 && a2 >= 1000000 && !d2.equals("2g") && !StringUtils.isEmpty(this.l.videoUrl) && !StringUtils.isEmpty(this.l.thumbnailUrl)) {
            return;
        }
        this.q.a(this.l);
    }

    public static boolean a(Context context, SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a50c014", new Object[]{context, subItemModel})).booleanValue();
        }
        if (ecu.c) {
            return false;
        }
        VideoModel videoModel = (VideoModel) subItemModel;
        return Build.VERSION.SDK_INT >= 17 && com.taobao.android.detail.core.detail.kit.utils.c.a() >= 1000000 && !NetworkUtils.d(context).equals("2g") && !StringUtils.isEmpty(videoModel.videoUrl) && !StringUtils.isEmpty(videoModel.thumbnailUrl);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        if (this.i != null) {
            i();
        }
        DWInstance dWInstance = this.i;
        if (dWInstance == null || (i = this.I) <= 0) {
            return;
        }
        dWInstance.seekTo(i);
        this.I = -1;
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.l.scrollPlay = true;
            DWInstance dWInstance = this.i;
            if (dWInstance != null) {
                this.j = dWInstance.isMute();
                this.k = true;
            }
        }
        if (!this.l.parentModel.isPopupMode) {
            return;
        }
        dzh.e(this.h, this.l.parentModel);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.i;
        if (dWInstance == null) {
            return;
        }
        if (this.k) {
            dWInstance.mute(this.j);
        } else {
            dWInstance.mute(false);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else {
            ecg.l(this.h, this.l.videoUrl, "", "");
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        if (!this.l.parentModel.isPopupMode) {
            com.taobao.android.detail.core.event.video.c.a(this.h, (com.taobao.android.trade.event.c) null, false);
        }
        DWInstance dWInstance = this.i;
        if (dWInstance != null) {
            dWInstance.setDWLifecycleType(DWLifecycleType.BEFORE);
        }
        DWInstance dWInstance2 = this.i;
        if (dWInstance2 != null && dWInstance2.isFullScreen()) {
            this.i.toggleScreen();
        }
        DWInstance dWInstance3 = this.i;
        if (dWInstance3 == null) {
            return;
        }
        dWInstance3.orientationDisable();
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
            return;
        }
        DWInstance dWInstance = this.i;
        if (dWInstance == null) {
            return;
        }
        dWInstance.showOrHideInteractive(false);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.i;
        if (dWInstance == null) {
            return;
        }
        dWInstance.showOrHideInteractive(false);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        b bVar = this.H;
        if (bVar == null) {
            return;
        }
        bVar.onVideoProgressChanged(i, i2, i3);
    }

    public DWInstance b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInstance) ipChange.ipc$dispatch("d36b7cae", new Object[]{this}) : this.i;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b(R.drawable.detail_video_back);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            b(R.drawable.detail_video_forward);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.n.getParent() != null) {
            ((ViewGroup) this.n.getParent()).removeView(this.n);
        }
        this.m.addView(this.n);
        this.n.setVisibility(0);
        this.n.setImageResource(i);
        ValueAnimator ofInt = ValueAnimator.ofInt(2000);
        ofInt.setDuration(2000L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue <= 500) {
                    d.k(d.this).setAlpha(intValue / 500.0f);
                } else if (intValue < 1500) {
                } else {
                    d.k(d.this).setAlpha((2000 - intValue) / 500.0f);
                }
            }
        });
        ofInt.start();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.I = i;
        }
    }

    public void a(x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410cfe7d", new Object[]{this, xVar});
        } else {
            this.G = xVar;
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        DWInstance dWInstance = this.i;
        if (dWInstance == null) {
            return 0;
        }
        return dWInstance.getNormalControllerHeight();
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.detail.core.event.params.b bVar = new com.taobao.android.detail.core.event.params.b(this.l.parentModel.sellerId, this.l.itemId, z, false);
        if (z) {
            int[] iArr = new int[2];
            this.v.getLocationOnScreen(iArr);
            bVar.e = iArr[0] + (this.v.getWidth() / 2);
            bVar.f = iArr[1];
        }
        f.a(this.h).a(new fcx(bVar));
    }

    public void a(CollectionParams collectionParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcbd484", new Object[]{this, collectionParams});
            return;
        }
        this.L = collectionParams;
        if (this.w == null) {
            f();
        }
        TextView textView = (TextView) this.w.findViewById(R.id.fav_title);
        if (collectionParams == CollectionParams.NORMAL) {
            this.v.setClickable(true);
            ((ImageView) this.w.findViewById(R.id.fav_icon)).setImageDrawable(this.h.getResources().getDrawable(R.drawable.fav));
            textView.setText("收藏");
        } else if (collectionParams == CollectionParams.WAITING) {
            this.v.setClickable(false);
        } else {
            this.v.setClickable(true);
            ((ImageView) this.w.findViewById(R.id.fav_icon)).setImageDrawable(this.h.getResources().getDrawable(R.drawable.detail_cancel_fav));
            textView.setText("已收藏");
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb536392", new Object[]{this, bVar});
        } else {
            this.H = bVar;
        }
    }

    public View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this});
        }
        if (this.w == null) {
            this.w = (LinearLayout) LayoutInflater.from(this.h).inflate(R.layout.x_detail_bottombar_blacklight, (ViewGroup) null);
            this.v = (LinearLayout) this.w.findViewById(R.id.blacklight_bottombar_fav_view);
            LinearLayout linearLayout = (LinearLayout) this.w.findViewById(R.id.blacklight_bottombar_cart_view);
            LinearLayout linearLayout2 = (LinearLayout) this.w.findViewById(R.id.blacklight_bottombar_buy_view);
            TradeNode e2 = eqb.e(this.l.parentModel.nodeBundle);
            boolean z = e2.isBuyEnable;
            boolean z2 = e2.isCartEnable;
            LinearLayout linearLayout3 = this.v;
            if (linearLayout3 != null) {
                linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        boolean z3 = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        if (CollectionParams.NORMAL == d.l(d.this)) {
                            dzh.a(d.a(d.this), d.f(d.this).parentModel);
                        } else {
                            dzh.b(d.a(d.this), d.f(d.this).parentModel);
                        }
                        d dVar = d.this;
                        if (d.l(dVar) != CollectionParams.NORMAL) {
                            z3 = false;
                        }
                        d.c(dVar, z3);
                    }
                });
            }
            if (linearLayout != null) {
                if (z2) {
                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            if (d.d(d.this) != null) {
                                d.d(d.this).pauseVideo();
                                if (d.m(d.this) != null) {
                                    d.m(d.this).b();
                                }
                            }
                            f.a(d.a(d.this), new fct());
                            dzh.c(d.a(d.this), d.f(d.this).parentModel);
                        }
                    });
                } else {
                    linearLayout.setAlpha(0.4f);
                }
            }
            if (linearLayout2 != null) {
                if (z) {
                    linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            f.a(d.a(d.this), new fcu());
                            dzh.d(d.a(d.this), d.f(d.this).parentModel);
                        }
                    });
                } else {
                    linearLayout2.setAlpha(0.4f);
                }
            }
        }
        return this.w;
    }
}
