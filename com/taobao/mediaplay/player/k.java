package com.taobao.mediaplay.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.media.connectionclass.ConnectionClassManager;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.player.a;
import com.taobao.mediaplay.player.g;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.vpm.VPMManagerInstance;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.dde;
import tb.ddg;
import tb.ipw;
import tb.keu;
import tb.kge;
import tb.mkb;
import tb.mkc;
import tb.mto;
import tb.obw;
import tb.oyu;
import tb.ozi;
import tb.ozm;
import tb.ozn;
import tb.riy;
import tb.tmz;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;
import tv.danmaku.ijk.media.player.NativeMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes7.dex */
public class k extends com.taobao.mediaplay.player.b implements Handler.Callback, a.InterfaceC0698a, g.a, dde, ozn.a, IMediaPlayer.OnLoopCompletionListener, InnerStartFuncListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int A;
    private static String I;
    private static int J;
    public boolean B;
    public boolean C;
    public boolean D;
    public View E;
    public TaoLiveVideoView.d F;
    public boolean G;
    public boolean H;
    private boolean K;
    private int L;
    private int M;
    private boolean N;
    private g O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private String Z;
    private String aA;
    private dde aB;
    private InnerStartFuncListener aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private int aG;
    private boolean aH;
    private boolean aI;
    private boolean aK;
    private j aL;
    private String aM;
    private int aN;
    private long aO;
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    private List<View> aU;
    private int aV;
    public WeakReference<Activity> aW;
    private boolean aX;
    private Bitmap aY;
    private boolean aZ;
    private String aa;
    private boolean ab;
    private boolean ac;
    private g ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private long ah;
    private boolean ai;
    private int aj;
    private g.b ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private Handler ar;
    private i as;
    private boolean at;
    private Map<TaobaoMediaPlayer, List<mkb>> au;
    private Map<TaobaoMediaPlayer, mkb> av;
    private Object aw;
    private AudioManager ax;
    private com.taobao.mediaplay.player.a ay;
    private long az;
    private boolean bC;
    private boolean bD;
    private boolean bE;
    private g.b bF;
    private boolean bG;
    private boolean ba;
    private boolean bb;
    private boolean bc;
    private boolean bd;
    private int be;
    private long bf;
    private long bg;
    private boolean bh;
    private boolean bi;
    private boolean bj;
    private boolean bk;
    private Activity bl;
    private boolean bm;
    private boolean bn;
    private boolean bo;
    private boolean bp;
    private int bq;
    private int br;
    private boolean bs;
    public boolean bt;
    private long bu;
    public boolean bv;
    public final Bitmap[] bw;
    private boolean bx;
    private boolean by;

    /* renamed from: com.taobao.mediaplay.player.k$8  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass8 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18056a = new int[MediaAspectRatio.values().length];

        static {
            try {
                f18056a[MediaAspectRatio.DW_FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18056a[MediaAspectRatio.DW_CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18056a[MediaAspectRatio.DW_FIT_X_Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a();

        void a(Bitmap bitmap);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ozn.a
    public int getDestoryState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d805014d", new Object[]{this})).intValue();
        }
        return 6;
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public static /* synthetic */ void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbba3f2", new Object[]{kVar});
        } else {
            kVar.V();
        }
    }

    public static /* synthetic */ void a(k kVar, AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4a2a3d", new Object[]{kVar, abstractMediaPlayer});
        } else {
            kVar.d(abstractMediaPlayer);
        }
    }

    public static /* synthetic */ boolean a(k kVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bb98d26", new Object[]{kVar, new Boolean(z)})).booleanValue();
        }
        kVar.K = z;
        return z;
    }

    static {
        kge.a(-1229869911);
        kge.a(219584769);
        kge.a(-1854325247);
        kge.a(1287118762);
        kge.a(-1043440182);
        kge.a(1637440348);
        kge.a(1562729082);
        kge.a(332999893);
        I = "TextureVideoView";
        J = 200;
        A = 21;
    }

    public k(MediaContext mediaContext, String str) {
        super(mediaContext.getContext());
        this.K = false;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = false;
        this.T = false;
        this.U = true;
        this.V = false;
        this.W = true;
        this.X = false;
        this.Y = 0;
        this.Z = "";
        this.aa = "";
        this.ab = false;
        this.ac = false;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ai = false;
        this.aj = 0;
        this.aw = new Object();
        this.az = 0L;
        this.bt = false;
        this.bv = true;
        this.aD = false;
        this.aE = true;
        this.aF = false;
        this.aG = 0;
        this.aH = false;
        this.aI = false;
        this.aL = null;
        this.aO = 0L;
        this.aP = true;
        this.aR = false;
        this.aS = false;
        this.by = false;
        this.aT = false;
        this.aV = 0;
        this.aX = true;
        this.aZ = false;
        this.ba = false;
        this.bb = false;
        this.bc = false;
        this.bd = false;
        this.be = 15;
        this.bj = false;
        this.bk = false;
        this.aW = null;
        this.bp = false;
        this.bq = 0;
        this.br = 0;
        this.bs = true;
        this.bu = 0L;
        this.bC = false;
        this.bx = true;
        this.bw = new Bitmap[1];
        this.bD = false;
        this.bE = false;
        this.bF = null;
        this.bG = false;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + this + ", token: " + str);
        this.o = mediaContext;
        if (this.o != null && this.o.getExternSurface() != null) {
            this.bB = this.o.getExternSurface();
            this.bA = true;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "AVSDK TextureVideoView initRender: extern " + this.bB);
        }
        this.bf = System.currentTimeMillis();
        this.bc = com.taobao.taobaoavsdk.util.e.a(this.j).e();
        boolean a2 = com.taobao.taobaoavsdk.util.e.a(this.j).a(this.j, this.o.mMediaPlayContext.mFrom);
        boolean g = com.taobao.taobaoavsdk.util.e.a(this.j).g();
        if (this.bc && a2 && g) {
            this.bc = true;
        } else {
            this.bc = false;
        }
        if (this.o.getControlParams() != null && !StringUtils.isEmpty(this.o.getControlParams().get("LiveRoomInit"))) {
            this.bE = com.taobao.taobaoavsdk.util.b.a(this.o.getControlParams().get("LiveRoomInit"));
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView init: get LiveRoomInit=" + this.bE + " from mMediaContext.getControlParams() ");
        }
        if (this.bc && !com.taobao.taobaoavsdk.util.e.n && this.bE) {
            this.bc = false;
        }
        if (this.bc && this.o.mDisableSurfaceView) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "set disable SurfaceView by client with callWithMsg");
            this.bc = false;
            com.taobao.taobaoavsdk.util.e.a(this.j).a(1);
        }
        if (this.o.mMediaPlayContext.mForceUseSurfaceView) {
            this.bc = true;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "set enable SurfaceView by client with out interface");
        }
        if (oyu.i()) {
            this.bc = false;
        }
        a(this.o.mMediaPlayContext, com.taobao.taobaoavsdk.util.e.a(this.j).b(), com.taobao.taobaoavsdk.util.e.a(this.j).c(), com.taobao.taobaoavsdk.util.e.a(this.j).d());
        if (this.bc) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", TaobaoMediaPlayer.ORANGE_ENABLE_SURFACEVIEW_REBUILD_BUSINESSTYPE_LIST, "[\"LiveCard\",\"homepageLiveCard\"]");
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mEnableRebuildWhenSurfaceViewAttach=false because from=" + this.o.mMediaPlayContext.mFrom);
            if (com.taobao.taobaoavsdk.util.b.b(this.o.mMediaPlayContext.mFrom, config)) {
                this.bm = true;
            }
        }
        Y();
        if (!this.o.mMediaPlayContext.mTBLive) {
            A = 18;
        }
        this.ax = (AudioManager) this.o.getContext().getApplicationContext().getSystemService("audio");
        this.ar = new Handler(this);
        this.aA = str;
        str = StringUtils.isEmpty(str) ? com.taobao.taobaoavsdk.util.b.c() : str;
        if (this.o.mMediaPlayContext.mTBLive) {
            this.m = ozi.g().b(str, this);
        } else {
            this.m = ozm.h().b(str, this);
        }
        if (this.m != null && this.m.f != null && (this.m.f instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) this.m.f).setReuseFlag(true);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView##contruct: reuse TaobaoMediaPlayer and url is " + ((TaobaoMediaPlayer) this.m.f).getPlayUrl());
        }
        boolean a3 = this.o.mScenarioType == 0 ? com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", TaobaoMediaPlayer.ORANGE_ENABLE_ALL_LIVE_HEARTBEAT, "true")) : false;
        this.aF = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_LIVE_SEEK_AFTER_RESUME_RECYCLE, "false"));
        if (MediaAdapteManager.mConfigAdapter != null && MediaAdapteManager.mABTestAdapter != null && this.o.mMediaPlayContext.mTBLive && (a3 || this.o.mMediaPlayContext.isLiveRoom())) {
            try {
                double doubleValue = com.taobao.taobaoavsdk.util.b.e(MediaAdapteManager.mConfigAdapter.getConfig(this.o.mMediaPlayContext.mConfigGroup, "netspeed_decay", "0.05")).doubleValue();
                if (doubleValue <= mto.a.GEO_NOT_SUPPORT) {
                    doubleValue = ConnectionClassManager.DEFAULT_DECAY_CONSTANT;
                }
                ConnectionClassManager.DEFAULT_DECAY_CONSTANT = doubleValue;
            } catch (Throwable unused) {
            }
        }
        this.aE = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_CAPTURE, "true"));
        if (com.taobao.taobaoavsdk.util.b.b(Build.MODEL, OrangeConfig.getInstance().getConfig("DWInteractive", "switchStreamDelayReviewDevideList", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264))) {
            this.aj = com.taobao.taobaoavsdk.util.b.b(OrangeConfig.getInstance().getConfig("DWInteractive", "removeViewDelayTimeOfSwitch", "300"));
        } else {
            this.aj = com.taobao.taobaoavsdk.util.b.b(OrangeConfig.getInstance().getConfig("DWInteractive", "removeViewDefaultDelayTimeOfSwitch", "200"));
        }
        this.af = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_MULTI_SURFACE_SWITCH_STREAM, "true"));
        this.aI = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_REATTACH_CONTEXT, "true"));
        this.aK = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SWITCH_LIVE_BY_NET_SPEED, "true"));
        this.aQ = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_REBUILD_RENDER_VIEW_WHEN_REUSE, "false"));
        this.aP = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_FIX_NOFITY_RTC_SWITCH_ERROR_CALLBACK, "true"));
        this.bn = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enGlobalKeepScreenOn", "true"));
        if (this.bc) {
            this.aR = false;
            this.aQ = true;
        } else {
            this.aR = oyu.T();
        }
        this.aX = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_USE_NEW_INIT_ERROR_CODE, "true"));
        this.bx = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PIXEL_COPY_COVER_FOR_SURFACEVIEW, "true"));
        if (this.aU == null) {
            this.aU = new ArrayList();
        }
        R();
    }

    public k(MediaContext mediaContext) {
        this(mediaContext, null);
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        } else if (this.j == null || this.ay != null) {
        } else {
            this.ay = new com.taobao.mediaplay.player.a(this, (Application) this.j.getApplicationContext());
        }
    }

    private void S() {
        com.taobao.mediaplay.player.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else if (this.j == null || (aVar = this.ay) == null) {
        } else {
            aVar.a((Application) this.j.getApplicationContext());
            this.ay = null;
        }
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbabb34", new Object[]{this, iVar});
        } else {
            this.as = iVar;
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void a(TaoLiveVideoView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a320bc1a", new Object[]{this, dVar});
        } else {
            this.F = dVar;
        }
    }

    private void V() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
        } else if (d() == 3 || d() == 6 || d() == 4 || (handler = this.ar) == null) {
        } else {
            handler.removeCallbacksAndMessages(null);
            this.ar.sendEmptyMessageDelayed(0, J);
        }
    }

    private void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        Handler handler = this.ar;
        if (handler == null) {
            return;
        }
        handler.removeMessages(0);
    }

    @Override // com.taobao.mediaplay.player.b
    public View g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d6895230", new Object[]{this}) : this.O.getView();
    }

    @Override // com.taobao.mediaplay.player.b
    public Bitmap h() {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("dda342cd", new Object[]{this});
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCurrentFrame begin");
        if (!this.aE) {
            return null;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCurrentFrame mEnableCapture mMediaPlayerRecycler=" + this.m + ", mRenderUIView=" + this.E);
        if (this.m != null && this.m.f != null && (gVar = this.O) != null && gVar.isAvailable()) {
            View view = this.E;
            if (view instanceof TextureView) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCurrentFrame with TextureView");
                return ((TextureView) this.E).getBitmap();
            } else if (this.bx && (view instanceof SurfaceView)) {
                aj();
                if (this.bw[0] != null) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCurrentFrame success return bitmap=" + this.bw[0] + "by before getCurrentFrame");
                    return this.bw[0];
                }
            }
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCurrentFrame failed with mMediaPlayerRecycler=" + this.m + ",renderView=" + this.O);
        return null;
    }

    public void aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab715430", new Object[]{this});
            return;
        }
        View view = this.E;
        if (!(view instanceof SurfaceView)) {
            return;
        }
        try {
            a((SurfaceView) view, new b() { // from class: com.taobao.mediaplay.player.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.mediaplay.player.k.b
                public void a(Bitmap bitmap) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
                        return;
                    }
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "updateCoverBitMapFromSurfaceView onBitmapReady bitmap=" + bitmap);
                    if (bitmap == null) {
                        return;
                    }
                    k.this.bw[0] = bitmap;
                }

                @Override // com.taobao.mediaplay.player.k.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "updateCoverBitMapFromSurfaceView onBitmapFailed");
                    }
                }
            });
        } catch (Exception e) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCurrentFrame surfaceview failed " + e.toString());
        }
    }

    public void a(SurfaceView surfaceView, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca1e3ed", new Object[]{this, surfaceView, bVar});
        } else if (Build.VERSION.SDK_INT >= 24 && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0) {
            final Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            PixelCopy.request(surfaceView, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.taobao.mediaplay.player.k.2
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public void onPixelCopyFinished(int i) {
                    if (i == 0) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCurrentFrame getBitmapFromSurfaceView success");
                        bVar.a(createBitmap);
                        return;
                    }
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCurrentFrame getBitmapFromSurfaceView error=" + i);
                    bVar.a();
                }
            }, new Handler(Looper.getMainLooper()));
        } else {
            bVar.a();
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.at = z;
        }
    }

    public View C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("678fc50c", new Object[]{this});
        }
        if (this.ad != null) {
            return null;
        }
        this.ad = new MediaTextureView(this.j);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch change render callback one " + this.ad);
        this.ad.setBackground(true);
        this.ad.addRenderCallback(this);
        this.ad.setVideoRotation(this.L);
        b(this.o.getVideoAspectRatio());
        return this.ad.getView();
    }

    private void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
        } else if (this.f == null || this.j == null) {
        } else {
            if (this.m != null && this.m.e == 3) {
                String str = this.m.f32509a;
                if (this.o.mMediaPlayContext.mTBLive) {
                    if ((com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || oyu.bv) && this.o != null && this.o.getWarmupFlag() && tmz.g().b(str)) {
                        this.m = tmz.g().b(str, this);
                    } else {
                        this.m = ozi.g().b(str, this);
                    }
                } else {
                    this.m = ozm.h().b(str, this);
                }
                this.m.f = null;
                this.ba = false;
            }
            String str2 = this.m.f32509a;
            if ((com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || oyu.bv) && this.o != null && this.o.getWarmupFlag() && tmz.g().b(str2)) {
                this.m = this.o.mMediaPlayContext.mTBLive ? tmz.g().b(str2, this) : ozm.h().b(str2, this);
            } else {
                this.m = this.o.mMediaPlayContext.mTBLive ? ozi.g().b(str2, this) : ozm.h().b(str2, this);
            }
            if (this.o.mMediaPlayContext.isMute()) {
                a(0.0f);
            }
            if (this.m.f == null) {
                this.m.e = 0;
                this.m.f = K();
            }
            if (this.bB != null && this.bA) {
                a(this.m.f, this.bB);
            }
            if (!StringUtils.isEmpty(this.aA)) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView setSurface in initMediaPlayer");
                if (ak() != null) {
                    a(this.m.f, ak());
                } else {
                    a(this.m.f, k());
                }
                c((IMediaPlayer) this.m.f);
            }
            a(this.m.f);
            this.m.f.setLooping(this.at);
            a(this.o.getVideoAspectRatio());
            if (this.m == null) {
                return;
            }
            if ((this.m.e != 5 && this.m.e != 8 && this.m.e != 4 && this.m.e != 2 && this.m.e != 1) || !this.P) {
                return;
            }
            this.m.f.start();
            t();
            V();
        }
    }

    private void a(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b494f487", new Object[]{this, abstractMediaPlayer});
            return;
        }
        try {
            abstractMediaPlayer.registerOnPreparedListener(this);
            abstractMediaPlayer.setOnVideoSizeChangedListener(this);
            abstractMediaPlayer.registerOnCompletionListener(this);
            abstractMediaPlayer.registerOnErrorListener(this);
            abstractMediaPlayer.setOnBufferingUpdateListener(this);
            abstractMediaPlayer.registerOnInfoListener(this);
            abstractMediaPlayer.registerOnLoopCompletionListener(this);
            abstractMediaPlayer.setScreenOnWhilePlaying(true);
            abstractMediaPlayer.registerOnVFPluginListener(this);
        } catch (Throwable unused) {
        }
    }

    private void b(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb07326", new Object[]{this, abstractMediaPlayer});
            return;
        }
        try {
            abstractMediaPlayer.setOnVideoSizeChangedListener(null);
            abstractMediaPlayer.setOnBufferingUpdateListener(null);
            abstractMediaPlayer.unregisterOnPreparedListener(this);
            abstractMediaPlayer.unregisterOnVideoSizeChangedListener(this);
            abstractMediaPlayer.unregisterOnCompletionListener(this);
            abstractMediaPlayer.unregisterOnErrorListener(this);
            abstractMediaPlayer.unregisterOnBufferingUpdateListener(this);
            abstractMediaPlayer.unregisterOnInfoListener(this);
            abstractMediaPlayer.unregisterOnLoopCompletionListener(this);
        } catch (Throwable th) {
            if (this.o == null) {
                return;
            }
            ddg ddgVar = this.o.mMediaPlayContext.mTLogAdapter;
            com.taobao.taobaoavsdk.util.c.c(ddgVar, "unregisterMediaplayerListener##error:" + th.getMessage());
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (this.H && !StringUtils.isEmpty(this.f) && !this.f.equals(str) && this.aA != null && this.m != null && this.m.f != null) {
                this.f = str;
                this.aA = null;
                this.N = false;
                this.L = 0;
                this.C = false;
                this.D = false;
                this.o.mMediaPlayContext.mSeekWhenPrepared = 0;
                this.o.setPrepareToFirstFrame(false);
                this.o.genPlayToken(true);
                String str2 = this.o.mPlayToken;
                if (this.o.mMediaPlayContext.mTBLive) {
                    if ((com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || oyu.bv) && this.o != null && this.o.getWarmupFlag() && tmz.g().b(str2)) {
                        this.m = tmz.g().b(str2, this);
                        return;
                    } else {
                        this.m = ozi.g().b(str2, this);
                        return;
                    }
                }
                this.m = ozm.h().b(str2, this);
                return;
            }
            this.f = str;
            if (this.bC) {
                this.bC = false;
            } else if (this.m == null || !b(this.m.e) || this.H) {
            } else {
                if ((this.u != 1 && this.u != 8) || StringUtils.isEmpty(this.f) || this.m.d) {
                    return;
                }
                if (this.u == 1) {
                    l();
                } else if (this.o.getPrepareToFirstFrame()) {
                    m();
                } else {
                    J();
                }
            }
        }
    }

    private void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
            return;
        }
        if (this.bc) {
            MediaSurfaceView mediaSurfaceView = new MediaSurfaceView(this.j);
            this.aZ = true;
            this.bb = true;
            mediaSurfaceView.setUseCrop(false);
            this.O = mediaSurfaceView;
        } else {
            MediaTextureView mediaTextureView = new MediaTextureView(this.j);
            if (oyu.k() >= 0) {
                mediaTextureView.setBackgroundColor(-16776961);
            }
            this.O = mediaTextureView;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "  initRenderView " + this.O);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "  initRenderView " + this.O);
        this.O.addRenderCallback(this);
        this.O.setVideoRotation(this.L);
        a(this.o.getVideoAspectRatio());
        this.E = this.O.getView();
    }

    private void Z() {
        ViewParent parent;
        g mediaTextureView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
        } else if (!this.aT && this.bc) {
        } else {
            this.aT = false;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " rebuildRenderView");
            if (this.bc) {
                parent = ((MediaSurfaceView) this.O).getParent();
            } else {
                parent = ((MediaTextureView) this.O).getParent();
            }
            this.aU.add(this.O.getView());
            if (this.O != null) {
                if (this.aU.size() == 1) {
                    if (this.bc) {
                        this.aV = ((MediaSurfaceView) this.O).getAspectRatio();
                    } else {
                        this.aV = ((MediaTextureView) this.O).getAspectRatio();
                    }
                }
                if (this.m != null && this.m.f != null) {
                    a(this.m.f, (Surface) null);
                }
                this.O.removeRenderCallback(this);
                this.O = null;
            }
            if (this.bc) {
                mediaTextureView = new MediaSurfaceView(this.j);
            } else {
                mediaTextureView = new MediaTextureView(this.j);
            }
            this.O = mediaTextureView;
            this.O.addRenderCallback(this);
            this.O.setVideoRotation(this.L);
            this.E = this.O.getView();
            View view = this.E;
            if (view != null) {
                ((ViewGroup) parent).addView(view, 0, new FrameLayout.LayoutParams(-2, -2, 17));
            }
            if (((this.E instanceof SurfaceView) && this.bE) || this.by) {
                aa();
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + " rebuildRenderView old:" + this.O + " new:" + this.O);
        }
    }

    private void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
            return;
        }
        while (this.aU.size() > 0) {
            View view = this.aU.get(0);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "  removeOldView " + view);
            if (view != null) {
                if (this.bc) {
                    ((ViewGroup) ((MediaSurfaceView) this.O).getParent()).removeView(view);
                } else {
                    ((ViewGroup) ((MediaTextureView) this.O).getParent()).removeView(view);
                }
            }
            this.aU.remove(0);
        }
        g gVar = this.O;
        if (gVar != null) {
            gVar.setAspectRatio(this.aV);
            f(this.aV);
        }
        this.aS = false;
    }

    @Override // com.taobao.mediaplay.player.b
    public void a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
        } else if (this.m != null && this.m.f != null) {
            if (!(this.m.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            ((TaobaoMediaPlayer) this.m.f)._setPropertyFloat(i, f);
        } else {
            if (this.t == null) {
                this.t = new SparseArray<>();
            }
            this.t.put(i, Float.valueOf(f));
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.m == null || this.m.f == null) {
        } else {
            if (((MonitorMediaPlayer) this.m.f).getConfig() != null) {
                ((MonitorMediaPlayer) this.m.f).getConfig().F = str;
            }
            if (((MonitorMediaPlayer) this.m.f).getCloneConfig() == null) {
                return;
            }
            ((MonitorMediaPlayer) this.m.f).getCloneConfig().F = str;
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.m == null || this.m.f == null) {
        } else {
            if (((MonitorMediaPlayer) this.m.f).getConfig() != null) {
                ((MonitorMediaPlayer) this.m.f).getConfig().B = str;
            }
            if (((MonitorMediaPlayer) this.m.f).getCloneConfig() == null) {
                return;
            }
            ((MonitorMediaPlayer) this.m.f).getCloneConfig().B = str;
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (this.m == null || this.m.f == null) {
        } else {
            if (((MonitorMediaPlayer) this.m.f).getConfig() != null) {
                ((MonitorMediaPlayer) this.m.f).getConfig().C = str;
            }
            if (((MonitorMediaPlayer) this.m.f).getCloneConfig() == null) {
                return;
            }
            ((MonitorMediaPlayer) this.m.f).getCloneConfig().C = str;
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", destroy " + this.h);
        try {
            if (this.o != null && this.o.mMediaPlayContext != null) {
                this.o.mMediaPlayContext.resumeFrameLock();
            }
            if (this.h != null && this.h.b() != null) {
                this.h.b().release();
            }
            if (this.bB != null) {
                this.bB.release();
                this.bB = null;
            }
        } catch (Throwable unused) {
        }
        S();
    }

    @Override // com.taobao.mediaplay.player.b
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
        } else if (this.m != null && this.m.f != null) {
            if (!(this.m.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            ((TaobaoMediaPlayer) this.m.f)._setPropertyLong(i, j);
        } else {
            if (this.s == null) {
                this.s = new SparseArray<>();
            }
            this.s.put(i, Long.valueOf(j));
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "textureVideoView=" + this + "startVideo##PlayState:" + this.m.e + " VideoUrl:" + this.f + ",playToken=" + this.o.mPlayToken);
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "fixSelectUrlNameEmptyAtStart", "true")) && !StringUtils.isEmpty(this.f) && this.f.contains("artc") && this.o != null && this.o.mMediaPlayContext != null) {
            this.o.mMediaPlayContext.mSelectedUrlName = MediaConstant.RTCLIVE_URL_NAME;
        }
        this.y = true;
        this.H = false;
        this.u = 1;
        G();
        if (this.o != null && this.o.getControlParams().get("keepScreenOnDoNotCarePlayerState") != null && com.taobao.taobaoavsdk.util.b.a(this.o.getControlParams().get("keepScreenOnDoNotCarePlayerState"))) {
            AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Keep screen on don't care playerstate");
            D();
        }
        if ((com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || oyu.bv) && this.o != null && this.o.getWarmupFlag()) {
            String str = this.m.f32509a;
            int i = this.m.b;
            int i2 = this.m.c;
            boolean z = this.m.d;
            int i3 = this.m.e;
            float f = this.m.i;
            int i4 = this.m.j;
            String str2 = this.m.l;
            AbstractMediaPlayer abstractMediaPlayer = this.m.f;
            tmz.g().a(true);
            tmz.g().a(str, this);
            tmz.g().a(false);
            this.m = ozi.g().b(str, this);
            this.m.b = i;
            this.m.c = i2;
            this.m.d = z;
            this.m.e = i3;
            this.m.f = abstractMediaPlayer;
            this.m.i = f;
            this.m.j = i4;
            this.m.l = str2;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "move warmup player to normal manager");
        }
        if (this.o != null && this.o.mMediaPlayContext != null) {
            if (!this.o.mMediaPlayContext.isMute() || this.m.i > 0.0f) {
                this.bs = false;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "sbt=" + this.o.mMediaPlayContext.mFrom + ",textureVideoview=" + this + " startVideo with mute tag=" + this.o.mMediaPlayContext.isMute() + ", volume=" + this.m.i + ", is_mute_prepare=" + this.bs);
        }
        if (this.m.d) {
            this.C = false;
            if (this.m.c == 4) {
                this.G = true;
            }
            F();
            this.m.c = 1;
            return;
        }
        this.m.b = 0;
        if (!this.C) {
            this.C = true;
            this.az = System.currentTimeMillis();
        }
        if (b(this.m.e) && !StringUtils.isEmpty(this.f)) {
            X();
            if (StringUtils.isEmpty(this.aA) && this.m.e != 3) {
                this.m.e = 8;
                this.m.d = false;
            }
        } else if (this.m != null && this.m.f != null && this.m.e == 5 && !StringUtils.isEmpty(this.f) && this.P) {
            D();
            this.m.f.start();
            t();
            V();
        } else if (this.m != null && this.m.f != null && !StringUtils.isEmpty(this.aA) && (this.m.e == 2 || this.m.e == 1 || this.m.e == 4)) {
            n();
        } else if (this.m != null && this.m.f != null && !StringUtils.isEmpty(this.aA) && this.m.e == 8) {
            a(this.m.f);
        }
        if (((!this.aQ && !this.aR) || !this.aS) && !this.by) {
            return;
        }
        Z();
        this.by = false;
    }

    private boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && str.startsWith(TaoLiveVideoView.TBLIVE_GRTN_SCHEMA) && this.o != null && this.o.mMediaPlayContext != null) {
            String str2 = this.o.mMediaPlayContext.mSelectedUrlName;
            if (!StringUtils.isEmpty(str2) && MediaConstant.RTCLIVE_URL_NAME.equals(str2)) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "warmup path is valid." + str);
                return true;
            }
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "warmup path is not valid. " + str);
        a((IMediaPlayer) null, 11002L, 0L, 0L, (Object) null);
        return false;
    }

    public void a(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d69515", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        if (MediaSystemUtils.isApkDebuggable() && this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "asyncPrepareVideo##PlayState:" + this.m.e);
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || oyu.bv) {
            String str = this.m.f32509a;
            int i = this.m.b;
            int i2 = this.m.c;
            boolean z = this.m.d;
            int i3 = this.m.e;
            float f = this.m.i;
            int i4 = this.m.j;
            String str2 = this.m.l;
            AbstractMediaPlayer abstractMediaPlayer = this.m.f;
            ozi.g().a(true);
            ozi.g().a(str, this);
            ozi.g().a(false);
            this.m = tmz.g().b(str, this);
            this.m.b = i;
            this.m.c = i2;
            this.m.d = z;
            this.m.e = i3;
            this.m.f = abstractMediaPlayer;
            this.m.i = f;
            this.m.j = i4;
            this.m.l = str2;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "move player to warmup manager");
        }
        this.H = false;
        this.z = true;
        this.u = 8;
        G();
        this.m.b = 0;
        if (this.m.d) {
            this.m.c = 5;
            F();
            this.C = false;
        } else if (!b(this.m.e) || StringUtils.isEmpty(this.f) || !f(this.f)) {
        } else {
            this.aD = true;
            this.o.setWarmupFlag(mediaLiveWarmupConfig.mWarmupFlag);
            this.o.setWarmupLevel(mediaLiveWarmupConfig.mWarmupLevel);
            X();
            if (!StringUtils.isEmpty(this.aA)) {
                return;
            }
            this.m.e = 8;
            this.m.d = false;
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (MediaSystemUtils.isApkDebuggable() && this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "asyncPrepareVideo##PlayState:" + this.m.e);
        }
        this.H = false;
        this.z = true;
        this.u = 8;
        G();
        this.m.b = 0;
        if (this.m.d) {
            this.m.c = 5;
            F();
            this.C = false;
        } else if (!b(this.m.e) || StringUtils.isEmpty(this.f)) {
        } else {
            this.o.setPrepareToFirstFrame(true);
            X();
            if (!StringUtils.isEmpty(this.aA)) {
                return;
            }
            this.m.e = 8;
            this.m.d = false;
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else if (this.o != null && this.o.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM) != null && com.taobao.taobaoavsdk.util.b.a(this.o.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM))) {
            AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "KeepScreeon do nothing");
        } else {
            try {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "keepScreenOn " + this.j + ", " + oyu.y());
                if (this.bn) {
                    if (this.bo) {
                        return;
                    }
                    this.bo = true;
                    oyu.w();
                }
                if (this.j != null && (this.j instanceof Activity) && oyu.y() > 0) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "keepScreenOn " + this.j + ", addFlags");
                    ((Activity) this.j).getWindow().addFlags(128);
                }
                if (!this.aI || this.k == null || !(this.k instanceof Activity) || oyu.y() <= 0) {
                    return;
                }
                ((Activity) this.k).getWindow().addFlags(128);
            } catch (Throwable unused) {
            }
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else if (this.o != null && this.o.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM) != null && com.taobao.taobaoavsdk.util.b.a(this.o.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM))) {
            AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "clearKeepScreeon do nothing");
        } else {
            try {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "clearKeepScreenOn " + this.j + ", " + oyu.y());
                if (this.bn) {
                    if (!this.bo) {
                        return;
                    }
                    this.bo = false;
                    oyu.x();
                    if (oyu.y() == 0) {
                        return;
                    }
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    if (this.j != null && (this.j instanceof Activity) && oyu.y() == 0) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "clearKeepScreenOn " + this.j + ", clearFlags");
                        ((Activity) this.j).getWindow().clearFlags(128);
                    }
                    if (!this.aI || this.k == null || !(this.k instanceof Activity) || oyu.y() != 0) {
                        return;
                    }
                    ((Activity) this.k).getWindow().clearFlags(128);
                    return;
                }
                if (this.j != null && (this.j instanceof Activity) && oyu.y() == 0) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.mediaplay.player.k.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "clearKeepScreenOn " + k.this.j + ", clearFlags");
                            ((Activity) k.this.j).getWindow().clearFlags(128);
                        }
                    });
                }
                if (!this.aI || this.k == null || !(this.k instanceof Activity) || oyu.y() != 0) {
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.mediaplay.player.k.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "clearKeepScreenOn " + k.this.j + ", clearFlags");
                        ((Activity) k.this.k).getWindow().clearFlags(128);
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        G();
        this.H = false;
        if (this.m.d) {
            if (this.m.c == 4) {
                this.G = true;
            }
            this.m.c = 1;
            this.az = System.currentTimeMillis();
            F();
            return;
        }
        if (!this.D) {
            this.C = true;
            this.az = System.currentTimeMillis();
        }
        try {
            if (this.m.i != 0.0f && this.ax != null) {
                h("playVideo");
            }
        } catch (Throwable unused) {
        }
        try {
            if (this.o != null) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, " playVideo##PlayState:" + this.m.e);
            }
            if (this.m == null || this.m.f == null || !this.y) {
                return;
            }
            if ((this.m.e != 2 && this.m.e != 5 && this.m.e != 4) || !this.P) {
                return;
            }
            String str = this.m.f32509a;
            if ((com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || oyu.bv) && this.o != null && this.o.getWarmupFlag() && tmz.g().b(str)) {
                this.m = this.o.mMediaPlayContext.mTBLive ? tmz.g().b(str, this) : ozm.h().b(str, this);
            } else {
                this.m = this.o.mMediaPlayContext.mTBLive ? ozi.g().b(str, this) : ozm.h().b(str, this);
            }
            if (this.o.mMediaPlayContext.isMute()) {
                a(0.0f);
            }
            D();
            this.m.f.start();
            if (ak() != null) {
                a(this.m.f, ak());
            }
            if (k() != null) {
                a(this.m.f, k());
            }
            if (!StringUtils.isEmpty(this.aA)) {
                c((IMediaPlayer) this.m.f);
            }
            a(this.m.f);
            if (this.m.e != 4 && this.m.e != 5) {
                v();
                V();
            }
            t();
            V();
        } catch (Throwable th) {
            String str2 = I;
            com.taobao.taobaoavsdk.util.c.b(str2, "playVideo >>> " + th.getMessage());
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        if (this.m.e != 8) {
            this.m.e = 0;
        }
        if ((com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || oyu.bv) && this.o != null && this.o.getWarmupFlag() && tmz.g().b(this.m.f32509a)) {
            this.m = this.o.mMediaPlayContext.mTBLive ? tmz.g().a(this.m) : ozm.h().a(this.m);
        } else {
            this.m = this.o.mMediaPlayContext.mTBLive ? ozi.g().a(this.m) : ozm.h().a(this.m);
        }
        if (this.m.f == null) {
            this.m.f = K();
            this.m.e = 8;
        } else {
            a(this.m.f);
        }
        if (ak() != null) {
            a(this.m.f, ak());
        }
        if (k() != null) {
            a(this.m.f, k());
        }
        this.m.f.setLooping(this.at);
    }

    public void G() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        this.m.k = true;
        ozn oznVar = this.m;
        if (this.m.c != 2) {
            i = this.m.c;
        }
        oznVar.c = i;
    }

    @Override // com.taobao.mediaplay.player.b
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.m.k = (!this.m.k || z) ? this.m.k : z;
        this.N = z;
        this.u = 2;
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "pauseVideo##PlayState:" + this.m.e);
        }
        if (this.m.f == null || this.m.e != 1) {
            return;
        }
        E();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "yezo:pause in pauseVideo");
        this.m.f.pause();
        if (this.o.mMediaPlayContext.mTBLive) {
            ozi.g().c();
        } else {
            ozm.h().c();
        }
        c(z);
        W();
    }

    @Override // com.taobao.mediaplay.player.b
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            W();
            a(i, false);
            if ((this.m.e != 5 && this.m.e != 2 && this.m.e != 4 && this.m.e != 1) || this.H) {
                return;
            }
            d(i);
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else if (i < 0 || this.m == null || this.m.f == null) {
        } else {
            W();
            b(i, z, z2);
            if (z) {
                this.m.e = 2;
            }
            if ((this.m.e != 5 && this.m.e != 2 && this.m.e != 4 && this.m.e != 1) || this.H) {
                return;
            }
            d(i);
        }
    }

    private void b(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e02a03a", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else if (this.m.e != 5 && this.m.e != 2 && this.m.e != 4 && this.m.e != 1) {
        } else {
            if (i > p()) {
                i = p();
            }
            if (this.m.f instanceof TaobaoMediaPlayer) {
                ((TaobaoMediaPlayer) this.m.f).seekTo(i, z, z2);
            }
            this.m.f.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompletionListener() { // from class: com.taobao.mediaplay.player.k.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
                public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
                        return;
                    }
                    k.a(k.this, true);
                    k.a(k.this);
                }
            });
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.m.e != 5 && this.m.e != 2 && this.m.e != 4 && this.m.e != 1) {
        } else {
            if (i > p()) {
                i = p();
            }
            if (z) {
                b(this.m.f, i);
            } else {
                a(this.m.f, i);
            }
            this.m.f.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompletionListener() { // from class: com.taobao.mediaplay.player.k.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
                public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
                    } else {
                        k.a(k.this);
                    }
                }
            });
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void a(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ec33a3", new Object[]{this, mediaPlayScreenType});
        } else {
            b(mediaPlayScreenType);
        }
    }

    @Override // com.taobao.mediaplay.player.b, tb.ozn.a
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        if (this.m.f != null && this.m.e != 0 && this.m.e != 8 && this.m.e != 3 && this.m.e != 6) {
            return this.m.f.isPlaying();
        }
        return false;
    }

    @Override // com.taobao.mediaplay.player.b
    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : (this.m.f == null || this.m.e == 0 || this.m.e == 8 || this.m.e == 3 || this.m.e == 6) ? false : true;
    }

    @Override // tb.ozn.a
    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        Rect rect = new Rect();
        View view = this.E;
        if (view == null) {
            return false;
        }
        return view.getVisibility() == 0 || this.E.getGlobalVisibleRect(rect);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
        } else if (this.H || this.m == null || this.m.f == null) {
        } else {
            if (this.m.e != 1 && this.m.e != 4) {
                return;
            }
            E();
            ozm.h().c();
            long p = p();
            if (p >= 0) {
                long p2 = p();
                if (p2 > 0) {
                    i = s();
                }
                a((int) p, i, (int) p2);
            }
            w();
            W();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.aP && this.ag) {
            this.ag = false;
            this.o.mMediaPlayContext.mSeamlessSwitchingSelectName = null;
            this.ah = 0L;
            this.ai = false;
            this.ae = false;
            if (!StringUtils.isEmpty(this.aM)) {
                a("-1", this.aM, this.o.mMediaPlayContext.mSeamlessSwitchingSelectName, "{\"msg\":\"rtc switch fail\", \"error\":-4}");
                this.aM = null;
                this.o.mMediaPlayContext.mSwitchingPlayerQualityItem = null;
            }
        }
        if (this.o != null) {
            ddg ddgVar = this.o.mMediaPlayContext.mTLogAdapter;
            com.taobao.taobaoavsdk.util.c.c(ddgVar, "onError##VideoOnError >>> what: " + i + ", extra :" + i2 + ",videoURL:" + this.f);
        }
        E();
        this.C = false;
        this.aD = false;
        this.o.setWarmupFlag(false);
        this.o.setWarmupLevel(1);
        this.ag = false;
        if (!this.H && this.m != null && this.m.f != null) {
            if (this.m.d) {
                this.m.d = false;
            }
            ozm.h().c();
            String videoDefinition = this.o.mMediaPlayContext.getVideoDefinition();
            if (this.o.mScenarioType == 0 && !StringUtils.isEmpty(this.f) && !this.f.contains(".flv")) {
                this.m.e = 3;
                this.by = true;
                this.aT = true;
                if (a(i, i2)) {
                    ddg ddgVar2 = this.o.mMediaPlayContext.mTLogAdapter;
                    com.taobao.taobaoavsdk.util.c.c(ddgVar2, "notifyMediaRetry##VideoOnError >>> what: " + i + ", extra :" + i2 + ",videoURL:" + this.f);
                    return true;
                }
            } else if (!StringUtils.isEmpty(videoDefinition) && videoDefinition.contains("266")) {
                this.m.e = 3;
                this.by = true;
                this.aT = true;
                this.o.mMediaPlayContext.mHasVVCErrorEver = true;
                if (this.o.mMediaPlayContext.mDegradeCode == 0 && a(i, i2)) {
                    ddg ddgVar3 = this.o.mMediaPlayContext.mTLogAdapter;
                    com.taobao.taobaoavsdk.util.c.c(ddgVar3, "vvc notifyMediaRetry##VideoOnError >>> what: " + i + ", extra :" + i2 + ",videoURL:" + this.f);
                    return true;
                }
            }
            this.by = true;
            this.aT = true;
            this.o.mMediaPlayContext.mLastPlayError = i;
            a(iMediaPlayer, i, i2);
        }
        return true;
    }

    @Override // com.taobao.mediaplay.player.b
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (this.as == null || !this.bc || !this.D) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", notifySurfaceTextureUpdate " + this.D + ", mForseUseSurfaceView=" + this.bc + ", mRenderView=" + this.O);
            if (this.bE && (this.E instanceof SurfaceView)) {
                this.as.a(this, this.bD);
                if (!this.bD || this.bt) {
                    return;
                }
                this.bu = System.currentTimeMillis();
                if (this.o != null) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "playToken=" + this.o.mPlayToken + ",yezo: notifySurfaceTextureUpdate with surfaceView and mFirstFrameUpdateTs=" + System.currentTimeMillis());
                }
                a(this.bu);
                this.bt = true;
                a((IMediaPlayer) null, 12101L, this.bu, 0L, (Object) null);
                return;
            }
            this.as.a(this, true);
            if (this.bt) {
                return;
            }
            this.bu = System.currentTimeMillis();
            if (this.o != null) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "playToken=" + this.o.mPlayToken + ",yezo: notifySurfaceTextureUpdate with surfaceView and mFirstFrameUpdateTs=" + System.currentTimeMillis());
            }
            a(this.bu);
            this.bt = true;
            a((IMediaPlayer) null, 12101L, this.bu, 0L, (Object) null);
        }
    }

    public void ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab633caf", new Object[]{this});
            return;
        }
        this.bt = false;
        if (this.o == null) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "playToken=" + this.o.mPlayToken + ",yezo: reset mSetFirstSurfaceUpdate");
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        boolean z;
        Pair<String, String> newDefintionByIndex;
        MediaLiveInfo mediaLiveInfo;
        g gVar;
        g gVar2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (MediaSystemUtils.isApkDebuggable()) {
            com.taobao.taobaoavsdk.util.c.a("TBDWInstance", " onInfo >>> what: " + j + ", extra :" + j2);
        }
        long j4 = 0;
        if (3 == j) {
            if ((this.aQ || this.aR) && this.aS && this.aU.size() > 0) {
                aa();
            }
            if (this.D) {
                return true;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("RENDER_START_TIME", Long.valueOf(this.az));
            if (this.az != 0) {
                j4 = j2 > 0 ? j2 : System.currentTimeMillis();
            }
            this.D = true;
            hashMap.put("RENDER_END_TIME", Long.valueOf(j4));
            a(iMediaPlayer, j, j2, j3, hashMap);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", firstframe " + this.as + ", " + this.bc);
            u();
            return true;
        } else if (740 == j) {
            u();
            return true;
        } else {
            if (711 == j && MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "-->commitMediaPlayerRender open file time:" + j2 + " file_find_stream_info_time:" + j3);
            } else if (10001 == j) {
                int i = (int) j2;
                this.L = i;
                g gVar3 = this.O;
                if (gVar3 != null) {
                    gVar3.setVideoRotation(i);
                }
            } else if (715 == j) {
                String str2 = (String) obj;
                this.p = str2;
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SEI STRUCT: " + str2 + ",pts: " + j3);
            } else if (10003 == j && d() == 1) {
                String str3 = this.m.f32509a;
                if (this.o.mMediaPlayContext.mTBLive) {
                    ozi.g().a(str3, this);
                } else {
                    ozm.h().a(str3, this);
                }
                l();
            } else if (723 == j) {
                int i2 = this.aj;
                if (i2 == 0) {
                    ag();
                } else {
                    this.ar.sendEmptyMessageDelayed(1, i2);
                }
                if (MediaSystemUtils.isApkDebuggable()) {
                    Context context = this.o.getContext();
                    Toast.makeText(context, "切成功流耗时" + j2 + " ms", 1).show();
                }
            } else {
                String str4 = "";
                if (747 == j) {
                    if (MediaSystemUtils.isApkDebuggable()) {
                        Toast.makeText(this.o.getContext(), "切流超时失败", 1).show();
                    }
                    if (this.aP && this.ag) {
                        ((TaobaoMediaPlayer) this.m.f).updateSeamlessSwitchStatus(2, str4 + (System.currentTimeMillis() - this.ah));
                        this.ag = false;
                        this.ah = 0L;
                        this.ai = false;
                        this.ae = false;
                        if (!StringUtils.isEmpty(this.aM)) {
                            a("-1", this.aM, this.o.mMediaPlayContext.mSeamlessSwitchingSelectName, "{\"msg\":\"rtc switch fail\", \"error\":-4}");
                            str = null;
                            this.aM = null;
                            this.o.mMediaPlayContext.mSwitchingPlayerQualityItem = null;
                        } else {
                            str = null;
                        }
                        this.o.mMediaPlayContext.mSeamlessSwitchingSelectName = str;
                    }
                } else if (724 == j) {
                    if (MediaSystemUtils.isApkDebuggable()) {
                        Toast.makeText(this.o.getContext(), "切流超时失败", 1).show();
                    }
                    if (this.O != null && (gVar2 = this.ad) != null) {
                        gVar2.getView().setVisibility(4);
                        g gVar4 = this.ad;
                        if (gVar4 instanceof MediaTextureView) {
                            ((ViewGroup) ((MediaTextureView) gVar4).getParent()).removeView(this.ad.getView());
                        } else if (gVar4 instanceof MediaSurfaceView) {
                            ((ViewGroup) ((MediaSurfaceView) gVar4).getParent()).removeView(this.ad.getView());
                        }
                        this.ad = null;
                        this.am = 0;
                        this.al = 0;
                        this.ak = null;
                    }
                    ((TaobaoMediaPlayer) this.m.f).updateSeamlessSwitchStatus(2, str4 + (System.currentTimeMillis() - this.ah));
                    this.o.mMediaPlayContext.mSeamlessSwitchingSelectName = null;
                    this.ag = false;
                    this.ah = 0L;
                    this.ai = false;
                    this.ae = false;
                    if (!StringUtils.isEmpty(this.aM)) {
                        a("-1", this.aM, this.o.mMediaPlayContext.mSeamlessSwitchingSelectName, "{\"msg\":\"error when switch fail\", \"error\":-4}");
                        this.aM = null;
                        this.o.mMediaPlayContext.mSwitchingPlayerQualityItem = null;
                    }
                } else if (j == 727) {
                    if (this.ag) {
                        this.an = (int) j2;
                        this.ao = (int) j3;
                    }
                } else if (j == 728) {
                    if (this.ag && (gVar = this.ad) != null) {
                        gVar.setVideoRotation((int) j2);
                    }
                } else if (j == 729) {
                    if (this.ag) {
                        this.ap = (int) j2;
                        this.aq = (int) j3;
                        ae();
                    }
                } else if (!StringUtils.isEmpty(this.f) && ((this.o.mScenarioType == 0 || this.o.mScenarioType == 1) && this.f.contains(".flv") && !this.f.contains(".m3u8") && !this.f.contains(keu.SUFFIX_MP4) && 10004 == j && ((d() == 1 || d() == 8 || d() == 5) && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "degradeMcodecDecodeError", "true")) && this.o.mMediaPlayContext.mTBLive))) {
                    if (this.o.mMediaPlayContext.mTBLive) {
                        ozi.g().a(this.m.f32509a, this);
                        oyu.c = false;
                        this.o.mMediaPlayContext.setHardwareHevc(false);
                        this.o.mMediaPlayContext.setHardwareAvc(false);
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + this + ", degradeMcodecDecodeError");
                        l();
                    }
                } else {
                    boolean z2 = false;
                    if (StringUtils.isEmpty(this.f) || (!(this.o.mScenarioType == 0 || this.o.mScenarioType == 1) || (!(10005 == j || 10006 == j) || (!(d() == 1 || d() == 8 || d() == 5) || !com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEGRADE_RENDER_EGL, "true")) || !this.o.mMediaPlayContext.mTBLive)))) {
                        if (12110 == j) {
                            String str5 = (String) obj;
                            boolean z3 = "ud".equals(str5) || MediaConstant.DEFINITION_UD_60.equals(str5);
                            boolean z4 = !z3 || (this.T && !this.ab);
                            if (!StringUtils.isEmpty(str5) && z4 && (mediaLiveInfo = this.o.mMediaPlayContext.mMediaLiveInfo) != null && mediaLiveInfo.liveUrlList != null) {
                                if (iMediaPlayer != null && (iMediaPlayer instanceof TaobaoMediaPlayer)) {
                                    str4 = ((TaobaoMediaPlayer) iMediaPlayer).getPlayingLiveDefinition();
                                }
                                HashMap hashMap2 = new HashMap();
                                for (int i3 = 0; i3 < mediaLiveInfo.liveUrlList.size(); i3++) {
                                    QualityLiveItem qualityLiveItem = mediaLiveInfo.liveUrlList.get(i3);
                                    if (str5.equals(qualityLiveItem.newDefinition)) {
                                        hashMap2.put("recomDefinition", str5);
                                        hashMap2.put("recomDefinitionName", qualityLiveItem.newName);
                                    }
                                    if (!StringUtils.isEmpty(str4) && str4.equals(qualityLiveItem.newDefinition) && !this.ac) {
                                        hashMap2.put("currentDefinition", str4);
                                        hashMap2.put("currentDefinitionName", qualityLiveItem.newName);
                                    }
                                }
                                if (hashMap2.containsKey("recomDefinition")) {
                                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SwitchLiveLevel currentDefinition=" + str4 + ", recomDefinition=" + str5 + ", rtcAutoSwitch:" + this.S + ", reason:" + j2);
                                    if (this.R && this.S) {
                                        z2 = true;
                                    }
                                    if (iMediaPlayer != null && (iMediaPlayer instanceof TaobaoMediaPlayer)) {
                                        ((TaobaoMediaPlayer) iMediaPlayer).updateAbrRequestSwitchCount(z3, z2);
                                    }
                                    if (z2 && iMediaPlayer != null && (iMediaPlayer instanceof TaobaoMediaPlayer)) {
                                        ((TaobaoMediaPlayer) iMediaPlayer).monitorRtcLiveAbrReason((int) j2);
                                    }
                                    if (z2) {
                                        hashMap2.put("reasonCode", String.valueOf(j2));
                                        a(iMediaPlayer, 12003L, z3 ? 1L : -1L, 0L, hashMap2);
                                        a(1, str5);
                                        return true;
                                    }
                                    a(iMediaPlayer, 12001L, z3 ? 1L : -1L, 0L, hashMap2);
                                }
                            }
                            return true;
                        }
                        z = true;
                        if (j == 12002) {
                            if (iMediaPlayer == null || !(iMediaPlayer instanceof TaobaoMediaPlayer)) {
                                return true;
                            }
                            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) iMediaPlayer;
                            int i4 = (int) j2;
                            int i5 = -1;
                            if (i4 == 1 || i4 == -1) {
                                if (this.aK) {
                                    long vPMSessioinId = taobaoMediaPlayer.getVPMSessioinId();
                                    if (vPMSessioinId > 0) {
                                        HashMap<String, String> hAMetrics = VPMManagerInstance.getInstance().getHAMetrics(vPMSessioinId, "RefNetSpeed");
                                        int min = hAMetrics.containsKey("last_media_speed_mean") ? (int) Math.min(com.taobao.taobaoavsdk.util.b.d(hAMetrics.get("last_media_speed_mean")) * 8.0f, 2147483647L) : -1;
                                        if (hAMetrics.containsKey("last_media_speed_max")) {
                                            i5 = (int) Math.min(com.taobao.taobaoavsdk.util.b.d(hAMetrics.get("last_media_speed_max")) * 8.0f, 2147483647L);
                                        }
                                        if (min > 0 && i5 > 0) {
                                            newDefintionByIndex = this.o.mMediaPlayContext.getNewDefintionByNetSpeed(i4, min, i5);
                                        }
                                    }
                                    newDefintionByIndex = null;
                                } else {
                                    newDefintionByIndex = this.o.mMediaPlayContext.getNewDefintionByIndex(i4);
                                }
                                Pair<String, String> pair = newDefintionByIndex;
                                if (pair == null) {
                                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " SwtichLiveLevel can't find switch level.");
                                    return true;
                                }
                                taobaoMediaPlayer.useAdaptiveLiveDeciseResult();
                                if (this.T || "hd".equals(pair.first) || MediaConstant.DEFINITION_HD_60.equals(pair.first)) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("recomDefinition", pair.first);
                                    hashMap3.put("recomDefinitionName", pair.second);
                                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SwtichLiveLevel switchLevel=" + i4 + ", eventObject=" + hashMap3);
                                    a(iMediaPlayer, 12001L, (long) i4, 0L, hashMap3);
                                }
                            }
                            return true;
                        }
                        a(iMediaPlayer, j, j2, j3, obj);
                        return z;
                    }
                    ozi.g().a(this.m.f32509a, this);
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + this + ", degradeEGLRender");
                    l();
                }
            }
            z = true;
            a(iMediaPlayer, j, j2, j3, obj);
            return z;
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public Map<String, String> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a6370f4", new Object[]{this});
        }
        if (this.m != null && this.m.f != null) {
            return this.m.f.getQos();
        }
        return null;
    }

    public void a(AbstractMediaPlayer abstractMediaPlayer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0a131d", new Object[]{this, abstractMediaPlayer, new Long(j)});
        } else if (abstractMediaPlayer == null) {
        } else {
            abstractMediaPlayer.seekTo(j);
        }
    }

    public void b(AbstractMediaPlayer abstractMediaPlayer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e685e", new Object[]{this, abstractMediaPlayer, new Long(j)});
        } else if (abstractMediaPlayer == null) {
        } else {
            abstractMediaPlayer.instantSeekTo(j);
        }
    }

    public void c(AbstractMediaPlayer abstractMediaPlayer, long j) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b2bd9f", new Object[]{this, abstractMediaPlayer, new Long(j)});
            return;
        }
        if (!this.aF) {
            if ((this.o.mMediaPlayContext.mTBLive || this.o.mMediaPlayContext.mEmbed) && this.o.mScenarioType != 2) {
                z = true;
            }
            if (!StringUtils.isEmpty(this.f)) {
                if (this.f.contains(".flv")) {
                    return;
                }
                if (z && this.f.contains(".m3u8")) {
                    return;
                }
            }
        }
        a(abstractMediaPlayer, j);
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        if (this.m != null && this.m.f != null) {
            int i = this.m.c;
            if (i == 2) {
                c(this.m.f, this.m.b);
                return true;
            } else if (i == 4) {
                c(this.m.f, this.m.b);
                return true;
            } else if (i == 1) {
                c(this.m.f, this.m.b);
                this.m.f.start();
                return true;
            }
        }
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
        } else if (this.H || this.m == null || this.m.f == null) {
        } else {
            if (this.o != null) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onPrepared##PlayState:" + this.m.e);
            }
            try {
                if (this.m.i != 0.0f && this.ax != null && !this.B) {
                    h(MessageID.onPrepared);
                }
            } catch (Throwable unused) {
            }
            if (H() && this.m.d) {
                if (this.m.c == 2) {
                    this.m.e = 2;
                } else if (this.m.c == 4) {
                    this.m.e = 4;
                } else if (this.m.c == 1) {
                    V();
                    if (this.G) {
                        t();
                    } else {
                        v();
                    }
                } else if (this.m.c == 5) {
                    a(iMediaPlayer);
                }
                this.m.d = false;
                a(-1);
                this.G = false;
                return;
            }
            if (!this.N) {
                a(iMediaPlayer);
            }
            if (this.o.mMediaPlayContext.mSeekWhenPrepared != 0) {
                a(this.o.mMediaPlayContext.mSeekWhenPrepared, false, this.o.mMediaPlayContext.mSeekIgnorePauseStateWhenPrepared);
                this.o.mMediaPlayContext.mSeekWhenPrepared = 0;
                this.o.mMediaPlayContext.mSeekIgnorePauseStateWhenPrepared = false;
            }
            if (this.u == 1 && this.m.f != null && this.P) {
                D();
                this.m.f.start();
                t();
                V();
            } else if ((this.u != 1 || !this.P) && this.m.f != null) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "yezo:pause in mTargetState != MediaPlayState.PLAYING ");
                this.m.f.pause();
            }
            if (this.m.b <= 0 || this.m.f == null) {
                return;
            }
            a(this.m.f, this.m.b);
        }
    }

    private Bitmap b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c1533407", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", createAlphaBitmapInner width=" + i + ", height=" + i2 + ",roundRectWidth=" + i3 + ", roundRectHeight=" + i4);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        canvas.drawRoundRect(rectF, (float) i3, (float) i4, paint);
        return createBitmap;
    }

    public boolean a(AbstractMediaPlayer abstractMediaPlayer, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f66f81cb", new Object[]{this, abstractMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (abstractMediaPlayer != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
                z = true;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " createAlphaImageIfNeeded start width=" + i + ", height=" + i2 + ", roundWidth=" + i3 + ", roundHeight=" + i4 + ", mHasSetAlphaBitmap=" + this.ba + ", mEnableAlphaBitmap=" + this.aZ + ", hasTaobaoPlayer=" + z);
            if (this.aZ && this.aY == null && i > 0 && i2 > 0 && z) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " start createBitmap");
                this.aY = b(i, i2, i3, i4);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " finish createBitmap");
            }
            if (this.aY != null && z && !this.ba) {
                this.aY = b(i, i2, i3, i4);
                ((TaobaoMediaPlayer) abstractMediaPlayer).setAlphaBitmap(this.aY);
                this.ba = true;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " finish createAlphaImageIfNeeded mAlphaBitmap=" + this.aY + ", time=" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable unused) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "createAlphaImageIfNeeded exception");
        }
        return true;
    }

    public boolean a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d16212c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        if (this.m != null && this.m.f != null && (this.m.f instanceof TaobaoMediaPlayer)) {
            return a(this.m.f, i, i2, i3, i4);
        }
        return false;
    }

    private void c(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59eff2a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            if (!this.aZ || this.aY == null || this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer) || i <= 0 || i2 <= 0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " start updateAlphaImageIfNeeded");
            this.aY = b(i, i2, i3, i4);
            ((TaobaoMediaPlayer) this.m.f).updateAlphaBitmap(this.aY);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " finish updateAlphaImageIfNeeded mAlphaBitmap=" + this.aY + ", time=" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable unused) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "updateAlphaImageIfNeeded exception");
        }
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " releaseAlphaBitmap");
        if (this.aZ && this.aY != null && this.m != null && this.m.f != null && (this.m.f instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) this.m.f).releaseAlphaBitmap();
            this.aY = null;
            this.ba = false;
        }
        return true;
    }

    private void ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
        } else if (this.bh) {
        } else {
            this.bh = true;
            if (this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            HashMap hashMap = new HashMap();
            String str = MediaConstant.CMD_SET_SURFACE_TIME;
            hashMap.put(str, "" + (this.bg - this.bf));
            ((TaobaoMediaPlayer) this.m.f).callWithMsg(hashMap);
        }
    }

    private void ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[]{this});
        } else if (!this.bj || this.O == null || this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this.m.f;
            if (this.bc) {
                taobaoMediaPlayer.setShowViewParant((ViewGroup) ((MediaSurfaceView) this.O).getParent());
            } else {
                taobaoMediaPlayer.setShowViewParant((ViewGroup) ((MediaTextureView) this.O).getParent());
            }
        }
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void a(g.b bVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a5bd8", new Object[]{this, bVar, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.bf > 0 && this.bg == 0) {
            this.bg = System.currentTimeMillis();
            ab();
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ",playToken=" + this.o.mPlayToken + "onSurfaceCreated width=" + i + ", height=" + i2 + ", mSurfaceWidth=" + this.c + ", mSurfaceHeight=" + this.d);
        }
        String currentPageName = com.ut.mini.l.getInstance().getCurrentPageName();
        if (bVar != null && this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ",playToken=" + this.o.mPlayToken + " SeamlessSwitch onSurfaceCreated holder: " + bVar + ", surface: " + bVar.b() + ", currentPagename=" + currentPageName);
        }
        ac();
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onSurfaceTextureAvailable##PlayState=" + this.m.e);
        }
        if (this.ae && bVar.c() && !this.ai) {
            Surface b2 = (!this.bA || ak() == null) ? bVar.b() : ak();
            if (!(this.m.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch onSurfaceCreated sub stream set surface ok");
            ((TaobaoMediaPlayer) this.m.f).seamlessSwitchStream(b2);
            this.ak = bVar;
            return;
        }
        boolean z2 = this.h != null && this.bc;
        this.h = bVar;
        if (this.c == i && this.d == i2) {
            z = false;
        }
        this.c = i;
        this.d = i2;
        int i3 = this.be;
        a(i, i2, i3, i3);
        u();
        if ((!this.y && !this.z) || this.m.d || this.m.e == 6 || this.m == null || this.m.f == null) {
            return;
        }
        if (z2) {
            a(this.m.f, (Surface) null);
        }
        a(this.m.f, k());
        if (!z || i <= 0 || i2 <= 0) {
            return;
        }
        this.m.f.setSurfaceSize(i, i2);
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void a(g.b bVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b11922b", new Object[]{this, bVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String currentPageName = com.ut.mini.l.getInstance().getCurrentPageName();
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ",playToken=" + this.o.mPlayToken + "  onSurfaceChanged holder: " + bVar + ", format: " + i + ", width: " + i2 + ", height: " + i3 + ", currentPageName=" + currentPageName);
        }
        ac();
        boolean z2 = this.c > 0 && this.d > 0 && !(this.c == i2 && this.d == i3);
        this.c = i2;
        this.d = i3;
        if (this.ae && bVar.c() && !this.ai) {
            if (!(this.m.f instanceof TaobaoMediaPlayer) || bVar != this.ak) {
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch onSurfaceChanged " + i2 + ", " + i3);
            this.m.f.setSurfaceSize(i2, i3);
        } else if (bVar.a() != this.O) {
        } else {
            this.h = bVar;
            if (!z2) {
                int i4 = this.be;
                a(i2, i3, i4, i4);
            } else {
                int i5 = this.be;
                c(i2, i3, i5, i5);
            }
            if (this.by && com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "resetSurfaceWhenError", "true"))) {
                z = true;
            }
            if ((this.o.mVRLive || z) && this.m != null && this.m.f != null) {
                if (ak() != null) {
                    a(this.m.f, ak());
                } else if (bVar.b() != null) {
                    a(this.m.f, bVar.b());
                }
            }
            if (this.m != null && this.m.f != null && z2) {
                this.m.f.setSurfaceSize(i2, i3);
            }
            TaoLiveVideoView.d dVar = this.F;
            if (dVar != null) {
                dVar.a();
            }
            if (this.bE && (this.E instanceof SurfaceView)) {
                if (this.bF == null && i2 > 1 && i3 > 1) {
                    this.bF = bVar;
                    this.bG = true;
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get first holder = " + this.bF);
                }
                if (this.bG && bVar != this.bF) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mFirstHolder=" + this.bF + ",current Holder=" + bVar + ". IsReadyToHideCover");
                    this.bD = true;
                }
            }
            u();
        }
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void a(g.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192b685c", new Object[]{this, bVar, new Boolean(z)});
            return;
        }
        if (this.bx && (this.E instanceof SurfaceView)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "try to updateCoverBitMapFromSurfaceView at onSurfaceDestroyed");
            aj();
        }
        String currentPageName = com.ut.mini.l.getInstance().getCurrentPageName();
        if (bVar != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ",playToken=" + this.o.mPlayToken + " onSurfaceDestroyed holder: " + bVar + ", surface: " + bVar.b() + ", currentPagename=" + currentPageName);
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onSurfaceDestroyed##PlayState =" + this.m.e);
        }
        if (this.ae && bVar.c() && this.ak == bVar) {
            return;
        }
        if ((this.m.e == 5 || this.m.e == 4 || this.m.e == 2 || this.m.e == 1) && Build.VERSION.SDK_INT < A) {
            a(this.m.f, (Surface) null);
            this.h = null;
            I();
        }
        if (z && this.m != null && this.m.f != null && this.bc) {
            a(this.m.f, (Surface) null);
            this.h = null;
            I();
        }
        this.m.b = getCurrentPosition();
        TaoLiveVideoView.d dVar = this.F;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else if (this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            String str = "1";
            if (this.o != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(",playToken=");
                sb.append(this.o.mPlayToken);
                sb.append(" onWindowVisibilityChanged visibility=");
                sb.append(i == 0 ? str : "0");
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
            }
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this.m.f;
            HashMap hashMap = new HashMap();
            String str2 = MediaConstant.CMD_SET_VIEW_VISIBLE;
            if (i != 0) {
                str = "0";
            }
            hashMap.put(str2, str);
            taobaoMediaPlayer.callWithMsg(hashMap);
        }
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
        } else if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableNullCurrentActivity", "true"))) {
            WeakReference<Activity> weakReference = this.aW;
            Activity activity = weakReference == null ? null : weakReference.get();
            if (this.o != null) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ",playToken=" + this.o.mPlayToken + " onAttachedToWindow mContext=" + this.j + ", mCurrentActitity=" + activity);
            }
            this.bj = true;
            if (!this.bm || this.j == null || activity == null || !this.bk) {
                return;
            }
            this.bk = false;
            this.aT = true;
            Z();
            ac();
        } else {
            if (this.o != null) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ",playToken=" + this.o.mPlayToken + " onAttachedToWindow mContext=" + this.j + ", mCurrentActitity=" + this.bl);
            }
            this.bj = true;
            if (!this.bm || this.j == null || this.bl == null || !this.bk) {
                return;
            }
            this.bk = false;
            this.aT = true;
            Z();
            ac();
        }
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
            return;
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ",playToken=" + this.o.mPlayToken + " onDetachedFromWindow");
        }
        this.bj = false;
        if (this.bm && this.m != null && this.m.f != null && (this.m.f instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) this.m.f).setShowViewParant(null);
        }
        View view = this.E;
        if (!(view instanceof SurfaceView) || !((MediaSurfaceView) view).getSurfaceDestroyed()) {
            return;
        }
        ((MediaSurfaceView) this.E).releaseSurfaceControl();
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void a(g.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53647978", new Object[]{this, bVar});
            return;
        }
        if (this.D && !this.bt) {
            this.bu = System.currentTimeMillis();
            if (this.o != null) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "playToken=" + this.o.mPlayToken + ",yezo: onSurfaceUpdate and mFirstFrameUpdateTs=" + System.currentTimeMillis() + ",playToken=" + this.o.mPlayToken);
            }
            a(this.bu);
            this.bt = true;
            a((IMediaPlayer) null, 12101L, this.bu, 0L, (Object) null);
        }
        i iVar = this.as;
        if (iVar == null) {
            return;
        }
        iVar.a(this, true);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (!this.bv || this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            HashMap hashMap = new HashMap();
            String str = MediaConstant.CMD_SET_FIRST_FRAME_UPDATE_TIME;
            hashMap.put(str, "" + j);
            ((TaobaoMediaPlayer) this.m.f).callWithMsg(hashMap);
            this.bv = false;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2aeaa0", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onVideoSizeChanged##Video width:" + i + ", height:" + i2);
        }
        c(iMediaPlayer);
        a((IMediaPlayer) null, 302L, i, i2, (Object) null);
        if (!this.o.mEnableNewTBPlayer || i <= i2 || this.o.getVideoAspectRatio() != MediaAspectRatio.DW_CENTER_CROP) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onVideoSizeChanged##Video width:" + i + ", height:" + i2 + ", set DW_FIT_CENTER");
        a(MediaAspectRatio.DW_FIT_CENTER);
    }

    private void c(IMediaPlayer iMediaPlayer) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488a514c", new Object[]{this, iMediaPlayer});
            return;
        }
        this.f18050a = iMediaPlayer.getVideoWidth();
        this.b = iMediaPlayer.getVideoHeight();
        if (this.f18050a <= 0 || this.b <= 0) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch set renderView w=" + this.f18050a + ", h=" + this.b);
        if (this.O != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch set mRenderView renderView w=" + this.f18050a + ", h=" + this.b);
            this.O.setVideoSize(this.f18050a, this.b);
        }
        int videoSarNum = iMediaPlayer.getVideoSarNum();
        int videoSarDen = iMediaPlayer.getVideoSarDen();
        if (videoSarNum > 0 && videoSarDen > 0 && (gVar = this.O) != null) {
            gVar.setVideoSampleAspectRatio(videoSarNum, videoSarDen);
        }
        g gVar2 = this.O;
        if (gVar2 == null) {
            return;
        }
        gVar2.requestLayout();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f723554e", new Object[]{this, iMediaPlayer, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        if ((this.m.e == 5 || this.m.e == 1 || this.m.e == 4 || this.m.e == 2) && this.m.f != null) {
            this.M = (int) this.m.f.getDuration();
        }
        return this.M;
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        if (MediaSystemUtils.isApkDebuggable() && this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "asyncPrepareVideo##PlayState:" + this.m.e);
        }
        this.H = false;
        this.z = true;
        this.u = 8;
        G();
        this.m.b = 0;
        if (this.m.d) {
            this.m.c = 5;
            F();
            this.C = false;
        } else if (!b(this.m.e) || StringUtils.isEmpty(this.f)) {
        } else {
            X();
            if (!StringUtils.isEmpty(this.aA)) {
                return;
            }
            this.m.e = 8;
            this.m.d = false;
        }
    }

    public AbstractMediaPlayer K() {
        TaobaoMediaPlayer taobaoMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractMediaPlayer) ipChange.ipc$dispatch("480da931", new Object[]{this});
        }
        AbstractMediaPlayer abstractMediaPlayer = null;
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initPlayer##PlayState:" + this.m.e + ",videoURL:" + this.f);
        }
        com.taobao.taobaoavsdk.Tracer.b.a(this.o.mAnalysis);
        com.taobao.taobaoavsdk.widget.media.c cVar = new com.taobao.taobaoavsdk.widget.media.c(this.o.mMediaPlayContext.mBusinessId);
        if (MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "useTaoBaoPlayer", "true"))) {
            this.o.mMediaPlayContext.setPlayerType(3);
        } else if (!this.o.mMediaPlayContext.mEmbed) {
            this.o.mMediaPlayContext.setPlayerType(1);
        }
        if (MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.b(Build.MODEL, MediaAdapteManager.mConfigAdapter.getConfig(this.o.mMediaPlayContext.mConfigGroup, "ijkPlayerBlackList", ""))) {
            this.o.mMediaPlayContext.setPlayerType(3);
        }
        if (MediaAdapteManager.mConfigAdapter != null) {
            String str = this.o.mMediaPlayContext.mBusinessId;
            if (!StringUtils.isEmpty(this.o.mMediaPlayContext.getFrom())) {
                str = str + "-" + this.o.mMediaPlayContext.getFrom();
            }
            this.o.mMediaPlayContext.setPlayerType(com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter, "DWInteractive", this.o.mMediaPlayContext.mBusinessId, str, this.o.mMediaPlayContext.getPlayerType()));
        }
        if (Build.VERSION.SDK_INT <= 18 && this.o.mMediaPlayContext.getPlayerType() == 3 && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.o.mMediaPlayContext.mConfigGroup, "AndroidJBUseIJK", "true"))) {
            this.o.mMediaPlayContext.setPlayerType(1);
        }
        if (this.o.mMediaPlayContext.getPlayerType() == 2 && this.f.contains(".m3u8")) {
            this.o.mMediaPlayContext.setPlayerType(1);
        }
        if (!StringUtils.isEmpty(this.f) && this.f.contains(TaoLiveVideoView.TBLIVE_ARTP_SCHEMA) && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblive", "ARTPUseIJK", "false"))) {
            this.o.mMediaPlayContext.setPlayerType(1);
        }
        if (!StringUtils.isEmpty(this.f) && this.f.contains(TaoLiveVideoView.TBLIVE_GRTN_SCHEMA) && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblive", "BFRTCUseIJK", "false"))) {
            this.o.mMediaPlayContext.setPlayerType(1);
        }
        cVar.bi = this.o.mAnalysis;
        cVar.q = this.o.mMediaPlayContext.mConfigGroup;
        cVar.aX = this.o.mMediaPlayContext.mHasChooseS266;
        cVar.f21365a = this.o.mMediaPlayContext.getPlayerType();
        cVar.b = (this.o.mMediaPlayContext.mTBLive || this.o.mMediaPlayContext.mEmbed) ? this.o.mScenarioType : 2;
        cVar.A = this.o.mUserId;
        cVar.C = this.o.mMediaPlayContext.mAccountId;
        cVar.y = this.o.mMediaPlayContext.getFrom();
        cVar.B = this.o.mMediaPlayContext.mVideoId;
        cVar.D = this.o.mMediaPlayContext.getVideoDefinition();
        cVar.Q = this.o.mMediaPlayContext.getRateAdapte();
        cVar.E = this.o.mMediaPlayContext.getVideoSource();
        cVar.r = this.o.mMediaPlayContext.getCacheKey();
        cVar.S = this.o.mMediaPlayContext.mSVCEnable;
        cVar.O = this.o.mMediaPlayContext.mTBLive ? this.o.mMediaPlayContext.mDropFrameForH265 : false;
        cVar.U = this.o.mMediaPlayContext.mLowQualityUrl;
        cVar.aQ = this.o.mMediaPlayContext.mDegradeToFlvByArtoSoNoReady;
        cVar.Y = this.o.mMediaPlayContext.mOnlyVideoEnable && this.o.mMediaPlayContext.isMute();
        cVar.ao = this.o.mMediaPlayContext.getForceMuteMode();
        cVar.aY = this.o.mMediaPlayContext.mChooseVVCReason.getValue();
        if (!StringUtils.isEmpty(this.o.mMediaPlayContext.getHighCachePath())) {
            cVar.s = this.o.mMediaPlayContext.getHighCachePath();
            cVar.D = this.o.mMediaPlayContext.mHighVideoDefinition;
        }
        cVar.o = this.o.mMediaPlayContext.isUseTBNet();
        if (this.o.mMediaPlayContext.mTBLive || this.o.mMediaPlayContext.mEmbed) {
            cVar.g = (!this.o.mMediaPlayContext.isHardwareHevc() || !oyu.c) ? 0 : 1;
            cVar.f = (!this.o.mMediaPlayContext.isHardwareAvc() || !oyu.c) ? 0 : 1;
        } else {
            cVar.g = this.o.mMediaPlayContext.isHardwareHevc() ? 1 : 0;
            cVar.f = this.o.mMediaPlayContext.isHardwareAvc() ? 1 : 0;
        }
        if (cVar.f == 0) {
            if ((this.o.mMediaPlayContext.mTBLive || this.o.mMediaPlayContext.mEmbed) && !oyu.c) {
                cVar.aO = 4;
            } else {
                cVar.aO = 5;
            }
        }
        if (cVar.g == 0) {
            if ((this.o.mMediaPlayContext.mTBLive || this.o.mMediaPlayContext.mEmbed) && !oyu.c) {
                cVar.aP = 4;
            } else {
                cVar.aP = 5;
            }
        }
        cVar.F = this.o.mMediaPlayContext.mMediaSourceType;
        cVar.R = this.o.mMediaPlayContext.mSelectedUrlName;
        cVar.P = true;
        cVar.t = this.o.mPlayToken;
        cVar.H = this.o.mMediaPlayContext.getDevicePerformanceLevel() + "/runtimeLevel:" + this.o.mMediaPlayContext.mRuntimeLevel;
        if (MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.o.mMediaPlayContext.mConfigGroup, "videoLengthEnable", "true")) && this.o.mMediaPlayContext.getVideoLength() > 0 && this.o.mMediaPlayContext.getVideoLength() < 262144000) {
            cVar.u = this.o.mMediaPlayContext.getVideoLength();
        }
        cVar.K = this.o.mMediaPlayContext.getNetSpeed();
        cVar.bb = this.o.mMediaPlayContext.getNetWorkQuality();
        cVar.bc = this.o.mMediaPlayContext.getGlobalCurrentBandWidth();
        cVar.bd = this.o.mMediaPlayContext.getGlobalPredictBandWidth();
        cVar.ag = this.o.mUseCache;
        cVar.L = this.o.mMediaPlayContext.isVideoDeviceMeaseureEnable();
        cVar.M = this.o.mMediaPlayContext.mHighPerformancePlayer;
        StringBuilder sb = new StringBuilder();
        sb.append(this.o.mMediaPlayContext.getRateAdaptePriority());
        sb.append("#");
        sb.append(this.o.mMediaPlayContext.isH265() ? "h265" : "h264");
        cVar.N = sb.toString();
        if (this.o.getPlayExpUTParams() != null) {
            cVar.aa = new HashMap();
            cVar.aa.putAll(this.o.getPlayExpUTParams());
            if (obw.VIDEO_ACTION_TYPE_UPDOWNSWITCH.equals(cVar.aa.get("liveActionType"))) {
                this.bE = false;
            }
        }
        cVar.ab = this.o.getCustomParams();
        if (this.o.getControlParams() != null) {
            cVar.be = new HashMap();
            cVar.be.putAll(this.o.getControlParams());
            if (!StringUtils.isEmpty(cVar.be.get("LiveRoomInit"))) {
                this.bE = com.taobao.taobaoavsdk.util.b.a(cVar.be.get("LiveRoomInit"));
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: get LiveRoomInit=" + this.bE + " from addControlParams");
            }
        }
        cVar.ac = this.o.mConnectTimeout;
        cVar.ad = this.o.mReadTimeout;
        cVar.ae = this.o.mRetryTime;
        cVar.ai = this.o.getPrepareToFirstFrame();
        cVar.al = this.o.getWarmupFlag();
        cVar.am = this.o.getWarmupLevel();
        cVar.an = this.o.getStartPos();
        cVar.ap = this.o.mSwitchStreamABId;
        cVar.aq = this.o.mSwitchStreamEnable;
        cVar.as = this.o.mUsingInterface;
        cVar.W = this.o.mPlayScenes;
        cVar.at = this.o.getAudioOnly();
        cVar.au = this.o.mLivePushControlInfo;
        cVar.aZ = this.o.mEnterVoiceRoom;
        cVar.av = this.o.mDynamicPlayEx;
        cVar.aw = this.o.mSwitchScene;
        cVar.ax = this.o.mSwitchSceneTime;
        cVar.ay = this.o.mIsFloat;
        cVar.aF = this.o.mMediaPlayContext.mUseLowSpeedPolicy;
        cVar.aG = this.o.mMediaPlayContext.mLowSpeedPolicyABId;
        cVar.aH = this.o.mMediaPlayContext.mLowSpeedPolicy;
        cVar.aK = this.o.mMediaPlayContext.isLiveRoom();
        cVar.aI = this.o.mMediaPlayContext.mSelectDefinitionReason;
        cVar.aJ = this.o.mMediaPlayContext.mEnableAdaptiveLiveSwitch;
        cVar.aM = this.o.mMediaPlayContext.mLastPlayError;
        cVar.aN = this.aO;
        this.aO = 0L;
        this.o.mMediaPlayContext.mLastPlayError = 0;
        cVar.aL = this.o.mMediaPlayContext.mSelectFlvUrlReason;
        if (this.o.mMediaPlayContext.mSelectedUrlName == MediaConstant.RTCLIVE_URL_NAME) {
            this.o.mMediaPlayContext.mSelectFlvUrlReason = 13;
        } else {
            this.o.mMediaPlayContext.mSelectFlvUrlReason = 12;
        }
        cVar.aA = this.o.mMediaPlayContext.mSelectDefinitionSpeed;
        cVar.aV = this.o.mMediaPlayContext.mEnableLiveRtcWeakNetFlag;
        cVar.aW = this.o.mMediaPlayContext.mLiveRtcWeakNetFlag;
        cVar.bf = this.o.mMediaPlayContext.mLiveRtcWeakNetSVCDrop;
        cVar.bg = this.o.mMediaPlayContext.mEnableLiveRtcHomePageCardSVCDrop;
        cVar.aB = this.o.mMediaPlayContext.mLiveDefinition1080AvgBitrate;
        cVar.aC = this.o.mMediaPlayContext.mLiveDefinition1080MaxBitrate;
        cVar.ba = this.o.mMediaPlayContext.mLiveMaxBitrate;
        cVar.aD = this.o.mMediaPlayContext.mSelectDefinition;
        cVar.aE = this.o.mMediaPlayContext.mEnableCdnStartPlaySpeed;
        cVar.aR = this.bc;
        cVar.aS = this.bi;
        cVar.aT = this.aZ;
        cVar.aU = this.bb;
        cVar.bj = this.o.mMediaPlayContext.mReleaseByCustom;
        cVar.bk = this.o.mMediaPlayContext.mSetPauseFrameLock;
        Map<String, String> uTParams = this.o.getUTParams();
        if (uTParams != null) {
            String str2 = uTParams.get("product_type");
            if (!StringUtils.isEmpty(str2)) {
                cVar.z = str2;
            }
            String str3 = uTParams.get("spm-cnt");
            if (!StringUtils.isEmpty(str3)) {
                cVar.az = str3;
            }
        }
        if (b() != null && b().startsWith("content://")) {
            this.o.mMediaPlayContext.setPlayerType(2);
        }
        if (this.o != null && (this.o.mMediaPlayContext.getPlayerType() == 3 || this.o.mMediaPlayContext.getPlayerType() == 1)) {
            try {
                cVar.aj = this.o.getNeedCommitUserToFirstFrame();
                if (this.o != null && MediaAdapteManager.mConfigAdapter != null) {
                    taobaoMediaPlayer = new TaobaoMediaPlayer(this.j, MediaAdapteManager.mConfigAdapter);
                } else {
                    taobaoMediaPlayer = new TaobaoMediaPlayer(this.j);
                }
                abstractMediaPlayer = taobaoMediaPlayer;
                ((TaobaoMediaPlayer) abstractMediaPlayer).addExperienceInfo(this.o.mMediaPlayContext.mExperienceIdSet, this.o.mMediaPlayContext.mExperienceReleaseIdSet, this.o.mMediaPlayContext.mExperienceBucketIdSet);
                ab();
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initPlayer##TaobaoMediaPlayer load error:" + th.getMessage());
                c(abstractMediaPlayer);
                abstractMediaPlayer = a(cVar);
            }
        } else {
            abstractMediaPlayer = a(cVar);
        }
        try {
            a(abstractMediaPlayer, cVar);
        } catch (Throwable th2) {
            if (this.o != null) {
                com.taobao.taobaoavsdk.util.c.c(this.o.mMediaPlayContext.mTLogAdapter, "initPlayer##  prepare player error" + th2.getMessage());
            }
            if (abstractMediaPlayer != null) {
                c(abstractMediaPlayer);
                try {
                    if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                        abstractMediaPlayer = a(cVar);
                        a(abstractMediaPlayer, cVar);
                    }
                    if (this.aX) {
                        b(2010, 0);
                    } else {
                        ad();
                    }
                } catch (Throwable unused) {
                    com.taobao.taobaoavsdk.util.c.c(this.o.mMediaPlayContext.mTLogAdapter, "initPlayer##backup mediaplayer it error:");
                    if (this.aX) {
                        b(IMediaPlayer.MEDIA_INFO_PLAYER_INIT_FAILED_ERROR, 0);
                    } else {
                        ad();
                    }
                }
            }
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", initPlayer " + abstractMediaPlayer + ",playToken=" + this.o.mPlayToken);
        return abstractMediaPlayer;
    }

    private void a(IMediaPlayer iMediaPlayer, g.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f6f556", new Object[]{this, iMediaPlayer, bVar});
        } else if (iMediaPlayer == null) {
        } else {
            if (bVar == null) {
                iMediaPlayer.setSurface(null);
            } else {
                bVar.a(iMediaPlayer);
            }
        }
    }

    private void c(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cbf1c5", new Object[]{this, abstractMediaPlayer});
        } else if (abstractMediaPlayer == null) {
        } else {
            try {
                abstractMediaPlayer.release();
            } catch (Throwable unused) {
            }
        }
    }

    private void ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1cc72a", new Object[]{this});
            return;
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + this + ", notifyVideoErrorForInit,playToken=" + this.o.mPlayToken);
        }
        try {
            a((IMediaPlayer) null, 1, 0);
        } catch (Throwable unused) {
        }
    }

    private void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + this + ", notifyVideoError, errorCode=" + i + ", extra=" + i2 + ",playToken=" + this.o.mPlayToken);
        }
        try {
            a((IMediaPlayer) null, i, i2);
        } catch (Throwable unused) {
        }
    }

    private boolean g(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue();
        }
        if (this.o.mMediaPlayContext.mQualityLiveItem == null) {
            return false;
        }
        if (MediaConstant.MINI_BFRTC_URL_NAME.equals(str)) {
            String str3 = this.o.mMediaPlayContext.mQualityLiveItem.rtcLiveUrl;
            if (str3 != null) {
                this.o.mMediaPlayContext.mSeamlessSwitchingSelectName = MediaConstant.RTCLIVE_URL_NAME;
                MediaPlayControlContext mediaPlayControlContext = this.o.mMediaPlayContext;
                mediaPlayControlContext.mSeamlessSwitchingVideoPath = str3 + "&grtn_fix_ts_reset=off&ali_stream_jitter=0";
                a(this.o.mMediaPlayContext.mSeamlessSwitchingVideoPath, MediaConstant.RTCLIVE_URL_NAME);
                return true;
            }
            String str4 = this.o.mMediaPlayContext.mQualityLiveItem.bfrtcUrl;
            if (str4 != null) {
                this.o.mMediaPlayContext.mSeamlessSwitchingSelectName = MediaConstant.BFRTC_URL_NAME;
                this.o.mMediaPlayContext.mSeamlessSwitchingVideoPath = str4;
                a(str4, MediaConstant.BFRTC_URL_NAME);
                return true;
            }
        } else if ((MediaConstant.BFRTC_URL_NAME.equals(str) || MediaConstant.RTCLIVE_URL_NAME.equals(str)) && (str2 = this.o.mMediaPlayContext.mQualityLiveItem.liveUrlMiniBfrtc) != null) {
            this.o.mMediaPlayContext.mSeamlessSwitchingSelectName = MediaConstant.MINI_BFRTC_URL_NAME;
            this.o.mMediaPlayContext.mSeamlessSwitchingVideoPath = str2;
            a(str2, MediaConstant.MINI_BFRTC_URL_NAME);
            return true;
        }
        return false;
    }

    private void ae() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2adeab", new Object[]{this});
        } else if (this.an <= 0 || this.ao <= 0 || this.ad == null || this.o == null) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch requestVideoLayoutForSwitchSurface set mChangeStreamRenderView renderView w=" + this.an + ", h=" + this.ao + ",playToken=" + this.o.mPlayToken);
            this.ad.setVideoSize(this.an, this.ao);
            int i2 = this.ap;
            if (i2 > 0 && (i = this.aq) > 0) {
                this.ad.setVideoSampleAspectRatio(i2, i);
            }
            this.ad.requestLayout();
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else if (!this.ag) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "stopSwitch " + this);
            this.ai = true;
            this.ar.removeMessages(1);
            if (MediaSystemUtils.isApkDebuggable()) {
                Toast.makeText(this.o.getContext(), "切流停止", 1).show();
            }
            if (!(this.m.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            ((TaobaoMediaPlayer) this.m.f).stopSwitch();
        }
    }

    public boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0aa0e8b", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.o.mMediaPlayContext.mQualityLiveItem == null || this.o.mMediaPlayContext.mSelectedUrlName == null || this.ag) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "canSwitchStream " + z + ", failed for " + this.o.mMediaPlayContext.mQualityLiveItem + ", mSwitchStreaming=" + this.ag);
            return false;
        }
        if (z) {
            String str = this.o.mMediaPlayContext.mQualityLiveItem.liveUrlMiniBfrtc;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "canSwitchStream " + z + ", check for " + this.o.mMediaPlayContext.mSelectedUrlName + ", miniBfrtcUrl=" + str);
            if ((MediaConstant.RTCLIVE_URL_NAME.equals(this.o.mMediaPlayContext.mSelectedUrlName) || MediaConstant.BFRTC_URL_NAME.equals(this.o.mMediaPlayContext.mSelectedUrlName)) && !StringUtils.isEmpty(str)) {
                return true;
            }
        } else {
            String str2 = this.o.mMediaPlayContext.mQualityLiveItem.rtcLiveUrl;
            String str3 = this.o.mMediaPlayContext.mQualityLiveItem.bfrtcUrl;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "canSwitchStream " + z + ", check for " + this.o.mMediaPlayContext.mSelectedUrlName + ", rtcLiveUrl=" + str2 + ", bfrtcUrl=" + str3);
            if (MediaConstant.MINI_BFRTC_URL_NAME.equals(this.o.mMediaPlayContext.mSelectedUrlName) && (!StringUtils.isEmpty(str2) || !StringUtils.isEmpty(str3))) {
                return true;
            }
        }
        return false;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " SeamlessSwitch TextureVideoView seamlessSwitchStream");
        if (this.m.f instanceof TaobaoMediaPlayer) {
            this.ag = true;
            this.ah = System.currentTimeMillis();
            if (this.o != null) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch sub stream set surface ok " + this.af + ",playToken=" + this.o.mPlayToken);
            }
            if (!oyu.a(this.j) && !g(this.o.mMediaPlayContext.mSelectedUrlName)) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setSeamlessSwitchUrlAndName failed");
                return;
            }
            if (this.af) {
                this.ae = true;
                View C = C();
                if (C != null) {
                    C.setVisibility(0);
                    g gVar = this.O;
                    if (gVar instanceof MediaTextureView) {
                        ((ViewGroup) ((MediaTextureView) gVar).getParent()).addView(C, 0, new FrameLayout.LayoutParams(-2, -2, 17));
                    } else if (gVar instanceof MediaSurfaceView) {
                        ((ViewGroup) ((MediaSurfaceView) gVar).getParent()).addView(C, 0, new FrameLayout.LayoutParams(-2, -2, 17));
                    }
                }
            }
            boolean z2 = this.o.mMediaPlayContext.mSwitchingLower;
            if (oyu.a(this.j)) {
                ((TaobaoMediaPlayer) this.m.f).setSeamlessSwitchOption(this.af ? 1 : 0, z, false);
                if (this.af) {
                    return;
                }
                ((TaobaoMediaPlayer) this.m.f).seamlessSwitchStream(null);
                return;
            } else if (b() != null) {
                ((TaobaoMediaPlayer) this.m.f).updateSeamlessSwitchStatus(0, "0");
                ((TaobaoMediaPlayer) this.m.f).setSeamlessSwitchOption(this.af ? 1 : 0, z, z2);
                if (this.af) {
                    return;
                }
                ((TaobaoMediaPlayer) this.m.f).seamlessSwitchStream(null);
                return;
            } else {
                a((IMediaPlayer) null, 724L, 0L, 0L, (Object) null);
                return;
            }
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch TextureVideoView seamlessSwitchStream fail for not TaobaoMediaPlayer");
    }

    public void a(boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2709489d", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        this.af = z2;
        if (!(this.m.f instanceof TaobaoMediaPlayer)) {
            return;
        }
        ((TaobaoMediaPlayer) this.m.f).setSeamlessSwitchOption(z, i, z2);
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (!(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            ((TaobaoMediaPlayer) this.m.f).setSeamlessSwitchUrl(str);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setSeamlessSwitchUrl: " + str + ", selectName=" + str2);
            ((TaobaoMediaPlayer) this.m.f).setSeamlessSwitchUrl(str, str2);
        }
    }

    public void a(int i, String str) {
        QualityLiveItem qualityLiveItem;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        this.aN = i;
        if (this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer) || this.o.mMediaPlayContext.mPlayerQualityItem == null || StringUtils.isEmpty(str)) {
            a("-1", str, "", "{\"msg\":\"error when init\", \"error\":-5}");
            return;
        }
        boolean z4 = "ud".equals(str) || MediaConstant.DEFINITION_UD_60.equals(str);
        if (this.ag) {
            if (this.Q && this.S && i + 1 == 2) {
                boolean equals = str.equals(this.aM);
                if (z4 && !"ud".equals(this.aM) && !MediaConstant.DEFINITION_UD_60.equals(this.aM)) {
                    z3 = true;
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " switchToNewDefinition: " + str + ", discard redundant abr request for duplicate_switch_at_switching:" + equals + ", up_switch_at_down_switching:" + z3);
                ((TaobaoMediaPlayer) this.m.f).updateAbrRedundantRequestSwitchCount(z4);
                return;
            }
            String str2 = this.aM;
            if (str2 == null) {
                str2 = "";
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " switchToNewDefinition: " + str + ", currentSwitchingNewDefinition:" + str2 + ", rtcLiveAutoSwitch:" + this.S + ", reason:" + i);
            if (this.Q) {
                a("0", str, MediaConstant.RTCLIVE_URL_NAME, "{\"msg\":\"duplicate switch success\"}");
                return;
            } else {
                a("-1", str, "", "{\"msg\":\"error when switching\", \"error\":-5}");
                return;
            }
        }
        String a2 = com.taobao.mediaplay.i.a(((TaobaoMediaPlayer) this.m.f).getPlayUrl());
        int i2 = this.o.mMediaPlayContext.mPlayerQualityItem.index;
        String str3 = this.o.mMediaPlayContext.mPlayerQualityItem.newDefinition == null ? "" : this.o.mMediaPlayContext.mPlayerQualityItem.newDefinition;
        ArrayList<QualityLiveItem> arrayList = this.o.mMediaPlayContext.mMediaLiveInfo.liveUrlList;
        int i3 = -1;
        if (arrayList != null) {
            QualityLiveItem qualityLiveItem2 = null;
            boolean z5 = true;
            int i4 = -1;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                if (str.equals(arrayList.get(i5).newDefinition)) {
                    qualityLiveItem2 = arrayList.get(i5);
                    i4 = i5;
                }
                if (this.X && !StringUtils.isEmpty(arrayList.get(i5).newDefinition) && a2.equals(com.taobao.mediaplay.i.a(arrayList.get(i5).rtcLiveUrl)) && i5 != i2) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " switchToNewDefinition stream index not consistent playingInex: " + i2 + riy.BRACKET_START_STR + str3 + "), realStreamIndex: " + i5 + riy.BRACKET_START_STR + arrayList.get(i5).newDefinition + riy.BRACKET_END_STR);
                    z5 = false;
                }
            }
            z = z5;
            qualityLiveItem = qualityLiveItem2;
            i3 = i4;
        } else {
            qualityLiveItem = null;
            z = true;
        }
        if (qualityLiveItem == null || (i3 == i2 && z)) {
            a("-1", str, "", "{\"msg\":\"error when can't select live item\", \"error\":-6}");
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " switchToNewDefinition error when can't select live item switchIndex:" + i3 + ", streamIndexConsistent:" + z);
            if (!this.Q || !this.S || i + 1 != 2) {
                return;
            }
            ((TaobaoMediaPlayer) this.m.f).updateAbrRedundantRequestSwitchCount(z4);
            return;
        }
        String str4 = qualityLiveItem.rtcLiveUrl;
        this.o.mMediaPlayContext.pauseFrameLock(qualityLiveItem);
        if (!StringUtils.isEmpty(str4)) {
            this.o.mMediaPlayContext.mSeamlessSwitchingSelectName = MediaConstant.RTCLIVE_URL_NAME;
            if (str4.contains("&rtclive=1")) {
                this.o.mMediaPlayContext.mSeamlessSwitchingVideoPath = str4 + "&grtn_fix_ts_reset=off&ali_stream_jitter=0";
            } else {
                this.o.mMediaPlayContext.mSeamlessSwitchingVideoPath = str4 + "&grtn_fix_ts_reset=off&ali_stream_jitter=0&rtclive=1";
            }
            a(this.o.mMediaPlayContext.mSeamlessSwitchingVideoPath, MediaConstant.RTCLIVE_URL_NAME);
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            a((IMediaPlayer) null, 724L, 0L, 0L, (Object) null);
            a("-1", str, "", "{\"msg\":\"error when no rtclive and no bfrtc\", \"error\":-3}");
        } else if (b() == null) {
            a((IMediaPlayer) null, 724L, 0L, 0L, (Object) null);
            a("-1", str, "", "{\"msg\":\"error when can't select switch url\", \"error\":-2}");
        } else {
            this.ag = true;
            this.ah = System.currentTimeMillis();
            this.ae = true;
            this.aM = str;
            PlayerQualityItem create = PlayerQualityItem.create(qualityLiveItem.name, qualityLiveItem.newName, qualityLiveItem.definition, qualityLiveItem.newDefinition, i3);
            create.current = true;
            this.o.mMediaPlayContext.mSwitchingPlayerQualityItem = create;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            int i6 = i + 1;
            sb.append(i6);
            sb.append("#");
            sb.append(this.aM);
            ((TaobaoMediaPlayer) this.m.f).updateSeamlessSwitchStatus(0, sb.toString());
            ((TaobaoMediaPlayer) this.m.f).updateLastStreamSelectReason(i6);
            ((TaobaoMediaPlayer) this.m.f).setSeamlessSwitchOption(1, true, false);
            ((TaobaoMediaPlayer) this.m.f)._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SWITCH_STREAM_TIMEOUT, com.taobao.taobaoavsdk.util.b.b(OrangeConfig.getInstance().getConfig("DWInteractive", TaobaoMediaPlayer.ORANGE_SWITCH_STREAM_NEW_DEFIINITION_TIMEOUT, "2000")));
            if (this.af) {
                View C = C();
                if (C == null) {
                    return;
                }
                C.setVisibility(0);
                g gVar = this.O;
                if (gVar instanceof MediaTextureView) {
                    ((ViewGroup) ((MediaTextureView) gVar).getParent()).addView(C, 0, new FrameLayout.LayoutParams(-2, -2, 17));
                    return;
                } else if (!(gVar instanceof MediaSurfaceView)) {
                    return;
                } else {
                    ((ViewGroup) ((MediaSurfaceView) gVar).getParent()).addView(C, 0, new FrameLayout.LayoutParams(-2, -2, 17));
                    return;
                }
            }
            ((TaobaoMediaPlayer) this.m.f).switchToNewDefinition(i6, str);
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else if (!this.R) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setLiveDefinitionAutoSwitch: " + this + " rtcLiveAutoSwitch: " + this.S + " => " + z);
            this.S = z;
            if (this.m == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            ((TaobaoMediaPlayer) this.m.f).setLiveDefinitionAutoSwitch(z);
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else if (this.aL == null) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, str);
            hashMap.put("newDefinition", str2);
            hashMap.put("protocol", str3);
            hashMap.put("detail", str4);
            hashMap.put("reason", "" + this.aN);
            if (this.R) {
                hashMap.put("autoSwitch", this.S ? "1" : "0");
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "notifySwitchInfo: " + this + " result: " + hashMap);
            this.aL.c(hashMap);
        }
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbb2f93", new Object[]{this, jVar});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setIMediaSwitchListener: " + this + " " + jVar);
        this.aL = jVar;
    }

    private AbstractMediaPlayer a(com.taobao.taobaoavsdk.widget.media.c cVar) {
        NativeMediaPlayer nativeMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractMediaPlayer) ipChange.ipc$dispatch("3e530a40", new Object[]{this, cVar});
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + this + ", degradeMediaPlayer,playToken=" + this.o.mPlayToken);
        }
        if (this.o != null && MediaAdapteManager.mConfigAdapter != null) {
            nativeMediaPlayer = new NativeMediaPlayer(this.j, MediaAdapteManager.mConfigAdapter);
        } else {
            nativeMediaPlayer = new NativeMediaPlayer(this.j);
        }
        this.o.mMediaPlayContext.setHardwareAvc(true);
        this.o.mMediaPlayContext.setHardwareHevc(true);
        cVar.g = 1;
        cVar.f = 1;
        this.o.mMediaPlayContext.setPlayerType(2);
        if (!StringUtils.isEmpty(this.o.mMediaPlayContext.getBackupVideoUrl()) && this.o.mMediaPlayContext.isH265()) {
            this.f = this.o.mMediaPlayContext.getBackupVideoUrl();
            this.o.mMediaPlayContext.setVideoUrl(this.f);
            this.o.mMediaPlayContext.setVideoDefinition(this.o.mMediaPlayContext.getBackupVideoDefinition());
            this.o.mMediaPlayContext.setCacheKey(this.o.mMediaPlayContext.getBackupCacheKey());
            if (cVar != null) {
                cVar.D = this.o.mMediaPlayContext.getBackupVideoDefinition();
                cVar.r = this.o.mMediaPlayContext.getBackupCacheKey();
            }
        }
        return nativeMediaPlayer;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b8 A[LOOP:1: B:87:0x02b8->B:96:0x02e0, LOOP_START, PHI: r5 
      PHI: (r5v3 int) = (r5v0 int), (r5v4 int) binds: [B:86:0x02b6, B:96:0x02e0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(tv.danmaku.ijk.media.player.AbstractMediaPlayer r18, com.taobao.taobaoavsdk.widget.media.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mediaplay.player.k.a(tv.danmaku.ijk.media.player.AbstractMediaPlayer, com.taobao.taobaoavsdk.widget.media.c):void");
    }

    private void b(AbstractMediaPlayer abstractMediaPlayer, com.taobao.taobaoavsdk.widget.media.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc7c1e3", new Object[]{this, abstractMediaPlayer, cVar});
        } else if (!(abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
        } else {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer;
            if (!taobaoMediaPlayer.isRtcUrl(b())) {
                return;
            }
            this.W = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "GrtnRtcLiveAdaptionEnable", "true"));
            this.ab = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "GrtnRtcLiveAdaptionSwitchUdDisable", "false"));
            this.ac = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "RtcLiveAdaptionNotifyCurDefinitionDisable", "false"));
            this.R = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "RtcLiveDefinitionAutoSwitchEnable", "true"));
            this.Q = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "RtcLiveAbrSwitchingProcessEnable", "true"));
            boolean isLowPerformance = this.o.mMediaPlayContext.isLowPerformance();
            this.T = !isLowPerformance;
            if (isLowPerformance && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "RtcLiveBandwidthProbeForLowDeviceDisable", "true"))) {
                taobaoMediaPlayer._setOption(1, "artp_bandwidth_probe_disable", 1L);
            }
            if (com.taobao.taobaoavsdk.util.b.b(cVar.C, OrangeConfig.getInstance().getConfig("DWInteractive", "abrAnchorBlackList", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264))) {
                this.V = true;
            }
            String lowSpeedArtpCommonParamsJson = this.o.mMediaPlayContext.getLowSpeedArtpCommonParamsJson();
            if (!StringUtils.isEmpty(lowSpeedArtpCommonParamsJson)) {
                taobaoMediaPlayer._setOption(1, "artp_weak_net_common_params", lowSpeedArtpCommonParamsJson);
            }
            if (!this.V) {
                oyu.R();
                this.W = this.W && oyu.mUseRtcAbr.get();
                this.Y = oyu.mUseRtcAbrId.get();
                this.Z = oyu.mRtcAdaptionParamJson.get();
                this.aa = oyu.mRtcSwitchParamJson.get();
                this.X = oyu.mRtcAbrDynamicEnable.get();
                if (this.R) {
                    this.R = oyu.mRtcAdaptionAutoSwitch.get();
                }
                if (isLowPerformance) {
                    this.T = oyu.mEnableLowDeviceSwitchUd.get();
                }
            }
            this.U = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enRtcSwitch", "true"));
            if (!this.U) {
                taobaoMediaPlayer._setPropertyLong(80002, 0L);
            }
            new HashMap();
            StringBuilder sb = new StringBuilder();
            sb.append("en_rtc_switch=");
            sb.append(this.U ? 1 : 0);
            sb.append(",");
            sb.append("adaption_abtest_id=");
            sb.append(this.Y);
            sb.append(",");
            sb.append("en_rtc_abr=");
            sb.append((!this.U || !this.W) ? 0 : 1);
            taobaoMediaPlayer.setDynamicPlayExParam(sb.toString());
            if (!this.U) {
                return;
            }
            taobaoMediaPlayer.setEnableRtcSwitch(true);
            this.af = false;
            this.aj = 0;
            if (this.W && cVar.aJ) {
                taobaoMediaPlayer._setOption(1, "artp_play_start_stream_json", this.o.mMediaPlayContext.getRtcSwitchLiveInfo(this.o.mMediaPlayContext.mMediaLiveInfo));
            }
            if (this.W && this.R) {
                taobaoMediaPlayer.setLiveDefinitionAutoSwitch(this.o.mMediaPlayContext.isLiveDefinitionAutoSwitch());
            }
            if (this.W && !StringUtils.isEmpty(this.Z)) {
                taobaoMediaPlayer._setOption(1, "artp_adaption_param_json", this.Z);
            }
            if (StringUtils.isEmpty(this.aa)) {
                return;
            }
            taobaoMediaPlayer._setOption(1, "artp_switch_param_json", this.aa);
        }
    }

    @Override // tb.ozn.a
    public void release(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88058386", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + this + ", release: " + z + ",playToken=" + this.o.mPlayToken);
        }
        this.L = 0;
        this.C = false;
        this.ba = false;
        this.D = false;
        this.o.mMediaPlayContext.mSeekWhenPrepared = 0;
        this.o.setPrepareToFirstFrame(false);
        this.aD = false;
        this.o.setWarmupFlag(false);
        this.o.setWarmupLevel(1);
        try {
            if (this.m != null && this.m.f != null) {
                this.m.f.resetListeners();
                if (this.m.f instanceof TaobaoMediaPlayer) {
                    TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this.m.f;
                    HashMap hashMap = new HashMap();
                    hashMap.put(MediaConstant.CMD_SET_RECYCEL_REASON, this.H ? "1" : "0");
                    String str = MediaConstant.CMD_UPDATE_PLAY_EX;
                    StringBuilder sb = new StringBuilder();
                    sb.append("is_mute_prepare=");
                    sb.append(this.bs ? 1 : 0);
                    sb.append(",request_long_focus=");
                    sb.append(this.bp ? 1 : 0);
                    sb.append(",request_focus_count=");
                    sb.append(this.bq);
                    sb.append(",release_focus_count=");
                    sb.append(this.br);
                    hashMap.put(str, sb.toString());
                    taobaoMediaPlayer.callWithMsg(hashMap);
                    if (this.O != null) {
                        taobaoMediaPlayer.setShowViewParant(null);
                    }
                    if (this.aH) {
                        a(this.m.f, (Surface) null);
                    }
                    final AbstractMediaPlayer abstractMediaPlayer = this.m.f;
                    abstractMediaPlayer.releasePrefixInUIThread();
                    boolean a2 = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_RELEASE_IN_UI_THREAD_ONLY_ERROR, "false"));
                    if (this.m.e == 3) {
                        z2 = true;
                    }
                    if (a2 && z2 && this.f18050a > 0) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + abstractMediaPlayer + ", releasePlayer in ui");
                        long currentTimeMillis = System.currentTimeMillis();
                        d(abstractMediaPlayer);
                        this.aO = System.currentTimeMillis() - currentTimeMillis;
                    } else if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_CONTROL_USE_COMMON_THREADPOOL, "false"))) {
                        com.taobao.taobaoavsdk.util.a.a().submit(new a());
                    } else {
                        new Thread(new Runnable() { // from class: com.taobao.mediaplay.player.k.7
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + abstractMediaPlayer + ", releasePlayer in sub thread");
                                k.a(k.this, abstractMediaPlayer);
                            }
                        }, "ReleasePlayerInTextureView").start();
                    }
                } else {
                    this.m.f.reset();
                    this.m.f.release();
                }
                this.m.f = null;
                this.m.e = 6;
                if (!this.H) {
                    y();
                }
            }
            this.o.genPlayToken(true);
        } catch (Throwable unused) {
        }
    }

    private void d(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e77064", new Object[]{this, abstractMediaPlayer});
        } else if (abstractMediaPlayer == null) {
        } else {
            try {
                abstractMediaPlayer.stop();
                abstractMediaPlayer.release();
            } catch (Throwable th) {
                com.taobao.taobaoavsdk.util.c.b(th.getMessage());
            }
        }
    }

    @Override // com.taobao.mediaplay.player.b, tb.ozn.a
    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        if (this.m != null && this.m.e != 8 && this.m.e != 6 && this.m.e != 3) {
            int currentPosition = (int) (this.m.f == null ? this.e : this.m.f.getCurrentPosition());
            this.e = currentPosition;
            return currentPosition;
        }
        return this.e;
    }

    @Override // com.taobao.mediaplay.player.b
    public float Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48af448", new Object[]{this})).floatValue();
        }
        if (this.m != null && this.m.f != null) {
            float videoRenderPts = this.m.f.getVideoRenderPts();
            this.bz = videoRenderPts;
            return videoRenderPts;
        }
        return this.bz;
    }

    @Override // com.taobao.mediaplay.player.b
    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue();
        }
        if (this.m != null && this.m.f != null && this.m.e != 8 && this.m.e != 6 && this.m.e != 3 && p() > 0) {
            this.aG = (int) (((this.m.f.getCurCachePosition() * 1000.0f) * 100.0f) / p());
        }
        return this.aG;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnLoopCompletionListener
    public void onLoopCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce872948", new Object[]{this, iMediaPlayer});
        } else {
            z();
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public float q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de468", new Object[]{this})).floatValue() : this.O.getDisplayAspectRatio();
    }

    @Override // com.taobao.mediaplay.player.b
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (this.m.i == f) {
        } else {
            this.m.i = f;
            try {
                if (this.m.i != 0.0f && this.ax != null && this.m.e != 0 && !this.B) {
                    if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableSetvolumeNewLogic", "true"))) {
                        if (this.m.e == 1) {
                            h(CommandID.setVolume);
                        }
                    } else {
                        h(CommandID.setVolume);
                    }
                }
            } catch (Throwable th) {
                if (this.o != null) {
                    ddg ddgVar = this.o.mMediaPlayContext.mTLogAdapter;
                    com.taobao.taobaoavsdk.util.c.c(ddgVar, "setVolume##RequestAudioFocus error" + th.getMessage());
                }
            }
            if (this.m == null || this.m.f == null || this.m.e == 6 || this.m.e == 3) {
                return;
            }
            try {
                this.m.f.setVolume(f, f);
            } catch (Throwable th2) {
                if (this.o == null) {
                    return;
                }
                ddg ddgVar2 = this.o.mMediaPlayContext.mTLogAdapter;
                com.taobao.taobaoavsdk.util.c.c(ddgVar2, "setVolume##SetVolume error" + th2.getMessage());
            }
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else if (this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            try {
                ((TaobaoMediaPlayer) this.m.f).updateMuteNodes(z);
            } catch (Throwable unused) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "updateMuteNodes error.");
            }
        }
    }

    public void b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{this, new Integer(i), str});
        } else if (this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            ((TaobaoMediaPlayer) this.m.f).setDegradeCode(i, str);
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else if (this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            ((TaobaoMediaPlayer) this.m.f).setDegradeFlvReason(i);
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + this + ", close,playToken=" + this.o.mPlayToken);
        }
        this.az = 0L;
        this.bi = true;
        if (this.H) {
            return;
        }
        this.H = true;
        this.aS = true;
        this.aT = true;
        E();
        Handler handler = this.ar;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.ag) {
            af();
            this.ad = null;
            Handler handler2 = this.ar;
            if (handler2 != null) {
                handler2.removeMessages(1);
            }
        }
        try {
            if (this.ax != null && this.B) {
                this.B = false;
                if (this.o != null) {
                    ipw.a(this.o.getContext()).a(this.o.mAudioFocusChangeListener);
                    this.o.mAudioFocusChangeListener = null;
                    this.br++;
                }
            }
        } catch (Throwable unused) {
        }
        if (this.m != null && this.m.f != null) {
            b(this.m.f);
        }
        this.aL = null;
        if (!StringUtils.isEmpty(this.aA) && 1 == this.m.e) {
            b(true);
        }
        String str = this.m.f32509a;
        if (this.o.mMediaPlayContext.mTBLive) {
            ozi.g().a(str, this);
        } else {
            ozm.h().a(str, this);
            if (this.o.mMediaPlayContext.mTBLive) {
                ozi.g().a(str, this);
            } else {
                ozm.h().a(str, this);
            }
            this.o.mMediaPlayContext.resumeFrameLock();
        }
        this.m.b = 0;
        this.u = 0;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue();
        }
        if (this.o.getAudioOnly()) {
            return true;
        }
        g gVar = this.O;
        if (gVar != null) {
            return gVar.isAvailable();
        }
        g gVar2 = this.ad;
        if (gVar2 == null) {
            return false;
        }
        return gVar2.isAvailable();
    }

    private void af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38f62c", new Object[]{this});
            return;
        }
        if (this.o != null && this.o.mMediaPlayContext != null) {
            this.o.mMediaPlayContext.mSelectedUrlName = this.o.mMediaPlayContext.mSeamlessSwitchingSelectName;
            this.f = this.o.mMediaPlayContext.mSeamlessSwitchingVideoPath;
            this.o.mMediaPlayContext.mSeamlessSwitchingSelectName = null;
            this.o.mMediaPlayContext.setVideoUrl(this.f);
        }
        this.ag = false;
        this.ah = 0L;
        this.ai = false;
        this.ae = false;
    }

    private void ag() {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
            return;
        }
        this.f18050a = this.an;
        this.b = this.ao;
        if (this.af && (gVar = this.O) != null && (gVar instanceof MediaTextureView) && this.ad != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch change to sub stream view visibility=" + this.ad.getView().getVisibility());
            this.O.getView().setVisibility(4);
            g gVar2 = this.O;
            if (gVar2 instanceof MediaTextureView) {
                ((ViewGroup) ((MediaTextureView) gVar2).getParent()).removeView(this.O.getView());
            } else if (gVar2 instanceof MediaSurfaceView) {
                ((ViewGroup) ((MediaSurfaceView) gVar2).getParent()).removeView(this.O.getView());
            }
            this.O = this.ad;
            this.O.setBackground(false);
            this.ad = null;
            this.h = this.ak;
        }
        if (this.m.f != null && (this.m.f instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) this.m.f).setPlayingLiveDefinition(this.aM);
        }
        if (!StringUtils.isEmpty(this.aM)) {
            this.o.mMediaPlayContext.mPlayerQualityItem = this.o.mMediaPlayContext.mSwitchingPlayerQualityItem;
            PlayerQualityItem playerQualityItem = this.o.mMediaPlayContext.mPlayerQualityItem;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, " handleSwitchStreamSuccInfo name=" + playerQualityItem.name + ",  newName=" + playerQualityItem.newName + " ,definition=" + playerQualityItem.definition + " ,newDefinition=" + playerQualityItem.newDefinition);
            this.o.mMediaPlayContext.mSwitchingPlayerQualityItem = null;
            a("0", this.aM, this.o.mMediaPlayContext.mSeamlessSwitchingSelectName, "{\"msg\":\"success\"}");
            this.aM = null;
        }
        if (this.m.f != null && (this.m.f instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) this.m.f).updateSeamlessSwitchStatus(1, "" + (System.currentTimeMillis() - this.ah));
        }
        af();
    }

    public void b(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7f5fe5", new Object[]{this, mediaAspectRatio});
        } else if (this.ad == null || mediaAspectRatio == null) {
        } else {
            int i = AnonymousClass8.f18056a[mediaAspectRatio.ordinal()];
            if (i == 1) {
                this.ad.setAspectRatio(0);
            } else if (i == 2) {
                this.ad.setAspectRatio(1);
            } else if (i != 3) {
            } else {
                this.ad.setAspectRatio(3);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 0) {
            ah();
            if (d() != 3 && d() != 6 && d() != 6 && d() != 4 && (handler = this.ar) != null) {
                handler.sendEmptyMessageDelayed(0, J);
            }
        } else if (i == 1) {
            ag();
        }
        return false;
    }

    private void ah() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[]{this});
        } else if (!M() || this.m == null) {
        } else {
            if (this.m.e != 1 && (!this.K || this.m.e != 2)) {
                return;
            }
            this.K = false;
            int currentPosition = getCurrentPosition();
            if (currentPosition < 0) {
                return;
            }
            int p = p();
            if (p > 0) {
                i = s();
            }
            a(currentPosition, i, p);
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else if (this.m == null || this.m.f == null) {
        } else {
            this.m.f.setPlayRate(f);
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void a(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f44224", new Object[]{this, mediaAspectRatio});
        } else if (this.O == null || mediaAspectRatio == null) {
        } else {
            int i = AnonymousClass8.f18056a[mediaAspectRatio.ordinal()];
            if (i == 1) {
                this.O.setAspectRatio(0);
                f(0);
            } else if (i == 2) {
                this.O.setAspectRatio(1);
                f(1);
            } else if (i != 3) {
            } else {
                this.O.setAspectRatio(3);
            }
        }
    }

    private void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else if (this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            ((TaobaoMediaPlayer) this.m.f)._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_EXTEND_VIDEO_ASPECT_RATIO, i);
        }
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " TextureVideoView onActivityResumed " + this + ", " + activity + ", " + this.j + ",playToken=" + this.o.mPlayToken);
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableNullCurrentActivity", "true"))) {
            this.aW = new WeakReference<>(activity);
        } else {
            this.bl = activity;
        }
        if (this.j != activity) {
            this.bk = true;
        }
        if (this.j != activity) {
            return;
        }
        this.az = System.currentTimeMillis();
        if (this.o.mMediaPlayContext.mTBLive || this.o.mMediaPlayContext.mEmbed || !this.o.mMediaPlayContext.mEnableAutoPauseInBackground) {
            return;
        }
        this.P = true;
        if (this.m != null && this.m.d) {
            if (c() && this.m.c == 2) {
                this.m.c = 1;
            }
            boolean b2 = this.o.mMediaPlayContext.mTBLive ? ozi.g().b() : ozm.h().b();
            if (this.m.c != 1 || !b2) {
                return;
            }
            F();
            return;
        }
        if (this.m != null && this.m.f != null && this.m.k && this.y && this.m.e != 4) {
            n();
        }
        if (this.o == null) {
            return;
        }
        if ((this.o.screenType() != MediaPlayScreenType.PORTRAIT_FULL_SCREEN && this.o.screenType() != MediaPlayScreenType.LANDSCAPE_FULL_SCREEN) || !(this.o.getContext() instanceof Activity)) {
            return;
        }
        DWViewUtil.hideNavigationBar(this.o.getWindow() == null ? ((Activity) this.o.getContext()).getWindow() : this.o.getWindow());
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " TextureVideoView onActivityPaused " + this + ", " + activity + ", " + this.j + ",playToken=" + this.o.mPlayToken);
        }
        this.az = 0L;
        if (this.j != activity || this.o.mMediaPlayContext.mTBLive || this.o.mMediaPlayContext.mEmbed || !this.o.mMediaPlayContext.mEnableAutoPauseInBackground) {
            return;
        }
        this.P = false;
        if (this.m == null || this.m.f == null) {
            return;
        }
        if (this.m.e != 1 && this.m.e != 5) {
            return;
        }
        b(true);
    }

    @Override // tb.dde
    public long getStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        if (this.aB != null && this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "playToken=" + this.o.mPlayToken + ",yezo:getStartTime from mFirstRenderAdapter time=" + this.aB.getStartTime());
            return this.aB.getStartTime();
        }
        if (this.o != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "playToken=" + this.o.mPlayToken + ",yezo:getStartTime from mStartTime=" + this.az);
        }
        return this.az;
    }

    public boolean a(mkb mkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4a689d8", new Object[]{this, mkbVar})).booleanValue();
        }
        if (oyu.b(this.o.getContext()) && oyu.b() && this.m.f != null && (this.m.f instanceof TaobaoMediaPlayer)) {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this.m.f;
            Map<TaobaoMediaPlayer, List<mkb>> map = this.au;
            if (map == null) {
                this.au = new HashMap();
                this.av = new HashMap();
                ArrayList arrayList = new ArrayList();
                arrayList.add(mkbVar);
                this.au.put(taobaoMediaPlayer, arrayList);
                taobaoMediaPlayer.enableOnRenderCallback();
                return true;
            }
            List<mkb> list = map.get(taobaoMediaPlayer);
            if (list != null && !list.contains(mkbVar)) {
                list.add(mkbVar);
                this.au.put(taobaoMediaPlayer, list);
                return true;
            } else if (list == null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(mkbVar);
                this.au.put(taobaoMediaPlayer, arrayList2);
                taobaoMediaPlayer.enableOnRenderCallback();
            }
        }
        return false;
    }

    public boolean b(mkb mkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3299059", new Object[]{this, mkbVar})).booleanValue();
        }
        Map<TaobaoMediaPlayer, List<mkb>> map = this.au;
        if (map != null && map.size() != 0) {
            if (this.m != null && this.m.f != null) {
                TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this.m.f;
                List<mkb> list = this.au.get(taobaoMediaPlayer);
                if (list != null && list.contains(mkbVar)) {
                    synchronized (this.aw) {
                        this.av.put(taobaoMediaPlayer, mkbVar);
                    }
                    list.remove(mkbVar);
                    if (list.size() == 0) {
                        this.au.remove(taobaoMediaPlayer);
                        taobaoMediaPlayer.disableOnRenderCallback();
                    } else {
                        this.au.put(taobaoMediaPlayer, list);
                    }
                    return true;
                }
            } else {
                for (Map.Entry<TaobaoMediaPlayer, List<mkb>> entry : this.au.entrySet()) {
                    TaobaoMediaPlayer key = entry.getKey();
                    List<mkb> value = entry.getValue();
                    if (value != null && value.contains(mkbVar)) {
                        synchronized (this.aw) {
                            this.av.put(key, mkbVar);
                        }
                        value.remove(mkbVar);
                        if (value.size() == 0) {
                            this.au.remove(key);
                            key.disableOnRenderCallback();
                        } else {
                            this.au.put(key, value);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public List<mkb> b(IMediaPlayer iMediaPlayer) {
        Map<TaobaoMediaPlayer, List<mkb>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1cfecfdc", new Object[]{this, iMediaPlayer});
        }
        if (iMediaPlayer == null || (map = this.au) == null || map.size() == 0) {
            return null;
        }
        List<mkb> list = this.au.get(iMediaPlayer);
        if (list != null && list.size() == 0) {
            return null;
        }
        return list;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVFPluginListener
    public int onRenderYUV(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6efa8548", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
        }
        List<mkb> b2 = b(iMediaPlayer);
        if (b2 == null) {
            return -1;
        }
        mkc mkcVar = new mkc(3, i4, i5);
        mkcVar.a(i, i2, i3);
        for (mkb mkbVar : b2) {
            mkb.a a2 = mkbVar.a(mkcVar);
            if (a2 != null && a2.f31063a && a2.b >= 0) {
                return a2.b;
            }
        }
        return -1;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVFPluginListener
    public int onRenderOes(IMediaPlayer iMediaPlayer, int i, int i2, int i3, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f244b50", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), fArr})).intValue();
        }
        List<mkb> b2 = b(iMediaPlayer);
        if (b2 == null) {
            return -1;
        }
        mkc mkcVar = new mkc(4, i2, i3);
        mkcVar.a(i);
        mkcVar.a(fArr);
        for (mkb mkbVar : b2) {
            mkb.a a2 = mkbVar.a(mkcVar);
            if (a2 != null && a2.f31063a && a2.b >= 0) {
                return a2.b;
            }
        }
        return -1;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVFPluginListener
    public void onRenderFinish(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f3c571", new Object[]{this, iMediaPlayer});
            return;
        }
        synchronized (this.aw) {
            if (this.av.get(iMediaPlayer) == null) {
                List<mkb> b2 = b(iMediaPlayer);
                if (b2 == null) {
                    return;
                }
                Iterator<mkb> it = b2.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } else {
                this.av.remove(iMediaPlayer);
            }
        }
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
        } else {
            this.aB = ddeVar;
        }
    }

    public void a(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701a40a2", new Object[]{this, innerStartFuncListener});
        } else {
            this.aC = innerStartFuncListener;
        }
    }

    @Override // tv.danmaku.ijk.media.player.InnerStartFuncListener
    public long getInnerStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c800e8a", new Object[]{this})).longValue();
        }
        InnerStartFuncListener innerStartFuncListener = this.aC;
        if (innerStartFuncListener == null) {
            return 0L;
        }
        return innerStartFuncListener.getInnerStartTime();
    }

    /* loaded from: classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AbstractMediaPlayer f18057a;

        static {
            kge.a(-1779653846);
            kge.a(-1390502639);
        }

        private a() {
            this.f18057a = k.this.m.f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AbstractMediaPlayer abstractMediaPlayer = this.f18057a;
            if (abstractMediaPlayer == null) {
                return;
            }
            k.a(k.this, abstractMediaPlayer);
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
        } else {
            this.f = "";
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
        } else if (this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            ((TaobaoMediaPlayer) this.m.f).audioOff();
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        } else if (this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
        } else {
            ((TaobaoMediaPlayer) this.m.f).audioOn();
        }
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            if (this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            ((TaobaoMediaPlayer) this.m.f).callWithMsg(map);
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (MediaConstant.CMD_SET_ENABLE_ADAPTIVE_LIVE_SWITCH.equals(str)) {
            if (!"1".equals(str2) || !this.X || !this.W || !this.U || this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            ((TaobaoMediaPlayer) this.m.f).startRtcAdaption(this.o.mMediaPlayContext.getRtcSwitchLiveInfo(this.o.mMediaPlayContext.mMediaLiveInfo));
        } else if (MediaConstant.CMD_REPLACE_FORCE_OF_NEW_DEFINITION.equals(str)) {
            if (!"1".equals(str2) || !this.W || !this.U || this.m == null || this.m.f == null || !(this.m.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            ((TaobaoMediaPlayer) this.m.f).stopRtcAdaption();
            ((TaobaoMediaPlayer) this.m.f).startRtcAdaption(this.o.mMediaPlayContext.getRtcSwitchLiveInfo(this.o.mMediaPlayContext.mMediaLiveInfo));
        } else if (!MediaConstant.CMD_ENABLE_AUTO_PAUSE_IN_BACKGROUND.equals(str) || StringUtils.isEmpty(str2)) {
        } else {
            if ("1".equals(str2)) {
                this.o.mMediaPlayContext.mEnableAutoPauseInBackground = true;
            } else if (!"0".equals(str2)) {
            } else {
                this.o.mMediaPlayContext.mEnableAutoPauseInBackground = false;
            }
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.k = context;
        if (!com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableNullCurrentActivity", "true"))) {
            return;
        }
        this.j = this.k;
    }

    public void a(MediaPlayControlContext mediaPlayControlContext, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb5fb0d", new Object[]{this, mediaPlayControlContext, new Long(j), new Long(j2), new Long(j3)});
        } else if (mediaPlayControlContext == null) {
        } else {
            if (mediaPlayControlContext.mExperienceIdSet != null && j != 0) {
                mediaPlayControlContext.mExperienceIdSet.add(Long.valueOf(j));
            }
            if (mediaPlayControlContext.mExperienceBucketIdSet != null && j2 != 0) {
                mediaPlayControlContext.mExperienceBucketIdSet.add(Long.valueOf(j2));
            }
            if (mediaPlayControlContext.mExperienceReleaseIdSet == null || j3 == 0) {
                return;
            }
            mediaPlayControlContext.mExperienceReleaseIdSet.add(Long.valueOf(j3));
        }
    }

    private void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        try {
            if (this.m.i == 0.0f || this.ax == null) {
                return;
            }
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_LONG_AUDIO_FOCUS_SBT, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
            String str2 = this.o.mMediaPlayContext.mFrom;
            if ((!StringUtils.isEmpty(config) && !StringUtils.isEmpty(str2) && com.taobao.taobaoavsdk.util.b.b(str2, config)) || this.o.mMediaPlayContext.mRequestShortAudioFocus) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "," + str + ", sbt=" + str2 + " only request short AudioFocus with mVolume: " + this.m.i);
                ipw.a(this.o.getContext()).a(this.o.mAudioFocusChangeListener, 2);
            } else {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "," + str + ", sbt=" + str2 + " request long AudioFocus with mVolume: " + this.m.i);
                ipw.a(this.o.getContext()).a(this.o.mAudioFocusChangeListener, 1);
                this.bp = true;
            }
            this.bq++;
            this.B = true;
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "," + str + " RequestAudioFocus error" + th.getMessage());
        }
    }

    private void a(IMediaPlayer iMediaPlayer, Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b31716", new Object[]{this, iMediaPlayer, surface});
        } else {
            iMediaPlayer.setSurface(surface);
        }
    }

    public void am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9b9ab3", new Object[]{this});
        } else {
            a((IMediaPlayer) null, 12102L, System.currentTimeMillis(), 0L, (Object) null);
        }
    }
}
