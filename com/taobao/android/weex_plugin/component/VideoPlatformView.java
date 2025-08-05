package com.taobao.android.weex_plugin.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.adapter.i;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.platform.JSGetter;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.JSSetter;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.r;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.ai;
import com.taobao.avplayer.av;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.az;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.common.u;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.q;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.tao.log.TLog;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.WXPerformance;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.dde;
import tb.jwi;
import tb.jwl;
import tb.jwm;
import tb.oyw;

/* loaded from: classes6.dex */
public class VideoPlatformView extends WeexPlatformView implements av, ax, az, u, z, dde {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_CAN_PLAY_THROUGH = "canplaythrough";
    private static final String EVENT_CLICK = "click";
    private static final String EVENT_ENDED = "ended";
    private static final String EVENT_ERROR = "error";
    private static final String EVENT_FINISH = "finish";
    private static final String EVENT_FIRST_FRAME = "firstvideoframe";
    private static final String EVENT_FIRST_FRAME_IN_RENDER = "firstvideoframeinrender";
    private static final String EVENT_PAUSE = "pause";
    private static final String EVENT_PLAYING = "playing";
    private static final String EVENT_POSTER_LOAD_FAIL = "posterloaderror";
    private static final String EVENT_POSTER_LOAD_SUCCESS = "posterload";
    private static final String EVENT_STALLED = "stalled";
    private static final String EVENT_TIMEUPDATE = "timeupdate";
    private static final String LOG_MODULE = "Weex/VideoPlatformView";
    private static final String ORANGE_KEY_POSTER = "enable_new_poster";
    private static final String TAG = "VideoPlatformView";
    public static final int TYPE_DISK = 2;
    public static final int TYPE_MEMORY = 1;
    private boolean isCompleted;
    private DWAspectRatio mAspectRatio;
    private boolean mAutoplay;
    private int mBackgroundColor;
    private String mContentId;
    private int mCurrentTime;
    private boolean mExpectPlay;
    private String mFrom;
    private boolean mFullscreenBtnHidden;
    private boolean mHasClickEvent;
    private boolean mHasEndEvent;
    private boolean mHasErrorEvent;
    private boolean mHasFinishEvent;
    private boolean mHasFirstFrameEvent;
    private boolean mHasFirstFrameInRenderEvent;
    private boolean mHasPausedEvent;
    private boolean mHasPlay;
    private boolean mHasPlayingEvent;
    private boolean mHasPreparedEvent;
    private boolean mHasStalledEvent;
    private boolean mHasTimeUpdateEvent;
    private int mHeight;
    private boolean mHiddenPlayErrorView;
    private boolean mHidePlayingIcon;
    private boolean mHideThinProgressBar;
    private boolean mHideThumbnailPlayBtn;
    private long mInteractiveId;
    private boolean mIsReleaseShortFocusWhenPause;
    private boolean mLandscape;
    private boolean mLoadingHide;
    private boolean mLoadingLazy;
    private boolean mLoop;
    private boolean mMuted;
    private String mPlayScene;
    private String mPlayStatus;
    private String mPoster;
    private AliUrlImageView mPosterImageView;
    private ImageView.ScaleType mPosterScaleType;
    private String mPreload;
    private boolean mPrepareToFirstFrame;
    private boolean mProgressGesture;
    private VideoRootView mRootView;
    private boolean mShowControls;
    private boolean mShowNotWifiHint;
    private boolean mShownMuteBtn;
    private ImageView mSnapshotImageView;
    private String mSrc;
    private long mStartTime;
    private DWInstance mTBDWInstance;
    private boolean mTBEnv;
    private HashMap<String, String> mUTParams;
    private boolean mUseShortAudioFocus;
    private long mUserId;
    private int mVideoDuration;
    private String mVideoID;
    private String mVideoSource;
    private HashMap<String, Object> mVideoSourceConfig;
    private String mVideoSourceStr;
    private int mWidth;

    /* loaded from: classes6.dex */
    public static class TBVideoInfo implements Serializable {
        public String bizCode;
        public String url;
        public String videoId;
        public String videoSource;
    }

    /* loaded from: classes6.dex */
    public interface a {
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(int i, int i2, int i3, int i4);
    }

    /* loaded from: classes6.dex */
    public interface c {
    }

