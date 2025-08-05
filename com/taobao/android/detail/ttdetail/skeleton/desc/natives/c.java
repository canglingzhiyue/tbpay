package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.common.x;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.fpz;
import tb.kge;
import tb.szl;
import tb.szm;
import tb.szo;
import tb.szr;
import tb.szs;

/* loaded from: classes5.dex */
public class c implements View.OnClickListener, com.taobao.android.detail.ttdetail.communication.g, h, av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f10814a = com.taobao.android.detail.ttdetail.utils.f.a(125.0f);
    private HashMap<String, String> b;
    private DWInstance c;
    private Context d;
    private boolean e;
    private String f;
    private View g;
    private View h;
    private ImageView i;
    private szm.a j;
    private HashMap<String, String> k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private boolean p;
    private boolean q;
    private f r;
    private av s;

    static {
        kge.a(-243457651);
        kge.a(688755897);
        kge.a(-1201612728);
        kge.a(-191254360);
        kge.a(-767194759);
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc15e17", new Object[]{cVar});
        }
    }

    public static /* synthetic */ DWInstance a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInstance) ipChange.ipc$dispatch("b2f314e1", new Object[]{cVar}) : cVar.c;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.d, szl.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(this.d, szo.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(this.d, szs.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(this.d, szr.class, this);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.d, szl.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.d, szo.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.d, szs.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.d, szr.class);
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
            szm.a aVar = this.j;
            if (aVar != null) {
                this.b.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, aVar.i);
            }
        }
        g.a(this.d, "Page_Detail_Show_ProductDetail", this.b);
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
        l();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
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

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.h
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f fVar = this.r;
        if (fVar != null && fVar.isShowing()) {
            return;
        }
        i();
        j();
    }

    public void a(Context context, szm.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b398a7", new Object[]{this, context, aVar, new Boolean(z)});
            return;
        }
        if (this.d == null) {
            this.d = context;
            this.j = aVar;
            this.g = aVar.c;
        }
        this.l = z;
        k();
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.h
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        DWInstance dWInstance = this.c;
        if (dWInstance == null || this.j == null) {
            return;
        }
        if (z && z2) {
            dWInstance.pauseVideo();
        }
        int videoState = this.c.getVideoState();
        if (z && !z2) {
            if (videoState != 8) {
                return;
            }
            this.p = true;
        } else if (!z || !z2) {
        } else {
            this.c.pauseVideo();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f fVar = this.r;
        if (fVar != null && fVar.isShowing()) {
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

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.h
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
        dWInstance.pauseVideo();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view != this.i) {
        } else {
            if (this.r == null) {
                this.r = new f(this.d, R.style.Dialog_Fullscreen, this.c);
            }
            this.r.a(this.c, PopDialogSource.DESC, this.c.getView(), this.g.getWidth(), this.g.getHeight());
            this.c.removeFullScreenCustomView();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public boolean receiveMessage(com.taobao.android.detail.ttdetail.communication.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, dVar})).booleanValue();
        }
        if (dVar instanceof szl) {
            DWInstance dWInstance = this.c;
            if (dWInstance != null) {
                this.o = dWInstance.getVideoState();
                this.n = true;
                this.c.pauseVideo();
            }
            return true;
        } else if (dVar instanceof szo) {
            DWInstance dWInstance2 = this.c;
            if (dWInstance2 != null && this.n && this.o == 1) {
                dWInstance2.playVideo();
                this.n = false;
            }
            return true;
        } else if (dVar instanceof szs) {
            this.q = true;
            this.c.removeFullScreenCustomView();
            return true;
        } else if (!(dVar instanceof szr)) {
            return false;
        } else {
            this.q = false;
            if (!this.e && this.r != null) {
                j();
            }
            return true;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }

    /* loaded from: classes5.dex */
    public class a implements z {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1957248335);
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
            if (c.a(c.this) != null && c.a(c.this).isMute()) {
                c.a(c.this).mute(false);
            }
            if (c.a(c.this) != null && (c.a(c.this).getVideoState() == 0 || c.a(c.this).getVideoState() == 4)) {
                c.a(c.this).start();
            }
            c.b(c.this);
            return false;
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        szm.a aVar = this.j;
        if (aVar == null || TextUtils.isEmpty(aVar.b) || this.g == null) {
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
            aVar2.g(true);
            aVar2.F(true);
            aVar2.p(false);
            aVar2.E(false);
            aVar2.G(false);
            aVar2.I(true);
            aVar2.L(false);
            aVar2.J(true);
            aVar2.K(false);
            if (!TextUtils.isEmpty(this.f) && TextUtils.isDigitsOnly(this.f)) {
                aVar2.b(Long.parseLong(this.f));
            }
            if (!TextUtils.isEmpty(this.j.j)) {
                aVar2.i(true);
                com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar3 = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
                aVar3.a(new DWFrontCoverBean(0L, null, this.j.j));
                aVar2.a(aVar3);
            }
            this.c = aVar2.c();
            this.c.hideCloseView();
            this.c.setVideoLifecycleListener(this);
            this.c.setRootViewClickListener(new a());
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

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        View view = this.g;
        if ((view != null && view.getHeight() >= com.taobao.android.detail.ttdetail.utils.f.b(this.d)) || this.d == null) {
            return;
        }
        f fVar = this.r;
        if (fVar != null && fVar.isShowing()) {
            return;
        }
        if (this.i == null) {
            this.i = new ImageView(this.d);
            this.i.setImageDrawable(this.d.getResources().getDrawable(R.drawable.tt_detail_video_enlarge));
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
            av avVar = this.s;
            if (avVar != null) {
                avVar.onVideoStart();
            }
            if (this.q && f.a(this.c)) {
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
        c();
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
