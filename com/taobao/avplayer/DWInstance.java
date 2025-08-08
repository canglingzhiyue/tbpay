package com.taobao.avplayer;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.InterfaceUsageCounter;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.dde;
import tb.ddg;
import tb.kck;
import tb.kcl;
import tb.kge;
import tb.obw;
import tb.oyw;
import tb.sku;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.InnerStartFuncListenerImpl;

/* loaded from: classes6.dex */
public class DWInstance implements aw, ax, com.taobao.avplayer.common.b, com.taobao.avplayer.common.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMPONENT_NAME = "dw";
    private static final long INVALID = -1;
    private com.taobao.avplayer.common.c mCloseViewClickListener;
    private View mCoverView;
    private FrameLayout.LayoutParams mCoverViewLayoutParams;
    public DWContext mDWContext;
    private DWLifecycleType mDWLifecycleType;
    private x mDWPicController;
    private com.taobao.avplayer.common.ab mDWScreenSmallWindowListener;
    private al mDWVideoController;
    private boolean mDestroy;
    private dde mExternFirstRenderAdapter;
    private com.taobao.avplayer.playercontrol.b mFloatViewController;
    private boolean mHideCloseView;
    private com.taobao.avplayer.common.n mHookStartListener;
    private InnerStartFuncListener mInnerStartListener;
    private com.taobao.mediaplay.player.e mMediaPlayLifeCycleListener;
    private com.taobao.avplayer.common.z mPicViewClickListener;
    private FrameLayout mRootView;
    private com.taobao.avplayer.common.z mRootViewClickListener;
    private com.taobao.avplayer.common.aa mRootViewTouchListener;
    private boolean mSetup;
    private av mVideoLifecycleListener;
    private aw mVideoLifecycleListener2;
    public ax mVideoLoopCompleteListener;
    private az mVideoPlayTimeListener;

    /* renamed from: com.taobao.avplayer.DWInstance$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16412a = new int[DWInstanceType.values().length];

        static {
            try {
                f16412a[DWInstanceType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16412a[DWInstanceType.PIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class d {
        public com.taobao.avplayer.common.ac B;
        public com.taobao.avplayer.common.af D;
        public ArrayList<Boolean> E;
        public Map<String, String> F;
        public Map<String, String> G;
        public Map<String, String> H;
        public boolean J;
        public boolean K;
        public boolean L;
        public boolean M;
        public ar N;
        public DWLifecycleType O;
        public boolean P;
        public boolean Q;
        public com.taobao.avplayer.interactivelifecycle.frontcover.model.a T;
        public com.taobao.avplayer.interactivelifecycle.backcover.model.a U;
        public View aA;
        public LinearLayout.LayoutParams aB;
        public LinearLayout.LayoutParams aC;
        public String aD;
        public boolean aE;
        public boolean aF;
        public ddg aK;
        public boolean aM;
        public boolean aN;
        public boolean aO;
        public DWAspectRatio aP;
        public bf aQ;
        public String aS;
        public boolean aT;
        public boolean aU;
        public Map<String, String> aV;
        public String ac;
        public String ad;
        public boolean ae;
        public boolean af;
        public boolean ai;
        public boolean ap;
        public boolean aq;
        public boolean ar;
        public boolean as;
        public boolean at;
        public boolean au;
        public boolean av;
        public boolean aw;
        public boolean ax;
        public boolean ay;
        public View az;
        public String c;
        public Activity e;
        public String f;
        public String k;
        public String l;
        public String m;
        public String n;
        public JSONObject o;
        public int p;
        public int q;
        public String r;
        public com.taobao.avplayer.common.p s;
        public com.taobao.avplayer.common.v t;
        public as u;
        public Map<String, String> w;
        public ap x;
        public com.taobao.avplayer.common.d y;
        public com.taobao.avplayer.common.ad z;

        /* renamed from: a  reason: collision with root package name */
        public boolean f16416a = true;
        public boolean b = false;
        public boolean d = false;
        public long g = -1;
        public int h = 0;
        public int i = 0;
        public long j = -1;
        public boolean I = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
        public boolean R = false;
        public boolean S = false;
        public boolean V = true;
        public boolean W = true;
        public boolean X = true;
        public boolean Y = false;
        public boolean Z = false;
        public DWVideoScreenType aa = DWVideoScreenType.NORMAL;
        public boolean ab = false;
        public boolean ag = false;
        public boolean ah = false;
        public boolean aj = false;
        public boolean ak = false;
        public boolean al = true;
        public boolean am = false;
        public boolean an = true;
        public boolean ao = true;
        public int aG = -1;
        public int aH = -1;
        public int aI = -1;
        public int aJ = -1;
        public boolean aL = false;
        public DWInstanceType aR = DWInstanceType.VIDEO;
        public boolean v = false;
        public boolean A = true;

        static {
            kge.a(352722500);
        }
    }

    public void initAdapter(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b746db07", new Object[]{this, dVar});
        }
    }

    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
        }
    }

    public static /* synthetic */ FrameLayout access$100(DWInstance dWInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("9f173c20", new Object[]{dWInstance}) : dWInstance.mRootView;
    }

    public static /* synthetic */ al access$200(DWInstance dWInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (al) ipChange.ipc$dispatch("b26c0e9a", new Object[]{dWInstance}) : dWInstance.mDWVideoController;
    }

    public static /* synthetic */ com.taobao.avplayer.common.ab access$300(DWInstance dWInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.ab) ipChange.ipc$dispatch("f43fc92d", new Object[]{dWInstance}) : dWInstance.mDWScreenSmallWindowListener;
    }

    static {
        kge.a(-594545266);
        kge.a(-123403623);
        kge.a(-19190688);
        kge.a(556437024);
        kge.a(857599862);
        try {
            if (kck.f29959a != null) {
                oyw.a(kck.f29959a);
            }
        } catch (Throwable unused) {
            AVSDKLog.e("TBDWInstance", "Player Proxy init ERROR");
        }
        AVSDKLog.d("TBDWInstance", "  Player Proxy init ");
    }

    public DWInstance(d dVar) {
        if (kck.a()) {
            AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, " DWInstance init");
        }
        this.mDWContext = new DWContext(dVar.e);
        this.mDWContext.mUsingInterface = dVar.aS;
        this.mDWContext.mPlayContext = new MediaPlayControlContext(dVar.e);
        this.mDWContext.mPlayContext.mTBVideoSourceAdapter = new ag(this.mDWContext);
        this.mDWContext.mPlayContext.mConfigGroup = "DWInteractive";
        this.mDWContext.mPlayContext.mEmbed = dVar.d;
        this.mDWContext.mPlayContext.setVideoUrl(dVar.f);
        this.mDWContext.mInteractiveId = dVar.g;
        this.mDWContext.mInteractiveParms = dVar.w;
        this.mDWContext.addIctTempCallback(dVar.aQ);
        this.mDWContext.setNeedAD(false);
        this.mDWContext.mContentId = dVar.ac;
        this.mDWContext.mCid = dVar.ad;
        this.mDWContext.setNeedAfterAD(false);
        this.mDWContext.mPlayContext.mLocalVideo = dVar.K;
        this.mDWContext.setNeedGesture(dVar.ag);
        this.mDWContext.setVideoAspectRatio(dVar.aP);
        this.mDWContext.setNeedMSG(dVar.ab);
        this.mDWContext.setNeedCloseUT(dVar.V);
        this.mDWContext.setNeedFirstPlayUT(dVar.W);
        this.mDWContext.setInitScreenType(dVar.aa);
        this.mDWContext.setHideNormalGoodsView(dVar.af);
        this.mDWContext.setRecommendVideoOnlyShowFullscreen(dVar.ai);
        this.mDWContext.setUserInfoAdapter(dVar.D);
        this.mDWContext.setHiddenMiniProgressBar(dVar.aq);
        this.mDWContext.setHiddenToastView(dVar.ar);
        this.mDWContext.setHiddenGestureView(dVar.au);
        this.mDWContext.setHiddenNetworkErrorView(dVar.aw);
        this.mDWContext.setHiddenPlayErrorView(dVar.ax);
        this.mDWContext.setHiddenThumbnailPlayBtn(dVar.ay);
        this.mDWContext.setHiddenLoading(dVar.as);
        this.mDWContext.setNeedSmallWindow(dVar.av);
        this.mDWContext.setMiniProgressAnchorShown(dVar.aN);
        this.mDWContext.setActivityToggleForLandscape(dVar.M);
        this.mDWContext.mUserId = dVar.j;
        this.mDWContext.mShowPlayRate = dVar.f16416a;
        this.mDWContext.mWidth = dVar.p;
        this.mDWContext.mHeight = dVar.q;
        DWContext dWContext = this.mDWContext;
        dWContext.mNormalWidth = dWContext.mWidth;
        DWContext dWContext2 = this.mDWContext;
        dWContext2.mNormalHeight = dWContext2.mHeight;
        this.mDWContext.mDWImageAdapter = dVar.s;
        this.mDWContext.mNetworkAdapter = dVar.t;
        this.mDWContext.mUTAdapter = dVar.u;
        this.mDWContext.mConfigAdapter = dVar.x;
        this.mDWContext.mConfigParamsAdapter = dVar.y;
        this.mDWContext.mNetworkFlowAdapter = dVar.N;
        this.mDWContext.mDWAlarmAdapter = dVar.z;
        this.mDWContext.mSharedapter = dVar.B;
        DWContext dWContext3 = this.mDWContext;
        MediaPlayControlContext mediaPlayControlContext = dWContext3.mPlayContext;
        String str = dVar.k;
        mediaPlayControlContext.mFrom = str;
        dWContext3.mFrom = str;
        DWContext dWContext4 = this.mDWContext;
        MediaPlayControlContext mediaPlayControlContext2 = dWContext4.mPlayContext;
        String str2 = dVar.n;
        mediaPlayControlContext2.mVideoId = str2;
        dWContext4.mVideoId = str2;
        this.mDWContext.mPlayContext.setMediaInfoParams(dVar.o);
        this.mDWContext.setVideoToken(dVar.aD);
        this.mDWContext.mPlayContext.setVideoToken(dVar.aD);
        DWContext dWContext5 = this.mDWContext;
        MediaPlayControlContext mediaPlayControlContext3 = dWContext5.mPlayContext;
        String str3 = dVar.m;
        mediaPlayControlContext3.mVideoSource = str3;
        dWContext5.mVideoSource = str3;
        this.mDWContext.mInVideoDetail = dVar.ae;
        this.mDWContext.mute(dVar.I);
        this.mDWContext.mMuteIconDisplay = dVar.aF;
        this.mDWContext.mMuteIconLeftMargin = dVar.aG;
        this.mDWContext.mMuteIconRightMargin = dVar.aH;
        this.mDWContext.mMuteIconBottomMargin = dVar.aI;
        this.mDWContext.mMuteIconTopMargin = dVar.aJ;
        this.mDWContext.showInteractive(dVar.J);
        this.mDWContext.setNeedFrontCover(dVar.P);
        this.mDWContext.setFrontCoverData(dVar.T);
        this.mDWContext.setNeedBackCover(dVar.Q);
        this.mDWContext.setBacktCover(dVar.U);
        this.mDWContext.setPlayScenes(dVar.c);
        this.mDWContext.setPauseInBackground(dVar.b);
        this.mDWContext.mNeedScreenButton = dVar.X;
        this.mDWContext.mNeedVideoCache = dVar.Z;
        this.mDWContext.setShowGoodsList(dVar.Y);
        this.mDWContext.mScene = dVar.l;
        this.mDWContext.mLoop = dVar.aM;
        this.mDWContext.mHiddenPlayingIcon = dVar.ap;
        this.mDWContext.mHookKeyBackToggleEvent = dVar.ah;
        this.mDWContext.mMuteDisplay = dVar.aE;
        this.mDWContext.mPanoType = dVar.h;
        this.mDWContext.mStartPos = dVar.i;
        this.mDWContext.mHttpHeader = dVar.H;
        this.mDWContext.mBackgroundVideo = dVar.aU;
        String str4 = "";
        if (com.taobao.taobaoavsdk.util.b.b(this.mDWContext.mFrom, this.mDWContext.mConfigAdapter != null ? this.mDWContext.mConfigAdapter.getConfig(str4, "usePicModeBizCodeList", str4) : str4)) {
            dVar.aR = DWInstanceType.PIC;
        }
        this.mDWContext.setInstanceType(dVar.aR);
        this.mDWContext.setSourcePageName(dVar.r);
        this.mDWContext.mAudioOnly = dVar.aT;
        this.mDWContext.mUseShortAudioFocus = dVar.v;
        this.mDWContext.mReleaseShortFocusWhenPause = dVar.A;
        if (dVar.E != null) {
            this.mDWContext.setShowCustomIconOrNotList(dVar.E);
        }
        if (dVar.at) {
            this.mDWContext.predisplayInteractiveRightBar();
        }
        if (this.mDWContext.isNeedSmallWindow()) {
            this.mRootView = new DWRootVideoContainer(this.mDWContext);
            ((DWRootVideoContainer) this.mRootView).setDWVideoMoveEvent(new c());
        } else {
            this.mRootView = new FrameLayout(this.mDWContext.getActivity());
        }
        this.mDWLifecycleType = dVar.O == null ? DWLifecycleType.BEFORE : dVar.O;
        initAdapter(dVar);
        this.mDWContext.genPlayToken();
        str4 = this.mDWContext.mConfigParamsAdapter != null ? this.mDWContext.mConfigParamsAdapter.a(this.mDWContext.getActivity()) : str4;
        this.mDWContext.setInstantSeekingEnable(true);
        this.mDWContext.setPlayRateBtnEnable(true);
        DWContext dWContext6 = this.mDWContext;
        dWContext6.setRID(str4 + "_" + System.currentTimeMillis());
        this.mDWContext.setFullScreenMode(dVar.L);
        this.mDWContext.setReportShown(dVar.ak);
        this.mDWContext.setReportFullScreenShown(dVar.al);
        this.mDWContext.setGoodsListFullScreenShown(dVar.ao);
        this.mDWContext.setGoodsListFullScreenShown(dVar.ao);
        if (dVar.az != null && dVar.aB != null) {
            this.mDWContext.addViewToRightInteractiveView(dVar.az, true, dVar.aB);
        }
        if (dVar.aA != null && dVar.aC != null) {
            this.mDWContext.addViewToRightInteractiveView(dVar.aA, false, dVar.aC);
        }
        setup(dVar);
        if (kck.a()) {
            AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, " DWInstance end");
        }
    }

    public void orientationEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42dfe7a", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_orientationEnable);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.e();
    }

    public void setFov(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bab26e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setFov);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(f, f2, f3);
    }

    public void refreshScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a8082e", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_refreshScreen);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.dL_();
    }

    public List<com.taobao.taobaoavsdk.f> hitTest(List<com.taobao.taobaoavsdk.e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae7e26ea", new Object[]{this, list});
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_hitTest);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return null;
        }
        return alVar.a(list);
    }

    public void orientationDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a29e37f", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_orientationDisable);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.c();
    }

    public boolean toggleCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e25ada62", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_toggleCompleted);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return true;
        }
        return alVar.f();
    }

    public void bindWindow(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c507bd3", new Object[]{this, window});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_bindWindow);
        this.mDWContext.bindWindow(window);
    }

    public void unbindWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c058f6d", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_unbindWindow);
        this.mDWContext.unbindWindow();
    }

    public void hideController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8830805", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_hideController);
        this.mDWContext.hideControllerView(true);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.k();
    }

    public void showController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccfe280", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_showController);
        this.mDWContext.hideControllerView(false);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.l();
    }

    public void showGoodsListView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bd3463", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_showGoodsListView);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.m();
    }

    public void setShowNotWifiHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dd9fd", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setShowNotWifiHint);
        this.mDWContext.setShowNotWifiHint(z);
    }

    public void setShowPlayWithCacheHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adebe9bd", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setShowPlayWithCacheHint);
        this.mDWContext.setShowPlayWithCacheHint(z);
    }

    public void hideGoodsListView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183864be", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_hideGoodsListView);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.n();
    }

    public void hideMiniProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b911c234", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_hideMiniProgressBar);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.o();
    }

    public void showMiniProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a13c99", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_showMiniProgressBar);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.p();
    }

    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setPlayRate);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(f);
    }

    public void setup(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f725ae5", new Object[]{this, dVar});
            return;
        }
        this.mSetup = true;
        if (!checkParams()) {
            if (kck.a()) {
                String str = "";
                if (this.mDWContext.getUTParams() != null) {
                    for (Map.Entry<String, String> entry : this.mDWContext.getUTParams().entrySet()) {
                        str = str + entry.getKey() + "=" + entry.getValue() + ";";
                    }
                }
                DWContext dWContext = this.mDWContext;
                if (dWContext != null) {
                    com.taobao.taobaoavsdk.util.c.c(dWContext.mTlogAdapter, " please set mBizCode , mVideoSource and  mVideoId parameters" + str);
                }
            } else {
                DWContext dWContext2 = this.mDWContext;
                if (dWContext2 != null) {
                    com.taobao.taobaoavsdk.util.c.c(dWContext2.mTlogAdapter, "  please set mBizCode , mVideoSource and  mVideoId parameters" + this.mDWContext.mPlayContext.getVideoUrl());
                }
            }
        }
        initUTParams(dVar);
        initPlayExpUTParams(dVar);
        initControlParams(dVar);
        int i = AnonymousClass3.f16412a[this.mDWContext.getInstanceType().ordinal()];
        if (i == 1) {
            initVideoMode();
        } else if (i == 2) {
            initPicMode();
        }
    }

    public void setIDWHookVideoBackButtonListener(com.taobao.avplayer.common.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6b86f0", new Object[]{this, oVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setIDWHookVideoBackButtonListener);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(oVar);
    }

    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setVideoUrl);
        if (this.mSetup) {
            return;
        }
        if (this.mDWContext.mHttpHeader != null) {
            this.mDWContext.mPlayContext.setRequestHeader(this.mDWContext.mHttpHeader);
        }
        this.mDWContext.mPlayContext.setVideoUrl(str);
    }

    public void setToastTopMargin(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff728db", new Object[]{this, new Float(f)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setToastTopMargin);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null) {
            return;
        }
        dWContext.mToastTopMargin = f;
    }

    public DWInstanceType getInstanceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInstanceType) ipChange.ipc$dispatch("43ddfe31", new Object[]{this});
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_getInstanceType);
        return this.mDWContext.getInstanceType();
    }

    public void setInstanceType(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setInstanceType);
        if (this.mDestroy) {
            return;
        }
        String str = "";
        if (this.mDWContext.mConfigAdapter != null) {
            str = this.mDWContext.mConfigAdapter.getConfig(str, "usePicModeBizCodeList", str);
        }
        if (com.taobao.taobaoavsdk.util.b.b(this.mDWContext.mFrom, str)) {
            return;
        }
        if (this.mDWContext.getInstanceType() == DWInstanceType.PIC && dWInstanceType == DWInstanceType.VIDEO) {
            this.mDWContext.setInstanceType(DWInstanceType.VIDEO);
            initVideoMode();
        } else if (this.mDWContext.getInstanceType() != DWInstanceType.VIDEO || dWInstanceType != DWInstanceType.PIC) {
        } else {
            this.mDWContext.setInstanceType(DWInstanceType.PIC);
            if (this.mDWPicController == null) {
                initPicMode();
            } else {
                this.mDWVideoController.a(DWLifecycleType.BEFORE);
            }
        }
    }

    public void setInteractiveID(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148ee5c2", new Object[]{this, new Long(j)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setInteractiveID);
        if (this.mSetup) {
            return;
        }
        this.mDWContext.mInteractiveId = j;
    }

    public void setVideoID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a27a7a5", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setVideoID);
        if (this.mSetup) {
            return;
        }
        DWContext dWContext = this.mDWContext;
        dWContext.mPlayContext.mVideoId = str;
        dWContext.mVideoId = str;
    }

    public void setVideoSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setVideoSource);
        if (this.mSetup) {
            return;
        }
        DWContext dWContext = this.mDWContext;
        dWContext.mPlayContext.mVideoSource = str;
        dWContext.mVideoSource = str;
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else if (this.mSetup) {
        } else {
            this.mDWContext.mFrom = str;
        }
    }

    public void setScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setScene);
        if (this.mSetup) {
            return;
        }
        this.mDWContext.mScene = str;
    }

    public void setUserID(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8750f6f5", new Object[]{this, new Long(j)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setUserID);
        if (this.mSetup) {
            return;
        }
        this.mDWContext.mUserId = j;
    }

    public void forceSetUserId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f56aa0", new Object[]{this, new Long(j)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_forceSetUserId);
        this.mDWContext.mUserId = j;
    }

    public void setNeedCloseUT(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8d232e", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setNeedCloseUT);
        this.mDWContext.setNeedCloseUT(z);
    }

    public void setFrame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setFrame);
        DWContext dWContext = this.mDWContext;
        dWContext.mWidth = i;
        dWContext.mHeight = i2;
        if (!dWContext.isFloating()) {
            DWContext dWContext2 = this.mDWContext;
            dWContext2.mNormalWidth = i;
            dWContext2.mNormalHeight = i2;
        }
        if (this.mDWVideoController == null || this.mRootView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.mDWContext.mWidth, this.mDWContext.mHeight);
        if (this.mDWVideoController.v().getParent() == null) {
            this.mRootView.addView(this.mDWVideoController.v(), layoutParams);
        } else {
            this.mDWVideoController.v().getLayoutParams().width = this.mDWContext.mWidth;
            this.mDWVideoController.v().getLayoutParams().height = this.mDWContext.mHeight;
        }
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout != null) {
            frameLayout.post(new Runnable() { // from class: com.taobao.avplayer.DWInstance.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (DWInstance.access$100(DWInstance.this) == null) {
                    } else {
                        DWInstance.access$100(DWInstance.this).requestLayout();
                    }
                }
            });
        }
        FrameLayout frameLayout2 = this.mRootView;
        if (frameLayout2 == null) {
            return;
        }
        frameLayout2.post(new Runnable() { // from class: com.taobao.avplayer.DWInstance.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DWInstance.access$200(DWInstance.this) == null) {
                } else {
                    DWInstance.access$200(DWInstance.this).j();
                }
            }
        });
    }

    public void addWhiteWeexCmpList(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99efa948", new Object[]{this, arrayList});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addWhiteWeexCmpList);
        this.mDWContext.setWhiteWeexCmpList(arrayList);
    }

    public void addWeexAddViewCallback(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc5e7d7", new Object[]{this, bdVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addWeexAddViewCallback);
        this.mDWContext.addIctAddWeexCallback(bdVar);
    }

    public void addWeexShowViewCallback(be beVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d50196", new Object[]{this, beVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addWeexShowViewCallback);
        this.mDWContext.addIctShowWeexCallback(beVar);
    }

    public void addUpdateWeexCmpAnchorCallback(bg bgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51f96a0", new Object[]{this, bgVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addUpdateWeexCmpAnchorCallback);
        this.mDWContext.addIctUpdateWeexCmpAnchorCallback(bgVar);
    }

    public void addIctTempCallback(bf bfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd84957e", new Object[]{this, bfVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addIctTempCallback);
        this.mDWContext.addIctTempCallback(bfVar);
    }

    public void needAD(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534e1794", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_needAD);
        this.mDWContext.setNeedAD(z);
    }

    public void setVideoBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a58b880", new Object[]{this, new Integer(i)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setVideoBackgroundColor);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(i);
    }

    public void setVideoBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d94830", new Object[]{this, drawable});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setVideoBackgroundDrawable);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(drawable);
    }

    public void addUtParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b65ae46", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addUtParams);
        this.mDWContext.addUtParams(hashMap);
    }

    public void addCustomParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addCustomParams);
        this.mDWContext.addCustomParams(hashMap);
    }

    public void setConnectTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabec0e3", new Object[]{this, new Integer(i)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setConnectTimeout);
        this.mDWContext.mConnectTimeout = i;
    }

    public void setReadTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d585fd3", new Object[]{this, new Integer(i)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setReadTimeout);
        this.mDWContext.mReadTimeout = i;
    }

    public void setRetryTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc93e9", new Object[]{this, new Integer(i)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setRetryTime);
        this.mDWContext.mRetryTime = i;
    }

    public void addPlayExpUtParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d20b9f", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addPlayExpUtParams);
        this.mDWContext.addPlayExpUtParams(hashMap);
    }

    public void initPlayExpUTParams(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbc5ec6", new Object[]{this, dVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_initPlayExpUTParams);
        if (dVar.G == null) {
            return;
        }
        this.mDWContext.addPlayExpUtParams(dVar.G);
    }

    public void addControlParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0193d6a", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addControlParams);
        this.mDWContext.addControlParams(hashMap);
    }

    public void initControlParams(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a455fb", new Object[]{this, dVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_initControlParams);
        if (dVar.aV == null) {
            return;
        }
        this.mDWContext.addControlParams(dVar.aV);
    }

    private void initUTParams(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9aa407d", new Object[]{this, dVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.mDWContext.mInteractiveId != -1) {
            hashMap.put("interactId", this.mDWContext.mInteractiveId + "");
        }
        if (this.mDWContext.mUserId != -1) {
            hashMap.put("userId", String.valueOf(this.mDWContext.mUserId));
        }
        if (!StringUtils.isEmpty(this.mDWContext.mFrom)) {
            hashMap.put("page", this.mDWContext.mFrom.toLowerCase());
        }
        if (!StringUtils.isEmpty(this.mDWContext.mContentId)) {
            hashMap.put("contentId", this.mDWContext.mContentId);
        }
        hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, this.mDWContext.mVideoId + "");
        hashMap.put(sku.KEY_VIDEO_SOURCE, this.mDWContext.mVideoSource + "");
        hashMap.put("mediaType", "1");
        if (dVar.F != null) {
            hashMap.putAll(dVar.F);
        }
        this.mDWContext.addUtParams(hashMap);
    }

    private void initPicMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276d9924", new Object[]{this});
            return;
        }
        this.mDWContext.setInstanceType(DWInstanceType.PIC);
        this.mDWPicController = new x(this.mDWContext);
        this.mDWPicController.a(this.mPicViewClickListener);
        this.mRootView.addView(this.mDWPicController.a(), new FrameLayout.LayoutParams(this.mDWContext.mWidth, this.mDWContext.mHeight));
    }

    private void destroyPicMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396447fa", new Object[]{this});
            return;
        }
        x xVar = this.mDWPicController;
        if (xVar == null || xVar.a() == null) {
            return;
        }
        this.mDWPicController.a().setVisibility(8);
        this.mDWPicController.b();
        this.mDWPicController = null;
    }

    private void initVideoMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308b8715", new Object[]{this});
        } else if (this.mDestroy) {
        } else {
            this.mDWContext.setInstanceType(DWInstanceType.VIDEO);
            if (this.mDWVideoController != null) {
                return;
            }
            this.mDWVideoController = new al(this.mDWContext);
            dde ddeVar = this.mExternFirstRenderAdapter;
            if (ddeVar != null) {
                this.mDWVideoController.a(ddeVar);
                this.mExternFirstRenderAdapter = null;
            }
            setDWLifecycleType(this.mDWLifecycleType);
            this.mRootView.addView(this.mDWVideoController.v(), 0, new FrameLayout.LayoutParams(this.mDWContext.mWidth, this.mDWContext.mHeight));
            this.mDWContext.getVideo().b(this);
            this.mDWContext.getVideo().a(this);
            this.mDWVideoController.a(this.mCloseViewClickListener);
            this.mDWVideoController.a(this.mRootViewClickListener);
            this.mDWVideoController.a(this.mRootViewTouchListener);
            this.mDWVideoController.a(this.mHookStartListener);
            if (this.mDWContext.isNeedSmallWindow()) {
                this.mFloatViewController = new com.taobao.avplayer.playercontrol.b(this.mDWContext, this.mRootView, new b());
            }
            if (this.mHideCloseView) {
                this.mDWVideoController.s();
            } else {
                this.mDWVideoController.t();
            }
            if (this.mDWContext.isHideControllder()) {
                this.mDWVideoController.k();
            } else {
                this.mDWVideoController.l();
            }
            View view = this.mCoverView;
            if (view != null) {
                this.mDWVideoController.a(view, this.mCoverViewLayoutParams);
            }
            this.mDWVideoController.a(this);
        }
    }

    private void destroyVideoMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f91d86b", new Object[]{this});
            return;
        }
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        this.mRootView.removeView(alVar.v());
        this.mDWVideoController.F();
        this.mDWVideoController = null;
    }

    public void setCloseViewClickListener(com.taobao.avplayer.common.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86bd5f2", new Object[]{this, cVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setCloseViewClickListener);
        this.mCloseViewClickListener = cVar;
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(this.mCloseViewClickListener);
    }

    public void setPicViewClickListener(com.taobao.avplayer.common.z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2365a29", new Object[]{this, zVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setPicViewClickListener);
        this.mPicViewClickListener = zVar;
        x xVar = this.mDWPicController;
        if (xVar == null) {
            return;
        }
        xVar.a(this.mPicViewClickListener);
    }

    public void setRootViewClickListener(com.taobao.avplayer.common.z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb1860d", new Object[]{this, zVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setRootViewClickListener);
        this.mRootViewClickListener = zVar;
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(this.mRootViewClickListener);
    }

    public void setVideoRecycleListener(bb bbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d69d2de", new Object[]{this, bbVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setVideoRecycleListener);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(bbVar);
    }

    public void showTopEventView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2538072e", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_showTopEventView);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.q();
    }

    public void hideTopEventView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b7df73", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_hideTopEventView);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.r();
    }

    public void setDWLifecycleType(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d45060", new Object[]{this, dWLifecycleType});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setDWLifecycleType);
        this.mDWLifecycleType = dWLifecycleType;
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(this.mDWLifecycleType);
    }

    public void setHookStartListener(com.taobao.avplayer.common.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c03d0f7", new Object[]{this, nVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setHookStartListener);
        this.mHookStartListener = nVar;
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(this.mHookStartListener);
    }

    public void setHookRootViewTouchListener(com.taobao.avplayer.common.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d998d1b5", new Object[]{this, aaVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setHookRootViewTouchListener);
        this.mRootViewTouchListener = aaVar;
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(this.mRootViewTouchListener);
    }

    public void setHookSmallWindowClickListener(com.taobao.avplayer.common.m mVar) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ad6d51", new Object[]{this, mVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setHookSmallWindowClickListener);
        if (mVar == null || (frameLayout = this.mRootView) == null || !(frameLayout instanceof DWRootVideoContainer)) {
            return;
        }
        ((DWRootVideoContainer) frameLayout).setHookSmallWindowClickListener(mVar);
    }

    public void setIDWScreenSmallWindowListener(com.taobao.avplayer.common.ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18adb96", new Object[]{this, abVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setIDWScreenSmallWindowListener);
        this.mDWScreenSmallWindowListener = abVar;
    }

    public void setNormalControllerListener(com.taobao.avplayer.common.x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c424055", new Object[]{this, xVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setNormalControllerListener);
        al alVar = this.mDWVideoController;
        if (alVar == null || xVar == null) {
            return;
        }
        alVar.a(xVar);
    }

    public void setVideoLifecycleListener(av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae16c260", new Object[]{this, avVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setVideoLifecycleListener);
        this.mVideoLifecycleListener = avVar;
    }

    public void setVideoLifecycleListener2(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8222787", new Object[]{this, awVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setVideoLifecycleListener2);
        this.mVideoLifecycleListener2 = awVar;
    }

    public void setVideoPlayTimeListener(az azVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838769a5", new Object[]{this, azVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setVideoPlayTimeListener);
        this.mVideoPlayTimeListener = azVar;
    }

    public void hideCloseView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417f1ca2", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_hideCloseView);
        this.mHideCloseView = true;
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.s();
    }

    public void showCloseView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953f86c7", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_showCloseView);
        this.mHideCloseView = false;
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.t();
    }

    public void setPicModeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2918175", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setPicModeUrl);
        x xVar = this.mDWPicController;
        if (xVar == null) {
            return;
        }
        xVar.a(str);
    }

    public void setPicModeScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed77c9ba", new Object[]{this, scaleType});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setPicModeScaleType);
        x xVar = this.mDWPicController;
        if (xVar == null) {
            return;
        }
        xVar.a(scaleType);
    }

    public void addCoverView(View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67c80a9", new Object[]{this, view, layoutParams});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addCoverView);
        if (view == null) {
            return;
        }
        this.mCoverView = view;
        if (layoutParams == null) {
            this.mCoverViewLayoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            this.mCoverViewLayoutParams = layoutParams;
        }
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(this.mCoverView, this.mCoverViewLayoutParams);
    }

    public void setNeedGesture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a6efbc", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setNeedGesture);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null) {
            return;
        }
        dWContext.setNeedGesture(z);
    }

    public void removeCoverView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fa4313", new Object[]{this, view});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_removeCoverView);
        this.mCoverView = null;
        this.mCoverViewLayoutParams = null;
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.b(view);
    }

    public void toggleScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_toggleScreen);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.w();
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_seekTo);
        al alVar = this.mDWVideoController;
        if (alVar == null || alVar.u() || this.mDWContext.getInstanceType() == DWInstanceType.PIC) {
            return;
        }
        this.mDWVideoController.b(i);
    }

    public void seekTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3275fcb", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_seekTo2);
        al alVar = this.mDWVideoController;
        if (alVar == null || alVar.u() || this.mDWContext.getInstanceType() == DWInstanceType.PIC) {
            return;
        }
        this.mDWVideoController.a(i, z, false);
    }

    public void seekTo(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c54c69", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_seekTo3);
        al alVar = this.mDWVideoController;
        if (alVar == null || alVar.u() || this.mDWContext.getInstanceType() == DWInstanceType.PIC) {
            return;
        }
        this.mDWVideoController.a(i, z, z2);
    }

    public void preDownload(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb6e9f1", new Object[]{this, new Integer(i)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_preDownload);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.c(i);
    }

    public void replay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79d80ee", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_replay);
        al alVar = this.mDWVideoController;
        if (alVar == null || alVar.u() || this.mDWContext.getInstanceType() == DWInstanceType.PIC) {
            return;
        }
        this.mDWVideoController.z();
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.mDWVideoController == null || this.mDWContext.getInstanceType() != DWInstanceType.VIDEO) {
        } else {
            if (this.mInnerStartListener == null) {
                this.mInnerStartListener = new InnerStartFuncListenerImpl();
                this.mDWVideoController.a(this.mInnerStartListener);
            }
            this.mDWVideoController.y();
        }
    }

    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else if (this.mDWVideoController == null || this.mDWContext.getInstanceType() != DWInstanceType.VIDEO) {
        } else {
            this.mDWVideoController.C();
        }
    }

    public void asyncPrepareVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a27cd7", new Object[]{this});
        } else if (this.mDWVideoController == null || this.mDWContext.getInstanceType() != DWInstanceType.VIDEO) {
        } else {
            this.mDWVideoController.B();
        }
    }

    public boolean toSmall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a1869d7", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_toSmall);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null || !dWContext.isNeedSmallWindow() || getView() == null || getView().getParent() == null || !toggleCompleted() || isFullScreen() || this.mFloatViewController == null || this.mDWContext.isFloating()) {
            return false;
        }
        this.mDWContext.setFloatingToggle(true);
        return this.mFloatViewController.b();
    }

    public boolean toNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("378fc2cd", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_toNormal);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null || !dWContext.isNeedSmallWindow() || this.mFloatViewController == null || getView() == null || getView().getParent() == null || !this.mDWContext.isFloating() || !toggleCompleted()) {
            return false;
        }
        this.mDWContext.setFloatingToggle(false);
        return this.mFloatViewController.c();
    }

    public void setIDWMutedChangeListener(com.taobao.avplayer.common.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d991c574", new Object[]{this, uVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setIDWMutedChangeListener);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(uVar);
    }

    public boolean adIsPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10a45ecc", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_adIsPlaying);
        al alVar = this.mDWVideoController;
        return alVar != null && alVar.u();
    }

    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.A();
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.E();
    }

    public void closeVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.D();
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        DWContext dWContext = this.mDWContext;
        return dWContext != null && dWContext.isMute();
    }

    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        if (this.mDWContext.getVideo() != null) {
            return this.mDWContext.getVideo().t();
        }
        return 0;
    }

    public int getNormalControllerHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcda1a5a", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_getNormalControllerHeight);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return 0;
        }
        return alVar.g();
    }

    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        al alVar = this.mDWVideoController;
        if (alVar != null && !alVar.u()) {
            return this.mDWContext.getVideo().o();
        }
        return 0;
    }

    public void showOrHideInteractive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_showOrHideInteractive);
        this.mDWContext.showInteractive(z);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.b(z);
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWInstance this=" + this + ", mute=" + z);
        this.mDWContext.mute(z);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.c(z);
    }

    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_getView);
        return this.mRootView;
    }

    public boolean isFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14380eb0", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_isFullScreen);
        return this.mDWContext.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.mDWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.mDestroy) {
        } else {
            this.mDestroy = true;
            al alVar = this.mDWVideoController;
            if (alVar != null) {
                alVar.F();
                this.mDWVideoController = null;
            }
            DWContext dWContext = this.mDWContext;
            if (dWContext != null) {
                dWContext.destroy();
            }
            x xVar = this.mDWPicController;
            if (xVar != null) {
                xVar.b();
            }
            this.mVideoLoopCompleteListener = null;
            this.mRootView = null;
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        av avVar = this.mVideoLifecycleListener;
        if (avVar != null) {
            avVar.onVideoStart();
        }
        aw awVar = this.mVideoLifecycleListener2;
        if (awVar != null) {
            awVar.onVideoStart();
        }
        com.taobao.mediaplay.player.e eVar = this.mMediaPlayLifeCycleListener;
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
        av avVar = this.mVideoLifecycleListener;
        if (avVar != null) {
            avVar.onVideoPause(z);
        }
        aw awVar = this.mVideoLifecycleListener2;
        if (awVar != null) {
            awVar.onVideoPause(z);
        }
        com.taobao.mediaplay.player.e eVar = this.mMediaPlayLifeCycleListener;
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
        av avVar = this.mVideoLifecycleListener;
        if (avVar != null) {
            avVar.onVideoPlay();
        }
        aw awVar = this.mVideoLifecycleListener2;
        if (awVar != null) {
            awVar.onVideoPlay();
        }
        com.taobao.mediaplay.player.e eVar = this.mMediaPlayLifeCycleListener;
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
        av avVar = this.mVideoLifecycleListener;
        if (avVar != null) {
            avVar.onVideoSeekTo(i);
        }
        aw awVar = this.mVideoLifecycleListener2;
        if (awVar != null) {
            awVar.onVideoSeekTo(i);
        }
        com.taobao.mediaplay.player.e eVar = this.mMediaPlayLifeCycleListener;
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
        av avVar = this.mVideoLifecycleListener;
        if (avVar != null) {
            avVar.onVideoPrepared(obj);
        }
        aw awVar = this.mVideoLifecycleListener2;
        if (awVar != null) {
            awVar.onVideoPrepared(obj);
        }
        com.taobao.mediaplay.player.e eVar = this.mMediaPlayLifeCycleListener;
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
        av avVar = this.mVideoLifecycleListener;
        if (avVar != null) {
            avVar.onVideoError(obj, i, i2);
        }
        aw awVar = this.mVideoLifecycleListener2;
        if (awVar != null) {
            awVar.onVideoError(obj, i, i2);
        }
        com.taobao.mediaplay.player.e eVar = this.mMediaPlayLifeCycleListener;
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
        av avVar = this.mVideoLifecycleListener;
        if (avVar != null) {
            avVar.onVideoInfo(obj, (int) j, (int) j2);
        }
        aw awVar = this.mVideoLifecycleListener2;
        if (awVar != null) {
            awVar.onVideoInfo(obj, j, j2, j3, obj2);
        }
        com.taobao.mediaplay.player.e eVar = this.mMediaPlayLifeCycleListener;
        if (eVar == null) {
            return;
        }
        if (obj instanceof IMediaPlayer) {
            eVar.onMediaInfo((IMediaPlayer) obj, j, j2, j3, obj2);
        } else {
            eVar.onMediaInfo(null, j, j2, j3, obj2);
        }
    }

    public Map<String, String> getPlayerQos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return null;
        }
        return alVar.G();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        av avVar = this.mVideoLifecycleListener;
        if (avVar != null) {
            avVar.onVideoComplete();
        }
        aw awVar = this.mVideoLifecycleListener2;
        if (awVar != null) {
            awVar.onVideoComplete();
        }
        com.taobao.mediaplay.player.e eVar = this.mMediaPlayLifeCycleListener;
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
        av avVar = this.mVideoLifecycleListener;
        if (avVar != null) {
            avVar.onVideoClose();
        }
        aw awVar = this.mVideoLifecycleListener2;
        if (awVar != null) {
            awVar.onVideoClose();
        }
        com.taobao.mediaplay.player.e eVar = this.mMediaPlayLifeCycleListener;
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
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_onVideoScreenChanged);
        if (this.mVideoLifecycleListener == null) {
            return;
        }
        if (dWVideoScreenType == DWVideoScreenType.NORMAL) {
            this.mVideoLifecycleListener.onVideoNormalScreen();
        } else {
            this.mVideoLifecycleListener.onVideoFullScreen();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        av avVar = this.mVideoLifecycleListener;
        if (avVar != null) {
            avVar.onVideoProgressChanged(i, i2, i3);
        }
        aw awVar = this.mVideoLifecycleListener2;
        if (awVar != null) {
            awVar.onVideoProgressChanged(i, i2, i3);
        }
        if (this.mVideoPlayTimeListener != null) {
            long j = -1;
            al alVar = this.mDWVideoController;
            if (alVar != null) {
                j = alVar.I();
            }
            this.mVideoPlayTimeListener.onVideoPlayTimeChanged(j);
        }
        com.taobao.mediaplay.player.e eVar = this.mMediaPlayLifeCycleListener;
        if (eVar == null) {
            return;
        }
        eVar.onMediaProgressChanged(i, i2, i3);
    }

    @Override // com.taobao.avplayer.common.q
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        x xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_onLifecycleChanged);
        if (dWLifecycleType == DWLifecycleType.AFTER) {
            if (this.mVideoLifecycleListener != null && getVideoState() == 4) {
                this.mVideoLifecycleListener.onVideoComplete();
            }
            if (this.mVideoLifecycleListener2 == null || getVideoState() != 4) {
                return;
            }
            this.mVideoLifecycleListener2.onVideoComplete();
        } else if (dWLifecycleType == DWLifecycleType.MID) {
            x xVar2 = this.mDWPicController;
            if (xVar2 == null) {
                return;
            }
            xVar2.a().setVisibility(4);
        } else if (dWLifecycleType != DWLifecycleType.BEFORE || (xVar = this.mDWPicController) == null) {
        } else {
            xVar.a().setVisibility(0);
        }
    }

    private boolean checkParams() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63bd6239", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isEmpty(this.mDWContext.mFrom) || StringUtils.isEmpty(this.mDWContext.mVideoSource) || StringUtils.isEmpty(this.mDWContext.mVideoId)) {
            com.taobao.taobaoavsdk.util.c.b("TBDWInstance", "缺少必填参数 bizCode、videoSource、videoId！！");
        }
        if (StringUtils.isEmpty(this.mDWContext.mFrom)) {
            this.mDWContext.mFrom = "default";
        }
        if (StringUtils.isEmpty(this.mDWContext.mVideoSource)) {
            DWContext dWContext = this.mDWContext;
            dWContext.mPlayContext.mVideoSource = "TBVideo";
            dWContext.mVideoSource = "TBVideo";
        }
        if (!StringUtils.isEmpty(this.mDWContext.mPlayContext.getVideoUrl()) && StringUtils.isEmpty(this.mDWContext.getVideoId()) && "TBVideo".equals(this.mDWContext.getVideoSource())) {
            try {
                String rawPath = new URI(this.mDWContext.mPlayContext.getVideoUrl()).getRawPath();
                int lastIndexOf = rawPath.lastIndexOf(47);
                int lastIndexOf2 = rawPath.lastIndexOf(46);
                if (lastIndexOf >= 0 && lastIndexOf2 >= 0 && (i = lastIndexOf + 1) < rawPath.length() && lastIndexOf2 > i) {
                    DWContext dWContext2 = this.mDWContext;
                    MediaPlayControlContext mediaPlayControlContext = this.mDWContext.mPlayContext;
                    String substring = rawPath.substring(i, lastIndexOf2);
                    mediaPlayControlContext.mVideoId = substring;
                    dWContext2.mVideoId = substring;
                }
            } catch (Exception unused) {
            }
        }
        return !StringUtils.isEmpty(this.mDWContext.mVideoId);
    }

    public void setInteractiveIdAndRefresh(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a9d0be", new Object[]{this, new Long(j)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setInteractiveIdAndRefresh);
        this.mDWContext.mInteractiveId = j;
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.d();
    }

    @Override // com.taobao.avplayer.common.b
    public boolean onBackKeyDown(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("328efe1e", new Object[]{this, keyEvent})).booleanValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_onBackKeyDown);
        if (getView() != null && getView().getParent() != null) {
            ((ViewGroup) getView().getParent()).removeView(getView());
        }
        destroy();
        return true;
    }

    public String getVideoToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this});
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_getVideoToken);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return null;
        }
        return alVar.b();
    }

    public void addFullScreenCustomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addFullScreenCustomView);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(view);
    }

    public void removeFullScreenCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_removeFullScreenCustomView);
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a();
    }

    public void setIVideoLoopCompleteListener(ax axVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("753d4b9e", new Object[]{this, axVar});
        } else {
            this.mVideoLoopCompleteListener = axVar;
        }
    }

    public void setIVideoSeekCompleteListener(bc bcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f377128", new Object[]{this, bcVar});
            return;
        }
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(bcVar);
    }

    public boolean isSmallWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b6e58", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_isSmallWindow);
        DWContext dWContext = this.mDWContext;
        return dWContext != null && dWContext.isFloating();
    }

    @Override // com.taobao.avplayer.ax
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        ax axVar = this.mVideoLoopCompleteListener;
        if (axVar == null) {
            return;
        }
        axVar.onLoopCompletion();
    }

    public void setUTParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setUTParams);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null || hashMap == null) {
            return;
        }
        dWContext.addUtParams(hashMap);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public d f16413a = new d();
        public String b;

        static {
            kge.a(-1503175067);
        }

        public a(Activity activity) {
            d dVar = this.f16413a;
            dVar.e = activity;
            dVar.aS = DWInstance.COMPONENT_NAME;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a8fae3a8", new Object[]{this, str});
            }
            this.f16413a.f = str;
            return this;
        }

        public void a(bf bfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("173d484d", new Object[]{this, bfVar});
            } else {
                this.f16413a.aQ = bfVar;
            }
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("497eabae", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.K = z;
            return this;
        }

        public a a(DWInstanceType dWInstanceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2b3106cb", new Object[]{this, dWInstanceType});
            }
            this.f16413a.aR = dWInstanceType;
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("58b25be", new Object[]{this, new Long(j)});
            }
            this.f16413a.g = j;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("914bed5f", new Object[]{this, new Integer(i)});
            }
            this.f16413a.h = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5a4ce4a0", new Object[]{this, new Integer(i)});
            }
            this.f16413a.i = i;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aa313687", new Object[]{this, str});
            }
            this.f16413a.n = str;
            return this;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ab33ee04", new Object[]{this, jSONObject});
            }
            this.f16413a.o = jSONObject;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("db809a30", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.aM = z;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ab678966", new Object[]{this, str});
            }
            this.f16413a.m = str;
            return this;
        }

        public a b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ce8c1cff", new Object[]{this, new Long(j)});
            }
            this.f16413a.j = j;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("234ddbe1", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = kcl.a();
            }
            this.f16413a.p = i;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ec4ed322", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = kcl.a(600.0f);
            }
            this.f16413a.q = i;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ac9ddc45", new Object[]{this, str});
            }
            this.f16413a.r = str;
            return this;
        }

        public a a(com.taobao.avplayer.common.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("81c24ab5", new Object[]{this, pVar});
            }
            this.f16413a.s = pVar;
            return this;
        }

        public a a(com.taobao.avplayer.common.v vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f7b13fbb", new Object[]{this, vVar});
            }
            this.f16413a.t = vVar;
            return this;
        }

        public a a(as asVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("25c037db", new Object[]{this, asVar});
            }
            this.f16413a.u = asVar;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("add42f24", new Object[]{this, str});
            }
            this.f16413a.k = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("af0a8203", new Object[]{this, str});
            }
            this.f16413a.l = str;
            return this;
        }

        public a a(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("21bd9aaf", new Object[]{this, hashMap});
            }
            this.f16413a.F = hashMap;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4fd4c71d", new Object[]{this, map});
            }
            this.f16413a.w = map;
            return this;
        }

        public a a(ap apVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("eac8bd58", new Object[]{this, apVar});
            }
            this.f16413a.x = apVar;
            return this;
        }

        public a a(com.taobao.avplayer.common.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("95e460a9", new Object[]{this, dVar});
            }
            this.f16413a.y = dVar;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a4819171", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.d = z;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6d8288b2", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.ai = z;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("36837ff3", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.I = z;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWInstance Builder, sbt=" + this.f16413a.k + ", setMute=" + this.f16413a.I);
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ff847734", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.J = z;
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c8856e75", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.f16416a = z;
            return this;
        }

        public a i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("918665b6", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.P = z;
            return this;
        }

        public a a(com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("60e5f89c", new Object[]{this, aVar});
            }
            this.f16413a.T = aVar;
            return this;
        }

        public a j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5a875cf7", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.Q = z;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b040d4e2", new Object[]{this, str});
            }
            this.f16413a.c = str;
            return this;
        }

        public a k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("23885438", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.b = z;
            return this;
        }

        public a l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ec894b79", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.V = z;
            return this;
        }

        public a m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b58a42ba", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.W = z;
            return this;
        }

        public a n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7e8b39fb", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.X = z;
            return this;
        }

        public a o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("478c313c", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.R = z;
            return this;
        }

        public a p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("108d287d", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.Y = z;
            return this;
        }

        public a q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d98e1fbe", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.Z = z;
            return this;
        }

        public a a(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4cb452a9", new Object[]{this, dWVideoScreenType});
            }
            this.f16413a.aa = dWVideoScreenType;
            return this;
        }

        public a r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a28f16ff", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.ap = z;
            return this;
        }

        public a s(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6b900e40", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.aq = z;
            return this;
        }

        public a t(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("34910581", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.ar = z;
            return this;
        }

        public a u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fd91fcc2", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.au = z;
            return this;
        }

        public a v(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c692f403", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.aw = z;
            return this;
        }

        public a w(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8f93eb44", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.ax = z;
            return this;
        }

        public a x(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5894e285", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.ay = z;
            return this;
        }

        public a y(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2195d9c6", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.as = z;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b17727c1", new Object[]{this, str});
            }
            this.f16413a.ac = str;
            return this;
        }

        public a i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b2ad7aa0", new Object[]{this, str});
            }
            this.f16413a.ad = str;
            return this;
        }

        public a A(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("295fc38e", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.af = z;
            return this;
        }

        public a B(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f260bacf", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.ag = z;
            return this;
        }

        public a D(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8462a951", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.av = z;
            return this;
        }

        public a E(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4d63a092", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.aj = z;
            return this;
        }

        public a F(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("166497d3", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.aL = z;
            return this;
        }

        public a G(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("df658f14", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.ak = z;
            return this;
        }

        public a H(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a8668655", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.aN = z;
            return this;
        }

        public a I(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("71677d96", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.al = z;
            return this;
        }

        public a J(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3a6874d7", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.an = z;
            return this;
        }

        public a K(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3696c18", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.ao = z;
            return this;
        }

        public a L(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cc6a6359", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.am = z;
            return this;
        }

        public a j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b3e3cd7f", new Object[]{this, str});
            }
            this.f16413a.aD = str;
            return this;
        }

        public a a(com.taobao.avplayer.common.af afVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("255f1964", new Object[]{this, afVar});
            }
            this.f16413a.D = afVar;
            return this;
        }

        public a M(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("956b5a9a", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.aE = z;
            return this;
        }

        public a N(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5e6c51db", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.aF = z;
            return this;
        }

        public a a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("345c0572", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            d dVar = this.f16413a;
            dVar.aG = i;
            dVar.aH = i2;
            dVar.aI = i3;
            dVar.aJ = i4;
            return this;
        }

        public a O(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("276d491c", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.aO = z;
            return this;
        }

        public a a(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5f204e9b", new Object[]{this, dWAspectRatio});
            }
            this.f16413a.aP = dWAspectRatio;
            return this;
        }

        public a b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dd0f789e", new Object[]{this, map});
            }
            this.f16413a.H = map;
            return this;
        }

        public void k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
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
                d dVar = this.f16413a;
                dVar.aS = this.b + "." + this.f16413a.aS;
                this.b = "";
            }
        }

        public a R(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("82702edf", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.v = z;
            return this;
        }

        public a S(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b712620", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.A = z;
            return this;
        }

        public DWInstance b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DWInstance) ipChange.ipc$dispatch("d36b7cae", new Object[]{this});
            }
            a();
            return new DWInstance(this.f16413a);
        }

        public void P(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b1f70dd", new Object[]{this, new Boolean(z)});
            } else {
                this.f16413a.at = z;
            }
        }

        public void a(ArrayList<Boolean> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            } else {
                this.f16413a.E = arrayList;
            }
        }

        public a Q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b96f379e", new Object[]{this, new Boolean(z)});
            }
            this.f16413a.aU = z;
            return this;
        }
    }

    /* loaded from: classes6.dex */
    public class b implements com.taobao.avplayer.common.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1109275603);
            kge.a(1145914914);
        }

        public b() {
        }

        @Override // com.taobao.avplayer.common.j
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            if (DWInstance.access$200(DWInstance.this) != null) {
                DWInstance.access$200(DWInstance.this).i();
                DWInstance.this.setFrame(i, i2);
            }
            if (DWInstance.access$300(DWInstance.this) == null) {
                return;
            }
            DWInstance.access$300(DWInstance.this).onSmall();
        }

        @Override // com.taobao.avplayer.common.j
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (DWInstance.access$200(DWInstance.this) != null) {
                DWInstance.access$200(DWInstance.this).h();
                DWInstance dWInstance = DWInstance.this;
                dWInstance.setFrame(dWInstance.mDWContext.mNormalWidth, DWInstance.this.mDWContext.mNormalHeight);
            }
            if (DWInstance.access$300(DWInstance.this) == null) {
                return;
            }
            DWInstance.access$300(DWInstance.this).onNormal();
        }

        @Override // com.taobao.avplayer.common.j
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : DWInstance.this.toggleCompleted();
        }
    }

    /* loaded from: classes6.dex */
    public class c implements com.taobao.avplayer.common.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(307924914);
            kge.a(1148311229);
        }

        private c() {
        }

        @Override // com.taobao.avplayer.common.i
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (DWInstance.this.mDWContext == null || !DWInstance.this.mDWContext.isFloating() || !DWInstance.this.toggleCompleted()) {
            } else {
                DWInstance.this.toNormal();
            }
        }

        @Override // com.taobao.avplayer.common.i
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (DWInstance.this.mDWContext == null || DWInstance.this.mDWContext.getVideo() == null || !DWInstance.this.mDWContext.isFloating() || !DWInstance.this.toggleCompleted()) {
            } else {
                DWInstance.this.mDWContext.getVideo().s();
            }
        }
    }

    public void addWXCmpUtilsCallback(bh bhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2031b0fc", new Object[]{this, bhVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addWXCmpUtilsCallback);
        this.mDWContext.setWXCmpUtilsCallback(bhVar);
    }

    public void addWXCmpUtilsCallback2(bi biVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87d3729", new Object[]{this, biVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_addWXCmpUtilsCallback2);
        this.mDWContext.setWXCmpUtilsCallback2(biVar);
    }

    public void setDanmaOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae472c1", new Object[]{this, new Boolean(z)});
        } else {
            InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setDanmaOpened);
        }
    }

    public void setLikeBtnShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a9f359f", new Object[]{this, new Boolean(z)});
        } else {
            InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setLikeBtnShown);
        }
    }

    public void setLikeBtnFullScreenShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ca241a", new Object[]{this, new Boolean(z)});
        } else {
            InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setLikeBtnFullScreenShown);
        }
    }

    public void setReportFullScreenShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffadd44d", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setReportFullScreenShown);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null) {
            return;
        }
        dWContext.setReportFullScreenShown(z);
    }

    public void setReportShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2284f992", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setReportShown);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null) {
            return;
        }
        dWContext.setReportShown(z);
    }

    public void setShowGoodsList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a436f8", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setShowGoodsList);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null) {
            return;
        }
        dWContext.setShowGoodsList(z);
    }

    public void setPreLikeParams(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a31cb4", new Object[]{this, new Boolean(z), new Integer(i)});
        } else {
            InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setPreLikeParams);
        }
    }

    public void setShowCustomIconOrNotList(ArrayList<Boolean> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f04f6dde", new Object[]{this, arrayList});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setShowCustomIconOrNotList);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null) {
            return;
        }
        dWContext.setShowCustomIconOrNotList(arrayList);
    }

    public void setTaowaIsShare(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b85342", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setTaowaIsShare);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null) {
            return;
        }
        dWContext.setTaowaIsShare(z);
    }

    public void showWXBackCoverOrNot(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db841aef", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_showWXBackCoverOrNot);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null) {
            return;
        }
        dWContext.showWXBackCoverOrNot(z);
    }

    public void predisplayInteractiveRightBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf5d5a1", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_predisplayInteractiveRightBar);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null) {
            return;
        }
        dWContext.predisplayInteractiveRightBar();
    }

    public void fireGlobalEventToWXCmp(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8754c54b", new Object[]{this, str, map});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_fireGlobalEventToWXCmp);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null || dWContext.getDWComponentWrapperManager() == null) {
            return;
        }
        this.mDWContext.getDWComponentWrapperManager().a(str, map);
    }

    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        DWContext dWContext = this.mDWContext;
        if (dWContext != null && dWContext.getVideo() != null) {
            return this.mDWContext.getVideo().n();
        }
        return 0L;
    }

    public void setFirstRenderAdapter(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d166b97d", new Object[]{this, ddeVar});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_setFirstRenderAdapter);
        DWContext dWContext = this.mDWContext;
        if (dWContext != null) {
            if (ddeVar != null) {
                dWContext.setNeedCommitUserToFirstFrame(true);
            } else {
                dWContext.setNeedCommitUserToFirstFrame(false);
            }
        }
        al alVar = this.mDWVideoController;
        if (alVar != null) {
            alVar.a(ddeVar);
        } else {
            this.mExternFirstRenderAdapter = ddeVar;
        }
    }

    public void switchPlayerScene(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a4ec07", new Object[]{this, str, new Boolean(z), hashMap});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_switchPlayerScene);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null || this.mDWVideoController == null) {
            return;
        }
        if (hashMap == null) {
            Map<String, String> uTParams = dWContext.getUTParams();
            if (uTParams == null) {
                return;
            }
            this.mDWVideoController.a(str, z, uTParams);
            return;
        }
        dWContext.addUtParams(hashMap);
        this.mDWVideoController.a(str, z, hashMap);
    }

    public void callWithMsg(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
            return;
        }
        InterfaceUsageCounter.a().a(InterfaceUsageCounter.InterfaceName.dw_callWithMsg);
        if (map == null) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "callWithMsg " + map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (obw.KEY_VIDEO_UPDATE_PARAMS.equals(key) && !StringUtils.isEmpty(value)) {
                this.mDWContext.mDynamicPlayEx = value;
            } else if ("enterFloating".equals(key)) {
                this.mDWContext.mIsFloat = "1".equals(value);
            }
        }
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.a(map);
    }

    public void commitEndForMultiplexing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.H();
    }

    public void setOpenVolumeFadeIn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
            return;
        }
        al alVar = this.mDWVideoController;
        if (alVar == null) {
            return;
        }
        alVar.d(z);
    }
}
