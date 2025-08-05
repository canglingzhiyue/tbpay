package com.taobao.avplayer.embed;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.bc;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.common.u;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.taobaoavsdk.e;
import com.taobao.taobaoavsdk.f;
import com.taobao.taobaoavsdk.util.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kbv;
import tb.kbw;
import tb.kbx;
import tb.kge;

/* loaded from: classes6.dex */
public class MyTBVideoEmbedView extends BaseEmbedView implements av, ax, bc, u, z, kbv, kbw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String ANCHORLISTUPDATED = null;
    private static final String COMPONENT_NAME = "H5";
    private static String ERROR = null;
    private static String FINISH = null;
    private static String FIRST_FRAME = null;
    private static String FOVCHANGED = null;
    private static final String FULL_SCREEN_MODE = "fullScreen";
    private static String LANDSCAPE = null;
    private static String METADATA = null;
    private static String MUTEDCHANGE = null;
    public static final String NAME = "wvvideo";
    private static final String NORMAL_SCREEN_MODE = "inlineScreen";
    private static String PAUSED = null;
    private static String PAUSE_BTN_CLICK = null;
    public static final int PAUSE_BUTTON_CLICK = 1;
    private static String PLAYING = null;
    private static String PLAY_BTN_CLICK = null;
    public static final int PLAY_BUTTON_CLICK = 0;
    private static String PREPARED = null;
    private static String SCREENMODECHANGE = null;
    private static String SEEK_COMPLETED = null;
    private static final String SMALL_SCREEN_MODE = "smallScreen";
    private static final String VALUE_FALSE = "false";
    private static final long VALUE_LONG = -1;
    private static final String VALUE_TRUE = "true";
    private static String VIDEOEND;
    private DWAspectRatio mAspectRatio;
    private boolean mBackCoverDisPlay;
    private Context mContext;
    private boolean mControlsViewHidden;
    private boolean mFixDispatchEventTmp;
    private boolean mGestureViewHidden;
    private boolean mHasDisappear;
    private bl mHigDWInstance;
    private HashMap<String, String> mHttpHeader;
    private boolean mInit;
    private long mInteractiveId;
    private boolean mIsPanoVideo;
    private boolean mIsVideoLoop;
    private boolean mLoadingHidden;
    private boolean mMiniProgressViewHidden;
    private boolean mNetworkErrorViewHidden;
    private kbx mPanoVideoUtils;
    private boolean mPlayErrorViewHidden;
    private boolean mPlayingIconHidden;
    private ImageView.ScaleType mPosterScaleType;
    private String mScreenMode;
    private boolean mShownMuteBtn;
    private bk mTBDWInstance;
    private boolean mToastViewHidden;
    private HashMap<String, String> mUiConfig;
    private long mUserId;
    private String mVideoResourceSubBizBlackList;
    private HashMap<String, String> utParams;
    private int mWidth = 0;
    private int mHeight = 0;
    private String mSrc = null;
    private String mPlayerScene = null;
    private String mVideoPlayScenes = null;
    private boolean mAutoPlay = true;
    private String mThumbnailSrc = null;
    private boolean mShowInteractive = false;
    private String mContentId = null;
    private boolean mMuted = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
    private String mVideoSource = null;
    private String mVideoId = null;
    private JSONObject mMediaInfoParams = null;
    private String mFrom = null;
    private String mPreload = null;
    private String mPlayControl = null;
    private String mContentMode = null;
    private boolean mHideControl = true;
    private int mStartPos = 0;
    private boolean mNeedFirstPlayUT = true;
    private DWInstanceType mDWInstanceType = null;
    private int mCurrentTime = 0;
    private boolean mHasPlay = false;
    private boolean mResume = false;
    private boolean mStarted = false;
    private int mVideoDuration = 0;
    private boolean mLandscape = false;
    private FrameLayout mComponentHostView = null;
    private boolean mNeedAD = true;
    private boolean isCompleted = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum EmbedProperties {
        playerScene { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.1
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPlayerScene(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        videoPlayScenes { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.2
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setVideoPlayScenes(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        instanceType { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.3
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setDWInstanceType(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        src { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.4
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setSrc(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        uiConfig { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.5
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setUiConfig(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        loop { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.6
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setIsVideoLoop(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        autoplay { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.7
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setAutoPlay(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        autoPlay { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.8
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setAutoPlay(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        thumbnailSrc { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.9
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setThumbnailSrc(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        poster { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.10
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setThumbnailSrc(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        interactiveHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.11
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setInteractiveHidden(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        contentId { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.12
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setContentId(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        backCoverDisplay { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.13
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setBackCoverDisPlay(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        muted { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.14
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setMuted(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        preload { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.15
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPreLoad(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        videoSource { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.16
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setVideoSource(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        videoId { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.17
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setVideoId(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        videoUrlResources { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.18
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    String valueOf = String.valueOf(obj);
                    if (TextUtils.isEmpty(valueOf)) {
                        return true;
                    }
                    try {
                        myTBVideoEmbedView.setMediaInfoParams(new JSONObject(valueOf), z);
                    } catch (JSONException unused) {
                        AVSDKLog.e(c.MODULE_SDK_PAGE, "parse mediaInfoParams error " + valueOf);
                    }
                }
                return true;
            }
        },
        from { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.19
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setFrom(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        utParams { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.20
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setUtParams(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        playControl { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.21
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPlayControl(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        contentMode { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.22
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setContentMode(String.valueOf(obj), z);
                    return true;
                }
                return true;
            }
        },
        interactiveId { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.23
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setInteractiveId(toLong(obj), z);
                    return true;
                }
                return true;
            }
        },
        userId { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.24
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setUserId(toLong(obj), z);
                    return true;
                }
                return true;
            }
        },
        miniProgressViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.25
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setMiniProgressViewHidden(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        networkErrorViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.26
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setNetworkErrorViewHidden(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        toastViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.27
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setToastViewHidden(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        playingIconHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.28
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPlayingIconHidden(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        gestureViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.29
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setGestureViewHidden(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        controlsViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.30
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setControlsViewHidden(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        loadingHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.31
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setLoadingHidden(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        playErrorViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.32
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPlayErrorViewHidden(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        setWidth { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.33
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setWidth((int) toLong(obj), true);
                }
                return true;
            }
        },
        setHeight { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.34
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setHeight((int) toLong(obj), true);
                }
                return true;
            }
        },
        PanoType { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.35
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPanoType(String.valueOf(obj), true);
                }
                return true;
            }
        },
        shownMuteBtn { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.36
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setShownMuteBtn(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        hideControl { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.37
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setHideControl(toBoolean(obj), z);
                    return true;
                }
                return true;
            }
        },
        startPos { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.38
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setStartPos((int) toLong(obj), z);
                    return true;
                }
                return true;
            }
        };

        public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
            return (obj == null || myTBVideoEmbedView == null) ? false : true;
        }

        public boolean toBoolean(Object obj) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            String valueOf = String.valueOf(obj);
            return "true".equals(valueOf) || "1".equals(valueOf);
        }

        public long toLong(Object obj) {
            if (obj instanceof Long) {
                return ((Long) obj).longValue();
            }
            try {
                return Long.parseLong(String.valueOf(obj));
            } catch (Throwable unused) {
                return -1L;
            }
        }
    }

    /* loaded from: classes6.dex */
    private enum JSMethod {
        getCurrentTime { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.1
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                if (wVCallBackContext == null) {
                    return false;
                }
                int access$1000 = MyTBVideoEmbedView.access$1000(myTBVideoEmbedView);
                wVCallBackContext.success("" + (access$1000 / 1000.0f));
                return true;
            }
        },
        setCurrentTime { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.2
            /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean doSomething(com.taobao.avplayer.embed.MyTBVideoEmbedView r7, java.lang.String r8, android.taobao.windvane.jsbridge.WVCallBackContext r9) {
                /*
                    r6 = this;
                    boolean r0 = android.text.TextUtils.isEmpty(r8)
                    r1 = 1
                    if (r0 != 0) goto L66
                    com.alibaba.fastjson.JSONObject r8 = com.alibaba.fastjson.JSON.parseObject(r8)
                    if (r8 == 0) goto L66
                    java.lang.String r0 = "time"
                    java.lang.String r8 = r8.getString(r0)
                    int r0 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Throwable -> L37
                    int r0 = r0 * 1000
                    com.taobao.avplayer.bk r2 = com.taobao.avplayer.embed.MyTBVideoEmbedView.access$200(r7)     // Catch: java.lang.Throwable -> L37
                    if (r2 == 0) goto L28
                    com.taobao.avplayer.bk r2 = com.taobao.avplayer.embed.MyTBVideoEmbedView.access$200(r7)     // Catch: java.lang.Throwable -> L37
                    r2.seekTo(r0)     // Catch: java.lang.Throwable -> L37
                    goto L35
                L28:
                    com.taobao.avplayer.bl r2 = com.taobao.avplayer.embed.MyTBVideoEmbedView.access$300(r7)     // Catch: java.lang.Throwable -> L37
                    if (r2 == 0) goto L35
                    com.taobao.avplayer.bl r2 = com.taobao.avplayer.embed.MyTBVideoEmbedView.access$300(r7)     // Catch: java.lang.Throwable -> L37
                    r2.e(r0)     // Catch: java.lang.Throwable -> L37
                L35:
                    r7 = 1
                    goto L67
                L37:
                    boolean r0 = com.taobao.avplayer.embed.MyTBVideoEmbedView.enableSeekMs()
                    if (r0 == 0) goto L66
                    double r2 = java.lang.Double.parseDouble(r8)     // Catch: java.lang.Throwable -> L66
                    r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
                    double r2 = r2 * r4
                    int r8 = (int) r2     // Catch: java.lang.Throwable -> L66
                    com.taobao.avplayer.bk r0 = com.taobao.avplayer.embed.MyTBVideoEmbedView.access$200(r7)     // Catch: java.lang.Throwable -> L66
                    if (r0 == 0) goto L58
                    com.taobao.avplayer.bk r7 = com.taobao.avplayer.embed.MyTBVideoEmbedView.access$200(r7)     // Catch: java.lang.Throwable -> L66
                    r7.seekTo(r8)     // Catch: java.lang.Throwable -> L66
                    goto L35
                L58:
                    com.taobao.avplayer.bl r0 = com.taobao.avplayer.embed.MyTBVideoEmbedView.access$300(r7)     // Catch: java.lang.Throwable -> L66
                    if (r0 == 0) goto L35
                    com.taobao.avplayer.bl r7 = com.taobao.avplayer.embed.MyTBVideoEmbedView.access$300(r7)     // Catch: java.lang.Throwable -> L66
                    r7.e(r8)     // Catch: java.lang.Throwable -> L66
                    goto L35
                L66:
                    r7 = 0
                L67:
                    if (r9 == 0) goto L72
                    if (r7 == 0) goto L6f
                    r9.success()
                    goto L72
                L6f:
                    r9.error()
                L72:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.AnonymousClass2.doSomething(com.taobao.avplayer.embed.MyTBVideoEmbedView, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
            }
        },
        getDuration { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.3
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(String.valueOf(((float) MyTBVideoEmbedView.access$1100(myTBVideoEmbedView)) / 1000.0f));
                    return true;
                }
                return true;
            }
        },
        getMuted { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.4
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(String.valueOf(MyTBVideoEmbedView.access$1200(myTBVideoEmbedView)));
                    return true;
                }
                return true;
            }
        },
        setMuted { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.5
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                com.alibaba.fastjson.JSONObject parseObject;
                if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
                    return true;
                }
                MyTBVideoEmbedView.access$1300(myTBVideoEmbedView, Boolean.TRUE.equals(parseObject.getBoolean(MusLiveVideo.ATTR_MUTE)));
                if (wVCallBackContext == null) {
                    return true;
                }
                wVCallBackContext.success();
                return true;
            }
        },
        setScreenMode { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.6
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                com.alibaba.fastjson.JSONObject parseObject;
                Object obj;
                if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (obj = parseObject.get("screenMode")) == null) {
                    return false;
                }
                myTBVideoEmbedView.setScreenMode(String.valueOf(obj), true);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        },
        getScreenMode { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.7
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(MyTBVideoEmbedView.access$1400(myTBVideoEmbedView));
                    return true;
                }
                return true;
            }
        },
        play { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.8
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                MyTBVideoEmbedView.access$1500(myTBVideoEmbedView);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                    return true;
                }
                return true;
            }
        },
        pause { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.9
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                if (MyTBVideoEmbedView.access$200(myTBVideoEmbedView) != null) {
                    MyTBVideoEmbedView.access$200(myTBVideoEmbedView).pauseVideo();
                } else if (MyTBVideoEmbedView.access$300(myTBVideoEmbedView) != null) {
                    MyTBVideoEmbedView.access$300(myTBVideoEmbedView).f();
                }
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                    return true;
                }
                return true;
            }
        },
        setInstanceMode { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.10
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                com.alibaba.fastjson.JSONObject parseObject;
                Object obj;
                if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (obj = parseObject.get("instanceMode")) == null) {
                    return false;
                }
                myTBVideoEmbedView.setDWInstanceType(String.valueOf(obj), true);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        },
        setAnchorErpList { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.11
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                if (myTBVideoEmbedView == null || TextUtils.isEmpty(str)) {
                    return false;
                }
                AVSDKLog.e(c.MODULE_SDK_PAGE, "setAnchorErpList " + str);
                com.alibaba.fastjson.JSONObject parseObject = com.alibaba.fastjson.JSONObject.parseObject(str);
                if (MyTBVideoEmbedView.access$400(myTBVideoEmbedView)) {
                    MyTBVideoEmbedView.access$500(myTBVideoEmbedView).a(parseObject);
                }
                if (wVCallBackContext == null) {
                    return true;
                }
                wVCallBackContext.success();
                return true;
            }
        },
        getErpList { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.12
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                return myTBVideoEmbedView != null && !TextUtils.isEmpty(str);
            }
        },
        setFov { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.13
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                if (myTBVideoEmbedView == null || TextUtils.isEmpty(str)) {
                    return false;
                }
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                if (MyTBVideoEmbedView.access$400(myTBVideoEmbedView)) {
                    MyTBVideoEmbedView.access$500(myTBVideoEmbedView).b(parseObject);
                }
                if (wVCallBackContext == null) {
                    return true;
                }
                wVCallBackContext.success();
                return true;
            }
        },
        getFov { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.14
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                if (myTBVideoEmbedView == null || TextUtils.isEmpty(str)) {
                    return false;
                }
                if (wVCallBackContext == null) {
                    return true;
                }
                r rVar = new r();
                HashMap<String, String> b = MyTBVideoEmbedView.access$500(myTBVideoEmbedView).b();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("FOV", b.d(b.get("FOV")));
                    jSONObject.put("latitude", b.d(b.get("latitude")));
                    jSONObject.put("longitude", b.d(b.get("longitude")));
                    rVar.a("data", jSONObject);
                    wVCallBackContext.success(rVar);
                    return true;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        },
        getViewPortPlaneCoordinateFromERP { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.15
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                return myTBVideoEmbedView != null && !TextUtils.isEmpty(str);
            }
        },
        updateEmbedProperty { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.16
            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                com.alibaba.fastjson.JSONObject parseObject;
                EmbedProperties embedProperties;
                if (myTBVideoEmbedView == null || TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
                    return false;
                }
                Object obj = parseObject.get("key");
                Object obj2 = parseObject.get("value");
                if (obj == null || obj2 == null) {
                    return false;
                }
                try {
                    embedProperties = EmbedProperties.valueOf(String.valueOf(obj));
                } catch (Throwable unused) {
                    embedProperties = null;
                }
                if (embedProperties == null) {
                    return false;
                }
                embedProperties.setValue(myTBVideoEmbedView, obj2, true);
                return true;
            }
        };

        public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
            return false;
        }
    }

    public static /* synthetic */ Object ipc$super(MyTBVideoEmbedView myTBVideoEmbedView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126948911:
                return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
            case -239223102:
                super.onAttachedToWebView();
                return null;
            case 259963749:
                super.onDetachedFromWebView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1980158489:
                super.onVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 2111529549:
                super.onParamChanged((String[]) objArr[0], (String[]) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35692924", new Object[]{this}) : NAME;
    }

    @Override // com.taobao.avplayer.common.z
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        }
    }

    @Override // com.taobao.avplayer.ax
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ int access$000(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("87ec9c80", new Object[]{myTBVideoEmbedView})).intValue() : myTBVideoEmbedView.mHeight;
    }

    public static /* synthetic */ int access$002(MyTBVideoEmbedView myTBVideoEmbedView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1589cc7", new Object[]{myTBVideoEmbedView, new Integer(i)})).intValue();
        }
        myTBVideoEmbedView.mHeight = i;
        return i;
    }

    public static /* synthetic */ int access$100(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15274e01", new Object[]{myTBVideoEmbedView})).intValue() : myTBVideoEmbedView.mWidth;
    }

    public static /* synthetic */ int access$1000(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f4d7cf6f", new Object[]{myTBVideoEmbedView})).intValue() : myTBVideoEmbedView.getCurrentPosition();
    }

    public static /* synthetic */ int access$102(MyTBVideoEmbedView myTBVideoEmbedView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb741b66", new Object[]{myTBVideoEmbedView, new Integer(i)})).intValue();
        }
        myTBVideoEmbedView.mWidth = i;
        return i;
    }

    public static /* synthetic */ long access$1100(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("821280f1", new Object[]{myTBVideoEmbedView})).longValue() : myTBVideoEmbedView.getVideoDurtion();
    }

    public static /* synthetic */ boolean access$1200(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4d3282", new Object[]{myTBVideoEmbedView})).booleanValue() : myTBVideoEmbedView.isMute();
    }

    public static /* synthetic */ void access$1300(MyTBVideoEmbedView myTBVideoEmbedView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4754eb5", new Object[]{myTBVideoEmbedView, new Boolean(z)});
        } else {
            myTBVideoEmbedView.mute(z);
        }
    }

    public static /* synthetic */ String access$1400(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd450f20", new Object[]{myTBVideoEmbedView}) : myTBVideoEmbedView.mScreenMode;
    }

    public static /* synthetic */ void access$1500(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fd4701", new Object[]{myTBVideoEmbedView});
        } else {
            myTBVideoEmbedView.play();
        }
    }

    public static /* synthetic */ void access$1600(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4437f882", new Object[]{myTBVideoEmbedView});
        } else {
            myTBVideoEmbedView.destroyInnerInFullScreen();
        }
    }

    public static /* synthetic */ bk access$200(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bk) ipChange.ipc$dispatch("7189a367", new Object[]{myTBVideoEmbedView}) : myTBVideoEmbedView.mTBDWInstance;
    }

    public static /* synthetic */ bl access$300(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bl) ipChange.ipc$dispatch("b3a0d0e5", new Object[]{myTBVideoEmbedView}) : myTBVideoEmbedView.mHigDWInstance;
    }

    public static /* synthetic */ boolean access$400(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd76295", new Object[]{myTBVideoEmbedView})).booleanValue() : myTBVideoEmbedView.mIsPanoVideo;
    }

    public static /* synthetic */ kbx access$500(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kbx) ipChange.ipc$dispatch("168f0c53", new Object[]{myTBVideoEmbedView}) : myTBVideoEmbedView.mPanoVideoUtils;
    }

    public static /* synthetic */ boolean access$600(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d74cc597", new Object[]{myTBVideoEmbedView})).booleanValue() : myTBVideoEmbedView.mFixDispatchEventTmp;
    }

    public static /* synthetic */ void access$700(MyTBVideoEmbedView myTBVideoEmbedView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d7b228", new Object[]{myTBVideoEmbedView, str, str2});
        } else {
            myTBVideoEmbedView.fireEvent(str, str2);
        }
    }

    static {
        kge.a(-1241817479);
        kge.a(688755897);
        kge.a(-1226623529);
        kge.a(-1522005455);
        kge.a(857599862);
        kge.a(1054789450);
        kge.a(1785800563);
        kge.a(1929278662);
        METADATA = "meta";
        PREPARED = "prepared";
        PLAYING = AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING;
        PAUSED = "paused";
        FINISH = "finish";
        LANDSCAPE = "landscape";
        ERROR = "error";
        SCREENMODECHANGE = "screenModeChange";
        MUTEDCHANGE = "mutedChange";
        VIDEOEND = "end";
        FOVCHANGED = "fovChanged";
        ANCHORLISTUPDATED = "anchorListUpdated";
        FIRST_FRAME = "firstvideoframe";
        SEEK_COMPLETED = "seekCompleted";
        PLAY_BTN_CLICK = "playBtnClick";
        PAUSE_BTN_CLICK = "pauseBtnClick";
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        if (this.params == null || this.params.mObjectParam == null || this.params.mObjectParam.isEmpty()) {
            return null;
        }
        this.mContext = context;
        parseParam();
        return genVideoView();
    }

    private View initNormalInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("78687bd5", new Object[]{this});
        }
        this.mFixDispatchEventTmp = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "fixDispatchEventTmp", "true"));
        bk.a aVar = new bk.a((Activity) this.mContext);
        aVar.k("H5");
        aVar.a(this.mSrc);
        if (!TextUtils.isEmpty(this.mPlayerScene)) {
            aVar.f(this.mPlayerScene);
        }
        if (!TextUtils.isEmpty(this.mVideoPlayScenes)) {
            aVar.g(this.mVideoPlayScenes);
        }
        DWInstanceType dWInstanceType = this.mDWInstanceType;
        if (dWInstanceType != null) {
            aVar.a(dWInstanceType);
        }
        aVar.c(this.mIsVideoLoop);
        aVar.f(this.mMuted);
        if (!TextUtils.isEmpty(this.mContentId)) {
            aVar.h(this.mContentId);
        }
        aVar.j(this.mBackCoverDisPlay);
        aVar.c(this.mVideoSource);
        aVar.b(this.mVideoId);
        if (!b.b(this.mFrom, this.mVideoResourceSubBizBlackList)) {
            aVar.a(this.mMediaInfoParams);
        }
        aVar.e(this.mFrom);
        aVar.a(this.utParams);
        aVar.a(getPanoType());
        int i = this.mStartPos;
        if (i > 0) {
            aVar.b(i);
        }
        DWAspectRatio dWAspectRatio = this.mAspectRatio;
        if (dWAspectRatio != null) {
            aVar.a(dWAspectRatio);
        }
        if (this.mUserId != -1) {
            aVar.a(this.mInteractiveId);
        }
        long j = this.mUserId;
        if (j != -1) {
            aVar.b(j);
        }
        if (!TextUtils.isEmpty(this.mThumbnailSrc)) {
            aVar.i(true);
            com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar2 = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
            DWFrontCoverBean dWFrontCoverBean = new DWFrontCoverBean(0L, null, this.mThumbnailSrc);
            dWFrontCoverBean.setScaleType(this.mPosterScaleType);
            aVar2.a(dWFrontCoverBean);
            aVar.a(aVar2);
        }
        aVar.s(this.mMiniProgressViewHidden);
        aVar.v(this.mNetworkErrorViewHidden);
        aVar.t(this.mToastViewHidden);
        aVar.r(this.mPlayingIconHidden);
        aVar.u(this.mGestureViewHidden);
        aVar.y(this.mLoadingHidden);
        aVar.w(this.mPlayErrorViewHidden);
        aVar.M(this.mShownMuteBtn);
        aVar.c(this.mWidth);
        aVar.d(this.mHeight);
        HashMap<String, String> hashMap = this.mHttpHeader;
        if (hashMap != null) {
            aVar.b(hashMap);
        }
        this.mTBDWInstance = aVar.c();
        HashMap<String, String> hashMap2 = this.mUiConfig;
        if (hashMap2 != null) {
            for (Map.Entry<String, String> entry : hashMap2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if ("showNotWifiHint".equals(key) && !TextUtils.isEmpty(value)) {
                    this.mTBDWInstance.setShowNotWifiHint(b.a(value));
                }
                if ("showPlayWithCacheHint".equals(key) && !TextUtils.isEmpty(value)) {
                    this.mTBDWInstance.setShowPlayWithCacheHint(b.a(value));
                }
            }
        }
        this.mTBDWInstance.setVideoLifecycleListener(this);
        this.mTBDWInstance.setIDWMutedChangeListener(this);
        this.mTBDWInstance.setIVideoSeekCompleteListener(this);
        this.mTBDWInstance.hideCloseView();
        if (this.mHideControl) {
            this.mTBDWInstance.hideController();
        }
        return this.mTBDWInstance.getView();
    }

    private View initHighInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c976f50", new Object[]{this});
        }
        bl.a aVar = new bl.a((Activity) this.mContext);
        aVar.l("H5");
        aVar.f(this.mFrom);
        aVar.h(this.mContentId);
        aVar.k(this.mVideoPlayScenes);
        aVar.a(this.mUserId);
        aVar.a(this.mSrc);
        aVar.d(this.mMuted);
        aVar.a(this.utParams);
        aVar.c(this.mWidth);
        aVar.b(this.mVideoId);
        if (!b.b(this.mFrom, this.mVideoResourceSubBizBlackList)) {
            aVar.a(this.mMediaInfoParams);
        }
        aVar.d(this.mVideoSource);
        aVar.d(this.mHeight);
        aVar.c(this.mIsVideoLoop);
        aVar.a(getPanoType());
        int i = this.mStartPos;
        if (i > 0) {
            aVar.b(i);
        }
        DWAspectRatio dWAspectRatio = this.mAspectRatio;
        if (dWAspectRatio != null) {
            aVar.a(dWAspectRatio);
        }
        aVar.a(DWInstanceType.PIC);
        HashMap<String, String> hashMap = this.mHttpHeader;
        if (hashMap != null) {
            aVar.a((Map<String, String>) hashMap);
        }
        this.mHigDWInstance = aVar.c();
        if (!TextUtils.isEmpty(this.mThumbnailSrc)) {
            TUrlImageView tUrlImageView = new TUrlImageView(this.mContext);
            ImageView.ScaleType scaleType = this.mPosterScaleType;
            if (scaleType != null) {
                tUrlImageView.setScaleType(scaleType);
            }
            tUrlImageView.asyncSetImageUrl(this.mThumbnailSrc);
            this.mHigDWInstance.a(tUrlImageView);
        }
        this.mHigDWInstance.a((av) this);
        if (this.mIsVideoLoop) {
            this.mHigDWInstance.a((ax) this);
        }
        this.mHigDWInstance.b(this);
        this.mHigDWInstance.a((u) this);
        if (this.mAutoPlay || (this.mResume && this.mStarted)) {
            this.mHigDWInstance.a(DWInstanceType.VIDEO);
            this.mHigDWInstance.a((bc) this);
            this.mStarted = true;
            this.mNeedFirstPlayUT = false;
            this.mHigDWInstance.c();
        } else if (METADATA.equals(this.mPreload)) {
            this.mHigDWInstance.a(DWInstanceType.VIDEO);
            this.mHigDWInstance.d();
        }
        return this.mHigDWInstance.l();
    }

    private View genVideoView() {
        View initNormalInstance;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cc8b6559", new Object[]{this});
        }
        this.mVideoResourceSubBizBlackList = OrangeConfig.getInstance().getConfig("DWInteractive", "videoResourceSubBizBlackList", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        if ("highPerformance".equals(this.mPlayerScene)) {
            initNormalInstance = initHighInstance();
            z = true;
        } else {
            initNormalInstance = initNormalInstance();
        }
        this.mInit = true;
        if (this.mComponentHostView == null) {
            this.mComponentHostView = new FrameLayout(this.mContext) { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 1389530587) {
                        super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                        return null;
                    } else if (hashCode != 2075560917) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                    }
                }

                @Override // android.view.View
                public void onSizeChanged(int i, int i2, int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                        return;
                    }
                    super.onSizeChanged(i, i2, i3, i4);
                    if (i4 == i3 && i4 == 0) {
                        return;
                    }
                    if (MyTBVideoEmbedView.access$000(MyTBVideoEmbedView.this) == i2 && MyTBVideoEmbedView.access$100(MyTBVideoEmbedView.this) == i) {
                        return;
                    }
                    MyTBVideoEmbedView.access$002(MyTBVideoEmbedView.this, i2);
                    MyTBVideoEmbedView.access$102(MyTBVideoEmbedView.this, i);
                    if (MyTBVideoEmbedView.access$200(MyTBVideoEmbedView.this) != null) {
                        MyTBVideoEmbedView.access$200(MyTBVideoEmbedView.this).setFrame(i, i2);
                    } else if (MyTBVideoEmbedView.access$300(MyTBVideoEmbedView.this) == null) {
                    } else {
                        MyTBVideoEmbedView.access$300(MyTBVideoEmbedView.this).a(i, i2);
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
                    }
                    if (MyTBVideoEmbedView.access$400(MyTBVideoEmbedView.this)) {
                        MyTBVideoEmbedView.access$500(MyTBVideoEmbedView.this).a(motionEvent);
                    }
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 2 && !MyTBVideoEmbedView.access$600(MyTBVideoEmbedView.this)) {
                        return dispatchTouchEvent;
                    }
                    return false;
                }
            };
        }
        ViewParent parent = initNormalInstance.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(initNormalInstance);
        }
        this.mComponentHostView.addView(initNormalInstance);
        if (this.mAutoPlay) {
            if (z) {
                this.mHigDWInstance.c();
            } else {
                this.mTBDWInstance.start();
            }
            fireEvent(PLAYING, "");
        }
        initNormalInstance.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                MyTBVideoEmbedView.access$700(MyTBVideoEmbedView.this, "click", "");
                return false;
            }
        });
        return this.mComponentHostView;
    }

    private void parseParam() {
        EmbedProperties[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd55ed21", new Object[]{this});
            return;
        }
        setWidth(this.params.mWidth, false);
        setHeight(this.params.mHeight, false);
        for (EmbedProperties embedProperties : EmbedProperties.values()) {
            embedProperties.setValue(this, this.params.mObjectParam.get(embedProperties.name()), false);
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnVisibilityChangedListener
    public void onVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
        } else {
            super.onVisibilityChanged(i);
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSMethod jSMethod;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            jSMethod = JSMethod.valueOf(str);
        } catch (Throwable unused) {
            jSMethod = null;
        }
        if (jSMethod != null) {
            return jSMethod.doSomething(this, str2, wVCallBackContext);
        }
        return super.execute(str, str2, wVCallBackContext);
    }

    @Override // com.taobao.avplayer.common.u
    public void onMutedChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff26311", new Object[]{this, new Boolean(z)});
        } else {
            fireEvent(MUTEDCHANGE, z ? "true" : "false");
        }
    }

    private void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            if (bkVar.getVideoState() == 0 || this.mTBDWInstance.getVideoState() == 5 || this.mTBDWInstance.getVideoState() == 8 || this.mTBDWInstance.getVideoState() == 4) {
                this.mStarted = true;
                this.mTBDWInstance.start();
                return;
            }
            this.mTBDWInstance.playVideo();
            return;
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return;
        }
        blVar.a(DWInstanceType.VIDEO);
        if (this.mHigDWInstance.i() == 0 || this.mHigDWInstance.i() == 5 || this.mHigDWInstance.i() == 8 || this.mHigDWInstance.i() == 4) {
            this.mStarted = true;
            this.mNeedFirstPlayUT = false;
            this.mHigDWInstance.c();
            return;
        }
        this.mHigDWInstance.e();
    }

    private long getVideoDurtion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e73c128b", new Object[]{this})).longValue();
        }
        if (this.mVideoDuration == 0) {
            bk bkVar = this.mTBDWInstance;
            if (bkVar != null) {
                this.mVideoDuration = (int) bkVar.getDuration();
            } else {
                bl blVar = this.mHigDWInstance;
                if (blVar != null) {
                    this.mVideoDuration = (int) blVar.q();
                }
            }
        }
        return this.mVideoDuration;
    }

    private void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMuted = z;
        AVSDKLog.e(c.MODULE_SDK_PAGE, "MyTBVideoEmbedView Builder, sbt=" + this.mFrom + ", setMute=" + this.mMuted);
        if (!this.mInit || this.mHasDisappear) {
            return;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            bkVar.mute(this.mMuted);
            return;
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return;
        }
        blVar.e(this.mMuted);
    }

    private boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        bk bkVar = this.mTBDWInstance;
        return bkVar != null ? bkVar.isMute() : this.mHigDWInstance.h();
    }

    private int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            return bkVar.getCurrentPosition();
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return 0;
        }
        return blVar.j();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.mNeedAD = false;
        this.mStarted = true;
        this.isCompleted = false;
        if (this.mResume && !this.mHasPlay && (bkVar = this.mTBDWInstance) != null) {
            bkVar.pauseVideo();
            return;
        }
        this.mHasPlay = true;
        int i = this.mCurrentTime;
        if (i > 0) {
            bk bkVar2 = this.mTBDWInstance;
            if (bkVar2 != null) {
                bkVar2.seekTo(i);
            } else {
                bl blVar = this.mHigDWInstance;
                if (blVar != null) {
                    blVar.e(i);
                }
            }
        }
        fireEvent(PLAYING, "");
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        } else {
            fireEvent(PAUSED, "");
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        this.isCompleted = false;
        fireEvent(PLAYING, "");
    }

    @Override // com.taobao.avplayer.bc
    public void onSeekCompletion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db52709", new Object[]{this, new Integer(i)});
        } else {
            fireEvent(SEEK_COMPLETED, "");
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
        fireEvent(PREPARED, "");
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else {
            fireEvent(ERROR, "");
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        if ((i == 11000 || i == 3) && this.mIsPanoVideo) {
            this.mPanoVideoUtils.d();
        }
        if (i == 3) {
            fireEvent(FIRST_FRAME, "");
        }
        if (i != 18) {
            return;
        }
        if (i2 == 1) {
            fireEvent(PAUSE_BTN_CLICK, "");
        } else if (i2 != 0) {
        } else {
            fireEvent(PLAY_BTN_CLICK, "");
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        this.mNeedAD = true;
        this.isCompleted = true;
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            bkVar.needAD(this.mNeedAD);
        }
        this.mHasPlay = false;
        this.mCurrentTime = 0;
        fireEvent(FINISH, "");
        fireEvent(VIDEOEND, "");
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            return;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar == null) {
            return;
        }
        bkVar.mute(false);
        this.mLandscape = true;
        this.mTBDWInstance.showOrHideInteractive(true);
        this.mTBDWInstance.showTopEventView();
        this.mTBDWInstance.showGoodsListView();
        fireEvent(SCREENMODECHANGE, FULL_SCREEN_MODE);
        HashMap hashMap = new HashMap(1);
        hashMap.put("landscape", true);
        fireEvent(LANDSCAPE, JSON.toJSONString(hashMap));
        this.mScreenMode = FULL_SCREEN_MODE;
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            return;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar == null) {
            return;
        }
        this.mLandscape = false;
        bkVar.mute(this.mMuted);
        this.mTBDWInstance.showOrHideInteractive(this.mShowInteractive);
        this.mTBDWInstance.hideGoodsListView();
        this.mTBDWInstance.hideTopEventView();
        fireEvent(SCREENMODECHANGE, SMALL_SCREEN_MODE);
        HashMap hashMap = new HashMap(1);
        hashMap.put("landscape", false);
        fireEvent(LANDSCAPE, JSON.toJSONString(hashMap));
        this.mScreenMode = SMALL_SCREEN_MODE;
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

    public void setWidth(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cb1a7c", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mWidth = i;
        if (!z) {
            return;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            bkVar.setFrame(this.mWidth, this.mHeight);
            return;
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return;
        }
        blVar.a(this.mWidth, this.mHeight);
    }

    public void setHeight(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbeb8461", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mHeight = i;
        if (!z) {
            return;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            bkVar.setFrame(this.mWidth, this.mHeight);
            return;
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return;
        }
        blVar.a(this.mWidth, this.mHeight);
    }

    public void setUiConfig(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425045eb", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mUiConfig = b.b(str, ",", "=");
        }
    }

    public void setSrc(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a366e01", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mSrc = str;
        }
    }

    public void setPanoType(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafed655", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (!"ERP".equals(str) && !"EAC".equals(str)) {
                return;
            }
            this.mIsPanoVideo = true;
            this.mPanoVideoUtils = new kbx(this.mContext, str, this, this);
            this.mAspectRatio = DWAspectRatio.DW_CENTER_CROP;
            this.mPosterScaleType = ImageView.ScaleType.CENTER_CROP;
        }
    }

    public void setPlayerScene(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d946f7da", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mPlayerScene = str;
        }
    }

    public void setVideoPlayScenes(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31c4c40f", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mVideoPlayScenes = str;
        }
    }

    public void setIsVideoLoop(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcbecfa", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mIsVideoLoop = z;
        }
    }

    public void setAutoPlay(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf50d8c", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mAutoPlay = z;
        }
    }

    public void setHideControl(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfce0680", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mHideControl = z;
        }
    }

    public void setStartPos(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e44210c", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.mStartPos = i;
        }
    }

    public void setThumbnailSrc(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c56a49", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mThumbnailSrc = str;
        }
    }

    public void setInteractiveHidden(boolean z, boolean z2) {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed23cb1", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mShowInteractive = !z;
        if (!this.mInit || this.mHasDisappear || (bkVar = this.mTBDWInstance) == null) {
            return;
        }
        bkVar.showOrHideInteractive(this.mShowInteractive);
    }

    public void setContentId(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af51dcf1", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mContentId = str;
        }
    }

    public void setBackCoverDisPlay(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa59a7b", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mBackCoverDisPlay = z;
        }
    }

    public void setMuted(boolean z, boolean z2) {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d188b0", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mMuted = z;
        if (!z2 || (bkVar = this.mTBDWInstance) == null) {
            return;
        }
        bkVar.mute(z);
    }

    public void setVideoSource(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9377652f", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mVideoSource = str;
        }
    }

    public void setPreLoad(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7307b1c", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mPreload = str;
        }
    }

    public void setVideoId(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8affdbaf", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mVideoId = str;
        }
    }

    public void setMediaInfoParams(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a75b8b3", new Object[]{this, jSONObject, new Boolean(z)});
        } else {
            this.mMediaInfoParams = jSONObject;
        }
    }

    public void setFrom(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e731b7", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mFrom = str;
        }
    }

    public void setUtParams(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43562fc", new Object[]{this, str, new Boolean(z)});
        } else if (b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "fixTcUtparams", "true"))) {
            this.utParams = b.b(str, ",", "=");
        } else {
            this.utParams = new HashMap<>();
        }
    }

    public void setPlayControl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb1ad0bc", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.mPlayControl = str;
        if (!z || this.mTBDWInstance == null) {
            return;
        }
        this.mHasPlay = true;
        if ("play".equals(str)) {
            if (this.mTBDWInstance.getVideoState() == 0 || this.mTBDWInstance.getVideoState() == 5 || this.mTBDWInstance.getVideoState() == 8 || this.mTBDWInstance.getVideoState() == 4) {
                this.mStarted = true;
                this.mTBDWInstance.start();
                return;
            }
            this.mTBDWInstance.playVideo();
        } else if (!"pause".equals(str)) {
        } else {
            this.mTBDWInstance.pauseVideo();
        }
    }

    public void setContentMode(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6db929", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1362001767) {
                if (hashCode != 3143043) {
                    if (hashCode == 727618043 && str.equals("aspectFill")) {
                        c = 1;
                    }
                } else if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_fill)) {
                    c = 2;
                }
            } else if (str.equals("aspectFit")) {
                c = 0;
            }
            if (c == 0) {
                this.mAspectRatio = DWAspectRatio.DW_FIT_CENTER;
                this.mPosterScaleType = ImageView.ScaleType.FIT_CENTER;
            } else if (c == 1) {
                this.mAspectRatio = DWAspectRatio.DW_CENTER_CROP;
                this.mPosterScaleType = ImageView.ScaleType.CENTER_CROP;
            } else if (c == 2) {
                this.mAspectRatio = DWAspectRatio.DW_FIT_X_Y;
                this.mPosterScaleType = ImageView.ScaleType.FIT_XY;
            }
        }
        this.mContentMode = str;
    }

    public void setInteractiveId(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a15ed72", new Object[]{this, new Long(j), new Boolean(z)});
        } else {
            this.mInteractiveId = j;
        }
    }

    public void setUserId(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff96029f", new Object[]{this, new Long(j), new Boolean(z)});
        } else {
            this.mUserId = j;
        }
    }

    public void setMiniProgressViewHidden(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a897fc", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mMiniProgressViewHidden = z;
        }
    }

    public void setNetworkErrorViewHidden(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6fdcd2", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mNetworkErrorViewHidden = z;
        }
    }

    public void setToastViewHidden(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ffbb", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mToastViewHidden = z;
        }
    }

    public void setPlayingIconHidden(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc64f816", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mPlayingIconHidden = z;
        }
    }

    public void setGestureViewHidden(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4050b5d", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mGestureViewHidden = z;
        }
    }

    public void setControlsViewHidden(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7be880e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mControlsViewHidden = z;
        }
    }

    public void setLoadingHidden(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc1e70b", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mLoadingHidden = z;
        }
    }

    public void setPlayErrorViewHidden(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736557c8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mPlayErrorViewHidden = z;
        }
    }

    public void setShownMuteBtn(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf484efb", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mShownMuteBtn = z;
        }
    }

    public void setDWInstanceType(String str, boolean z) {
        DWInstanceType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fefef5f", new Object[]{this, str, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str)) {
            for (DWInstanceType dWInstanceType : DWInstanceType.values()) {
                if (dWInstanceType != null && str.equals(dWInstanceType.getValue())) {
                    this.mDWInstanceType = dWInstanceType;
                }
            }
            bl blVar = this.mHigDWInstance;
            if (blVar == null || !z) {
                return;
            }
            blVar.a(DWInstanceType.VIDEO.equals(this.mDWInstanceType) ? DWInstanceType.VIDEO : DWInstanceType.PIC);
        }
    }

    public void setScreenMode(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eae0512", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.mScreenMode = str;
        if (!z || TextUtils.isEmpty(str) || this.mTBDWInstance == null) {
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -883285933) {
            if (hashCode != -806066213) {
                if (hashCode == 370161765 && str.equals(NORMAL_SCREEN_MODE)) {
                    c = 2;
                }
            } else if (str.equals(FULL_SCREEN_MODE)) {
                c = 1;
            }
        } else if (str.equals(SMALL_SCREEN_MODE)) {
            c = 0;
        }
        if (c == 0) {
            if (this.mTBDWInstance.isFullScreen() || this.mTBDWInstance.isSmallWindow()) {
                return;
            }
            this.mTBDWInstance.toSmall();
        } else if (c == 1) {
            if (this.mTBDWInstance.isFullScreen()) {
                return;
            }
            this.mTBDWInstance.toggleScreen();
        } else if (c != 2) {
        } else {
            if (this.mTBDWInstance.isFullScreen()) {
                this.mTBDWInstance.toggleScreen();
            } else if (!this.mTBDWInstance.isSmallWindow()) {
            } else {
                this.mTBDWInstance.toNormal();
            }
        }
    }

    private void destroyInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56f9103", new Object[]{this});
            return;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            boolean z = this.mHasPlay;
            if (!z) {
                z = bkVar.adIsPlaying();
            }
            this.mHasPlay = z;
            if (enableDelayDestroyInFullScreen()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MyTBVideoEmbedView.access$1600(MyTBVideoEmbedView.this);
                        }
                    }
                });
                return;
            } else {
                destroyInnerInFullScreen();
                return;
            }
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return;
        }
        FrameLayout frameLayout = this.mComponentHostView;
        if (frameLayout != null) {
            frameLayout.removeView(blVar.l());
        }
        this.mHigDWInstance.a((av) null);
        this.mHigDWInstance.a((bc) null);
        this.mHigDWInstance.m();
        this.mHigDWInstance = null;
    }

    private void destroyInnerInFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad27203", new Object[]{this});
            return;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar == null) {
            return;
        }
        if (bkVar.isFullScreen()) {
            ViewGroup view = this.mTBDWInstance.getView();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            this.mTBDWInstance.toggleScreen();
        }
        FrameLayout frameLayout = this.mComponentHostView;
        if (frameLayout != null) {
            frameLayout.removeView(this.mTBDWInstance.getView());
        }
        this.mTBDWInstance.setVideoLifecycleListener(null);
        this.mTBDWInstance.setIVideoSeekCompleteListener(null);
        this.mTBDWInstance.destroy();
        this.mTBDWInstance = null;
    }

    private boolean enableDelayDestroyInFullScreen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68506da5", new Object[]{this})).booleanValue() : b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enH5FullScreenDestroy", "true"));
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDetachedFromWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ebb65", new Object[]{this});
        } else {
            super.onDetachedFromWebView();
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        } else {
            super.onAttachedToWebView();
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        kbx kbxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroyInner();
        if (this.mIsPanoVideo && (kbxVar = this.mPanoVideoUtils) != null) {
            this.mIsPanoVideo = false;
            kbxVar.a();
            this.mPanoVideoUtils = null;
        }
        this.mInit = false;
        this.mContext = null;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
    public void onParamChanged(String[] strArr, String[] strArr2) {
        EmbedProperties embedProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            return;
        }
        super.onParamChanged(strArr, strArr2);
        if (strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return;
        }
        String str = strArr[0];
        String str2 = strArr2[0];
        try {
            embedProperties = EmbedProperties.valueOf(str);
        } catch (Throwable unused) {
            embedProperties = null;
        }
        if (embedProperties == null) {
            return;
        }
        embedProperties.setValue(this, str2, true);
    }

    private void fireEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
        } else {
            a.a(this.webView, this.id, str, str2);
        }
    }

    public static boolean enableSeekMs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cfe289ac", new Object[0])).booleanValue() : b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "seekMsFlagInH5", "true"));
    }

    private int getPanoType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4605aebc", new Object[]{this})).intValue();
        }
        if (!this.mIsPanoVideo) {
            return 0;
        }
        return this.mPanoVideoUtils.c();
    }

    @Override // tb.kbv
    public void onFovChange(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e7b9e1", new Object[]{this, obj});
        } else if (!this.mIsPanoVideo) {
        } else {
            fireEvent(FOVCHANGED, com.alibaba.fastjson.JSONObject.toJSONString(this.mPanoVideoUtils.b()));
        }
    }

    @Override // tb.kbv
    public void onAnchorListUpdate(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731725fe", new Object[]{this, obj});
        } else if (!this.mIsPanoVideo || !(obj instanceof JSONArray)) {
        } else {
            fireEvent(ANCHORLISTUPDATED, ((JSONArray) obj).toString());
        }
    }

    @Override // tb.kbw
    public void setFov(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bab26e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            bkVar.setFov(f, f2, f3);
            return;
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return;
        }
        blVar.a(f, f2, f3);
    }

    @Override // tb.kbw
    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.mWidth;
    }

    @Override // tb.kbw
    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.mHeight;
    }

    @Override // tb.kbw
    public void refreshScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a8082e", new Object[]{this});
        } else if (!this.mIsPanoVideo) {
        } else {
            bk bkVar = this.mTBDWInstance;
            if (bkVar != null) {
                bkVar.refreshScreen();
                return;
            }
            bl blVar = this.mHigDWInstance;
            if (blVar == null) {
                return;
            }
            blVar.b();
        }
    }

    @Override // tb.kbw
    public List<f> hitTest(List<e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae7e26ea", new Object[]{this, list});
        }
        if (!this.mIsPanoVideo) {
            return null;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            return bkVar.hitTest(list);
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return null;
        }
        return blVar.a(list);
    }

    public void setRequestHeader(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6e6bd2", new Object[]{this, hashMap});
        } else {
            this.mHttpHeader = hashMap;
        }
    }
}
