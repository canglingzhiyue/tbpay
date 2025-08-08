package com.taobao.mediaplay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.CountDownTimer;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.playercontrol.ProgressImageView;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import tb.dde;
import tb.kge;
import tb.mjy;
import tb.mkb;
import tb.oyu;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;

/* loaded from: classes7.dex */
public class e implements b, c, com.taobao.mediaplay.player.e, com.taobao.mediaplay.player.h, com.taobao.mediaplay.playercontrol.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private MediaContext f18013a;
    private FrameLayout b;
    private j c;
    private com.taobao.mediaplay.playercontrol.d d;
    private boolean e;
    private ArrayList<b> g;
    private g h;
    private BroadcastReceiver i;
    private boolean j;
    private int k;
    private boolean l;
    private mjy m;
    private ProgressImageView p;
    private boolean q;
    private boolean r;
    private boolean s;
    private float x;
    private float y;
    private MediaLifecycleType f = MediaLifecycleType.DEFAULT;
    private boolean n = false;
    private boolean o = false;
    private volatile boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;

    static {
        kge.a(482069686);
        kge.a(763125200);
        kge.a(-613305621);
        kge.a(-41757031);
        kge.a(793014661);
        kge.a(-1602626051);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ boolean a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("54db5320", new Object[]{eVar})).booleanValue() : eVar.r;
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("468fc33c", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.u = z;
        return z;
    }

    public static /* synthetic */ boolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e2b37a1", new Object[]{eVar})).booleanValue() : eVar.u;
    }

    public static /* synthetic */ MediaContext c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaContext) ipChange.ipc$dispatch("8e2b7f1a", new Object[]{eVar}) : eVar.f18013a;
    }

    public static /* synthetic */ boolean d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d0cb00a3", new Object[]{eVar})).booleanValue() : eVar.e;
    }

    public static /* synthetic */ boolean e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa1ae524", new Object[]{eVar})).booleanValue() : eVar.E();
    }

    public static /* synthetic */ com.taobao.mediaplay.playercontrol.d f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mediaplay.playercontrol.d) ipChange.ipc$dispatch("7a33413d", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ MediaLifecycleType g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaLifecycleType) ipChange.ipc$dispatch("57bf9529", new Object[]{eVar}) : eVar.f;
    }

    public static /* synthetic */ boolean h(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("760a92a7", new Object[]{eVar})).booleanValue() : eVar.n;
    }

    public static /* synthetic */ boolean i(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f5a7728", new Object[]{eVar})).booleanValue() : eVar.o;
    }

    public static /* synthetic */ boolean j(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8aa5ba9", new Object[]{eVar})).booleanValue() : eVar.t;
    }

    public e(MediaContext mediaContext) {
        this.q = false;
        this.r = false;
        this.s = false;
        this.f18013a = mediaContext;
        MediaContext mediaContext2 = this.f18013a;
        if (mediaContext2 != null && mediaContext2.getControlParams() != null) {
            this.q = com.taobao.taobaoavsdk.util.b.a(this.f18013a.getControlParams().get("needLoadingUI"));
            this.r = com.taobao.taobaoavsdk.util.b.a(this.f18013a.getControlParams().get("retryAfterNetError"));
            if (this.f18013a.mMediaPlayContext != null) {
                this.s = "LiveRoom".equals(this.f18013a.mMediaPlayContext.getFrom());
            }
        }
        this.g = new ArrayList<>();
        this.b = new FrameLayout(mediaContext.getContext());
        if (this.f18013a.mMediaPlayContext.mEmbed) {
            this.b.setBackgroundColor(-16777216);
        }
        if (oyu.k() >= 0) {
            this.b.setBackgroundColor(-16711936);
        }
        this.c = new j(mediaContext);
        this.f18013a.setVideo(this.c);
        A();
        this.b.addView(this.c.m(), 0, new FrameLayout.LayoutParams(-2, -2, 17));
        this.c.a((com.taobao.mediaplay.player.e) this);
        this.c.a((com.taobao.mediaplay.player.h) this);
        this.h = new g(this.f18013a.mMediaPlayContext);
        this.j = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "useMediaInfoParamsPlay", "true"));
        if (!StringUtils.isEmpty(this.f18013a.mMediaPlayContext.getVideoUrl()) || !StringUtils.isEmpty(this.f18013a.mMediaPlayContext.mVideoId) || this.f18013a.mMediaPlayContext.mMediaLiveInfo != null || (this.f18013a.mMediaPlayContext.getMediaInfoParams() != null && this.j)) {
            this.h.a(this);
        }
        this.k = com.taobao.taobaoavsdk.util.b.b(OrangeConfig.getInstance().getConfig("DWInteractive", "updateMediaInfoParamByVideoId1", "2"));
        this.l = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "returnErrorWhenMediaRetryWithoutFlvUrl", "true"));
        a((b) this);
        if (this.f18013a.isNeedPlayControlView() || !this.f18013a.isHideControllder()) {
            a(false);
        }
        if (!this.f18013a.mMediaPlayContext.mTBLive) {
            F();
        }
        if (this.q) {
            this.p = new ProgressImageView(mediaContext.getContext(), null);
            this.p.setVisibility(8);
            this.b.addView(this.p, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else {
            ((com.taobao.mediaplay.player.k) this.c.o()).a(new a());
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d9f5ff", new Object[]{this, bVar});
        } else if (this.g.contains(bVar)) {
        } else {
            this.g.add(bVar);
        }
    }

    @Override // com.taobao.mediaplay.b
    public void onLifecycleChanged(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0fa27", new Object[]{this, mediaLifecycleType});
        } else if (mediaLifecycleType == this.f) {
        } else {
            if (mediaLifecycleType == MediaLifecycleType.PLAY) {
                D();
            }
            this.f = mediaLifecycleType;
        }
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        try {
            if (this.i == null) {
                return;
            }
            this.f18013a.getContext().unregisterReceiver(this.i);
            this.i = null;
        } catch (Exception unused) {
        }
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            this.i = new BroadcastReceiver() { // from class: com.taobao.mediaplay.MediaController$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Context applicationContext;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (!intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || (applicationContext = context.getApplicationContext()) == null) {
                    } else {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
                        int type = activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
                        if (type != oyu.b) {
                            com.taobao.taobaoavsdk.util.f.f();
                        }
                        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                            if (!e.a(e.this)) {
                                return;
                            }
                            e.a(e.this, true);
                            return;
                        }
                        if (type == 0 && e.c(e.this).mbShowNoWifiToast && type != oyu.b) {
                            Toast.makeText(e.c(e.this).getContext(), e.c(e.this).getContext().getResources().getString(R.string.avsdk_mobile_network_hint), 0).show();
                        }
                        if (e.b(e.this) && e.a(e.this) && e.d(e.this)) {
                            e.this.t();
                            e.a(e.this, false);
                        }
                        oyu.b = type;
                    }
                }
            };
        }
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.i == null) {
            C();
        } else {
            try {
                this.f18013a.getContext().unregisterReceiver(this.i);
            } catch (Exception unused) {
            }
        }
        try {
            this.f18013a.getContext().registerReceiver(this.i, intentFilter);
        } catch (Exception unused2) {
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.d != null) {
        } else {
            this.d = new com.taobao.mediaplay.playercontrol.d(this.f18013a, z);
            this.b.addView(this.d.l(), new FrameLayout.LayoutParams(-1, -1, 17));
            a(this.d);
            this.d.a(this);
            F();
        }
    }

    private boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue();
        }
        mjy mjyVar = this.m;
        return (mjyVar == null || !mjyVar.a()) && this.d != null;
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else if (!E()) {
        } else {
            this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mediaplay.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!e.e(e.this)) {
                    } else {
                        if (!e.f(e.this).k()) {
                            e.f(e.this).d();
                        } else if (e.f(e.this) == null) {
                        } else {
                            e.f(e.this).j();
                        }
                    }
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.h();
        }
    }

    @Override // com.taobao.mediaplay.playercontrol.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // com.taobao.mediaplay.playercontrol.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.c.o() == null || this.c.o().d() == 6 || this.c.o().d() == 3 || this.c.o().d() == 0 || this.c.o().d() == 8) {
            this.f18013a.mMediaPlayContext.mSeekWhenPrepared = i;
        } else {
            this.c.o().c(i);
            this.f18013a.mMediaPlayContext.mSeekWhenPrepared = 0;
        }
    }

    public void a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else if (this.c.o() == null || this.c.o().d() == 6 || this.c.o().d() == 3 || this.c.o().d() == 0 || this.c.o().d() == 8) {
            this.f18013a.mMediaPlayContext.mSeekWhenPrepared = i;
            this.f18013a.mMediaPlayContext.mSeekIgnorePauseStateWhenPrepared = true;
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView seekTo");
            this.c.o().a(i, z, z2);
            this.f18013a.mMediaPlayContext.mSeekWhenPrepared = 0;
        }
    }

    private boolean b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f78e0d", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!com.taobao.taobaoavsdk.util.b.a(i, OrangeConfig.getInstance().getConfig("DWInteractive", "vvcRetryErrorLists", "[13001]"))) {
            return false;
        }
        String videoUrl = this.f18013a.mMediaPlayContext.getVideoUrl();
        if (StringUtils.isEmpty(videoUrl)) {
            return false;
        }
        this.h.q();
        this.h.a(this);
        String videoUrl2 = this.f18013a.mMediaPlayContext.getVideoUrl();
        if (StringUtils.isEmpty(videoUrl2) || videoUrl2.equals(videoUrl)) {
            return false;
        }
        this.f18013a.mMediaPlayContext.unselectS266OfPlay();
        this.f18013a.mMediaPlayContext.setDegradeCode(i, this.f18013a.mMediaPlayContext.mSelectedUrlName);
        this.c.d(this.f18013a.mMediaPlayContext.getVideoUrl());
        return true;
    }

    private boolean c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5ddc94e", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.f18013a.mEnableNewTBPlayer && !this.s) {
            return false;
        }
        if (this.f18013a.mEnableNewTBPlayer && this.s && this.v && !this.e && !this.w) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "retry current url when warmuped instance get network error.");
            t();
            this.w = true;
            return true;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Enter onMediaRetryForRtcDegrade" + i);
        if (!MediaConstant.RTCLIVE_URL_NAME.equals(this.f18013a.mMediaPlayContext.mSelectedUrlName) && !MediaConstant.H266_ARTP.equals(this.f18013a.mMediaPlayContext.mSelectedUrlName)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Not retry By NotRtcUrl");
            return false;
        }
        String str = this.f18013a.mMediaPlayContext.mSelectedUrlName;
        String videoUrl = this.f18013a.mMediaPlayContext.getVideoUrl();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onMediaRetryForRtcDegrade old url is " + videoUrl);
        oyu.d(this.f18013a.mMediaPlayContext.mContext);
        if (!com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "EnableRtcAutoDegrade1", "false")) && !oyu.aJ && (!this.f18013a.mEnableNewTBPlayer || !this.s)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Not retry by DisableRtcAutoDegrade");
            return false;
        }
        if (oyu.aO || oyu.aS) {
            if (this.f18013a.mMediaPlayContext.getDegradeCode() != 0) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Not retry by has degraded once ");
                return false;
            }
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "ENABLE_RTC_DEGRADE_FROM is " + oyu.aR + ",getFrom is " + this.f18013a.mMediaPlayContext.getFrom());
            if (!oyu.aR.contains(this.f18013a.mMediaPlayContext.getFrom())) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Not retry by getFrom not support ");
                return false;
            }
        }
        boolean contains = videoUrl.contains("transcode");
        if (!oyu.aS) {
            if (contains) {
                String config = OrangeConfig.getInstance().getConfig("DWInteractive", "EnableRtcAudioDegradeWhiteList", "");
                String str2 = oyu.aM;
                if (com.taobao.taobaoavsdk.util.b.a(i, config) || com.taobao.taobaoavsdk.util.b.a(i, str2)) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "isInWhiteList " + config + " , " + str2);
                    this.f18013a.mMediaPlayContext.setUseTransCodeRtcLive(false);
                    this.h.a(this);
                    String videoUrl2 = this.f18013a.mMediaPlayContext.getVideoUrl();
                    if (!videoUrl2.isEmpty() && !videoUrl2.equals(videoUrl) && !videoUrl2.contains(".flv") && !com.taobao.taobaoavsdk.util.b.b("transcode", videoUrl2)) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Retry newUrl is " + videoUrl2);
                        this.f18013a.mMediaPlayContext.setDegradeCode(i, str);
                        onMediaInfo(null, 12140L, 0L, 0L, null);
                        this.c.d(videoUrl2);
                        this.f18013a.mMediaPlayContext.setUseTransCodeRtcLive(true);
                        this.c.b(i, str);
                        return true;
                    } else if (oyu.aO) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "FORCE_DEGRADE_RTC Retry oldUrl is " + videoUrl);
                        this.f18013a.mMediaPlayContext.setDegradeCode(i, str);
                        this.c.d(videoUrl);
                        this.f18013a.mMediaPlayContext.setUseTransCodeRtcLive(true);
                        this.c.b(i, str);
                        return true;
                    }
                } else if (oyu.aO) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "FORCE_DEGRADE_RTC Retry oldUrl is " + videoUrl);
                    this.f18013a.mMediaPlayContext.setDegradeCode(i, str);
                    this.c.d(videoUrl);
                    this.f18013a.mMediaPlayContext.setUseTransCodeRtcLive(true);
                    this.c.b(i, str);
                    return true;
                }
            } else if (oyu.aO) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "FORCE_DEGRADE_RTC Retry oldUrl is " + videoUrl);
                this.f18013a.mMediaPlayContext.setDegradeCode(i, str);
                this.c.d(videoUrl);
                this.f18013a.mMediaPlayContext.setUseTransCodeRtcLive(true);
                this.c.b(i, str);
                return true;
            }
        }
        if (oyu.aO) {
            return false;
        }
        String config2 = OrangeConfig.getInstance().getConfig("DWInteractive", "DisableRtcAudioDegradeBlackList", "");
        String str3 = oyu.aN;
        if ((com.taobao.taobaoavsdk.util.b.a(i, config2) || com.taobao.taobaoavsdk.util.b.a(i, str3)) && !oyu.aS) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Not retry by in blackList");
            return false;
        }
        this.f18013a.mMediaPlayContext.setUseRtcLive(false);
        this.h.a(this);
        String videoUrl3 = this.f18013a.mMediaPlayContext.getVideoUrl();
        if (!videoUrl3.isEmpty() && videoUrl3.contains(".flv") && videoUrl3.contains("http")) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Retry newUrl is " + videoUrl3);
            this.f18013a.mMediaPlayContext.setDegradeCode(i, str);
            int i3 = 11;
            this.f18013a.mMediaPlayContext.mSelectFlvUrlReason = contains ? 11 : 10;
            onMediaInfo(null, 12150L, 0L, 0L, null);
            this.c.d(videoUrl3);
            this.c.b(i, str);
            j jVar = this.c;
            if (!contains) {
                i3 = 10;
            }
            jVar.a(i3);
            return true;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Retry Failed newUrl is " + videoUrl3);
        return false;
    }

    @Override // com.taobao.mediaplay.player.h
    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if ((MediaConstant.RTCLIVE_URL_NAME.equals(this.f18013a.mMediaPlayContext.mSelectedUrlName) || MediaConstant.H266_ARTP.equals(this.f18013a.mMediaPlayContext.mSelectedUrlName)) && c(i, i2)) {
            return true;
        }
        String videoDefinition = this.f18013a.mMediaPlayContext.getVideoDefinition();
        return !StringUtils.isEmpty(videoDefinition) && videoDefinition.contains("266") && b(i, i2);
    }

    @Override // com.taobao.mediaplay.player.h
    public boolean dU_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404b4f99", new Object[]{this})).booleanValue();
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableTestReselect", "false"))) {
            this.f18013a.mMediaPlayContext.setUseRtcLive(false);
        }
        this.h.a(this);
        String videoUrl = this.f18013a.mMediaPlayContext.getVideoUrl();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Reselect newUrl is " + videoUrl);
        return false;
    }

    public void a(mjy mjyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a2e6dc", new Object[]{this, mjyVar});
        } else {
            this.m = mjyVar;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.f18013a.mMediaPlayContext.mTBLive || this.f18013a.mMediaPlayContext.mMediaLiveInfo == null) {
        } else {
            this.h.a(this);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.f18013a.mMediaPlayContext.mTBLive) {
        } else {
            this.h.a(this);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.k == 0) {
        } else {
            if (this.f18013a.mMediaPlayContext.mMediaLiveInfo != null && this.k != 2) {
                return;
            }
            if ((this.f18013a.mMediaPlayContext.getMediaInfoParams() != null && this.j) || StringUtils.isEmpty(this.f18013a.mMediaPlayContext.mVideoId) || this.f18013a.mMediaPlayContext.mTBLive) {
                return;
            }
            j jVar = this.c;
            if (jVar != null) {
                jVar.t();
            }
            this.h.a(this);
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        com.taobao.mediaplay.playercontrol.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.a(view);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.g();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.d dVar = this.d;
        if (dVar != null) {
            dVar.e();
        } else {
            a(true);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.f();
    }

    public Bitmap j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("30430bcf", new Object[]{this});
        }
        j jVar = this.c;
        if (jVar != null) {
            return jVar.n();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "yezo:getCurrentFrame with mMediaPlayViewController == null");
        return null;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!this.f18013a.mMediaPlayContext.mTBLive || this.f18013a.mMediaPlayContext.mMediaLiveInfo == null) {
        } else {
            this.h.a(i, this);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.c();
    }

    public void a(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9d8762", new Object[]{this, onVideoClickListener});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.a(onVideoClickListener);
    }

    public void b(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80b83c1", new Object[]{this, onVideoClickListener});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.b(onVideoClickListener);
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        j jVar = this.c;
        if (jVar == null) {
            return false;
        }
        return jVar.j();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        j jVar = this.c;
        if (jVar == null) {
            return false;
        }
        return jVar.k();
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        j jVar = this.c;
        if (jVar != null && jVar.o() != null) {
            return this.c.o().j();
        }
        return 0;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        j jVar = this.c;
        return (jVar == null || jVar.o() == null) ? "" : this.c.o().a();
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        j jVar = this.c;
        if (jVar != null && jVar.o() != null) {
            return this.c.o().i();
        }
        return 0;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue();
        }
        j jVar = this.c;
        if (jVar != null && jVar.o() != null) {
            return this.c.o().d();
        }
        return 0;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.c(z);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.l();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.a(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.b(str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.c(str);
    }

    public void a(TaoLiveVideoView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a320bc1a", new Object[]{this, dVar});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.a(dVar);
    }

    /* loaded from: classes7.dex */
    public class a implements com.taobao.mediaplay.player.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1254232427);
            kge.a(-1195674335);
        }

        private a() {
            e.this = r1;
        }

        @Override // com.taobao.mediaplay.player.i
        public void a(com.taobao.mediaplay.player.k kVar, boolean z) {
            IpChange ipChange = $ipChange;
            boolean z2 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bb98d22", new Object[]{this, kVar, new Boolean(z)});
            } else if (e.g(e.this) == MediaLifecycleType.PLAY) {
            } else {
                if (z) {
                    if (kVar.d() == 1 && (e.d(e.this) || Build.VERSION.SDK_INT < 17)) {
                        e.this.a(MediaLifecycleType.PLAY);
                    } else if (StringUtils.isEmpty(e.c(e.this).getVideoToken()) || kVar.d() != 1) {
                        z2 = false;
                    } else {
                        e.this.a(MediaLifecycleType.PLAY);
                    }
                    if (z2 && kVar != null) {
                        kVar.a((IMediaPlayer) null, 12100L, 0L, 0L, (Object) null);
                    }
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "ProcessSurfaceTextureEvent finish");
                    return;
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "ProcessSurfaceTextureEvent not update because mIsReadyToHideCover is false.");
            }
        }
    }

    public final void a(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1858af", new Object[]{this, mediaLifecycleType});
            return;
        }
        b(mediaLifecycleType);
        if (!G()) {
            return;
        }
        if (mediaLifecycleType == MediaLifecycleType.BEFORE) {
            f(true);
        } else if (mediaLifecycleType != MediaLifecycleType.PLAY) {
        } else {
            f(false);
        }
    }

    private void b(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78fe64e", new Object[]{this, mediaLifecycleType});
            return;
        }
        Iterator<b> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleChanged(mediaLifecycleType);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.mediaplay.e$2] */
    @Override // com.taobao.mediaplay.player.e
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.d dVar = this.d;
        if (dVar != null) {
            dVar.h();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "create the loadingui CountDownTimer at onMediaStart in MediaController");
        new CountDownTimer(oyu.bG, 100L) { // from class: com.taobao.mediaplay.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                } else if (!e.h(e.this)) {
                } else {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get the mIsFirstFrameUpdate tag, cancel the counter");
                    cancel();
                }
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.mediaplay.e$2$1] */
            @Override // android.os.CountDownTimer
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                    return;
                }
                e.this.f(true);
                new CountDownTimer(oyu.bH - oyu.bG, 100L) { // from class: com.taobao.mediaplay.e.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        AnonymousClass2.this = this;
                    }

                    @Override // android.os.CountDownTimer
                    public void onTick(long j) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                        } else if (!e.h(e.this)) {
                        } else {
                            e.this.f(false);
                            cancel();
                        }
                    }

                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("badeed9", new Object[]{this});
                        } else if (!e.i(e.this)) {
                        } else {
                            e.this.f(false);
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "newTBPlayer in Poor Net Quality > 8s, close the loadingView.");
                        }
                    }
                }.start();
            }
        }.start();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.mediaplay.playercontrol.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.i();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.h();
    }

    /* JADX WARN: Type inference failed for: r5v21, types: [com.taobao.mediaplay.e$3] */
    @Override // com.taobao.mediaplay.player.e
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        } else if (3 == j && (obj instanceof Map)) {
            this.e = true;
        } else if (j == 12101) {
            this.n = true;
            if (!this.q || this.p == null || !G()) {
                return;
            }
            f(false);
        } else if (this.e && (j == 701 || j == 741)) {
            this.t = true;
            if (!this.q || this.p == null || G()) {
                return;
            }
            new CountDownTimer(oyu.bI, 100L) { // from class: com.taobao.mediaplay.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j4)});
                    } else if (e.j(e.this)) {
                    } else {
                        cancel();
                    }
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                    } else if (!e.j(e.this)) {
                    } else {
                        e.this.f(true);
                    }
                }
            }.start();
        } else if (j == 702 || j == 742) {
            if (!this.q || this.p == null) {
                return;
            }
            f(false);
            this.t = false;
        } else if (j != 302 || !this.f18013a.mEnableNewTBPlayer || a() == null || j2 <= j3 || H()) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "lee +++ video size update: w=" + j2 + ", h=" + j3 + ", TranslationY=" + this.y);
            a().setTranslationY(this.y);
        }
    }

    public Map<String, String> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("160f882f", new Object[]{this});
        }
        j jVar = this.c;
        if (jVar == null) {
            return null;
        }
        return jVar.i();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.i();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.i();
    }

    @Override // com.taobao.mediaplay.c
    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.f18013a.addPlayExpUtParams(this.h.e());
        this.c.d(this.f18013a.mMediaPlayContext.getVideoUrl());
    }

    public void a(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d69515", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        j jVar = this.c;
        if (jVar != null) {
            jVar.a(mediaLiveWarmupConfig);
        }
        this.v = true;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            this.c.a();
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            this.c.p();
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        this.f = MediaLifecycleType.BEFORE;
        B();
        this.c.r();
        com.taobao.mediaplay.playercontrol.d dVar = this.d;
        if (dVar != null) {
            dVar.m();
            this.d = null;
        }
        MediaContext mediaContext = this.f18013a;
        if (mediaContext != null && mediaContext.mMediaPlayContext != null) {
            this.f18013a.mMediaPlayContext.setUseMiniBfrtc(false);
        }
        g gVar = this.h;
        if (gVar == null) {
            return;
        }
        gVar.s();
    }

    public boolean a(mkb mkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4a689d8", new Object[]{this, mkbVar})).booleanValue();
        }
        j jVar = this.c;
        if (jVar != null) {
            return jVar.a(mkbVar);
        }
        return false;
    }

    public boolean b(mkb mkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3299059", new Object[]{this, mkbVar})).booleanValue();
        }
        j jVar = this.c;
        if (jVar != null) {
            return jVar.b(mkbVar);
        }
        return false;
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.a(ddeVar);
    }

    public void a(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701a40a2", new Object[]{this, innerStartFuncListener});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.a(innerStartFuncListener);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (this.f18013a.mMediaPlayContext == null) {
        } else {
            this.f18013a.mMediaPlayContext.setRequestHeader(map);
        }
    }

    public boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        j jVar = this.c;
        if (jVar == null) {
            return false;
        }
        return jVar.e(z);
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.s();
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (this.c == null) {
        } else {
            if (!oyu.a(this.f18013a.getContext()) && !StringUtils.isEmpty(this.f18013a.mMediaPlayContext.mSeamlessSwitchingSelectName)) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SwitchStream seamlessSwitchStream return when mSeamlessSwitchingSelectName is not null");
                return;
            }
            this.c.d(z);
            this.f18013a.mMediaPlayContext.setUseMiniBfrtc(false);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.e(str);
    }

    public void a(boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2709489d", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.a(z, i, z2);
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.a(i, str);
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.f(z);
    }

    public void a(com.taobao.mediaplay.player.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbb2f93", new Object[]{this, jVar});
            return;
        }
        j jVar2 = this.c;
        if (jVar2 == null) {
            return;
        }
        jVar2.a(jVar);
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.u();
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.v();
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.a(map);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.a(context);
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.b(f);
    }

    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3061ebf", new Object[]{this});
        }
        j jVar = this.c;
        if (jVar == null) {
            return null;
        }
        return jVar.w();
    }

    public void a(com.taobao.mediaplay.player.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb95e17", new Object[]{this, fVar});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.a(fVar);
    }

    public void b(com.taobao.mediaplay.player.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff89676", new Object[]{this, fVar});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.b(fVar);
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        ProgressImageView progressImageView = this.p;
        if (progressImageView == null || !this.q) {
            return;
        }
        if (z) {
            progressImageView.setVisibility(0);
            FrameLayout frameLayout = this.b;
            if (frameLayout == null) {
                return;
            }
            frameLayout.bringToFront();
            return;
        }
        progressImageView.setVisibility(8);
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue();
        }
        ProgressImageView progressImageView = this.p;
        return progressImageView != null && this.q && progressImageView.getVisibility() == 0;
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.x += f;
        this.y += f2;
    }

    private boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        DisplayMetrics displayMetrics = this.f18013a.getContext().getResources().getDisplayMetrics();
        float f = displayMetrics.xdpi;
        double d = displayMetrics.widthPixels / f;
        double d2 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return Math.sqrt((d * d) + (d2 * d2)) >= 7.0d;
    }
}
