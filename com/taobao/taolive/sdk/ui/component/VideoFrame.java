package com.taobao.taolive.sdk.ui.component;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrameErrorController;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import com.taobao.taolive.sdk.ui.media.t;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.m;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.r;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.taolive.sdk.utils.z;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.ddw;
import tb.dlx;
import tb.fmg;
import tb.kge;
import tb.lmy;
import tb.lre;
import tb.phg;
import tb.phj;
import tb.phr;
import tb.phs;
import tb.pkn;
import tb.pko;
import tb.plx;
import tb.pmd;
import tb.pmf;
import tb.pnf;
import tb.pnj;
import tb.pos;
import tb.poy;
import tb.poz;
import tb.ppn;
import tb.ppr;
import tb.qzp;
import tb.rmx;
import tb.sku;
import tb.sst;
import tb.xkw;
import tb.xpg;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes8.dex */
public class VideoFrame extends BaseFrame implements com.taobao.taolive.sdk.model.a, PlayerController2.b, PlayerController2.e, ddv, phr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANCHOR_END = 2;
    public static final int ANCHOR_LEAVE = 1;
    public static final int ANCHOR_ONLINE = 0;
    public static final String EVENT_ACTION_SHOW_SWITCH_TIP = "com.taobao.taolive.show.switch.tip";
    private static final String INSIDE_DETAIL_BROADCAST_ACTION_popStateChanged = "mega.stdPop.broadcast.popStateChanged";
    private static final String INSIDE_DETAIL_BROADCAST_ACTION_positionChanged = "mega.stdPop.broadcast.positionChanged";
    private static final String INSIDE_DETAIL_BROADCAST_ACTION_windowStateChanged = "mega.stdPop.broadcast.windowStateChanged";
    private static final String KEY_POP_ID = "popId";
    private static final String LOADING_URL = "https://gw.alicdn.com/imgextra/i1/O1CN01vZ8H7E1wWK3PzMoik_!!6000000006315-54-tps-132-132.apng";
    public static final int STATUS_END = 1;
    public static final int STATUS_LIVE = 0;
    public static final int STATUS_PRELIVE = 3;
    public static final int STATUS_REPLAY = 2;
    private static final String TAG = "VideoFrame";
    public static final String VIDEO_TYPE_LIVE = "live";
    public static final String VIDEO_TYPE_VIDEO = "video";
    private float X;
    private float Y;
    private int downloadId;
    private boolean enableShowSmallWindow;
    public String highlightCurrentPlay;
    public boolean isActive;
    private boolean isHalf;
    private boolean isOutControlGlobalMute;
    private pos.a mActionAdapter;
    private com.taobao.taolive.sdk.ui.component.b mAnchorLeaveCallback;
    private TextView mBackBtn;
    private String mBackBtnText;
    public FrameLayout mContentView;
    private long mCurrentPosition;
    public int mDeviceLevel;
    private Handler mDialogHandler;
    private boolean mDisableSmallWindow;
    private boolean mEnableInterceptPlayerProcess;
    private boolean mEnableNewErrorView;
    private boolean mEnableWeakNet;
    private a mErrorController;
    private TextView mErrorHint;
    private FrameLayout mErrorImgLayout;
    private View mErrorMask;
    private String mErrorText;
    private View mErrorView;
    private View mErrorViewNew;
    private boolean mForceReset;
    private boolean mHasCompleted;
    private boolean mHasVFPlugin;
    private e mIOnVideoViewTouchListener;
    private f mISeekStopTrackingListener;
    private xpg.a mImmersiveServiceDelegate;
    private BroadcastReceiver mInsideDetailReceiver;
    private boolean mIsAnchorLeave;
    private boolean mIsHalfScreenDetail;
    private boolean mIsInHalfScreenOpen;
    public boolean mIsOpen;
    public boolean mIsPlayError;
    private boolean mIsUserCloseSmallWindow;
    private boolean mKeepErrorHint;
    private SurfaceView mLinkLiveSurfaceView;
    private ppr mListener;
    public String mLiveContextKey;
    private FrameLayout mLoadingFrameLayout;
    private Runnable mLoadingHideRunnable;
    private FrameLayout mLoadingLayout;
    private LinearLayout mLoadingView;
    private boolean mNeedResume;
    private b mOnVideoContainerShowListener;
    private c mOnVideoErrorClickListener;
    private d mOnVideoReloadClickListener;
    private PlayerController2.b mPlayProgressListener;
    private PlayerController2 mPlayerController;
    private FrameLayout mProjectScreenLayout;
    private TextView mReloadBtn;
    private boolean mReset;
    private View mRootView;
    private lre mSmallWindowManager;
    private int mStatus;
    private TextView mStatusHint;
    private pos mStreamChooseService;
    public String mSubBusinessType;
    public com.taobao.taolive.sdk.ui.media.d mTaoVideoView;
    public String mToken;
    private com.taobao.taolive.sdk.ui.component.c mVideoCallback;
    private g mVideoFramePopAnimateListener;
    private h mVideoFrameWindowChangeListener;
    private ppr mVideoStatusListener;
    public String mVideoViewToken;
    private com.taobao.taolive.sdk.model.f mWeakHandler;
    private boolean skipResumePlay;
    private DialogFragment streamSwitchDialog;

    /* loaded from: classes8.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes8.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes8.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes8.dex */
    public interface e {
    }

    /* loaded from: classes8.dex */
    public interface f {
        void a(boolean z);
    }

    static {
        kge.a(728063446);
        kge.a(2144175604);
        kge.a(-1827108764);
        kge.a(191318335);
        kge.a(1528924332);
        kge.a(-1905361424);
    }

    public static /* synthetic */ Object ipc$super(VideoFrame videoFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -236809011) {
            super.onWillAppear();
            return null;
        } else if (hashCode != 797441118) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onPause();
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : TAG;
    }

    public void createVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fcbaab", new Object[]{this});
        }
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.e
    public void onStopTrackingTouch(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8624ddbe", new Object[]{this, new Boolean(z), new Long(j)});
        }
    }

    public void reAddFloatViewToLiveRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b233473c", new Object[]{this});
        }
    }

    public static /* synthetic */ DialogFragment access$000(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogFragment) ipChange.ipc$dispatch("ba72404a", new Object[]{videoFrame}) : videoFrame.streamSwitchDialog;
    }

    public static /* synthetic */ DialogFragment access$002(VideoFrame videoFrame, DialogFragment dialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogFragment) ipChange.ipc$dispatch("528d50b2", new Object[]{videoFrame, dialogFragment});
        }
        videoFrame.streamSwitchDialog = dialogFragment;
        return dialogFragment;
    }

    public static /* synthetic */ TextView access$1000(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("d3e59333", new Object[]{videoFrame}) : videoFrame.mStatusHint;
    }

    public static /* synthetic */ LinearLayout access$1100(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("5e133e57", new Object[]{videoFrame}) : videoFrame.mLoadingView;
    }

    public static /* synthetic */ b access$1200(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7152c50", new Object[]{videoFrame}) : videoFrame.mOnVideoContainerShowListener;
    }

    public static /* synthetic */ boolean access$1302(VideoFrame videoFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9e128d4", new Object[]{videoFrame, new Boolean(z)})).booleanValue();
        }
        videoFrame.skipResumePlay = z;
        return z;
    }

    public static /* synthetic */ PlayerController2 access$1400(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PlayerController2) ipChange.ipc$dispatch("df5076cf", new Object[]{videoFrame}) : videoFrame.mPlayerController;
    }

    public static /* synthetic */ FrameLayout access$1500(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("c748c455", new Object[]{videoFrame}) : videoFrame.mProjectScreenLayout;
    }

    public static /* synthetic */ void access$1600(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17027745", new Object[]{videoFrame});
        } else {
            videoFrame.stopLiveProjectScreenInner();
        }
    }

    public static /* synthetic */ void access$1700(VideoFrame videoFrame, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0517420", new Object[]{videoFrame, str, jSONObject});
        } else {
            videoFrame.onWindowStateChanged(str, jSONObject);
        }
    }

    public static /* synthetic */ void access$1800(VideoFrame videoFrame, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe313f", new Object[]{videoFrame, str, jSONObject});
        } else {
            videoFrame.onPopStateChanged(str, jSONObject);
        }
    }

    public static /* synthetic */ boolean access$1902(VideoFrame videoFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1271a0e", new Object[]{videoFrame, new Boolean(z)})).booleanValue();
        }
        videoFrame.mHasCompleted = z;
        return z;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.model.f access$2000(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.model.f) ipChange.ipc$dispatch("53e381f0", new Object[]{videoFrame}) : videoFrame.mWeakHandler;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.ui.component.b access$2100(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.component.b) ipChange.ipc$dispatch("24af3032", new Object[]{videoFrame}) : videoFrame.mAnchorLeaveCallback;
    }

    public static /* synthetic */ void access$2200(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e77520", new Object[]{videoFrame});
        } else {
            videoFrame.hideDialog();
        }
    }

    public static /* synthetic */ void access$2300(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3bca61", new Object[]{videoFrame});
        } else {
            videoFrame.hideVideoError();
        }
    }

    public static /* synthetic */ ppr access$2400(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppr) ipChange.ipc$dispatch("6cea5872", new Object[]{videoFrame}) : videoFrame.mVideoStatusListener;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.ui.component.c access$2500(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.component.c) ipChange.ipc$dispatch("bb5ca255", new Object[]{videoFrame}) : videoFrame.mVideoCallback;
    }

    public static /* synthetic */ void access$2600(VideoFrame videoFrame, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3d3184", new Object[]{videoFrame, new Integer(i), new Integer(i2)});
        } else {
            videoFrame.showDialogDelay(i, i2);
        }
    }

    public static /* synthetic */ boolean access$300(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc1b4457", new Object[]{videoFrame})).booleanValue() : videoFrame.mHasVFPlugin;
    }

    public static /* synthetic */ float access$400(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e56f9984", new Object[]{videoFrame})).floatValue() : videoFrame.X;
    }

    public static /* synthetic */ float access$402(VideoFrame videoFrame, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcbafdda", new Object[]{videoFrame, new Float(f2)})).floatValue();
        }
        videoFrame.X = f2;
        return f2;
    }

    public static /* synthetic */ float access$500(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec3eec5", new Object[]{videoFrame})).floatValue() : videoFrame.Y;
    }

    public static /* synthetic */ float access$502(VideoFrame videoFrame, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdf150b9", new Object[]{videoFrame, new Float(f2)})).floatValue();
        }
        videoFrame.Y = f2;
        return f2;
    }

    public static /* synthetic */ e access$600(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("c81f6378", new Object[]{videoFrame}) : videoFrame.mIOnVideoViewTouchListener;
    }

    public static /* synthetic */ a access$700(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3f19cf8b", new Object[]{videoFrame}) : videoFrame.mErrorController;
    }

    public static /* synthetic */ void access$800(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac0ee98", new Object[]{videoFrame});
        } else {
            videoFrame.reloadVideoView();
        }
    }

    public static /* synthetic */ c access$900(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4455cdd7", new Object[]{videoFrame}) : videoFrame.mOnVideoErrorClickListener;
    }

    public void setSkipResumePlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51582f8b", new Object[]{this, new Boolean(z)});
        } else {
            this.skipResumePlay = z;
        }
    }

    public VideoFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel);
        this.mStatus = -1;
        this.mDisableSmallWindow = false;
        this.mDialogHandler = new Handler();
        this.mReset = false;
        this.mForceReset = false;
        this.mHasCompleted = false;
        this.mKeepErrorHint = false;
        this.mIsAnchorLeave = false;
        this.mNeedResume = true;
        this.mHasVFPlugin = false;
        this.skipResumePlay = false;
        this.mCurrentPosition = 0L;
        this.mWeakHandler = new com.taobao.taolive.sdk.model.f(this);
        this.enableShowSmallWindow = true;
        this.mImmersiveServiceDelegate = new xpg.a() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.xpg.a
            public void a(float f2, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f2), new Integer(i)});
                    return;
                }
                if (VideoFrame.this.mFrameContext != null && VideoFrame.this.mFrameContext.z() != null && VideoFrame.this.mFrameContext.z().M()) {
                    ddw.a().a(xkw.d, "videoViewUp", VideoFrame.this.observeUniqueIdentification());
                }
                ab.e("TBLiveAIImmersiveService", "onVideoMove: offset = " + f2);
                VideoFrame.this.videoMoveAnim(f2, (long) i);
            }

            @Override // tb.xpg.a
            public Bitmap a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this});
                }
                if (VideoFrame.this.mTaoVideoView != null && VideoFrame.this.mTaoVideoView.bG_() != null) {
                    return VideoFrame.this.mTaoVideoView.bG_().copy(Bitmap.Config.RGB_565, true);
                }
                return null;
            }
        };
        this.mActionAdapter = new pos.a() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pos.a
            public void a(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else if (VideoFrame.access$000(VideoFrame.this) != null && VideoFrame.access$000(VideoFrame.this).isVisible()) {
                } else {
                    if (com.taobao.android.live.plugin.proxy.c.a().d() && com.taobao.android.live.plugin.proxy.f.o() != null) {
                        VideoFrame.access$002(VideoFrame.this, com.taobao.android.live.plugin.proxy.f.o().createStreamSwitchDialog(str, str2));
                    }
                    if (!(VideoFrame.this.mContext instanceof FragmentActivity) || VideoFrame.access$000(VideoFrame.this) == null) {
                        return;
                    }
                    VideoFrame.access$000(VideoFrame.this).show(((FragmentActivity) VideoFrame.this.mContext).getSupportFragmentManager(), "streamSwitchDialog");
                }
            }

            @Override // tb.pos.a
            public void a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    ddw.a().a(VideoFrame.EVENT_ACTION_SHOW_SWITCH_TIP);
                }
            }
        };
        this.mInsideDetailReceiver = new BroadcastReceiver() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent == null || intent.getAction() == null) {
                } else {
                    if (intent.getAction().equals(VideoFrame.INSIDE_DETAIL_BROADCAST_ACTION_windowStateChanged)) {
                        if (intent.getStringExtra("windowState") == null) {
                            return;
                        }
                        VideoFrame.access$1700(VideoFrame.this, intent.getStringExtra("windowState"), z.a(intent));
                    } else if (!intent.getAction().equals(VideoFrame.INSIDE_DETAIL_BROADCAST_ACTION_popStateChanged) || intent.getStringExtra("popState") == null) {
                    } else {
                        VideoFrame.access$1800(VideoFrame.this, intent.getStringExtra("popState"), z.a(intent));
                    }
                }
            }
        };
        this.mLoadingHideRunnable = new Runnable() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                VideoFrame.this.hideKarTunLoadingView();
                q.b(VideoFrame.TAG, "auto hideKarTunLoadingView real 702");
            }
        };
        this.mEnableWeakNet = o.j();
        this.mEnableInterceptPlayerProcess = o.n();
        this.mVideoFrameWindowChangeListener = new h();
        this.mVideoFramePopAnimateListener = new g();
        this.mFrameContext = aVar;
        if (this.mFrameContext == null || !(this.mFrameContext.z() instanceof com.taobao.taolive.sdk.controller.e) || !((com.taobao.taolive.sdk.controller.e) this.mFrameContext.z()).x()) {
            registerHalfWindowStateListener(context);
        }
        this.mSmallWindowManager = new lre(this.mFrameContext, this.mContext, this);
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mEnableNewErrorView = o.D();
        q.b(TAG, "mEnableWeakNet:" + this.mEnableWeakNet);
        if (!this.mEnableNewErrorView) {
            return;
        }
        this.mErrorController = new VideoFrameErrorController();
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        m.a(TAG, "lifeCycle reset mLiveContextKey = " + this.mLiveContextKey);
        reset(false);
    }

    public void reset(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993e9b3e", new Object[]{this, new Boolean(z)});
            return;
        }
        m.a(TAG, "lifeCycle reset mLiveContextKey = " + this.mLiveContextKey + " force = " + z);
        this.mReset = true;
        this.mForceReset = z;
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar != null) {
            dVar.o();
        }
        View view = this.mErrorView;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.mErrorViewNew;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        a aVar = this.mErrorController;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, tb.deh
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (!this.mIsHalfScreenDetail) {
        } else {
            resume();
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        m.a(TAG, "lifeCycle resume mLiveContextKey = " + this.mLiveContextKey);
        if (com.taobao.taolive.sdk.playcontrol.c.j(this.mFrameContext) && u.i()) {
            if (getSmallWindow() != null) {
                getSmallWindow().a(this.mPlayerController, this.mReset);
            }
        } else if (this.mNeedResume || com.taobao.taolive.sdk.playcontrol.c.g(this.mFrameContext)) {
            if (!this.mReset && (!this.skipResumePlay || o.q())) {
                resumePlay();
            }
            com.taobao.taolive.sdk.playcontrol.c.h(this.mFrameContext);
        }
        this.mNeedResume = true;
        if (!this.mForceReset) {
            this.mReset = false;
        }
        if (getSmallWindow() != null) {
            getSmallWindow().a();
        }
        if (!o.m() || !poy.g(this.mFrameContext) || !poy.h(this.mFrameContext)) {
            return;
        }
        setPlayerMute();
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        m.a(TAG, "lifeCycle pause mLiveContextKey = " + this.mLiveContextKey);
        if (!isStatus(2)) {
            return;
        }
        this.mCurrentPosition = this.mTaoVideoView.m();
    }

    public void stop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbe7513", new Object[]{this, str});
            return;
        }
        m.a(TAG, "lifeCycle stop mLiveContextKey = " + this.mLiveContextKey + " id = " + str);
        toSmallWindow(str, true, true, false);
    }

    public void stop(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c10e021", new Object[]{this, str, new Boolean(z)});
            return;
        }
        m.a(TAG, "lifeCycle stop mLiveContextKey = " + this.mLiveContextKey + " id = " + str);
        toSmallWindow(str, true, z, false);
    }

    private void fullScreenDetailToSmallWindow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935ca841", new Object[]{this, str});
            return;
        }
        m.a(TAG, "fullScreenDetailToSmallWindow mLiveContextKey = " + this.mLiveContextKey + " id = " + str);
        toSmallWindow(str, true, true, true);
    }

    private void toSmallWindow(String str, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd13ad47", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (getSmallWindow() != null) {
            getSmallWindow().a(str, z, z2, z3);
        }
        this.mDisableSmallWindow = false;
    }

    public void destroy() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.enableShowSmallWindow = true;
        m.a(TAG, "lifeCycle destroy mLiveContextKey = " + this.mLiveContextKey);
        pmd.a().o().a(this.downloadId);
        hideVideoError();
        hideKarTunLoadingView();
        Handler handler = this.mDialogHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        stopCheckPermissonIfNecessary();
        PlayerController2 playerController2 = this.mPlayerController;
        if (playerController2 != null) {
            playerController2.destroy();
            this.mPlayerController = null;
        }
        if (this.mListener != null) {
            com.taobao.taolive.sdk.playcontrol.c.c(this.mFrameContext, this.mListener);
            this.mListener = null;
        }
        ddw.a().b(this);
        pko.a().d(this.mLiveContextKey);
        pos posVar = this.mStreamChooseService;
        if (posVar != null) {
            posVar.b();
        }
        this.mLiveContextKey = null;
        com.taobao.taolive.sdk.model.f fVar = this.mWeakHandler;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        if (this.mEnableNewErrorView && (aVar = this.mErrorController) != null) {
            aVar.a();
        }
        stopLiveProjectScreen();
        uninitPerceptionHalfDetailByEven();
    }

    public void onFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
            return;
        }
        a aVar = this.mErrorController;
        if (aVar == null) {
            return;
        }
        aVar.a(true);
        this.mErrorController.c();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
            return;
        }
        m.a(TAG, "BaseFrame lifeCycle onCreateView mLiveContextKey = " + this.mLiveContextKey);
    }

    public void onCreateView(ViewStub viewStub, String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d161c8", new Object[]{this, viewStub, str, new Integer(i), new Long(j)});
            return;
        }
        m.a(TAG, "BaseFrame lifeCycle onCreateView mLiveContextKey = " + this.mLiveContextKey);
        this.mSubBusinessType = str;
        this.mDeviceLevel = i;
        if (viewStub == null) {
            return;
        }
        viewStub.setLayoutResource(R.layout.taolive_frame_video);
        this.mRootView = viewStub.inflate();
        this.mContentView = (FrameLayout) this.mRootView.findViewById(R.id.taolive_video_content);
        this.mContentView.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                Log.e("onTouchEvent", "onTouchEvent " + motionEvent.getAction());
                if (VideoFrame.access$300(VideoFrame.this) && VideoFrame.this.mTaoVideoView != null && VideoFrame.this.mTaoVideoView.u() != null) {
                    VideoFrame.this.mContentView.getWidth();
                    VideoFrame.this.mContentView.getHeight();
                }
                return VideoFrame.access$300(VideoFrame.this);
            }
        });
        this.mLoadingView = (LinearLayout) this.mContentView.findViewById(R.id.taolive_video_status_bar);
        this.mLoadingLayout = (FrameLayout) this.mContentView.findViewById(R.id.taolive_video_status_bar_layout);
        this.mStatusHint = (TextView) this.mContentView.findViewById(R.id.taolive_status_hint);
        this.mErrorImgLayout = (FrameLayout) this.mContentView.findViewById(R.id.taolive_video_error_img_layout);
        this.mProjectScreenLayout = (FrameLayout) this.mContentView.findViewById(R.id.taolive_video_project_screen);
        this.mLoadingFrameLayout = (FrameLayout) this.mContentView.findViewById(R.id.taolive_video_status_loading);
        setupLoadingUi();
        showMask();
        this.mRootView.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    VideoFrame.access$402(VideoFrame.this, motionEvent.getX());
                    VideoFrame.access$502(VideoFrame.this, motionEvent.getY());
                } else if (action == 1 && VideoFrame.access$600(VideoFrame.this) != null && Math.abs(motionEvent.getX() - VideoFrame.access$400(VideoFrame.this)) < 20.0f && Math.abs(motionEvent.getY() - VideoFrame.access$500(VideoFrame.this)) < 20.0f) {
                    VideoFrame.access$600(VideoFrame.this);
                }
                return false;
            }
        });
        init();
        if (this.mErrorViewNew != null) {
            return;
        }
        this.mErrorViewNew = this.mContentView.findViewById(R.id.taolive_video_error_new);
        a aVar = this.mErrorController;
        if (aVar == null) {
            return;
        }
        aVar.a(this.mFrameContext, this.mContext, this.mErrorViewNew);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        m.a(TAG, "BaseFrame lifeCycle onPause mLiveContextKey = " + this.mLiveContextKey);
        super.onPause();
        if (!enableFixLeakSound() || !(this.mContext instanceof Activity) || !((Activity) this.mContext).isFinishing()) {
            return;
        }
        pausePlay();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        m.a(TAG, "BaseFrame lifeCycle show mLiveContextKey = " + this.mLiveContextKey);
        FrameLayout frameLayout = this.mContentView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        m.a(TAG, "BaseFrame lifeCycle hide mLiveContextKey = " + this.mLiveContextKey);
        FrameLayout frameLayout = this.mContentView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(4);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        if (this.mFrameContext == null || !(this.mFrameContext.z() instanceof com.taobao.taolive.sdk.controller.e) || !((com.taobao.taolive.sdk.controller.e) this.mFrameContext.z()).x()) {
            return;
        }
        initPerceptionHalfDetailByEven();
    }

    public String getPlayingUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eacc3d02", new Object[]{this});
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return null;
        }
        return dVar.e();
    }

    public boolean pausePlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffe989d5", new Object[]{this})).booleanValue();
        }
        if (this.mEnableInterceptPlayerProcess && this.mFrameContext.z().u()) {
            return false;
        }
        m.a(TAG, "MediaPlay Control pausePlay mLiveContextKey = " + this.mLiveContextKey);
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return false;
        }
        if (this.mStatus == 0) {
            if (o.r()) {
                this.mTaoVideoView.a((Drawable) new BitmapDrawable(this.mContext.getResources(), this.mTaoVideoView.bG_()), true);
            }
            this.mTaoVideoView.o();
        } else {
            dVar.i();
        }
        return true;
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        m.a(TAG, "MediaPlay Control seekToInt mLiveContextKey = " + this.mLiveContextKey + " position = " + i);
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.a(i);
    }

    public void seekTo(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645bea", new Object[]{this, new Long(j)});
            return;
        }
        m.a(TAG, "MediaPlay Control seekToLong mLiveContextKey = " + this.mLiveContextKey + " position = " + j);
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.a(j);
    }

    public void resumePlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d10508", new Object[]{this});
        } else if (this.mEnableInterceptPlayerProcess && this.mFrameContext.z().u()) {
        } else {
            m.a(TAG, "MediaPlay Control resumePlay mLiveContextKey = " + this.mLiveContextKey);
            com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
            if (dVar == null) {
                return;
            }
            dVar.b(this.mIsOpen);
            if (isStatus(2) && this.mCurrentPosition > 0) {
                mTaoLiveRoomPlayer_start();
                this.mTaoVideoView.a(this.mCurrentPosition);
            } else {
                mTaoLiveRoomPlayer_start();
            }
            this.mIsPlayError = false;
        }
    }

    public void playStreamUrl(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383c3fcc", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5), new Boolean(z6)});
        } else {
            playStreamUrl(str, z, z2, z3, z4, -1, true, false, z6);
        }
    }

    public void playStreamUrl(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6c84c", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
        } else {
            playStreamUrl(str, z, z2, z3, z4, -1, true);
        }
    }

    public void playStreamUrl(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3834857d", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Integer(i), new Boolean(z5)});
        } else {
            playStreamUrl(str, z, z2, z3, z4, i, z5, false);
        }
    }

    public void playStreamUrl(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5cdcf7", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Integer(i), new Boolean(z5), new Boolean(z6)});
        } else {
            playStreamUrl(str, z, z2, z3, z4, i, z5, z6, true);
        }
    }

    public void playStreamUrl(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6, boolean z7) {
        pmf t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3f74bd", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Integer(i), new Boolean(z5), new Boolean(z6), new Boolean(z7)});
            return;
        }
        m.a(TAG, "MediaPlay Control playStreamUrl mLiveContextKey = " + this.mLiveContextKey);
        if (this.mTaoVideoView == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.mTaoVideoView.q();
        this.mTaoVideoView.o();
        this.mTaoVideoView.d(z);
        this.mTaoVideoView.e(z2);
        this.mTaoVideoView.f(z3);
        this.mTaoVideoView.j(false);
        this.mTaoVideoView.g(z5);
        if ("shop_card2021".equals(poy.R(this.mFrameContext))) {
            this.mTaoVideoView.d("shopLiveCard");
        } else {
            this.mTaoVideoView.d("LiveRoom");
        }
        VideoInfo videoInfo = getVideoInfo();
        if (z4) {
            this.mTaoVideoView.a((MediaData) null, str);
        } else if (i >= 0) {
            this.mTaoVideoView.a(i);
        } else {
            MediaData a2 = com.taobao.taolive.sdk.model.common.a.a(videoInfo);
            if (a2 != null && !z5) {
                a2.h265 = false;
            }
            if (a2 != null && !TextUtils.isEmpty(a2.dataTracks) && (t = pmd.a().t()) != null) {
                t.a(a2.dataTracks, this.mContext);
            }
            this.mTaoVideoView.a(a2, (String) null);
        }
        if (videoInfo != null) {
            this.mTaoVideoView.b(videoInfo.pushFeature);
        }
        this.mTaoVideoView.b(this.mIsOpen);
        this.mTaoVideoView.h(this.mToken);
        configPlayer();
        if (z7) {
            this.mTaoVideoView.w();
        }
        this.mIsPlayError = false;
        this.mToken = null;
    }

    private void playStreamUrl(String str, boolean z, String str2, int i) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7252b271", new Object[]{this, str, new Boolean(z), str2, new Integer(i)});
        } else if (this.mTaoVideoView == null) {
        } else {
            boolean z3 = !TextUtils.isEmpty(str2) && !str2.equals(this.highlightCurrentPlay);
            if (!TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || str.equals(this.highlightCurrentPlay)) {
                z2 = false;
            }
            if (!z3 && !z2 && this.mTaoVideoView.l()) {
                return;
            }
            this.mTaoVideoView.q();
            this.mTaoVideoView.o();
            this.mTaoVideoView.d(false);
            this.mTaoVideoView.e(false);
            this.mTaoVideoView.f(false);
            this.mTaoVideoView.j(false);
            this.mTaoVideoView.m(z);
            if (o.g() && i > 0) {
                this.mTaoVideoView.e(i);
            }
            if (!TextUtils.isEmpty(str2)) {
                setMediaId(str2);
                this.highlightCurrentPlay = str2;
            } else {
                this.mTaoVideoView.a((MediaData) null, str);
                addCustomParams(str);
                this.highlightCurrentPlay = str;
                this.mTaoVideoView.d("TimeMovingPlay");
            }
            this.mTaoVideoView.b(this.mIsOpen);
            mTaoLiveRoomPlayer_start();
            this.mIsPlayError = false;
            PlayerController2 playerController2 = this.mPlayerController;
            if (playerController2 != null) {
                playerController2.setPlayRateDefalut();
            }
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", 19999, "HighlightTimeMovingPlayVV", "", "0", null);
        }
    }

    public void setStreamUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c89c36", new Object[]{this, str, new Boolean(z)});
            return;
        }
        m.a(TAG, "MediaPlay Control setStreamUrl mLiveContextKey = " + this.mLiveContextKey);
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null || str == null) {
            return;
        }
        dVar.o();
        VideoInfo videoInfo = getVideoInfo();
        if (z) {
            this.mTaoVideoView.a((MediaData) null, str);
        } else {
            this.mTaoVideoView.a(com.taobao.taolive.sdk.model.common.a.a(videoInfo), (String) null);
        }
    }

    public void retry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
            return;
        }
        m.a(TAG, "MediaPlay Control retry mLiveContextKey = " + this.mLiveContextKey);
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.o();
        this.mTaoVideoView.b(this.mIsOpen);
        mTaoLiveRoomPlayer_start();
        this.mIsPlayError = false;
    }

    public void setCoverImg(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1014bb", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        m.a(TAG, "MediaPlay Control setCoverImg mLiveContextKey = " + this.mLiveContextKey);
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null || drawable == null) {
            return;
        }
        dVar.a(drawable, z);
    }

    public void setLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
            return;
        }
        m.a(TAG, "MediaPlay Control setLooping mLiveContextKey = " + this.mLiveContextKey + " bLooping = " + z);
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.c(z);
    }

    public void setHighLightLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46ddea1", new Object[]{this, new Boolean(z)});
            return;
        }
        m.a(TAG, "MediaPlay Control setHighLightLooping mLiveContextKey = " + this.mLiveContextKey + " bLooping = " + z);
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.m(z);
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        return dVar != null && dVar.l();
    }

    public void switchHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c807312a", new Object[]{this});
            return;
        }
        m.a(TAG, "MediaPlay Control switchHigher mLiveContextKey = " + this.mLiveContextKey);
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null || !dVar.A()) {
            return;
        }
        this.mTaoVideoView.l(true);
    }

    public void setMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        m.a(TAG, "MediaPlay Control setMute mLiveContextKey = " + this.mLiveContextKey);
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.a(z);
    }

    public boolean hasFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca37cbe2", new Object[]{this})).booleanValue();
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return false;
        }
        return dVar.D();
    }

    public com.taobao.taolive.sdk.ui.media.d getTaoVideoView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("2b66a605", new Object[]{this}) : this.mTaoVideoView;
    }

    public void configPlayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a997bca", new Object[]{this});
        } else {
            configPlayer(false);
        }
    }

    public void configPlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896b04a", new Object[]{this, new Boolean(z)});
        } else {
            configPlayer(z, true);
        }
    }

    public void configPlayer(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a400bca", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z2 && this.mTaoVideoView != null) {
            updateRationType();
            this.mStreamChooseService = (pos) ppn.a().a(this.mLiveContextKey, pos.class);
            pos posVar = this.mStreamChooseService;
            if (posVar != null) {
                posVar.a(this.mTaoVideoView, z);
                this.mStreamChooseService.a(this.mActionAdapter);
                if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.liveId != null) {
                    this.mStreamChooseService.a(this.mLiveDataModel.mVideoInfo.liveId);
                }
                if (n.b(this.mFrameContext) != null && (n.b(this.mFrameContext) instanceof com.taobao.taolive.sdk.controller.e) && ((com.taobao.taolive.sdk.controller.e) n.b(this.mFrameContext)).g()) {
                    this.mStreamChooseService.a(n.b(this.mFrameContext));
                }
                this.mStreamChooseService.b(poz.p(n.b(this.mFrameContext)));
                this.mStreamChooseService.c(poy.R(this.mFrameContext));
            }
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.f_(this.isOutControlGlobalMute);
        if (!(this.mFrameContext instanceof com.taobao.taolive.sdk.core.e)) {
            return;
        }
        this.mTaoVideoView.a(((com.taobao.taolive.sdk.core.e) this.mFrameContext).B());
    }

    public void addCustomParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd23429", new Object[]{this, str});
        } else if (!o.a() || TextUtils.isEmpty(str) || this.mTaoVideoView == null) {
        } else {
            Uri parse = Uri.parse(str);
            String queryParameter = parse != null ? parse.getQueryParameter("timeMovingCacheKey") : "";
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("timeMovingCacheKey", queryParameter);
            this.mTaoVideoView.b(hashMap);
        }
    }

    public void callWithMsg(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.a(map);
    }

    public boolean getIsLowNetworkForLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83a7d786", new Object[]{this})).booleanValue();
        }
        if (this.mTaoVideoView != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("getLowSpeedPolicy", "1");
            HashMap<String, String> b2 = this.mTaoVideoView.b((Map<String, String>) hashMap);
            if (b2 != null) {
                return "1".equals(b2.get("getLowSpeedPolicy"));
            }
        }
        return false;
    }

    public void setOutControlGlobalMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5267e0", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isOutControlGlobalMute = z;
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.f_(z);
    }

    private void addVFPlugin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e759135", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.i(str);
        this.mHasVFPlugin = true;
    }

    private void removeVFPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0abf8e", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.t();
        this.mHasVFPlugin = false;
    }

    private void setBizCallback(IMediaPlayer.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0a8e56", new Object[]{this, aVar});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.u();
    }

    public void setVideoErrorInfo(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce6dda4", new Object[]{this, str, view});
            return;
        }
        this.mErrorText = str;
        FrameLayout frameLayout = this.mErrorImgLayout;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
        if (view == null) {
            return;
        }
        this.mErrorImgLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public void setVideoErrorLoading(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b149d77", new Object[]{this, frameLayout});
        } else if (this.mLoadingLayout == null || frameLayout == null) {
        } else {
            int a2 = com.taobao.taolive.sdk.utils.b.a(this.mContext, 75.0f);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(a2, a2));
            this.mLoadingLayout.removeAllViews();
            this.mLoadingLayout.addView(frameLayout, 0);
        }
    }

    public void showVideoError(boolean z, int i) {
        com.taobao.taolive.sdk.ui.media.d dVar;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c53d320", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (!pmd.a().a("showAnchorLeaveView")) {
            hideVideoError();
        } else {
            if (this.mFrameContext == null || this.mFrameContext.o() == null || this.mFrameContext.o().bizCode == null || !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(this.mFrameContext.o().bizCode)) {
                z2 = true;
            }
            if (!z2) {
                hideVideoError();
                return;
            }
            if (o.r() && (dVar = this.mTaoVideoView) != null) {
                this.mTaoVideoView.a((Drawable) new BitmapDrawable(this.mContext.getResources(), dVar.bG_()), true);
            }
            initOldErrorView();
            this.mIsAnchorLeave = z;
            if (this.mEnableNewErrorView) {
                showNewErrorView(z);
            } else {
                showOldErrorView(z);
            }
        }
    }

    private void showNewErrorView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9966b6c3", new Object[]{this, new Boolean(z)});
        } else if (this.mErrorController == null) {
        } else {
            if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && !TextUtils.equals(this.mLiveDataModel.mVideoInfo.roomStatus, "1")) {
                this.mErrorController.a(VideoFrameErrorController.PlayerErrorState.PLAYER_ERROR_STATE_LIVE_END);
            } else if (z) {
                this.mErrorController.a(VideoFrameErrorController.PlayerErrorState.PLAYER_ERROR_STATE_ANCHOR_LEAVE);
            } else {
                this.mErrorController.a(VideoFrameErrorController.PlayerErrorState.PLAYER_ERROR_STATE_OTHER);
            }
            this.mWeakHandler.postDelayed(new Runnable() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        VideoFrame.access$700(VideoFrame.this).b();
                    }
                }
            }, 500L);
            if (this.mErrorController.d() == null) {
                return;
            }
            this.mErrorController.d().setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        VideoFrame.access$800(VideoFrame.this);
                    }
                }
            });
        }
    }

    private void showOldErrorView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c4c30a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mKeepErrorHint) {
            this.mKeepErrorHint = false;
        } else {
            this.mErrorMask.setVisibility(8);
            this.mErrorImgLayout.setVisibility(8);
            if (!z && !this.mIsAnchorLeave) {
                this.mErrorHint.setText(this.mErrorText);
            } else {
                this.mErrorHint.setText(this.mContext.getString(R.string.taolive_anchor_leave_hint));
                VideoInfo videoInfo = getVideoInfo();
                if (videoInfo != null && videoInfo.landScape && !TextUtils.isEmpty(videoInfo.coverImg169)) {
                    final View childAt = this.mErrorImgLayout.getChildAt(0);
                    if (childAt instanceof ImageView) {
                        pmd.a().l().a(videoInfo.coverImg169).a(new pnf() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.12
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.pnf
                            public void b(Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                                }
                            }

                            @Override // tb.pnf
                            public void a(Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                                } else if (!(obj instanceof Drawable)) {
                                } else {
                                    ((ImageView) childAt).setImageDrawable((Drawable) obj);
                                }
                            }
                        }).a();
                    }
                    this.mErrorImgLayout.setVisibility(0);
                    this.mErrorMask.setVisibility(0);
                }
            }
        }
        if (this.mErrorView.getVisibility() == 0) {
            return;
        }
        this.mErrorView.setVisibility(0);
    }

    private void initOldErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e41151d", new Object[]{this});
        } else if (this.mErrorView != null) {
        } else {
            this.mErrorView = this.mContentView.findViewById(R.id.taolive_video_error);
            this.mErrorHint = (TextView) this.mErrorView.findViewById(R.id.taolive_video_error_hint);
            this.mReloadBtn = (TextView) this.mErrorView.findViewById(R.id.taolive_video_error_btn);
            this.mBackBtn = (TextView) this.mErrorView.findViewById(R.id.taolive_video_back_btn);
            TextView textView = this.mBackBtn;
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.mErrorMask = this.mErrorView.findViewById(R.id.taolive_video_error_mask);
            if (this.mErrorView != null) {
                if (o.r()) {
                    this.mErrorView.setBackgroundResource(R.color.taolive_anchor_transparent_bg);
                } else {
                    this.mErrorView.setBackgroundResource(R.drawable.taolive_slice_scroll_common);
                }
            }
            if (!TextUtils.isEmpty(this.mBackBtnText)) {
                this.mBackBtn.setText(this.mBackBtnText);
            }
            this.mReloadBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        VideoFrame.access$800(VideoFrame.this);
                    }
                }
            });
            this.mBackBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (VideoFrame.access$900(VideoFrame.this) == null) {
                    } else {
                        VideoFrame.access$900(VideoFrame.this).a();
                    }
                }
            });
        }
    }

    private void reloadVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a708812e", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        MediaData d2 = dVar.d();
        String e2 = this.mTaoVideoView.e();
        this.mTaoVideoView.q();
        this.mTaoVideoView.o();
        d dVar2 = this.mOnVideoReloadClickListener;
        if (dVar2 != null) {
            dVar2.a();
        }
        this.mTaoVideoView.a(d2, e2);
        this.mTaoVideoView.b(this.mIsOpen);
        mTaoLiveRoomPlayer_start();
        this.mIsPlayError = false;
        showDialogDelay(R.string.taolive_live_status_waiting, 0);
        hideVideoError();
        this.mKeepErrorHint = true;
    }

    public void setOnVideoContainerShowListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57664b1a", new Object[]{this, bVar});
        } else {
            this.mOnVideoContainerShowListener = bVar;
        }
    }

    public void setOnVideoErrorClickListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347109ef", new Object[]{this, cVar});
        } else {
            this.mOnVideoErrorClickListener = cVar;
        }
    }

    public void setOnVideoReloadClickListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf66de9", new Object[]{this, dVar});
        } else {
            this.mOnVideoReloadClickListener = dVar;
        }
    }

    private void hideVideoError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c364636", new Object[]{this});
            return;
        }
        View view = this.mErrorView;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.mErrorViewNew;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    private void showDialogDelay(final int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a75685", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Handler handler = this.mDialogHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.mDialogHandler.postDelayed(new Runnable() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                VideoFrame.access$1000(VideoFrame.this).setText(i);
                if (VideoFrame.access$1100(VideoFrame.this) != null) {
                    VideoFrame.access$1100(VideoFrame.this).setVisibility(0);
                }
                if (VideoFrame.access$1200(VideoFrame.this) == null) {
                    return;
                }
                VideoFrame.access$1200(VideoFrame.this).a();
            }
        }, i2);
    }

    private void hideDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a82cb1", new Object[]{this});
            return;
        }
        Handler handler = this.mDialogHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.mDialogHandler.post(new Runnable() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (VideoFrame.access$1100(VideoFrame.this) == null) {
                } else {
                    VideoFrame.access$1100(VideoFrame.this).setVisibility(8);
                }
            }
        });
    }

    public void changeStatus(int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a63cda", new Object[]{this, new Integer(i)});
            return;
        }
        this.mStatus = i;
        if (isStatus(1) && com.taobao.taolive.sdk.playcontrol.c.i(this.mFrameContext) == VideoStatus.VIDEO_NORMAL_STATUS) {
            com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
            if (dVar != null && dVar.G() != null) {
                this.mTaoVideoView.o();
                this.mTaoVideoView.G().setVisibility(8);
            }
            hideDialog();
            hideVideoError();
        } else if (isStatus(2)) {
            changeToReplay();
        } else if (isStatus(0)) {
            changeToLive();
        } else if (isStatus(3)) {
            changeToPrelive();
        }
        if (!isStatus(1) || (view = this.mErrorViewNew) == null) {
            return;
        }
        view.setVisibility(8);
    }

    public void changeToShortDelayLive(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a09afde", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null || dVar.G() == null) {
            return;
        }
        this.mTaoVideoView.G().setVisibility(0);
        this.mTaoVideoView.d(1);
        this.mTaoVideoView.c(1);
        this.mTaoVideoView.a(20133, i);
        this.mTaoVideoView.a(20134, i2);
        this.mTaoVideoView.a(TaobaoMediaPlayer.FFP_PROP_INT64_MAX_FAST_PLAY_COUNT, i3);
    }

    private void changeToLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea3bade", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null || dVar.G() == null) {
            return;
        }
        this.mTaoVideoView.G().setVisibility(0);
        this.mTaoVideoView.d(0);
        this.mTaoVideoView.c(1);
    }

    private void changeToPrelive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19927cb", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null || dVar.G() == null) {
            return;
        }
        this.mTaoVideoView.G().setVisibility(0);
        this.mTaoVideoView.d(2);
        this.mTaoVideoView.c(1);
    }

    private void changeToReplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bca2d99", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null || dVar.G() == null) {
            return;
        }
        this.mTaoVideoView.G().setVisibility(0);
        this.mTaoVideoView.d(2);
        if (u.j()) {
            this.mTaoVideoView.c(3);
        } else {
            this.mTaoVideoView.c(1);
        }
    }

    public void changeToLinkLive(SurfaceView surfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977c45f", new Object[]{this, surfaceView});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar != null && dVar.G() != null) {
            this.mTaoVideoView.o();
            this.mContentView.removeView(this.mTaoVideoView.G());
            this.mTaoVideoView.G().setVisibility(8);
        }
        if (surfaceView == null) {
            return;
        }
        this.mLinkLiveSurfaceView = surfaceView;
        this.mLinkLiveSurfaceView.setVisibility(0);
        if (this.mLinkLiveSurfaceView.getParent() != null) {
            return;
        }
        this.mContentView.addView(this.mLinkLiveSurfaceView, new ViewGroup.LayoutParams(-1, -1));
    }

    public void backFromLinkLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2675315e", new Object[]{this});
            return;
        }
        SurfaceView surfaceView = this.mLinkLiveSurfaceView;
        if (surfaceView != null) {
            this.mContentView.removeView(surfaceView);
            this.mLinkLiveSurfaceView.setVisibility(8);
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null || dVar.G() == null) {
            return;
        }
        if (this.mTaoVideoView.G().getParent() == null) {
            this.mContentView.addView(this.mTaoVideoView.G(), 0, new ViewGroup.LayoutParams(-1, -1));
        }
        this.mTaoVideoView.b(this.mIsOpen);
        mTaoLiveRoomPlayer_start();
        this.mIsPlayError = false;
        this.mTaoVideoView.G().setVisibility(0);
    }

    public void updateLinkLiveState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca5368b", new Object[]{this, new Boolean(z)});
        } else {
            com.taobao.taolive.sdk.playcontrol.c.b(this.mFrameContext, z);
        }
    }

    public void changeStream(String str, String str2, boolean z, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6fb110", new Object[]{this, str, str2, new Boolean(z), str3, new Integer(i)});
        } else if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str3)) || this.mTaoVideoView == null) {
        } else {
            if ("video".equals(str2)) {
                this.mTaoVideoView.d(2);
                this.mTaoVideoView.c(1);
                this.mTaoVideoView.d("TimeMovingPlay");
            } else {
                this.mTaoVideoView.d(0);
                try {
                    if (pmd.a().e() != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(aw.PARAM_PLAY_URL, str);
                        hashMap.put(sku.KEY_VIDEO_TYPE, str2);
                        hashMap.put(com.etao.feimagesearch.util.h.KEY_VIDEO_ID, str3);
                        pmd.a().e().a("Page_TaobaoLiveWatch", 19999, "HighlightScenarioLive", "", "0", hashMap);
                    }
                } catch (Exception unused) {
                }
                this.mTaoVideoView.c(1);
            }
            playStreamUrl(str, z, str3, i);
        }
    }

    public View getVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fdace493", new Object[]{this});
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return null;
        }
        return dVar.b();
    }

    public void addVideoBackgroundImg(Context context, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ad8daa", new Object[]{this, context, drawable});
        } else if (context == null || drawable == null) {
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(drawable);
            if (!(getVideoView() instanceof FrameLayout)) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) getVideoView();
            if (as.n()) {
                if (getMediaLayoutViewIndex(frameLayout) < 0) {
                    return;
                }
                addVideoBackgroundImgToVideoRootView(frameLayout, imageView);
                return;
            }
            addVideoBackgroundImgToVideoRootView(frameLayout, imageView);
        }
    }

    private void addVideoBackgroundImgToVideoRootView(FrameLayout frameLayout, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87e6650", new Object[]{this, frameLayout, imageView});
        } else if (frameLayout == null || imageView == null) {
        } else {
            frameLayout.addView(imageView, 0, new FrameLayout.LayoutParams(-1, -1));
            q.b(TAG, "videoRootView:" + frameLayout);
        }
    }

    private int getMediaLayoutViewIndex(FrameLayout frameLayout) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f793c492", new Object[]{this, frameLayout})).intValue();
        }
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            i = -1;
            for (int i2 = 0; i2 < childCount; i2++) {
                if (frameLayout.getChildAt(i2) instanceof FrameLayout) {
                    FrameLayout frameLayout2 = (FrameLayout) frameLayout.getChildAt(i2);
                    int childCount2 = frameLayout2.getChildCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount2) {
                            break;
                        } else if (frameLayout2.getChildAt(i3) instanceof com.taobao.mediaplay.player.g) {
                            i = i2;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i >= 0) {
                        break;
                    }
                }
            }
        } else {
            i = -1;
        }
        q.b(TAG, "getMediaViewIndex:" + i);
        return i;
    }

    public void setUserStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e46aedb", new Object[]{this, new Long(j)});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.b(j);
    }

    public void setMediaId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1608c02e", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.j(str);
        this.mTaoVideoView.d("TimeMovingPlay");
    }

    public void setVideoCallback(com.taobao.taolive.sdk.ui.component.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ec6efd", new Object[]{this, cVar});
        } else {
            this.mVideoCallback = cVar;
        }
    }

    public void setAnchorLeaveCallback(com.taobao.taolive.sdk.ui.component.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb120937", new Object[]{this, bVar});
        } else {
            this.mAnchorLeaveCallback = bVar;
        }
    }

    public MediaData getMediaData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("8f7a415f", new Object[]{this});
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return null;
        }
        return dVar.d();
    }

    public void setLiveContextKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b76814f", new Object[]{this, str});
        } else {
            this.mLiveContextKey = str;
        }
    }

    public void setISeekStopTrackingListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e956452a", new Object[]{this, fVar});
        } else {
            this.mISeekStopTrackingListener = fVar;
        }
    }

    public void setIOnVideoViewTouchListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b5f9b8", new Object[]{this, eVar});
        } else {
            this.mIOnVideoViewTouchListener = eVar;
        }
    }

    public void setOnVideoStatusListener(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653e48c5", new Object[]{this, pprVar});
        } else {
            this.mVideoStatusListener = pprVar;
        }
    }

    public void updateSubBusinessType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b9e6942", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.d(str);
    }

    public void addPlayExpUtParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d20b9f", new Object[]{this, hashMap});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.a(hashMap);
    }

    public void setBackBtnText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f96f91", new Object[]{this, str});
        } else {
            this.mBackBtnText = str;
        }
    }

    public void setVideoViewToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42a2d6c", new Object[]{this, str});
        } else {
            this.mVideoViewToken = str;
        }
    }

    public String getVideoViewToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7559d4a", new Object[]{this}) : this.mVideoViewToken;
    }

    public String getVideoViewTokenFromMediaController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c3e7952", new Object[]{this});
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (!(dVar instanceof com.taobao.taolive.sdk.ui.media.e)) {
            return null;
        }
        return ((com.taobao.taolive.sdk.ui.media.e) dVar).L();
    }

    public String getMediaPlayToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("987f86c2", new Object[]{this});
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return null;
        }
        return dVar.y();
    }

    public void enableRenderType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ca26da", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.b(2);
    }

    public boolean isStatus(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74007324", new Object[]{this, new Integer(i)})).booleanValue() : this.mStatus == i;
    }

    public void toHalfscreen(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09ed862", new Object[]{this, new Integer(i)});
            return;
        }
        updateLayout(new FrameLayout.LayoutParams(-1, i));
        this.isHalf = true;
    }

    public void toFullscreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73d121d", new Object[]{this});
            return;
        }
        updateLayout(new FrameLayout.LayoutParams(-1, -1));
        this.isHalf = false;
    }

    public void updateLayout(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf508a83", new Object[]{this, layoutParams});
            return;
        }
        FrameLayout frameLayout = this.mContentView;
        if (frameLayout == null || layoutParams == null) {
            return;
        }
        frameLayout.setLayoutParams(layoutParams);
    }

    public void setExtraConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac43cb", new Object[]{this, str, str2});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.f(str2);
        this.mTaoVideoView.g(str);
    }

    public void setMediaSourceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b423788", new Object[]{this, str});
        } else if (this.mTaoVideoView == null || TextUtils.isEmpty(str)) {
        } else {
            this.mTaoVideoView.b(str);
        }
    }

    public void setVideoDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bc14fd", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
        if (dVar == null) {
            return;
        }
        dVar.a(str);
    }

    public void hideGoHomeBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ff16da", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mContentView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.findViewById(R.id.taolive_video_back_btn).setVisibility(8);
    }

    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this.mRootView;
    }

    public void setLowDeviceFirstRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7972f", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsOpen = z;
        }
    }

    public void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
        } else {
            this.mToken = str;
        }
    }

    @Override // tb.phr
    public void multipleLinkUpdate(phs phsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45afebaf", new Object[]{this, phsVar});
        } else if (phsVar == null) {
        } else {
            if (!TextUtils.isEmpty(phsVar.c)) {
                try {
                    this.mRootView.setBackgroundColor(Color.parseColor(phsVar.c));
                } catch (Exception e2) {
                    plx.b(TAG, "setBackgroundColor " + e2.getMessage());
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.taobao.taolive.room.utils.d.e(), (int) (com.taobao.taolive.room.utils.d.e() / phsVar.f32653a));
            layoutParams.topMargin = phsVar.b;
            updateLayout(layoutParams);
        }
    }

    @Override // tb.phr
    public void multipleLinkReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65c0f4c", new Object[]{this});
            return;
        }
        toFullscreen();
        this.mRootView.setBackgroundColor(0);
    }

    @Override // tb.phr
    public void chatRoomLinkcallWithMsg(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1cd3a8e", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            callWithMsg(map);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (xkw.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW.equals(str)) {
            disableSmallWindow(true);
        } else if (xkw.EVENT_MEDIAPLATFORM_ENABLE_SMALLWINDOW.equals(str)) {
            disableSmallWindow(false);
        } else if (xkw.EVENT_LINKLIVE_START.equals(str)) {
            if (obj instanceof SurfaceView) {
                changeToLinkLive((SurfaceView) obj);
            } else if (!(obj instanceof String) || !"force".equals(obj)) {
            } else {
                changeToLinkLive(null);
            }
        } else if (xkw.EVENT_LINKLIVE_STOP.equals(str)) {
            backFromLinkLive();
        } else if ("com.taobao.taolive.room.pause_live".equals(str)) {
            pausePlay();
        } else if ("com.taobao.taolive.room.resume_live".equals(str)) {
            resumePlay();
        } else if ("com.taobao.taolive.room.mediaplatform_mute_video".equals(str)) {
            if (obj == null) {
                return;
            }
            setMute(((Boolean) obj).booleanValue());
        } else if ("com.taobao.taolive.room.mediaplatform_pause_video".equals(str)) {
            pausePlay();
        } else if ("com.taobao.taolive.room.mediaplatform_resume_video".equals(str)) {
            resumePlay();
        } else if ("com.taobao.taolive.room.seekto_replay".equals(str)) {
            if (obj == null) {
                return;
            }
            seekTo(((Integer) obj).intValue());
        } else if ("com.taolive.taolive.room.mute".equals(str)) {
            setMute(true);
        } else if ("com.taolive.taolive.room.unmute".equals(str)) {
            setMute(false);
        } else if (xkw.EVENT_LINKLIVE_VERIFY_START.equals(str)) {
            disableSmallWindow(true);
        } else if (xkw.EVENT_LINKLIVE_VERIFY_END.equals(str)) {
            disableSmallWindow(false);
        } else if (xkw.EVENT_LINKLIVE_QUEUE.equals(str)) {
            if (!(obj instanceof Boolean)) {
                return;
            }
            updateLinkLiveState(((Boolean) obj).booleanValue());
        } else if ("com.taobao.taolive.room.mediaplatform_start_video".equals(str)) {
            if (!(obj instanceof Map)) {
                return;
            }
            Map map = (Map) obj;
            String str2 = (String) map.get(aw.PARAM_PLAY_URL);
            String str3 = (String) map.get("type");
            map.get("mediaInfo");
            changeStream(str2, str3, l.d((String) map.get("loop")), (String) map.get(com.etao.feimagesearch.util.h.KEY_VIDEO_ID), l.a((String) map.get("startSeekTime")));
        } else if ("com.taobao.taolive.room.add_vf_plugin".equals(str)) {
            addVFPlugin((String) obj);
        } else if ("com.taobao.taolive.room.remove_vf_plugin".equals(str)) {
            removeVFPlugin();
        } else if ("com.taobao.taolive.room.set_biz_callback".equals(str)) {
            if (!(obj instanceof IMediaPlayer.a)) {
                return;
            }
            setBizCallback((IMediaPlayer.a) obj);
        } else if ("com.taobao.taolive.room.float_view_close".equals(str)) {
            if (!o.m() || !this.mIsInHalfScreenOpen) {
                return;
            }
            this.mIsUserCloseSmallWindow = true;
            setPlayerMute();
            poy.d(true, this.mFrameContext);
            toFullscreen();
        } else if ("com.taobao.taolive.room.float_view_add_to_live_room".equals(str)) {
            if (!o.m() || !this.mIsInHalfScreenOpen) {
                return;
            }
            reAddFloatViewToLiveRoom();
        } else if ("com.taobao.taolive.room.start_live_project_screen".equals(str)) {
            startLiveProjectScreen(obj);
        } else if ("com.taobao.taolive.room.stop_live_project_screen".equals(str)) {
            stopLiveProjectScreen();
        } else if (!xkw.EVENT_LIVE_IMMERSIVE_EXPERIENCE.equals(str) || !(obj instanceof HashMap) || this.mLiveDataModel.mVideoInfo.landScape || this.mFrameContext.K || TextUtils.equals(this.mLiveDataModel.mVideoInfo.roomStatus, "2")) {
        } else {
            HashMap<String, String> hashMap = (HashMap) obj;
            hashMap.put("bizCode", this.mFrameContext.o().bizCode);
            if (xpg.a(this.mContext.hashCode()) == null) {
                return;
            }
            xpg.a(this.mContext.hashCode()).a(hashMap, this.mImmersiveServiceDelegate);
        }
    }

    private void startLiveProjectScreen(final Object obj) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7601f07a", new Object[]{this, obj});
        } else if (!u.aR() || (frameLayout = this.mProjectScreenLayout) == null || frameLayout.getVisibility() == 0) {
        } else {
            this.mProjectScreenLayout.post(new Runnable() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    VideoInfo videoInfo = VideoFrame.this.getVideoInfo();
                    if (videoInfo == null || !videoInfo.landScape) {
                        return;
                    }
                    VideoFrame.this.pausePlay();
                    VideoFrame.access$1302(VideoFrame.this, true);
                    if (VideoFrame.access$1400(VideoFrame.this) != null) {
                        VideoFrame.access$1400(VideoFrame.this).hideController();
                    }
                    final phj g2 = phg.g();
                    if (g2 == null) {
                        return;
                    }
                    Object obj2 = obj;
                    if (!(obj2 instanceof JSONObject)) {
                        return;
                    }
                    final JSONObject jSONObject = (JSONObject) obj2;
                    String string = jSONObject.getString("templateName");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    g2.a(VideoFrame.this.mContext, string, new phj.a() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.phj.a
                        public void onCreateView(DXRootView dXRootView) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                            } else if (g2 == null || dXRootView == null || VideoFrame.access$1500(VideoFrame.this) == null) {
                            } else {
                                VideoFrame.access$1500(VideoFrame.this).setVisibility(0);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                layoutParams.gravity = 17;
                                VideoFrame.access$1500(VideoFrame.this).addView(dXRootView, layoutParams);
                                g2.a(dXRootView, jSONObject);
                            }
                        }
                    });
                }
            });
        }
    }

    private void stopLiveProjectScreen() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be32cc7e", new Object[]{this});
        } else if (!u.aR() || (frameLayout = this.mProjectScreenLayout) == null || frameLayout.getVisibility() == 8 || this.mProjectScreenLayout.getChildCount() == 0) {
        } else {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                stopLiveProjectScreenInner();
            } else {
                this.mProjectScreenLayout.post(new Runnable() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            VideoFrame.access$1600(VideoFrame.this);
                        }
                    }
                });
            }
        }
    }

    private void stopLiveProjectScreenInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17bf226", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = getVideoInfo();
        if (videoInfo == null || !videoInfo.landScape || this.mProjectScreenLayout == null) {
            return;
        }
        this.skipResumePlay = false;
        resumePlay();
        PlayerController2 playerController2 = this.mPlayerController;
        if (playerController2 != null) {
            playerController2.showController();
        }
        this.mProjectScreenLayout.setVisibility(8);
        this.mProjectScreenLayout.removeAllViews();
    }

    public void videoMoveAnim(float f2, long j) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64eeb28", new Object[]{this, new Float(f2), new Long(j)});
            return;
        }
        View view = this.mRootView;
        if (view == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", f2);
        ofFloat.setDuration(j);
        ofFloat.start();
        com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
        if (f2 == 0.0f) {
            z = false;
        }
        aVar.g(z);
    }

    public void setPlayerMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1042e523", new Object[]{this});
            return;
        }
        PlayerController2 playerController2 = this.mPlayerController;
        if (playerController2 == null || playerController2.getmVideoView() == null) {
            return;
        }
        this.mPlayerController.getmVideoView().a(true);
    }

    public void setPlayerUnMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9570fa1c", new Object[]{this});
            return;
        }
        PlayerController2 playerController2 = this.mPlayerController;
        if (playerController2 == null || playerController2.getmVideoView() == null) {
            return;
        }
        this.mPlayerController.getmVideoView().a(false);
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW, xkw.EVENT_MEDIAPLATFORM_ENABLE_SMALLWINDOW, xkw.EVENT_LINKLIVE_START, xkw.EVENT_LINKLIVE_STOP, "com.taobao.taolive.room.pause_live", "com.taobao.taolive.room.resume_live", "com.taobao.taolive.room.mediaplatform_pause_video", "com.taobao.taolive.room.mediaplatform_resume_video", "com.taobao.taolive.room.mediaplatform_mute_video", "com.taobao.taolive.room.seekto_replay", "com.taolive.taolive.room.mute", "com.taolive.taolive.room.unmute", xkw.EVENT_LINKLIVE_VERIFY_START, xkw.EVENT_LINKLIVE_VERIFY_END, xkw.EVENT_LINKLIVE_QUEUE, "com.taobao.taolive.room.mediaplatform_start_video", "com.taobao.taolive.room.add_vf_plugin", "com.taobao.taolive.room.remove_vf_plugin", "com.taobao.taolive.room.set_biz_callback", "com.taobao.taolive.room.float_view_close", "com.taobao.taolive.room.float_view_add_to_live_room", "com.taobao.taolive.room.start_live_project_screen", "com.taobao.taolive.room.stop_live_project_screen", xkw.EVENT_LIVE_IMMERSIVE_EXPERIENCE};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }

    public PlayerController2 getPlayerController() {
        com.taobao.taolive.sdk.ui.media.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayerController2) ipChange.ipc$dispatch("a36731e6", new Object[]{this});
        }
        if (this.mPlayerController == null && this.mTaoVideoView != null) {
            this.mPlayerController = new PlayerController2(this.mContext, this.mTaoVideoView);
            this.mPlayerController.setPlayProgressListener(this);
            this.mPlayerController.setSeekStopTrackingListener(this);
        }
        PlayerController2 playerController2 = this.mPlayerController;
        if (playerController2 != null && (dVar = this.mTaoVideoView) != null) {
            playerController2.bindListener(dVar);
        }
        return this.mPlayerController;
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.e
    public void onStopTrackingTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95d1c6", new Object[]{this, new Boolean(z)});
            return;
        }
        f fVar = this.mISeekStopTrackingListener;
        if (fVar == null) {
            return;
        }
        fVar.a(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.b
    public void onPlayProgress(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7f5a1d", new Object[]{this, new Long(j)});
            return;
        }
        PlayerController2.b bVar = this.mPlayProgressListener;
        if (bVar == null) {
            return;
        }
        bVar.onPlayProgress(j);
    }

    public void setPlayProgressListener(PlayerController2.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a30d9c0", new Object[]{this, bVar});
        } else {
            this.mPlayProgressListener = bVar;
        }
    }

    public String getLiveContextKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("570dc107", new Object[]{this}) : this.mLiveContextKey;
    }

    public boolean isInError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4054bb64", new Object[]{this})).booleanValue();
        }
        View view = this.mErrorView;
        return view != null && view.getVisibility() == 0;
    }

    public boolean isInLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d72058", new Object[]{this})).booleanValue();
        }
        LinearLayout linearLayout = this.mLoadingView;
        return linearLayout != null && linearLayout.getVisibility() == 0;
    }

    public void disableSmallWindow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb9e8be", new Object[]{this, new Boolean(z)});
        } else {
            this.mDisableSmallWindow = z;
        }
    }

    public boolean isDisableSmallWindow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ae782a4", new Object[]{this})).booleanValue() : this.mDisableSmallWindow;
    }

    public boolean hasCompleted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60d284dc", new Object[]{this})).booleanValue() : this.mHasCompleted;
    }

    public boolean enableShowSmallWindow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf7715a2", new Object[]{this})).booleanValue() : this.enableShowSmallWindow;
    }

    public void removeControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c96c0c", new Object[]{this});
            return;
        }
        PlayerController2 playerController2 = this.mPlayerController;
        if (playerController2 == null) {
            return;
        }
        playerController2.removeControllerView();
    }

    public Handler getDialogHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("399f833", new Object[]{this}) : this.mDialogHandler;
    }

    public void setNeedResume(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af57be8", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedResume = z;
        }
    }

    public void setEnableShowSmallWindow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5912f8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.enableShowSmallWindow = z;
        if (!y.a() || !y.e(this.mContext)) {
            return;
        }
        this.enableShowSmallWindow = false;
    }

    private lmy getSmallWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lmy) ipChange.ipc$dispatch("9354fac6", new Object[]{this});
        }
        lre lreVar = this.mSmallWindowManager;
        if (lreVar == null) {
            return null;
        }
        return lreVar.a();
    }

    private void registerHalfWindowStateListener(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c12c82", new Object[]{this, context});
            return;
        }
        if (context instanceof rmx) {
            ((rmx) context).a(this.mVideoFrameWindowChangeListener);
        }
        if (!(context instanceof qzp)) {
            return;
        }
        ((qzp) context).a(this.mVideoFramePopAnimateListener);
    }

    private boolean filterPopEvent(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e28c698c", new Object[]{this, jSONObject})).booleanValue() : (jSONObject == null || this.mContext == null || !String.valueOf(this.mContext.hashCode()).equals(jSONObject.getString("popId"))) ? false : true;
    }

    /* loaded from: classes8.dex */
    public class h implements fmg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-58241516);
            kge.a(1861127946);
        }

        private h() {
        }

        @Override // tb.fmg
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            } else {
                VideoFrame.access$1700(VideoFrame.this, str, jSONObject);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class g implements dlx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-882179676);
            kge.a(478546929);
        }

        @Override // tb.dlx
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            }
        }

        private g() {
        }

        @Override // tb.dlx
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            } else {
                VideoFrame.access$1800(VideoFrame.this, str, jSONObject);
            }
        }
    }

    private void onWindowStateChanged(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2962cd0d", new Object[]{this, str, jSONObject});
        } else if (!this.isActive || !filterPopEvent(jSONObject)) {
        } else {
            if (IAKPopRender.WindowState.STD_POP_HALF.equals(str)) {
                plx.b(TAG, "onWindowStateChanged 商详切换半屏： " + str);
                if (this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) {
                    ((com.taobao.taolive.sdk.core.e) this.mFrameContext).a(false);
                }
                if (!this.mIsUserCloseSmallWindow) {
                    resume();
                }
                this.mIsHalfScreenDetail = true;
            } else if (!IAKPopRender.WindowState.STD_POP_FULL_SCREEN.equals(str)) {
            } else {
                plx.b(TAG, "onWindowStateChanged 商详切换全屏： " + str);
                r.a(this.mFrameContext);
                if (this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) {
                    ((com.taobao.taolive.sdk.core.e) this.mFrameContext).a(true);
                }
                if (this.mFrameContext.z() != null && this.mFrameContext.z().M()) {
                    this.mFrameContext.e().a(xkw.d, "assembly", this.mFrameContext.G());
                }
                if (this.mIsUserCloseSmallWindow || this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null) {
                    return;
                }
                String str2 = this.mLiveDataModel.mVideoInfo.liveId;
                if (this.mLiveDataModel.mVideoInfo.isOfficialType()) {
                    str2 = this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId;
                }
                fullScreenDetailToSmallWindow(str2);
                this.mIsHalfScreenDetail = false;
            }
        }
    }

    private void onPopStateChanged(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147e80ea", new Object[]{this, str, jSONObject});
        } else if (!this.isActive || !filterPopEvent(jSONObject)) {
        } else {
            if (IAKPopRender.LifecycleType.BEFORE_CLOSE.equals(str)) {
                plx.b(TAG, "onPopStateChanged 半屏销毁： " + str);
                this.mFrameContext.e().a("com.taobao.taolive.inside.detail.close", null, this.mFrameContext.G());
                if (this.mFrameContext.z() != null && this.mFrameContext.z().M()) {
                    this.mFrameContext.e().a(xkw.d, "assembly", this.mFrameContext.G());
                }
                this.mIsHalfScreenDetail = false;
                this.mIsInHalfScreenOpen = false;
                if (sst.a(this.mFrameContext)) {
                    if (this.mFrameContext != null && this.mFrameContext.M() != null && this.mFrameContext.M().b()) {
                        setPlayerMute();
                    } else {
                        setPlayerUnMute();
                    }
                } else {
                    setPlayerUnMute();
                }
                r.a(this.mFrameContext);
                poy.c(false, this.mFrameContext);
                if (!(this.mFrameContext instanceof com.taobao.taolive.sdk.core.e)) {
                    return;
                }
                ((com.taobao.taolive.sdk.core.e) this.mFrameContext).a(false);
            } else if (IAKPopRender.LifecycleType.IN_ANIMATION_START.equals(str)) {
                plx.b(TAG, "onPopStateChanged 半屏打开： " + str);
                this.mFrameContext.e().a("com.taobao.taolive.inside.detail.open", null, this.mFrameContext.G());
                HashMap hashMap = new HashMap();
                hashMap.put("scene", "insideDetail");
                hashMap.put("isMoveUp", "true");
                ddw.a().a(xkw.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap, observeUniqueIdentification());
                if (this.mFrameContext.z() != null && this.mFrameContext.z().M()) {
                    this.mFrameContext.e().a(xkw.e, "assembly", this.mFrameContext.G());
                }
                this.mIsHalfScreenDetail = true;
                this.mIsInHalfScreenOpen = true;
                this.mIsUserCloseSmallWindow = false;
                r.a(this.mFrameContext);
                poy.d(false, this.mFrameContext);
                poy.c(true, this.mFrameContext);
            } else if (!IAKPopRender.LifecycleType.OUT_ANIMATION_START.equals(str)) {
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("scene", "insideDetail");
                hashMap2.put("isMoveUp", "false");
                ddw.a().a(xkw.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap2, observeUniqueIdentification());
            }
        }
    }

    private void initPerceptionHalfDetailByEven() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7396911", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(INSIDE_DETAIL_BROADCAST_ACTION_windowStateChanged);
        intentFilter.addAction(INSIDE_DETAIL_BROADCAST_ACTION_popStateChanged);
        intentFilter.addAction(INSIDE_DETAIL_BROADCAST_ACTION_positionChanged);
        LocalBroadcastManager.getInstance(this.mContext).registerReceiver(this.mInsideDetailReceiver, intentFilter);
    }

    private void uninitPerceptionHalfDetailByEven() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f940916a", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mInsideDetailReceiver);
        }
    }

    public void mTaoLiveRoomPlayer_start() {
        com.taobao.taolive.sdk.playcontrol.a A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4a0727", new Object[]{this});
        } else if (o.I()) {
            if (!(this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) || (A = ((com.taobao.taolive.sdk.core.e) this.mFrameContext).A()) == null) {
                return;
            }
            A.v();
        } else {
            com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
            if (dVar == null) {
                return;
            }
            dVar.g();
        }
    }

    public void mTaoLiveRoomPlayer_startByToken() {
        com.taobao.taolive.sdk.playcontrol.a A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4c90a9", new Object[]{this});
        } else if (o.I()) {
            if (!(this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) || (A = ((com.taobao.taolive.sdk.core.e) this.mFrameContext).A()) == null) {
                return;
            }
            A.x();
        } else {
            com.taobao.taolive.sdk.ui.media.d dVar = this.mTaoVideoView;
            if (dVar == null) {
                return;
            }
            dVar.g();
        }
    }

    public void setupView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423b649", new Object[]{this});
            return;
        }
        createVideoView();
        ddw.a().a(this);
        this.mListener = new t() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass15 anonymousClass15, String str, Object... objArr) {
                if (str.hashCode() == 274574814) {
                    super.a((IMediaPlayer) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                VideoFrame.access$1902(VideoFrame.this, true);
                if (VideoFrame.access$2000(VideoFrame.this) == null) {
                    return;
                }
                VideoFrame.access$2000(VideoFrame.this).removeCallbacksAndMessages(null);
            }

            @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (com.taobao.taolive.sdk.playcontrol.c.i(VideoFrame.this.mFrameContext) == VideoStatus.VIDEO_NORMAL_STATUS) {
                    VideoFrame.this.showVideoError(true, 0);
                }
                if (VideoFrame.access$2100(VideoFrame.this) == null) {
                    return;
                }
                VideoFrame.access$2100(VideoFrame.this).onAnchorLeave();
            }

            @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    VideoFrame.access$1902(VideoFrame.this, false);
                }
            }

            @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
            public void a(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
                    return;
                }
                super.a(iMediaPlayer);
                VideoFrame.access$2200(VideoFrame.this);
                VideoFrame.access$2300(VideoFrame.this);
            }

            @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
            public boolean a(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("6fb80ec2", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (pmd.a().m() != null) {
                    pnj m = pmd.a().m();
                    m.a(VideoFrame.TAG, VideoFrame.this.mLiveContextKey + " - onError " + i);
                }
                if (com.taobao.taolive.sdk.playcontrol.c.i(VideoFrame.this.mFrameContext) != VideoStatus.VIDEO_TIMESHIFT_STATUS) {
                    if (VideoFrame.access$2400(VideoFrame.this) != null && VideoFrame.access$2400(VideoFrame.this).a(iMediaPlayer, i, i2)) {
                        pkn e2 = pko.a().e(VideoFrame.this.mLiveContextKey);
                        if (e2 != null) {
                            e2.b = "1";
                        }
                        return true;
                    }
                    VideoFrame.this.hideKarTunLoadingView();
                    q.b(VideoFrame.TAG, "onError hideKarTunLoadingView");
                    pkn e3 = pko.a().e(VideoFrame.this.mLiveContextKey);
                    if (e3 != null && iMediaPlayer != null) {
                        e3.g = iMediaPlayer.y();
                    }
                    pko.a().a(VideoFrame.this.mLiveContextKey, String.valueOf(i));
                    VideoFrame.access$2200(VideoFrame.this);
                    VideoFrame.access$1902(VideoFrame.this, false);
                    if (VideoFrame.access$2500(VideoFrame.this) != null) {
                        VideoFrame.access$2500(VideoFrame.this).onVideoPlayError(i);
                    }
                    if (!VideoFrame.this.isStatus(1)) {
                        VideoFrame.this.showVideoError(false, i);
                    }
                }
                return false;
            }

            @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
            public boolean a(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("afe7bb3e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue();
                }
                VideoFrame.access$1902(VideoFrame.this, false);
                int i = (int) j;
                if (i == 3) {
                    VideoFrame.access$2200(VideoFrame.this);
                    VideoFrame.access$2300(VideoFrame.this);
                    q.b(VideoFrame.TAG, "onInfo MEDIA_INFO_VIDEO_RENDERING_START");
                } else if (i != 300) {
                    if (i == 301) {
                        VideoFrame.access$2200(VideoFrame.this);
                        VideoFrame.access$2300(VideoFrame.this);
                    } else if (i == 701) {
                        if (o.U()) {
                            VideoFrame.this.showKarTunLoading();
                        }
                        q.b(VideoFrame.TAG, "onInfo MEDIA_INFO_BUFFERING_START 701");
                    } else if (i == 702) {
                        if (o.U()) {
                            VideoFrame.this.hideKarTunLoadingView();
                        }
                        q.b(VideoFrame.TAG, "onInfo MEDIA_INFO_BUFFERING_END 702");
                        VideoFrame.access$2200(VideoFrame.this);
                        VideoFrame.access$2300(VideoFrame.this);
                    } else if (i == 748) {
                        q.b(VideoFrame.TAG, "onInfo MEDIA_INFO_BUFFERING_START 748");
                        VideoFrame.this.showKarTunLoading();
                    } else if (i == 749) {
                        VideoFrame.this.hideKarTunLoadingView();
                        q.b(VideoFrame.TAG, "onInfo MEDIA_INFO_BUFFERING_START 749");
                    }
                } else if (o.E()) {
                    VideoFrame.access$2600(VideoFrame.this, R.string.taolive_live_status_waiting, 1000);
                }
                return true;
            }

            @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
            public void c(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9773e960", new Object[]{this, iMediaPlayer});
                } else if (!VideoFrame.this.isStatus(2)) {
                } else {
                    VideoFrame.access$1902(VideoFrame.this, true);
                    if (VideoFrame.this.mTaoVideoView == null) {
                        return;
                    }
                    VideoFrame.this.mTaoVideoView.o();
                }
            }
        };
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, this.mListener);
        a aVar = this.mErrorController;
        if (aVar != null) {
            aVar.a();
        }
        a aVar2 = this.mErrorController;
        if (aVar2 == null) {
            return;
        }
        aVar2.a(this.mLiveDataModel);
        this.mErrorController.a(poy.W(this.mFrameContext));
        if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && !TextUtils.equals(this.mLiveDataModel.mVideoInfo.roomStatus, "1")) {
            this.mErrorController.a(VideoFrameErrorController.PlayerErrorState.PLAYER_ERROR_STATE_LIVE_END);
        }
        this.mErrorController.c();
    }

    private void setupLoadingUi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8797c1fa", new Object[]{this});
        } else if (!this.mEnableWeakNet) {
        } else {
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_room_live_video_kartun_layout, (ViewGroup) null);
            final AliUrlImageView aliUrlImageView = (AliUrlImageView) inflate.findViewById(R.id.taolive_room_loading_kartun_image);
            aliUrlImageView.setSkipAutoSize(true);
            if (this.mLoadingFrameLayout != null) {
                int a2 = com.taobao.taolive.sdk.utils.b.a(this.mContext, 120.0f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
                layoutParams.gravity = 17;
                this.mLoadingFrameLayout.addView(inflate, layoutParams);
            }
            com.taobao.phenix.intf.b.h().a(LOADING_URL).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.16
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
                    String url = succPhenixEvent.getUrl();
                    q.b(VideoFrame.TAG, "loadingUrl:" + url);
                    aliUrlImageView.setImageUrl(url);
                    return false;
                }
            });
            HashMap hashMap = new HashMap();
            hashMap.put("bizId", "my3dZone");
            hashMap.put(MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, true);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) LOADING_URL);
            jSONArray.add(jSONObject);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("downloadList", jSONArray);
            hashMap2.put("downloadParam", hashMap);
            this.downloadId = pmd.a().o().a(hashMap2, new com.taobao.taolive.sdk.adapter.network.a() { // from class: com.taobao.taolive.sdk.ui.component.VideoFrame.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.a
                public void a(String str, int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    q.b(VideoFrame.TAG, "url:" + str + " path:" + str2);
                    aliUrlImageView.setImageUrl(str2);
                }
            });
        }
    }

    public void showKarTunLoading() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f668af5", new Object[]{this});
        } else if (!this.mEnableWeakNet || (frameLayout = this.mLoadingFrameLayout) == null || frameLayout.getVisibility() == 0) {
        } else {
            this.mLoadingFrameLayout.setVisibility(0);
            q.b(TAG, "showKarTunLoading real 701");
            com.taobao.taolive.sdk.model.f fVar = this.mWeakHandler;
            if (fVar == null) {
                return;
            }
            fVar.postDelayed(this.mLoadingHideRunnable, 5000L);
        }
    }

    public void hideKarTunLoadingView() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce0f315", new Object[]{this});
        } else if (!this.mEnableWeakNet || (frameLayout = this.mLoadingFrameLayout) == null || frameLayout.getVisibility() == 8) {
        } else {
            this.mLoadingFrameLayout.setVisibility(8);
            com.taobao.taolive.sdk.model.f fVar = this.mWeakHandler;
            if (fVar != null) {
                fVar.removeCallbacks(this.mLoadingHideRunnable);
            }
            q.b(TAG, "hideKarTunLoadingView real 702");
        }
    }

    private void showMask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8b2790", new Object[]{this});
        } else if (this.mContentView == null || this.mFrameContext == null || this.mFrameContext.o() == null || this.mFrameContext.o().abilityCompontent == null || !this.mFrameContext.o().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TOP_MASK)) {
        } else {
            this.mContentView.findViewById(R.id.taolive_open_top_mask).setVisibility(0);
        }
    }

    private void stopCheckPermissonIfNecessary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1893fc27", new Object[]{this});
            return;
        }
        if (com.taobao.taolive.sdk.permisson.a.a()) {
            LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(new Intent("com.taobao.taolive.sdk.permission.stop"));
        }
        com.taobao.taolive.sdk.permisson.a.b();
    }

    public VideoInfo getVideoInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("5c4fa617", new Object[]{this});
        }
        TBLiveDataModel c2 = this.mLiveDataModel != null ? this.mLiveDataModel : j.c(this.mFrameContext);
        if (c2 == null) {
            return null;
        }
        return c2.mVideoInfo;
    }

    public void updateRationType(IMediaPlayer.AspectRatio aspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8ca0d4", new Object[]{this, aspectRatio});
            return;
        }
        m.a(TAG, "updateRationType width = " + com.taobao.taolive.sdk.utils.b.b(this.mContext) + " height = " + com.taobao.taolive.sdk.utils.b.c(this.mContext) + " mLiveContextKey = " + this.mLiveContextKey);
        if (this.isHalf) {
            this.mTaoVideoView.a(IMediaPlayer.AspectRatio.CENTER_CROP);
        } else if (isHonorFoldableDevice()) {
            handleHonorFoldableDevice();
        } else if (aspectRatio != null) {
            this.mTaoVideoView.a(aspectRatio);
        } else {
            this.mTaoVideoView.a(IMediaPlayer.AspectRatio.CENTER_CROP);
        }
    }

    private void updateRationType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e38facd", new Object[]{this});
            return;
        }
        m.a(TAG, "updateRationType width = " + com.taobao.taolive.sdk.utils.b.b(this.mContext) + " height = " + com.taobao.taolive.sdk.utils.b.c(this.mContext) + " mLiveContextKey = " + this.mLiveContextKey);
        if (this.isHalf) {
            this.mTaoVideoView.a(IMediaPlayer.AspectRatio.CENTER_CROP);
        } else if (isHonorFoldableDevice()) {
            handleHonorFoldableDevice();
        } else {
            this.mTaoVideoView.a(IMediaPlayer.AspectRatio.CENTER_CROP);
        }
    }

    private void handleHonorFoldableDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58be5da", new Object[]{this});
        } else if (com.taobao.taolive.sdk.utils.b.b(this.mContext) / com.taobao.taolive.sdk.utils.b.c(this.mContext) > 0.75f) {
            this.mTaoVideoView.a(IMediaPlayer.AspectRatio.FIT_CENTER);
        } else {
            this.mTaoVideoView.a(IMediaPlayer.AspectRatio.CENTER_CROP);
        }
    }

    private boolean isHonorFoldableDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8fae849c", new Object[]{this})).booleanValue() : this.mContext != null && Build.MANUFACTURER.equalsIgnoreCase("HONOR") && this.mContext.getPackageManager() != null && this.mContext.getPackageManager().hasSystemFeature("com.hihonor.hardware.sensor.posture");
    }

    private static final boolean enableFixLeakSound() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e1cff85", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableFixLeakSound", "true"));
    }
}
