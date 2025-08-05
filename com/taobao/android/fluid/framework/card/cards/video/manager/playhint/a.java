package com.taobao.android.fluid.framework.card.cards.video.manager.playhint;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.util.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.request.d;
import com.taobao.tao.flexbox.layoutmanager.ac.f;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.hni;
import tb.kge;
import tb.obu;
import tb.oce;
import tb.oeb;
import tb.oec;
import tb.psw;
import tb.sii;
import tb.sil;
import tb.snv;
import tb.snz;
import tb.spz;

/* loaded from: classes5.dex */
public class a implements hni, snz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f12510a;
    private static final long b;
    private static final boolean c;
    private static long d;
    private final ViewGroup e;
    private final TUrlImageView f;
    private final View g;
    private TUrlImageView h;
    private ProgressAnimationView i;
    private snv j;
    private String k;
    private boolean l;
    private int n;
    private int o;
    private final sii r;
    private boolean m = true;
    private final Handler p = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.playhint.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 0 || !a.a(a.this, message.arg1, message.arg2)) {
            } else {
                a.this.a();
            }
        }
    };
    private int q = -1;

    @Override // tb.snz
    public void onDataUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onLoopCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0caff82", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onPreCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9060abe3", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
        }
    }

    @Override // tb.snz
    public void onRequestMediaPlayer(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onShowCover(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8496fbe", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onShowFirstCover(psw pswVar, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2677f4", new Object[]{this, pswVar, new Integer(i), new Integer(i2), drawable, str});
        }
    }

    @Override // tb.snz
    public void onUTPairsUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db420e07", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoClose(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c366581f", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoComplete(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6169a058", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoInfo(psw pswVar, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93966fd7", new Object[]{this, pswVar, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.hni
    public void onVideoPrepared(psw pswVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc216e38", new Object[]{this, pswVar, obj});
        }
    }

    @Override // tb.hni
    public void onVideoScreenChanged(psw pswVar, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ff74ca", new Object[]{this, pswVar, dWVideoScreenType});
        }
    }

    @Override // tb.hni
    public void onVideoStateChanged(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400dd041", new Object[]{this, pswVar, new Integer(i)});
        }
    }

    public static /* synthetic */ TUrlImageView a(a aVar, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("513ebd24", new Object[]{aVar, tUrlImageView});
        }
        aVar.h = tUrlImageView;
        return tUrlImageView;
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94641f2", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    public static /* synthetic */ boolean a(a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70cbedd6", new Object[]{aVar, new Integer(i), new Integer(i2)})).booleanValue() : aVar.a(i, i2);
    }

    public static /* synthetic */ TUrlImageView b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("77215ca9", new Object[]{aVar}) : aVar.h;
    }

    static {
        kge.a(-1603162154);
        kge.a(854340662);
        kge.a(1120919262);
        f12510a = (int) (oeb.a("ShortVideo.checkNetworkTaskDelay", 2.0f) * 1000.0f);
        b = oeb.a("ShortVideo.toastInterval", 120L) * 1000;
        c = oeb.a("ShortVideo.showPoorNetworkToast", true);
    }

    public a(sii siiVar, ViewGroup viewGroup, TUrlImageView tUrlImageView, View view) {
        this.e = viewGroup;
        this.f = tUrlImageView;
        this.r = siiVar;
        if (tUrlImageView != null) {
            tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.playhint.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    a.a(a.this);
                    return true;
                }
            });
        }
        this.g = view;
        a(siiVar, viewGroup);
        a(siiVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        spz.c("PlayHintManager", "showLoadingHintStatus");
        boolean z2 = !f.a(this.e.getContext());
        if (NetworkQualityMonitor.getGlobalNetworkQuality() == 1) {
            z = true;
        }
        a(z2, z);
        i();
    }

    private boolean a(int i, int i2) {
        snv snvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        boolean z = !f.a(this.e.getContext());
        int globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
        boolean z2 = globalNetworkQuality == 1;
        spz.c("PlayHintManager", "checkLoadingHintStatus, noNetwork: " + z + " quality:" + globalNetworkQuality + " bandwidth:" + NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth() + " errorCode:" + i + " extra:" + i2);
        return ((!z && !z2 && !(oeb.a("ShortVideo.checkPlayError", true) && i != 0) && !oeb.a("ShortVideo.checkPlayDelay", true)) || (snvVar = this.j) == null || snvVar.e() == 2) ? false : true;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.checkPositionChange", true);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        spz.c("PlayHintManager", "hideEmptyIconHintView");
        oec.a(new Runnable() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.playhint.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.b(a.this) == null) {
                } else {
                    spz.c("PlayHintManager", "hideEmptyIconHintView");
                    ViewGroup viewGroup = (ViewGroup) a.b(a.this).getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(a.b(a.this));
                    }
                    if (sil.i()) {
                        return;
                    }
                    a.a(a.this, (TUrlImageView) null);
                }
            }
        });
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ProgressAnimationView progressAnimationView = this.i;
        if (progressAnimationView == null || !progressAnimationView.isVisible()) {
            return;
        }
        spz.c("PlayHintManager", "hideSeekHintView");
        this.i.hideProgressAnimation();
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        TUrlImageView tUrlImageView = this.f;
        return (tUrlImageView == null || tUrlImageView.getDrawable() == null) && (this.l ^ true);
    }

    private void a(sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feca9d25", new Object[]{this, siiVar});
        } else {
            siiVar.O().a(this);
        }
    }

    @Override // tb.snz
    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
        } else {
            a(this.r.h(), this.r.ai());
        }
    }

    @Override // tb.snz
    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
        } else {
            a(this.r.h());
        }
    }

    private void a(sii siiVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8f6a64", new Object[]{this, siiVar, viewGroup});
        } else {
            siiVar.P().a(this);
        }
    }

    @Override // tb.hni
    public void onVideoError(psw pswVar, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8308feb", new Object[]{this, pswVar, obj, new Integer(i), new Integer(i2)});
            return;
        }
        spz.c("PlayHintManager", "onVideoError, code:" + i + " extra:" + i2);
        this.n = i;
        this.o = i2;
        this.p.removeCallbacksAndMessages(null);
        if (this.j != null) {
            Message.obtain(this.p, 0, i, i2).sendToTarget();
        }
        if (this.m) {
            this.m = false;
        } else if (!f.a(this.e.getContext())) {
        } else {
            h();
        }
    }

    @Override // tb.hni
    public void onVideoPause(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ec8357", new Object[]{this, pswVar, new Boolean(z)});
            return;
        }
        spz.c("PlayHintManager", "onVideoPause");
        d();
        c();
    }

    @Override // tb.hni
    public void onVideoPlay(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653637d3", new Object[]{this, pswVar});
            return;
        }
        spz.c("PlayHintManager", "onVideoPlay");
        f();
    }

    @Override // tb.hni
    public void onVideoProgressChanged(psw pswVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6edd75", new Object[]{this, pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.n = 0;
        this.o = 0;
        this.l = true;
        if (i == this.q && b()) {
            spz.c("PlayHintManager", "position not changed");
        } else {
            f();
            d();
            c();
        }
        this.q = i;
    }

    @Override // tb.hni
    public void onVideoSeekTo(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f305711", new Object[]{this, pswVar, new Integer(i)});
            return;
        }
        spz.c("PlayHintManager", "onVideoSeekTo " + i);
        f();
    }

    @Override // tb.hni
    public void onVideoStart(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ef89", new Object[]{this, pswVar});
            return;
        }
        spz.c("PlayHintManager", "onVideoStart");
        this.l = true;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.p.removeCallbacksAndMessages(null);
        if (this.j == null) {
            return;
        }
        this.p.sendEmptyMessageDelayed(0, f12510a);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (obu.i()) {
        } else {
            if (this.h == null) {
                this.h = new TUrlImageView(this.e.getContext());
                this.h.setSkipAutoSize(true);
                this.h.setImageUrl(d.b("videosdk_error_loading_icon.apng"));
                this.h.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.playhint.a.4
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
                        if (succPhenixEvent.getDrawable() instanceof com.taobao.phenix.animate.b) {
                            ((com.taobao.phenix.animate.b) succPhenixEvent.getDrawable()).a(0);
                        }
                        return true;
                    }
                });
            }
            if (this.h.getParent() != null) {
                ((ViewGroup) this.h.getParent()).removeView(this.h);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c.a(54.0f), c.a(43.5f));
            layoutParams.gravity = 17;
            this.e.addView(this.h, layoutParams);
            spz.c("PlayHintManager", "showEmptyIconHintView");
        }
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - d <= b) {
            return;
        }
        if (z) {
            i = R.string.fluid_sdk_error_network_hint;
        } else if (z2 && c) {
            i = R.string.fluid_sdk_poor_network_hint;
        }
        if (i == 0) {
            return;
        }
        oce.b(obu.e(), obu.e().getString(i));
        d = currentTimeMillis;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            oce.b(obu.e(), obu.e().getString(R.string.fluid_sdk_error_video_common_hint));
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (this.i == null) {
            this.i = new ProgressAnimationView(this.e.getContext());
        }
        if (this.i.isVisible()) {
            return;
        }
        spz.c("PlayHintManager", "showSeekHintView");
        this.i.showProgressAnimation(this.g);
        j();
    }

    private void a(snv snvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2652007", new Object[]{this, snvVar, str});
            return;
        }
        spz.c("PlayHintManager", "startMonitor");
        this.j = snvVar;
        this.k = str;
        f();
        d();
        if (!e()) {
            return;
        }
        g();
    }

    private void a(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff16fb7d", new Object[]{this, snvVar});
            return;
        }
        spz.c("PlayHintManager", "stopMonitor");
        this.j = null;
        this.m = true;
        this.l = false;
        this.n = 0;
        this.o = 0;
        d();
        this.p.removeCallbacksAndMessages(null);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("videoId", this.k);
        hashMap.put("netSpeed", String.valueOf(NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth()));
        int i = this.n;
        if (i > 0) {
            hashMap.put("errorCode", String.valueOf(i));
            hashMap.put("errorExtra", String.valueOf(this.o));
        }
        hashMap.put("networkType", f.a(this.e.getContext()) ^ true ? "noNetwork" : f.c(this.e.getContext()));
        hashMap.put("networkQuality", String.valueOf(NetworkQualityMonitor.getGlobalNetworkQuality()));
        FluidSDK.getUTAdapter().trackCustom("Page_videointeract", 19997, "playhint", "", "", hashMap);
    }
}
