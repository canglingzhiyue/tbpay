package com.taobao.bootimage.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.interact.view.BootImageInteractBaseView;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.login4android.api.Login;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import tb.iqn;
import tb.iqo;
import tb.kej;
import tb.kel;
import tb.kem;
import tb.keq;
import tb.kge;
import tb.nwp;
import tb.pbe;
import tb.pbg;

/* loaded from: classes6.dex */
public class f extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private iqn c;
    private ImageView m;
    private View n;
    private ViewGroup o;
    private pbe p;
    private boolean q;
    private FrameLayout r;
    private String s;
    private final pbe.a t;
    private TextView u;
    private boolean v;

    static {
        kge.a(-2006642731);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode == 91915245) {
            return new Boolean(super.b());
        } else {
            if (hashCode != 673877021) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.handleMessage((Message) objArr[0]));
        }
    }

    public static /* synthetic */ void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f359e4", new Object[]{fVar});
        } else {
            fVar.g();
        }
    }

    public static /* synthetic */ void a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1678559f", new Object[]{fVar, new Integer(i)});
        } else {
            fVar.a(i);
        }
    }

    public static /* synthetic */ void a(f fVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a25b08", new Object[]{fVar, drawable});
        } else {
            fVar.a(drawable);
        }
    }

    public static /* synthetic */ void a(f fVar, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe887ec", new Object[]{fVar, succPhenixEvent});
        } else {
            fVar.a(succPhenixEvent);
        }
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16789574", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.v = z;
        return z;
    }

    public static /* synthetic */ void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25131e03", new Object[]{fVar});
        } else {
            fVar.d();
        }
    }

    public static /* synthetic */ iqn c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iqn) ipChange.ipc$dispatch("4a9c9a9e", new Object[]{fVar}) : fVar.c;
    }

    public f(Context context, BootImageInfo bootImageInfo, ViewGroup viewGroup) {
        super(context, bootImageInfo);
        this.q = false;
        this.s = "none";
        this.v = false;
        this.t = new pbe.a() { // from class: com.taobao.bootimage.view.f.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pbe.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                kej.a("BootImageCommercialVideoController", "show video: on started");
                f.b(f.this);
                if (f.this.h == null) {
                    return;
                }
                f.this.a(keq.VIDEO_PLAY_START, (String) null);
            }

            @Override // tb.pbe.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                kej.a("BootImageCommercialVideoController", "show video: onComplete:" + System.currentTimeMillis());
                if (f.this.f == null) {
                    return;
                }
                f.this.f.sendEmptyMessage(102);
            }

            @Override // tb.pbe.a
            public void a(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                kej.a("BootImageCommercialVideoController", "show video: onError what: " + i + " extra " + i2);
                f.this.a(keq.VIDEO_PLAY_ERROR, String.valueOf(i));
                if (f.this.f == null) {
                    return;
                }
                f.this.f.sendEmptyMessage(101);
            }
        };
        if (bootImageInfo != null) {
            this.s = bootImageInfo.videoUrl;
        }
        if (viewGroup != null) {
            this.g = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.bootimage_video_commercial, viewGroup, false);
            this.f16713a = (TextView) this.g.findViewById(R.id.countdown_text);
            this.o = (ViewGroup) this.g.findViewById(R.id.video_container);
            this.m = (ImageView) this.g.findViewById(R.id.default_image);
            ImageView imageView = (ImageView) this.g.findViewById(R.id.iv_taobao_logo);
            ImageView imageView2 = (ImageView) this.g.findViewById(R.id.icon_ipv6_logo);
            View findViewById = this.g.findViewById(R.id.close);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.bootimage.view.f.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        kej.a("BootImageCommercialVideoController", "show video: skip");
                        if (f.this.d != null) {
                            f.a(f.this);
                            f.this.d.a(com.taobao.bootimage.d.CLOSE_TYPE_SKIP);
                        }
                        f.this.a();
                    }
                });
                this.u = (TextView) this.g.findViewById(R.id.close_txt);
                a(this.u, bootImageInfo);
            }
            if (imageView != null && imageView2 != null && bootImageInfo != null && bootImageInfo.hideTBLogo) {
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
            }
            if (bootImageInfo != null && !TextUtils.isEmpty(bootImageInfo.videoLocalPath)) {
                a(context);
            }
            this.r = (FrameLayout) this.g.findViewById(R.id.interact_view_container);
            if (kel.f || bootImageInfo == null) {
                return;
            }
            try {
                this.c = new iqo();
                this.c.a(context, bootImageInfo, com.taobao.bootimage.linked.h.b("").b().getSplashObj());
                BootImageInteractBaseView d = this.c.d();
                if (d == null) {
                    return;
                }
                d.setBootImageContentListener(new nwp() { // from class: com.taobao.bootimage.view.f.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.nwp
                    public void a(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        kej.a("BootImageCommercialVideoController", "closeView clickAd");
                        if (f.this.d != null) {
                            f.this.d.a(str);
                        }
                        f.a(f.this, true);
                        f.this.a();
                    }
                });
                this.r.addView(d);
            } catch (Throwable th) {
                th.printStackTrace();
                kej.a("BootImageCommercialVideoController", "getDX bootImageInteractBaseController error = ", th);
            }
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            this.p = (pbe) AliAdaptServiceManager.getInstance().findAliAdaptService(pbe.class);
            if (this.p != null) {
                pbg pbgVar = new pbg("tbbootimage", Login.getUserId());
                pbgVar.c = 2;
                pbgVar.d = 2;
                pbgVar.f = 0;
                this.p.initConfig(context, pbgVar);
                this.p.setVideoPath(this.h.videoLocalPath);
                pbe pbeVar = this.p;
                if (this.h.haveVoice) {
                    z = false;
                }
                pbeVar.setMuted(z);
                this.p.setListener(this.t);
                this.n = this.p.getPlayView();
                if (this.n != null) {
                    this.o.addView(this.n);
                    this.m.bringToFront();
                    this.n.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    return;
                }
                kej.a("BootImageCommercialVideoController", "show video: no player view. mPlayerView == null");
                return;
            }
            kej.a("BootImageCommercialVideoController", "show video: service error.");
        } catch (Throwable th) {
            kej.a("BootImageCommercialVideoController", "show video: service exception.");
            this.n = null;
            th.printStackTrace();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f == null) {
        } else {
            this.f.sendEmptyMessage(100);
            if (this.h.removeBGDelayMs == 0) {
                this.f.sendEmptyMessage(103);
            } else if (this.h.removeBGDelayMs > 0) {
                this.f.sendEmptyMessageDelayed(103, this.h.removeBGDelayMs);
            } else {
                this.f.sendEmptyMessageDelayed(103, 300L);
            }
        }
    }

    @Override // com.taobao.bootimage.view.b, com.taobao.bootimage.view.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        kej.a("BootImageCommercialVideoController", "show video: start");
        if (this.h == null || this.i.get() == null) {
            kej.a("BootImageCommercialVideoController", "show video failed: data error.");
            return false;
        }
        final String a2 = a(this.h);
        if (TextUtils.isEmpty(a2)) {
            kej.a("BootImageCommercialVideoController", "show video failed: imgUrl is null");
            return false;
        }
        this.q = false;
        if (!super.b()) {
            return false;
        }
        kej.a("BootImageCommercialVideoController", "show video: 有默认图，显示默认图");
        try {
            PhenixCreator a3 = com.taobao.phenix.intf.b.h().a(BootImageDataMgr.IMAGE_MODULE_NAME, a2);
            a3.mo1206onlyCache();
            a3.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.bootimage.view.f.4
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
                    f.a(f.this, succPhenixEvent);
                    if (f.c(f.this) != null) {
                        f.c(f.this).b();
                    }
                    return true;
                }
            });
            a3.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.bootimage.view.f.5
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
                    f.a(f.this, 102);
                    kej.a("BootImageCommercialVideoController", "show video: load video failed, code " + failPhenixEvent.getResultCode() + ", url=" + a2);
                    return true;
                }
            });
            a3.fetch();
            kej.a("BootImageCommercialVideoController", "show video: load video");
            return true;
        } catch (Throwable th) {
            kej.a("BootImageCommercialVideoController", "show video: load default image exception");
            th.printStackTrace();
            a();
            return false;
        }
    }

    @Override // com.taobao.bootimage.view.b, com.taobao.bootimage.view.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        kej.a("BootImageCommercialVideoController", "show video: close() ");
        g();
        if (this.f != null) {
            this.f.removeMessages(103);
            this.f.removeMessages(101);
            this.f.removeMessages(102);
            this.f.removeMessages(100);
            this.f.removeMessages(105);
            this.f.removeMessages(106);
        }
        pbe pbeVar = this.p;
        if (pbeVar != null) {
            pbeVar.release();
            this.p = null;
        }
        if (this.n != null) {
            this.n = null;
        }
        iqn iqnVar = this.c;
        if (iqnVar != null) {
            iqnVar.c();
        }
        super.a();
    }

    @Override // com.taobao.bootimage.view.b, com.taobao.bootimage.view.c, android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 100:
                kej.a("BootImageCommercialVideoController", "show video video success");
                a(keq.VIDEO_PLAY_SUCCESS, (String) null);
                if (this.e) {
                    this.q = true;
                    break;
                }
                break;
            case 101:
                kej.a("BootImageCommercialVideoController", "video failfailed video path:" + this.h.videoLocalPath);
                b(this.h);
                break;
            case 102:
                kej.a("BootImageCommercialVideoController", "show video video finish");
                if (this.d != null) {
                    this.d.a("other");
                }
                a();
                break;
            case 103:
                kej.a("BootImageCommercialVideoController", "show video remove default image");
                if (!this.e) {
                    kej.a("BootImageCommercialVideoController", "show video remove default image mShowed is false");
                    break;
                } else {
                    c();
                    ImageView imageView = this.m;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    if (TextUtils.isEmpty(this.h.imgUrl) && this.d != null) {
                        kej.a("BootImageCommercialVideoController", "show video without default image. So on success");
                        this.d.a();
                        break;
                    }
                }
                break;
            case 105:
                kej.a("BootImageCommercialVideoController", "show video time out");
                if (!this.q) {
                    kej.a("BootImageCommercialVideoController", "video timeout");
                    AppMonitor.Counter.commit(BootImageDataMgr.CACHE_MODULE, "videoTimeout", 1.0d);
                    a(101);
                    break;
                }
                break;
            case 106:
                kej.a("BootImageCommercialVideoController", "show video startCountDown");
                if (this.e) {
                    c();
                    break;
                }
                break;
        }
        super.handleMessage(message);
        return true;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!this.e) {
        } else {
            if (this.d != null) {
                this.d.a(i);
            }
            a();
        }
    }

    private String a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9ec94d2", new Object[]{this, bootImageInfo});
        }
        if (TextUtils.isEmpty(bootImageInfo.imgUrl)) {
            kej.a("BootImageCommercialVideoController", "没有兜底图，直接返回空，不满足闪屏展示条件");
            return null;
        } else if (!TextUtils.isEmpty(bootImageInfo.firstFrameImageUrl) && !TextUtils.isEmpty(bootImageInfo.videoLocalPath)) {
            return bootImageInfo.firstFrameImageUrl;
        } else {
            return bootImageInfo.imgUrl;
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : (this.n == null || this.p == null) ? false : true;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
            this.p.start();
            kej.a("BootImageCommercialVideoController", "playService start");
            this.f.sendEmptyMessageDelayed(105, kem.a().e());
            return true;
        } catch (Throwable th) {
            kej.a("BootImageCommercialVideoController", "show video: video start exception", th);
            return false;
        }
    }

    private void b(final BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7fb2d", new Object[]{this, bootImageInfo});
            return;
        }
        try {
            PhenixCreator a2 = com.taobao.phenix.intf.b.h().a(BootImageDataMgr.IMAGE_MODULE_NAME, bootImageInfo.imgUrl);
            a2.mo1206onlyCache();
            a2.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.bootimage.view.f.6
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
                    f.a(f.this, succPhenixEvent.getDrawable());
                    kej.a("BootImageCommercialVideoController", "视频播放失败，展示兜底");
                    if (f.this.f != null) {
                        f.this.f.sendEmptyMessage(106);
                    }
                    return true;
                }
            });
            a2.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.bootimage.view.f.7
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
                    f.a(f.this, 102);
                    kej.a("BootImageCommercialVideoController", "show video: load video failed, code " + failPhenixEvent.getResultCode() + ", url=" + bootImageInfo.imgUrl);
                    return true;
                }
            });
            a2.fetch();
            kej.a("BootImageCommercialVideoController", "show video: loadVideoDefaultImg");
        } catch (Throwable th) {
            kej.a("BootImageCommercialVideoController", "show video: loadVideoDefaultImg image exception", th);
            a();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.v) {
            kej.a("BootImageCommercialVideoController", "insertCurrentPositionToFeedsData: user interacted, return.");
        } else if (this.p == null) {
            kej.a("BootImageCommercialVideoController", "insertCurrentPositionToFeedsData: mPlayService is null");
        } else {
            LinkedSplashData b = com.taobao.bootimage.linked.h.b("").b();
            kej.a("BootImageCommercialVideoController", "insertCurrentPositionToFeedsData: videoCurrentPosition:" + this.p.getCurrentPoistion() + ", videoDuration:" + this.p.getDuration());
            if (b == null || b.getFeedsData() == null || !b.getFeedsData().isVideoResume()) {
                return;
            }
            int currentPoistion = this.p.getCurrentPoistion();
            if (currentPoistion == 0 && !this.p.isPlaying()) {
                currentPoistion = this.p.getDuration();
            }
            b.getFeedsData().setVideoCurrentPosition(currentPoistion);
            kej.a("BootImageCommercialVideoController", "insertCurrentPositionToFeedsData: set video position to feedsData.");
        }
    }

    private void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            return;
        }
        ImageView imageView = this.m;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    private void a(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4dd370", new Object[]{this, succPhenixEvent});
            return;
        }
        kej.a("BootImageCommercialVideoController", "show video: load image success");
        if (!this.e) {
            kej.a("BootImageCommercialVideoController", "show video: load image fail，showed is false");
            return;
        }
        a(succPhenixEvent.getDrawable());
        if (!TextUtils.isEmpty(this.h.videoLocalPath)) {
            if (!e() || !f()) {
                b(this.h);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("playService failed to start. videoPath is empty:");
            sb.append(TextUtils.isEmpty(this.h.videoLocalPath));
            sb.append(" mPlayerView == null :");
            sb.append(this.n == null);
            sb.append(" mPlayService == null :");
            if (this.p != null) {
                z = false;
            }
            sb.append(z);
            kej.a("BootImageCommercialVideoController", sb.toString());
            if (this.f != null) {
                this.f.sendEmptyMessage(106);
            }
        }
        if (this.d == null) {
            return;
        }
        this.d.a();
    }

    private void a(TextView textView, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692fed9a", new Object[]{this, textView, bootImageInfo});
        } else if (textView == null || bootImageInfo == null || TextUtils.isEmpty(bootImageInfo.closeTxt)) {
        } else {
            textView.setText(bootImageInfo.closeTxt);
        }
    }
}
