package com.taobao.avplayer.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.bc;
import com.taobao.avplayer.common.ae;
import com.taobao.avplayer.player.DWTextureView;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.mediaplay.player.MediaSurfaceView;
import com.taobao.mediaplay.player.MediaTextureView;
import com.taobao.mediaplay.player.a;
import com.taobao.mediaplay.player.g;
import com.taobao.mediaplay.player.k;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.f;
import com.taobao.taobaoavsdk.util.e;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.l;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dde;
import tb.ddg;
import tb.ipw;
import tb.kck;
import tb.kcl;
import tb.kge;
import tb.oyu;
import tb.ozk;
import tb.ozm;
import tb.ozn;
import tb.snv;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;
import tv.danmaku.ijk.media.player.NativeMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes6.dex */
public class c extends a implements Handler.Callback, TextureView.SurfaceTextureListener, DWTextureView.a, a.InterfaceC0698a, g.a, dde, ozn.a, IMediaPlayer.OnLoopCompletionListener, IMediaPlayer.OnPreCompletionListener, InnerStartFuncListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String E;
    private static int F;
    private static int an;
    public boolean A;
    public boolean C;
    public boolean D;
    private int G;
    private int H;
    private int I;
    private boolean J;
    private TextureView K;
    private SurfaceTexture L;
    private boolean M;
    private boolean N;
    private g O;
    private boolean P;
    private Handler Q;
    private ae R;
    private boolean S;
    private boolean T;
    private AudioManager U;
    private com.taobao.mediaplay.player.a V;
    private long W;
    private final int X;
    private final int Y;
    private final int Z;
    private int aA;
    private boolean aB;
    public boolean aD;
    private boolean aE;
    private boolean aF;
    public boolean aG;
    private long aH;
    private int aa;
    private String ab;
    private boolean ac;
    private dde ad;
    private InnerStartFuncListener ae;
    private int af;
    private int ag;
    private int ah;
    private boolean ai;
    private boolean aj;
    private int ak;
    private boolean al;
    private List<bc> am;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    public boolean ar;
    private boolean as;
    private boolean at;
    private boolean au;
    private boolean av;
    public boolean aw;
    public boolean ax;
    private boolean ay;
    private int az;
    public g.b x;
    public boolean y;
    public boolean z;

    /* renamed from: com.taobao.avplayer.player.c$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16558a = new int[DWAspectRatio.values().length];

        static {
            try {
                f16558a[DWAspectRatio.DW_FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16558a[DWAspectRatio.DW_CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16558a[DWAspectRatio.DW_FIT_X_Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
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

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f22b7c", new Object[]{cVar});
        } else {
            cVar.X();
        }
    }

    public static /* synthetic */ void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c953b707", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.h(i);
        }
    }

    public static /* synthetic */ void a(c cVar, AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e20ff3", new Object[]{cVar, abstractMediaPlayer});
        } else {
            cVar.d(abstractMediaPlayer);
        }
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c953f6dc", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.ai = z;
        return z;
    }

    static {
        kge.a(-862545171);
        kge.a(219584769);
        kge.a(-1854325247);
        kge.a(714349968);
        kge.a(-846049091);
        kge.a(1287118762);
        kge.a(-1043440182);
        kge.a(1637440348);
        kge.a(332999893);
        kge.a(1562729082);
        kge.a(-913971900);
        E = "TextureVideoView";
        F = 200;
        an = 0;
    }

    public c(DWContext dWContext, boolean z, String str) {
        super(dWContext);
        this.G = 21;
        this.H = 23;
        this.M = true;
        this.W = 0L;
        this.X = -1;
        this.Y = -2;
        this.Z = -3;
        this.aw = false;
        this.ax = false;
        this.aD = false;
        this.ay = false;
        this.az = 0;
        this.aA = 0;
        this.aB = true;
        this.ag = 50;
        this.ah = 1000;
        this.ai = false;
        this.aj = true;
        this.ak = 0;
        this.al = true;
        this.ao = false;
        this.ap = true;
        this.aq = true;
        this.aE = true;
        this.aF = false;
        this.aG = false;
        this.aH = 0L;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView new " + this + ", " + z + " , " + str);
        if (this.q != null && this.q.getActivity() != null) {
            ae();
            if (this.k != null) {
                this.k.b(this.q.mPanoType);
            }
        }
        if (this.q != null && this.q.mConfigAdapter != null && !StringUtils.isEmpty(this.q.mFrom) && this.q.mConfigAdapter.c(this.q.mFrom)) {
            this.G = 18;
        }
        if (this.q.getActivity() != null) {
            this.U = (AudioManager) this.q.getActivity().getApplicationContext().getSystemService("audio");
        } else if (this.q.mApplicationontext != null) {
            this.U = (AudioManager) this.q.mApplicationontext.getApplicationContext().getSystemService("audio");
        }
        this.Q = new Handler(this);
        this.T = z;
        if (!z) {
            F = 100;
        }
        this.ab = str;
        if (StringUtils.isEmpty(str)) {
            str = com.taobao.taobaoavsdk.util.b.c();
        } else if (MediaAdapteManager.mConfigAdapter != null) {
            this.ac = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "tmpNotifyVideoStartForToken", "true"));
            this.ag = com.taobao.taobaoavsdk.util.b.b(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "minProgTime", "50"));
            this.ah = com.taobao.taobaoavsdk.util.b.b(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "maxProgTime", "1000"));
        } else {
            this.ac = true;
        }
        b(str);
        this.aq = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_USE_NEW_INIT_ERROR_CODE, "true"));
        this.as = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enGlobalKeepScreenOn", "true"));
        V();
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_LONG_AUDIO_FOCUS_SBT, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        if ((!StringUtils.isEmpty(config) && !StringUtils.isEmpty(this.q.mFrom) && com.taobao.taobaoavsdk.util.b.b(this.q.mFrom, config)) || this.q.mUseShortAudioFocus) {
            this.aw = true;
        }
        String config2 = OrangeConfig.getInstance().getConfig("DWInteractive", "abandonFocusAtPauseSBT", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        if ((StringUtils.isEmpty(config2) || StringUtils.isEmpty(this.q.mFrom) || !com.taobao.taobaoavsdk.util.b.b(this.q.mFrom, config2)) && (!this.q.mUseShortAudioFocus || !this.q.mReleaseShortFocusWhenPause)) {
            return;
        }
        this.ax = true;
    }

    public c(DWContext dWContext, boolean z) {
        this(dWContext, z, null);
    }

    @Override // com.taobao.avplayer.player.a
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.q.getActivity() == null) {
        } else {
            this.k = new com.taobao.taobaoavsdk.widget.media.b();
            if (MediaAdapteManager.mConfigAdapter != null) {
                this.aj = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "enableFixRecycleInit", "true"));
                this.al = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "fixP2ffState", "true"));
                this.ap = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "enSetSurfaceSizeMore", "true"));
            } else {
                this.aj = false;
            }
            if (this.q.getExternSurface() != null) {
                this.g = this.q.getExternSurface();
                this.h = true;
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " initRender: extern " + this.g);
                return;
            }
            this.N = e.a(this.l).e();
            boolean a2 = e.a(this.l).a(this.l, this.q.mFrom);
            if (this.N && a2) {
                this.N = true;
            } else {
                this.N = false;
            }
            if (this.N) {
                if (this.q.getVideoAspectRatio() != DWAspectRatio.DW_CENTER_CROP) {
                    this.N = false;
                    e.a(this.l).a(2);
                }
                if (this.q.mDisableSurfaceView) {
                    this.N = false;
                    e.a(this.l).a(3);
                }
            }
            if (this.N) {
                MediaSurfaceView mediaSurfaceView = new MediaSurfaceView(this.l);
                if ((Build.VERSION.SDK_INT == 28 || Build.VERSION.SDK_INT == 29) && this.q.mWidth > 0 && this.q.mHeight > 0 && com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enSetFixSize", "true")) && mediaSurfaceView.getHolder() != null) {
                    mediaSurfaceView.getHolder().setFixedSize(this.q.mWidth, this.q.mHeight);
                }
                this.P = true;
                mediaSurfaceView.setUseCrop(false);
                this.O = mediaSurfaceView;
                this.O.addRenderCallback(this);
                this.O.setVideoRotation(this.af);
            } else {
                this.K = new DWTextureView(this.l, this.k, this);
                this.K.setSurfaceTextureListener(this);
                this.k.a(this.af);
                this.K.setRotation(this.af);
            }
            a(this.q.mPlayContext, e.a(this.l).b(), e.a(this.l).c(), e.a(this.l).d());
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " initRender:" + this.O + "， " + this.K);
        }
    }

    private void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
        } else if (this.l == null || this.V != null) {
        } else {
            this.V = new com.taobao.mediaplay.player.a(this, (Application) this.l.getApplicationContext());
        }
    }

    private void W() {
        com.taobao.mediaplay.player.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
        } else if (this.l == null || (aVar = this.V) == null) {
        } else {
            aVar.a((Application) this.l.getApplicationContext());
            this.V = null;
        }
    }

    public void a(ae aeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df620a97", new Object[]{this, aeVar});
        } else {
            this.R = aeVar;
        }
    }

    private void X() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
        } else if (f() == 3 || f() == 6 || f() == 7 || f() == 4 || (handler = this.Q) == null) {
        } else {
            handler.removeCallbacksAndMessages(null);
            this.Q.sendEmptyMessageDelayed(0, F);
        }
    }

    private void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
            return;
        }
        Handler handler = this.Q;
        if (handler == null) {
            return;
        }
        handler.removeMessages(0);
    }

    @Override // com.taobao.avplayer.player.a
    public View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6aec84b2", new Object[]{this});
        }
        TextureView textureView = this.K;
        if (textureView != null) {
            return textureView;
        }
        g gVar = this.O;
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    @Override // com.taobao.avplayer.player.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.S = z;
        if (this.o == null || this.o.f == null) {
            return;
        }
        this.o.f.setLooping(z);
    }

    private void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + initMediaPlayer");
        if (this.f == null) {
            return;
        }
        if (this.l == null && this.m == null) {
            return;
        }
        if (this.o != null && this.o.e == 3) {
            ah();
            this.o.f = null;
        }
        b(this.o.f32509a);
        if (this.o.f == null) {
            this.o.e = 0;
            this.o.f = O();
            if (this.k != null) {
                i(this.k.a());
            }
            if (this.g != null && this.h) {
                a(this.o.f, this.g);
            }
        }
        if (!StringUtils.isEmpty(this.ab)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWTextureVideoView setSurface in initMediaPlayer");
            if (this.K != null && n() != null) {
                a(this.o.f, n());
            } else if (this.O != null && R() != null) {
                a(this.o.f, R());
            }
            a((IMediaPlayer) this.o.f);
        }
        a(this.o.f);
        this.o.f.setLooping(this.S);
        ae();
        if (this.o == null) {
            return;
        }
        if ((this.o.e != 5 && this.o.e != 8 && this.o.e != 4 && this.o.e != 2 && this.o.e != 1) || !this.M) {
            return;
        }
        this.o.f.start();
        c(this.T);
        X();
    }

    private void a(IMediaPlayer iMediaPlayer, Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b31716", new Object[]{this, iMediaPlayer, surface});
        } else {
            iMediaPlayer.setSurface(surface);
        }
    }

    @Override // com.taobao.avplayer.player.a
    public void a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else if (this.o == null || this.o.f == null || !(this.o.f instanceof TaobaoMediaPlayer)) {
        } else {
            ((TaobaoMediaPlayer) this.o.f).setFov(f, f2, f3);
        }
    }

    @Override // com.taobao.avplayer.player.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.o == null || this.o.f == null || !(this.o.f instanceof TaobaoMediaPlayer)) {
        } else {
            ((TaobaoMediaPlayer) this.o.f).refreshScreen();
        }
    }

    @Override // com.taobao.avplayer.player.a
    public List<f> a(List<com.taobao.taobaoavsdk.e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        if (this.o != null && this.o.f != null && (this.o.f instanceof TaobaoMediaPlayer)) {
            return ((TaobaoMediaPlayer) this.o.f).hitTest(list);
        }
        return null;
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
            abstractMediaPlayer.registerOnPreCompletionListener(this);
            abstractMediaPlayer.registerOnCompletionListener(this);
            abstractMediaPlayer.registerOnErrorListener(this);
            abstractMediaPlayer.setOnBufferingUpdateListener(this);
            abstractMediaPlayer.registerOnInfoListener(this);
            abstractMediaPlayer.registerOnLoopCompletionListener(this);
            abstractMediaPlayer.setScreenOnWhilePlaying(true);
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
            abstractMediaPlayer.unregisterOnPreCompletionListener(this);
            abstractMediaPlayer.unregisterOnErrorListener(this);
            abstractMediaPlayer.unregisterOnBufferingUpdateListener(this);
            abstractMediaPlayer.unregisterOnInfoListener(this);
            abstractMediaPlayer.unregisterOnLoopCompletionListener(this);
        } catch (Throwable th) {
            if (this.q == null) {
                return;
            }
            ddg ddgVar = this.q.mTlogAdapter;
            com.taobao.taobaoavsdk.util.c.c(ddgVar, "unregisterMediaplayerListener##error:" + th.getMessage());
        }
    }

    @Override // com.taobao.avplayer.player.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + setVideoPath " + str);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        this.f = str;
        if (this.o == null || !b(this.o.e) || this.D) {
            return;
        }
        if ((this.r != 1 && this.r != 8) || StringUtils.isEmpty(this.f) || this.o.d) {
            return;
        }
        if (this.r == 1) {
            p();
        } else if (this.q.getPrepareToFirstFrame()) {
            v();
        } else {
            u();
        }
    }

    @Override // com.taobao.avplayer.player.a
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + videoPlayError ");
        this.z = false;
        this.aa = -1;
        if (this.aq) {
            b(i, i2);
        } else {
            ac();
        }
    }

    @Override // com.taobao.avplayer.player.a
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + startVideo ");
        this.ar = false;
        if (this.q != null) {
            ddg ddgVar = this.q.mTlogAdapter;
            com.taobao.taobaoavsdk.util.c.a(ddgVar, "startVideo##PlayState:" + this.o.e + " VideoUrl:" + this.f);
        }
        this.v = true;
        this.r = 1;
        if (this.q != null) {
            if (!this.q.isMute() || this.q.getVolume() > 0.0f) {
                this.aB = false;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "sbt=" + this.q.mFrom + ",textureVideoview=" + this + " startVideo with mute tag=" + this.q.isMute() + ", volume=" + this.q.getVolume() + ", is_mute_prepare=" + this.aB);
        }
        if (this.q != null && this.q.getControlParams().get("keepScreenOnDoNotCarePlayerState") != null && com.taobao.taobaoavsdk.util.b.a(this.q.getControlParams().get("keepScreenOnDoNotCarePlayerState"))) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Keep screen on don't care playerstate");
            J();
        }
        M();
        if (this.o.d) {
            this.z = false;
            if (this.o.c == 4) {
                this.C = true;
            }
            L();
            this.o.c = 1;
            return;
        }
        this.o.b = 0;
        if (!this.z) {
            this.z = true;
            this.W = System.currentTimeMillis();
        }
        if (b(this.o.e) && ((this.q.isFirstRenderOptimize() || (!this.q.isFirstRenderOptimize() && this.g != null)) && !StringUtils.isEmpty(this.f))) {
            Z();
            if (!StringUtils.isEmpty(this.ab) || this.o.e == 3) {
                return;
            }
            this.o.e = 8;
            this.o.d = false;
        } else if (this.o != null && this.o.f != null && this.o.e == 5 && !StringUtils.isEmpty(this.f) && this.M) {
            this.ao = true;
            J();
            c("startVideo");
            this.o.f.start();
            c(this.T);
            X();
        } else if (this.o != null && this.o.f != null && !StringUtils.isEmpty(this.ab) && (this.o.e == 2 || this.o.e == 1 || this.o.e == 4)) {
            q();
        } else if (this.o == null || this.o.f == null || StringUtils.isEmpty(this.ab) || this.o.e != 8) {
        } else {
            a(this.o.f);
        }
    }

    public void J() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else if (this.q != null && this.q.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM) != null && com.taobao.taobaoavsdk.util.b.a(this.q.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM))) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "KeepScreeon do nothing");
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "keepScreenOn " + this.l + ", " + oyu.y());
            if (this.as) {
                if (this.at) {
                    return;
                }
                this.at = true;
                oyu.w();
                i = oyu.y();
            } else {
                i = an + 1;
                an = i;
            }
            if (this.l == null || !(this.l instanceof Activity) || i <= 0) {
                return;
            }
            ((Activity) this.l).getWindow().addFlags(128);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", keepScreenOn");
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
        } else if (this.q != null && this.q.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM) != null && com.taobao.taobaoavsdk.util.b.a(this.q.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM))) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "KeepScreeon do nothing");
        } else {
            if (this.as) {
                if (!this.at) {
                    return;
                }
                this.at = false;
                oyu.x();
                i = oyu.y();
            } else {
                int i2 = an;
                if (i2 > 0) {
                    i = i2 - 1;
                    an = i;
                }
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.l == null || !(this.l instanceof Activity) || i != 0) {
                    return;
                }
                ((Activity) this.l).getWindow().clearFlags(128);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", clearKeepScreenOn");
            } else if (this.l == null || !(this.l instanceof Activity) || i != 0) {
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.avplayer.player.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ((Activity) c.this.l).getWindow().clearFlags(128);
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", clearKeepScreenOn");
                    }
                });
            }
        }
    }

    @Override // com.taobao.avplayer.player.a
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + playVideo ");
        this.ar = false;
        M();
        if (this.o.d) {
            if (this.o.c == 4) {
                this.C = true;
            }
            this.o.c = 1;
            this.W = System.currentTimeMillis();
            L();
            return;
        }
        if (!this.A) {
            this.z = true;
            this.W = System.currentTimeMillis();
        }
        c("playVideo");
        try {
            if (this.q != null) {
                ddg ddgVar = this.q.mTlogAdapter;
                com.taobao.taobaoavsdk.util.c.a(ddgVar, " playVideo##PlayState:" + this.o.e);
            }
            if (this.o == null || this.o.f == null || !this.v) {
                return;
            }
            if ((this.o.e != 2 && this.o.e != 5 && this.o.e != 4) || !this.M) {
                return;
            }
            b(this.o.f32509a);
            this.ao = true;
            J();
            this.o.f.start();
            if (n() != null) {
                a(this.o.f, n());
            }
            if (R() != null) {
                a(this.o.f, R());
            }
            if (!StringUtils.isEmpty(this.ab)) {
                a((IMediaPlayer) this.o.f);
            }
            a(this.o.f);
            if (this.o.e != 4 && this.o.e != 5 && !this.ac) {
                C();
                X();
            }
            this.ac = false;
            c(this.T);
            X();
        } catch (Throwable th) {
            String str = E;
            com.taobao.taobaoavsdk.util.c.b(str, "playVideo >>> " + th.getMessage());
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", initMediaPlayerAfterRecycle");
        if (this.o.e != 8) {
            this.o.e = 0;
        }
        aj();
        if (this.o.f == null) {
            this.o.f = O();
            this.o.e = 8;
            if (this.k != null) {
                i(this.k.a());
            }
        } else {
            a(this.o.f);
        }
        if (n() != null) {
            a(this.o.f, n());
        }
        if (R() != null) {
            a(this.o.f, R());
        }
        this.o.f.setLooping(this.S);
    }

    public void M() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        this.o.k = true;
        ozn oznVar = this.o;
        if (this.o.c != 2) {
            i = this.o.c;
        }
        oznVar.c = i;
    }

    @Override // com.taobao.avplayer.player.a
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + pauseVideo ");
        this.o.k = (!this.o.k || z) ? this.o.k : z;
        this.J = z;
        this.r = 2;
        if (this.q != null) {
            ddg ddgVar = this.q.mTlogAdapter;
            com.taobao.taobaoavsdk.util.c.a(ddgVar, "pauseVideo##PlayState:" + this.o.e);
        }
        try {
            if (this.o.f != null && this.o.e == 1) {
                if (this.ao) {
                    K();
                }
                this.ao = false;
                this.o.f.pause();
                ag();
                d(z);
                Y();
            }
        } catch (Throwable th) {
            String str = E;
            com.taobao.taobaoavsdk.util.c.b(str, "pauseVideo >>> " + th.getMessage());
        }
        if (!this.ax || this.U == null || !this.y || !this.aw) {
            return;
        }
        d("pause");
    }

    @Override // com.taobao.avplayer.player.a
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", seekTo " + i);
        if (i < 0) {
            return;
        }
        Y();
        a(i, false);
        if ((this.o.e != 5 && this.o.e != 2 && this.o.e != 4 && this.o.e != 1) || this.D) {
            return;
        }
        e(i);
    }

    @Override // com.taobao.avplayer.player.a
    public void a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", seekTo " + i + ", pause " + z);
        if (i < 0 || this.o == null || this.o.f == null) {
            return;
        }
        Y();
        b(i, z, z2);
        this.o.e = 2;
        if ((this.o.e != 5 && this.o.e != 2 && this.o.e != 4 && this.o.e != 1) || this.D) {
            return;
        }
        e(i);
    }

    private void b(final int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e02a03a", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else if (this.o.e != 5 && this.o.e != 2 && this.o.e != 4 && this.o.e != 1) {
        } else {
            if (i > t()) {
                i = t();
            }
            if (this.o.f instanceof TaobaoMediaPlayer) {
                ((TaobaoMediaPlayer) this.o.f).seekTo(i, z, z2);
            }
            this.o.f.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompletionListener() { // from class: com.taobao.avplayer.player.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
                public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
                        return;
                    }
                    c.a(c.this, true);
                    c.a(c.this, i);
                    c.a(c.this);
                }
            });
        }
    }

    public void a(bc bcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173beb30", new Object[]{this, bcVar});
            return;
        }
        if (this.am == null) {
            this.am = new ArrayList();
        }
        if (this.am.contains(bcVar)) {
            return;
        }
        this.am.add(bcVar);
    }

    private void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
            return;
        }
        List<bc> list = this.am;
        if (list == null) {
            return;
        }
        for (bc bcVar : list) {
            bcVar.onSeekCompletion(i);
        }
    }

    @Override // com.taobao.avplayer.player.a
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", instantSeekTo " + i);
        if (i < 0) {
            return;
        }
        Y();
        if (this.o.e != 5 && this.o.e != 2 && this.o.e != 4 && this.o.e != 1) {
            return;
        }
        if (i > t()) {
            i = t();
        }
        this.o.f.instantSeekTo(i);
    }

    @Override // com.taobao.avplayer.player.a
    public void a(final int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", seekToWithoutNotify " + i + " " + z);
        if (this.o.e != 5 && this.o.e != 2 && this.o.e != 4 && this.o.e != 1) {
            return;
        }
        if (i > t()) {
            i = t();
        }
        if (z) {
            this.o.f.instantSeekTo(i);
        } else {
            this.o.f.seekTo(i);
        }
        this.o.f.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompletionListener() { // from class: com.taobao.avplayer.player.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
                    return;
                }
                c.a(c.this, i);
                c.a(c.this);
            }
        });
    }

    @Override // com.taobao.avplayer.player.a
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", closeVideo");
        this.ar = true;
        P();
        E();
    }

    @Override // com.taobao.avplayer.player.a
    public void a(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8225b511", new Object[]{this, dWVideoScreenType});
        } else {
            b(dWVideoScreenType);
        }
    }

    @Override // tb.ozn.a
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        if (this.o.f != null && this.o.e != 0 && this.o.e != 8 && this.o.e != 7 && this.o.e != 3 && this.o.e != 6) {
            return this.o.f.isPlaying();
        }
        return false;
    }

    @Override // com.taobao.avplayer.player.a
    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.q.mPauseInBackground && this.o != null && !this.o.k && this.o.e == 2;
    }

    @Override // tb.ozn.a
    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        Rect rect = new Rect();
        g gVar = this.O;
        if (gVar == null) {
            return false;
        }
        return gVar.getView().getVisibility() == 0 || this.O.getView().getGlobalVisibleRect(rect);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", " + iMediaPlayer + "onCompletion videoURL: " + this.f);
        if (this.D || this.o == null || this.o.f == null) {
            return;
        }
        if (this.o.e != 1 && this.o.e != 4) {
            return;
        }
        K();
        ag();
        long t = t();
        if (t >= 0) {
            long t2 = t();
            if (t2 > 0) {
                i = B();
            }
            a((int) t, i, (int) t2);
        }
        D();
        Y();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", " + iMediaPlayer + " onInfo >>> what: " + i + ", extra :" + i2 + " videoURL: " + this.f);
        K();
        this.z = false;
        if (!this.D && this.o != null && this.o.f != null) {
            if (this.o.d) {
                this.o.d = false;
            }
            ag();
            if ((i == -5 || i == -110) && com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableRetryWhenErrorCode", "true"))) {
                this.o.e = 3;
                if (this.aE) {
                    if (this.o.f.getCurrentPosition() > 0) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView getCurrentPosition is " + this.o.f.getCurrentPosition());
                        this.q.mStartPos = (int) this.o.f.getCurrentPosition();
                    }
                    this.aF = true;
                    this.aE = false;
                }
            }
            if (c(i, i2)) {
                return true;
            }
            a(iMediaPlayer, i, i2);
        }
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        long j4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (j != 740) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", " + iMediaPlayer + " onInfo >>> what: " + j + ", extra :" + j2 + ", ext: " + j3 + ", object: " + obj);
        }
        if (3 == j) {
            HashMap hashMap = new HashMap();
            hashMap.put("RENDER_START_TIME", Long.valueOf(this.W));
            if (this.W != 0) {
                j4 = j2 > 0 ? j2 : System.currentTimeMillis();
            } else {
                j4 = 0;
            }
            this.A = true;
            hashMap.put("RENDER_END_TIME", Long.valueOf(j4));
            if (this.B > 0) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mSurfaceAvailableTs is " + this.B);
                hashMap.put("SurfaceAvailableTs", Long.valueOf(this.B));
            }
            if (obj != null && (obj instanceof HashMap)) {
                hashMap.putAll((Map) obj);
            }
            a(iMediaPlayer, j, j2, j3, hashMap);
            return true;
        } else if (740 == j) {
            S();
            return true;
        } else {
            if (711 == j && kck.a()) {
                com.taobao.taobaoavsdk.util.c.a(this.q.mTlogAdapter, "-->commitMediaPlayerRender open file time:" + j2 + " file_find_stream_info_time:" + j3);
            } else if (10004 != j || (!(f() == 1 || f() == 8 || f() == 5) || MediaAdapteManager.mConfigAdapter == null || MediaAdapteManager.mConfigAdapter == null || !com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "degradeMcodecDecodeError", "true")))) {
                if (10001 == j) {
                    this.af = (int) j2;
                    if (this.k != null) {
                        this.k.a(this.af);
                    }
                    TextureView textureView = this.K;
                    if (textureView != null) {
                        textureView.setRotation(this.af);
                    } else {
                        g gVar = this.O;
                        if (gVar != null) {
                            gVar.setVideoRotation(this.af);
                        }
                    }
                }
            } else if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_USE_HW_TAG_FOR_PLAY_SCENARIO, "false"))) {
                oyu.d = false;
            }
            a(iMediaPlayer, j, j2, j3, obj);
            return true;
        }
    }

    @Override // com.taobao.avplayer.player.a
    public Map<String, String> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef1c5942", new Object[]{this});
        }
        if (this.o != null && this.o.f != null) {
            return this.o.f.getQos();
        }
        return null;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue();
        }
        if (this.o != null && this.o.f != null) {
            int i = this.o.c;
            if (i == 2) {
                this.o.f.seekTo(this.o.b);
                return true;
            } else if (i == 4) {
                this.o.f.seekTo(this.o.b);
                return true;
            } else if (i == 1) {
                this.o.f.seekTo(this.o.b);
                this.o.f.start();
                return true;
            }
        }
        return false;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!this.q.mNeedRequestAudio) {
        } else {
            try {
                if (this.o.i == 0.0f || this.U == null || this.y) {
                    return;
                }
                if (this.aw) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "," + str + ", sbt=" + this.q.mFrom + " only request short AudioFocus with mVolume: " + this.o.i);
                    ipw.a(this.l).a((AudioManager.OnAudioFocusChangeListener) null, 2);
                } else {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "," + str + ", sbt=" + this.q.mFrom + " request long AudioFocus with mVolume: " + this.o.i);
                    ipw.a(this.l).a((AudioManager.OnAudioFocusChangeListener) null, 1);
                    this.ay = true;
                }
                this.y = true;
                this.az++;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + " RequestAudioFocus error" + th.getMessage());
            }
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            if (this.U == null || !this.y) {
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView abandonAudioFocus " + str);
            ipw.a(this.l).a((AudioManager.OnAudioFocusChangeListener) null);
            this.y = false;
        } catch (Throwable unused) {
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else if (z) {
            c("controlAudioFocus");
            this.aD = false;
        } else {
            d("controlAudioFocus");
            this.aD = true;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
        } else if (this.D || this.o == null || this.o.f == null) {
        } else {
            if (this.q != null) {
                ddg ddgVar = this.q.mTlogAdapter;
                com.taobao.taobaoavsdk.util.c.a(ddgVar, "onPrepared##PlayState:" + this.o.e);
            }
            if (!this.y && !this.q.getPrepareToFirstFrame()) {
                c(MessageID.onPrepared);
            }
            if (N() && this.o.d) {
                if (this.o.c == 2) {
                    this.o.e = 2;
                } else if (this.o.c == 4) {
                    this.o.e = 4;
                } else if (this.o.c == 1) {
                    X();
                    if (this.C) {
                        c(this.T);
                    } else {
                        C();
                    }
                } else if (this.o.c == 5) {
                    a((Object) iMediaPlayer);
                }
                this.o.d = false;
                a(-1);
                this.C = false;
                return;
            }
            if (!this.J) {
                a((Object) iMediaPlayer);
            }
            if (this.r == 1 && this.o.f != null && this.M) {
                this.ao = true;
                J();
                if (!this.y) {
                    c(MessageID.onPrepared);
                }
                this.o.f.start();
                c(this.T);
                X();
            } else if ((this.r != 1 || !this.M) && this.o.f != null) {
                this.o.f.pause();
            }
            if (this.o.b > 0 && this.o.f != null) {
                this.o.f.seekTo(this.o.b);
            }
            ab();
        }
    }

    private void ab() {
        Map<String, String> customParams;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
        } else if (this.q == null || (customParams = this.q.getCustomParams()) == null || !customParams.containsKey("_progressTime")) {
        } else {
            String str = customParams.get("_progressTime");
            if (StringUtils.isEmpty(str) || (b = com.taobao.taobaoavsdk.util.b.b(str)) <= 0) {
                return;
            }
            F = Math.min(this.ah, Math.max(this.ag, b));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceTextureAvailable " + surfaceTexture + ", w=" + i + ", h=" + i2);
        if (this.q != null) {
            ddg ddgVar = this.q.mTlogAdapter;
            com.taobao.taobaoavsdk.util.c.a(ddgVar, "onSurfaceTextureAvailable##PlayState=" + this.o.e);
        }
        this.av = true;
        this.B = System.currentTimeMillis();
        if (this.o.e == 7 || this.D) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceTextureAvailable " + surfaceTexture + ", return by mPlayState=" + this.o.e + ", mDestoryed=" + this.D);
            return;
        }
        boolean z = false;
        if (this.ap && (this.c != i || this.d != i2)) {
            z = true;
        }
        this.c = i;
        this.d = i2;
        this.g = Build.VERSION.SDK_INT < this.G ? new Surface(surfaceTexture) : this.g;
        if (this.L != null && Build.VERSION.SDK_INT >= this.G) {
            try {
                this.K.setSurfaceTexture(this.L);
            } catch (Exception e) {
                if (this.q != null) {
                    ddg ddgVar2 = this.q.mTlogAdapter;
                    com.taobao.taobaoavsdk.util.c.c(ddgVar2, " setSurfaceTexture error" + com.taobao.taobaoavsdk.util.c.a(e));
                }
            }
            if (Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22) {
                try {
                    Field declaredField = this.K.getClass().getSuperclass().getDeclaredField("mUpdateListener");
                    declaredField.setAccessible(true);
                    this.L.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) declaredField.get(this.K));
                } catch (Throwable th) {
                    String str = E;
                    AVSDKLog.e(str, "setOnFrameAvailableListener error" + th.getMessage());
                }
            }
        }
        if (this.g == null) {
            this.g = new Surface(surfaceTexture);
            this.L = surfaceTexture;
        }
        if ((!this.v && !this.w) || this.o.d || this.o.e == 6) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(" onSurfaceTextureAvailable ");
            sb.append(surfaceTexture);
            sb.append(", return by !mVideoStarted=");
            sb.append(!this.v);
            sb.append(", !mVideoPrepared=");
            sb.append(!this.w);
            sb.append(", mMediaPlayerRecycler.mRecycled=");
            sb.append(this.o.d);
            sb.append(", mPlayState=");
            sb.append(this.o.e);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceTextureAvailable " + surfaceTexture + ", try to setSurface by isFirstRenderOptimize=" + this.q.isFirstRenderOptimize() + ",mPlayState=" + this.o.e);
        if (((!this.q.isFirstRenderOptimize() && !StringUtils.isEmpty(this.ab)) || this.q.isFirstRenderOptimize()) && this.o != null && this.o.f != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWTextureVideoView setSurface in onSurfaceTextureAvailable 1.");
            a(this.o.f, n());
            if (z) {
                this.o.f.setSurfaceSize(this.c, this.d);
            }
        }
        if ((!this.q.isFirstRenderOptimize() && this.o.e == 0 && !StringUtils.isEmpty(this.f)) || (!StringUtils.isEmpty(this.ab) && this.o.e == 3)) {
            Z();
            if (!StringUtils.isEmpty(this.ab) || this.o.e == 3) {
                return;
            }
            this.o.e = 8;
        } else if (this.q.isFirstRenderOptimize() || this.o.f == null || Build.VERSION.SDK_INT >= this.G) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWTextureVideoView setSurface in onSurfaceTextureAvailable 2.");
            a(this.o.f, this.g);
            if (!z) {
                return;
            }
            this.o.f.setSurfaceSize(this.c, this.d);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83525c82", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.q != null) {
            ddg ddgVar = this.q.mTlogAdapter;
            com.taobao.taobaoavsdk.util.c.a(ddgVar, "onSurfaceTextureAvailable##Video width:" + i + "，height:" + i2);
        }
        this.c = i;
        this.d = i2;
        if (this.o.f != null) {
            this.o.f.setSurfaceSize(i, i2);
        }
        if (this.t == null) {
            return;
        }
        int size = this.t.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.t.get(i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("177b9d00", new Object[]{this, surfaceTexture})).booleanValue();
        }
        if (this.q != null) {
            ddg ddgVar = this.q.mTlogAdapter;
            com.taobao.taobaoavsdk.util.c.a(ddgVar, "onSurfaceTextureDestroyed##PlayState =" + this.o.e);
        }
        if ((this.o.e == 5 || this.o.e == 4 || this.o.e == 2 || this.o.e == 1) && Build.VERSION.SDK_INT < this.G) {
            if (this.g != null) {
                this.g.release();
            }
            this.g = null;
            a(this.o.f, (Surface) null);
        }
        this.o.b = getCurrentPosition();
        return Build.VERSION.SDK_INT < this.G;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3157eda", new Object[]{this, surfaceTexture});
            return;
        }
        ae aeVar = this.R;
        if (aeVar == null) {
            return;
        }
        aeVar.a(this);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2aeaa0", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.q != null) {
            ddg ddgVar = this.q.mTlogAdapter;
            com.taobao.taobaoavsdk.util.c.b(ddgVar, "onVideoSizeChanged##Video width:" + i + ", height:" + i2);
        }
        a(iMediaPlayer);
    }

    private void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9604ca", new Object[]{this, iMediaPlayer});
        } else if (this.l == null) {
        } else {
            this.f16552a = iMediaPlayer.getVideoWidth();
            this.b = iMediaPlayer.getVideoHeight();
            if (this.f16552a <= 0 || this.b <= 0 || this.k == null) {
                return;
            }
            this.k.a(this.f16552a, this.b);
            int videoSarNum = iMediaPlayer.getVideoSarNum();
            int videoSarDen = iMediaPlayer.getVideoSarDen();
            if (videoSarNum > 0 && videoSarDen > 0) {
                if (this.K != null) {
                    this.k.b(videoSarNum, videoSarDen);
                } else {
                    g gVar = this.O;
                    if (gVar != null) {
                        gVar.setVideoSampleAspectRatio(videoSarNum, videoSarDen);
                    }
                }
            }
            TextureView textureView = this.K;
            if (textureView != null) {
                textureView.requestLayout();
                return;
            }
            g gVar2 = this.O;
            if (gVar2 == null) {
                return;
            }
            gVar2.requestLayout();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f723554e", new Object[]{this, iMediaPlayer, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    @Override // com.taobao.avplayer.player.a
    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue();
        }
        if ((this.o.e == 5 || this.o.e == 1 || this.o.e == 4 || this.o.e == 2) && this.o.f != null) {
            int i = this.I;
            this.I = (int) (i <= 0 ? this.o.f.getDuration() : i);
        }
        return this.I;
    }

    @Override // com.taobao.avplayer.player.a
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", asyncPrepare ");
        this.ar = false;
        if (kck.a() && this.q != null) {
            ddg ddgVar = this.q.mTlogAdapter;
            com.taobao.taobaoavsdk.util.c.a(ddgVar, "asyncPrepareVideo##PlayState:" + this.o.e);
        }
        this.w = true;
        this.r = 8;
        M();
        this.o.b = 0;
        if (this.o.d) {
            this.o.c = 5;
            L();
            this.z = false;
        } else if (!b(this.o.e) || this.g == null || StringUtils.isEmpty(this.f)) {
        } else {
            Z();
            if (!StringUtils.isEmpty(this.ab)) {
                return;
            }
            this.o.e = 8;
            this.o.d = false;
        }
    }

    @Override // com.taobao.avplayer.player.a
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", prepareToFirstFrame ");
        this.ar = false;
        this.w = true;
        this.r = 8;
        M();
        this.o.b = 0;
        if (this.o.d) {
            this.o.c = 5;
            L();
            this.z = false;
            return;
        }
        if (this.al) {
            this.q.setPrepareToFirstFrame(true);
        }
        if (!b(this.o.e) || StringUtils.isEmpty(this.f)) {
            return;
        }
        if (!this.al) {
            this.q.setPrepareToFirstFrame(true);
        }
        Z();
        if (!StringUtils.isEmpty(this.ab)) {
            return;
        }
        this.o.e = 8;
        this.o.d = false;
    }

    public AbstractMediaPlayer O() {
        AbstractMediaPlayer a2;
        TaobaoMediaPlayer taobaoMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractMediaPlayer) ipChange.ipc$dispatch("7cf86f35", new Object[]{this});
        }
        com.taobao.taobaoavsdk.Tracer.b.a(this.q.mAnalysis);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + " initPlayer##PlayState:" + this.o.e + ",videoURL:" + this.f);
        if (this.q.mPlayContext.getPlayerType() == 2 && this.f != null && this.f.contains(".m3u8")) {
            this.q.mPlayContext.setPlayerType(1);
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = new com.taobao.taobaoavsdk.widget.media.c(this.q.getInstanceType().getValue());
        cVar.bi = this.q.mAnalysis;
        cVar.f21365a = this.q.mPlayContext.getPlayerType();
        cVar.b = 2;
        cVar.C = String.valueOf(this.q.mUserId);
        cVar.y = this.q.mFrom;
        cVar.B = this.q.getVideoId();
        cVar.D = this.q.mPlayContext.getVideoDefinition();
        cVar.E = this.q.getVideoSource();
        cVar.r = this.q.mPlayContext.getCacheKey();
        cVar.W = this.q.mPlayScenes;
        cVar.q = this.q.mPlayContext.mConfigGroup;
        cVar.ag = this.q.mNeedVideoCache;
        cVar.ak = this.q.mPanoType;
        if (!StringUtils.isEmpty(this.q.mPlayContext.getHighCachePath())) {
            cVar.s = this.q.mPlayContext.getHighCachePath();
            cVar.D = this.q.mPlayContext.mHighVideoDefinition;
        }
        cVar.o = this.q.mPlayContext.isUseTBNet();
        cVar.bb = this.q.mPlayContext.getNetWorkQuality();
        cVar.bc = this.q.mPlayContext.getGlobalCurrentBandWidth();
        cVar.bd = this.q.mPlayContext.getGlobalPredictBandWidth();
        cVar.g = (!this.q.mPlayContext.isHardwareHevc() || !oyu.d) ? 0 : 1;
        cVar.f = (!this.q.mPlayContext.isHardwareAvc() || !oyu.d) ? 0 : 1;
        if (cVar.f == 0) {
            if (!oyu.d) {
                cVar.aO = 4;
            } else {
                cVar.aO = 5;
            }
        }
        if (cVar.g == 0) {
            if (!oyu.d) {
                cVar.aP = 4;
            } else {
                cVar.aP = 5;
            }
        }
        cVar.V = this.q.mPlayContext.mEmbed ? "embedvideo" : "null";
        cVar.t = this.q.getPlayToken();
        cVar.H = this.q.mPlayContext.getDevicePerformanceLevel() + "/runtimeLevel:" + this.q.mPlayContext.mRuntimeLevel;
        if (this.q.mConfigAdapter != null && this.q.mConfigAdapter.e() && this.q.mPlayContext.getVideoLength() > 0 && this.q.mPlayContext.getVideoLength() < 262144000) {
            cVar.u = this.q.mPlayContext.getVideoLength();
        }
        cVar.K = this.q.mPlayContext.getNetSpeed();
        cVar.L = this.q.mPlayContext.isVideoDeviceMeaseureEnable();
        cVar.M = this.q.mPlayContext.mHighPerformancePlayer;
        StringBuilder sb = new StringBuilder();
        sb.append(this.q.mPlayContext.getRateAdaptePriority());
        sb.append("#");
        sb.append(this.q.mPlayContext.isH265() ? "h265" : "h264");
        cVar.N = sb.toString();
        cVar.aa = this.q.getPlayExpUTParams();
        cVar.be = this.q.getControlParams();
        cVar.ai = this.q.getPrepareToFirstFrame();
        cVar.an = this.q.mStartPos;
        cVar.ab = this.q.getCustomParams();
        cVar.ao = this.q.mPlayContext.getForceMuteMode();
        cVar.ac = this.q.mConnectTimeout;
        cVar.ad = this.q.mReadTimeout;
        cVar.ae = this.q.mRetryTime;
        cVar.as = this.q.mUsingInterface;
        cVar.at = this.q.mAudioOnly;
        cVar.ah = this.q.mUseAudioCache;
        cVar.av = this.q.mDynamicPlayEx;
        cVar.aw = this.q.mSwitchScene;
        cVar.ax = this.q.mSwitchSceneTime;
        cVar.ay = this.q.mIsFloat;
        cVar.aY = this.q.mPlayContext.mChooseVVCReason.getValue();
        cVar.aR = this.N;
        cVar.aU = this.P;
        cVar.bh = this.aF;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView initPlayer " + this + ", + initPlayer, " + this.q.getVideoId() + ", " + this.q.mFrom + ", " + this.q.getPlayToken() + ", " + cVar.ai);
        Map<String, String> uTParams = this.q.getUTParams();
        if (uTParams != null) {
            String str = uTParams.get("product_type");
            if (!StringUtils.isEmpty(str)) {
                cVar.z = str;
            }
            String str2 = uTParams.get("spm-cnt");
            if (!StringUtils.isEmpty(str2)) {
                cVar.az = str2;
            }
        }
        if (c().startsWith("content://")) {
            this.q.mPlayContext.setPlayerType(2);
        }
        if (this.q != null && (this.q.mPlayContext.getPlayerType() == 3 || this.q.mPlayContext.getPlayerType() == 1)) {
            try {
                if (this.q != null) {
                    cVar.aj = this.q.getNeedCommitUserToFirstFrame();
                }
                Context context = this.l != null ? this.l : this.m;
                if (this.q != null && this.q.mConfigAdapter != null) {
                    taobaoMediaPlayer = new TaobaoMediaPlayer(context, this.q.mConfigAdapter);
                } else {
                    taobaoMediaPlayer = new TaobaoMediaPlayer(context);
                }
                a2 = taobaoMediaPlayer;
                ((TaobaoMediaPlayer) a2).addExperienceInfo(this.q.mPlayContext.mExperienceIdSet, this.q.mPlayContext.mExperienceReleaseIdSet, this.q.mPlayContext.mExperienceBucketIdSet);
                if (this.K != null) {
                    ((TaobaoMediaPlayer) a2).setShowViewParant((ViewGroup) this.K.getParent());
                } else if (this.O != null) {
                    if (this.N) {
                        ((TaobaoMediaPlayer) a2).setShowViewParant((ViewGroup) ((MediaSurfaceView) this.O).getParent());
                    } else {
                        ((TaobaoMediaPlayer) a2).setShowViewParant((ViewGroup) ((MediaTextureView) this.O).getParent());
                    }
                }
            } catch (Throwable th) {
                AVSDKLog.e("AVDSK", "initPlayer##TaobaoMediaPlayer load error:" + th.getMessage());
                c((AbstractMediaPlayer) null);
                a2 = a(cVar);
            }
        } else {
            a2 = a(cVar);
        }
        try {
            a(a2, cVar);
        } catch (Throwable th2) {
            if (this.q != null) {
                ddg ddgVar = this.q.mTlogAdapter;
                com.taobao.taobaoavsdk.util.c.c(ddgVar, "initPlayer##  prepare player error" + th2.getMessage());
            }
            if (a2 != null) {
                c(a2);
                try {
                    if (a2 instanceof TaobaoMediaPlayer) {
                        a2 = a(cVar);
                        a(a2, cVar);
                    }
                    this.aa = -2;
                    if (this.aq) {
                        b(IMediaPlayer.MEDIA_INFO_PLAYER_ACTIVE_VIDEO_PLAY_ERROR, 0);
                    } else {
                        ac();
                    }
                } catch (Throwable unused) {
                    com.taobao.taobaoavsdk.util.c.c(this.q.mTlogAdapter, "initPlayer##backup mediaplayer it error:");
                    this.aa = -3;
                    if (this.aq) {
                        b(IMediaPlayer.MEDIA_INFO_PLAYER_ACTIVE_VIDEO_PLAY_ERROR, 0);
                    } else {
                        ac();
                    }
                }
            }
        }
        return a2;
    }

    private void c(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cbf1c5", new Object[]{this, abstractMediaPlayer});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + " releaseForInit");
        if (abstractMediaPlayer == null) {
            return;
        }
        try {
            abstractMediaPlayer.release();
        } catch (Throwable unused) {
        }
    }

    private void ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + " notifyVideoErrorForInit");
        try {
            a((Object) null, 1, 0);
        } catch (Throwable unused) {
        }
        if (this.q == null || this.q.mUTAdapter == null || this.aa >= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", "" + this.aa);
        hashMap.put(snv.EXP_KEY_SUB_BUSINESS_TYPE, "" + this.q.mFrom);
        hashMap.put("page_name", l.getInstance().getCurrentPageName());
        hashMap.put(PushMessageHelper.ERROR_TYPE, "init");
        hashMap.put("play_token", this.q.getPlayToken());
        this.q.mUTAdapter.a("DWVideo", "Button", "VideoPlayError", this.q.getUTParams(), hashMap);
    }

    private void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView: " + this + ", notifyVideoError, errorCode=" + i + ", extra=" + i2);
        try {
            a((Object) null, i, i2);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "call notifyVideoError failed." + th);
        }
    }

    private AbstractMediaPlayer a(com.taobao.taobaoavsdk.widget.media.c cVar) {
        NativeMediaPlayer nativeMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractMediaPlayer) ipChange.ipc$dispatch("3e530a40", new Object[]{this, cVar});
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + degradeMediaPlayer");
        Context context = this.l != null ? this.l : this.m;
        if (this.q != null && this.q.mConfigAdapter != null) {
            nativeMediaPlayer = new NativeMediaPlayer(context, this.q.mConfigAdapter);
        } else {
            nativeMediaPlayer = new NativeMediaPlayer(context);
        }
        this.q.mPlayContext.setHardwareAvc(true);
        this.q.mPlayContext.setHardwareHevc(true);
        cVar.g = 1;
        cVar.f = 1;
        this.q.mPlayContext.setPlayerType(2);
        if (!StringUtils.isEmpty(this.q.mPlayContext.getBackupVideoUrl()) && this.q.mPlayContext.isH265()) {
            this.f = this.q.mPlayContext.getBackupVideoUrl();
            this.q.mPlayContext.setVideoUrl(this.f);
            this.q.mPlayContext.setH265(false);
            this.q.mPlayContext.setHighCachePath("");
            this.q.mPlayContext.setVideoDefinition(this.q.mPlayContext.getBackupVideoDefinition());
            this.q.mPlayContext.setCacheKey(this.q.mPlayContext.getBackupCacheKey());
            if (cVar != null) {
                cVar.D = this.q.mPlayContext.getBackupVideoDefinition();
                cVar.r = this.q.mPlayContext.getBackupCacheKey();
                if (this.q.mConfigAdapter != null && this.q.mConfigAdapter.e() && this.q.mPlayContext.getVideoLength() > 0 && this.q.mPlayContext.getVideoLength() < 262144000) {
                    cVar.u = this.q.mPlayContext.getBackupVideoLength();
                }
            }
        }
        return nativeMediaPlayer;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(tv.danmaku.ijk.media.player.AbstractMediaPlayer r18, com.taobao.taobaoavsdk.widget.media.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.player.c.a(tv.danmaku.ijk.media.player.AbstractMediaPlayer, com.taobao.taobaoavsdk.widget.media.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // tb.ozn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void release(boolean r8) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.player.c.release(boolean):void");
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
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.avplayer.player.a, tb.ozn.a
    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        if (this.o != null && this.o.e != 7 && this.o.e != 8 && this.o.e != 6 && this.o.e != 3) {
            int currentPosition = (int) (this.o.f == null ? this.e : this.o.f.getCurrentPosition());
            this.e = currentPosition;
            return currentPosition;
        }
        return this.e;
    }

    @Override // com.taobao.avplayer.player.a
    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b793bc", new Object[]{this})).intValue();
        }
        if (this.o != null && this.o.f != null && this.o.e != 8 && this.o.e != 6 && this.o.e != 3 && t() > 0) {
            this.ak = (int) (((this.o.f.getCurCachePosition() * 1000.0f) * 100.0f) / t());
        }
        return this.ak;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreCompletionListener
    public void onPreCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d27d69", new Object[]{this, iMediaPlayer});
        } else {
            H();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnLoopCompletionListener
    public void onLoopCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce872948", new Object[]{this, iMediaPlayer});
        } else {
            I();
        }
    }

    @Override // com.taobao.avplayer.player.a
    public float w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a2716e", new Object[]{this})).floatValue() : this.k.d();
    }

    @Override // com.taobao.avplayer.player.a
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + setVolume " + f);
        if (this.o.i == f) {
            return;
        }
        this.o.i = f;
        if (this.o.e != 0 && !this.y && !this.aD) {
            if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableSetvolumeNewLogic", "true"))) {
                if (this.o.e == 1) {
                    c(CommandID.setVolume);
                }
            } else {
                c(CommandID.setVolume);
            }
        }
        if (this.o == null || this.o.f == null || this.o.e == 7 || this.o.e == 3) {
            return;
        }
        try {
            this.o.f.setVolume(f, f);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "setVolume##RequestAudioFocus error" + th.getMessage());
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else if (this.o == null || this.o.f == null || !(this.o.f instanceof TaobaoMediaPlayer)) {
        } else {
            try {
                ((TaobaoMediaPlayer) this.o.f).updateMuteNodes(z);
            } catch (Throwable unused) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "dw texturevideoview updateMuteNodes error.");
            }
        }
    }

    @Override // com.taobao.avplayer.player.a
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + setSysVolume " + f);
        try {
            if (this.U == null || this.o == null || this.o.e == 7 || this.o.e == 3) {
                return;
            }
            this.U.setStreamVolume(3, (int) f, 4);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "setSysVolume##SetStreamVolume error" + th.getMessage());
        }
    }

    @Override // com.taobao.avplayer.player.a
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + destroy");
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "keepScreenOn: onDestroy currentinstanceCount=" + an + "," + this);
        Handler handler = this.Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.Q = null;
        }
        d("destory");
        this.U = null;
        this.aA++;
        if (this.t != null) {
            this.t.clear();
        }
        if (this.o != null && this.o.f != null) {
            b(this.o.f);
        }
        if (!StringUtils.isEmpty(this.ab) && 1 == this.o.e) {
            b(true);
        }
        this.D = true;
        ah();
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\"]");
            if (this.q != null && config.contains(this.q.mFrom)) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "destory not PlayerInstanceManager");
                this.o.f.release();
                this.o = null;
                return;
            }
        }
        if (this.ao) {
            K();
        }
        W();
        try {
            if (this.K == null) {
                return;
            }
            if (this.g != null) {
                this.g.release();
                this.g = null;
            }
            if (!com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableFixDWVideoView", "true"))) {
                return;
            }
            this.K = null;
        } catch (Throwable unused) {
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "close");
        K();
        ah();
        this.o.e = 6;
        this.o.b = 0;
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue();
        }
        if (this.q.mAudioOnly || this.h) {
            return true;
        }
        TextureView textureView = this.K;
        if (textureView != null) {
            return textureView.isAvailable();
        }
        g gVar = this.O;
        if (gVar == null) {
            return false;
        }
        return gVar.isAvailable();
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
            ad();
            if (f() != 3 && f() != 6 && f() != 7 && f() != 4 && (handler = this.Q) != null) {
                handler.sendEmptyMessageDelayed(0, F);
            }
        } else if (i == 1 && !this.av) {
            a(null, 12120L, 500L, 0L, null);
        }
        return false;
    }

    private void ad() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1cc72a", new Object[]{this});
        } else if (!Q() || this.o == null) {
        } else {
            if (this.o.e != 1 && (!this.ai || this.o.e != 2)) {
                return;
            }
            this.ai = false;
            if (this.T) {
                int currentPosition = getCurrentPosition();
                if (currentPosition < 0) {
                    return;
                }
                int t = t();
                if (t > 0) {
                    Math.ceil(((currentPosition * 1.0f) / t) * 1000.0f);
                    i = B();
                }
                kck.a();
                a(currentPosition, i, t);
                return;
            }
            a(-1, -1, -1);
        }
    }

    @Override // com.taobao.avplayer.player.a
    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.o != null && this.o.f != null && (this.o.f instanceof MonitorMediaPlayer) && ((MonitorMediaPlayer) this.o.f).isCompleteHitCache();
    }

    @Override // com.taobao.avplayer.player.a
    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.o != null && this.o.f != null && (this.o.f instanceof MonitorMediaPlayer) && ((MonitorMediaPlayer) this.o.f).isUseVideoCache();
    }

    @Override // com.taobao.avplayer.player.a
    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.o != null && this.o.f != null && (this.o.f instanceof MonitorMediaPlayer) && ((MonitorMediaPlayer) this.o.f).isHitCache();
    }

    @Override // com.taobao.avplayer.player.a
    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else if (this.o == null || this.o.f == null) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "setPlayRate " + f);
            this.o.f.setPlayRate(f);
        }
    }

    private void ae() {
        DWAspectRatio videoAspectRatio;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2adeab", new Object[]{this});
        } else if (this.k == null || this.q == null || (videoAspectRatio = this.q.getVideoAspectRatio()) == null) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + "setAspectRatio " + videoAspectRatio);
            int i = AnonymousClass5.f16558a[videoAspectRatio.ordinal()];
            if (i == 1) {
                this.k.c(0);
                i(0);
            } else if (i == 2) {
                this.k.c(1);
                i(1);
            } else if (i != 3) {
            } else {
                this.k.c(3);
            }
        }
    }

    private void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else if (this.o == null || this.o.f == null || !(this.o.f instanceof TaobaoMediaPlayer)) {
        } else {
            ((TaobaoMediaPlayer) this.o.f)._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_EXTEND_VIDEO_ASPECT_RATIO, i);
        }
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        if (this.q != null && this.q.mBackgroundVideo) {
            z = true;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView onActivityResumed " + this + ", " + activity + ", " + z + ", " + this.l);
        if (z || this.l != activity) {
            return;
        }
        this.W = System.currentTimeMillis();
        this.M = true;
        if (this.o != null && this.o.d) {
            if (e() && this.o.c == 2) {
                this.o.c = 1;
            }
            boolean ai = ai();
            if (this.o.c != 1 || !ai) {
                return;
            }
            L();
            return;
        }
        if (this.o != null && this.o.f != null && this.o.k && this.v && this.o.e != 4) {
            q();
        }
        if (this.q == null) {
            return;
        }
        if (this.q.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN && this.q.screenType() != DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
            return;
        }
        kcl.a(this.q.getWindow() == null ? this.q.getActivity().getWindow() : this.q.getWindow());
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        boolean z = this.q != null && this.q.mBackgroundVideo;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView onActivityPaused " + this + ", " + activity + ", " + z + ", " + this.l);
        if (z || this.l != activity) {
            return;
        }
        this.M = false;
        if (this.o == null || this.o.f == null) {
            return;
        }
        if (this.o.e != 1 && this.o.e != 5) {
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
        dde ddeVar = this.ad;
        if (ddeVar != null) {
            return ddeVar.getStartTime();
        }
        return this.W;
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
        } else {
            this.ad = ddeVar;
        }
    }

    public void a(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701a40a2", new Object[]{this, innerStartFuncListener});
        } else {
            this.ae = innerStartFuncListener;
        }
    }

    @Override // tv.danmaku.ijk.media.player.InnerStartFuncListener
    public long getInnerStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c800e8a", new Object[]{this})).longValue();
        }
        InnerStartFuncListener innerStartFuncListener = this.ae;
        if (innerStartFuncListener == null) {
            return 0L;
        }
        return innerStartFuncListener.getInnerStartTime();
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (this.o == null || this.o.f == null || !(this.o.f instanceof TaobaoMediaPlayer)) {
        } else {
            ((TaobaoMediaPlayer) this.o.f).callWithMsg(map);
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            a(null, 18L, z ? 1L : 0L, 0L, null);
        }
    }

    private void af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38f62c", new Object[]{this});
        } else if (this.O == null || this.o == null || this.o.f == null || !(this.o.f instanceof TaobaoMediaPlayer)) {
        } else {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this.o.f;
            if (this.N) {
                taobaoMediaPlayer.setShowViewParant((ViewGroup) ((MediaSurfaceView) this.O).getParent());
            } else {
                taobaoMediaPlayer.setShowViewParant((ViewGroup) ((MediaTextureView) this.O).getParent());
            }
        }
    }

    private void a(IMediaPlayer iMediaPlayer, g.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f6f556", new Object[]{this, iMediaPlayer, bVar});
        } else if (iMediaPlayer == null) {
        } else {
            if (bVar == null) {
                a(iMediaPlayer, (Surface) null);
            } else if (iMediaPlayer == null) {
            } else {
                a(iMediaPlayer, bVar.b());
            }
        }
    }

    public g.b R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g.b) ipChange.ipc$dispatch("52ee4ce9", new Object[]{this}) : this.x;
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void a(g.b bVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a5bd8", new Object[]{this, bVar, new Integer(i), new Integer(i2)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceCreated width=" + i + ", height=" + i2 + ", mSurfaceWidth=" + this.c + ", mSurfaceHeight=" + this.d);
        String currentPageName = l.getInstance().getCurrentPageName();
        if (bVar != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " SeamlessSwitch onSurfaceCreated holder: " + bVar + ", surface: " + bVar.b() + ", currentPagename=" + currentPageName);
        }
        this.av = true;
        this.B = System.currentTimeMillis();
        af();
        boolean z2 = this.x != null && this.N;
        this.x = bVar;
        if (this.c != i || this.d != i2) {
            z = true;
        }
        this.c = i;
        this.d = i2;
        if ((!this.v && !this.w) || this.o.d || this.o.e == 6 || this.o == null || this.o.f == null) {
            return;
        }
        if (z2) {
            a(this.o.f, (Surface) null);
        }
        a(this.o.f, R());
        if (!z || i <= 0 || i2 <= 0) {
            return;
        }
        this.o.f.setSurfaceSize(i, i2);
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else if (this.R == null || !this.N || !this.A) {
        } else {
            if (!this.aG) {
                this.aH = System.currentTimeMillis();
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "yezo: notifySurfaceTextureUpdate at dw with surfaceView and mFirstFrameUpdateTs=" + System.currentTimeMillis());
                a(this.aH);
                this.aG = true;
                a(null, 12101L, this.aH, 0L, null);
            }
            this.R.a(this);
        }
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void a(g.b bVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b11922b", new Object[]{this, bVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + "  onSurfaceChanged holder: " + bVar + ", format: " + i + ", width: " + i2 + ", height: " + i3 + ", currentPagename=" + currentPageName);
        af();
        if (this.c <= 0 || this.d <= 0 || (this.c == i2 && this.d == i3)) {
            z = false;
        }
        this.c = i2;
        this.d = i3;
        if (bVar.a() != this.O) {
            return;
        }
        this.x = bVar;
        S();
        if (this.o != null && this.o.f != null && bVar.b() != null) {
            a(this.o.f, bVar.b());
        }
        if (this.o == null || this.o.f == null || !z) {
            return;
        }
        this.o.f.setSurfaceSize(i2, i3);
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void a(g.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192b685c", new Object[]{this, bVar, new Boolean(z)});
            return;
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        if (bVar != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceDestroyed holder: " + bVar + ", surface: " + bVar.b() + ", currentPagename=" + currentPageName);
        }
        if ((this.o.e == 5 || this.o.e == 4 || this.o.e == 2 || this.o.e == 1) && Build.VERSION.SDK_INT < k.A) {
            a(this.o.f, (Surface) null);
            this.x = null;
        }
        if (z && this.o != null && this.o.f != null && this.N) {
            a(this.o.f, (Surface) null);
            this.x = null;
        }
        this.o.b = getCurrentPosition();
    }

    @Override // com.taobao.mediaplay.player.g.a
    public void a(g.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53647978", new Object[]{this, bVar});
            return;
        }
        if (this.A && !this.aG) {
            this.aH = System.currentTimeMillis();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onSurfaceUpdate and mFirstFrameUpdateTs=" + System.currentTimeMillis());
            a(this.aH);
            this.aG = true;
            a(null, 12101L, this.aH, 0L, null);
        }
        ae aeVar = this.R;
        if (aeVar == null) {
            return;
        }
        aeVar.a(this);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.o == null || this.o.f == null || !(this.o.f instanceof TaobaoMediaPlayer)) {
        } else {
            HashMap hashMap = new HashMap();
            String str = MediaConstant.CMD_SET_FIRST_FRAME_UPDATE_TIME;
            hashMap.put(str, "" + j);
            ((TaobaoMediaPlayer) this.o.f).callWithMsg(hashMap);
        }
    }

    @Override // com.taobao.avplayer.player.DWTextureView.a, com.taobao.mediaplay.player.g.a
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "dw TextureVideoView " + this + ", + onWindowVisibilityChanged " + i);
        if (this.o == null || this.o.f == null || !(this.o.f instanceof TaobaoMediaPlayer)) {
            return;
        }
        TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this.o.f;
        HashMap hashMap = new HashMap();
        hashMap.put(MediaConstant.CMD_SET_VIEW_VISIBLE, i == 0 ? "1" : "0");
        taobaoMediaPlayer.callWithMsg(hashMap);
    }

    @Override // com.taobao.avplayer.player.DWTextureView.a, com.taobao.mediaplay.player.g.a
    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
            return;
        }
        this.au = true;
        Handler handler = this.Q;
        if (handler != null && !this.av) {
            handler.sendEmptyMessageDelayed(1, 500L);
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + onAttachedToWindow");
    }

    @Override // com.taobao.avplayer.player.DWTextureView.a, com.taobao.mediaplay.player.g.a
    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DW TextureVideoView " + this + ", + onDetachedFromWindow");
        g gVar = this.O;
        if (gVar == null || !(gVar.getView() instanceof SurfaceView) || !((MediaSurfaceView) this.O).getSurfaceDestroyed()) {
            return;
        }
        ((MediaSurfaceView) this.O).releaseSurfaceControl();
    }

    private void a(MediaPlayControlContext mediaPlayControlContext, long j, long j2, long j3) {
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

    private void ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
            return;
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\"]");
            if (this.q != null && config.contains(this.q.mFrom)) {
                return;
            }
        }
        if (this.q.mBackgroundAudio && this.q.mAudioOnly) {
            ozk.g().c();
        } else {
            ozm.h().c();
        }
    }

    private void ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[]{this});
            return;
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\"]");
            if (this.q != null && config.contains(this.q.mFrom)) {
                return;
            }
        }
        if (this.q.mBackgroundAudio && this.q.mAudioOnly) {
            ozk.g().a(this.o.f32509a, this);
        } else {
            ozm.h().a(this.o.f32509a, this);
        }
    }

    private boolean ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue();
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\"]");
            if (this.q != null && config.contains(this.q.mFrom)) {
                return false;
            }
        }
        if (this.q.mBackgroundAudio && this.q.mAudioOnly) {
            return ozk.g().b();
        }
        return ozm.h().b();
    }

    private void aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab715430", new Object[]{this});
            return;
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\"]");
            if (this.q != null && config.contains(this.q.mFrom)) {
                return;
            }
        }
        if (this.q.mBackgroundAudio && this.q.mAudioOnly) {
            this.o = ozk.g().a(this.o);
        } else {
            this.o = ozm.h().a(this.o);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\"]");
            if (this.q != null && config.contains(this.q.mFrom)) {
                if (this.o != null) {
                    return;
                }
                this.o = new ozn(str, this);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getMediaRecycler not PlayerInstanceManager");
                return;
            }
        }
        if (this.q.mBackgroundAudio && this.q.mAudioOnly) {
            this.o = ozk.g().b(str, this);
        } else {
            this.o = ozm.h().b(str, this);
        }
    }
}
