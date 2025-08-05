package com.taobao.mediaplay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.support.v4.view.InputDeviceCompat;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.model.MediaConfig;
import com.taobao.mediaplay.model.MediaConfigInfo;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.model.TBLiveMSGInfo;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import tb.dde;
import tb.ddh;
import tb.kge;
import tb.mjy;
import tb.mjz;
import tb.mkb;
import tb.obw;
import tb.oyu;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.InnerStartFuncListenerImpl;

/* loaded from: classes7.dex */
public class MediaPlayCenter implements b, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMPONENT_NAME = "avcenter";
    private static final String TAG = "MediaPlayCenter";
    private Drawable backGroundSetByClient;
    private Drawable coverSetByClient;
    public AlphaAnimation mAlphaAnimation;
    private long mAnimationTime;
    public ImageView mCoverImgView;
    private MediaLifecycleType mCurrentLifecycleType;
    private boolean mDestroy;
    private boolean mDisSetRecycleListenerAtOldPath;
    private boolean mEnableSwitch;
    private boolean mEnableSwitchAB;
    private boolean mEnableSwitchABEnable;
    private boolean mEnableSwitchToNewDefinition;
    private boolean mEnableSwitchWithoutAB;
    private dde mExternFirstRenderAdapter;
    private InnerStartFuncListener mExternInnerStartFuncListener;
    private boolean mFirstFrameUpdated;
    private InnerStartFuncListener mInnerStartListener;
    private boolean mLiveRoomInit;
    private boolean mLiveRoomInitWithPreloadVideoData;
    private ddh mLogAdapter;
    private IMediaPlayer.OnVideoClickListener mMediaClickListener;
    private MediaContext mMediaContext;
    private e mMediaController;
    private com.taobao.mediaplay.player.d mMediaLoopCompleteListener;
    private com.taobao.mediaplay.player.e mMediaPlayLifecycleListener;
    private com.taobao.mediaplay.player.f mMediaRecycleListener;
    private com.taobao.mediaplay.player.j mMediaSwitchListener;
    private boolean mNeedInitSwitchControlParam;
    private f mPicController;
    private FrameLayout mRootView;
    private mjy mRootViewClickListener;
    private boolean mSetup;
    private String mSubBusinessType;
    public TaoLiveVideoView.d mSurfaceListener;
    private float mTranslationX;
    private float mTranslationY;
    private String mUsingInterface;

    /* loaded from: classes7.dex */
    public enum UpdataUrlListMode {
        INIT(0),
        REPLACE_BY_URL_ID_OF_NEW_DEFINITION(1),
        REPLACE_FORCE_OF_NEW_DEFINITION(2);
        
        private int value;

        UpdataUrlListMode(int i) {
            this.value = 0;
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        kge.a(955872707);
        kge.a(1028243835);
        kge.a(-41757031);
    }

    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(MediaPlayCenter mediaPlayCenter, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df23b697", new Object[]{mediaPlayCenter, str, str2});
        } else {
            mediaPlayCenter.log(str, str2);
        }
    }

    public static /* synthetic */ MediaContext access$100(MediaPlayCenter mediaPlayCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaContext) ipChange.ipc$dispatch("ef22d300", new Object[]{mediaPlayCenter}) : mediaPlayCenter.mMediaContext;
    }

    public static /* synthetic */ boolean access$202(MediaPlayCenter mediaPlayCenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed98fa31", new Object[]{mediaPlayCenter, new Boolean(z)})).booleanValue();
        }
        mediaPlayCenter.mFirstFrameUpdated = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(MediaPlayCenter mediaPlayCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4322ce8a", new Object[]{mediaPlayCenter})).booleanValue() : mediaPlayCenter.mDestroy;
    }

    public static /* synthetic */ f access$400(MediaPlayCenter mediaPlayCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("73a05d02", new Object[]{mediaPlayCenter}) : mediaPlayCenter.mPicController;
    }

    private MediaPlayCenter() {
        this.mEnableSwitch = false;
        this.mEnableSwitchAB = false;
        this.mEnableSwitchABEnable = false;
        this.mEnableSwitchWithoutAB = false;
        this.mNeedInitSwitchControlParam = true;
        this.mDisSetRecycleListenerAtOldPath = true;
        this.mAnimationTime = 200L;
        this.mLiveRoomInit = false;
        this.mSubBusinessType = "";
        this.mLiveRoomInitWithPreloadVideoData = true;
        this.mFirstFrameUpdated = false;
        this.mCurrentLifecycleType = MediaLifecycleType.DEFAULT;
    }

    public MediaPlayCenter(Context context) {
        this.mEnableSwitch = false;
        this.mEnableSwitchAB = false;
        this.mEnableSwitchABEnable = false;
        this.mEnableSwitchWithoutAB = false;
        this.mNeedInitSwitchControlParam = true;
        this.mDisSetRecycleListenerAtOldPath = true;
        this.mAnimationTime = 200L;
        this.mLiveRoomInit = false;
        this.mSubBusinessType = "";
        this.mLiveRoomInitWithPreloadVideoData = true;
        this.mFirstFrameUpdated = false;
        this.mCurrentLifecycleType = MediaLifecycleType.DEFAULT;
        this.mMediaContext = new MediaContext(context);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "new MediaPlayCenter=" + this + ", mMediaContext=" + this.mMediaContext);
        this.mMediaContext.mMediaPlayContext = new MediaPlayControlContext(context);
        this.mMediaContext.genPlayToken(false);
        this.mRootView = new FrameLayout(context);
        if (oyu.k() >= 0) {
            this.mRootView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        } else {
            this.mRootView.setBackgroundColor(-16777216);
        }
        this.mDisSetRecycleListenerAtOldPath = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "disSetRecycleOldPath", "true"));
        initSwitchStreamParamIfNeeded();
    }

    public void setsetBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9867e687", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setBackgroundColor(i);
    }

    public void setBackgroundResource(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e14d89", new Object[]{this, drawable});
            return;
        }
        this.backGroundSetByClient = drawable;
        if (this.mRootView == null || !this.mMediaContext.mEnableNewTBPlayer) {
            return;
        }
        this.mRootView.setBackground(this.backGroundSetByClient);
    }

    public void setTranslation(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae597476", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mTranslationX += f;
        this.mTranslationY += f2;
    }

    public void setLogAdapter(ddh ddhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e4f8fc", new Object[]{this, ddhVar});
        } else {
            this.mLogAdapter = ddhVar;
        }
    }

    private void log(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{this, str, str2});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "this: " + this + ", " + str2);
    }

    public void setup() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mediaPlayCenter=" + this + ", setup called");
        if (this.mSetup) {
            return;
        }
        this.mSetup = true;
        if (TextUtils.isEmpty(this.mUsingInterface)) {
            this.mMediaContext.mUsingInterface = COMPONENT_NAME;
        } else {
            this.mMediaContext.mUsingInterface = this.mUsingInterface + "." + COMPONENT_NAME;
        }
        if (!checkParams()) {
            if (MediaSystemUtils.isApkDebuggable()) {
                if (this.mMediaContext.getUTParams() != null) {
                    str = "";
                    for (Map.Entry<String, String> entry : this.mMediaContext.getUTParams().entrySet()) {
                        str = str + entry.getKey() + "=" + entry.getValue() + ";";
                    }
                } else {
                    str = "";
                }
                MediaContext mediaContext = this.mMediaContext;
                if (mediaContext != null) {
                    com.taobao.taobaoavsdk.util.c.c(mediaContext.mMediaPlayContext.mTLogAdapter, " please set mBizCode , mVideoSource and  mVideoId parameters" + str);
                }
            } else {
                MediaContext mediaContext2 = this.mMediaContext;
                if (mediaContext2 != null) {
                    com.taobao.taobaoavsdk.util.c.c(mediaContext2.mMediaPlayContext.mTLogAdapter, "  please set mBizCode , mVideoSource and  mVideoId parameters" + this.mMediaContext.mMediaPlayContext.getVideoUrl());
                }
            }
        }
        if (this.mMediaController != null) {
            return;
        }
        this.mMediaController = new e(this.mMediaContext);
        dde ddeVar = this.mExternFirstRenderAdapter;
        if (ddeVar != null) {
            this.mMediaController.a(ddeVar);
            this.mExternFirstRenderAdapter = null;
        }
        InnerStartFuncListener innerStartFuncListener = this.mExternInnerStartFuncListener;
        if (innerStartFuncListener != null) {
            this.mMediaController.a(innerStartFuncListener);
            this.mExternInnerStartFuncListener = null;
        }
        this.mMediaController.a(this.mRootViewClickListener);
        this.mMediaController.a(this);
        TaoLiveVideoView.d dVar = this.mSurfaceListener;
        if (dVar != null) {
            this.mMediaController.a(dVar);
        }
        this.mRootView.addView(this.mMediaController.a(), 0, new FrameLayout.LayoutParams(-1, -1, 17));
        if (this.mRootView != null && this.mMediaController.a() != null && this.mMediaContext.mEnableNewTBPlayer) {
            this.mMediaController.a(this.mTranslationX, this.mTranslationY);
        }
        this.mMediaController.b(this.mMediaContext.mMediaPlayContext.isMute());
        this.mMediaController.e(this.mMediaContext.mMediaPlayContext.isLiveDefinitionAutoSwitch());
        if (this.mMediaLoopCompleteListener != null) {
            this.mMediaContext.getVideo().a(this.mMediaLoopCompleteListener);
        }
        if (this.mMediaPlayLifecycleListener != null) {
            this.mMediaContext.getVideo().a(this.mMediaPlayLifecycleListener);
        }
        if (this.mMediaClickListener != null) {
            this.mMediaContext.getVideo().a(this.mMediaClickListener);
        }
        com.taobao.mediaplay.player.f fVar = this.mMediaRecycleListener;
        if (fVar != null) {
            if (this.mDisSetRecycleListenerAtOldPath) {
                this.mMediaController.a(fVar);
                this.mMediaRecycleListener = null;
            } else {
                this.mMediaContext.getVideo().a(this.mMediaRecycleListener);
            }
        }
        com.taobao.mediaplay.player.j jVar = this.mMediaSwitchListener;
        if (jVar != null) {
            this.mMediaController.a(jVar);
        }
        if (this.mMediaContext.mEnablePlayInBackground == 0 || this.mMediaContext.mEnablePlayInBackground == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put(MediaConstant.CMD_ENABLE_AUTO_PAUSE_IN_BACKGROUND, "" + this.mMediaContext.mEnablePlayInBackground);
            this.mMediaController.b(hashMap);
        }
        MediaContext mediaContext3 = this.mMediaContext;
        mediaContext3.mEnablePlayInBackground = -1;
        if (this.mLogAdapter == null && !mediaContext3.mEnableNewTBPlayer) {
            return;
        }
        this.mMediaContext.getVideo().a(new com.taobao.mediaplay.player.e() { // from class: com.taobao.mediaplay.MediaPlayCenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.mediaplay.player.e
            public void onMediaProgressChanged(int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // com.taobao.mediaplay.player.e
            public void onMediaStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f694024", new Object[]{this});
                } else {
                    MediaPlayCenter.access$000(MediaPlayCenter.this, null, "onMediaStart");
                }
            }

            @Override // com.taobao.mediaplay.player.e
            public void onMediaPause(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
                    return;
                }
                MediaPlayCenter mediaPlayCenter = MediaPlayCenter.this;
                MediaPlayCenter.access$000(mediaPlayCenter, null, "onMediaPause " + z);
            }

            @Override // com.taobao.mediaplay.player.e
            public void onMediaPlay() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c715ea20", new Object[]{this});
                } else {
                    MediaPlayCenter.access$000(MediaPlayCenter.this, null, "onMediaPlay");
                }
            }

            @Override // com.taobao.mediaplay.player.e
            public void onMediaSeekTo(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
                    return;
                }
                MediaPlayCenter mediaPlayCenter = MediaPlayCenter.this;
                MediaPlayCenter.access$000(mediaPlayCenter, null, "onMediaSeekTo " + i);
            }

            @Override // com.taobao.mediaplay.player.e
            public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
                    return;
                }
                MediaPlayCenter mediaPlayCenter = MediaPlayCenter.this;
                MediaPlayCenter.access$000(mediaPlayCenter, null, "onMediaPrepared " + iMediaPlayer);
            }

            @Override // com.taobao.mediaplay.player.e
            public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                    return;
                }
                if (MediaPlayCenter.access$100(MediaPlayCenter.this) != null && MediaPlayCenter.access$100(MediaPlayCenter.this).mEnableNewTBPlayer) {
                    MediaPlayCenter mediaPlayCenter = MediaPlayCenter.this;
                    mediaPlayCenter.updateCoverImg(mediaPlayCenter.getCurrentFrame());
                    MediaPlayCenter.this.setMediaLifecycleType(MediaLifecycleType.BEFORE);
                }
                MediaPlayCenter mediaPlayCenter2 = MediaPlayCenter.this;
                MediaPlayCenter.access$000(mediaPlayCenter2, null, "onMediaError " + iMediaPlayer + "what: " + i + ", extra: " + i2);
            }

            @Override // com.taobao.mediaplay.player.e
            public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
                    return;
                }
                if (j == 12101) {
                    MediaPlayCenter.access$202(MediaPlayCenter.this, true);
                    MediaPlayCenter.this.setMediaLifecycleType(MediaLifecycleType.PLAY);
                }
                MediaPlayCenter mediaPlayCenter = MediaPlayCenter.this;
                MediaPlayCenter.access$000(mediaPlayCenter, null, "onMediaInfo " + iMediaPlayer + "what: " + j + ", extra: " + j2 + ", ext: " + j3 + ", obj: " + obj);
            }

            @Override // com.taobao.mediaplay.player.e
            public void onMediaComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3cf4b25", new Object[]{this});
                } else {
                    MediaPlayCenter.access$000(MediaPlayCenter.this, null, "onMediaComplete");
                }
            }

            @Override // com.taobao.mediaplay.player.e
            public void onMediaClose() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("71919eba", new Object[]{this});
                } else {
                    MediaPlayCenter.access$000(MediaPlayCenter.this, null, "onMediaClose");
                }
            }

            @Override // com.taobao.mediaplay.player.e
            public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
                    return;
                }
                MediaPlayCenter mediaPlayCenter = MediaPlayCenter.this;
                MediaPlayCenter.access$000(mediaPlayCenter, null, "onMediaScreenChanged " + mediaPlayScreenType);
            }
        });
    }

    private boolean checkParams() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63bd6239", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.getFrom()) || TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mVideoSource) || TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mVideoId)) {
            com.taobao.taobaoavsdk.util.c.b("TBDWInstance", "缺少必填参数 bizCode、videoSource、videoId！！");
            MediaPlayControlContext mediaPlayControlContext = this.mMediaContext.mMediaPlayContext;
            log(null, "checkParams from: " + mediaPlayControlContext.getFrom() + ", videoSource: " + mediaPlayControlContext.mVideoSource + ", videoId: " + mediaPlayControlContext.mVideoId);
        }
        if (TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.getFrom())) {
            this.mMediaContext.mMediaPlayContext.setFrom("default");
        }
        if (!TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.getVideoUrl()) && TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mVideoId) && "TBVideo".equals(this.mMediaContext.mMediaPlayContext.mVideoSource)) {
            try {
                String rawPath = new URI(this.mMediaContext.mMediaPlayContext.getVideoUrl()).getRawPath();
                int lastIndexOf = rawPath.lastIndexOf(47);
                int lastIndexOf2 = rawPath.lastIndexOf(46);
                if (lastIndexOf >= 0 && lastIndexOf2 >= 0 && (i = lastIndexOf + 1) < rawPath.length() && lastIndexOf2 > i) {
                    this.mMediaContext.mMediaPlayContext.mVideoId = rawPath.substring(i, lastIndexOf2);
                }
            } catch (Exception unused) {
            }
        }
        return !TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mVideoId);
    }

    private void initMediaMode(MediaType mediaType) {
        com.taobao.mediaplay.player.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155fa7d9", new Object[]{this, mediaType});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        mediaContext.mMediaType = mediaType;
        if (this.mMediaController != null) {
            return;
        }
        this.mMediaController = new e(mediaContext);
        this.mMediaController.a(this.mRootViewClickListener);
        this.mRootView.addView(this.mMediaController.a(), new FrameLayout.LayoutParams(-1, -1, 17));
        this.mMediaContext.getVideo().a(this.mMediaLoopCompleteListener);
        this.mMediaContext.getVideo().a(this.mMediaPlayLifecycleListener);
        this.mMediaContext.getVideo().a(this.mMediaClickListener);
        if (this.mDisSetRecycleListenerAtOldPath && (fVar = this.mMediaRecycleListener) != null) {
            this.mMediaController.a(fVar);
            this.mMediaRecycleListener = null;
            return;
        }
        this.mMediaContext.getVideo().a(this.mMediaRecycleListener);
    }

    private void initPicMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276d9924", new Object[]{this});
            return;
        }
        this.mMediaContext.setMediaType(MediaType.PIC);
        this.mPicController = new f(this.mMediaContext);
        this.mRootView.addView(this.mPicController.a(), new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public void warmupLiveStream(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "warmupLiveStream sys:" + System.currentTimeMillis());
        if (this.mMediaController == null) {
            return;
        }
        if (MediaAdapteManager.mConfigAdapter != null && !com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", MediaConstant.ORANGE_ENABLE_WARMUP, "true"))) {
            return;
        }
        if (mediaLiveWarmupConfig != null) {
            this.mMediaController.a(mediaLiveWarmupConfig);
        } else {
            this.mMediaController.a(new MediaLiveWarmupConfig());
        }
    }

    public void updateLiveMediaInfoData(MediaLiveInfo mediaLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21553a6f", new Object[]{this, mediaLiveInfo});
            return;
        }
        log(null, "updateLiveMediaInfoData");
        this.mMediaContext.mMediaPlayContext.mMediaLiveInfo = mediaLiveInfo;
        pareseMediaConfigData(this.mMediaContext.mMediaPlayContext.mMediaLiveInfo);
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.d();
    }

    private void pareseMediaConfigData(MediaLiveInfo mediaLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26be7002", new Object[]{this, mediaLiveInfo});
            return;
        }
        log(null, "pareseMediaConfigData");
        if (mediaLiveInfo == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(mediaLiveInfo.mediaConfig)) {
                return;
            }
            mediaLiveInfo.mMediaConfigData = new MediaConfig();
            mediaLiveInfo.mMediaConfigData.mediaConfigInfoList = (ArrayList) JSONObject.parseArray(mediaLiveInfo.mediaConfig, MediaConfigInfo.class);
        } catch (Throwable unused) {
        }
    }

    public void setTBLiveMSGInfo(TBLiveMSGInfo tBLiveMSGInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e025e64", new Object[]{this, tBLiveMSGInfo});
        } else {
            this.mMediaContext.mMediaPlayContext.mLiveMSGInfo = tBLiveMSGInfo;
        }
    }

    public void changeQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d518e58d", new Object[]{this, new Integer(i)});
            return;
        }
        log(null, "pareseMediaConfigData index: " + i);
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.b(i);
    }

    public void setMediaType(MediaType mediaType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb6a3de", new Object[]{this, mediaType});
        } else if (!this.mSetup) {
            this.mMediaContext.setMediaType(mediaType);
        } else if (this.mDestroy) {
        } else {
            if (this.mMediaContext.getMediaType() == MediaType.PIC && mediaType != MediaType.PIC) {
                this.mMediaContext.setMediaType(mediaType);
                initMediaMode(mediaType);
            } else if ((this.mMediaContext.getMediaType() != MediaType.VIDEO && this.mMediaContext.getMediaType() != MediaType.LIVE) || this.mMediaController == null || mediaType != MediaType.PIC) {
            } else {
                this.mMediaContext.setMediaType(MediaType.PIC);
                if (this.mPicController == null) {
                    initPicMode();
                } else {
                    this.mMediaController.a(MediaLifecycleType.BEFORE);
                }
            }
        }
    }

    public void setMediaLifecycleListener(com.taobao.mediaplay.player.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2569a67d", new Object[]{this, eVar});
            return;
        }
        log(null, "setMediaLifecycleListener " + eVar);
        this.mMediaPlayLifecycleListener = eVar;
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.getVideo() == null) {
            return;
        }
        this.mMediaContext.getVideo().a(eVar);
    }

    public void setMediaLoopCompleteListener(com.taobao.mediaplay.player.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d784e7", new Object[]{this, dVar});
            return;
        }
        log(null, "setMediaLoopCompleteListener " + dVar);
        this.mMediaLoopCompleteListener = dVar;
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.getVideo() == null) {
            return;
        }
        this.mMediaContext.getVideo().a(dVar);
    }

    public void setVideoRecycleListener(com.taobao.mediaplay.player.f fVar) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785ac96a", new Object[]{this, fVar});
            return;
        }
        log(null, "registerVideoRecycleListener " + fVar);
        this.mMediaRecycleListener = fVar;
        if (this.mDisSetRecycleListenerAtOldPath) {
            if (fVar == null || (eVar = this.mMediaController) == null) {
                return;
            }
            eVar.a(fVar);
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.getVideo() == null) {
            return;
        }
        this.mMediaContext.getVideo().a(fVar);
    }

    public void unregisterVideoRecycleListener(com.taobao.mediaplay.player.f fVar) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca24a450", new Object[]{this, fVar});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "unRegisterRecycleListener " + fVar);
        if (fVar == null || (eVar = this.mMediaController) == null) {
            return;
        }
        eVar.b(fVar);
        this.mMediaRecycleListener = null;
    }

    public void setSEIVideoClickListener(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc0248d", new Object[]{this, onVideoClickListener});
            return;
        }
        log(null, "setSEIVideoClickListener " + onVideoClickListener);
        this.mMediaClickListener = onVideoClickListener;
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.getVideo() == null || onVideoClickListener == null) {
            return;
        }
        this.mMediaContext.getVideo().a(onVideoClickListener);
    }

    public void setIMediaLoopCompleteListener(com.taobao.mediaplay.player.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b799b2c", new Object[]{this, dVar});
            return;
        }
        log(null, "setIMediaLoopCompleteListener " + dVar);
        this.mMediaLoopCompleteListener = dVar;
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.getVideo() == null) {
            return;
        }
        this.mMediaContext.getVideo().a(dVar);
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mRootView;
    }

    public void setHardwareAvc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef3b3a9", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setHardwareAvc " + z + ", setup: " + this.mSetup);
        if (this.mSetup || this.mMediaContext.mMediaPlayContext == null) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.setHardwareAvc(z);
    }

    public String getVideoToken() {
        e eVar;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this}) : (this.mSetup && (eVar = this.mMediaController) != null) ? eVar.o() : "";
    }

    public String getPlayToken() {
        MediaContext mediaContext;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dbb989ea", new Object[]{this}) : (this.mSetup && (mediaContext = this.mMediaContext) != null) ? mediaContext.mPlayToken : "";
    }

    public void setVideoToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bedad1", new Object[]{this, str});
            return;
        }
        log(null, "setVideoToken " + str + ", setup: " + this.mSetup);
        if (this.mSetup || this.mMediaContext == null) {
            return;
        }
        if (MediaAdapteManager.mConfigAdapter != null && !com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", MediaConstant.ORANGE_ENABLE_AVSDK_EXTERN_TOKEN, "true"))) {
            return;
        }
        this.mMediaContext.setVideoToken(str);
    }

    public void setUserId(String str) {
        MediaContext mediaContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        log(null, "setUserId " + str + ", setup: " + this.mSetup);
        if (this.mSetup || (mediaContext = this.mMediaContext) == null) {
            return;
        }
        mediaContext.mUserId = str;
    }

    public void toggleScreen() {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
            return;
        }
        log(null, "toggleScreen setup: " + this.mSetup);
        if (!this.mSetup || (eVar = this.mMediaController) == null) {
            return;
        }
        eVar.b();
    }

    public void setEmbedLivePlay(boolean z) {
        MediaContext mediaContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964f3a96", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setEmbedLivePlay " + z + ", setup: " + this.mSetup);
        if (this.mSetup || (mediaContext = this.mMediaContext) == null || mediaContext.mMediaPlayContext == null) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.mEmbed = z;
    }

    public void setHardwareHevc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3393b9", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setHardwareHevc " + z + ", setup: " + this.mSetup);
        if (this.mSetup || this.mMediaContext.mMediaPlayContext == null) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.setHardwareHevc(z);
    }

    public void updateCoverImg(final Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a47b32", new Object[]{this, bitmap});
            return;
        }
        ImageView imageView = this.mCoverImgView;
        if (imageView != null) {
            imageView.post(new Runnable() { // from class: com.taobao.mediaplay.MediaPlayCenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (MediaPlayCenter.this.mCoverImgView != null) {
                        MediaPlayCenter.this.mCoverImgView.setImageBitmap(bitmap);
                    }
                    if (!MediaPlayCenter.access$300(MediaPlayCenter.this)) {
                        return;
                    }
                    MediaPlayCenter.this.mCoverImgView = null;
                }
            });
        } else if (bitmap == null) {
        } else {
            setCoverImg(new BitmapDrawable(bitmap), true);
        }
    }

    public void setCoverImg(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1014bb", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        this.coverSetByClient = drawable;
        log(null, "setCoverImg coverDrawable=" + drawable + ", bFullscreen=" + z + ", mPicController=" + this.mPicController);
        if (this.mPicController == null || this.mCoverImgView == null) {
            this.mPicController = new f(this.mMediaContext);
            this.mCoverImgView = new ImageView(this.mMediaContext.getContext());
            this.mPicController.a(this.mCoverImgView);
            this.mRootView.addView(this.mPicController.a(), new FrameLayout.LayoutParams(-1, -1, 17));
            this.mPicController.a().bringToFront();
        }
        if (!this.mFirstFrameUpdated) {
            setMediaLifecycleType(MediaLifecycleType.BEFORE);
        }
        if (z) {
            this.mCoverImgView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.mCoverImgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.mCoverImgView.setLayoutParams(layoutParams);
        }
        if (oyu.k() >= 0) {
            this.mCoverImgView.setBackgroundColor(-65536);
        } else {
            this.mCoverImgView.setImageDrawable(drawable);
        }
    }

    public void setMediaLifecycleType(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d26f66e", new Object[]{this, mediaLifecycleType});
            return;
        }
        log(null, "setMediaLifecycleType " + mediaLifecycleType);
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.a(mediaLifecycleType);
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        log(null, "start destroy: " + this.mDestroy + ", setup: " + this.mSetup + ", sys: " + System.currentTimeMillis());
        if (this.mDestroy || !this.mSetup) {
            return;
        }
        if (this.mMediaController != null) {
            setInnerStartFuncListener();
            this.mMediaController.t();
        }
        AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "start finish sys:" + System.currentTimeMillis());
    }

    public void prepareToFirstFrame() {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        log(null, "prepareToFirstFrame destroy: " + this.mDestroy + ", setup: " + this.mSetup);
        if (this.mDestroy || !this.mSetup || (eVar = this.mMediaController) == null) {
            return;
        }
        eVar.u();
    }

    public void pause() {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        log(null, "pause destroy: " + this.mDestroy + ", setup: " + this.mSetup);
        if (this.mDestroy || !this.mSetup || (eVar = this.mMediaController) == null) {
            return;
        }
        eVar.k();
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        log(null, "seekTo " + i);
        e eVar = this.mMediaController;
        if (eVar != null) {
            eVar.a(i);
        } else {
            this.mMediaContext.mMediaPlayContext.mSeekWhenPrepared = i;
        }
    }

    public void seekTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3275fcb", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.mMediaController == null) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaController.seekTo");
            this.mMediaController.a(i, z, false);
        }
    }

    public void seekTo(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c54c69", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else if (this.mMediaController == null) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaController.seekTo");
            this.mMediaController.a(i, z, z2);
        }
    }

    public void registerOnVideoClickListener(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae58360", new Object[]{this, onVideoClickListener});
            return;
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.a(onVideoClickListener);
    }

    public void unregisterOnVideoClickListener(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16429a7", new Object[]{this, onVideoClickListener});
            return;
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.b(onVideoClickListener);
    }

    public void setPicImageView(ImageView imageView) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
        } else if (imageView == null || (fVar = this.mPicController) == null) {
        } else {
            fVar.a(imageView);
        }
    }

    public void setRootViewClickListener(mjy mjyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76796f2e", new Object[]{this, mjyVar});
            return;
        }
        this.mRootViewClickListener = mjyVar;
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.a(this.mRootViewClickListener);
    }

    public void setMediaUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a47c3e", new Object[]{this, str});
            return;
        }
        log(null, "setMediaUrl " + str);
        this.mMediaContext.mMediaPlayContext.setVideoUrl(str);
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.e();
    }

    public void setLocalVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf85c9b", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setLocalVideo " + z + ", setup: " + this.mSetup);
        if (this.mSetup) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.mLocalVideo = z;
    }

    public void setRenderType(boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316df248", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.mSetup) {
        } else {
            MediaContext mediaContext = this.mMediaContext;
            mediaContext.mVRRenderType = i;
            mediaContext.mVRLive = z;
            mediaContext.mVRLng = i2;
            mediaContext.mVRLat = i3;
        }
    }

    public void setPropertyFloat(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c3a069", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        log(null, "setPropertyFloat property:" + i + ", value: " + f);
        if (this.mMediaContext.getVideo() == null) {
            return;
        }
        this.mMediaContext.getVideo().a(i, f);
    }

    public void setPropertyLong(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5ff41b", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        log(null, "setPropertyLong property:" + i + ", value: " + j);
        if (this.mMediaContext.getVideo() == null) {
            return;
        }
        this.mMediaContext.getVideo().a(i, j);
    }

    public void setMediaId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1608c02e", new Object[]{this, str});
            return;
        }
        log(null, "setMediaId " + str);
        this.mMediaContext.mMediaPlayContext.mVideoId = str;
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.b(str);
        this.mMediaController.f();
    }

    public void setAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
            return;
        }
        log(null, "setAccountId " + str);
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && mediaContext.mMediaPlayContext != null) {
            this.mMediaContext.mMediaPlayContext.mAccountId = str;
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.c(str);
    }

    public void setNeedPlayControlView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b4ae57", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setNeedPlayControlView " + z);
        this.mMediaContext.setNeedPlayControlView(z);
    }

    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setVideoLoop " + z);
        this.mMediaContext.mLoop = z;
    }

    public void setMediaSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6109aa2e", new Object[]{this, str});
            return;
        }
        log(null, "setMediaSource " + str);
        this.mMediaContext.mMediaPlayContext.mVideoSource = str;
    }

    public void setUseArtp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5989b", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setUseArtp " + z);
        this.mMediaContext.mMediaPlayContext.setUseArtp(false);
    }

    public void setUseBfrtc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7977a955", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setUseBfrtc " + z);
        this.mMediaContext.mMediaPlayContext.setUseBfrtc(z);
    }

    public void setUseRtcLive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d482b6c5", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setUseRtcLive " + z);
        this.mMediaContext.mMediaPlayContext.setUseRtcLive(z);
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        log(null, "setBizCode " + str);
        if (TextUtils.isEmpty(this.mSubBusinessType)) {
            this.mSubBusinessType = str;
        }
        this.mMediaContext.mMediaPlayContext.setFrom(str);
    }

    public void setScenarioType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557a670", new Object[]{this, new Integer(i)});
            return;
        }
        log(null, "setScenarioType " + i);
        this.mMediaContext.mScenarioType = i;
    }

    public void setBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
            return;
        }
        log(null, "setBusinessId " + str);
        if (this.mSetup) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.setBusinessId(str);
    }

    public void setConfigGroup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13da7aec", new Object[]{this, str});
            return;
        }
        log(null, "setConfigGroup " + str);
        this.mMediaContext.mMediaPlayContext.mConfigGroup = str;
    }

    public void setMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        mute(z);
        log(null, "setMute " + z);
    }

    public void setH265Enable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac81cdff", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setH265Enable " + z + ", setup:" + this.mSetup);
        if (this.mSetup) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.mH265Enable = z;
    }

    public void setPlayerType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e501bf", new Object[]{this, new Integer(i)});
            return;
        }
        log(null, "setPlayerType " + i);
        this.mMediaContext.mMediaPlayContext.setPlayerType(i);
    }

    public void setShowNoWifiToast(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409a031b", new Object[]{this, new Boolean(z)});
        } else {
            this.mMediaContext.mbShowNoWifiToast = z;
        }
    }

    public void addPlayExpUtParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d20b9f", new Object[]{this, hashMap});
            return;
        }
        this.mMediaContext.addPlayExpUtParams(hashMap);
        if (hashMap == null || !obw.VIDEO_ACTION_TYPE_UPDOWNSWITCH.equals(hashMap.get("liveActionType"))) {
            return;
        }
        this.mLiveRoomInit = false;
    }

    public void addCustomParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
        } else {
            this.mMediaContext.addCustomParam(hashMap);
        }
    }

    public void addControlParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0193d6a", new Object[]{this, hashMap});
            return;
        }
        this.mMediaContext.addControlParams(hashMap);
        if (hashMap == null) {
            return;
        }
        if (!TextUtils.isEmpty(hashMap.get("LiveRoomInit"))) {
            this.mLiveRoomInit = com.taobao.taobaoavsdk.util.b.a(hashMap.get("LiveRoomInit"));
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaPlayCenter: get LiveRoomInit=" + this.mLiveRoomInit + " from addControlParams");
        }
        if (TextUtils.isEmpty(hashMap.get("hasPreloadVideoData"))) {
            return;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("fromRecmd", "1");
        addPlayExpUtParams(hashMap2);
        this.mLiveRoomInitWithPreloadVideoData = com.taobao.taobaoavsdk.util.b.a(hashMap.get("hasPreloadVideoData"));
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaPlayCenter: get mLiveRoomInitWithPreloadVideoData=" + this.mLiveRoomInitWithPreloadVideoData + " from addControlParams");
        if (this.mLiveRoomInitWithPreloadVideoData || !com.taobao.taobaoavsdk.util.e.n) {
            return;
        }
        setForceUseSurfaceView(true);
    }

    public void setConnectTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabec0e3", new Object[]{this, new Integer(i)});
        } else {
            this.mMediaContext.mConnectTimeout = i;
        }
    }

    public void setReadTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d585fd3", new Object[]{this, new Integer(i)});
        } else {
            this.mMediaContext.mReadTimeout = i;
        }
    }

    public void setRetryTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc93e9", new Object[]{this, new Integer(i)});
        } else {
            this.mMediaContext.mRetryTime = i;
        }
    }

    public void setMediaAspectRatio(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e63654", new Object[]{this, mediaAspectRatio});
            return;
        }
        log(null, "setMediaAspectRatio " + mediaAspectRatio);
        this.mMediaContext.setMediaAspectRatio(mediaAspectRatio);
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.getVideo() == null) {
            return;
        }
        this.mMediaContext.getVideo().a(mediaAspectRatio);
    }

    public void setNeedScreenButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f4adf7", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setNeedScreenButton " + z);
        if (this.mSetup) {
            return;
        }
        this.mMediaContext.mNeedScreenButton = z;
    }

    public void setAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474dba2b", new Object[]{this, onAudioFocusChangeListener});
            return;
        }
        log(null, "setAudioFocusChangeListener " + onAudioFocusChangeListener);
        this.mMediaContext.mAudioFocusChangeListener = onAudioFocusChangeListener;
    }

    public void setMediaSourceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b423788", new Object[]{this, str});
            return;
        }
        log(null, "setMediaSourceType " + str);
        this.mMediaContext.mMediaPlayContext.mMediaSourceType = str;
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.a(str);
    }

    public void addFullScreenCustomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
            return;
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.a(view);
    }

    public void removeFullScreenCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
            return;
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.g();
    }

    public void showController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccfe280", new Object[]{this});
            return;
        }
        log(null, "showController");
        this.mMediaContext.hideControllerView(false);
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.h();
    }

    public void hideController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8830805", new Object[]{this});
            return;
        }
        log(null, "hideController");
        this.mMediaContext.hideControllerView(true);
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.i();
    }

    public Bitmap getCurrentFrame() {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        Bitmap bitmap = null;
        if (!this.mSetup) {
            return null;
        }
        e eVar = this.mMediaController;
        if (eVar != null) {
            bitmap = eVar.j();
        }
        if (bitmap != null || (drawable = this.coverSetByClient) == null) {
            return bitmap;
        }
        try {
            return ((BitmapDrawable) drawable).getBitmap();
        } catch (Exception e) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCurrentFrame failed when getBitmap from coverSetByClient, error=" + e.toString());
            return bitmap;
        }
    }

    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        log(null, "setPlayRate " + f);
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.getVideo() == null) {
            return;
        }
        this.mMediaContext.getVideo().a(f);
    }

    public void hiddenPlayingIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dea5790", new Object[]{this, new Boolean(z)});
        } else if (this.mSetup) {
        } else {
            this.mMediaContext.mHiddenPlayingIcon = z;
        }
    }

    public void hiddenMiniProgressBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f628b388", new Object[]{this, new Boolean(z)});
        } else if (this.mSetup) {
        } else {
            this.mMediaContext.mHiddenMiniProgressBar = z;
        }
    }

    public void enableVideoClickDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d143b09a", new Object[]{this, new Boolean(z)});
        } else if (this.mMediaContext.getVideo() == null) {
        } else {
            this.mMediaContext.getVideo().a(z);
        }
    }

    public void blockTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70e7d25", new Object[]{this, new Boolean(z)});
        } else if (this.mMediaContext.getVideo() == null) {
        } else {
            this.mMediaContext.getVideo().b(z);
        }
    }

    public void hiddenThumbnailPlayBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9671b927", new Object[]{this, new Boolean(z)});
        } else if (this.mSetup) {
        } else {
            this.mMediaContext.mHiddenThumbnailPlayBtn = z;
        }
    }

    public void hiddenLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8b063b", new Object[]{this, new Boolean(z)});
        } else if (this.mSetup) {
        } else {
            this.mMediaContext.mHiddenLoading = z;
        }
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return false;
        }
        return eVar.l();
    }

    public boolean isInPlaybackState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f2d892", new Object[]{this})).booleanValue();
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return false;
        }
        return eVar.m();
    }

    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return 0;
        }
        return eVar.n();
    }

    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return 0;
        }
        return eVar.p();
    }

    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return 0;
        }
        return eVar.q();
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && mediaContext.mMediaPlayContext != null) {
            log(null, " MediaPlayCenter, sbt=" + this.mMediaContext.mMediaPlayContext.getFrom() + ",setMute=" + z);
            this.mMediaContext.mMediaPlayContext.mute(z);
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.b(z);
    }

    public void release() {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " call release");
        this.mSetup = false;
        this.mInnerStartListener = null;
        this.mExternInnerStartFuncListener = null;
        e eVar = this.mMediaController;
        if (eVar != null) {
            eVar.v();
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null) {
            if (mediaContext.mEnableNewTBPlayer) {
                updateCoverImg(getCurrentFrame());
                setMediaLifecycleType(MediaLifecycleType.BEFORE);
            }
            this.mMediaContext.release();
        }
        this.mNeedInitSwitchControlParam = true;
        this.mMediaSwitchListener = null;
        if (!"homepageLiveCard".equals(this.mSubBusinessType) || (fVar = this.mPicController) == null) {
            return;
        }
        startViewFadeAnimation(fVar.a());
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        log(null, "destroy");
        this.mDestroy = true;
        e eVar = this.mMediaController;
        if (eVar != null) {
            eVar.r();
        }
        AlphaAnimation alphaAnimation = this.mAlphaAnimation;
        if (alphaAnimation == null) {
            return;
        }
        alphaAnimation.cancel();
    }

    @Override // com.taobao.mediaplay.b
    public void onLifecycleChanged(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0fa27", new Object[]{this, mediaLifecycleType});
        } else if (mediaLifecycleType == this.mCurrentLifecycleType) {
        } else {
            if (mediaLifecycleType == MediaLifecycleType.PLAY) {
                if (this.mPicController == null) {
                    return;
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaPlayCenter onLifecycleChanged " + mediaLifecycleType + ", hide cover start");
                if (this.mLiveRoomInit) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaPlayCenter onLifecycleChanged " + mediaLifecycleType + ", hide cover start postdelay");
                    final ExecutorService a2 = com.taobao.taobaoavsdk.util.a.a();
                    Executors.newScheduledThreadPool(1).schedule(new Runnable() { // from class: com.taobao.mediaplay.MediaPlayCenter.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                a2.execute(new Runnable() { // from class: com.taobao.mediaplay.MediaPlayCenter.3.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            MediaPlayCenter.this.startViewFadeAnimation(MediaPlayCenter.access$400(MediaPlayCenter.this).a());
                                        }
                                    }
                                });
                            }
                        }
                    }, 100L, TimeUnit.MILLISECONDS);
                } else {
                    startViewFadeAnimation(this.mPicController.a());
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaPlayCenter onLifecycleChanged " + mediaLifecycleType + ", hide cover finished immediatly.");
                }
                this.mCurrentLifecycleType = mediaLifecycleType;
            } else if (mediaLifecycleType != MediaLifecycleType.BEFORE || this.mPicController == null) {
            } else {
                log(null, "onLifecycleChanged " + mediaLifecycleType + ", show cover");
                AlphaAnimation alphaAnimation = this.mAlphaAnimation;
                if (alphaAnimation != null) {
                    alphaAnimation.cancel();
                }
                this.mPicController.a().setVisibility(0);
                this.mCurrentLifecycleType = mediaLifecycleType;
            }
        }
    }

    public void startViewFadeAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afd7a4a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            if (this.mAnimationTime > 0) {
                if (this.mAlphaAnimation == null) {
                    this.mAlphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    this.mAlphaAnimation.setDuration(this.mAnimationTime);
                }
                view.startAnimation(this.mAlphaAnimation);
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "the cover view set to invisible, hide cover start.");
            view.setVisibility(4);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "the cover view set to invisible, hide cover finished.");
        }
    }

    public void setFadeAnimationTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d11fea", new Object[]{this, new Long(j)});
        } else {
            this.mAnimationTime = j;
        }
    }

    public int getBufferPercentage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4a46ea", new Object[]{this})).intValue();
        }
        if (this.mMediaContext.getVideo() == null) {
            return 0;
        }
        return this.mMediaContext.getVideo().g();
    }

    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        if (this.mMediaContext.getVideo() == null) {
            return 0;
        }
        return this.mMediaContext.getVideo().e();
    }

    public float getVideoRenderPts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f9486ab", new Object[]{this})).floatValue();
        }
        if (this.mMediaContext.getVideo() == null) {
            return 0.0f;
        }
        return this.mMediaContext.getVideo().C();
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        if (this.mMediaContext.getVideo() == null) {
            return 0;
        }
        return this.mMediaContext.getVideo().d();
    }

    public String getMediaPlayUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("854e018c", new Object[]{this});
        }
        MediaContext mediaContext = this.mMediaContext;
        return (mediaContext == null || mediaContext.mMediaPlayContext == null) ? "" : this.mMediaContext.mMediaPlayContext.getVideoUrl();
    }

    public void setTransH265(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cfd2fe", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setTransH265 " + z);
        this.mMediaContext.mMediaPlayContext.setTransH265(z);
    }

    public void setLowDeviceFirstRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7972f", new Object[]{this, new Boolean(z)});
        } else {
            this.mMediaContext.mMediaPlayContext.setLowDeviceFirstRender(z);
        }
    }

    public void setSurfaceListener(TaoLiveVideoView.d dVar) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dfae78", new Object[]{this, dVar});
            return;
        }
        this.mSurfaceListener = dVar;
        if (dVar == null || (eVar = this.mMediaController) == null) {
            return;
        }
        eVar.a(dVar);
    }

    public void setRequestFullScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d390a5", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setRequestFullScreen " + z);
        this.mMediaContext.mRequestLandscape = z;
    }

    public void setFirstRenderAdapter(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d166b97d", new Object[]{this, ddeVar});
            return;
        }
        log(null, "setFirstRenderAdapter " + ddeVar);
        if (ddeVar != null) {
            this.mMediaContext.setNeedCommitUserToFirstFrame(true);
        } else {
            this.mMediaContext.setNeedCommitUserToFirstFrame(false);
        }
        e eVar = this.mMediaController;
        if (eVar != null) {
            eVar.a(ddeVar);
        } else {
            this.mExternFirstRenderAdapter = ddeVar;
        }
    }

    private void setInnerStartFuncListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2c79ed", new Object[]{this});
            return;
        }
        if (this.mInnerStartListener == null) {
            this.mInnerStartListener = new InnerStartFuncListenerImpl();
        }
        e eVar = this.mMediaController;
        if (eVar != null) {
            eVar.a(this.mInnerStartListener);
        } else {
            this.mExternInnerStartFuncListener = this.mInnerStartListener;
        }
    }

    public void setUseCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad83890", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setUseCache " + z);
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null) {
            return;
        }
        mediaContext.mUseCache = z;
    }

    public void setTBVideoSourceAdapter(mjz mjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25639743", new Object[]{this, mjzVar});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.mMediaPlayContext == null) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.mTBVideoSourceAdapter = mjzVar;
    }

    public void setMediaInfoParams(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f34241", new Object[]{this, jSONObject});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.mMediaPlayContext == null) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.mMediaInfoParams = jSONObject;
    }

    public Map<String, String> getPlayerQos() {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        if (!this.mSetup || (eVar = this.mMediaController) == null) {
            return null;
        }
        return eVar.s();
    }

    public boolean addVFPlugin(mkb mkbVar) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b34a69b", new Object[]{this, mkbVar})).booleanValue();
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_VF_PLUGIN, "true")) && (eVar = this.mMediaController) != null) {
            return eVar.a(mkbVar);
        }
        return false;
    }

    public boolean removeVFPlugin(mkb mkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e26a56fe", new Object[]{this, mkbVar})).booleanValue();
        }
        e eVar = this.mMediaController;
        if (eVar != null) {
            return eVar.b(mkbVar);
        }
        return false;
    }

    public void setStartPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f9eac8", new Object[]{this, new Integer(i)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null) {
            return;
        }
        mediaContext.setStartPos(i);
    }

    public void setRequestHeader(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39f9d24", new Object[]{this, map});
            return;
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.a(map);
    }

    private void initSwitchStreamParamIfNeeded() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711b5f42", new Object[]{this});
        } else if (!this.mNeedInitSwitchControlParam) {
        } else {
            this.mNeedInitSwitchControlParam = false;
            this.mEnableSwitchToNewDefinition = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SWITCH_TO_NEW_DEFINITION, "true"));
            this.mEnableSwitch = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SWITCH_STREAM, "true"));
            this.mEnableSwitchAB = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SWITCH_STREAM_AB, "true"));
            this.mEnableSwitchWithoutAB = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SWITCH_STREAM_WITHOUT_AB, "false"));
            try {
                VariationSet activate = UTABTest.activate("switch_component", "switch_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("enable");
                    if (variation != null) {
                        this.mEnableSwitchABEnable = variation.getValueAsBoolean(false);
                    }
                    Variation variation2 = activate.getVariation("id");
                    if (variation2 != null) {
                        this.mMediaContext.mSwitchStreamABId = variation2.getValueAsInt(0);
                    }
                }
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initSwitchStreamParamIfNeeded error: " + th.toString());
            }
            MediaContext mediaContext = this.mMediaContext;
            if (this.mEnableSwitch) {
                z = this.mEnableSwitchAB ? this.mEnableSwitchABEnable : this.mEnableSwitchWithoutAB;
            }
            mediaContext.mSwitchStreamEnable = z;
        }
    }

    private boolean canSwitchStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1ec5a4f", new Object[]{this})).booleanValue();
        }
        initSwitchStreamParamIfNeeded();
        if (!this.mEnableSwitch) {
            return false;
        }
        if (this.mEnableSwitchAB) {
            return this.mEnableSwitchABEnable;
        }
        return this.mEnableSwitchWithoutAB;
    }

    public void setUseMiniBfrtc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec720e8c", new Object[]{this, new Boolean(z)});
        } else if (!canSwitchStream()) {
        } else {
            log(null, "setUseMiniBfrtc " + z);
            this.mMediaContext.mMediaPlayContext.setUseMiniBfrtc(z);
        }
    }

    public void seamlessSwitchStream(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4aa802", new Object[]{this, new Boolean(z)});
        } else if (!canSwitchStream() || this.mMediaController == null) {
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch mediaplay center seamlessSwitchStream");
            this.mMediaController.d(z);
        }
    }

    public void switchLower(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4966f20", new Object[]{this, new Boolean(z)});
        } else if (!canSwitchLower()) {
        } else {
            this.mMediaContext.mMediaPlayContext.mSwitchingLower = true;
            seamlessSwitchStream(z);
        }
    }

    public void switchHigher(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38dfa6ea", new Object[]{this, new Boolean(z)});
        } else if (!canSwitchHigher()) {
        } else {
            this.mMediaContext.mMediaPlayContext.mSwitchingLower = false;
            seamlessSwitchStream(z);
        }
    }

    public boolean canSwitchLower() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ce32848", new Object[]{this})).booleanValue();
        }
        if (!canSwitchStream() || this.mMediaController == null) {
            return false;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch mediaplay center canSwitchLower");
        return this.mMediaController.c(true);
    }

    public boolean canSwitchHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f3551e", new Object[]{this})).booleanValue();
        }
        if (!canSwitchStream() || this.mMediaController == null) {
            return false;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch mediaplay center canSwitchHigher");
        return this.mMediaController.c(false);
    }

    public void stopSwitch() {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6621cb5d", new Object[]{this});
        } else if (!canSwitchStream() || (eVar = this.mMediaController) == null) {
        } else {
            eVar.w();
        }
    }

    public void setSeamlessSwitchUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53919393", new Object[]{this, str});
            return;
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.d(str);
    }

    public void setSeamlessSwitchOption(boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b6875c", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.a(z, i, z2);
    }

    public void setUsingInterface(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad57968", new Object[]{this, str});
        } else {
            this.mUsingInterface = str;
        }
    }

    public void setPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            this.mMediaContext.mPlayScenes = str;
        }
    }

    public void setAudioOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29a34cd", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null) {
            return;
        }
        mediaContext.setAudioOnly(z);
    }

    public void audioOff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450701c0", new Object[]{this});
            return;
        }
        e eVar = this.mMediaController;
        if (eVar != null) {
            eVar.x();
        }
        if (this.mMediaContext.mMediaPlayContext == null) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.setAudioOffFlag(true);
    }

    public void audioOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13155a5c", new Object[]{this});
            return;
        }
        e eVar = this.mMediaController;
        if (eVar != null) {
            eVar.y();
        }
        if (this.mMediaContext.mMediaPlayContext == null) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.setAudioOffFlag(false);
    }

    private HashMap<String, String> callWithMsgAndResultInner(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("168bf182", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " callWithMsg " + map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (MediaConstant.CMD_LIVE_PUSH_CONTROL_INFO.equals(key) && !TextUtils.isEmpty(value)) {
                this.mMediaContext.mLivePushControlInfo = value;
            } else if (MediaConstant.CMD_LIVE_REMOVE_CONTROL_INFO.equals(key)) {
                this.mMediaContext.mLivePushControlInfo = null;
            } else if (MediaConstant.CMD_UPDATE_PLAY_EX.equals(key) && !TextUtils.isEmpty(value)) {
                this.mMediaContext.mDynamicPlayEx = value;
            } else if (MediaConstant.CMD_SWITCH_SCENE.equals(key)) {
                MediaContext mediaContext = this.mMediaContext;
                mediaContext.mSwitchScene = value;
                mediaContext.mSwitchSceneTime = System.currentTimeMillis();
            } else if (MediaConstant.CMD_ENTER_FLOATING.equals(key)) {
                this.mMediaContext.mIsFloat = "1".equals(value);
            } else if (MediaConstant.CMD_SET_INIT_DEFINITION.equals(key)) {
                this.mMediaContext.mMediaPlayContext.mInitDefinition = value;
            } else if (MediaConstant.CMD_SET_ENABLE_ADAPTIVE_LIVE_SWITCH.equals(key)) {
                this.mMediaContext.mMediaPlayContext.mEnableAdaptiveLiveSwitch = "1".equals(value);
            } else if (MediaConstant.CMD_SET_ENTER_VOICE_ROOM.equals(key)) {
                this.mMediaContext.mEnterVoiceRoom = com.taobao.taobaoavsdk.util.b.b(value);
            } else if (MediaConstant.CMD_DISABLE_SURFACE_VIEW.equals(key)) {
                this.mMediaContext.mDisableSurfaceView = "1".equals(value);
            }
        }
        e eVar = this.mMediaController;
        String str = "0";
        if (eVar != null) {
            eVar.b(map);
        } else {
            String str2 = map.get(MediaConstant.CMD_ENABLE_AUTO_PAUSE_IN_BACKGROUND);
            if ("1".equals(str2)) {
                this.mMediaContext.mEnablePlayInBackground = 1;
            } else if (str.equals(str2)) {
                this.mMediaContext.mEnablePlayInBackground = 0;
            } else {
                this.mMediaContext.mEnablePlayInBackground = -1;
            }
        }
        if (map.containsKey("audioOff")) {
            this.mMediaContext.mMediaPlayContext.setAudioOffFlag(true);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (map.containsKey(MediaConstant.CMD_GET_LOW_SPEED_POLICY)) {
            boolean isLowNetSpeedByVpm = this.mMediaContext.mMediaPlayContext.isLowNetSpeedByVpm();
            String str3 = MediaConstant.CMD_GET_LOW_SPEED_POLICY;
            if (isLowNetSpeedByVpm) {
                str = "1";
            }
            hashMap.put(str3, str);
        } else if (map.containsKey("getEnableFlvDegrade")) {
            if ((!com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "EnableRtcAutoDegrade1", "false")) && !oyu.aJ) || !oyu.aR.contains(this.mMediaContext.mMediaPlayContext.getFrom())) {
                z = true;
            }
            if (z) {
                str = "1";
            }
            hashMap.put("getEnableFlvDegrade", str);
        }
        return hashMap;
    }

    public void callWithMsg(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
        } else {
            callWithMsgAndResultInner(map);
        }
    }

    public HashMap<String, String> callWithMsgAndResult(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("c7b19faa", new Object[]{this, map}) : callWithMsgAndResultInner(map);
    }

    public void reattach(Context context) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a117dde9", new Object[]{this, context});
            return;
        }
        log(null, "reattach " + context);
        if (!this.mSetup || (eVar = this.mMediaController) == null) {
            return;
        }
        eVar.a(context);
    }

    public void setAutoDegradedWhenError(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac54e5e", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setAutoDegradedWhenError " + z);
        this.mMediaContext.mMediaPlayContext.mAutoDegradedWhenError = z;
    }

    public void updateUrlList(List<QualityLiveItem> list, UpdataUrlListMode updataUrlListMode) {
        MediaPlayCenter mediaPlayCenter = this;
        List<QualityLiveItem> list2 = list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c845c561", new Object[]{mediaPlayCenter, list2, updataUrlListMode});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "call yezo:updateUrlList");
        if (updataUrlListMode == UpdataUrlListMode.INIT) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, mediaPlayCenter + " updateUrlList null because mode is init");
        } else if (mediaPlayCenter.mMediaContext.mMediaPlayContext == null || mediaPlayCenter.mMediaContext.mMediaPlayContext.mMediaLiveInfo == null || mediaPlayCenter.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList == null || list2 == null || list.size() == 0) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, mediaPlayCenter + " updateUrlList null");
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, mediaPlayCenter + " updateUrlList size=" + list.size() + ", mode=" + updataUrlListMode.getValue());
            boolean a2 = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_REPLAYCE_URL_FORCE_MDOE, "true"));
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, mediaPlayCenter + " updateUrlList size=" + list.size() + ", mode=" + updataUrlListMode.getValue() + ", enReplaceForce=" + a2);
            if (updataUrlListMode == UpdataUrlListMode.REPLACE_FORCE_OF_NEW_DEFINITION && !a2) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, mediaPlayCenter + " updateUrlList null by orange enReplaceForce");
                return;
            }
            int i = 0;
            while (i < mediaPlayCenter.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList.size()) {
                QualityLiveItem qualityLiveItem = mediaPlayCenter.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList.get(i);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, mediaPlayCenter + " updateUrlList before1 index=" + i + ", recomm=" + qualityLiveItem.recomm + ", newDefinition=" + qualityLiveItem.newDefinition + ", definition=" + qualityLiveItem.definition + ", name=" + qualityLiveItem.name + ", newName=" + qualityLiveItem.newName + ", rtcUrl=" + qualityLiveItem.rtcLiveUrl + ", flvUrl=" + qualityLiveItem.flvUrl + ", bfrtcUrl=" + qualityLiveItem.bfrtcUrl + ", additionUrlMap= " + qualityLiveItem.additionUrlMap + ", extInfo= " + qualityLiveItem.extInfo);
                i++;
                mediaPlayCenter = this;
            }
            int i2 = 0;
            while (i2 < list.size()) {
                QualityLiveItem qualityLiveItem2 = list2.get(i2);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " updateUrlList before2 index=" + i2 + ", recomm=" + qualityLiveItem2.recomm + ", newDefinition=" + qualityLiveItem2.newDefinition + ", definition=" + qualityLiveItem2.definition + ", name=" + qualityLiveItem2.name + ", newName=" + qualityLiveItem2.newName + ", rtcUrl=" + qualityLiveItem2.rtcLiveUrl + ", flvUrl=" + qualityLiveItem2.flvUrl + ", bfrtcUrl=" + qualityLiveItem2.bfrtcUrl + ", additionUrlMap= " + qualityLiveItem2.additionUrlMap + ", extInfo= " + qualityLiveItem2.extInfo);
                i2++;
                list2 = list;
            }
            i.a(this.mMediaContext.mMediaPlayContext.mMediaLiveInfo, list, updataUrlListMode.getValue());
            i.a(this.mMediaContext.mMediaPlayContext.mPlayerQualityItem, this.mMediaContext.mMediaPlayContext.mMediaLiveInfo);
            for (int i3 = 0; i3 < this.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList.size(); i3++) {
                QualityLiveItem qualityLiveItem3 = this.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList.get(i3);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " updateUrlList after index=" + i3 + ", recomm=" + qualityLiveItem3.recomm + ", newDefinition=" + qualityLiveItem3.newDefinition + ", definition=" + qualityLiveItem3.definition + ", name=" + qualityLiveItem3.name + ", newName=" + qualityLiveItem3.newName + ", rtcUrl=" + qualityLiveItem3.rtcLiveUrl + ", flvUrl=" + qualityLiveItem3.flvUrl + ", bfrtcUrl=" + qualityLiveItem3.bfrtcUrl + ", additionUrlMap= " + qualityLiveItem3.additionUrlMap + ", extInfo= " + qualityLiveItem3.extInfo);
            }
            if (UpdataUrlListMode.REPLACE_FORCE_OF_NEW_DEFINITION != updataUrlListMode || !this.mMediaContext.mMediaPlayContext.mEnableAdaptiveLiveSwitch) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(MediaConstant.CMD_REPLACE_FORCE_OF_NEW_DEFINITION, "1");
            if (!TextUtils.isEmpty(this.mMediaContext.mLivePushControlInfo)) {
                hashMap.put(MediaConstant.CMD_LIVE_PUSH_CONTROL_INFO, this.mMediaContext.mLivePushControlInfo);
            }
            callWithMsgAndResult(hashMap);
            boolean z = !TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mPlayerQualityItem.newDefinition);
            if (!this.mMediaContext.mMediaPlayContext.isLiveDefinitionAutoSwitch() && (UpdataUrlListMode.REPLACE_FORCE_OF_NEW_DEFINITION != updataUrlListMode || z)) {
                return;
            }
            if (this.mMediaContext.mMediaPlayContext.mPlayerQualityItem == null) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " updateUrlList return by playing url mode.");
                return;
            }
            MediaPlayControlContext mediaPlayControlContext = new MediaPlayControlContext(this.mMediaContext.getContext());
            mediaPlayControlContext.mMediaLiveInfo = this.mMediaContext.mMediaPlayContext.mMediaLiveInfo;
            mediaPlayControlContext.mTBLive = true;
            mediaPlayControlContext.setUseRtcLive(true);
            try {
                new g(mediaPlayControlContext).a(new c() { // from class: com.taobao.mediaplay.MediaPlayCenter.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.mediaplay.c
                    public void a(boolean z2, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z2), str});
                        }
                    }
                });
            } catch (Exception unused) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " updateUrlList and select url exception.");
            }
            if (mediaPlayControlContext.mPlayerQualityItem == null || ((!MediaConstant.RTCLIVE_URL_NAME.equals(mediaPlayControlContext.mSelectedUrlName) && !MediaConstant.BFRTC_URL_NAME.equals(mediaPlayControlContext.mSelectedUrlName)) || TextUtils.isEmpty(mediaPlayControlContext.mPlayerQualityItem.newDefinition))) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " updateUrlList with select no rtc url.");
            } else if (TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mPlayerQualityItem.newDefinition) || !this.mMediaContext.mMediaPlayContext.mPlayerQualityItem.newDefinition.equals(mediaPlayControlContext.mPlayerQualityItem.newDefinition)) {
                switchToNewDefinition(9, mediaPlayControlContext.mPlayerQualityItem.newDefinition);
            }
        }
    }

    public List<PlayerQualityItem> getDefinitionList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1c16f81", new Object[]{this, new Boolean(z)});
        }
        if (this.mMediaContext.mMediaPlayContext.isRtcVVC) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getDefinitionList return at isRtcVVC");
            return null;
        } else if (!MediaConstant.RTCLIVE_URL_NAME.equals(this.mMediaContext.mMediaPlayContext.mSelectedUrlName) && !MediaConstant.BFRTC_URL_NAME.equals(this.mMediaContext.mMediaPlayContext.mSelectedUrlName)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getDefinitionList return at not rtc");
            return null;
        } else if (this.mMediaContext.mMediaPlayContext.mMediaLiveInfo == null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getDefinitionList return at mMediaLiveInfo == nullc");
            return null;
        } else {
            List<PlayerQualityItem> definitionList = this.mMediaContext.mMediaPlayContext.getDefinitionList(z);
            if (definitionList == null || definitionList.size() == 0) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " getDefinitionList " + z + " null");
                return definitionList;
            }
            for (int i = 0; i < definitionList.size(); i++) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " getDefinitionList  " + i + ", onlySwitable=" + z + " index=" + definitionList.get(i).index + ", name=" + definitionList.get(i).name + ", newName=" + definitionList.get(i).newName + ", current=" + definitionList.get(i).current + ", newDefinition=" + definitionList.get(i).newDefinition);
            }
            return definitionList;
        }
    }

    public PlayerQualityItem getCurrentDefinition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayerQualityItem) ipChange.ipc$dispatch("14736907", new Object[]{this});
        }
        if (this.mMediaContext.mMediaPlayContext.isRtcVVC) {
            return null;
        }
        if ((!MediaConstant.RTCLIVE_URL_NAME.equals(this.mMediaContext.mMediaPlayContext.mSelectedUrlName) && !MediaConstant.BFRTC_URL_NAME.equals(this.mMediaContext.mMediaPlayContext.mSelectedUrlName)) || this.mMediaContext.mMediaPlayContext.mMediaLiveInfo == null) {
            return null;
        }
        PlayerQualityItem playerQualityItem = this.mMediaContext.mMediaPlayContext.mPlayerQualityItem;
        if (playerQualityItem != null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " getCurrentDefinition name=" + playerQualityItem.name + ",  newName=" + playerQualityItem.newName + " ,current=" + playerQualityItem.current + " ,definition=" + playerQualityItem.definition + " ,newDefinition=" + playerQualityItem.newDefinition);
        }
        return playerQualityItem;
    }

    public boolean switchToNewDefinition(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5be6cf26", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " switchToNewDefinition " + i + ", " + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.mEnableSwitchToNewDefinition && this.mMediaSwitchListener != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "-1");
            hashMap.put("newDefinition", str);
            hashMap.put("protocol", "");
            hashMap.put("reason", "" + i);
            hashMap.put("detail", "{\"msg\":\"error when orange close\", \"error\":-1}");
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "switchToNewDefinition " + hashMap);
            this.mMediaSwitchListener.c(hashMap);
            return false;
        }
        e eVar = this.mMediaController;
        if (eVar != null) {
            eVar.a(i, str);
        }
        return true;
    }

    public void setLiveDefinitionAutoSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d128a9", new Object[]{this, new Boolean(z)});
            return;
        }
        log(null, "setLiveDefinitionAutoSwitch " + z);
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && mediaContext.mMediaPlayContext != null) {
            this.mMediaContext.mMediaPlayContext.setLiveDefinitionAutoSwitch(z);
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.e(z);
    }

    public void setIMediaSwitchListener(com.taobao.mediaplay.player.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b6c80f", new Object[]{this, jVar});
            return;
        }
        this.mMediaSwitchListener = jVar;
        if (this.mMediaController == null) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setIMediaSwitchListener " + jVar);
        this.mMediaController.a(jVar);
    }

    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return;
        }
        eVar.a(f);
    }

    public String getSEIData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6f5b6e", new Object[]{this});
        }
        e eVar = this.mMediaController;
        if (eVar == null) {
            return null;
        }
        return eVar.z();
    }

    public void setUseShortAudioFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c253f14", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.mMediaPlayContext == null) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.mRequestShortAudioFocus = z;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mediaPlayCenter: setUseShortAudioFocus=" + z);
    }

    public void setForceUseSurfaceView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec6c6b9", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.mMediaPlayContext == null) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.mForceUseSurfaceView = z;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setForceUseSurfaceView at mediaPlayCenter=" + this + ": mForceUseSurfaceView=" + z);
    }

    public void setPauseInBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7aa86", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || mediaContext.mMediaPlayContext == null) {
            return;
        }
        this.mMediaContext.mMediaPlayContext.mEnableAutoPauseInBackground = z;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "set mEnableAutoPauseInBackground at mediaPlayCenter=" + this + ": mEnableAutoPauseInBackground=" + z);
    }

    public void setExternSurface(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7980fefe", new Object[]{this, surface});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null) {
            return;
        }
        mediaContext.setExternSurface(surface);
    }

    public void setUsingNewPlayerInstance(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4eb1079", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null) {
            return;
        }
        mediaContext.mEnableNewTBPlayer = z;
    }
}