    public static /* synthetic */ Object ipc$super(VideoPlatformView videoPlatformView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1496307301) {
            super.onFlutterViewDetached();
            return null;
        } else if (hashCode != -499918508) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onUpdateStyles((Map) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.avplayer.common.u
    public void onMutedChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff26311", new Object[]{this, new Boolean(z)});
        }
    }

    public static /* synthetic */ void access$000(VideoPlatformView videoPlatformView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94dfaf6", new Object[]{videoPlatformView, new Integer(i), new Integer(i2)});
        } else {
            videoPlatformView.resizeVideoInstance(i, i2);
        }
    }

    public static /* synthetic */ void access$100(VideoPlatformView videoPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c621df7d", new Object[]{videoPlatformView, str, obj});
        } else {
            videoPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ void access$200(VideoPlatformView videoPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9884ebe", new Object[]{videoPlatformView, str, obj});
        } else {
            videoPlatformView.fireEvent(str, obj);
        }
    }

    public VideoPlatformView(Context context, int i) {
        super(context, i);
        this.mTBEnv = true;
        this.mLoop = false;
        this.mAutoplay = false;
        this.mPrepareToFirstFrame = false;
        this.mShowControls = true;
        this.mMuted = false;
        this.mCurrentTime = 0;
        this.mUserId = -1L;
        this.mInteractiveId = -1L;
        this.mVideoSource = "TBVideo";
        this.mProgressGesture = false;
        this.mShownMuteBtn = false;
        this.mUseShortAudioFocus = false;
        this.mIsReleaseShortFocusWhenPause = true;
        this.mHidePlayingIcon = true;
        this.mFullscreenBtnHidden = false;
        this.mLoadingHide = false;
        this.mShowNotWifiHint = true;
        this.mHasPlay = false;
        this.isCompleted = false;
        this.mLandscape = false;
        this.mExpectPlay = false;
        this.mHiddenPlayErrorView = false;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mBackgroundColor = -1;
        this.mTBEnv = isTaobaoEnv(context);
        this.mRootView = new VideoRootView(context);
        this.mRootView.whenSizeChanged(new b() { // from class: com.taobao.android.weex_plugin.component.VideoPlatformView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_plugin.component.VideoPlatformView.b
            public void a(int i2, int i3, int i4, int i5) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
                } else {
                    VideoPlatformView.access$000(VideoPlatformView.this, i2, i3);
                }
            }
        });
        this.mRootView.whenDetachedFromWindow(new a() { // from class: com.taobao.android.weex_plugin.component.VideoPlatformView.2
        });
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
        } else if ((!TextUtils.isEmpty(this.mSrc) || "TBVideo".equals(this.mVideoSource) || ("YKVideo".equals(this.mVideoSource) && !TextUtils.isEmpty(this.mVideoID))) && this.mTBDWInstance == null && !this.mLoadingLazy) {
            try {
                initMediaPlayer();
            } catch (Exception e) {
                r.c(getMUSInstance().getInstanceId(), TAG, e.toString());
            }
        } else if (this.mLoadingLazy && !TextUtils.isEmpty(this.mPoster)) {
            loadPosterView();
        } else {
            Log.e(TAG, "src or videoid is empty");
        }
    }

    private void loadPosterView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183caf9f", new Object[]{this});
            return;
        }
        this.mPosterImageView = new AliUrlImageView(getContext());
        this.mPosterImageView.setImageUrl(this.mPoster);
        this.mPosterImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.weex_plugin.component.VideoPlatformView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                HashMap hashMap = new HashMap();
                if (succPhenixEvent.isImmediate()) {
                    str = "1";
                } else {
                    str = succPhenixEvent.isFromDisk() ? "2" : "-1";
                }
                hashMap.put(WXPerformance.CACHE_TYPE, str);
                VideoPlatformView.access$200(VideoPlatformView.this, VideoPlatformView.EVENT_POSTER_LOAD_SUCCESS, hashMap);
                return false;
            }
        }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.weex_plugin.component.VideoPlatformView.3
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
                HashMap hashMap = new HashMap();
                hashMap.put("errorResultCode", Integer.valueOf(failPhenixEvent.getResultCode()));
                hashMap.put("error", failPhenixEvent.getHttpMessage());
                hashMap.put("errorHttpCode", Integer.valueOf(failPhenixEvent.getHttpCode()));
                VideoPlatformView.access$100(VideoPlatformView.this, VideoPlatformView.EVENT_POSTER_LOAD_FAIL, hashMap);
                return false;
            }
        });
        if (this.mAspectRatio == DWAspectRatio.DW_CENTER_CROP) {
            this.mPosterImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (this.mAspectRatio == DWAspectRatio.DW_FIT_X_Y) {
            this.mPosterImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (this.mAspectRatio == DWAspectRatio.DW_FIT_CENTER) {
            this.mPosterImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        this.mRootView.addView(this.mPosterImageView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mRootView;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onFlutterViewDetached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d0299b", new Object[]{this});
            return;
        }
        super.onFlutterViewDetached();
        destroyDWInstance();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
        } else {
            destroyDWInstance();
        }
    }

    private void initMediaPlayer() {
        DWInstance.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23416bc", new Object[]{this});
        } else if (this.mTBDWInstance != null) {
        } else {
            if (!(getContext() instanceof Activity)) {
                reportErrorException("Illegal_Context");
                g.f("Weex error", "video context only support activity");
                return;
            }
            if (this.mTBEnv) {
                aVar = new bk.a((Activity) getContext());
            } else {
                aVar = new DWInstance.a((Activity) getContext());
            }
            aVar.e(this.mFrom);
            aVar.b(this.mVideoID);
            aVar.c(this.mVideoSource);
            if (!this.mTBEnv) {
                aVar.a(new ai());
                aVar.a(new com.taobao.avplayer.c());
                aVar.a(new q((Activity) getContext()));
            }
            aVar.a(this.mSrc);
            aVar.f(this.mMuted);
            aVar.g(false);
            aVar.c(this.mWidth);
            aVar.d(this.mHeight);
            aVar.j(false);
            aVar.B(this.mProgressGesture);
            aVar.c(this.mLoop);
            aVar.E(false);
            aVar.p(false);
            aVar.G(false);
            aVar.F(false);
            aVar.r(false);
            aVar.s(this.mHideThinProgressBar);
            aVar.t(false);
            aVar.y(this.mLoadingHide);
            aVar.u(false);
            aVar.v(false);
            aVar.w(this.mHiddenPlayErrorView);
            aVar.x(this.mHideThumbnailPlayBtn);
            aVar.n(!this.mFullscreenBtnHidden);
            aVar.A(true);
            aVar.o(false);
            aVar.e(false);
            aVar.M(false);
            aVar.D(false);
            aVar.k(true);
            aVar.Q(true);
            aVar.N(this.mShownMuteBtn);
            aVar.R(this.mUseShortAudioFocus);
            aVar.S(this.mIsReleaseShortFocusWhenPause);
            aVar.g(this.mPlayScene);
            aVar.r(this.mHidePlayingIcon);
            long j = this.mUserId;
            if (j != -1) {
                aVar.b(j);
            }
            long j2 = this.mInteractiveId;
            if (j2 != -1) {
                aVar.a(j2);
            }
            aVar.h(this.mContentId);
            HashMap<String, String> hashMap = this.mUTParams;
            if (hashMap != null) {
                aVar.a(hashMap);
            }
            DWAspectRatio dWAspectRatio = this.mAspectRatio;
            if (dWAspectRatio != null) {
                aVar.a(dWAspectRatio);
            }
            if (!TextUtils.isEmpty(this.mVideoSourceStr)) {
                try {
                    JSONObject a2 = com.taobao.tao.flexbox.layoutmanager.player.videodecide.b.a().a(new JSONObject(this.mVideoSourceStr), new com.taobao.tao.flexbox.layoutmanager.player.videodecide.a(((Boolean) this.mVideoSourceConfig.get("enable")).booleanValue(), (float) ((Double) this.mVideoSourceConfig.get("ratio")).doubleValue(), ((Integer) this.mVideoSourceConfig.get("netSpeedType")).intValue(), 0.0f, this.mVideoSourceConfig.get("limitDeviceScore") != null ? ((Integer) this.mVideoSourceConfig.get("limitDeviceScore")).intValue() : 0, -1.0f));
                    if (a2 != null) {
                        aVar.a(a2);
                    }
                } catch (Exception e) {
                    r.c(getMUSInstance().getInstanceId(), TAG, e.toString());
                }
            }
            this.mTBDWInstance = aVar.b();
            this.mTBDWInstance.hideGoodsListView();
            this.mTBDWInstance.hideTopEventView();
            this.mTBDWInstance.hideCloseView();
            HashMap<String, String> hashMap2 = new HashMap<>();
            int a3 = com.taobao.application.common.c.a().a("deviceLevel", -1);
            String str = a3 == 1 ? "50" : a3 == 2 ? "100" : a3 == 3 ? "200" : "";
            if (!TextUtils.isEmpty(str)) {
                hashMap2.put("_progressTime", str);
                this.mTBDWInstance.addCustomParams(hashMap2);
            }
            int i = this.mBackgroundColor;
            if (i != -1) {
                this.mTBDWInstance.setVideoBackgroundColor(i);
            }
            if (this.mShowControls) {
                this.mTBDWInstance.showController();
            } else {
                this.mTBDWInstance.hideController();
            }
            setupListener(this);
            this.mTBDWInstance.setShowNotWifiHint(this.mShowNotWifiHint);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (this.mLoadingLazy) {
                this.mRootView.addView(this.mTBDWInstance.getView(), 0, layoutParams);
            } else {
                this.mRootView.addView(this.mTBDWInstance.getView(), layoutParams);
                if (!TextUtils.isEmpty(this.mPoster)) {
                    loadPosterView();
                }
            }
            if (this.mAutoplay || "play".equals(this.mPlayStatus)) {
                this.mTBDWInstance.start();
            } else if (!"none".equals(this.mPreload)) {
                this.mTBDWInstance.asyncPrepareVideo();
            } else if (this.mPrepareToFirstFrame) {
                this.mTBDWInstance.prepareToFirstFrame();
            }
            jwm.b().a(this);
            weexLog("initMediaPlayer");
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onUpdateStyles(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e233d954", new Object[]{this, map});
            return;
        }
        super.onUpdateStyles(map);
        if (map.get(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_object_fit) != null) {
            setContentMode(map.get(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_object_fit));
        }
        if (map.get(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_radius) == null) {
            return;
        }
        setRoundRect(Float.parseFloat(map.get(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_radius)));
    }

    @WXComponentProp(name = "background-color")
    public void setPlaygroundColor(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd56c137", new Object[]{this, new Long(j)});
            return;
        }
        this.mBackgroundColor = Long.valueOf(j).intValue();
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.setVideoBackgroundColor(this.mBackgroundColor);
    }

    public void setRoundRect(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a02bc9", new Object[]{this, new Float(f)});
        } else if (Build.VERSION.SDK_INT < 21 || getContext() == null) {
        } else {
            final float f2 = f * getContext().getResources().getDisplayMetrics().density;
            this.mRootView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.weex_plugin.component.VideoPlatformView.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), f2);
                    }
                }
            });
            this.mRootView.setClipToOutline(true);
        }
    }

    @JSMethod
    public void commitEndForMultiplexing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.commitEndForMultiplexing();
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        if (this.mLoadingLazy && this.mTBDWInstance == null) {
            initMediaPlayer();
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance != null) {
            if (dWInstance.getVideoState() == 2) {
                this.mTBDWInstance.playVideo();
                weexLog("playVideo");
                return;
            }
            this.mTBDWInstance.start();
            weexLog("start");
            return;
        }
        this.mExpectPlay = true;
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance != null) {
            dWInstance.pauseVideo();
            weexLog("pauseVideo");
            return;
        }
        this.mExpectPlay = false;
    }

    @JSMethod
    public void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
        } else {
            initMediaPlayer();
        }
    }

    @JSMethod
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            destroyDWInstance();
        }
    }

    @JSMethod
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.mute(z);
    }

    @JSMethod
    public void seek(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9bfbe4", new Object[]{this, new Integer(i)});
            return;
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.seekTo(i * 1000);
    }

    @JSMethod
    public void exitFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb41bfa0", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null || !dWInstance.isFullScreen()) {
            return;
        }
        this.mTBDWInstance.toggleScreen();
    }

    @JSMethod
    public void requestFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea31f51", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null || dWInstance.isFullScreen()) {
            return;
        }
        this.mTBDWInstance.toggleScreen();
    }

    @JSMethod
    public void playbackRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf32b5e", new Object[]{this, new Float(f)});
            return;
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null || f > 2.0f || f < 0.5f) {
            return;
        }
        dWInstance.setPlayRate(f);
    }

    @JSMethod
    public void setCurrentTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f105bb8", new Object[]{this, new Integer(i)});
            return;
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.seekTo(i * 1000);
    }

    @JSMethod
    public void getCurrentTime(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44cdcce", new Object[]{this, bVar});
        } else if (this.mTBDWInstance == null || bVar == null) {
        } else {
            HashMap hashMap = new HashMap(1);
            hashMap.put("result", Float.valueOf(this.mTBDWInstance.getCurrentPosition() / 1000.0f));
            bVar.a(MUSValue.ofJSON(hashMap));
        }
    }

    @JSMethod
    public void getDuration(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc72528", new Object[]{this, bVar});
        } else if (this.mTBDWInstance == null || bVar == null) {
        } else {
            HashMap hashMap = new HashMap(1);
            hashMap.put("result", Float.valueOf(((float) this.mTBDWInstance.getDuration()) / 1000.0f));
            bVar.a(MUSValue.ofJSON(hashMap));
        }
    }

    @JSGetter(name = "duration")
    public float getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a81", new Object[]{this})).floatValue();
        }
        try {
            if (this.mTBDWInstance != null) {
                return ((float) this.mTBDWInstance.getDuration()) / 1000.0f;
            }
            return 0.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @JSMethod
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else if (this.mTBDWInstance == null) {
        } else {
            destroyDWInstance();
            initMediaPlayer();
        }
    }

    @JSMethod
    public void getSnapshotImage(float f, com.taobao.android.weex_framework.bridge.b bVar) {
        TextureView a2;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d347c68f", new Object[]{this, new Float(f), bVar});
        } else if (getView() == null || (a2 = jwi.a((ViewGroup) getView())) == null || getContext() == null) {
        } else {
            int i = getContext().getResources().getDisplayMetrics().widthPixels;
            if (a2.getWidth() >= i) {
                bitmap = a2.getBitmap(i, a2.getHeight());
            } else {
                bitmap = a2.getBitmap();
            }
            if (bitmap == null) {
                return;
            }
            ImageView imageView = this.mSnapshotImageView;
            if (imageView == null) {
                this.mSnapshotImageView = new ImageView(getContext());
                this.mSnapshotImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.mSnapshotImageView.setImageBitmap(bitmap);
                this.mRootView.addView(this.mSnapshotImageView, new ViewGroup.LayoutParams(-1, -1));
            } else {
                imageView.setImageBitmap(bitmap);
                this.mSnapshotImageView.setVisibility(0);
            }
            String str = "video" + System.currentTimeMillis();
            jwl.a().a(str, bitmap);
            HashMap hashMap = new HashMap(1);
            hashMap.put("fileName", str);
            bVar.a(MUSValue.ofJSON(hashMap));
        }
    }

    private void resizeVideoInstance(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf104403", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mTBDWInstance == null) {
        } else {
            if (this.mWidth == i && this.mHeight == i2) {
                return;
            }
            this.mWidth = i;
            this.mHeight = i2;
            this.mTBDWInstance.setFrame(i, i2);
        }
    }

    @WXComponentProp(name = "width")
    public void setWidth(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf5f093", new Object[]{this, new Double(d)});
            return;
        }
        this.mWidth = (int) (d * getContext().getResources().getDisplayMetrics().density);
        changeVideoFrame();
    }

    @WXComponentProp(name = "height")
    public void setHeight(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde360e", new Object[]{this, new Double(d)});
            return;
        }
        this.mHeight = (int) (d * getContext().getResources().getDisplayMetrics().density);
        changeVideoFrame();
    }

    @WXComponentProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
            return;
        }
        this.mSrc = str;
        if (!this.mSrc.contains("videoId")) {
            return;
        }
        try {
            TBVideoInfo tBVideoInfo = (TBVideoInfo) com.alibaba.fastjson.JSONObject.parseObject(this.mSrc, TBVideoInfo.class);
            this.mSrc = tBVideoInfo.url;
            this.mVideoID = tBVideoInfo.videoId;
            this.mVideoSource = tBVideoInfo.videoSource;
            this.mFrom = tBVideoInfo.bizCode;
        } catch (Throwable unused) {
        }
    }

    @WXComponentProp(name = "videoSourceStr")
    public void setVideoSourceStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfe45ae", new Object[]{this, str});
        } else {
            this.mVideoSourceStr = str;
        }
    }

    @WXComponentProp(name = "loading")
    public void setLoading(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c022d8b", new Object[]{this, str});
        } else {
            this.mLoadingLazy = "lazy".equals(str);
        }
    }

    @WXComponentProp(name = "videoSourceConfig")
    public void setVideoSourceConfig(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc24df6", new Object[]{this, hashMap});
        } else {
            this.mVideoSourceConfig = hashMap;
        }
    }

    @WXComponentProp(name = "video-id")
    public void setVideoId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
        } else {
            this.mVideoID = str;
        }
    }

    @WXComponentProp(name = "from")
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.mFrom = str;
        }
    }

    @WXComponentProp(name = "video-source")
    public void setVideoSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
        } else {
            this.mVideoSource = str;
        }
    }

    @WXComponentProp(name = "autoplay")
    public void setAutoplay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c74e68", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoplay = z;
        }
    }

    @WXComponentProp(name = oyw.VIDEO_PLAY_SCENES)
    public void setVideoScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6bb924", new Object[]{this, str});
        } else {
            this.mPlayScene = str;
        }
    }

    @WXComponentProp(name = "userId")
    public void setUserId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdec0ad5", new Object[]{this, new Long(j)});
        } else {
            this.mUserId = j;
        }
    }

    @WXComponentProp(name = "contentId")
    public void setContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            this.mContentId = str;
        }
    }

    @WXComponentProp(name = "interactiveId")
    public void setInteractiveId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b29f9a2", new Object[]{this, new Long(j)});
        } else {
            this.mInteractiveId = j;
        }
    }

    @WXComponentProp(name = Constants.Name.AUTO_PLAY)
    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoplay = z;
        }
    }

    @WXComponentProp(name = "p2ff")
    public void setPrepareToFirstFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa2e4f0", new Object[]{this, new Boolean(z)});
        } else {
            this.mPrepareToFirstFrame = z;
        }
    }

    @WXComponentProp(name = "loop")
    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            this.mLoop = z;
        }
    }

    @WXComponentProp(name = MusLiveVideo.ATTR_POSTER)
    public void setPoster(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
        } else {
            this.mPoster = str;
        }
    }

    @WXComponentProp(name = "controls")
    public void setControls(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78a5cf5", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowControls = z;
        }
    }

    @WXComponentProp(name = MusLiveVideo.ATTR_MUTE)
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMuted = z;
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.mute(z);
    }

    @WXComponentProp(name = "loadingHidden")
    public void setHideLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79879e55", new Object[]{this, new Boolean(z)});
        } else {
            this.mLoadingHide = z;
        }
    }

    @WXComponentProp(name = "preload")
    public void setPreload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63c7298", new Object[]{this, str});
        } else {
            this.mPreload = str;
        }
    }

    @WXComponentProp(name = "seek-to-time")
    public void setSeekToTime(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ea0ed7", new Object[]{this, new Float(f)});
        } else {
            this.mCurrentTime = (int) (f * 1000.0f);
        }
    }

    @WXComponentProp(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_object_fit)
    public void setObjectFit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbbb4a1", new Object[]{this, str});
        } else {
            setContentMode(str);
        }
    }

    private void setContentMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05e5b0b", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3143043) {
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && str.equals("contain")) {
                        c2 = 0;
                    }
                } else if (str.equals("cover")) {
                    c2 = 1;
                }
            } else if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_fill)) {
                c2 = 2;
            }
            if (c2 == 0) {
                this.mAspectRatio = DWAspectRatio.DW_FIT_CENTER;
                this.mPosterScaleType = ImageView.ScaleType.FIT_CENTER;
            } else if (c2 == 1) {
                this.mAspectRatio = DWAspectRatio.DW_CENTER_CROP;
                this.mPosterScaleType = ImageView.ScaleType.CENTER_CROP;
            } else if (c2 != 2) {
            } else {
                this.mAspectRatio = DWAspectRatio.DW_FIT_X_Y;
                this.mPosterScaleType = ImageView.ScaleType.FIT_XY;
            }
        }
    }

    @WXComponentProp(name = "play-control")
    public void setPlayControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb68518", new Object[]{this, str});
        } else {
            setPlaystatus(str);
        }
    }

    @WXComponentProp(name = "enable-progress-gesture")
    public void setEnableProgressGesture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b6be76", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mProgressGesture = z;
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.setNeedGesture(z);
    }

    @WXComponentProp(name = "show-mute-btn")
    public void setShowMuteBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7dffa9", new Object[]{this, new Boolean(z)});
        } else {
            this.mShownMuteBtn = z;
        }
    }

    @WXComponentProp(name = "use-short-audio-focus")
    public void setUseShortAudioFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c253f14", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseShortAudioFocus = z;
        }
    }

    @WXComponentProp(name = "short-focus-when-pause")
    public void setReleaseShortFocusWhenPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e47d2112", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsReleaseShortFocusWhenPause = z;
        }
    }

    @WXComponentProp(name = "show-center-play-btn")
    public void setShowCenterPlayBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8aa6379", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideThumbnailPlayBtn = !z;
        }
    }

    @WXComponentProp(name = "hide-play-error-view")
    public void setHiddenPlayErrorView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420e84a0", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenPlayErrorView = z;
        }
    }

    @WXComponentProp(name = "show-fullscreen-btn")
    public void setShowFullScreenBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1945602b", new Object[]{this, new Boolean(z)});
        } else {
            this.mFullscreenBtnHidden = !z;
        }
    }

    @WXComponentProp(name = "playingIconHidden")
    public void setHidePlayingIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4952aa", new Object[]{this, new Boolean(z)});
        } else {
            this.mHidePlayingIcon = z;
        }
    }

    @WXComponentProp(name = "hide-mini-progress-view")
    public void setHideMiniProgressView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7892fe00", new Object[]{this, new Boolean(z)});
        } else {
            setMiniProgressViewHidden(z);
        }
    }

    @WXComponentProp(name = "miniProgressViewHidden")
    public void setMiniProgressViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2d5d8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mHideThinProgressBar = z;
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        if (z) {
            dWInstance.hideMiniProgressBar();
        } else {
            dWInstance.showMiniProgressBar();
        }
    }

    @WXComponentProp(name = Constants.Name.PLAY_STATUS)
    public void setPlaystatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d6d6b9", new Object[]{this, str});
            return;
        }
        this.mPlayStatus = str;
        if (this.mTBDWInstance == null) {
            return;
        }
        if ("play".equals(this.mPlayStatus)) {
            this.mHasPlay = true;
            play();
        } else if ("pause".equals(this.mPlayStatus)) {
            pause();
        } else if (!"stop".equals(this.mPlayStatus)) {
        } else {
            stop();
        }
    }

    @WXComponentProp(name = "utParams")
    public void setUTParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        this.mUTParams = hashMap;
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.setUTParams(this.mUTParams);
    }

    @WXComponentProp(name = "outStartTime")
    public void setOutStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60a40da", new Object[]{this, new Long(j)});
        } else {
            this.mStartTime = j;
        }
    }

    @WXComponentProp(name = "showNotWifiHint")
    public void setShowNotWifiHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dd9fd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mShowNotWifiHint = z;
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.setShowNotWifiHint(z);
    }

    @JSSetter(name = MusLiveVideo.ATTR_MUTE)
    public void setMutedProp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47f8d81", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMuted = z;
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.mute(z);
    }

    @JSGetter(name = MusLiveVideo.ATTR_MUTE)
    public boolean getMutedProp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b3e3543", new Object[]{this})).booleanValue();
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance != null) {
            return dWInstance.isMute();
        }
        return false;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onUpdateEvents(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7615bd25", new Object[]{this, hashSet});
        } else if (hashSet == null) {
        } else {
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (EVENT_CAN_PLAY_THROUGH.equals(next)) {
                    this.mHasPreparedEvent = true;
                } else if (EVENT_ENDED.equals(next)) {
                    this.mHasEndEvent = true;
                } else if ("finish".equals(next)) {
                    this.mHasFinishEvent = true;
                } else if ("error".equals(next)) {
                    this.mHasErrorEvent = true;
                } else if ("playing".equals(next)) {
                    this.mHasPlayingEvent = true;
                } else if ("stalled".equals(next)) {
                    this.mHasStalledEvent = true;
                } else if ("pause".equals(next)) {
                    this.mHasPausedEvent = true;
                } else if (EVENT_TIMEUPDATE.equals(next)) {
                    this.mHasTimeUpdateEvent = true;
                } else if ("click".equals(next)) {
                    this.mHasClickEvent = true;
                } else if (EVENT_FIRST_FRAME.equals(next)) {
                    this.mHasFirstFrameEvent = true;
                } else if (EVENT_FIRST_FRAME_IN_RENDER.equals(next)) {
                    this.mHasFirstFrameInRenderEvent = true;
                }
            }
        }
    }

    private void destroyDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2090149", new Object[]{this});
        } else if (this.mTBDWInstance == null) {
        } else {
            jwm.b().b(this);
            if (this.mTBDWInstance.isFullScreen()) {
                ViewGroup view = this.mTBDWInstance.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                this.mTBDWInstance.toggleScreen();
            }
            this.mRootView.removeView(this.mTBDWInstance.getView());
            this.mTBDWInstance.setVideoLifecycleListener(null);
            this.mTBDWInstance.destroy();
            this.mTBDWInstance = null;
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        DWInstance dWInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.isCompleted = false;
        this.mHasPlay = true;
        int i = this.mCurrentTime;
        if (i > 0 && (dWInstance = this.mTBDWInstance) != null) {
            dWInstance.seekTo(i);
        }
        this.mCurrentTime = 0;
        if (this.mHasPlayingEvent) {
            fireEvent("playing");
        }
        jwm.b().a(this, true);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.mHasPlay = false;
        }
        if (this.mHasPausedEvent) {
            fireEvent("pause");
        }
        jwm.b().a(this, false);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        ImageView imageView = this.mSnapshotImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.mHasPlay = true;
        this.isCompleted = false;
        if (this.mHasPlayingEvent) {
            fireEvent("playing");
        }
        jwm.b().a(this, true);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentTime = i;
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        this.isCompleted = false;
        if (!this.mHasPreparedEvent) {
            return;
        }
        fireEvent(EVENT_CAN_PLAY_THROUGH);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.mHasErrorEvent) {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Integer.valueOf(i));
            hashMap.put("message", "");
            fireEvent("error", hashMap);
            weexLog("onVideoError:" + i);
        }
        reportErrorException(String.valueOf(i));
    }

    private void reportErrorException(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fcf9cc", new Object[]{this, str});
            return;
        }
        try {
            if (l.a().i() != null) {
                i i = l.a().i();
                String str2 = this.mSrc;
                i.a(10021, "VIDEO", str2, str, "video error", "video error src:" + this.mSrc + ",videoId:" + this.mVideoID, getMUSInstance().getInstanceId());
                if (getMUSInstance() != null) {
                    i i2 = l.a().i();
                    i2.a(10021, "VIDEO", str, "video error src:" + this.mSrc + ",videoId:" + this.mVideoID, getMUSInstance().getInstanceId());
                }
            }
            setWhiteScreenInfo("video error src:" + this.mSrc + ",videoId:" + this.mVideoID + ",VIDEO_" + str);
        } catch (Exception e) {
            weexLog("exception error:" + e.toString());
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if (i == 3) {
            if (this.mHasFirstFrameEvent) {
                fireEvent(EVENT_FIRST_FRAME);
            }
            AliUrlImageView aliUrlImageView = this.mPosterImageView;
            if (aliUrlImageView == null) {
                return;
            }
            aliUrlImageView.setVisibility(8);
        } else if (i == 12100) {
            if (this.mHasFirstFrameInRenderEvent) {
                fireEvent(EVENT_FIRST_FRAME_IN_RENDER);
            }
            AliUrlImageView aliUrlImageView2 = this.mPosterImageView;
            if (aliUrlImageView2 == null) {
                return;
            }
            aliUrlImageView2.setVisibility(8);
        } else if (i == 701) {
            if (!this.mHasStalledEvent) {
                return;
            }
            fireEvent("stalled");
        } else if (i != 702 || !this.mHasPreparedEvent) {
        } else {
            fireEvent(EVENT_CAN_PLAY_THROUGH);
        }
    }

    @JSSetter(name = "currentTime")
    public void setJSCurrentTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47022281", new Object[]{this, new Integer(i)});
        } else {
            setCurrentTime(i);
        }
    }

    @JSGetter(name = "currentTime")
    public float getCurrentTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf1327", new Object[]{this})).floatValue();
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return 0.0f;
        }
        return dWInstance.getCurrentPosition() / 1000.0f;
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        this.isCompleted = true;
        this.mHasPlay = false;
        this.mCurrentTime = 0;
        if (this.mHasEndEvent) {
            fireEvent(EVENT_ENDED);
        }
        if (this.mHasFinishEvent) {
            fireEvent("finish");
        }
        jwm.b().a(this, false);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        } else {
            jwm.b().a(this, false);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        } else {
            this.mLandscape = true;
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        } else {
            this.mLandscape = false;
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.mCurrentTime = i;
        if (this.mVideoDuration != 0) {
            return;
        }
        this.mVideoDuration = i3;
    }

    @Override // com.taobao.avplayer.ax
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        if (this.mHasEndEvent) {
            fireEvent(EVENT_ENDED);
        }
        if (this.mHasFinishEvent) {
            fireEvent("finish");
        }
        jwm.b().a(this, false);
    }

    @Override // com.taobao.avplayer.common.z
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        if (this.mHasClickEvent) {
            fireEvent("click");
        }
        return false;
    }

    private boolean isTaobaoEnv(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45aece70", new Object[]{this, context})).booleanValue() : !"com.unicorn.playground".equals(context.getPackageName());
    }

    @Override // tb.dde
    public long getStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue() : this.mStartTime;
    }

    @Override // com.taobao.avplayer.az
    public void onVideoPlayTimeChanged(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22c0ba6", new Object[]{this, new Long(j)});
            return;
        }
        if (this.mHasTimeUpdateEvent) {
            HashMap hashMap = new HashMap();
            hashMap.put("currentTime", Float.valueOf(this.mCurrentTime / 1000.0f));
            hashMap.put("duration", Float.valueOf(this.mVideoDuration / 1000.0f));
            hashMap.put("totalPlayTime", Long.valueOf(j));
            fireEvent(EVENT_TIMEUPDATE, hashMap);
        }
        ImageView imageView = this.mSnapshotImageView;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.mSnapshotImageView.setVisibility(8);
        }
        AliUrlImageView aliUrlImageView = this.mPosterImageView;
        if (aliUrlImageView == null || aliUrlImageView.getVisibility() != 0) {
            return;
        }
        this.mPosterImageView.setVisibility(8);
    }

    public DWInstance extractVideoInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInstance) ipChange.ipc$dispatch("544612c1", new Object[]{this});
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return null;
        }
        this.mRootView.removeView(dWInstance.getView());
        setupListener(null);
        jwm.b().b(this);
        this.mTBDWInstance = null;
        return dWInstance;
    }

    public void recoverVideoInstance(DWInstance dWInstance) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5194cc14", new Object[]{this, dWInstance});
        } else if (this.mTBDWInstance != null) {
            dWInstance.destroy();
        } else {
            this.mTBDWInstance = dWInstance;
            setupListener(this);
            this.mRootView.addView(dWInstance.getView());
            this.mTBDWInstance.setFrame(this.mRootView.getWidth(), this.mRootView.getHeight());
            this.mTBDWInstance.mute(this.mMuted);
            jwm.b().a(this);
            jwm b2 = jwm.b();
            if (this.mTBDWInstance.getVideoState() == 1) {
                z = true;
            }
            b2.a(this, z);
        }
    }

    private void weexLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e54965d4", new Object[]{this, str});
        } else if (getMUSInstance() != null) {
            r.a(getMUSInstance().getInstanceId(), TAG, str).a();
        } else {
            TLog.loge(LOG_MODULE, TAG, str);
        }
    }

    private void setupListener(VideoPlatformView videoPlatformView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9db77", new Object[]{this, videoPlatformView});
            return;
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null) {
            return;
        }
        dWInstance.setFirstRenderAdapter(videoPlatformView);
        this.mTBDWInstance.setVideoLifecycleListener(videoPlatformView);
        if (this.mLoop) {
            this.mTBDWInstance.setIVideoLoopCompleteListener(videoPlatformView);
        }
        this.mTBDWInstance.setRootViewClickListener(videoPlatformView);
        this.mTBDWInstance.setIDWMutedChangeListener(videoPlatformView);
        this.mTBDWInstance.setVideoPlayTimeListener(videoPlatformView);
    }

    private void changeVideoFrame() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e74109", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.mTBDWInstance;
        if (dWInstance == null || (i = this.mWidth) == 0 || (i2 = this.mHeight) == 0) {
            return;
        }
        dWInstance.setFrame(i, i2);
    }

    /* loaded from: classes6.dex */
    public static class VideoRootView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private a mDetachedFromWindowListener;
        private b mSizeChangedListener;
        private c mVisibilityChangedListener;

        public static /* synthetic */ Object ipc$super(VideoRootView videoRootView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 348684699) {
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode != 1389530587) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
        }

        public VideoRootView(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onSizeChanged(i, i2, i3, i4);
            b bVar = this.mSizeChangedListener;
            if (bVar == null) {
                return;
            }
            bVar.a(i, i2, i3, i4);
        }

        @Override // android.view.View
        public void onVisibilityChanged(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            } else {
                super.onVisibilityChanged(view, i);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
            } else {
                super.onDetachedFromWindow();
            }
        }

        public VideoRootView whenSizeChanged(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoRootView) ipChange.ipc$dispatch("b1a6b896", new Object[]{this, bVar});
            }
            this.mSizeChangedListener = bVar;
            return this;
        }

        public VideoRootView whenVisibilityChanged(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoRootView) ipChange.ipc$dispatch("4bdc9c68", new Object[]{this, cVar});
            }
            this.mVisibilityChangedListener = cVar;
            return this;
        }

        public VideoRootView whenDetachedFromWindow(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoRootView) ipChange.ipc$dispatch("dbc65da8", new Object[]{this, aVar});
            }
            this.mDetachedFromWindowListener = aVar;
            return this;
        }
    }
}
