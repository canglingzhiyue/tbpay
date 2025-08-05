package com.taobao.avplayer.component.weex;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.common.ab;
import com.taobao.avplayer.common.m;
import com.taobao.avplayer.common.u;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.taobaoavsdk.util.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Constants;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.component.list.WXListComponent;
import com.uc.webview.export.extension.UCClient;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oyw;
import tb.sku;

/* loaded from: classes6.dex */
public class WXInteractiveComponent extends WXComponent<FrameLayout> implements av, ax, ab, m, u, z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String CLICK = null;
    private static final String COMPONENT_NAME = "weex";
    private static String END_LOADING = null;
    private static String ERROR = null;
    private static String FINISH = null;
    private static String FIRST_FRAME = null;
    private static final String FULL_SCREEN_MODE = "fullScreen";
    private static String LANDSCAPE = null;
    private static String METADATA = null;
    private static String MUTEDCHANGE = null;
    private static final String NORMAL_SCREEN_MODE = "inlineScreen";
    private static String PAUSED = null;
    private static String PLAYING = null;
    private static String PREPARED = null;
    private static String SCREENMODECHANGE = null;
    private static final String SMALL_SCREEN_MODE = "smallScreen";
    private static String START_LOADING = null;
    public static String TAG = null;
    private static String VIDEOEND = null;
    private static final String WEEX_NATIVE_SHOP_NAME = "com.alibaba.triver.triver_shop.newShop.NativeShop";
    private static final String WEEX_SHOP_ACTIVITY_NAME = "com.alibaba.triver.triver_shop.newShop.ShopActivity";
    private boolean isCompleted;
    private DWAspectRatio mAspectRatio;
    private boolean mAutoPlay;
    private String mCId;
    private FrameLayout mComponentHostView;
    private String mContentId;
    private boolean mControlsViewHidden;
    private int mCurrentTime;
    private String mFrom;
    private boolean mFullscreenBtnHidden;
    private boolean mGesture;
    private boolean mHasClickEvent;
    private boolean mHasDisappear;
    private boolean mHasEnd;
    private boolean mHasErrorEvent;
    private boolean mHasFinishEvent;
    private boolean mHasLandscapeEvent;
    private boolean mHasMutedChangeEvent;
    private boolean mHasPausedEvent;
    private boolean mHasPlay;
    private boolean mHasPlayingEvent;
    private boolean mHasPreparedEvent;
    private boolean mHasRender;
    private boolean mHasScreenModeChangeEvent;
    private int mHeight;
    private boolean mHideGestureView;
    private boolean mHideLoading;
    private boolean mHideMiniProgressBar;
    private boolean mHideNetworkErrorView;
    private boolean mHidePlayErrorView;
    private boolean mHidePlayingIcon;
    private boolean mHideThumbnailPlayBtn;
    private boolean mHideToastView;
    private bl mHigDWInstance;
    private HashMap<String, String> mHttpHeader;
    private boolean mInit;
    private boolean mInitScene;
    private String mInstanceType;
    private long mInteractiveId;
    private boolean mLandscape;
    private String mLayerMode;
    private boolean mLoop;
    private boolean mMute;
    private boolean mMuteDisplay;
    private boolean mNeedAD;
    private boolean mNeedFirstPlayUT;
    private boolean mNeedbackCover;
    private String mPlayerScene;
    private ImageView.ScaleType mPosterScaleType;
    private String mPreload;
    public int mPriority;
    private boolean mRecommendVideoOnlyShowFullscreen;
    private boolean mResume;
    private String mScreenMode;
    private boolean mShowDanmakuBtn;
    private boolean mShowGoodsListBtn;
    private boolean mShowInteractive;
    private boolean mShowLikeBtn;
    private boolean mShowReportBtn;
    private boolean mShownMuteBtn;
    private boolean mSmallWindow;
    public String mSplayerGroup;
    private String mSrc;
    private boolean mStarted;
    private bk mTBDWInstance;
    private String mThumbnailSource;
    private HashMap<String, String> mUiConfig;
    private boolean mUnresetForList;
    private long mUserId;
    private HashMap<String, String> mUtParams;
    private String mVideoID;
    private String mVideoPlayScenes;
    private int mVideoRatioType;
    private String mVideoSource;
    private long mVideodDuration;
    private int mWidth;

    public static /* synthetic */ Object ipc$super(WXInteractiveComponent wXInteractiveComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1470271414:
                super.addEvent((String) objArr[0]);
                return null;
            case -713828414:
                super.updateProperties((Map) objArr[0]);
                return null;
            case -415570888:
                super.recycled();
                return null;
            case 196973982:
                super.notifyAppearStateChange((String) objArr[0], (String) objArr[1]);
                return null;
            case 253619399:
                super.applyLayoutAndEvent((WXComponent) objArr[0]);
                return null;
            case 978838742:
                super.removeEventFromView((String) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(WXInteractiveComponent wXInteractiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8ffdf8", new Object[]{wXInteractiveComponent});
        } else {
            wXInteractiveComponent.destroyInnerInFullScreen();
        }
    }

    static {
        kge.a(-1800021646);
        kge.a(688755897);
        kge.a(857599862);
        kge.a(1165543142);
        kge.a(-1522005455);
        kge.a(1441700737);
        kge.a(-1226623529);
        TAG = "WXInteractiveComponent";
        PREPARED = "prepared";
        PLAYING = AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING;
        PAUSED = "paused";
        FINISH = "finish";
        LANDSCAPE = "landscape";
        ERROR = "error";
        SCREENMODECHANGE = "screenModeChange";
        MUTEDCHANGE = "mutedChange";
        VIDEOEND = "end";
        CLICK = "click";
        START_LOADING = "loadstart";
        END_LOADING = "loadend";
        FIRST_FRAME = "firstvideoframe";
        METADATA = "meta";
    }

    public WXInteractiveComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mInteractiveId = -1L;
        this.mSplayerGroup = null;
        this.mPriority = 0;
        this.mSmallWindow = false;
        this.mLandscape = false;
        this.mGesture = false;
        this.mMuteDisplay = false;
        this.mShownMuteBtn = false;
        this.mHidePlayingIcon = false;
        this.mControlsViewHidden = false;
        this.mFullscreenBtnHidden = false;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mCurrentTime = 0;
        this.mHasPlay = false;
        this.mResume = false;
        this.mStarted = false;
        this.mNeedFirstPlayUT = true;
        this.mNeedAD = true;
        this.mLayerMode = "normal";
        this.mMute = false;
        this.mShowInteractive = true;
        this.isCompleted = false;
        this.mHttpHeader = null;
        this.mHasRender = false;
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_WXInteractiveComponent);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public FrameLayout mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2b290a72", new Object[]{this, context});
        }
        this.mComponentHostView = new FrameLayout(context);
        if (this.mInit) {
            if ("highPerformance".equals(this.mPlayerScene)) {
                ViewParent parent = this.mHigDWInstance.l().getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.mHigDWInstance.l());
                }
                this.mComponentHostView.addView(this.mHigDWInstance.l());
                return this.mComponentHostView;
            }
            ViewParent parent2 = this.mTBDWInstance.getView().getParent();
            if (parent2 != null && (parent2 instanceof ViewGroup)) {
                ((ViewGroup) parent2).removeView(this.mTBDWInstance.getView());
            }
            this.mComponentHostView.addView(this.mTBDWInstance.getView());
        }
        return this.mComponentHostView;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void applyLayoutAndEvent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1decc7", new Object[]{this, wXComponent});
            return;
        }
        appendEventToDOM("appear");
        appendEventToDOM("disappear");
        super.applyLayoutAndEvent(wXComponent);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void notifyAppearStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd959e", new Object[]{this, str, str2});
            return;
        }
        super.notifyAppearStateChange(str, str2);
        if (!TextUtils.isEmpty(this.mSplayerGroup)) {
            if ("appear".equals(str)) {
                c.a().a(this);
            } else if ("disappear".equals(str)) {
                c.a().b(this);
            }
        }
        if (getParentScroller() == null || !(getParentScroller() instanceof WXListComponent) || isFixed(this) || isSticky(this) || this.mUnresetForList || this.mSmallWindow || "highPerformance".equals(this.mPlayerScene)) {
            return;
        }
        if (str.equals("appear")) {
            if (this.mHasDisappear) {
                this.mInit = false;
                this.mHasRender = false;
                this.mResume = true;
            }
            init(this.mNeedFirstPlayUT, this.mNeedAD);
            this.mHasDisappear = false;
        } else if (!str.equals("disappear") || !this.mInit || this.mHasDisappear) {
        } else {
            bk bkVar = this.mTBDWInstance;
            if (bkVar != null && bkVar.getVideoState() == 1) {
                this.mHasPlayingEvent = true;
            } else {
                this.mHasPlayingEvent = false;
            }
            destroyInner();
            this.mHasDisappear = true;
        }
    }

    private boolean isFixed(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a90b1b9a", new Object[]{this, wXComponent})).booleanValue() : getStyles().isFixed() || (wXComponent.getParent() != null && isFixed(wXComponent.getParent()));
    }

    private boolean isSticky(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52045323", new Object[]{this, wXComponent})).booleanValue() : wXComponent.isSticky() || (wXComponent.getParent() != null && isSticky(wXComponent.getParent()));
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

    @WXComponentProp(name = "userId")
    public void setUserId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdec0ad5", new Object[]{this, new Long(j)});
        } else {
            this.mUserId = j;
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

    @WXComponentProp(name = oyw.VIDEO_PLAY_SCENES)
    public void setVideoPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33275b65", new Object[]{this, str});
        } else {
            this.mVideoPlayScenes = str;
        }
    }

    @WXComponentProp(name = sku.KEY_VIDEO_SOURCE)
    public void setVideoSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
        } else {
            this.mVideoSource = str;
        }
    }

    @WXComponentProp(name = "videoId")
    public void setVideoID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a27a7a5", new Object[]{this, str});
        } else {
            this.mVideoID = str;
        }
    }

    @WXComponentProp(name = UCClient.UI_PARAMS_KEY_GESTURE)
    public void setGesture(boolean z) {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1154d506", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mGesture = z;
        if (!this.mInit || this.mHasDisappear || (bkVar = this.mTBDWInstance) == null) {
            return;
        }
        bkVar.setNeedGesture(this.mGesture);
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

    @WXComponentProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            this.mSrc = str;
        }
    }

    @WXComponentProp(name = "onlyShowFullscreen")
    public void setRecommendVideoOnlyShowFullscreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463ab8e8", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendVideoOnlyShowFullscreen = z;
        }
    }

    @WXComponentProp(name = MusLiveVideo.ATTR_MUTE)
    public void setMuted(boolean z) {
        bl blVar;
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMute = z;
        if (this.mInit && !this.mHasDisappear && (bkVar = this.mTBDWInstance) != null) {
            bkVar.mute(this.mMute);
        } else if (!this.mInit || this.mHasDisappear || (blVar = this.mHigDWInstance) == null) {
        } else {
            blVar.e(this.mMute);
        }
    }

    @WXComponentProp(name = "playerScene")
    public void setPlayerScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5fa023a", new Object[]{this, str});
        } else if (this.mInitScene) {
        } else {
            this.mPlayerScene = str;
            this.mInitScene = true;
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

    @WXComponentProp(name = "cid")
    public void setCId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ac92ad", new Object[]{this, str});
        } else {
            this.mCId = str;
        }
    }

    @WXComponentProp(name = "playingIconHidden")
    public void setPlayingIconHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3d0a7e", new Object[]{this, new Boolean(z)});
        } else {
            this.mHidePlayingIcon = z;
        }
    }

    @WXComponentProp(name = "interactiveHidden")
    public void setInteractiveHidden(boolean z) {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24174683", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mShowInteractive = !z;
        if (!this.mInit || this.mHasDisappear || (bkVar = this.mTBDWInstance) == null) {
            return;
        }
        bkVar.showOrHideInteractive(this.mShowInteractive);
    }

    @WXComponentProp(name = "layerMode")
    public void setLayerMode(String str) {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c373f563", new Object[]{this, str});
            return;
        }
        this.mLayerMode = str;
        if ("mute".equals(this.mLayerMode)) {
            this.mMute = true;
            this.mShowInteractive = false;
        } else {
            this.mMute = false;
            this.mShowInteractive = true;
        }
        if (!this.mInit || this.mHasDisappear || (bkVar = this.mTBDWInstance) == null) {
            return;
        }
        bkVar.mute(this.mMute);
        if ("normal".equals(this.mLayerMode) && !this.mHasRender) {
            this.mHasRender = true;
        }
        this.mTBDWInstance.showOrHideInteractive("normal".equals(this.mLayerMode));
    }

    @WXComponentProp(name = "miniProgressViewHidden")
    public void setMiniProgressViewHidden(boolean z) {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2d5d8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mHideMiniProgressBar = z;
        if (!this.mInit || this.mHasDisappear || (bkVar = this.mTBDWInstance) == null) {
            return;
        }
        if (z) {
            bkVar.hideMiniProgressBar();
        } else {
            bkVar.showMiniProgressBar();
        }
    }

    @WXComponentProp(name = "controlsViewHidden")
    public void setControlsViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f59b86", new Object[]{this, new Boolean(z)});
        } else {
            this.mControlsViewHidden = z;
        }
    }

    @WXComponentProp(name = "smallWindow")
    public void setSmallWindow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bf4e38", new Object[]{this, new Boolean(z)});
        } else {
            this.mSmallWindow = z;
        }
    }

    @WXComponentProp(name = "unresetForList")
    public void setUnresetForList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31bc0c3a", new Object[]{this, new Boolean(z)});
        } else {
            this.mUnresetForList = z;
        }
    }

    @WXComponentProp(name = "toastViewHidden")
    public void setToastViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73dfa39", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideToastView = z;
        }
    }

    @WXComponentProp(name = "loadingHidden")
    public void setLoadingHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abbe8e9", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideLoading = z;
        }
    }

    @WXComponentProp(name = "gestureViewHidden")
    public void setGestureViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6339f257", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideGestureView = z;
        }
    }

    @WXComponentProp(name = "networkErrorViewHidden")
    public void setNetworkErrorViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5249e42", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideNetworkErrorView = z;
        }
    }

    @WXComponentProp(name = "playErrorViewHidden")
    public void setPlayErrorViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8ec8c", new Object[]{this, new Boolean(z)});
        } else {
            this.mHidePlayErrorView = z;
        }
    }

    @WXComponentProp(name = "thumbnailPlayBtnHidden")
    public void setThumbnailPlayBtnHiddenHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67c82db", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideThumbnailPlayBtn = z;
        }
    }

    @WXComponentProp(name = "shownMuteBtn")
    public void setShownMuteBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad0c2f9", new Object[]{this, new Boolean(z)});
        } else {
            this.mShownMuteBtn = z;
        }
    }

    @WXComponentProp(name = "muteDisplay")
    public void setMuteDisplay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a614e6", new Object[]{this, new Boolean(z)});
        } else {
            this.mMuteDisplay = z;
        }
    }

    @WXComponentProp(name = "landscape")
    public void setLandscape(boolean z) {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae57e54", new Object[]{this, new Boolean(z)});
        } else if (this.mLandscape == z) {
        } else {
            this.mLandscape = z;
            if (!this.mInit || this.mHasDisappear || (bkVar = this.mTBDWInstance) == null || bkVar.isFullScreen() == this.mLandscape) {
                return;
            }
            this.mTBDWInstance.toggleScreen();
        }
    }

    @WXComponentProp(name = "videoRatioType")
    public void setVideoRatioType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50439a30", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoRatioType = i;
        }
    }

    @WXComponentProp(name = "utParams")
    public void setUtParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87d3265", new Object[]{this, hashMap});
        } else {
            this.mUtParams = hashMap;
        }
    }

    @WXComponentProp(name = "uiConfig")
    public void setUiConfig(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26981554", new Object[]{this, hashMap});
        } else {
            this.mUiConfig = hashMap;
        }
    }

    @WXComponentProp(name = "splayer")
    public void setSplayer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260a9363", new Object[]{this, str});
        } else {
            this.mSplayerGroup = str;
        }
    }

    @WXComponentProp(name = "priority")
    public void setPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
        } else {
            this.mPriority = i;
        }
    }

    @WXComponentProp(name = "screenMode")
    public void setScreenMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d606e02", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mScreenMode = str;
            if (this.mTBDWInstance == null || !this.mInit) {
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
    }

    @WXComponentProp(name = "instanceType")
    public void setInstanceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a646d2c2", new Object[]{this, str});
        } else {
            this.mInstanceType = str;
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

    @WXComponentProp(name = MusLiveVideo.ATTR_POSTER)
    public void setPoster(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mThumbnailSource = str;
        }
    }

    @WXComponentProp(name = "thumbnailSrc")
    public void setThumbnailSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6bc05eb", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mThumbnailSource = str;
        }
    }

    @WXComponentProp(name = "autoplay")
    public void setAutoplay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c74e68", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoPlay = z;
        }
    }

    @WXComponentProp(name = Constants.Name.AUTO_PLAY)
    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoPlay = z;
        }
    }

    @WXComponentProp(name = "backCoverDisplay")
    public void setBackCoverDisplay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3469e799", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedbackCover = z;
        }
    }

    @WXComponentProp(name = "showDanmakuBtn")
    public void setShowDanmakuBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b9801", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowDanmakuBtn = z;
        }
    }

    @WXComponentProp(name = "showLikeBtn")
    public void setShowLikeBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627eff27", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowLikeBtn = z;
        }
    }

    @WXComponentProp(name = "showGoodsListBtn")
    public void setShowGoodsListBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731daec6", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowGoodsListBtn = z;
        }
    }

    @WXComponentProp(name = "showReportBtn")
    public void setShowReportBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26562c04", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowReportBtn = z;
        }
    }

    @WXComponentProp(name = "fullscreenBtnHidden")
    public void setFullscreenBtnHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa6f2e4", new Object[]{this, new Boolean(z)});
        } else {
            this.mFullscreenBtnHidden = z;
        }
    }

    @WXComponentProp(name = "contentMode")
    public void setContentMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05e5b0b", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
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
            } else if (c != 2) {
            } else {
                this.mAspectRatio = DWAspectRatio.DW_FIT_X_Y;
                this.mPosterScaleType = ImageView.ScaleType.FIT_XY;
            }
        }
    }

    @WXComponentProp(name = "playControl")
    public void setPlayControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb68518", new Object[]{this, str});
        } else if (!this.mInit || this.mHasDisappear) {
        } else {
            if ("play".equals(str)) {
                this.mHasPlay = true;
                if (this.mHigDWInstance != null) {
                    play();
                } else if (this.mTBDWInstance == null) {
                } else {
                    if (!TextUtils.isEmpty(this.mSplayerGroup)) {
                        c.a().b();
                    }
                    if (this.mTBDWInstance.getVideoState() == 0 || this.mTBDWInstance.getVideoState() == 5 || this.mTBDWInstance.getVideoState() == 8 || this.mTBDWInstance.getVideoState() == 4) {
                        this.mStarted = true;
                        this.mNeedFirstPlayUT = false;
                        this.mTBDWInstance.start();
                        return;
                    }
                    this.mTBDWInstance.playVideo();
                }
            } else if (!"pause".equals(str)) {
            } else {
                pause();
            }
        }
    }

    @WXComponentProp(name = "httpHeader")
    public void setRequestHeader(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6e6bd2", new Object[]{this, hashMap});
        } else {
            this.mHttpHeader = hashMap;
        }
    }

    @JSMethod
    public void setInstanceMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5fd86b", new Object[]{this, str});
            return;
        }
        this.mInstanceType = str;
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return;
        }
        blVar.a("DWVideo".equals(this.mInstanceType) ? DWInstanceType.VIDEO : DWInstanceType.PIC);
    }

    @JSMethod
    public void setCurrentTime(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1048f3", new Object[]{this, new Double(d)});
            return;
        }
        int i = (int) (d * 1000.0d);
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            bkVar.seekTo(i);
            return;
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return;
        }
        blVar.e(i);
    }

    @JSMethod
    public void getCurrentTime(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e755d9f1", new Object[]{this, jSCallback});
        } else if ((this.mTBDWInstance == null && this.mHigDWInstance == null) || jSCallback == null) {
        } else {
            HashMap hashMap = new HashMap(1);
            bk bkVar = this.mTBDWInstance;
            hashMap.put("result", Float.valueOf((bkVar != null ? bkVar.getCurrentPosition() : this.mHigDWInstance.j()) / 1000.0f));
            jSCallback.invoke(hashMap);
        }
    }

    @JSMethod
    public void getDuration(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a09e457", new Object[]{this, jSCallback});
        } else if ((this.mTBDWInstance == null && this.mHigDWInstance == null) || jSCallback == null) {
        } else {
            bk bkVar = this.mTBDWInstance;
            if (bkVar != null) {
                this.mVideodDuration = bkVar.getDuration();
            } else {
                this.mVideodDuration = this.mHigDWInstance.q();
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("result", Float.valueOf(((float) this.mVideodDuration) / 1000.0f));
            jSCallback.invoke(hashMap);
        }
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.mSplayerGroup)) {
            c.a().b();
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            bkVar.playVideo();
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

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            bkVar.pauseVideo();
            return;
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return;
        }
        blVar.f();
    }

    @JSMethod
    public void getScreenMode(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5826dc", new Object[]{this, jSCallback});
        } else if (this.mTBDWInstance == null || jSCallback == null) {
        } else {
            HashMap hashMap = new HashMap(1);
            if (this.mTBDWInstance.isFullScreen()) {
                hashMap.put("result", FULL_SCREEN_MODE);
            } else if (this.mTBDWInstance.isSmallWindow()) {
                hashMap.put("result", SMALL_SCREEN_MODE);
            } else {
                hashMap.put("result", NORMAL_SCREEN_MODE);
            }
            jSCallback.invoke(hashMap);
        }
    }

    @JSMethod
    public void getMuted(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1de3d4c", new Object[]{this, jSCallback});
        } else if ((this.mTBDWInstance == null && this.mHigDWInstance == null) || jSCallback == null) {
        } else {
            HashMap hashMap = new HashMap(1);
            bk bkVar = this.mTBDWInstance;
            hashMap.put("result", Boolean.valueOf(bkVar != null ? bkVar.isMute() : this.mHigDWInstance.h()));
            jSCallback.invoke(hashMap);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void addEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
            return;
        }
        super.addEvent(str);
        if (PREPARED.equals(str)) {
            this.mHasPreparedEvent = true;
        } else if (PLAYING.equals(str)) {
            this.mHasPlayingEvent = true;
        } else if (PAUSED.equals(str)) {
            this.mHasPausedEvent = true;
        } else if (FINISH.equals(str)) {
            this.mHasFinishEvent = true;
        } else if (LANDSCAPE.equals(str)) {
            this.mHasLandscapeEvent = true;
        } else if (ERROR.equals(str)) {
            this.mHasErrorEvent = true;
        } else if (MUTEDCHANGE.equalsIgnoreCase(str)) {
            this.mHasMutedChangeEvent = true;
        } else if (SCREENMODECHANGE.equalsIgnoreCase(str)) {
            this.mHasScreenModeChangeEvent = true;
        } else if (VIDEOEND.equals(str)) {
            this.mHasEnd = true;
        } else if (!CLICK.equals(str)) {
        } else {
            this.mHasClickEvent = true;
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void removeEventFromView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a57e4d6", new Object[]{this, str});
            return;
        }
        super.removeEventFromView(str);
        if (PREPARED.equals(str)) {
            this.mHasPreparedEvent = false;
        } else if (PLAYING.equals(str)) {
            this.mHasPlayingEvent = false;
        } else if (PAUSED.equals(str)) {
            this.mHasPausedEvent = false;
        } else if (FINISH.equals(str)) {
            this.mHasFinishEvent = false;
        } else if (LANDSCAPE.equals(str)) {
            this.mHasLandscapeEvent = false;
        } else if (ERROR.equals(str)) {
            this.mHasErrorEvent = false;
        } else if (MUTEDCHANGE.equalsIgnoreCase(str)) {
            this.mHasMutedChangeEvent = false;
        } else if (SCREENMODECHANGE.equalsIgnoreCase(str)) {
            this.mHasScreenModeChangeEvent = false;
        } else if (VIDEOEND.equals(str)) {
            this.mHasEnd = false;
        } else if (!CLICK.equals(str)) {
        } else {
            this.mHasClickEvent = false;
        }
    }

    private boolean checkData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa7d505d", new Object[]{this})).booleanValue();
        }
        if ((!TextUtils.isEmpty(this.mSrc) || !TextUtils.isEmpty(this.mVideoID)) && (getContext() instanceof Activity)) {
            return true;
        }
        com.taobao.taobaoavsdk.util.c.b("TBDWInstance", " WXInteractiveComponent checkData error ");
        return false;
    }

    private void init(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc123257", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!this.mInit && checkData() && "highPerformance".equals(this.mPlayerScene)) {
            initHighInstance();
        } else if (this.mInit || !checkData()) {
        } else {
            initNormalInstance(z2);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void recycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73ae438", new Object[]{this});
            return;
        }
        super.recycled();
        if (this.mHigDWInstance == null || this.mUnresetForList) {
            return;
        }
        this.mInit = false;
        destroyInner();
        this.mStarted = false;
        this.mPreload = null;
        this.mAutoPlay = false;
    }

    private void initHighInstance() {
        Activity activity;
        String componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca21e8e", new Object[]{this});
            return;
        }
        bl.a aVar = new bl.a((Activity) getContext());
        aVar.l("weex");
        aVar.f(this.mFrom);
        aVar.h(this.mContentId);
        aVar.i(this.mCId);
        aVar.a(this.mUserId);
        aVar.a(this.mSrc);
        if (b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enWeexMuteCreate", "true")) && (activity = (Activity) getContext()) != null && (activity instanceof Activity)) {
            Activity activity2 = activity;
            if (activity2.getComponentName() != null && (componentName = activity2.getComponentName().toString()) != null && (componentName.contains(WEEX_NATIVE_SHOP_NAME) || componentName.contains(WEEX_SHOP_ACTIVITY_NAME))) {
                this.mMute = true;
                this.mHidePlayingIcon = true;
            }
        }
        aVar.d(this.mMute);
        aVar.a(this.mUtParams);
        aVar.c(this.mWidth);
        aVar.b(this.mVideoID);
        aVar.d(this.mVideoSource);
        aVar.d(this.mHeight);
        aVar.c(this.mLoop);
        HashMap<String, String> hashMap = this.mHttpHeader;
        if (hashMap != null) {
            aVar.a((Map<String, String>) hashMap);
        }
        DWAspectRatio dWAspectRatio = this.mAspectRatio;
        if (dWAspectRatio != null) {
            aVar.a(dWAspectRatio);
        }
        if (!TextUtils.isEmpty(this.mVideoPlayScenes)) {
            aVar.k(this.mVideoPlayScenes);
        }
        aVar.a(DWInstanceType.PIC);
        this.mHigDWInstance = aVar.c();
        if (!TextUtils.isEmpty(this.mThumbnailSource)) {
            TUrlImageView tUrlImageView = new TUrlImageView(getContext());
            ImageView.ScaleType scaleType = this.mPosterScaleType;
            if (scaleType != null) {
                tUrlImageView.setScaleType(scaleType);
            }
            tUrlImageView.asyncSetImageUrl(this.mThumbnailSource);
            this.mHigDWInstance.a(tUrlImageView);
        }
        this.mHigDWInstance.a((av) this);
        if (this.mLoop) {
            this.mHigDWInstance.a((ax) this);
        }
        this.mHigDWInstance.b(this);
        mo1286getHostView().addView(this.mHigDWInstance.l());
        this.mHigDWInstance.a((u) this);
        if (this.mAutoPlay || (this.mResume && this.mStarted)) {
            this.mHigDWInstance.a(DWInstanceType.VIDEO);
            this.mStarted = true;
            this.mNeedFirstPlayUT = false;
            this.mHigDWInstance.c();
        } else if (METADATA.equals(this.mPreload)) {
            this.mHigDWInstance.a(DWInstanceType.VIDEO);
            this.mHigDWInstance.d();
        }
        if ("normal".equals(this.mLayerMode) && !this.mHasRender) {
            this.mHasRender = true;
        }
        this.mInit = true;
    }

    private void initNormalInstance(boolean z) {
        Activity activity;
        String componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e24ae1", new Object[]{this, new Boolean(z)});
            return;
        }
        bk.a aVar = new bk.a((Activity) getContext());
        aVar.k("weex");
        aVar.e(this.mFrom);
        aVar.h(this.mContentId);
        aVar.i(this.mCId);
        aVar.a(this.mInteractiveId);
        aVar.b(this.mUserId);
        aVar.a(this.mSrc);
        if (b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enWeexMuteCreate", "true")) && (activity = (Activity) getContext()) != null && (activity instanceof Activity)) {
            Activity activity2 = activity;
            if (activity2.getComponentName() != null && (componentName = activity2.getComponentName().toString()) != null && (componentName.contains(WEEX_NATIVE_SHOP_NAME) || componentName.contains(WEEX_SHOP_ACTIVITY_NAME))) {
                this.mMute = true;
                this.mHidePlayingIcon = true;
            }
        }
        aVar.f(this.mMute);
        aVar.g(this.mShowInteractive);
        aVar.a(this.mUtParams);
        aVar.c(this.mWidth);
        aVar.b(this.mVideoID);
        aVar.c(this.mVideoSource);
        aVar.d(this.mHeight);
        aVar.j(this.mNeedbackCover);
        aVar.B(this.mGesture);
        aVar.c(this.mLoop);
        aVar.E(this.mShowDanmakuBtn);
        aVar.p(this.mShowGoodsListBtn);
        aVar.G(this.mShowReportBtn);
        aVar.F(this.mShowLikeBtn);
        aVar.r(this.mHidePlayingIcon);
        aVar.s(this.mHideMiniProgressBar);
        aVar.t(this.mHideToastView);
        aVar.y(this.mHideLoading);
        aVar.u(this.mHideGestureView);
        aVar.v(this.mHideNetworkErrorView);
        aVar.w(this.mHidePlayErrorView);
        aVar.x(this.mHideThumbnailPlayBtn);
        aVar.n(!this.mFullscreenBtnHidden);
        aVar.A(true);
        aVar.o(z);
        aVar.e(this.mRecommendVideoOnlyShowFullscreen);
        aVar.M(this.mMuteDisplay);
        aVar.D(this.mSmallWindow);
        aVar.N(this.mShownMuteBtn);
        DWAspectRatio dWAspectRatio = this.mAspectRatio;
        if (dWAspectRatio != null) {
            aVar.a(dWAspectRatio);
        }
        if (!TextUtils.isEmpty(this.mVideoPlayScenes)) {
            aVar.g(this.mVideoPlayScenes);
        }
        if (!TextUtils.isEmpty(this.mThumbnailSource)) {
            aVar.i(true);
            com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar2 = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
            DWFrontCoverBean dWFrontCoverBean = new DWFrontCoverBean(0L, null, this.mThumbnailSource);
            dWFrontCoverBean.setScaleType(this.mPosterScaleType);
            aVar2.a(dWFrontCoverBean);
            aVar.a(aVar2);
        }
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
        this.mTBDWInstance.hideGoodsListView();
        this.mTBDWInstance.hideTopEventView();
        this.mTBDWInstance.hideCloseView();
        if (this.mControlsViewHidden) {
            this.mTBDWInstance.hideController();
        }
        this.mTBDWInstance.setVideoLifecycleListener(this);
        if (this.mLoop) {
            this.mTBDWInstance.setIVideoLoopCompleteListener(this);
        }
        this.mTBDWInstance.setRootViewClickListener(this);
        if (this.mSmallWindow) {
            this.mTBDWInstance.setHookSmallWindowClickListener(this);
            this.mTBDWInstance.setIDWScreenSmallWindowListener(this);
        }
        mo1286getHostView().addView(this.mTBDWInstance.getView());
        this.mTBDWInstance.setIDWMutedChangeListener(this);
        if (this.mAutoPlay || (this.mResume && this.mStarted)) {
            this.mStarted = true;
            this.mNeedFirstPlayUT = false;
            this.mTBDWInstance.start();
        } else if (METADATA.equals(this.mPreload)) {
            this.mTBDWInstance.asyncPrepareVideo();
        }
        if ("normal".equals(this.mLayerMode) && !this.mHasRender) {
            this.mHasRender = true;
        }
        this.mInit = true;
        if (this.mLandscape != this.mTBDWInstance.isFullScreen()) {
            this.mTBDWInstance.toggleScreen();
        } else if ((FULL_SCREEN_MODE.equals(this.mScreenMode) && !this.mTBDWInstance.isFullScreen()) || (NORMAL_SCREEN_MODE.equals(this.mScreenMode) && this.mTBDWInstance.isFullScreen())) {
            this.mTBDWInstance.toggleScreen();
        } else if (SMALL_SCREEN_MODE.equals(this.mScreenMode) && !this.mTBDWInstance.isSmallWindow()) {
            this.mTBDWInstance.toSmall();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void onFinishLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafc9ba3", new Object[]{this});
            return;
        }
        int layoutWidth = (int) getLayoutWidth();
        int layoutHeight = (int) getLayoutHeight();
        if (layoutWidth == this.mWidth && layoutHeight == this.mHeight) {
            return;
        }
        this.mWidth = layoutWidth;
        this.mHeight = layoutHeight;
        bk bkVar = this.mTBDWInstance;
        if (bkVar != null) {
            bkVar.setFrame(this.mWidth, this.mHeight);
        }
        bl blVar = this.mHigDWInstance;
        if (blVar == null) {
            return;
        }
        blVar.a(this.mWidth, this.mHeight);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateProperties(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
            return;
        }
        super.updateProperties(map);
        init(true, true);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        destroyInner();
        this.mInit = false;
        if (TextUtils.isEmpty(this.mSplayerGroup)) {
            return;
        }
        c.a().b(this);
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
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.avplayer.component.weex.WXInteractiveComponent.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            WXInteractiveComponent.access$000(WXInteractiveComponent.this);
                        }
                    }
                });
            } else {
                destroyInnerInFullScreen();
            }
        } else if (this.mHigDWInstance == null) {
        } else {
            mo1286getHostView().removeView(this.mHigDWInstance.l());
            this.mHigDWInstance.a((av) null);
            this.mHigDWInstance.m();
            this.mHigDWInstance = null;
        }
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
        mo1286getHostView().removeView(this.mTBDWInstance.getView());
        this.mTBDWInstance.setVideoLifecycleListener(null);
        this.mTBDWInstance.destroy();
        this.mTBDWInstance = null;
    }

    private boolean enableDelayDestroyInFullScreen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68506da5", new Object[]{this})).booleanValue() : b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enWxFullScreenDestroy", "true"));
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
        if (!this.mHasPlayingEvent) {
            return;
        }
        WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), PLAYING);
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
        if (!this.mHasPausedEvent) {
            return;
        }
        WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), PAUSED);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        this.mHasPlay = true;
        this.isCompleted = false;
        if (!this.mHasPlayingEvent) {
            return;
        }
        WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), PLAYING);
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
        WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), PREPARED);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if (!this.mHasErrorEvent) {
        } else {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), ERROR);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if (i == 3) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), FIRST_FRAME);
        } else if (i == 701) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), START_LOADING);
        } else if (i != 702) {
        } else {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), END_LOADING);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        bk bkVar;
        bk bkVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        this.mNeedAD = true;
        this.isCompleted = true;
        bk bkVar3 = this.mTBDWInstance;
        if (bkVar3 != null) {
            bkVar3.needAD(this.mNeedAD);
        }
        this.mHasPlay = false;
        this.mCurrentTime = 0;
        if (this.mHasFinishEvent && (!isHiv() || (bkVar2 = this.mTBDWInstance) == null || !bkVar2.isFullScreen())) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), FINISH);
        }
        if (!this.mHasEnd) {
            return;
        }
        if (isHiv() && (bkVar = this.mTBDWInstance) != null && bkVar.isFullScreen()) {
            return;
        }
        WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), VIDEOEND);
    }

    private boolean isHiv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("14ba8d16", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.mCId);
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
        if (!this.mHasRender) {
            this.mHasRender = true;
        }
        this.mLandscape = true;
        this.mTBDWInstance.showOrHideInteractive(true);
        if (this.mHasLandscapeEvent) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("landscape", true);
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), LANDSCAPE, hashMap);
        }
        this.mTBDWInstance.showTopEventView();
        this.mTBDWInstance.showGoodsListView();
        if (this.mHasScreenModeChangeEvent) {
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("screenMode", FULL_SCREEN_MODE);
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), SCREENMODECHANGE, hashMap2);
        }
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
        bkVar.mute(this.mMute);
        this.mTBDWInstance.showOrHideInteractive(this.mShowInteractive);
        if (this.mHasLandscapeEvent) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("landscape", false);
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), LANDSCAPE, hashMap);
        }
        this.mTBDWInstance.hideGoodsListView();
        this.mTBDWInstance.hideTopEventView();
        if (isHiv() && this.isCompleted && this.mHasFinishEvent) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), FINISH);
        }
        if (isHiv() && this.isCompleted && this.mHasEnd) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), VIDEOEND);
        }
        String str = this.mTBDWInstance.isSmallWindow() ? SMALL_SCREEN_MODE : NORMAL_SCREEN_MODE;
        if (this.mHasScreenModeChangeEvent) {
            HashMap hashMap2 = new HashMap(1);
            if (this.mTBDWInstance.isSmallWindow()) {
                hashMap2.put("screenMode", SMALL_SCREEN_MODE);
            } else {
                hashMap2.put("screenMode", NORMAL_SCREEN_MODE);
            }
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), SCREENMODECHANGE, hashMap2);
        }
        this.mScreenMode = str;
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.mCurrentTime = i;
        if (this.mVideodDuration != 0) {
            return;
        }
        this.mVideodDuration = i3;
    }

    @Override // com.taobao.avplayer.ax
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        if (this.mHasFinishEvent) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), FINISH);
        }
        if (!this.mHasEnd) {
            return;
        }
        WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), VIDEOEND);
    }

    @Override // com.taobao.avplayer.common.m
    public void onSmallWindowClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffa2877", new Object[]{this});
        } else if (!this.mHasClickEvent) {
        } else {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), CLICK);
        }
    }

    @Override // com.taobao.avplayer.common.u
    public void onMutedChange(boolean z) {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff26311", new Object[]{this, new Boolean(z)});
        } else if (!this.mHasMutedChangeEvent || (bkVar = this.mTBDWInstance) == null || bkVar.isFullScreen()) {
        } else {
            this.mMute = z;
            HashMap hashMap = new HashMap(1);
            hashMap.put(MusLiveVideo.ATTR_MUTE, Boolean.valueOf(z));
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), MUTEDCHANGE, hashMap);
        }
    }

    @Override // com.taobao.avplayer.common.ab
    public void onNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c32d52d", new Object[]{this});
            return;
        }
        if (this.mHasScreenModeChangeEvent) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("screenMode", NORMAL_SCREEN_MODE);
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), SCREENMODECHANGE, hashMap);
        }
        this.mScreenMode = NORMAL_SCREEN_MODE;
    }

    @Override // com.taobao.avplayer.common.ab
    public void onSmall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d577aef", new Object[]{this});
            return;
        }
        if (this.mHasScreenModeChangeEvent) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("screenMode", SMALL_SCREEN_MODE);
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), SCREENMODECHANGE, hashMap);
        }
        this.mScreenMode = SMALL_SCREEN_MODE;
    }

    @Override // com.taobao.avplayer.common.z
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        if (this.mHasClickEvent) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), CLICK);
        }
        return false;
    }
}
