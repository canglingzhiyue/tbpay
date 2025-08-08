package com.taobao.android.detail.wrapper.ext.video;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.fragment.desc.video.view.PopDialogSource;
import com.taobao.android.detail.core.event.basic.m;
import com.taobao.android.detail.core.event.video.DetailVideoSource;
import com.taobao.android.detail.core.event.video.g;
import com.taobao.android.detail.core.event.video.h;
import com.taobao.android.detail.core.event.video.k;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.common.x;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.ecf;
import tb.ecu;
import tb.ecv;
import tb.eid;
import tb.emu;
import tb.eno;
import tb.epo;
import tb.epv;
import tb.fpz;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements View.OnClickListener, j, av, eid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f11386a = ecv.a(125.0f);
    private HashMap<String, String> b;
    private DWInstance c;
    private Context d;
    private boolean e;
    private String f;
    private View g;
    private View h;
    private ImageView i;
    private m.a j;
    private HashMap<String, String> k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private boolean p;
    private boolean q;
    private c r;
    private av s;

    static {
        kge.a(-776144922);
        kge.a(688755897);
        kge.a(-1453870097);
        kge.a(-1201612728);
        kge.a(316580666);
    }

    public static /* synthetic */ DWInstance a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInstance) ipChange.ipc$dispatch("9beda6b6", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d589417", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.e = z;
        return z;
    }

    public static /* synthetic */ Context b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("45e0b438", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e148af9f", new Object[]{aVar});
        } else {
            aVar.l();
        }
    }

    public static /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f214a02", new Object[]{aVar})).booleanValue() : aVar.e;
    }

    public static /* synthetic */ void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf9e45d", new Object[]{aVar});
        } else {
            aVar.n();
        }
    }

    public a() {
        emu.a("com.taobao.android.detail.wrapper.ext.video.DescVideoView");
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.android.trade.event.d a2 = com.taobao.android.trade.event.f.a(fpz.b(this.d));
        if (a2 == null) {
            return;
        }
        a2.a(eno.a(g.class), this);
        a2.a(eno.a(h.class), this);
        a2.a(eno.a(k.class), this);
        a2.a(eno.a(com.taobao.android.detail.core.event.video.j.class), this);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.android.trade.event.d a2 = com.taobao.android.trade.event.f.a(fpz.b(this.d));
        if (a2 == null) {
            return;
        }
        a2.b(eno.a(g.class), this);
        a2.b(eno.a(h.class), this);
        a2.b(eno.a(k.class), this);
        a2.b(eno.a(com.taobao.android.detail.core.event.video.j.class), this);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap<>();
            HashMap<String, String> hashMap = this.k;
            if (hashMap != null) {
                this.b.putAll(hashMap);
            }
            this.b.put("spm", "a2141.7631564.1999020245");
            m.a aVar = this.j;
            if (aVar != null) {
                this.b.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, aVar.i);
            }
        }
        com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.c.a(this.d, "Page_Detail_Show_ProductDetail", this.b);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.c;
        if (dWInstance != null) {
            this.h = dWInstance.getView();
            if (this.h.getParent() != null) {
                ((ViewGroup) this.h.getParent()).removeView(this.h);
            }
            ((ViewGroup) this.g).addView(this.h, new RelativeLayout.LayoutParams(-1, -1));
            this.c.setFrame(this.g.getWidth(), this.g.getHeight());
        }
        m();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.c;
        if (dWInstance == null) {
            return;
        }
        if (dWInstance.getVideoState() != 0 && this.c.getVideoState() != 4) {
            return;
        }
        this.c.start();
    }

    @Override // tb.eid
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c cVar = this.r;
        if (cVar != null && cVar.isShowing()) {
            return;
        }
        i();
        j();
        if (epv.b) {
            return;
        }
        com.taobao.android.detail.core.event.video.c.a(this.d, new com.taobao.android.trade.event.c<com.taobao.android.detail.core.event.video.e>() { // from class: com.taobao.android.detail.wrapper.ext.video.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.event.c
            public void onEventException(j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                }
            }

            @Override // com.taobao.android.trade.event.c
            public void a(com.taobao.android.detail.core.event.video.e eVar, j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5d70d478", new Object[]{this, eVar, jVar});
                } else if (a.a(a.this) == null || a.b(a.this) == null) {
                } else {
                    if (!eVar.f9738a && ecv.a(a.b(a.this)) && ecu.f27202a) {
                        a.c(a.this);
                        if (a.a(a.this).getVideoState() == 4) {
                            return;
                        }
                        a.a(a.this).start();
                    } else if (a.d(a.this)) {
                        com.taobao.android.detail.core.event.video.c.a(a.b(a.this), (com.taobao.android.trade.event.c) null, false);
                        a.a(a.this).showController();
                        a.a(a.this, false);
                    } else if (!eVar.f9738a) {
                    } else {
                        a.a(a.this).pauseVideo();
                    }
                }
            }
        });
    }

    @Override // tb.eid
    public void a(Context context, m.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69fd0d54", new Object[]{this, context, aVar, new Boolean(z)});
            return;
        }
        if (this.d == null) {
            this.d = context;
            this.j = aVar;
            this.g = aVar.c;
            k();
        }
        this.l = z;
        l();
    }

    @Override // tb.eid
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.c == null || this.j == null) {
        } else {
            if (!epv.b) {
                int videoState = this.c.getVideoState();
                if (!z || z2) {
                    if (z && z2 && this.e) {
                        com.taobao.android.detail.core.event.video.c.a(this.d, (com.taobao.android.trade.event.c) null, true);
                        this.e = false;
                    }
                } else if (videoState == 1 || videoState == 5) {
                    float f = this.j.e / this.j.d;
                    Context context = this.d;
                    DWInstance dWInstance = this.c;
                    DetailVideoSource detailVideoSource = DetailVideoSource.DESC;
                    int i = this.f11386a;
                    d.a(context, dWInstance, null, detailVideoSource, i, (int) (i * f), this.g.getWidth(), this.g.getHeight());
                    this.e = true;
                } else if (videoState == 8) {
                    this.p = true;
                }
                if (!z || !z2) {
                    return;
                }
                this.c.pauseVideo();
                return;
            }
            this.c.pauseVideo();
        }
    }

    @Override // tb.eid
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c cVar = this.r;
        if (cVar != null && cVar.isShowing()) {
            this.r.dismiss();
            this.r = null;
        }
        h();
        e();
        DWInstance dWInstance = this.c;
        if (dWInstance == null) {
            return;
        }
        dWInstance.destroy();
        this.c = null;
    }

    @Override // tb.eid
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.c;
        if (dWInstance == null) {
            return;
        }
        dWInstance.pauseVideo();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Context b = fpz.b(this.d);
        if (!(b instanceof DetailCoreActivity)) {
            return;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) b;
        if (detailCoreActivity.y() == null || detailCoreActivity.y().t == null) {
            return;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = detailCoreActivity.y().t;
        HashMap<String, String> hashMap = new HashMap<>(4);
        hashMap.put("item_id", cVar.i());
        hashMap.put("shop_id", cVar.o());
        hashMap.put("seller_id", cVar.h());
        this.f = cVar.h();
        Map<String, String> g = cVar.g();
        if (g != null) {
            hashMap.putAll(g);
        }
        this.k = hashMap;
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        if (eno.a(g.class) == event.getEventId()) {
            DWInstance dWInstance = this.c;
            if (dWInstance != null) {
                this.o = dWInstance.getVideoState();
                this.n = true;
                this.c.pauseVideo();
            }
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(h.class) == event.getEventId()) {
            DWInstance dWInstance2 = this.c;
            if (dWInstance2 != null && this.n && this.o == 1) {
                dWInstance2.playVideo();
                this.n = false;
            }
            return i.SUCCESS;
        } else if (eno.a(k.class) == event.getEventId()) {
            this.q = true;
            this.c.removeFullScreenCustomView();
            return i.SUCCESS;
        } else if (eno.a(com.taobao.android.detail.core.event.video.j.class) != event.getEventId()) {
            return null;
        } else {
            this.q = false;
            if (!this.e && this.r != null) {
                j();
            }
            return i.SUCCESS;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view != this.i) {
        } else {
            if (this.r == null) {
                this.r = new c(this.d, R.style.Dialog_Fullscreen, this.c);
            }
            this.r.a(this.c, PopDialogSource.DESC, this.c.getView(), this.g.getWidth(), this.g.getHeight());
            this.c.removeFullScreenCustomView();
        }
    }

    /* renamed from: com.taobao.android.detail.wrapper.ext.video.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0449a implements z {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(963643722);
            kge.a(-1226623529);
        }

        private C0449a() {
        }

        @Override // com.taobao.avplayer.common.z
        public boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            if (a.a(a.this) != null && a.a(a.this).isMute()) {
                a.a(a.this).mute(false);
            }
            if (a.a(a.this) != null && (a.a(a.this).getVideoState() == 0 || a.a(a.this).getVideoState() == 4)) {
                a.a(a.this).start();
            }
            a.e(a.this);
            return false;
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        m.a aVar = this.j;
        if (aVar == null || StringUtils.isEmpty(aVar.b) || this.g == null) {
            return;
        }
        if (this.c == null) {
            bk.a aVar2 = new bk.a(fpz.c(this.d));
            aVar2.e(com.taobao.android.detail.wrapper.nav.c.STDPOP_POP_ID_DETAIL);
            aVar2.q(true);
            aVar2.g(false);
            aVar2.d(this.g.getHeight());
            aVar2.c(this.g.getWidth());
            aVar2.a(this.j.b);
            aVar2.b(this.j.i);
            aVar2.c("TBVideo");
            aVar2.a(this.k);
            aVar2.f(true);
            aVar2.N(true);
            if (ecu.e) {
                aVar2.g(true);
                aVar2.F(true);
                aVar2.p(false);
                aVar2.E(false);
                aVar2.G(false);
                aVar2.I(true);
                aVar2.L(false);
                aVar2.J(true);
                aVar2.K(false);
            }
            if (!StringUtils.isEmpty(this.f) && StringUtils.isDigitsOnly(this.f)) {
                aVar2.b(Long.parseLong(this.f));
            }
            if (!StringUtils.isEmpty(this.j.j)) {
                aVar2.i(true);
                com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar3 = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
                aVar3.a(new DWFrontCoverBean(0L, null, this.j.j));
                aVar2.a(aVar3);
            }
            this.c = aVar2.c();
            this.c.hideCloseView();
            this.c.setVideoLifecycleListener(this);
            this.c.setRootViewClickListener(new C0449a());
            g();
        }
        j();
        this.c.showController();
        this.e = false;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.c == null) {
        } else {
            if (this.h.getParent() != null) {
                ((ViewGroup) this.h.getParent()).removeView(this.h);
            }
            this.c.destroy();
            this.c = null;
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        View view = this.g;
        if ((view != null && view.getHeight() >= epo.c) || this.d == null) {
            return;
        }
        c cVar = this.r;
        if (cVar != null && cVar.isShowing()) {
            return;
        }
        if (this.i == null) {
            this.i = new ImageView(this.d);
            this.i.setImageDrawable(this.d.getResources().getDrawable(R.drawable.detail_video_enlarge));
        }
        if (this.i.getParent() != null) {
            ((ViewGroup) this.i.getParent()).removeView(this.i);
        }
        DWInstance dWInstance = this.c;
        if (dWInstance != null) {
            dWInstance.addFullScreenCustomView(this.i);
        }
        this.i.setOnClickListener(this);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!this.q) {
        } else {
            ecf.a(fpz.b(this.d), "Product");
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        DWInstance dWInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else if (this.p && (dWInstance = this.c) != null) {
            dWInstance.mute(false);
            this.c.pauseVideo();
            this.p = false;
        } else {
            if (!this.m || !this.q) {
                com.taobao.android.detail.core.event.video.c.a(this.d, (com.taobao.android.trade.event.c) null, true);
            }
            av avVar = this.s;
            if (avVar != null) {
                avVar.onVideoStart();
            }
            if (this.q && c.a(this.c)) {
                this.c.orientationEnable();
            }
            this.m = false;
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        av avVar = this.s;
        if (avVar != null) {
            avVar.onVideoPause(z);
        }
        DWInstance dWInstance = this.c;
        if (dWInstance == null) {
            return;
        }
        dWInstance.showController();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        av avVar = this.s;
        if (avVar != null) {
            avVar.onVideoPlay();
        }
        this.m = false;
        if (this.e) {
            return;
        }
        com.taobao.android.detail.core.event.video.c.a(this.d, (com.taobao.android.trade.event.c) null, true);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        av avVar = this.s;
        if (avVar == null) {
            return;
        }
        avVar.onVideoSeekTo(i);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        av avVar = this.s;
        if (avVar == null) {
            return;
        }
        avVar.onVideoPrepared(obj);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        av avVar = this.s;
        if (avVar == null) {
            return;
        }
        avVar.onVideoError(Integer.valueOf(i), i, i2);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        av avVar = this.s;
        if (avVar == null) {
            return;
        }
        avVar.onVideoInfo(obj, i, i2);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        if (!this.q) {
            com.taobao.android.detail.core.event.video.c.a(this.d, (com.taobao.android.trade.event.c) null, false);
        }
        DWInstance dWInstance = this.c;
        if (dWInstance != null) {
            dWInstance.setDWLifecycleType(DWLifecycleType.BEFORE);
        }
        DWInstance dWInstance2 = this.c;
        if (dWInstance2 != null && dWInstance2.isFullScreen()) {
            this.c.toggleScreen();
        }
        this.m = true;
        DWInstance dWInstance3 = this.c;
        if (dWInstance3 != null) {
            dWInstance3.orientationDisable();
        }
        b();
        av avVar = this.s;
        if (avVar == null) {
            return;
        }
        avVar.onVideoComplete();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        av avVar = this.s;
        if (avVar == null) {
            return;
        }
        avVar.onVideoClose();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            return;
        }
        av avVar = this.s;
        if (avVar == null) {
            return;
        }
        avVar.onVideoFullScreen();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            return;
        }
        av avVar = this.s;
        if (avVar == null) {
            return;
        }
        avVar.onVideoNormalScreen();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        av avVar = this.s;
        if (avVar == null) {
            return;
        }
        avVar.onVideoProgressChanged(i, i2, i3);
    }

    public void a(av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173676bc", new Object[]{this, avVar});
        } else {
            this.s = avVar;
        }
    }

    public void a(x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410cfe7d", new Object[]{this, xVar});
            return;
        }
        DWInstance dWInstance = this.c;
        if (dWInstance == null) {
            return;
        }
        dWInstance.setNormalControllerListener(xVar);
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        DWInstance dWInstance = this.c;
        if (dWInstance == null) {
            return -1;
        }
        return dWInstance.getCurrentPosition();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        DWInstance dWInstance = this.c;
        if (dWInstance == null) {
            return;
        }
        dWInstance.seekTo(i);
    }
}
