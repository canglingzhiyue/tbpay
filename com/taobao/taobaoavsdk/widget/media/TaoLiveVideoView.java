package com.taobao.taobaoavsdk.widget.media;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.player.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.e;
import com.taobao.taobaoavsdk.widget.media.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.ado;
import tb.ddc;
import tb.ddd;
import tb.dde;
import tb.ddh;
import tb.ddi;
import tb.ipw;
import tb.kge;
import tb.oyu;
import tb.ozm;
import tb.ozn;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes8.dex */
public class TaoLiveVideoView extends FrameLayout implements a.InterfaceC0698a, ozn.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ARTP_ERRCODE_ACTIVE_DEGRADE = -10611;
    public static final int ARTP_ERRCODE_FAILED_SWITCH_STREAM = -10900;
    public static final int ARTP_ERRCODE_PACKETRECVTIMEOUT = -10610;
    public static final int ARTP_ERRCODE_SPSPPSAaACCONFTIMEOUT = -10609;
    public static final int ARTP_ERRCODE_STARTPLAYTIMEOUT = -10608;
    public static final int ARTP_ERRCODE_STOPBYSFUBASE = -10000;
    public static final int ARTP_ERRCODE_STREAMHASSTOPPED = -10605;
    public static final int ARTP_ERRCODE_STREAMILLEGAL = -10603;
    public static final int ARTP_ERRCODE_STREAMNOTFOUND = -10604;
    public static final int ARTP_ERRCODE_UDP_NOUSABLE = -10612;
    private static final String COMPONENT_NAME = "avliveview";
    public static final int FLV_ERRCODE_CONNECTION_FAILED = -5;
    public static final String MornitorBuffering = "taolive_buffering";
    public static final String MornitorFirstFrameRender = "first_frame_render";
    public static int SDK_INT_FOR_OPTIMIZE = 0;
    public static final int STATE_ERROR = -1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_PAUSED = 4;
    public static final int STATE_PLAYBACK_COMPLETED = 5;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_PREPARED = 2;
    public static final int STATE_PREPARING = 1;
    private static final String TAG = "AVSDK";
    public static final String TBLIVE_ARTP_SCHEMA = "artp://";
    private static final String TBLIVE_BUSIINESS_ID = "TBLive";
    public static final String TBLIVE_GRTN_SCHEMA = "artc://";
    public static final String TBLIVE_ORANGE_ACCELERATESPEED = "AccelerateSpeed";
    public static final String TBLIVE_ORANGE_ACCELERATESPEED_LINK = "AudioAccelerateSpeedLink";
    public static final String TBLIVE_ORANGE_FAST_LOADING = "fast_loading";
    public static final String TBLIVE_ORANGE_FIRSTPLAY_BUFFER_TIME = "FirstBufferMS";
    public static final String TBLIVE_ORANGE_FUSION_MODE = "SensorFusionCalibrate";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";
    public static final String TBLIVE_ORANGE_NETWORK_TRAFFIC_REPORT = "NetworkTrafficReportTrigger";
    public static final String TBLIVE_ORANGE_PLAYBUFFER_TIME = "PlayBufferMS";
    public static final String TBLIVE_ORANGE_REPORT_INTERNAL = "LogReportIntervalSeconds";
    public static final String TBLIVE_ORANGE_RETAIN_FLV = "RetainFlv";
    public static final String TBLIVE_ORANGE_SENDSEI = "SendSEI";
    public static final String TBLIVE_ORANGE_SLOWSPEED = "AudioSlowSpeed";
    public static final String TBLIVE_ORANGE_SLOWSPEED_LINK = "AudioSlowSpeedLink";
    private static final int TBMPBBufferLoadCountLimit = 3;
    private static final int TBMPBBufferLoadCountTimeInterval = 15000;
    public static final String mornitorNetShake = "net_shake";
    public static final String mornitorOnePlay = "playExperience";
    public static final String mornitorPlayerError = "playerError";
    public static final String mornitorPtsDts = "pts_dts";
    public boolean bAudioOnly;
    public boolean bAutoPause;
    public boolean bFirstFrameRendered;
    public boolean bLooping;
    public boolean bPlayerTypeChanged;
    public boolean bmuted;
    public int bufferLoadCountLimit;
    public int bufferLoadCountTimeInterval;
    public int bufferLoadFrequencyCounter;
    private String cdn_ip;
    public long lastBufferLoadTime;
    private com.taobao.mediaplay.player.a mActivityLifecycleCallbacks;
    private boolean mBlockTouchEvent;
    private IMediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener;
    private IMediaPlayer.OnCompletionListener mCompletionListener;
    public com.taobao.taobaoavsdk.widget.media.c mConfig;
    public ddc mConfigAdapter;
    private Context mContext;
    private boolean mControlScreenByParams;
    public ImageView mCoverImgView;
    public int mCurrentBufferPercentage;
    public ddd mCustomLibLoader;
    private boolean mDisableFixPauseOnAcctivity;
    private boolean mDisableFixPauseOnPrepared;
    private boolean mEnableAutoAfterDisconnect;
    private boolean mEnableAutoPlayForBackground;
    private boolean mEnableGlobalKeepScreenOn;
    private boolean mEnableOpenGLCrop;
    private boolean mEnableSurfaceView;
    private boolean mEnableVideoDetect;
    private IMediaPlayer.OnErrorListener mErrorListener;
    private Map<String, String> mExtInfo;
    private dde mFirstRenderAdapter;
    private boolean mHasKeepScreenOn;
    private IMediaPlayer.OnInfoListener mInfoListener;
    public boolean mIsConnected;
    public boolean mIsMuteWhenStart;
    public ddh mLogAdapter;
    private ozn mMediaPlayerRecycler;
    public BroadcastReceiver mNetworkReceiver;
    private com.taobao.taobaoavsdk.widget.media.a mNextRenderView;
    public a.InterfaceC0888a mNextSHCallback;
    private a.b mNextSurfaceHolder;
    private List<IMediaPlayer.OnBufferingUpdateListener> mOnBufferingUpdateListeners;
    private IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private List<IMediaPlayer.OnCompletionListener> mOnCompletionListeners;
    private IMediaPlayer.OnErrorListener mOnErrorListener;
    private List<IMediaPlayer.OnErrorListener> mOnErrorListeners;
    private IMediaPlayer.OnInfoListener mOnInfoListener;
    private List<IMediaPlayer.OnInfoListener> mOnInfoListeners;
    private List<a> mOnPauseListeners;
    private IMediaPlayer.OnPreparedListener mOnPreparedListener;
    private List<IMediaPlayer.OnPreparedListener> mOnPreparedListeners;
    private IMediaPlayer.OnSeekCompletionListener mOnSeekCompletionListener;
    private List<IMediaPlayer.OnSeekCompletionListener> mOnSeekCompletionListeners;
    private List<b> mOnStartListeners;
    private List<IMediaPlayer.OnVideoClickListener> mOnVideoClickListeners;
    public String mPlayUrl;
    private IMediaPlayer.OnPreparedListener mPreparedListener;
    private SparseArray<Float> mPropertyFloat;
    private SparseArray<Long> mPropertyLong;
    private boolean mReleaseByExtern;
    public int mReleaseFocusCount;
    public View mRenderUIView;
    public com.taobao.taobaoavsdk.widget.media.a mRenderView;
    public boolean mRequestAudioFocus;
    public int mRequestFocusCount;
    public boolean mRequestLongFocus;
    public a.InterfaceC0888a mSHCallback;
    private IMediaPlayer.OnSeekCompletionListener mSeekCompletionListener;
    public int mSeekWhenPrepared;
    private String mSeiData;
    private boolean mSetDefaultPlayToken;
    private boolean mShouldInitBeforeStart;
    public IMediaPlayer.OnVideoSizeChangedListener mSizeChangedListener;
    private long mStartTime;
    public a.b mSurfaceHolder;
    private d mSurfaceListener;
    private Runnable mSwitchRunnable;
    public int mTargetState;
    private float mTouchX;
    private float mTouchY;
    private boolean mUseShortAudioFocus;
    public String mUsingInterface;
    public int mVideoHeight;
    public int mVideoRotationDegree;
    public int mVideoSarDen;
    public int mVideoSarNum;
    public int mVideoWidth;
    private boolean mbIsSwitchingPath;
    public long timeOutUs;

    /* loaded from: classes8.dex */
    public interface a {
        void onPause(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes8.dex */
    public interface b {
        void onStart(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes8.dex */
    public interface d {
        void a();

        void b();
    }

    public static /* synthetic */ Object ipc$super(TaoLiveVideoView taoLiveVideoView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ozn.a
    public int getDestoryState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d805014d", new Object[]{this})).intValue();
        }
        return 0;
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

    @Deprecated
    public void setMonitorAdapter(ddi ddiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825f2e85", new Object[]{this, ddiVar});
        }
    }

    public static /* synthetic */ void access$000(TaoLiveVideoView taoLiveVideoView, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11b1b69", new Object[]{taoLiveVideoView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            taoLiveVideoView.changeVideoSize(i, i2, i3, i4);
        }
    }

    public static /* synthetic */ IMediaPlayer.OnInfoListener access$100(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.OnInfoListener) ipChange.ipc$dispatch("c5763ea3", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mOnInfoListener;
    }

    public static /* synthetic */ List access$1000(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("619cbc2f", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mOnPreparedListeners;
    }

    public static /* synthetic */ boolean access$1100(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9db5239d", new Object[]{taoLiveVideoView})).booleanValue() : taoLiveVideoView.mDisableFixPauseOnPrepared;
    }

    public static /* synthetic */ List access$1200(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e5cb16ed", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mOnPauseListeners;
    }

    public static /* synthetic */ dde access$1400(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dde) ipChange.ipc$dispatch("c43292a5", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mFirstRenderAdapter;
    }

    public static /* synthetic */ long access$1500(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("878ba591", new Object[]{taoLiveVideoView})).longValue() : taoLiveVideoView.mStartTime;
    }

    public static /* synthetic */ IMediaPlayer.OnPreparedListener access$1600(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.OnPreparedListener) ipChange.ipc$dispatch("ceb4eb68", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mPreparedListener;
    }

    public static /* synthetic */ IMediaPlayer.OnCompletionListener access$1700(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.OnCompletionListener) ipChange.ipc$dispatch("5b8633ea", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mCompletionListener;
    }

    public static /* synthetic */ IMediaPlayer.OnErrorListener access$1800(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.OnErrorListener) ipChange.ipc$dispatch("37d8a1bf", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mErrorListener;
    }

    public static /* synthetic */ IMediaPlayer.OnInfoListener access$1900(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.OnInfoListener) ipChange.ipc$dispatch("bb03c59a", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mInfoListener;
    }

    public static /* synthetic */ List access$200(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("17ba26bc", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mOnInfoListeners;
    }

    public static /* synthetic */ IMediaPlayer.OnBufferingUpdateListener access$2000(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.OnBufferingUpdateListener) ipChange.ipc$dispatch("f6bc6125", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mBufferingUpdateListener;
    }

    public static /* synthetic */ IMediaPlayer.OnSeekCompletionListener access$2100(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.OnSeekCompletionListener) ipChange.ipc$dispatch("c4a452b", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mSeekCompletionListener;
    }

    public static /* synthetic */ a.b access$2200(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("26713df6", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mNextSurfaceHolder;
    }

    public static /* synthetic */ a.b access$2202(TaoLiveVideoView taoLiveVideoView, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("2dc6f2f", new Object[]{taoLiveVideoView, bVar});
        }
        taoLiveVideoView.mNextSurfaceHolder = bVar;
        return bVar;
    }

    public static /* synthetic */ void access$2300(TaoLiveVideoView taoLiveVideoView, IMediaPlayer iMediaPlayer, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b3ca31", new Object[]{taoLiveVideoView, iMediaPlayer, bVar});
        } else {
            taoLiveVideoView.bindSurfaceHolder(iMediaPlayer, bVar);
        }
    }

    public static /* synthetic */ d access$2400(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1f139f2d", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mSurfaceListener;
    }

    public static /* synthetic */ void access$2500(TaoLiveVideoView taoLiveVideoView, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a1bf11", new Object[]{taoLiveVideoView, bVar});
        } else {
            taoLiveVideoView.releaseHolderSurface(bVar);
        }
    }

    public static /* synthetic */ Context access$2600(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6765edb5", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mContext;
    }

    public static /* synthetic */ String access$302(TaoLiveVideoView taoLiveVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29150f28", new Object[]{taoLiveVideoView, str});
        }
        taoLiveVideoView.mSeiData = str;
        return str;
    }

    public static /* synthetic */ ozn access$400(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ozn) ipChange.ipc$dispatch("efff3536", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mMediaPlayerRecycler;
    }

    public static /* synthetic */ void access$500(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0ed1ae", new Object[]{taoLiveVideoView});
        } else {
            taoLiveVideoView.clearKeepScreenOn();
        }
    }

    public static /* synthetic */ IMediaPlayer.OnErrorListener access$600(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.OnErrorListener) ipChange.ipc$dispatch("323f7190", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mOnErrorListener;
    }

    public static /* synthetic */ List access$700(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("622e0997", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mOnErrorListeners;
    }

    public static /* synthetic */ List access$800(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a44536f6", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mOnBufferingUpdateListeners;
    }

    public static /* synthetic */ IMediaPlayer.OnPreparedListener access$900(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.OnPreparedListener) ipChange.ipc$dispatch("19c042fc", new Object[]{taoLiveVideoView}) : taoLiveVideoView.mOnPreparedListener;
    }

    static {
        kge.a(-1375816867);
        kge.a(219584769);
        kge.a(-1854325247);
        SDK_INT_FOR_OPTIMIZE = 23;
    }

    private void registerActivityLifecycleCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d7907d", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (context == null || this.mActivityLifecycleCallbacks != null) {
            return;
        }
        this.mActivityLifecycleCallbacks = new com.taobao.mediaplay.player.a(this, (Application) context.getApplicationContext());
    }

    private void unregisterActivityLifecycleCallbacks() {
        com.taobao.mediaplay.player.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f0e456", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (context == null || (aVar = this.mActivityLifecycleCallbacks) == null) {
            return;
        }
        aVar.a((Application) context.getApplicationContext());
        this.mActivityLifecycleCallbacks = null;
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        if (this.mContext == activity) {
            this.mStartTime = System.currentTimeMillis();
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null || !cVar.m || this.mContext != activity || !this.bAutoPause || !this.mEnableAutoPlayForBackground) {
            return;
        }
        start();
    }

    @Override // com.taobao.mediaplay.player.a.InterfaceC0698a
    public void onActivityPaused(Activity activity) {
        ozn oznVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        this.mStartTime = 0L;
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null || !cVar.m || this.mContext != activity || !this.mEnableAutoPlayForBackground) {
            return;
        }
        if (!this.mDisableFixPauseOnAcctivity && ((oznVar = this.mMediaPlayerRecycler) == null || oznVar.f == null || (this.mMediaPlayerRecycler.e != 3 && this.mMediaPlayerRecycler.e != 2))) {
            z = false;
        }
        if (!z) {
            return;
        }
        pause(false);
    }

    public void disableAutoPlayForBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd65293", new Object[]{this});
        } else {
            this.mEnableAutoPlayForBackground = false;
        }
    }

    public void setAutoPlayAfterDisconnect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b323a", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableAutoAfterDisconnect = z;
        }
    }

    public String getMediaPlayUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("854e018c", new Object[]{this}) : this.mPlayUrl;
    }

    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar == null || oznVar.f == null) {
            return;
        }
        this.mMediaPlayerRecycler.f.setPlayRate(f);
    }

    public void onCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7313c222", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", onCompletion");
        ddh ddhVar = this.mLogAdapter;
        if (ddhVar != null) {
            ddhVar.a("AVSDK", "player onCompletion");
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar != null && cVar.m) {
            ozm.h().c();
        }
        this.mMediaPlayerRecycler.e = 5;
        this.mTargetState = 5;
        clearKeepScreenOn();
        IMediaPlayer.OnCompletionListener onCompletionListener = this.mOnCompletionListener;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(this.mMediaPlayerRecycler.f);
        }
        List<IMediaPlayer.OnCompletionListener> list = this.mOnCompletionListeners;
        if (list == null) {
            return;
        }
        for (IMediaPlayer.OnCompletionListener onCompletionListener2 : list) {
            if (onCompletionListener2 != null) {
                onCompletionListener2.onCompletion(this.mMediaPlayerRecycler.f);
            }
        }
    }

    public void OnSeekCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe46e75a", new Object[]{this});
            return;
        }
        if (this.mOnSeekCompletionListener != null) {
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", mOnSeekCompletionListener OnSeekCompletion");
            this.mOnSeekCompletionListener.onSeekComplete(this.mMediaPlayerRecycler.f);
        }
        if (this.mOnSeekCompletionListeners == null) {
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", mOnSeekCompletionListenerOnSeekCompletion");
        for (IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener : this.mOnSeekCompletionListeners) {
            if (onSeekCompletionListener != null) {
                onSeekCompletionListener.onSeekComplete(this.mMediaPlayerRecycler.f);
            }
        }
    }

    public TaoLiveVideoView(Context context) {
        this(context, null);
    }

    public TaoLiveVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TaoLiveVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.cdn_ip = "";
        this.mIsConnected = true;
        this.mPlayUrl = "";
        this.mTargetState = 0;
        this.mSurfaceHolder = null;
        this.bufferLoadCountTimeInterval = 15000;
        this.bufferLoadCountLimit = 3;
        this.lastBufferLoadTime = 0L;
        this.bufferLoadFrequencyCounter = 0;
        this.timeOutUs = 10000000L;
        this.mDisableFixPauseOnAcctivity = false;
        this.mDisableFixPauseOnPrepared = false;
        this.mRequestLongFocus = false;
        this.mRequestFocusCount = 0;
        this.mReleaseFocusCount = 0;
        this.mIsMuteWhenStart = true;
        this.bmuted = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
        this.bLooping = false;
        this.bFirstFrameRendered = false;
        this.bPlayerTypeChanged = false;
        this.bAudioOnly = false;
        this.mEnableVideoDetect = false;
        this.mBlockTouchEvent = false;
        this.mStartTime = 0L;
        this.mEnableAutoPlayForBackground = true;
        this.mEnableAutoAfterDisconnect = true;
        this.mSetDefaultPlayToken = false;
        this.mShouldInitBeforeStart = true;
        this.mEnableSurfaceView = false;
        this.mEnableOpenGLCrop = false;
        this.mUseShortAudioFocus = false;
        this.mControlScreenByParams = false;
        this.mSizeChangedListener = new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i2, int i3, int i4, int i5) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d2aeaa0", new Object[]{this, iMediaPlayer, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
                    return;
                }
                if (TaoLiveVideoView.this.mLogAdapter != null) {
                    ddh ddhVar = TaoLiveVideoView.this.mLogAdapter;
                    ddhVar.a("AVSDK", "player onVideoSizeChanged, width: " + i2 + " height: " + i3 + " sarNum: " + i4 + " sarDen: " + i5);
                }
                TaoLiveVideoView.access$000(TaoLiveVideoView.this, i2, i3, i4, i5);
            }
        };
        this.mCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                } else {
                    TaoLiveVideoView.this.onCompletion();
                }
            }
        };
        this.mSeekCompletionListener = new IMediaPlayer.OnSeekCompletionListener() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
                    return;
                }
                AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", OnSeekCompletion");
                TaoLiveVideoView.this.OnSeekCompletion();
            }
        };
        this.mInfoListener = new IMediaPlayer.OnInfoListener() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0256  */
            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onInfo(tv.danmaku.ijk.media.player.IMediaPlayer r19, long r20, long r22, long r24, java.lang.Object r26) {
                /*
                    Method dump skipped, instructions count: 792
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.AnonymousClass7.onInfo(tv.danmaku.ijk.media.player.IMediaPlayer, long, long, long, java.lang.Object):boolean");
            }
        };
        this.mErrorListener = new IMediaPlayer.OnErrorListener() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i3) {
                IpChange ipChange = $ipChange;
                boolean z = false;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i2), new Integer(i3)})).booleanValue();
                }
                AVSDKLog.e("AVSDK", "TaoLiveVideoView " + iMediaPlayer + " " + ("player onError, framework_err: " + i2 + ", impl_err: " + i3));
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).e = -1;
                TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
                taoLiveVideoView.mTargetState = -1;
                TaoLiveVideoView.access$500(taoLiveVideoView);
                if (TaoLiveVideoView.this.mConfig != null && TaoLiveVideoView.this.mConfig.m) {
                    ozm.h().c();
                }
                if ((TaoLiveVideoView.access$600(TaoLiveVideoView.this) != null && TaoLiveVideoView.access$600(TaoLiveVideoView.this).onError(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f, i2, i3)) || TaoLiveVideoView.access$700(TaoLiveVideoView.this) == null) {
                    return true;
                }
                for (IMediaPlayer.OnErrorListener onErrorListener : TaoLiveVideoView.access$700(TaoLiveVideoView.this)) {
                    z = onErrorListener.onError(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f, i2, i3);
                }
                return z;
            }
        };
        this.mBufferingUpdateListener = new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f723554e", new Object[]{this, iMediaPlayer, new Integer(i2)});
                    return;
                }
                TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
                taoLiveVideoView.mCurrentBufferPercentage = i2;
                if (TaoLiveVideoView.access$800(taoLiveVideoView) == null) {
                    return;
                }
                for (IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener : TaoLiveVideoView.access$800(TaoLiveVideoView.this)) {
                    if (onBufferingUpdateListener != null) {
                        onBufferingUpdateListener.onBufferingUpdate(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f, i2);
                    }
                }
            }
        };
        this.mPreparedListener = new IMediaPlayer.OnPreparedListener() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
                    return;
                }
                if (TaoLiveVideoView.this.mLogAdapter != null) {
                    TaoLiveVideoView.this.mLogAdapter.a("AVSDK", "player onPrepared");
                }
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).e = 2;
                if (TaoLiveVideoView.access$900(TaoLiveVideoView.this) != null) {
                    TaoLiveVideoView.access$900(TaoLiveVideoView.this).onPrepared(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f);
                }
                if (TaoLiveVideoView.access$1000(TaoLiveVideoView.this) != null) {
                    for (IMediaPlayer.OnPreparedListener onPreparedListener : TaoLiveVideoView.access$1000(TaoLiveVideoView.this)) {
                        if (onPreparedListener != null) {
                            onPreparedListener.onPrepared(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f);
                        }
                    }
                }
                int i2 = TaoLiveVideoView.this.mSeekWhenPrepared;
                if (i2 != 0) {
                    TaoLiveVideoView.this.seekTo(i2);
                }
                if (TaoLiveVideoView.this.mTargetState == 3) {
                    TaoLiveVideoView.this.start();
                } else if (!TaoLiveVideoView.access$1100(TaoLiveVideoView.this) && TaoLiveVideoView.this.mTargetState == 4 && TaoLiveVideoView.access$400(TaoLiveVideoView.this).f != null) {
                    TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.pause();
                    if (TaoLiveVideoView.access$1200(TaoLiveVideoView.this) != null) {
                        for (a aVar : TaoLiveVideoView.access$1200(TaoLiveVideoView.this)) {
                            if (aVar != null) {
                                aVar.onPause(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f);
                            }
                        }
                    }
                    if (TaoLiveVideoView.this.mLogAdapter != null) {
                        TaoLiveVideoView.this.mLogAdapter.a("AVSDK", "player pause in onPrepared");
                    }
                    if (TaoLiveVideoView.this.mConfig == null || !TaoLiveVideoView.this.mConfig.m) {
                        return;
                    }
                    ozm.h().c();
                }
            }
        };
        this.mNextSHCallback = new a.InterfaceC0888a() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.a.InterfaceC0888a
            public void a(a.b bVar, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("53b4ff1e", new Object[]{this, bVar, new Integer(i2), new Integer(i3), new Integer(i4)});
                }
            }

            @Override // com.taobao.taobaoavsdk.widget.media.a.InterfaceC0888a
            public void a(a.b bVar, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("65cc0485", new Object[]{this, bVar, new Integer(i2), new Integer(i3)});
                    return;
                }
                TaoLiveVideoView.access$2202(TaoLiveVideoView.this, bVar);
                TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
                TaoLiveVideoView.access$2300(taoLiveVideoView, TaoLiveVideoView.access$400(taoLiveVideoView).g, TaoLiveVideoView.access$2200(TaoLiveVideoView.this));
            }

            @Override // com.taobao.taobaoavsdk.widget.media.a.InterfaceC0888a
            public void a(a.b bVar, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4d9b760f", new Object[]{this, bVar, new Boolean(z)});
                } else {
                    TaoLiveVideoView.access$2202(TaoLiveVideoView.this, null);
                }
            }
        };
        this.mSHCallback = new a.InterfaceC0888a() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.a.InterfaceC0888a
            public void a(a.b bVar, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                boolean z = true;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("53b4ff1e", new Object[]{this, bVar, new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                AVSDKLog.e("AVSDK", this + " onSurfaceChanged holder=" + bVar + ", format=" + i2 + ", width=" + i3 + ", height=" + i4 + ", TaoLiveVideoView.this=" + TaoLiveVideoView.this);
                if (bVar.a() != TaoLiveVideoView.this.mRenderView) {
                    if (TaoLiveVideoView.this.mLogAdapter == null) {
                        return;
                    }
                    TaoLiveVideoView.this.mLogAdapter.b("AVSDK", "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
                taoLiveVideoView.mSurfaceHolder = bVar;
                if (TaoLiveVideoView.access$400(taoLiveVideoView) == null || TaoLiveVideoView.access$400(TaoLiveVideoView.this).f == null) {
                    return;
                }
                TaoLiveVideoView taoLiveVideoView2 = TaoLiveVideoView.this;
                TaoLiveVideoView.access$2300(taoLiveVideoView2, TaoLiveVideoView.access$400(taoLiveVideoView2).f, bVar);
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.setSurfaceSize(i3, i4);
                if (TaoLiveVideoView.this.mTargetState != 3 || TaoLiveVideoView.access$400(TaoLiveVideoView.this).e == 3) {
                    z = false;
                }
                if (!z) {
                    return;
                }
                if (TaoLiveVideoView.this.mSeekWhenPrepared != 0) {
                    TaoLiveVideoView taoLiveVideoView3 = TaoLiveVideoView.this;
                    taoLiveVideoView3.seekTo(taoLiveVideoView3.mSeekWhenPrepared);
                }
                TaoLiveVideoView.this.start();
            }

            @Override // com.taobao.taobaoavsdk.widget.media.a.InterfaceC0888a
            public void a(a.b bVar, int i2, int i3) {
                IpChange ipChange = $ipChange;
                boolean z = true;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("65cc0485", new Object[]{this, bVar, new Integer(i2), new Integer(i3)});
                    return;
                }
                AVSDKLog.e("AVSDK", this + " onSurfaceCreated holder=" + bVar + ", width=" + i2 + ", height=" + i3 + ", TaoLiveVideoView.this=" + TaoLiveVideoView.this);
                AVSDKLog.e("AVSDK", this + " onSurfaceCreated holder=" + bVar + ", width=" + i2 + ", height=" + i3 + ", TaoLiveVideoView.this=" + TaoLiveVideoView.this);
                if (bVar.a() != TaoLiveVideoView.this.mRenderView) {
                    if (TaoLiveVideoView.this.mLogAdapter == null) {
                        return;
                    }
                    TaoLiveVideoView.this.mLogAdapter.b("AVSDK", "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
                taoLiveVideoView.mSurfaceHolder = bVar;
                if (TaoLiveVideoView.access$400(taoLiveVideoView) != null && TaoLiveVideoView.access$400(TaoLiveVideoView.this).f != null) {
                    TaoLiveVideoView taoLiveVideoView2 = TaoLiveVideoView.this;
                    TaoLiveVideoView.access$2300(taoLiveVideoView2, TaoLiveVideoView.access$400(taoLiveVideoView2).f, bVar);
                    if (TaoLiveVideoView.this.mTargetState != 3 || TaoLiveVideoView.access$400(TaoLiveVideoView.this).e == 3) {
                        z = false;
                    }
                    if (z) {
                        if (TaoLiveVideoView.this.mSeekWhenPrepared != 0) {
                            TaoLiveVideoView taoLiveVideoView3 = TaoLiveVideoView.this;
                            taoLiveVideoView3.seekTo(taoLiveVideoView3.mSeekWhenPrepared);
                        }
                        TaoLiveVideoView.this.start();
                    }
                }
                if (TaoLiveVideoView.access$2400(TaoLiveVideoView.this) == null) {
                    return;
                }
                TaoLiveVideoView.access$2400(TaoLiveVideoView.this).a();
            }

            @Override // com.taobao.taobaoavsdk.widget.media.a.InterfaceC0888a
            public void a(a.b bVar, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4d9b760f", new Object[]{this, bVar, new Boolean(z)});
                    return;
                }
                AVSDKLog.e("AVSDK", this + " onSurfaceDestroyed holder=" + bVar + ", mTargetState=" + TaoLiveVideoView.this.mTargetState + ", TaoLiveVideoView.this=" + TaoLiveVideoView.this);
                if (bVar.a() != TaoLiveVideoView.this.mRenderView) {
                    if (TaoLiveVideoView.this.mLogAdapter == null) {
                        return;
                    }
                    TaoLiveVideoView.this.mLogAdapter.b("AVSDK", "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
                TaoLiveVideoView.access$2500(taoLiveVideoView, taoLiveVideoView.mSurfaceHolder);
                TaoLiveVideoView taoLiveVideoView2 = TaoLiveVideoView.this;
                taoLiveVideoView2.mSurfaceHolder = null;
                if (z && TaoLiveVideoView.access$400(taoLiveVideoView2) != null && TaoLiveVideoView.access$400(TaoLiveVideoView.this).f != null && TaoLiveVideoView.this.mRenderView != null && (TaoLiveVideoView.this.mRenderView instanceof SurfaceRenderView)) {
                    AVSDKLog.e("AVSDK", this + " onSurfaceDestroyed setSurface to null");
                    TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.setSurface(null);
                }
                if (TaoLiveVideoView.access$2400(TaoLiveVideoView.this) == null) {
                    return;
                }
                TaoLiveVideoView.access$2400(TaoLiveVideoView.this).b();
            }
        };
        initVideoView(context);
    }

    public void setCustomLibLoader(ddd dddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf428fd8", new Object[]{this, dddVar});
        } else {
            this.mCustomLibLoader = dddVar;
        }
    }

    public void initConfig(com.taobao.taobaoavsdk.widget.media.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a439f9b0", new Object[]{this, cVar});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", initConfig");
        if ((this.mConfig != null || cVar == null) && !this.mShouldInitBeforeStart) {
            return;
        }
        this.mConfig = cVar;
        if (StringUtils.isEmpty(this.mUsingInterface)) {
            this.mConfig.as = COMPONENT_NAME;
        } else {
            com.taobao.taobaoavsdk.widget.media.c cVar2 = this.mConfig;
            cVar2.as = this.mUsingInterface + "." + COMPONENT_NAME;
        }
        this.mConfig.bi = new e();
        com.taobao.taobaoavsdk.widget.media.c cVar3 = this.mConfig;
        cVar3.P = false;
        cVar3.ar = oyu.f();
        setBusinessId(this.mConfig.x);
        _setRenderType(this.mConfig.c, this.mConfig.j, this.mConfig.k, this.mConfig.l);
        setCoverImg(this.mConfig.i);
        if (StringUtils.isEmpty(this.mConfig.q)) {
            this.mConfig.q = "tblive";
        }
        if (StringUtils.isEmpty(this.mConfig.p)) {
            this.mConfig.p = com.taobao.taobaoavsdk.util.b.c();
        }
        if (StringUtils.isEmpty(this.mConfig.t) && ("TBLive".equals(this.mConfig.x) || (this.mSetDefaultPlayToken && "HomePage".equals(this.mConfig.x)))) {
            this.mConfig.t = com.taobao.taobaoavsdk.util.b.c();
        }
        if ("TBLive".equals(this.mConfig.x)) {
            this.mConfig.m = false;
        }
        if (this.mConfig.m) {
            this.mMediaPlayerRecycler = ozm.h().b(this.mConfig.p, this);
        } else {
            this.mMediaPlayerRecycler = new ozn(this.mConfig.p, this);
        }
        if (this.mMediaPlayerRecycler.f != null) {
            this.mMediaPlayerRecycler.f.registerOnPreparedListener(this.mPreparedListener);
            this.mMediaPlayerRecycler.f.registerOnVideoSizeChangedListener(this.mSizeChangedListener);
            this.mMediaPlayerRecycler.f.registerOnCompletionListener(this.mCompletionListener);
            this.mMediaPlayerRecycler.f.registerOnErrorListener(this.mErrorListener);
            this.mMediaPlayerRecycler.f.registerOnInfoListener(this.mInfoListener);
            this.mMediaPlayerRecycler.f.registerOnBufferingUpdateListener(this.mBufferingUpdateListener);
            this.mMediaPlayerRecycler.f.registerOnSeekCompleteListener(this.mSeekCompletionListener);
        }
        this.mShouldInitBeforeStart = false;
    }

    public com.taobao.taobaoavsdk.widget.media.c getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taobaoavsdk.widget.media.c) ipChange.ipc$dispatch("18cabf8", new Object[]{this}) : this.mConfig;
    }

    public ozn getMediaPlayerRecycler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozn) ipChange.ipc$dispatch("e56bce", new Object[]{this});
        }
        if (this.mConfig.m) {
            return null;
        }
        return this.mMediaPlayerRecycler;
    }

    public void setBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
        } else if (this.mConfig == null) {
        } else {
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setBusinessId businessId=" + str);
            com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
            cVar.x = str;
            cVar.aR = false;
            if (!"HomePage".equals(str)) {
                return;
            }
            this.mConfig.y = "recmd";
            boolean a2 = com.taobao.taobaoavsdk.util.e.a(this.mContext).a(this.mContext, this.mConfig.y);
            if (!this.mEnableSurfaceView || !a2) {
                return;
            }
            com.taobao.taobaoavsdk.widget.media.c cVar2 = this.mConfig;
            cVar2.aR = true;
            cVar2.aU = true;
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null) {
            return;
        }
        cVar.y = str;
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_LIVE_ROOM_BIZ_CODE, "LiveRoom");
        if (!StringUtils.isEmpty(config) && config.equals(str)) {
            this.mConfig.aK = true;
        } else {
            this.mConfig.aK = false;
        }
    }

    public void blockTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70e7d25", new Object[]{this, new Boolean(z)});
        } else {
            this.mBlockTouchEvent = z;
        }
    }

    public void enableVideoClickDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d143b09a", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableVideoDetect = z;
        }
    }

    public void setCdnIP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217763e3", new Object[]{this, str});
            return;
        }
        this.cdn_ip = str.replaceAll(" ", "");
        AVSDKLog.d("AVSDK", "CDN IP: " + this.cdn_ip);
    }

    public void setScenarioType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557a670", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null) {
            return;
        }
        cVar.b = i;
    }

    public void setPlayerType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e501bf", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null || cVar.f21365a == i) {
            return;
        }
        this.mConfig.f21365a = i;
        this.bPlayerTypeChanged = true;
    }

    public void setFeedId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3518aac", new Object[]{this, str});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null) {
            return;
        }
        cVar.B = str;
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar == null || oznVar.f == null) {
            return;
        }
        if (((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig() != null) {
            ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig().B = str;
        }
        if (((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getCloneConfig() == null) {
            return;
        }
        ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getCloneConfig().B = str;
    }

    public void setMediaSourceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b423788", new Object[]{this, str});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null) {
            return;
        }
        cVar.F = str;
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar == null || oznVar.f == null) {
            return;
        }
        if (((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig() != null) {
            ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig().F = str;
        }
        if (((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getCloneConfig() == null) {
            return;
        }
        ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getCloneConfig().F = str;
    }

    public void setAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null) {
            return;
        }
        cVar.C = str;
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar == null || oznVar.f == null) {
            return;
        }
        if (((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig() != null) {
            ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig().C = str;
        }
        if (((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig() == null) {
            return;
        }
        ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig().C = str;
    }

    public void setVideoDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bc14fd", new Object[]{this, str});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null) {
            return;
        }
        cVar.D = str;
    }

    public void setConfigAdapter(ddc ddcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2715091f", new Object[]{this, ddcVar});
        } else {
            this.mConfigAdapter = ddcVar;
        }
    }

    public void setLogAdapter(ddh ddhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e4f8fc", new Object[]{this, ddhVar});
        } else {
            this.mLogAdapter = ddhVar;
        }
    }

    public com.taobao.taobaoavsdk.widget.media.a getRenderView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taobaoavsdk.widget.media.a) ipChange.ipc$dispatch("5eff0393", new Object[]{this}) : this.mRenderView;
    }

    public void setPropertyLong(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5ff41b", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setPropertyLong: " + i + ", " + j);
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar != null && oznVar.f != null) {
            if (!(this.mMediaPlayerRecycler.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            ((TaobaoMediaPlayer) this.mMediaPlayerRecycler.f)._setPropertyLong(i, j);
            return;
        }
        if (this.mPropertyLong == null) {
            this.mPropertyLong = new SparseArray<>();
        }
        this.mPropertyLong.put(i, Long.valueOf(j));
    }

    public void setPropertyFloat(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c3a069", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setPropertyFloat: " + i + ", " + f);
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar != null && oznVar.f != null) {
            if (!(this.mMediaPlayerRecycler.f instanceof TaobaoMediaPlayer)) {
                return;
            }
            ((TaobaoMediaPlayer) this.mMediaPlayerRecycler.f)._setPropertyFloat(i, f);
            return;
        }
        if (this.mPropertyFloat == null) {
            this.mPropertyFloat = new SparseArray<>();
        }
        this.mPropertyFloat.put(i, Float.valueOf(f));
    }

    private void initVideoView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92adac91", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mVideoSarNum = 0;
        this.mVideoSarDen = 0;
        this.mTargetState = 0;
        setBackgroundColor(context.getResources().getColor(17170444));
        this.mDisableFixPauseOnAcctivity = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_FIX_PAUSE_FOR_ACTIVITY, "false"));
        this.mDisableFixPauseOnPrepared = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_FIX_PAUSE_ON_PREPARED, "false"));
        this.mSetDefaultPlayToken = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_SUPPORT_SET_DEFAULT_PLAY_TOKEN, "true"));
        this.mEnableGlobalKeepScreenOn = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enGlobalKeepScreenOn", "true"));
        this.mEnableSurfaceView = com.taobao.taobaoavsdk.util.e.a(this.mContext).e();
    }

    private void setCoverImg(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3617d0e", new Object[]{this, new Integer(i)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setCoverImg: " + i + ", playState: " + isInPlaybackState());
        if (i == 0 || isInPlaybackState()) {
            return;
        }
        if (this.mCoverImgView == null) {
            this.mCoverImgView = new ImageView(this.mContext);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            addView(this.mCoverImgView, layoutParams);
        }
        this.mCoverImgView.setVisibility(0);
        this.mCoverImgView.setImageResource(i);
    }

    public void setCoverImg(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1014bb", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setCoverImg: " + drawable + ", " + z);
        if (drawable == null || isInPlaybackState()) {
            return;
        }
        if (this.mCoverImgView == null) {
            this.mCoverImgView = new ImageView(this.mContext);
            addView(this.mCoverImgView);
        }
        if (z) {
            this.mCoverImgView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.mCoverImgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.mCoverImgView.setLayoutParams(layoutParams);
        }
        this.mCoverImgView.setVisibility(0);
        this.mCoverImgView.setImageDrawable(drawable);
    }

    public void setAspectRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8dd2b", new Object[]{this, new Integer(i)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setAspectRatio: " + i);
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null) {
            return;
        }
        cVar.d = i;
        com.taobao.taobaoavsdk.widget.media.a aVar = this.mRenderView;
        if (aVar == null) {
            return;
        }
        aVar.setAspectRatio(i);
        setAspectRatioToNative(i);
    }

    private void setAspectRatioToNative(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31af42d9", new Object[]{this, new Integer(i)});
            return;
        }
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar == null || oznVar.f == null || !(this.mMediaPlayerRecycler.f instanceof TaobaoMediaPlayer)) {
            return;
        }
        ((TaobaoMediaPlayer) this.mMediaPlayerRecycler.f)._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_EXTEND_VIDEO_ASPECT_RATIO, i);
    }

    public void setRenderType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a016aa", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null) {
            return;
        }
        setRenderType(i, cVar.j, this.mConfig.k, this.mConfig.l);
    }

    public void setFirstRenderTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9951f98", new Object[]{this});
        } else {
            this.mStartTime = System.currentTimeMillis();
        }
    }

    public void setRenderType(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146b8fb9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null) {
            return;
        }
        if (cVar.c == i && this.mConfig.j == i2 && this.mConfig.k == i3 && this.mConfig.l == i4) {
            return;
        }
        _setRenderType(i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.taobao.taobaoavsdk.widget.media.TextureRenderView] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.taobao.taobaoavsdk.widget.media.TextureRenderView] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.taobao.taobaoavsdk.widget.media.SurfaceRenderView] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.taobao.taobaoavsdk.widget.media.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.taobao.taobaoavsdk.widget.media.SurfaceRenderView] */
    private void _setRenderType(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0ba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ?? r6 = 0;
        if (this.mRenderView != null) {
            ozn oznVar = this.mMediaPlayerRecycler;
            if (oznVar != null && oznVar.f != null) {
                AVSDKLog.e("AVSDK", this + " _setRenderType setSurface to null");
                this.mMediaPlayerRecycler.f.setSurface(null);
            }
            removeView(this.mRenderView.getView());
            this.mRenderView.removeRenderCallback(this.mSHCallback);
            this.mRenderView = null;
        }
        if (this.mConfig.aR && this.mEnableSurfaceView) {
            r6 = new SurfaceRenderView(getContext());
            r6.setUseCrop(false);
        } else if (i == 1) {
            r6 = new SurfaceRenderView(getContext());
        } else if (i == 2) {
            r6 = new TextureRenderView(getContext());
        } else if (i == 3) {
            r6 = new TextureRenderView(getContext());
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", _setRenderType type=" + i + "， renderView=" + r6);
        if (r6 == 0) {
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        cVar.c = i;
        cVar.j = i2;
        cVar.k = i3;
        cVar.l = i4;
        this.mRenderView = r6;
        r6.setAspectRatio(cVar.d);
        setAspectRatioToNative(this.mConfig.d);
        int i7 = this.mVideoWidth;
        if (i7 > 0 && (i6 = this.mVideoHeight) > 0) {
            r6.setVideoSize(i7, i6);
        }
        int i8 = this.mVideoSarNum;
        if (i8 > 0 && (i5 = this.mVideoSarDen) > 0) {
            r6.setVideoSampleAspectRatio(i8, i5);
        }
        View view = this.mRenderView.getView();
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view);
        this.mRenderUIView = view;
        this.mRenderView.addRenderCallback(this.mSHCallback);
        this.mRenderView.setVideoRotation(this.mVideoRotationDegree);
    }

    private void setNextRenderView() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f12a37", new Object[]{this});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null) {
            return;
        }
        if (cVar.c == 1) {
            this.mNextRenderView = new SurfaceRenderView(getContext());
        } else if (this.mConfig.c == 2) {
            this.mNextRenderView = new TextureRenderView(getContext());
        }
        this.mNextRenderView.setAspectRatio(this.mConfig.d);
        int i3 = this.mVideoWidth;
        if (i3 > 0 && (i2 = this.mVideoHeight) > 0) {
            this.mNextRenderView.setVideoSize(i3, i2);
        }
        int i4 = this.mVideoSarNum;
        if (i4 > 0 && (i = this.mVideoSarDen) > 0) {
            this.mNextRenderView.setVideoSampleAspectRatio(i4, i);
        }
        addView(this.mNextRenderView.getView(), 0, new FrameLayout.LayoutParams(-2, -2, 17));
        this.mNextRenderView.addRenderCallback(this.mNextSHCallback);
        this.mNextRenderView.setVideoRotation(this.mVideoRotationDegree);
    }

    public AbstractMediaPlayer initPlayer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbstractMediaPlayer) ipChange.ipc$dispatch("f1ea51f7", new Object[]{this}) : openVideo(this.mPlayUrl, true, false);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", release");
        this.mShouldInitBeforeStart = true;
        this.mReleaseByExtern = true;
        try {
            if (this.mNetworkReceiver != null) {
                this.mContext.unregisterReceiver(this.mNetworkReceiver);
            }
        } catch (Exception unused) {
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar != null && cVar.m) {
            ozm.h().a(this.mConfig.p, this);
        } else {
            release(true);
        }
    }

    private boolean isMainThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue() : Looper.getMainLooper().getThread() == VExecutors.currentThread();
    }

    @Override // tb.ozn.a
    public void release(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88058386", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", release, " + z);
        if (this.mMediaPlayerRecycler == null) {
            return;
        }
        this.mShouldInitBeforeStart = true;
        if (!isMainThread()) {
            AVSDKLog.e("AVSDK", this + " not main thread in release");
        }
        if (z) {
            Runnable runnable = this.mSwitchRunnable;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.mSwitchRunnable = null;
            }
            List<a> list = this.mOnPauseListeners;
            if (list != null) {
                for (a aVar : list) {
                    if (aVar != null) {
                        aVar.onPause(this.mMediaPlayerRecycler.f);
                    }
                }
            }
            this.mSeekWhenPrepared = 0;
            clearKeepScreenOn();
        }
        if (this.mRequestAudioFocus) {
            requestAudioFocus(false);
        }
        unregisterActivityLifecycleCallbacks();
        if (this.mMediaPlayerRecycler.f != null) {
            this.mMediaPlayerRecycler.f.resetListeners();
            try {
                if (this.mMediaPlayerRecycler.f instanceof TaobaoMediaPlayer) {
                    TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this.mMediaPlayerRecycler.f;
                    HashMap hashMap = new HashMap();
                    hashMap.put(MediaConstant.CMD_SET_RECYCEL_REASON, this.mReleaseByExtern ? "1" : "0");
                    String str = MediaConstant.CMD_UPDATE_PLAY_EX;
                    StringBuilder sb = new StringBuilder();
                    sb.append("is_mute_prepare=");
                    sb.append(this.mIsMuteWhenStart ? 1 : 0);
                    sb.append(",request_long_focus=");
                    if (!this.mRequestLongFocus) {
                        i = 0;
                    }
                    sb.append(i);
                    sb.append(",request_focus_count=");
                    sb.append(this.mRequestFocusCount);
                    sb.append(",release_focus_count=");
                    sb.append(this.mReleaseFocusCount);
                    hashMap.put(str, sb.toString());
                    taobaoMediaPlayer.callWithMsg(hashMap);
                    if (this.mConfig.ar) {
                        AVSDKLog.e("AVSDK", this + " release mHandleSurfaceDestroy setSurface to null");
                        this.mMediaPlayerRecycler.f.setSurface(null);
                    }
                    ((TaobaoMediaPlayer) this.mMediaPlayerRecycler.f).setShowViewParant(null);
                    this.mMediaPlayerRecycler.f.releasePrefixInUIThread();
                    if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_CONTROL_USE_COMMON_THREADPOOL, "false"))) {
                        com.taobao.taobaoavsdk.util.a.a().submit(new c());
                    } else {
                        final AbstractMediaPlayer abstractMediaPlayer = this.mMediaPlayerRecycler.f;
                        new Thread(new Runnable() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.11
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                abstractMediaPlayer.stop();
                                abstractMediaPlayer.release();
                            }
                        }, "ReleasePlayerInTaoLive").start();
                    }
                } else {
                    this.mMediaPlayerRecycler.f.release();
                }
            } catch (Throwable unused) {
            }
            ozn oznVar = this.mMediaPlayerRecycler;
            oznVar.f = null;
            oznVar.e = 0;
            if (z) {
                com.taobao.taobaoavsdk.widget.media.a aVar2 = this.mRenderView;
                if (aVar2 != null && (aVar2 instanceof TextureRenderView)) {
                    ((TextureRenderView) aVar2).releaseSurface();
                }
                this.mTargetState = 0;
            }
        }
        if (!z || this.mMediaPlayerRecycler.g == null) {
            return;
        }
        this.mMediaPlayerRecycler.g.resetListeners();
        this.mMediaPlayerRecycler.g.release();
        this.mMediaPlayerRecycler.g = null;
    }

    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar != null && oznVar.f != null) {
            return this.mMediaPlayerRecycler.f.getVideoWidth();
        }
        return 0;
    }

    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar != null && oznVar.f != null) {
            return this.mMediaPlayerRecycler.f.getVideoHeight();
        }
        return 0;
    }

    public void setLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
            return;
        }
        this.bLooping = z;
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar == null || oznVar.f == null) {
            return;
        }
        this.mMediaPlayerRecycler.f.setLooping(z);
    }

    public void setVolume(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef12afe3", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setVolume: " + f + ", " + f2);
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar == null || oznVar.f == null) {
            return;
        }
        this.mMediaPlayerRecycler.f.setVolume(f, f2);
        this.mMediaPlayerRecycler.i = f;
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setMuted: " + z);
        this.bmuted = z;
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar == null || oznVar.f == null) {
            return;
        }
        this.mMediaPlayerRecycler.f.setMuted(z);
    }

    public void setAudioOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29a34cd", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setAudioOnly: " + z);
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null || cVar.b != 0) {
            return;
        }
        this.bAudioOnly = z;
    }

    public void requestAudioFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40594b3c", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", requestAudioFocus: " + z);
        try {
            this.mContext.getSystemService("audio");
            if (z) {
                String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_LONG_AUDIO_FOCUS_SBT, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
                String str = "";
                if (this.mConfig != null) {
                    str = this.mConfig.y;
                }
                if ((!StringUtils.isEmpty(config) && !StringUtils.isEmpty(str) && com.taobao.taobaoavsdk.util.b.b(str, config)) || this.mUseShortAudioFocus) {
                    AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ",requestAudioFocus sbt=" + str + " only request short AudioFocus with mVolume: " + this.mMediaPlayerRecycler.i);
                    ipw.a(this.mContext).a((AudioManager.OnAudioFocusChangeListener) null, 2);
                } else {
                    AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ",requestAudioFocus sbt=" + str + " request long AudioFocus with mVolume: " + this.mMediaPlayerRecycler.i);
                    ipw.a(this.mContext).a((AudioManager.OnAudioFocusChangeListener) null, 1);
                    this.mRequestLongFocus = true;
                }
                this.mRequestFocusCount++;
                this.mRequestAudioFocus = true;
                return;
            }
            ipw.a(this.mContext).a((AudioManager.OnAudioFocusChangeListener) null);
            this.mReleaseFocusCount++;
            this.mRequestAudioFocus = false;
        } catch (Exception e) {
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", RequestAudioFocus error" + e.getMessage());
        }
    }

    public void setTimeout(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835f7de", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            this.timeOutUs = j;
        } else {
            this.timeOutUs = 10000000L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0311 A[Catch: Throwable -> 0x026b, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0339 A[Catch: Throwable -> 0x026b, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0362 A[Catch: Throwable -> 0x026b, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0387 A[Catch: Throwable -> 0x026b, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03fa A[Catch: Throwable -> 0x026b, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0408 A[Catch: Throwable -> 0x026b, TRY_ENTER, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0420 A[Catch: Throwable -> 0x026b, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0428 A[Catch: Throwable -> 0x026b, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x043e A[Catch: Throwable -> 0x026b, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0444 A[Catch: Throwable -> 0x026b, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0453 A[Catch: Throwable -> 0x026b, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x045d A[Catch: Throwable -> 0x026b, TRY_LEAVE, TryCatch #0 {Throwable -> 0x026b, blocks: (B:122:0x025c, B:124:0x0266, B:148:0x02ea, B:150:0x02fc, B:152:0x0302, B:153:0x030d, B:155:0x0311, B:156:0x031c, B:158:0x0339, B:160:0x0365, B:162:0x0369, B:164:0x0371, B:166:0x0379, B:167:0x0383, B:169:0x0387, B:170:0x038d, B:173:0x0392, B:175:0x039a, B:177:0x03ac, B:179:0x03b1, B:181:0x03b8, B:182:0x03bb, B:183:0x03be, B:184:0x03c3, B:187:0x03c8, B:189:0x03d0, B:191:0x03e2, B:193:0x03e7, B:195:0x03ed, B:196:0x03f0, B:197:0x03f3, B:199:0x03fa, B:200:0x03ff, B:203:0x0408, B:205:0x0416, B:207:0x0420, B:208:0x0424, B:210:0x0428, B:211:0x0434, B:213:0x043e, B:214:0x0440, B:216:0x0444, B:217:0x044c, B:219:0x0453, B:221:0x045d, B:159:0x0362, B:133:0x0287, B:135:0x028b, B:137:0x0298, B:138:0x02bd, B:142:0x02c7, B:144:0x02ce, B:145:0x02da, B:147:0x02e0), top: B:243:0x0244 }] */
    /* JADX WARN: Type inference failed for: r1v6, types: [tv.danmaku.ijk.media.player.IMediaPlayer$OnErrorListener] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v15, types: [tv.danmaku.ijk.media.player.IMediaPlayer, tv.danmaku.ijk.media.player.AbstractMediaPlayer] */
    /* JADX WARN: Type inference failed for: r3v2, types: [tv.danmaku.ijk.media.player.IMediaPlayer] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v5, types: [tv.danmaku.ijk.media.player.AbstractMediaPlayer] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tv.danmaku.ijk.media.player.AbstractMediaPlayer openVideo(java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.openVideo(java.lang.String, boolean, boolean):tv.danmaku.ijk.media.player.AbstractMediaPlayer");
    }

    public void prepareAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d411b3bc", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", prepareAsync");
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null || this.mMediaPlayerRecycler == null) {
            return;
        }
        if (cVar.m) {
            if (this.mMediaPlayerRecycler.d) {
                this.mMediaPlayerRecycler = ozm.h().a(this.mMediaPlayerRecycler);
            } else {
                this.mMediaPlayerRecycler = ozm.h().b(this.mConfig.p, this);
            }
        }
        if (this.mMediaPlayerRecycler.f == null) {
            this.mMediaPlayerRecycler.f = initPlayer();
        }
        if (this.mConfig.m && this.mMediaPlayerRecycler.d) {
            this.mMediaPlayerRecycler.d = false;
        }
        if (this.mMediaPlayerRecycler.f != null && this.mMediaPlayerRecycler.e == 0) {
            this.mMediaPlayerRecycler.f.prepareAsync();
            this.mMediaPlayerRecycler.e = 1;
        }
        this.mTargetState = 1;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", start");
        if (this.mConfig == null || this.mMediaPlayerRecycler == null) {
            return;
        }
        boolean a2 = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "enableInitAfterRelease", "true"));
        if (this.mShouldInitBeforeStart && a2) {
            initConfig(this.mConfig);
        }
        if (!this.bmuted && this.mMediaPlayerRecycler.i > 0.0f) {
            this.mIsMuteWhenStart = false;
        }
        this.bAutoPause = false;
        ddh ddhVar = this.mLogAdapter;
        if (ddhVar != null) {
            ddhVar.a("AVSDK", "player start,mMediaPlayer :" + String.valueOf(this.mMediaPlayerRecycler.f));
        }
        if (this.mConfig.m) {
            if (this.mMediaPlayerRecycler.d) {
                this.mMediaPlayerRecycler = ozm.h().a(this.mMediaPlayerRecycler);
            } else {
                this.mMediaPlayerRecycler = ozm.h().b(this.mConfig.p, this);
            }
        }
        if (this.mMediaPlayerRecycler.f == null) {
            ddh ddhVar2 = this.mLogAdapter;
            if (ddhVar2 != null) {
                ddhVar2.a("AVSDK", "player start init");
            }
            this.mMediaPlayerRecycler.f = initPlayer();
        }
        if (this.mConfig.m) {
            if (this.mMediaPlayerRecycler.d) {
                ozn oznVar = this.mMediaPlayerRecycler;
                oznVar.d = false;
                if (oznVar.f != null) {
                    if (this.mMediaPlayerRecycler.c == 4) {
                        seekTo(this.mMediaPlayerRecycler.b);
                    } else if (this.mMediaPlayerRecycler.c == 5) {
                        seekTo(0);
                    } else if (this.mMediaPlayerRecycler.c == 3) {
                        seekTo(this.mMediaPlayerRecycler.b);
                        start();
                    }
                }
            } else if (this.mMediaPlayerRecycler.f != null) {
                changeVideoSize(this.mMediaPlayerRecycler.f.getVideoWidth(), this.mMediaPlayerRecycler.f.getVideoHeight(), this.mMediaPlayerRecycler.f.getVideoSarNum(), this.mMediaPlayerRecycler.f.getVideoSarDen());
            }
        }
        if (isInPlaybackState() && this.mSurfaceHolder != null) {
            ddh ddhVar3 = this.mLogAdapter;
            if (ddhVar3 != null) {
                ddhVar3.a("AVSDK", "player start begin");
            }
            bindSurfaceHolder(this.mMediaPlayerRecycler.f, this.mSurfaceHolder);
            this.mMediaPlayerRecycler.f.start();
            keepScreenOn();
            if (this.mEnableAutoAfterDisconnect) {
                try {
                    if (this.mNetworkReceiver == null) {
                        this.mNetworkReceiver = new NetworkBroadcastReceiver();
                    }
                    this.mContext.registerReceiver(this.mNetworkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                } catch (Exception unused) {
                }
            }
            List<b> list = this.mOnStartListeners;
            if (list != null) {
                for (b bVar : list) {
                    if (bVar != null) {
                        bVar.onStart(this.mMediaPlayerRecycler.f);
                    }
                }
            }
            ddh ddhVar4 = this.mLogAdapter;
            if (ddhVar4 != null) {
                ddhVar4.a("AVSDK", "player start end");
            }
            this.mMediaPlayerRecycler.e = 3;
        }
        this.mTargetState = 3;
    }

    @Deprecated
    public void setOnSeekCompletionListener(IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19263b3", new Object[]{this, onSeekCompletionListener});
        } else {
            this.mOnSeekCompletionListener = onSeekCompletionListener;
        }
    }

    public void registerOnSeekCompletionListener(IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6d7152", new Object[]{this, onSeekCompletionListener});
            return;
        }
        if (this.mOnSeekCompletionListeners == null) {
            this.mOnSeekCompletionListeners = new LinkedList();
        }
        this.mOnSeekCompletionListeners.add(onSeekCompletionListener);
    }

    public void unregisterOnSeekCompletionListener(IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e0e099", new Object[]{this, onSeekCompletionListener});
            return;
        }
        List<IMediaPlayer.OnSeekCompletionListener> list = this.mOnSeekCompletionListeners;
        if (list == null) {
            return;
        }
        list.remove(onSeekCompletionListener);
    }

    @Deprecated
    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6ad421", new Object[]{this, onPreparedListener});
        } else {
            this.mOnPreparedListener = onPreparedListener;
        }
    }

    public void registerOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652e1840", new Object[]{this, onPreparedListener});
            return;
        }
        if (this.mOnPreparedListeners == null) {
            this.mOnPreparedListeners = new LinkedList();
        }
        this.mOnPreparedListeners.add(onPreparedListener);
    }

    public void unregisterOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff10fa07", new Object[]{this, onPreparedListener});
            return;
        }
        List<IMediaPlayer.OnPreparedListener> list = this.mOnPreparedListeners;
        if (list == null) {
            return;
        }
        list.remove(onPreparedListener);
    }

    public void registerOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6b5eca", new Object[]{this, onBufferingUpdateListener});
            return;
        }
        if (this.mOnBufferingUpdateListeners == null) {
            this.mOnBufferingUpdateListeners = new LinkedList();
        }
        this.mOnBufferingUpdateListeners.add(onBufferingUpdateListener);
    }

    public void unregisterOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c01851", new Object[]{this, onBufferingUpdateListener});
            return;
        }
        List<IMediaPlayer.OnBufferingUpdateListener> list = this.mOnBufferingUpdateListeners;
        if (list == null) {
            return;
        }
        list.remove(onBufferingUpdateListener);
    }

    @Deprecated
    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16523e3", new Object[]{this, onCompletionListener});
        } else {
            this.mOnCompletionListener = onCompletionListener;
        }
    }

    public void registerOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9b4082", new Object[]{this, onCompletionListener});
            return;
        }
        if (this.mOnCompletionListeners == null) {
            this.mOnCompletionListeners = new LinkedList();
        }
        this.mOnCompletionListeners.add(onCompletionListener);
    }

    public void unregisterOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b519e6c9", new Object[]{this, onCompletionListener});
            return;
        }
        List<IMediaPlayer.OnCompletionListener> list = this.mOnCompletionListeners;
        if (list == null) {
            return;
        }
        list.remove(onCompletionListener);
    }

    @Deprecated
    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4bf04b", new Object[]{this, onErrorListener});
        } else {
            this.mOnErrorListener = onErrorListener;
        }
    }

    public void registerOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6077aa", new Object[]{this, onErrorListener});
            return;
        }
        if (this.mOnErrorListeners == null) {
            this.mOnErrorListeners = new LinkedList();
        }
        this.mOnErrorListeners.add(onErrorListener);
    }

    public void unregisterOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965fab1", new Object[]{this, onErrorListener});
            return;
        }
        List<IMediaPlayer.OnErrorListener> list = this.mOnErrorListeners;
        if (list == null) {
            return;
        }
        list.remove(onErrorListener);
    }

    @Deprecated
    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30795bf", new Object[]{this, onInfoListener});
        } else {
            this.mOnInfoListener = onInfoListener;
        }
    }

    public void registerOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0468de", new Object[]{this, onInfoListener});
            return;
        }
        if (this.mOnInfoListeners == null) {
            this.mOnInfoListeners = new LinkedList();
        }
        this.mOnInfoListeners.add(onInfoListener);
    }

    public void unregisterOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cd01a5", new Object[]{this, onInfoListener});
            return;
        }
        List<IMediaPlayer.OnInfoListener> list = this.mOnInfoListeners;
        if (list == null) {
            return;
        }
        list.remove(onInfoListener);
    }

    public void registerOnStartListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9e1aef", new Object[]{this, bVar});
            return;
        }
        if (this.mOnStartListeners == null) {
            this.mOnStartListeners = new LinkedList();
        }
        this.mOnStartListeners.add(bVar);
    }

    public void unregisterOnStartListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce66b3b6", new Object[]{this, bVar});
            return;
        }
        List<b> list = this.mOnStartListeners;
        if (list == null) {
            return;
        }
        list.remove(bVar);
    }

    public void registerOnPauseListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3717e24", new Object[]{this, aVar});
            return;
        }
        if (this.mOnPauseListeners == null) {
            this.mOnPauseListeners = new LinkedList();
        }
        this.mOnPauseListeners.add(aVar);
    }

    public void unregisterOnPauseListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23a16eb", new Object[]{this, aVar});
            return;
        }
        List<a> list = this.mOnPauseListeners;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    public void registerOnVideoClickListener(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae58360", new Object[]{this, onVideoClickListener});
            return;
        }
        if (this.mOnVideoClickListeners == null) {
            this.mOnVideoClickListeners = new LinkedList();
        }
        this.mOnVideoClickListeners.add(onVideoClickListener);
    }

    public void unregisterOnVideoClickListener(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16429a7", new Object[]{this, onVideoClickListener});
            return;
        }
        List<IMediaPlayer.OnVideoClickListener> list = this.mOnVideoClickListeners;
        if (list == null) {
            return;
        }
        list.remove(onVideoClickListener);
    }

    private void notifyOnVideoClick(int i, int i2, int i3, int i4, int i5, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6309c8d1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), str});
            return;
        }
        List<IMediaPlayer.OnVideoClickListener> list = this.mOnVideoClickListeners;
        if (list == null) {
            return;
        }
        for (IMediaPlayer.OnVideoClickListener onVideoClickListener : list) {
            onVideoClickListener.onClick(i, i2, i3, i4, i5, str);
        }
    }

    private void setVideoPath(String str, AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e78ec0", new Object[]{this, str, abstractMediaPlayer});
        } else if (str == null) {
        } else {
            this.mPlayUrl = str;
            if (this.mPlayUrl.startsWith(ado.URL_SEPARATOR)) {
                this.mPlayUrl = "http:" + this.mPlayUrl;
            }
            ozn oznVar = this.mMediaPlayerRecycler;
            if (oznVar == null || abstractMediaPlayer == null || oznVar.e != 0) {
                return;
            }
            String str2 = this.mPlayUrl;
            if (this.bAudioOnly) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("onlyaudio=1");
                str2 = com.taobao.taobaoavsdk.util.b.a(this.mPlayUrl, sb);
            }
            try {
                abstractMediaPlayer.setDataSource(str2);
            } catch (Exception unused) {
                this.mMediaPlayerRecycler.e = -1;
                this.mTargetState = -1;
                this.mErrorListener.onError(abstractMediaPlayer, 1, 0);
            }
        }
    }

    public void setVideoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f405b10f", new Object[]{this, str});
            return;
        }
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar == null) {
            return;
        }
        setVideoPath(str, oznVar.f);
    }

    private void pause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5ae2f7", new Object[]{this, new Boolean(z)});
        } else if (this.mMediaPlayerRecycler != null && this.mTargetState != 4) {
            if (!z) {
                this.bAutoPause = true;
            }
            if (this.mMediaPlayerRecycler.f != null && isPlaying()) {
                ddh ddhVar = this.mLogAdapter;
                if (ddhVar != null) {
                    ddhVar.a("AVSDK", "player pause begin");
                }
                try {
                    if (this.mNetworkReceiver != null) {
                        this.mContext.unregisterReceiver(this.mNetworkReceiver);
                    }
                } catch (Exception unused) {
                }
                this.mMediaPlayerRecycler.f.pause();
                clearKeepScreenOn();
                List<a> list = this.mOnPauseListeners;
                if (list != null) {
                    for (a aVar : list) {
                        if (aVar != null) {
                            aVar.onPause(this.mMediaPlayerRecycler.f);
                        }
                    }
                }
                ddh ddhVar2 = this.mLogAdapter;
                if (ddhVar2 != null) {
                    ddhVar2.a("AVSDK", "player pause end");
                }
                com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
                if (cVar != null && cVar.m) {
                    ozm.h().c();
                }
                this.mMediaPlayerRecycler.e = 4;
            }
            this.mTargetState = 4;
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", pause");
        this.bAutoPause = false;
        pause(true);
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        if (!isInPlaybackState()) {
            return -1;
        }
        return (int) this.mMediaPlayerRecycler.f.getDuration();
    }

    @Override // tb.ozn.a
    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        if (!isInPlaybackState()) {
            return 0;
        }
        return (int) this.mMediaPlayerRecycler.f.getCurrentPosition();
    }

    public float getVideoRenderPts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f9486ab", new Object[]{this})).floatValue();
        }
        if (!isInPlaybackState()) {
            return 0.0f;
        }
        return this.mMediaPlayerRecycler.f.getVideoRenderPts();
    }

    public int getCurrentState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f537a88", new Object[]{this})).intValue();
        }
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar == null) {
            return 0;
        }
        return oznVar.e;
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", seekTo: " + i);
        if (isInPlaybackState()) {
            ddh ddhVar = this.mLogAdapter;
            if (ddhVar != null) {
                ddhVar.a("AVSDK", "player seekTo begin: " + i);
            }
            this.mMediaPlayerRecycler.f.seekTo(i);
            ddh ddhVar2 = this.mLogAdapter;
            if (ddhVar2 != null) {
                ddhVar2.a("AVSDK", "player seekTo end: " + i);
            }
            this.mSeekWhenPrepared = 0;
            return;
        }
        this.mSeekWhenPrepared = i;
    }

    public void seekToPause(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8536d9", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", seekTo: " + i + ",pause is" + z + ", ignoreInPauseState is " + z2);
        if (isInPlaybackState()) {
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", Inner seekTo: " + i);
            this.mMediaPlayerRecycler.f.seekTo((long) i, z, z2);
            ddh ddhVar = this.mLogAdapter;
            if (ddhVar != null) {
                ddhVar.a("AVSDK", "player seekTo end: " + i);
            }
            this.mSeekWhenPrepared = 0;
            return;
        }
        this.mSeekWhenPrepared = i;
    }

    @Override // tb.ozn.a
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue() : isInPlaybackState() && this.mMediaPlayerRecycler.f.isPlaying();
    }

    @Override // tb.ozn.a
    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        Rect rect = new Rect();
        View view = this.mRenderUIView;
        if (view == null) {
            return false;
        }
        return view.getVisibility() == 0 || this.mRenderUIView.getGlobalVisibleRect(rect);
    }

    public int getBufferPercentage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4a46ea", new Object[]{this})).intValue();
        }
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar != null && oznVar.f != null) {
            return this.mCurrentBufferPercentage;
        }
        return 0;
    }

    public void switchVideoPathSyncFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84509897", new Object[]{this, str});
        } else {
            switchPathError(str, -748);
        }
    }

    private void setH265Hardware(com.taobao.taobaoavsdk.widget.media.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b72fef", new Object[]{this, cVar});
        } else if (cVar.g == 1) {
        } else {
            if (Build.VERSION.SDK_INT >= 23 && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(cVar.q, "h265EnableHardware", "true"))) {
                z = true;
            }
            if (!z || !com.taobao.taobaoavsdk.util.b.b(com.taobao.taobaoavsdk.util.b.a(), MediaAdapteManager.mConfigAdapter.getConfig(cVar.q, "h265HardwareDecodeWhiteList2", "")) || com.taobao.taobaoavsdk.util.b.b(Build.MODEL, MediaAdapteManager.mConfigAdapter.getConfig(cVar.q, "h265HardwareDecodeBlackList2", ""))) {
                return;
            }
            cVar.g = 1;
        }
    }

    private void setH264Hardware(com.taobao.taobaoavsdk.widget.media.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbde9590", new Object[]{this, cVar});
        } else if (cVar.f == 1) {
        } else {
            if (Build.VERSION.SDK_INT >= 23 && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(cVar.q, "h264EnableHardware", "true"))) {
                z = true;
            }
            if (!z || !com.taobao.taobaoavsdk.util.b.b(com.taobao.taobaoavsdk.util.b.a(), MediaAdapteManager.mConfigAdapter.getConfig(cVar.q, "h264HardwareDecodeWhiteList", "")) || com.taobao.taobaoavsdk.util.b.b(Build.MODEL, MediaAdapteManager.mConfigAdapter.getConfig(cVar.q, "h264HardwareDecodeBlackList", ""))) {
                return;
            }
            cVar.f = 1;
        }
    }

    private void switchPathError(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479359a3", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.mbIsSwitchingPath = false;
        Runnable runnable = this.mSwitchRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mSwitchRunnable = null;
        }
        if (this.mMediaPlayerRecycler.g != null) {
            this.mMediaPlayerRecycler.g.resetListeners();
            this.mMediaPlayerRecycler.g.release();
            this.mMediaPlayerRecycler.g = null;
        }
        com.taobao.taobaoavsdk.widget.media.a aVar = this.mNextRenderView;
        if (aVar != null) {
            removeView(aVar.getView());
            this.mNextRenderView = null;
        }
        this.mNextSurfaceHolder = null;
        IMediaPlayer.OnInfoListener onInfoListener = this.mInfoListener;
        if (onInfoListener != null) {
            onInfoListener.onInfo(null, 718L, 0L, 0L, null);
        }
        try {
            CT ct = CT.Button;
            TBS.Adv.ctrlClicked("Page_Video", ct, "SwitchPath", "feed_id=" + this.mConfig.B, "url_before=" + this.mPlayUrl, "url_after=" + str, "is_success=0", "error_code=" + i);
        } catch (Throwable unused) {
        }
    }

    public boolean switchVideoPath(String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c3b567b", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        ozn oznVar = this.mMediaPlayerRecycler;
        if (oznVar != null && oznVar.g == null) {
            this.mMediaPlayerRecycler.g = openVideo(str, false, false);
            if (this.mMediaPlayerRecycler.g != null) {
                this.mMediaPlayerRecycler.g.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
                    public void onPrepared(IMediaPlayer iMediaPlayer) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
                        } else if (TaoLiveVideoView.access$400(TaoLiveVideoView.this) == null || TaoLiveVideoView.access$400(TaoLiveVideoView.this).g == null) {
                        } else {
                            int currentPosition = (!z || TaoLiveVideoView.this.mConfig == null || TaoLiveVideoView.this.mConfig.b != 2) ? 0 : TaoLiveVideoView.this.getCurrentPosition();
                            TaoLiveVideoView.this.release(false);
                            TaoLiveVideoView.access$400(TaoLiveVideoView.this).f = TaoLiveVideoView.access$400(TaoLiveVideoView.this).g;
                            TaoLiveVideoView.access$400(TaoLiveVideoView.this).g = null;
                            TaoLiveVideoView.access$400(TaoLiveVideoView.this).e = 2;
                            TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnPreparedListener(TaoLiveVideoView.access$1600(TaoLiveVideoView.this));
                            TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnVideoSizeChangedListener(TaoLiveVideoView.this.mSizeChangedListener);
                            TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnCompletionListener(TaoLiveVideoView.access$1700(TaoLiveVideoView.this));
                            TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnErrorListener(TaoLiveVideoView.access$1800(TaoLiveVideoView.this));
                            TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnInfoListener(TaoLiveVideoView.access$1900(TaoLiveVideoView.this));
                            TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnBufferingUpdateListener(TaoLiveVideoView.access$2000(TaoLiveVideoView.this));
                            TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnSeekCompleteListener(TaoLiveVideoView.access$2100(TaoLiveVideoView.this));
                            TaoLiveVideoView.this.start();
                            if (!z || TaoLiveVideoView.this.mConfig == null || TaoLiveVideoView.this.mConfig.b != 2) {
                                return;
                            }
                            TaoLiveVideoView.this.seekTo(currentPosition);
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    public boolean isInPlaybackState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f2d892", new Object[]{this})).booleanValue();
        }
        ozn oznVar = this.mMediaPlayerRecycler;
        return (oznVar == null || oznVar.f == null || this.mMediaPlayerRecycler.e == -1 || this.mMediaPlayerRecycler.e == 0 || this.mMediaPlayerRecycler.e == 1) ? false : true;
    }

    public void setSurfaceListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dfae78", new Object[]{this, dVar});
        } else {
            this.mSurfaceListener = dVar;
        }
    }

    private void bindSurfaceHolder(IMediaPlayer iMediaPlayer, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967669c8", new Object[]{this, iMediaPlayer, bVar});
            return;
        }
        AVSDKLog.e("AVSDK", this + ", bindSurfaceHolder " + bVar);
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            AVSDKLog.e("AVSDK", this + " bindSurfaceHolder setSurface to null");
            iMediaPlayer.setSurface(null);
            return;
        }
        releaseHolderSurface(bVar);
        bVar.a(iMediaPlayer);
    }

    private void releaseHolderSurface(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3129cc", new Object[]{this, bVar});
        } else if (bVar == null || bVar.b() == null || Build.VERSION.SDK_INT >= SDK_INT_FOR_OPTIMIZE) {
        } else {
            bVar.b().release();
        }
    }

    /* loaded from: classes8.dex */
    public class NetworkBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-931298103);
        }

        public NetworkBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            if (z) {
                int type = activeNetworkInfo.getType();
                if (type != 1 && type != oyu.b && TaoLiveVideoView.this.mConfig != null && TaoLiveVideoView.this.mConfig.n) {
                    Toast.makeText(TaoLiveVideoView.access$2600(TaoLiveVideoView.this), TaoLiveVideoView.access$2600(TaoLiveVideoView.this).getString(R.string.avsdk_mobile_network_hint), 1).show();
                }
                if ((!TaoLiveVideoView.this.mIsConnected || (type != oyu.b && oyu.b != -1)) && TaoLiveVideoView.this.mPlayUrl != null) {
                    if (TaoLiveVideoView.this.mConfig != null && TaoLiveVideoView.this.mConfig.b == 2 && TaoLiveVideoView.access$400(TaoLiveVideoView.this) != null && TaoLiveVideoView.access$400(TaoLiveVideoView.this).f != null) {
                        i = (int) TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.getCurrentPosition();
                    }
                    TaoLiveVideoView.this.release();
                    TaoLiveVideoView.this.start();
                    if (TaoLiveVideoView.this.mConfig != null && TaoLiveVideoView.this.mConfig.b == 2) {
                        TaoLiveVideoView.this.seekTo(i);
                    }
                }
                oyu.b = type;
            }
            TaoLiveVideoView.this.mIsConnected = z;
        }
    }

    public static void startViewFadeAnimation(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afd7a4a", new Object[]{view});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                View view2 = view;
                if (view2 == null) {
                    return;
                }
                view2.setVisibility(8);
            }
        });
        view.startAnimation(alphaAnimation);
    }

    private boolean needSetFusionMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("620cabde", new Object[]{this})).booleanValue();
        }
        ddc ddcVar = this.mConfigAdapter;
        String config = ddcVar != null ? ddcVar.getConfig(this.mConfig.q, "SensorFusionCalibrate", "") : null;
        if (StringUtils.isEmpty(config)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = config.split(";");
        if (split.length > 0) {
            for (String str2 : split) {
                if (StringUtils.equals(str, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void changeVideoSize(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a94eb13", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (i == 0 || i2 == 0) {
        } else {
            if (i == this.mVideoWidth && i2 == this.mVideoHeight) {
                return;
            }
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
            this.mVideoSarNum = i3;
            this.mVideoSarDen = i4;
            com.taobao.taobaoavsdk.widget.media.a aVar = this.mRenderView;
            if (aVar == null) {
                return;
            }
            aVar.setVideoSize(this.mVideoWidth, this.mVideoHeight);
            this.mRenderView.setVideoSampleAspectRatio(this.mVideoSarNum, this.mVideoSarDen);
        }
    }

    private void keepScreenOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd09697", new Object[]{this});
            return;
        }
        try {
            if (this.mControlScreenByParams) {
                AVSDKLog.e("AVSDK", "KeepScreeon do nothing");
                return;
            }
            AVSDKLog.e("AVSDK", this + "keepScreenOn " + this.mContext + ", " + oyu.y());
            if (this.mEnableGlobalKeepScreenOn) {
                if (this.mHasKeepScreenOn) {
                    return;
                }
                this.mHasKeepScreenOn = true;
                oyu.w();
            }
            if (this.mContext == null || !(this.mContext instanceof Activity)) {
                return;
            }
            ((Activity) this.mContext).getWindow().addFlags(128);
        } catch (Throwable unused) {
        }
    }

    private void clearKeepScreenOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0265704", new Object[]{this});
            return;
        }
        try {
            if (this.mControlScreenByParams) {
                AVSDKLog.e("AVSDK", "ClearScreeon do nothing");
                return;
            }
            AVSDKLog.e("AVSDK", this + "clearKeepScreenOn " + this.mContext + ", " + oyu.y());
            if (this.mEnableGlobalKeepScreenOn) {
                if (!this.mHasKeepScreenOn) {
                    return;
                }
                this.mHasKeepScreenOn = false;
                oyu.x();
                if (oyu.y() == 0) {
                    return;
                }
            }
            if (this.mContext == null || !(this.mContext instanceof Activity)) {
                return;
            }
            ((Activity) this.mContext).getWindow().clearFlags(128);
        } catch (Throwable unused) {
        }
    }

    public void setFirstRenderAdapter(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d166b97d", new Object[]{this, ddeVar});
        } else {
            this.mFirstRenderAdapter = ddeVar;
        }
    }

    /* loaded from: classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AbstractMediaPlayer b;

        static {
            kge.a(-336461940);
            kge.a(-1390502639);
        }

        private c() {
            this.b = TaoLiveVideoView.access$400(TaoLiveVideoView.this).f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AbstractMediaPlayer abstractMediaPlayer = this.b;
            if (abstractMediaPlayer == null) {
                return;
            }
            abstractMediaPlayer.stop();
            this.b.release();
        }
    }

    public void setUsingInterface(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad57968", new Object[]{this, str});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar = this.mConfig;
        if (cVar == null || StringUtils.isEmpty(cVar.as)) {
            this.mUsingInterface = str;
            return;
        }
        com.taobao.taobaoavsdk.widget.media.c cVar2 = this.mConfig;
        if (cVar2 == null) {
            return;
        }
        cVar2.as = str + "." + COMPONENT_NAME;
    }

    public String getSEIData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5b6f5b6e", new Object[]{this}) : this.mSeiData;
    }

    public void setUseShortAudioFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c253f14", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mUseShortAudioFocus = z;
        AVSDKLog.e("AVSDK", "taoLiveVideoView: setUseShortAudioFocus=" + z);
    }

    public void setControlParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfa74ab", new Object[]{this, hashMap});
        } else if (hashMap == null || hashMap.get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM) == null) {
        } else {
            if (com.taobao.taobaoavsdk.util.b.a(hashMap.get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM))) {
                this.mControlScreenByParams = true;
            } else {
                this.mControlScreenByParams = false;
            }
        }
    }
}
