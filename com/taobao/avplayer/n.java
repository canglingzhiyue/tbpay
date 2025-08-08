package com.taobao.avplayer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.InterfaceUsageCounter;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.dde;
import tb.ddg;
import tb.kbv;
import tb.kbw;
import tb.kbx;
import tb.kck;
import tb.kcl;
import tb.kge;
import tb.obw;
import tb.sku;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes6.dex */
public class n implements aw, com.taobao.avplayer.common.q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String b;
    private static boolean p;

    /* renamed from: a */
    public DWContext f16536a;
    private FrameLayout c;
    private o d;
    private x e;
    private av f;
    private aw g;
    private DWLifecycleType h;
    private boolean i;
    private boolean j;
    private dde k;
    private az l;
    private com.taobao.avplayer.music.a m;
    private a n;
    private an o;
    private int q;
    private com.taobao.avplayer.common.z r;
    private com.taobao.avplayer.common.z s;
    private boolean t;
    private kbx u;
    private kbv v;
    private kbw w;
    private com.taobao.mediaplay.player.e x;

    /* renamed from: com.taobao.avplayer.n$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16537a = new int[DWInstanceType.values().length];

        static {
            try {
                f16537a[DWInstanceType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16537a[DWInstanceType.PIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class c {
        public Map<String, String> A;
        public boolean C;
        public ar D;
        public DWLifecycleType E;
        public String K;
        public String L;
        public String M;
        public boolean O;
        public boolean P;
        public ddg Q;
        public boolean R;
        public boolean S;
        public DWAspectRatio U;
        public Surface V;

        /* renamed from: a */
        public String f16540a;
        public JSONObject ab;
        public String ae;
        public boolean af;
        public boolean ag;
        public Bitmap ai;
        public boolean aj;
        public String ak;
        public String al;
        public boolean an;
        public Map<String, String> ao;
        public Activity b;
        public Context c;
        public String d;
        public String f;
        public String g;
        public String h;
        public String i;
        public String k;
        public boolean l;
        public kbv m;
        public int o;
        public int p;
        public String q;
        public com.taobao.avplayer.common.p r;
        public com.taobao.avplayer.common.v s;
        public as t;
        public ap u;
        public com.taobao.avplayer.common.d v;
        public com.taobao.avplayer.common.ad w;
        public com.taobao.avplayer.common.af y;
        public Map<String, String> z;
        public long e = -1;
        public int j = 0;
        public int n = 0;
        public boolean B = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
        public boolean F = true;
        public boolean G = true;
        public boolean H = false;
        public DWVideoScreenType I = DWVideoScreenType.NORMAL;
        public boolean J = false;
        public DWInstanceType W = DWInstanceType.VIDEO;
        public boolean Y = true;
        public boolean Z = false;
        public boolean am = false;
        public boolean aa = false;
        public float ac = -1.0f;
        public Map<String, String> ad = null;
        public HashMap<String, String> ah = new HashMap<>();
        public boolean x = false;
        public boolean T = true;

        static {
            kge.a(-391722099);
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15646d2", new Object[]{this, cVar});
        }
    }

    public static /* synthetic */ void a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a932e31", new Object[]{nVar});
        } else {
            nVar.z();
        }
    }

    public static /* synthetic */ void a(n nVar, int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5270f2", new Object[]{nVar, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            nVar.a(i, z, z2);
        }
    }

    public static /* synthetic */ void b(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b643590", new Object[]{nVar});
        } else {
            nVar.y();
        }
    }

    public static /* synthetic */ void c(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c353cef", new Object[]{nVar});
        } else {
            nVar.A();
        }
    }

    public static /* synthetic */ void d(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06444e", new Object[]{nVar});
        } else {
            nVar.B();
        }
    }

    public static /* synthetic */ an e(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (an) ipChange.ipc$dispatch("10d9225", new Object[]{nVar}) : nVar.o;
    }

    public static /* synthetic */ FrameLayout f(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("83002e4d", new Object[]{nVar}) : nVar.c;
    }

    public static /* synthetic */ void g(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df795a6b", new Object[]{nVar});
        } else {
            nVar.w();
        }
    }

    static {
        kge.a(1719897778);
        kge.a(-123403623);
        kge.a(556437024);
        b = "DWHighPerformaceInstance";
        p = true;
    }

    public n(c cVar) {
        this.q = 1;
        this.f16536a = new DWContext(cVar.b, true);
        this.f16536a.mApplicationontext = cVar.c;
        this.f16536a.mUsingInterface = cVar.ae;
        this.f16536a.mPlayContext = new MediaPlayControlContext(cVar.b);
        this.f16536a.mPlayContext.mTBVideoSourceAdapter = new ag(this.f16536a);
        this.f16536a.mPlayContext.mConfigGroup = "DWInteractive";
        this.f16536a.mPlayContext.setVideoUrl(cVar.d);
        if (!StringUtils.isEmpty(cVar.ak)) {
            this.f16536a.mPlayContext.setCacheKey(cVar.ak);
        }
        if (!StringUtils.isEmpty(cVar.al)) {
            try {
                this.f16536a.mPlayContext.setVideoLength(Integer.parseInt(cVar.al));
            } catch (NumberFormatException unused) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livephoto:params.mVideoBytes is not integer");
            }
        }
        this.f16536a.setNeedAD(false);
        this.f16536a.mPlayContext.mHighPerformancePlayer = true;
        this.f16536a.mContentId = cVar.K;
        this.f16536a.mCid = cVar.L;
        this.f16536a.mPlayContext.mLocalVideo = cVar.C;
        this.f16536a.setVideoAspectRatio(cVar.U);
        this.f16536a.setNeedCloseUT(cVar.F);
        this.f16536a.setNeedFirstPlayUT(cVar.G);
        this.f16536a.setUserInfoAdapter(cVar.y);
        this.f16536a.mUserId = cVar.e;
        this.f16536a.mWidth = cVar.o;
        this.f16536a.mHeight = cVar.p;
        DWContext dWContext = this.f16536a;
        dWContext.mNormalWidth = dWContext.mWidth;
        DWContext dWContext2 = this.f16536a;
        dWContext2.mNormalHeight = dWContext2.mHeight;
        this.f16536a.mDWImageAdapter = cVar.r;
        this.f16536a.mNetworkAdapter = cVar.s;
        this.f16536a.mUTAdapter = cVar.t;
        this.f16536a.mConfigAdapter = cVar.u;
        this.f16536a.mConfigParamsAdapter = cVar.v;
        this.f16536a.mNetworkFlowAdapter = cVar.D;
        this.f16536a.mDWAlarmAdapter = cVar.w;
        DWContext dWContext3 = this.f16536a;
        MediaPlayControlContext mediaPlayControlContext = dWContext3.mPlayContext;
        String str = cVar.f;
        mediaPlayControlContext.mFrom = str;
        dWContext3.mFrom = str;
        this.f16536a.setPlayScenes(cVar.f16540a);
        DWContext dWContext4 = this.f16536a;
        MediaPlayControlContext mediaPlayControlContext2 = dWContext4.mPlayContext;
        String str2 = cVar.i;
        mediaPlayControlContext2.mVideoId = str2;
        dWContext4.mVideoId = str2;
        this.f16536a.setVideoToken(cVar.M);
        this.f16536a.mPlayContext.setVideoToken(cVar.M);
        DWContext dWContext5 = this.f16536a;
        MediaPlayControlContext mediaPlayControlContext3 = dWContext5.mPlayContext;
        String str3 = cVar.h;
        mediaPlayControlContext3.mVideoSource = str3;
        dWContext5.mVideoSource = str3;
        this.f16536a.mute(cVar.B);
        this.f16536a.setVolume(cVar.ac);
        this.f16536a.mMuteIconDisplay = cVar.P;
        this.f16536a.mNeedVideoCache = cVar.H;
        this.f16536a.mScene = cVar.g;
        this.f16536a.mLoop = cVar.R;
        this.f16536a.mMuteDisplay = cVar.O;
        this.f16536a.mPlayContext.mBackgroundMode = cVar.Y;
        this.f16536a.mBackgroundVideo = cVar.Z;
        this.f16536a.mCanShowPreviousNextButton = cVar.am;
        this.f16536a.mPlayContext.setMediaInfoParams(cVar.ab);
        this.f16536a.mPanoType = cVar.j;
        this.f16536a.mDisableSurfaceView = cVar.an;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " surface:" + cVar.V + ", width=" + this.f16536a.mWidth + ", height=" + this.f16536a.mHeight);
        String str4 = "";
        if (this.f16536a.mPanoType == 0) {
            if ("ERP".equals(cVar.k)) {
                this.f16536a.mPanoType = 1;
            } else if (str4.equals(cVar.k)) {
                this.f16536a.mPanoType = 2;
            }
        }
        this.f16536a.mStartPos = cVar.n;
        this.f16536a.mPlayContext.setRequestHeader(cVar.ad);
        this.f16536a.mAudioOnly = cVar.af;
        this.f16536a.mBackgroundAudio = cVar.ag;
        this.f16536a.mMetaData = cVar.ah;
        this.f16536a.mAlbumArtBitamp = cVar.ai;
        this.f16536a.mUseAudioCache = cVar.aj;
        this.f16536a.mUseShortAudioFocus = cVar.x;
        this.f16536a.mReleaseShortFocusWhenPause = cVar.T;
        if (com.taobao.taobaoavsdk.util.b.b(this.f16536a.mFrom, this.f16536a.mConfigAdapter != null ? this.f16536a.mConfigAdapter.getConfig(str4, "usePicModeBizCodeList", str4) : str4)) {
            cVar.W = DWInstanceType.PIC;
        }
        this.f16536a.setInstanceType(cVar.W);
        this.f16536a.setSourcePageName(cVar.q);
        if (cVar.l && ((this.f16536a.mPanoType == 1 || this.f16536a.mPanoType == 2) && cVar.m != null)) {
            e(cVar);
        } else if (this.f16536a.getActivity() != null) {
            this.c = new FrameLayout(this.f16536a.getActivity()) { // from class: com.taobao.avplayer.DWHighPerformaceInstance$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(DWHighPerformaceInstance$1 dWHighPerformaceInstance$1, String str5, Object... objArr) {
                    switch (str5.hashCode()) {
                        case 348684699:
                            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                            return null;
                        case 650865254:
                            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                            return null;
                        case 949399698:
                            super.onDetachedFromWindow();
                            return null;
                        case 1626033557:
                            super.onAttachedToWindow();
                            return null;
                        default:
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str5));
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                        return;
                    }
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, n.this + " root onAttachedToWindow() " + getWidth() + ", " + getHeight());
                    super.onAttachedToWindow();
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onDetachedFromWindow() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3896b092", new Object[]{this});
                        return;
                    }
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, n.this + " root onDetachedFromWindow() " + getWidth() + ", " + getHeight());
                    super.onDetachedFromWindow();
                }

                @Override // android.view.View
                public void onVisibilityChanged(View view, int i) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
                        return;
                    }
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, n.this + " root onVisibilityChanged() " + getWidth() + ", " + getHeight() + ", " + i);
                    if (i == 0) {
                        Rect rect = new Rect();
                        boolean globalVisibleRect = getGlobalVisibleRect(rect);
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, n.this + " root onVisibilityChanged() getGlobalVisibleRect " + globalVisibleRect + ", " + rect);
                    }
                    super.onVisibilityChanged(view, i);
                }

                @Override // android.widget.FrameLayout, android.view.View
                public void onMeasure(int i, int i2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                        return;
                    }
                    Rect rect = new Rect();
                    boolean globalVisibleRect = getGlobalVisibleRect(rect);
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, n.this + " root onMeasure() getGlobalVisibleRect " + globalVisibleRect + ", " + rect);
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, n.this + " root onMeasure() " + getWidth() + ", " + getHeight() + ", " + i + ", " + i2 + ", getGlobalVisibleRect " + globalVisibleRect + ", " + rect);
                    super.onMeasure(i, i2);
                }
            };
        }
        this.h = cVar.E == null ? DWLifecycleType.BEFORE : cVar.E;
        a(cVar);
        if (this.f16536a.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(this.f16536a.mConfigAdapter.getConfig("DWInteractive", "enExternSurface", "true"))) {
            this.f16536a.setExternSurface(cVar.V);
        }
        this.f16536a.genPlayToken();
        str4 = this.f16536a.mConfigParamsAdapter != null ? this.f16536a.mConfigParamsAdapter.a(this.f16536a.getActivity()) : str4;
        this.f16536a.setInstantSeekingEnable(true);
        this.f16536a.setPlayRateBtnEnable(true);
        DWContext dWContext6 = this.f16536a;
        dWContext6.setRID(str4 + "_" + System.currentTimeMillis());
        if (this.f16536a.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(this.f16536a.mConfigAdapter.getConfig("DWInteractive", "pauseInBackground", "true"))) {
            this.f16536a.setPauseInBackground(cVar.aa);
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "pauseBackgroundAudio", "true")) && (!p || (this.f16536a.mAudioOnly && this.f16536a.mBackgroundAudio))) {
            DWContext dWContext7 = this.f16536a;
            dWContext7.mNeedRequestAudio = false;
            if (dWContext7.mApplicationontext == null) {
                DWContext dWContext8 = this.f16536a;
                dWContext8.mApplicationontext = dWContext8.getActivity().getApplicationContext();
            }
            this.m = com.taobao.avplayer.music.a.a(this.f16536a.mApplicationontext);
            e(false);
            this.n = new a(this);
            this.m.a(this, this.n);
        }
        this.q = com.taobao.taobaoavsdk.util.b.b(OrangeConfig.getInstance().getConfig("DWInteractive", "fixTypeSetVideoUrl", "1"));
        b(cVar);
    }

    /* loaded from: classes6.dex */
    public class a implements com.taobao.avplayer.music.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public n f16538a;

        static {
            kge.a(1238211270);
            kge.a(306463615);
        }

        public a(n nVar) {
            n.this = r1;
            this.f16538a = nVar;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "BackgroundMusicPlayer mOuterInstance=" + this.f16538a);
        }

        @Override // com.taobao.avplayer.music.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "BackgroundMusicPlayer play");
            n.a(this.f16538a);
        }

        @Override // com.taobao.avplayer.music.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "BackgroundMusicPlayer start");
            n.b(this.f16538a);
        }

        @Override // com.taobao.avplayer.music.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "BackgroundMusicPlayer pause");
            n.c(this.f16538a);
        }

        @Override // com.taobao.avplayer.music.b
        public void a(int i, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "BackgroundMusicPlayer seekTo");
            n.a(this.f16538a, i, z, z2);
        }

        @Override // com.taobao.avplayer.music.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "BackgroundMusicPlayer close");
            n.d(this.f16538a);
        }

        @Override // com.taobao.avplayer.music.b
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "BackgroundMusicPlayer skipToNext");
            if (n.e(this.f16538a) == null) {
                return;
            }
            n.e(this.f16538a).c();
        }

        @Override // com.taobao.avplayer.music.b
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "BackgroundMusicPlayer skipToPrevious");
            if (n.e(this.f16538a) == null) {
                return;
            }
            n.e(this.f16538a).d();
        }

        @Override // com.taobao.avplayer.music.b
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "BackgroundMusicPlayer notificationClick");
            if (n.e(this.f16538a) == null) {
                return;
            }
            n.e(this.f16538a).a();
        }

        @Override // com.taobao.avplayer.music.b
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "BackgroundMusicPlayer notificationClose");
            if (n.e(this.f16538a) == null) {
                return;
            }
            n.e(this.f16538a).b();
        }

        @Override // com.taobao.avplayer.music.b
        public DWContext i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("72cfd34b", new Object[]{this}) : n.this.f16536a;
        }
    }

    public void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e202f271", new Object[]{this, cVar});
            return;
        }
        this.i = true;
        if (!C()) {
            if (kck.a()) {
                StringBuilder sb = new StringBuilder(20);
                if (this.f16536a.getUTParams() != null) {
                    for (Map.Entry<String, String> entry : this.f16536a.getUTParams().entrySet()) {
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(entry.getValue());
                        sb.append(";");
                    }
                }
                DWContext dWContext = this.f16536a;
                if (dWContext != null) {
                    ddg ddgVar = dWContext.mTlogAdapter;
                    com.taobao.taobaoavsdk.util.c.c(ddgVar, " please set mBizCode , mVideoSource and  mVideoUrl parameters" + ((Object) sb));
                }
            } else {
                DWContext dWContext2 = this.f16536a;
                if (dWContext2 != null) {
                    ddg ddgVar2 = dWContext2.mTlogAdapter;
                    com.taobao.taobaoavsdk.util.c.c(ddgVar2, "  please set mBizCode , mVideoSource and  mVideoUrl parameters" + this.f16536a.mPlayContext.getVideoUrl());
                }
            }
        }
        d(cVar);
        c(cVar);
        f(cVar);
        int i = AnonymousClass1.f16537a[this.f16536a.getInstanceType().ordinal()];
        if (i == 1) {
            x();
        } else if (i == 2) {
            v();
        }
    }

    public void a(String str) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.i) {
            if ((!this.f16536a.mAudioOnly || !this.f16536a.mBackgroundAudio) && (i = this.q) != 0 && ((i != 1 || StringUtils.isEmpty(str)) && ((this.q != 2 || !this.f16536a.mAudioOnly) && (this.q != 3 || !this.f16536a.mAudioOnly || StringUtils.isEmpty(str))))) {
                z = false;
            }
            if (!z) {
                return;
            }
            this.f16536a.mPlayContext.setVideoUrl(str);
            this.d.a();
        } else {
            this.f16536a.mPlayContext.setVideoUrl(str);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f16536a.mStartPos = i;
        }
    }

    public void a() {
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.i || (oVar = this.d) == null) {
        } else {
            oVar.h();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        DWContext dWContext = this.f16536a;
        if (dWContext != null) {
            dWContext.setLooping(z);
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.b(z);
    }

    public void a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else if (this.d == null || this.f16536a.getVideo() == null) {
        } else {
            this.f16536a.getVideo().a(f, f2, f3);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d == null || this.f16536a.getVideo() == null) {
        } else {
            this.f16536a.getVideo().c();
        }
    }

    public List<com.taobao.taobaoavsdk.f> a(List<com.taobao.taobaoavsdk.e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        if (this.d != null && this.f16536a.getVideo() != null) {
            return this.f16536a.getVideo().a(list);
        }
        return null;
    }

    public void a(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086ecaf", new Object[]{this, dWInstanceType});
        } else if (dWInstanceType == this.f16536a.getInstanceType()) {
        } else {
            String str = "";
            if (this.f16536a.mConfigAdapter != null) {
                str = this.f16536a.mConfigAdapter.getConfig(str, "usePicModeBizCodeList", str);
            }
            if (com.taobao.taobaoavsdk.util.b.b(this.f16536a.mFrom, str)) {
                return;
            }
            if (this.f16536a.getInstanceType() == DWInstanceType.PIC && dWInstanceType == DWInstanceType.VIDEO) {
                this.f16536a.setInstanceType(DWInstanceType.VIDEO);
                x();
            } else if (this.f16536a.getInstanceType() != DWInstanceType.VIDEO || dWInstanceType != DWInstanceType.PIC) {
            } else {
                this.f16536a.setInstanceType(DWInstanceType.PIC);
                if (this.e == null) {
                    v();
                } else {
                    this.d.a(DWLifecycleType.BEFORE);
                }
            }
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.i) {
        } else {
            this.f16536a.mInteractiveId = j;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.i) {
        } else {
            this.f16536a.mFrom = str;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f16536a.setNeedCloseUT(z);
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        DWContext dWContext = this.f16536a;
        dWContext.mWidth = i;
        dWContext.mHeight = i2;
        if (!dWContext.isFloating()) {
            DWContext dWContext2 = this.f16536a;
            dWContext2.mNormalWidth = i;
            dWContext2.mNormalHeight = i2;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setFrame " + i + ", " + i2);
        if (this.d == null || this.c == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f16536a.mWidth, this.f16536a.mHeight);
        if (this.d.c().getParent() == null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setFrame addView, " + i + ", " + i2);
            this.c.addView(this.d.c(), layoutParams);
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setFrame reset, " + i + ", " + i2);
            this.d.c().getLayoutParams().width = this.f16536a.mWidth;
            this.d.c().getLayoutParams().height = this.f16536a.mHeight;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            return;
        }
        frameLayout.post(new Runnable() { // from class: com.taobao.avplayer.DWHighPerformaceInstance$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (n.f(n.this) == null) {
                } else {
                    n.f(n.this).requestLayout();
                }
            }
        });
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else {
            this.f16536a.addUtParams(hashMap);
        }
    }

    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
        } else {
            this.f16536a.addCustomParams(hashMap);
        }
    }

    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6eda09", new Object[]{this, hashMap});
        } else {
            this.f16536a.addPlayExpUtParams(hashMap);
        }
    }

    public void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2af9e10", new Object[]{this, cVar});
        } else if (cVar.A == null) {
        } else {
            this.f16536a.addPlayExpUtParams(cVar.A);
        }
    }

    public void f(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517386a6", new Object[]{this, hashMap});
        } else {
            this.f16536a.addControlParams(hashMap);
        }
    }

    public void f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4b5a0ed", new Object[]{this, cVar});
        } else if (cVar.ao == null) {
        } else {
            this.f16536a.addControlParams(cVar.ao);
        }
    }

    private void d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35c49af", new Object[]{this, cVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.f16536a.mInteractiveId != -1) {
            hashMap.put("interactId", this.f16536a.mInteractiveId + "");
        }
        if (this.f16536a.mUserId != -1) {
            hashMap.put("userId", String.valueOf(this.f16536a.mUserId));
        }
        if (!StringUtils.isEmpty(this.f16536a.mFrom)) {
            hashMap.put("page", this.f16536a.mFrom.toLowerCase());
        }
        if (!StringUtils.isEmpty(this.f16536a.mContentId)) {
            hashMap.put("contentId", this.f16536a.mContentId);
        }
        hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, this.f16536a.mVideoId + "");
        hashMap.put(sku.KEY_VIDEO_SOURCE, this.f16536a.mVideoSource + "");
        hashMap.put("mediaType", "1");
        hashMap.put("playerScene", "highPerformance");
        if (cVar.z != null) {
            hashMap.putAll(cVar.z);
        }
        this.f16536a.addUtParams(hashMap);
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        this.f16536a.setInstanceType(DWInstanceType.PIC);
        this.e = new x(this.f16536a);
        this.e.a(this.r);
        this.c.addView(this.e.a(), new FrameLayout.LayoutParams(this.f16536a.mWidth, this.f16536a.mHeight));
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        x xVar = this.e;
        if (xVar == null || xVar.a() == null) {
            return;
        }
        this.e.a().setVisibility(8);
        this.e.b();
        this.e = null;
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        this.f16536a.setInstanceType(DWInstanceType.VIDEO);
        if (this.d != null) {
            return;
        }
        this.d = new o(this.f16536a);
        dde ddeVar = this.k;
        if (ddeVar != null) {
            this.d.a(ddeVar);
            this.k = null;
        }
        if (this.c != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f16536a.mWidth, this.f16536a.mHeight);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " initVideoMode , " + this.f16536a.mWidth + ", " + this.f16536a.mHeight);
            this.c.addView(this.d.c(), 0, layoutParams);
        }
        this.f16536a.getVideo().b(this);
        com.taobao.avplayer.common.z zVar = this.s;
        if (zVar != null) {
            this.d.a(zVar);
        }
        this.d.a(this);
    }

    public void a(com.taobao.avplayer.common.z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410de73b", new Object[]{this, zVar});
            return;
        }
        this.r = zVar;
        x xVar = this.e;
        if (xVar == null) {
            return;
        }
        xVar.a(this.r);
    }

    public void b(com.taobao.avplayer.common.z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e6a6fc", new Object[]{this, zVar});
            return;
        }
        this.s = zVar;
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a(this.s);
    }

    public void a(av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173676bc", new Object[]{this, avVar});
        } else {
            this.f = avVar;
        }
    }

    public void a(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1736eb1b", new Object[]{this, awVar});
        } else {
            this.g = awVar;
        }
    }

    public void a(an anVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1732d3c4", new Object[]{this, anVar});
        } else {
            this.o = anVar;
        }
    }

    public void a(az azVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17384838", new Object[]{this, azVar});
        } else {
            this.l = azVar;
        }
    }

    public void a(bb bbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b76d1", new Object[]{this, bbVar});
            return;
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a(bbVar);
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a(i);
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a(i, z, false);
    }

    private void a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " seekToInner " + i);
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a(i, z, z2);
    }

    public void a(bc bcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173beb30", new Object[]{this, bcVar});
            return;
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a(bcVar);
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.b(i);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " start");
        com.taobao.avplayer.music.a aVar = this.m;
        if (aVar != null) {
            aVar.b();
        } else {
            y();
        }
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " startInner");
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.e();
    }

    public void d(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597068e8", new Object[]{this, hashMap});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setMetaData " + hashMap);
        this.f16536a.mMetaData.clear();
        this.f16536a.mMetaData.putAll(hashMap);
    }

    public void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setAlbumArtBitmap " + bitmap);
        this.f16536a.mAlbumArtBitamp = bitmap;
        com.taobao.avplayer.music.a aVar = this.m;
        if (aVar == null) {
            return;
        }
        aVar.h();
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setUseAudioCache " + z);
        this.f16536a.mUseAudioCache = z;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.g();
    }

    public void a(com.taobao.avplayer.common.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410ba160", new Object[]{this, uVar});
            return;
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a(uVar);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.avplayer.music.a aVar = this.m;
        if (aVar != null) {
            aVar.c();
        } else {
            z();
        }
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " playVideoInner");
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.f();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.avplayer.music.a aVar = this.m;
        if (aVar != null) {
            aVar.d();
        } else {
            A();
        }
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " pauseVideoInner");
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.j();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " closeVideo");
        com.taobao.avplayer.music.a aVar = this.m;
        if (aVar != null) {
            aVar.e();
        } else {
            B();
        }
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " closeVideoInner");
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.i();
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.f(z);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        DWContext dWContext = this.f16536a;
        return dWContext != null && dWContext.isMute();
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_getVideoState);
        if (this.f16536a.getVideo() != null) {
            return this.f16536a.getVideo().t();
        }
        return 0;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        if (this.d != null && this.f16536a.getVideo() != null) {
            return this.f16536a.getVideo().o();
        }
        return 0;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        o oVar = this.d;
        if (oVar == null) {
            return false;
        }
        return oVar.d();
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWHighPerformanceInstance this=" + this + ", mute=" + z);
        this.f16536a.mute(z);
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.c(z);
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a(f);
    }

    public ViewGroup l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e56c89c2", new Object[]{this});
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_getView);
        if (this.f16536a.getExternSurface() == null) {
            return this.c;
        }
        return null;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " destroy " + this.j);
        if (this.j) {
            return;
        }
        com.taobao.avplayer.music.a aVar = this.m;
        if (aVar != null) {
            this.n = null;
            this.f16536a.mNeedRequestAudio = true;
            aVar.a(this);
        }
        D();
        this.j = true;
        o oVar = this.d;
        if (oVar != null) {
            oVar.k();
            this.d = null;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.avplayer.DWHighPerformaceInstance$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        n.g(n.this);
                    }
                }
            });
        } else {
            w();
        }
        DWContext dWContext = this.f16536a;
        if (dWContext != null) {
            dWContext.destroy();
        }
        this.c = null;
        this.f16536a.setExternSurface(null);
        this.f16536a.mDisableSurfaceView = false;
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onVideoStart");
        av avVar = this.f;
        if (avVar != null) {
            avVar.onVideoStart();
        }
        aw awVar = this.g;
        if (awVar != null) {
            awVar.onVideoStart();
        }
        com.taobao.mediaplay.player.e eVar = this.x;
        if (eVar == null) {
            return;
        }
        eVar.onMediaStart();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onVideoPause " + z);
        av avVar = this.f;
        if (avVar != null) {
            avVar.onVideoPause(z);
        }
        aw awVar = this.g;
        if (awVar != null) {
            awVar.onVideoPause(z);
        }
        com.taobao.mediaplay.player.e eVar = this.x;
        if (eVar == null) {
            return;
        }
        eVar.onMediaPause(z);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onVideoPlay");
        av avVar = this.f;
        if (avVar != null) {
            avVar.onVideoPlay();
        }
        aw awVar = this.g;
        if (awVar != null) {
            awVar.onVideoPlay();
        }
        com.taobao.mediaplay.player.e eVar = this.x;
        if (eVar == null) {
            return;
        }
        eVar.onMediaPlay();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        av avVar = this.f;
        if (avVar != null) {
            avVar.onVideoSeekTo(i);
        }
        aw awVar = this.g;
        if (awVar != null) {
            awVar.onVideoSeekTo(i);
        }
        com.taobao.mediaplay.player.e eVar = this.x;
        if (eVar == null) {
            return;
        }
        eVar.onMediaSeekTo(i);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onVideoPrepared");
        av avVar = this.f;
        if (avVar != null) {
            avVar.onVideoPrepared(obj);
        }
        aw awVar = this.g;
        if (awVar != null) {
            awVar.onVideoPrepared(obj);
        }
        com.taobao.mediaplay.player.e eVar = this.x;
        if (eVar == null) {
            return;
        }
        if (obj instanceof IMediaPlayer) {
            eVar.onMediaPrepared((IMediaPlayer) obj);
        } else {
            eVar.onMediaPrepared(null);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onVideoError " + i + ", " + i2);
        av avVar = this.f;
        if (avVar != null) {
            avVar.onVideoError(obj, i, i2);
        }
        aw awVar = this.g;
        if (awVar != null) {
            awVar.onVideoError(obj, i, i2);
        }
        com.taobao.mediaplay.player.e eVar = this.x;
        if (eVar == null) {
            return;
        }
        if (obj instanceof IMediaPlayer) {
            eVar.onMediaError((IMediaPlayer) obj, i, i2);
        } else {
            eVar.onMediaError(null, i, i2);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        av avVar = this.f;
        if (avVar != null) {
            avVar.onVideoInfo(obj, (int) j, (int) j2);
        }
        aw awVar = this.g;
        if (awVar != null) {
            awVar.onVideoInfo(obj, j, j2, j3, obj2);
        }
        com.taobao.mediaplay.player.e eVar = this.x;
        if (eVar != null) {
            if (obj instanceof IMediaPlayer) {
                eVar.onMediaInfo((IMediaPlayer) obj, j, j2, j3, obj2);
            } else {
                eVar.onMediaInfo(null, j, j2, j3, obj2);
            }
        }
        if ((j != 11000 && j != 3) || !this.t) {
            return;
        }
        this.u.d();
    }

    public Map<String, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("11bb9f6a", new Object[]{this});
        }
        o oVar = this.d;
        if (oVar == null) {
            return null;
        }
        return oVar.l();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        av avVar = this.f;
        if (avVar != null) {
            avVar.onVideoComplete();
        }
        aw awVar = this.g;
        if (awVar != null) {
            awVar.onVideoComplete();
        }
        com.taobao.mediaplay.player.e eVar = this.x;
        if (eVar == null) {
            return;
        }
        eVar.onMediaComplete();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        av avVar = this.f;
        if (avVar != null) {
            avVar.onVideoClose();
        }
        aw awVar = this.g;
        if (awVar != null) {
            awVar.onVideoClose();
        }
        com.taobao.mediaplay.player.e eVar = this.x;
        if (eVar == null) {
            return;
        }
        eVar.onMediaClose();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else if (this.f == null) {
        } else {
            if (dWVideoScreenType == DWVideoScreenType.NORMAL) {
                this.f.onVideoNormalScreen();
            } else {
                this.f.onVideoFullScreen();
            }
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        av avVar = this.f;
        if (avVar != null) {
            avVar.onVideoProgressChanged(i, i2, i3);
        }
        aw awVar = this.g;
        if (awVar != null) {
            awVar.onVideoProgressChanged(i, i2, i3);
        }
        com.taobao.mediaplay.player.e eVar = this.x;
        if (eVar != null) {
            eVar.onMediaProgressChanged(i, i2, i3);
        }
        if (this.l == null) {
            return;
        }
        long j = -1;
        o oVar = this.d;
        if (oVar != null) {
            j = oVar.n();
        }
        this.l.onVideoPlayTimeChanged(j);
    }

    private boolean C() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isEmpty(this.f16536a.mFrom) || StringUtils.isEmpty(this.f16536a.mVideoSource) || StringUtils.isEmpty(this.f16536a.mVideoId)) {
            com.taobao.taobaoavsdk.util.c.b("TBDWInstance", "缺少必填参数 bizCode、videoSource、videoId！！");
        }
        if (StringUtils.isEmpty(this.f16536a.mFrom)) {
            this.f16536a.mFrom = "default";
        }
        if (StringUtils.isEmpty(this.f16536a.mVideoSource)) {
            DWContext dWContext = this.f16536a;
            dWContext.mPlayContext.mVideoSource = "TBVideo";
            dWContext.mVideoSource = "TBVideo";
        }
        if (!StringUtils.isEmpty(this.f16536a.mPlayContext.getVideoUrl()) && StringUtils.isEmpty(this.f16536a.getVideoId()) && "TBVideo".equals(this.f16536a.getVideoSource())) {
            try {
                String rawPath = new URI(this.f16536a.mPlayContext.getVideoUrl()).getRawPath();
                int lastIndexOf = rawPath.lastIndexOf(47);
                int lastIndexOf2 = rawPath.lastIndexOf(46);
                if (lastIndexOf >= 0 && lastIndexOf2 >= 0 && (i = lastIndexOf + 1) < rawPath.length() && lastIndexOf2 > i) {
                    DWContext dWContext2 = this.f16536a;
                    MediaPlayControlContext mediaPlayControlContext = this.f16536a.mPlayContext;
                    String substring = rawPath.substring(i, lastIndexOf2);
                    mediaPlayControlContext.mVideoId = substring;
                    dWContext2.mVideoId = substring;
                }
            } catch (Exception unused) {
            }
        }
        return !StringUtils.isEmpty(this.f16536a.mVideoId);
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_getVideoToken);
        o oVar = this.d;
        if (oVar == null) {
            return null;
        }
        return oVar.b();
    }

    public void a(ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b0272", new Object[]{this, baVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_setIVideoPreCompleteListener);
        DWContext dWContext = this.f16536a;
        if (dWContext == null || dWContext.getVideo() == null || baVar == null) {
            return;
        }
        this.f16536a.getVideo().a(baVar);
    }

    public void a(ax axVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17375f7a", new Object[]{this, axVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_setIVideoLoopCompleteListener);
        DWContext dWContext = this.f16536a;
        if (dWContext == null || dWContext.getVideo() == null || axVar == null) {
            return;
        }
        this.f16536a.getVideo().a(axVar);
    }

    public void a(ImageView imageView) {
        x xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f7c622", new Object[]{this, imageView});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_setPicImageView);
        if (imageView == null || (xVar = this.e) == null) {
            return;
        }
        xVar.a(imageView);
    }

    @Override // com.taobao.avplayer.common.q
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onLifecycleChanged " + dWLifecycleType);
        if (dWLifecycleType == DWLifecycleType.MID && this.e != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onLifecycleChanged hide cover");
            this.e.a().setVisibility(4);
        } else if (dWLifecycleType != DWLifecycleType.BEFORE || this.e == null) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onLifecycleChanged show cover");
            this.e.a().setVisibility(0);
        }
    }

    public void e(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5571f7c7", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_setUTParams);
        DWContext dWContext = this.f16536a;
        if (dWContext == null || hashMap == null) {
            return;
        }
        dWContext.addUtParams(hashMap);
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this});
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_getLogToken);
        DWContext dWContext = this.f16536a;
        if (dWContext == null) {
            return null;
        }
        return dWContext.getPlayToken();
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public c f16539a = new c();
        public String b;

        static {
            kge.a(1297191817);
        }

        public b(Activity activity) {
            c cVar = this.f16539a;
            cVar.b = activity;
            cVar.ae = "hp";
        }

        public b(Context context) {
            c cVar = this.f16539a;
            cVar.c = context;
            cVar.ae = "hp";
        }

        public b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6908bfd", new Object[]{this, str});
            }
            this.f16539a.d = str;
            return this;
        }

        public b a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("25988537", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.C = z;
            return this;
        }

        public b a(DWInstanceType dWInstanceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6f26c57a", new Object[]{this, dWInstanceType});
            }
            this.f16539a.W = dWInstanceType;
            return this;
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7c0ab23e", new Object[]{this, str});
            }
            this.f16539a.i = str;
            return this;
        }

        public b a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("57366866", new Object[]{this, new Integer(i)});
            }
            this.f16539a.j = i;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f184d87f", new Object[]{this, str});
            }
            this.f16539a.k = str;
            return this;
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("264530d6", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.l = z;
            return this;
        }

        public b a(kbv kbvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8ba6b744", new Object[]{this, kbvVar});
            }
            this.f16539a.m = kbvVar;
            return this;
        }

        public b b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("57e31405", new Object[]{this, new Integer(i)});
            }
            this.f16539a.n = i;
            return this;
        }

        public b c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("26f1dc75", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.R = z;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("66fefec0", new Object[]{this, str});
            }
            this.f16539a.h = str;
            return this;
        }

        public b a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("90877927", new Object[]{this, new Long(j)});
            }
            this.f16539a.e = j;
            return this;
        }

        public b c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("588fbfa4", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = kcl.a();
            }
            this.f16539a.o = i;
            return this;
        }

        public b d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("593c6b43", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = kcl.a(600.0f);
            }
            this.f16539a.p = i;
            return this;
        }

        public b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dc792501", new Object[]{this, str});
            }
            this.f16539a.q = str;
            return this;
        }

        public b a(com.taobao.avplayer.common.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cb1f9250", new Object[]{this, pVar});
            }
            this.f16539a.r = pVar;
            return this;
        }

        public b a(com.taobao.avplayer.common.v vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7005be8a", new Object[]{this, vVar});
            }
            this.f16539a.s = vVar;
            return this;
        }

        public b a(ar arVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e5881b0b", new Object[]{this, arVar});
            }
            this.f16539a.D = arVar;
            return this;
        }

        public b a(as asVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d659226a", new Object[]{this, asVar});
            }
            this.f16539a.t = asVar;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("51f34b42", new Object[]{this, str});
            }
            this.f16539a.f = str;
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c76d7183", new Object[]{this, str});
            }
            this.f16539a.g = str;
            return this;
        }

        public b a(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c3bd8116", new Object[]{this, hashMap});
            }
            this.f16539a.z = hashMap;
            return this;
        }

        public b b(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fd8822f5", new Object[]{this, hashMap});
            }
            this.f16539a.A = hashMap;
            return this;
        }

        public b d(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("711d66b3", new Object[]{this, hashMap});
            }
            this.f16539a.ao = hashMap;
            return this;
        }

        public b a(ap apVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3e60c4d", new Object[]{this, apVar});
            }
            this.f16539a.u = apVar;
            return this;
        }

        public b a(com.taobao.avplayer.common.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("815339dc", new Object[]{this, dVar});
            }
            this.f16539a.v = dVar;
            return this;
        }

        public b a(com.taobao.avplayer.common.ad adVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("40afa403", new Object[]{this, adVar});
            }
            this.f16539a.w = adVar;
            return this;
        }

        public b d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("279e8814", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.B = z;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWHighPerformaceInstance Builder, sbt=" + this.f16539a.f + ", setMute=" + this.f16539a.B);
            return this;
        }

        public b e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("284b33b3", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.F = z;
            return this;
        }

        public b f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("28f7df52", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.G = z;
            return this;
        }

        public b g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("29a48af1", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.H = z;
            return this;
        }

        public b a(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8d6b07dc", new Object[]{this, dWVideoScreenType});
            }
            this.f16539a.I = dWVideoScreenType;
            return this;
        }

        public b h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2a513690", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.J = z;
            return this;
        }

        public b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3ce797c4", new Object[]{this, str});
            }
            this.f16539a.K = str;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b261be05", new Object[]{this, str});
            }
            this.f16539a.L = str;
            return this;
        }

        public b j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("27dbe446", new Object[]{this, str});
            }
            this.f16539a.M = str;
            return this;
        }

        public b a(com.taobao.avplayer.common.af afVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2251b2c1", new Object[]{this, afVar});
            }
            this.f16539a.y = afVar;
            return this;
        }

        public b i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2afde22f", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.O = z;
            return this;
        }

        public b j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2baa8dce", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.P = z;
            return this;
        }

        public b a(ddg ddgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bd4e605c", new Object[]{this, ddgVar});
            }
            this.f16539a.Q = ddgVar;
            return this;
        }

        public b k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9d560a87", new Object[]{this, str});
            }
            this.f16539a.f16540a = str;
            return this;
        }

        public b k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2c57396d", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.aa = z;
            return this;
        }

        public b l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2d03e50c", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.S = z;
            return this;
        }

        public b a(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d80073aa", new Object[]{this, dWAspectRatio});
            }
            this.f16539a.U = dWAspectRatio;
            return this;
        }

        public b a(Surface surface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9081adff", new Object[]{this, surface});
            }
            this.f16539a.V = surface;
            return this;
        }

        public b m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2db090ab", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.Y = z;
            return this;
        }

        public b n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2e5d3c4a", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.Z = z;
            return this;
        }

        public b q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("30633f27", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.am = z;
            return this;
        }

        public b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bfd2a21", new Object[]{this, jSONObject});
            }
            this.f16539a.ab = jSONObject;
            return this;
        }

        public b a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ab433623", new Object[]{this, new Float(f)});
            }
            this.f16539a.ac = f;
            return this;
        }

        public b a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8fc400e8", new Object[]{this, map});
            }
            this.f16539a.ad = map;
            return this;
        }

        public void l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (StringUtils.isEmpty(this.b)) {
            } else {
                c cVar = this.f16539a;
                cVar.ae = this.b + "." + this.f16539a.ae;
                this.b = "";
            }
        }

        public b o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2f09e7e9", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.af = z;
            return this;
        }

        public b p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2fb69388", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.ag = z;
            return this;
        }

        public b c(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3752c4d4", new Object[]{this, hashMap});
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Builder setMetaData " + hashMap);
            this.f16539a.ah = hashMap;
            return this;
        }

        public b m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("884a5709", new Object[]{this, str});
            }
            this.f16539a.ak = str;
            return this;
        }

        public b n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fdc47d4a", new Object[]{this, str});
            }
            this.f16539a.al = str;
            return this;
        }

        public b r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("310feac6", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.an = z;
            return this;
        }

        public b s(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("31bc9665", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.x = z;
            return this;
        }

        public b t(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("32694204", new Object[]{this, new Boolean(z)});
            }
            this.f16539a.T = z;
            return this;
        }

        public n b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("3ecad72", new Object[]{this}) : new n(this.f16539a);
        }
    }

    public long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46c", new Object[]{this})).longValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_getDuration);
        DWContext dWContext = this.f16536a;
        if (dWContext != null && dWContext.getVideo() != null) {
            return this.f16536a.getVideo().n();
        }
        return 0L;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_getVideoWidth);
        DWContext dWContext = this.f16536a;
        if (dWContext != null && dWContext.getVideo() != null) {
            return this.f16536a.getVideo().p();
        }
        return 0;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_getVideoHeight);
        DWContext dWContext = this.f16536a;
        if (dWContext != null && dWContext.getVideo() != null) {
            return this.f16536a.getVideo().q();
        }
        return 0;
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_setFirstRenderAdapter);
        DWContext dWContext = this.f16536a;
        if (dWContext != null) {
            if (ddeVar != null) {
                dWContext.setNeedCommitUserToFirstFrame(true);
            } else {
                dWContext.setNeedCommitUserToFirstFrame(false);
            }
        }
        o oVar = this.d;
        if (oVar != null) {
            oVar.a(ddeVar);
        } else {
            this.k = ddeVar;
        }
    }

    public void a(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a46591", new Object[]{this, str, new Boolean(z), hashMap});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_switchPlayerScene);
        if (this.d == null) {
            return;
        }
        if (hashMap == null) {
            Map<String, String> uTParams = this.f16536a.getUTParams();
            if (uTParams == null) {
                return;
            }
            this.d.a(str, z, uTParams);
            return;
        }
        DWContext dWContext = this.f16536a;
        if (dWContext != null && hashMap != null) {
            dWContext.addUtParams(hashMap);
        }
        this.d.a(str, z, hashMap);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_callWithMsg);
        if (map == null) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "callWithMsg " + map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (obw.KEY_VIDEO_UPDATE_PARAMS.equals(key) && !StringUtils.isEmpty(value)) {
                this.f16536a.mDynamicPlayEx = value;
            } else if ("enterFloating".equals(key)) {
                this.f16536a.mIsFloat = "1".equals(value);
            }
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a(map);
    }

    private void e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e408f54e", new Object[]{this, cVar});
            return;
        }
        this.c = new FrameLayout(this.f16536a.getActivity()) { // from class: com.taobao.avplayer.DWHighPerformaceInstance$4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(DWHighPerformaceInstance$4 dWHighPerformaceInstance$4, String str, Object... objArr) {
                if (str.hashCode() == 2075560917) {
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
                }
                n nVar = n.this;
                if (n.$ipChange) {
                    n nVar2 = n.this;
                    n.$ipChange.a(motionEvent);
                }
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        };
        this.t = true;
        String str = this.f16536a.mPanoType == 1 ? "ERP" : "EAC";
        this.v = cVar.m;
        this.w = new d(this);
        this.u = new kbx(this.f16536a.getActivity(), str, this.w, this.v);
        this.f16536a.setVideoAspectRatio(DWAspectRatio.DW_CENTER_CROP);
    }

    private void D() {
        kbx kbxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else if (!this.t || (kbxVar = this.u) == null) {
        } else {
            this.t = false;
            this.w = null;
            kbxVar.a();
            this.v = null;
        }
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_setFov);
        if (this.d == null || this.f16536a.getVideo() == null || !this.t || map.size() <= 0) {
            return;
        }
        new HashMap();
        this.u.a(com.taobao.taobaoavsdk.util.b.d(String.valueOf(map.get("FOV"))), com.taobao.taobaoavsdk.util.b.d(String.valueOf(map.get("latitude"))), com.taobao.taobaoavsdk.util.b.d(String.valueOf(map.get("longitude"))), true);
    }

    public Map<String, String> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e3b9e9f0", new Object[]{this});
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_getFov);
        if (this.d != null && this.f16536a.getVideo() != null && this.t) {
            return this.u.b();
        }
        return null;
    }

    /* loaded from: classes6.dex */
    public class d implements kbw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private n b;

        static {
            kge.a(200035212);
            kge.a(1785800563);
        }

        public d(n nVar) {
            n.this = r1;
            this.b = nVar;
        }

        @Override // tb.kbw
        public void setFov(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66bab26e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            } else {
                this.b.a(f, f2, f3);
            }
        }

        @Override // tb.kbw
        public int getWidth() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.b.f16536a.mWidth;
        }

        @Override // tb.kbw
        public int getHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.b.f16536a.mHeight;
        }

        @Override // tb.kbw
        public void refreshScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5a8082e", new Object[]{this});
            } else {
                this.b.b();
            }
        }

        @Override // tb.kbw
        public List<com.taobao.taobaoavsdk.f> hitTest(List<com.taobao.taobaoavsdk.e> list) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ae7e26ea", new Object[]{this, list}) : this.b.a(list);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_commitEndForMultiplexing);
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.m();
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_setVolume);
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        o oVar = this.d;
        if (oVar != null) {
            oVar.b(f);
        }
        DWContext dWContext = this.f16536a;
        if (dWContext == null) {
            return;
        }
        dWContext.setVolume(f);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_setOpenVolumeFadeIn);
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.e(z);
    }

    public void a(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cd50c8", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.hp_volumeFadeInWithCustomParams);
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a(f, f2, i, i2);
    }
}
