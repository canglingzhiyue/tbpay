package com.taobao.avplayer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.IDWObject;
import com.taobao.avplayer.interactivelifecycle.backcover.model.a;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.ddf;
import tb.ddg;
import tb.kbi;
import tb.kbj;
import tb.kbl;
import tb.kcj;
import tb.kge;

/* loaded from: classes6.dex */
public class DWContext implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SP_KEY_DANMA_SHOWN = "SP_KEY_DANMA_SHOWN";
    private Activity mActivity;
    private boolean mActivityToggleForLandscape;
    public Bitmap mAlbumArtBitamp;
    public BaseAnalysis mAnalysis;
    public Context mApplicationontext;
    public boolean mAudioOnly;
    private a mBackCover;
    public String mBackCoverWXUrl;
    public boolean mBackgroundAudio;
    public boolean mBackgroundVideo;
    public boolean mCanShowPreviousNextButton;
    public String mCid;
    public ap mConfigAdapter;
    public com.taobao.avplayer.common.d mConfigParamsAdapter;
    public int mConnectTimeout;
    public String mContentId;
    private Map<String, String> mControlParams;
    private Map<String, String> mCustomParams;
    public com.taobao.avplayer.common.ad mDWAlarmAdapter;
    private com.taobao.avplayer.core.component.d mDWComponentWrapperManager;
    private d mDWConfigObject;
    private g mDWDataManager;
    public com.taobao.avplayer.common.p mDWImageAdapter;
    public aq mDWImageLoaderAdapter;
    private com.taobao.avplayer.playercontrol.h mDWToastContainer;
    public boolean mDisableSurfaceView;
    private com.taobao.avplayer.playercontrol.c mDwKeyBackController;
    public String mDynamicPlayEx;
    private Map<Integer, kbl> mEventSubscriberMap;
    private String mFirstRenderOptimize;
    private boolean mFloating;
    private boolean mFloatingToggle;
    public String mFrom;
    private com.taobao.avplayer.interactivelifecycle.frontcover.model.a mFrontCover;
    private boolean mFullScreenMode;
    private boolean mGoodsListFullScreenShown;
    private boolean mHardwareAvc;
    public int mHeight;
    public boolean mHiddenGestureView;
    public boolean mHiddenLoading;
    public boolean mHiddenMiniProgressBar;
    public boolean mHiddenNetworkErrorView;
    public boolean mHiddenPlayErrorView;
    public boolean mHiddenPlayingIcon;
    public boolean mHiddenThumbnailPlayBtn;
    public boolean mHiddenToastView;
    private boolean mHideControllder;
    private boolean mHideNormalGoodsView;
    public boolean mHookKeyBackToggleEvent;
    public Map<String, String> mHttpHeader;
    private bd mIctAddWeexCallback;
    private be mIctShowWeexCallback;
    private bf mIctTmpCallback;
    private bg mIctUpdateWeexCmpAnchorCallback;
    private bh mIctWXCmpUtilsCallback;
    private bi mIctWXCmpUtilsCallback2;
    public boolean mInVideoDetail;
    private DWVideoScreenType mInitScreenType;
    private DWInstanceType mInstanceType;
    private boolean mInstantSeekingEnable;
    public long mInteractiveId;
    public Map<String, String> mInteractiveParms;
    public boolean mIsFloat;
    private boolean mIsShare;
    public boolean mLoop;
    public HashMap<String, String> mMetaData;
    private boolean mMiniProgressAnchorShown;
    private boolean mMute;
    public boolean mMuteDisplay;
    public int mMuteIconBottomMargin;
    public boolean mMuteIconDisplay;
    public int mMuteIconLeftMargin;
    public int mMuteIconRightMargin;
    public int mMuteIconTopMargin;
    private boolean mNeedAD;
    private boolean mNeedAfterAD;
    private boolean mNeedBackCover;
    private boolean mNeedCloseUT;
    private boolean mNeedCommitUserToFirstFrame;
    private boolean mNeedFirstPlayUT;
    private boolean mNeedFrontCover;
    private boolean mNeedGesture;
    private boolean mNeedMSG;
    public boolean mNeedRequestAudio;
    public boolean mNeedScreenButton;
    public boolean mNeedSmallWindow;
    public boolean mNeedVideoCache;
    public com.taobao.avplayer.common.v mNetworkAdapter;
    public ar mNetworkFlowAdapter;
    public ddf mNetworkUtilsAdapter;
    public int mNormalHeight;
    public int mNormalWidth;
    private String mOrangeGoodsListShown;
    private String mOrangeReportShown;
    public int mPanoType;
    public boolean mPauseInBackground;
    public MediaPlayControlContext mPlayContext;
    private Map<String, String> mPlayExpUtParams;
    private boolean mPlayRateBtnEnable;
    public String mPlayScenes;
    private String mPlayToken;
    private boolean mPredisPlayInteractiveRightBar;
    private boolean mPrepareToFirstFrame;
    private String mRID;
    public int mReadTimeout;
    private boolean mRecommendVideoOnlyShowFullscreen;
    public boolean mReleaseShortFocusWhenPause;
    private boolean mReportFullScreenShown;
    private boolean mReportShown;
    public int mRetryTime;
    private View mRightBottomIcon;
    private LinearLayout.LayoutParams mRightBottomLp;
    private View mRightUpIcon;
    private LinearLayout.LayoutParams mRightUpLp;
    public String mScene;
    public com.taobao.avplayer.common.ac mSharedapter;
    private ArrayList<Boolean> mShowCustomIconOrNotList;
    private boolean mShowGoodsList;
    private boolean mShowInteractive;
    private boolean mShowNotWifiHint;
    public boolean mShowPlayRate;
    private boolean mShowPlayWithCacheHint;
    private boolean mShowWXBackCoverOrNot;
    private String mSourcePageName;
    public int mStartPos;
    private String mStatRemoveList;
    private Surface mSurface;
    public String mSwitchScene;
    public long mSwitchSceneTime;
    public ddg mTlogAdapter;
    public float mToastTopMargin;
    public as mUTAdapter;
    public boolean mUseAudioCache;
    public boolean mUseShortAudioFocus;
    public long mUserId;
    private com.taobao.avplayer.common.af mUserInfoAdapter;
    private com.taobao.avplayer.common.ag mUserLoginAdapter;
    public String mUsingInterface;
    private Map<String, String> mUtParams;
    private at mVideo;
    private DWAspectRatio mVideoAspectRatio;
    public String mVideoId;
    private DWVideoScreenType mVideoScreenType;
    public String mVideoSource;
    private String mVideoToken;
    private float mVolume;
    public int mWidth;
    private Window mWindow;
    private HashMap<String, Boolean> whiteWeexCmpList;

    static {
        kge.a(914444694);
        kge.a(-996138287);
    }

    public boolean isActivityToggleForLandscape() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9766f8aa", new Object[]{this})).booleanValue() : this.mActivityToggleForLandscape;
    }

    public void setActivityToggleForLandscape(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8f38b6", new Object[]{this, new Boolean(z)});
        } else {
            this.mActivityToggleForLandscape = z;
        }
    }

    public void setPrepareToFirstFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa2e4f0", new Object[]{this, new Boolean(z)});
        } else {
            this.mPrepareToFirstFrame = z;
        }
    }

    public boolean getPrepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef5134f4", new Object[]{this})).booleanValue() : this.mPrepareToFirstFrame;
    }

    public void setShowNotWifiHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dd9fd", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowNotWifiHint = z;
        }
    }

    public void setShowPlayWithCacheHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adebe9bd", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowPlayWithCacheHint = z;
        }
    }

    public boolean getShowNotWifiHint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f481047", new Object[]{this})).booleanValue() : this.mShowNotWifiHint;
    }

    public boolean getShowPlayWithCacheHint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("82016f87", new Object[]{this})).booleanValue() : this.mShowPlayWithCacheHint;
    }

    public d getDWConfigObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bc55b404", new Object[]{this}) : this.mDWConfigObject;
    }

    public void setDWConfigObject(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32c8b86", new Object[]{this, dVar});
        } else {
            this.mDWConfigObject = dVar;
        }
    }

    public DWInstanceType getInstanceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInstanceType) ipChange.ipc$dispatch("43ddfe31", new Object[]{this}) : this.mInstanceType;
    }

    public void setInstanceType(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
        } else {
            this.mInstanceType = dWInstanceType;
        }
    }

    public boolean isFloatingToggle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad611d4f", new Object[]{this})).booleanValue() : this.mFloatingToggle;
    }

    public void setFloatingToggle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221414b1", new Object[]{this, new Boolean(z)});
        } else {
            this.mFloatingToggle = z;
        }
    }

    public boolean isFloating() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53950bdb", new Object[]{this})).booleanValue() : this.mFloating;
    }

    public void setFloating(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee03eda5", new Object[]{this, new Boolean(z)});
        } else {
            this.mFloating = z;
        }
    }

    public void bindWindow(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c507bd3", new Object[]{this, window});
            return;
        }
        this.mWindow = window;
        this.mDwKeyBackController.a(window);
    }

    public void unbindWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c058f6d", new Object[]{this});
            return;
        }
        this.mWindow = null;
        this.mDwKeyBackController.c();
    }

    public Window getWindow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Window) ipChange.ipc$dispatch("7f59f544", new Object[]{this}) : this.mWindow;
    }

    public boolean isHiddenPlayingIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("317cd4be", new Object[]{this})).booleanValue() : this.mHiddenPlayingIcon;
    }

    public void setNeedCommitUserToFirstFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84584bfb", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedCommitUserToFirstFrame = z;
        }
    }

    public boolean getNeedCommitUserToFirstFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f3055f1", new Object[]{this})).booleanValue() : this.mNeedCommitUserToFirstFrame;
    }

    public String getPlayToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dbb989ea", new Object[]{this}) : this.mPlayToken;
    }

    public void genPlayToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9e8bbc", new Object[]{this});
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.mPlayToken)) {
                return;
            }
            if (getUserInfoAdapter() != null) {
                this.mPlayToken = kcj.a(getUserInfoAdapter().b());
                return;
            }
            this.mPlayToken = System.currentTimeMillis() + "_" + (Math.random() * 100000.0d);
        } catch (Throwable unused) {
            this.mPlayToken = System.currentTimeMillis() + "_";
        }
    }

    public Surface getExternSurface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Surface) ipChange.ipc$dispatch("11eb1424", new Object[]{this}) : this.mSurface;
    }

    public void setExternSurface(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7980fefe", new Object[]{this, surface});
        } else {
            this.mSurface = surface;
        }
    }

    public boolean isMiniProgressAnchorShown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55be1a19", new Object[]{this})).booleanValue() : this.mMiniProgressAnchorShown;
    }

    public void setMiniProgressAnchorShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed350697", new Object[]{this, new Boolean(z)});
        } else {
            this.mMiniProgressAnchorShown = z;
        }
    }

    public boolean isHiddenMiniProgressBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("211aec6", new Object[]{this})).booleanValue() : this.mHiddenMiniProgressBar;
    }

    public void setHiddenMiniProgressBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4515758a", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenMiniProgressBar = z;
        }
    }

    public boolean isHiddenToastView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2024e3", new Object[]{this})).booleanValue() : this.mHiddenToastView;
    }

    public void setHiddenToastView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9faf0d0d", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenToastView = z;
        }
    }

    public boolean isHiddenGestureView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("910c1f05", new Object[]{this})).booleanValue() : this.mHiddenGestureView;
    }

    public void setHiddenGestureView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c56692b", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenGestureView = z;
        }
    }

    public boolean isHiddenNetworkErrorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee7264de", new Object[]{this})).booleanValue() : this.mHiddenNetworkErrorView;
    }

    public void setHiddenNetworkErrorView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fd7702", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenNetworkErrorView = z;
        }
    }

    public boolean isHiddenPlayErrorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e76a12f0", new Object[]{this})).booleanValue() : this.mHiddenPlayErrorView;
    }

    public void setHiddenPlayErrorView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420e84a0", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenPlayErrorView = z;
        }
    }

    public boolean isHiddenThumbnailPlayBtn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2f78c1b", new Object[]{this})).booleanValue() : this.mHiddenThumbnailPlayBtn;
    }

    public void setHiddenThumbnailPlayBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251d3765", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenThumbnailPlayBtn = z;
        }
    }

    public boolean isHiddenLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eee90fb3", new Object[]{this})).booleanValue() : this.mHiddenLoading;
    }

    public void setHiddenLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c612ea3d", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenLoading = z;
        }
    }

    public String getVideoToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this}) : this.mVideoToken;
    }

    public void setShowGoodsList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a436f8", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowGoodsList = z;
        }
    }

    public boolean getShowGoodsList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df35aec", new Object[]{this})).booleanValue();
        }
        if (this.mConfigAdapter != null) {
            if ("true".equals(this.mOrangeGoodsListShown)) {
                return this.mShowGoodsList;
            }
            if ("false".equals(this.mOrangeGoodsListShown)) {
                return false;
            }
        }
        return this.mShowGoodsList;
    }

    public boolean isInstantSeekingEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d2e7201", new Object[]{this})).booleanValue() : this.mInstantSeekingEnable;
    }

    public void setInstantSeekingEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31be03f", new Object[]{this, new Boolean(z)});
            return;
        }
        ap apVar = this.mConfigAdapter;
        if (apVar != null && !apVar.d()) {
            return;
        }
        this.mInstantSeekingEnable = z;
    }

    public DWAspectRatio getVideoAspectRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWAspectRatio) ipChange.ipc$dispatch("21c49cc", new Object[]{this}) : this.mVideoAspectRatio;
    }

    public void setVideoAspectRatio(DWAspectRatio dWAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89072586", new Object[]{this, dWAspectRatio});
        } else {
            this.mVideoAspectRatio = dWAspectRatio;
        }
    }

    public void setLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
        } else {
            this.mLoop = z;
        }
    }

    public boolean isPlayRateBtnEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59bf1b2c", new Object[]{this})).booleanValue() : this.mPlayRateBtnEnable;
    }

    public void setPlayRateBtnEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a02f1e4", new Object[]{this, new Boolean(z)});
            return;
        }
        ap apVar = this.mConfigAdapter;
        if (apVar != null && !apVar.f()) {
            return;
        }
        this.mPlayRateBtnEnable = z;
    }

    public String getOrangeReportShown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29c50420", new Object[]{this}) : this.mOrangeReportShown;
    }

    public String getOrangeGoodsListShown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38f606f8", new Object[]{this}) : this.mOrangeGoodsListShown;
    }

    public void setReportShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2284f992", new Object[]{this, new Boolean(z)});
        } else {
            this.mReportShown = z;
        }
    }

    public boolean getReportShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9c25012", new Object[]{this})).booleanValue();
        }
        if (this.mConfigAdapter != null) {
            if ("true".equals(this.mOrangeReportShown)) {
                return this.mReportShown;
            }
            if ("false".equals(this.mOrangeReportShown)) {
                return false;
            }
        }
        return this.mReportShown;
    }

    public void setReportFullScreenShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffadd44d", new Object[]{this, new Boolean(z)});
        } else {
            this.mReportFullScreenShown = z;
        }
    }

    public void setGoodsListFullScreenShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05914e9", new Object[]{this, new Boolean(z)});
        } else {
            this.mGoodsListFullScreenShown = z;
        }
    }

    public boolean getReportFullScreenShown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("320ff2f7", new Object[]{this})).booleanValue() : this.mReportFullScreenShown;
    }

    public boolean getGoodsListFullScreenShown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3bcf2443", new Object[]{this})).booleanValue() : this.mGoodsListFullScreenShown;
    }

    public void setUserInfoAdapter(com.taobao.avplayer.common.af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e255b543", new Object[]{this, afVar});
        } else {
            this.mUserInfoAdapter = afVar;
        }
    }

    public void setUserLoginAdapter(com.taobao.avplayer.common.ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb3dee3", new Object[]{this, agVar});
        } else {
            this.mUserLoginAdapter = agVar;
        }
    }

    public com.taobao.avplayer.common.ag getUserLoginAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.ag) ipChange.ipc$dispatch("d441567b", new Object[]{this}) : this.mUserLoginAdapter;
    }

    public com.taobao.avplayer.common.af getUserInfoAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.af) ipChange.ipc$dispatch("2b744d55", new Object[]{this}) : this.mUserInfoAdapter;
    }

    public void setRecommendVideoOnlyShowFullscreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463ab8e8", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendVideoOnlyShowFullscreen = z;
        }
    }

    public boolean getRecommendVideoOnlyShowFullscreen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12175064", new Object[]{this})).booleanValue() : this.mRecommendVideoOnlyShowFullscreen;
    }

    public void setHideNormalGoodsView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98406c9d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mHideNormalGoodsView = z;
        setShowGoodsList(false);
    }

    public boolean getHideNormalGoodsView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff3d83a7", new Object[]{this})).booleanValue() : this.mHideNormalGoodsView;
    }

    public com.taobao.avplayer.common.f getDWEventAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.f) ipChange.ipc$dispatch("efc7bb38", new Object[]{this}) : b.f16469a;
    }

    public com.taobao.avplayer.playercontrol.hiv.g getHivEventAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.playercontrol.hiv.g) ipChange.ipc$dispatch("60bb6218", new Object[]{this}) : b.b;
    }

    public void setNeedGesture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a6efbc", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedGesture = z;
        }
    }

    public boolean getNeedGesture() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d3eca8", new Object[]{this})).booleanValue() : this.mNeedGesture;
    }

    public void setFullScreenMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c740e0d", new Object[]{this, new Boolean(z)});
        } else {
            this.mFullScreenMode = z;
        }
    }

    public boolean getFullScreenMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed5c579f", new Object[]{this})).booleanValue() : this.mFullScreenMode;
    }

    public void setNeedMSG(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a3a884", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedMSG = z;
        }
    }

    public boolean getNeedMSG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2ea20e0", new Object[]{this})).booleanValue() : this.mNeedMSG;
    }

    public void setInitScreenType(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c426d1a", new Object[]{this, dWVideoScreenType});
        } else {
            this.mInitScreenType = dWVideoScreenType;
        }
    }

    public DWVideoScreenType getInitScreenType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWVideoScreenType) ipChange.ipc$dispatch("64e72b5c", new Object[]{this}) : this.mInitScreenType;
    }

    public void setDWToastContainer(com.taobao.avplayer.playercontrol.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c12e4bc", new Object[]{this, hVar});
        } else {
            this.mDWToastContainer = hVar;
        }
    }

    public void setWhiteWeexCmpList(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa23d2a7", new Object[]{this, arrayList});
        } else if (arrayList == null) {
            this.whiteWeexCmpList.clear();
        } else {
            this.whiteWeexCmpList.clear();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    this.whiteWeexCmpList.put(next, true);
                }
            }
        }
    }

    public Map<String, Boolean> getWhiteWeexCmpList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ccda61cc", new Object[]{this}) : Collections.unmodifiableMap(this.whiteWeexCmpList);
    }

    public void showToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
        } else if (this.mDWToastContainer == null || TextUtils.isEmpty(str) || isHiddenToastView()) {
        } else {
            this.mDWToastContainer.a(str, this.mToastTopMargin);
        }
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this}) : this.mVideoId;
    }

    public String getVideoSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("534d0fb9", new Object[]{this}) : this.mVideoSource;
    }

    public void setNeedAD(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c389d1d2", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedAD = z;
        }
    }

    public boolean needAD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f130344", new Object[]{this})).booleanValue() : this.mNeedAD;
    }

    public void setNeedAfterAD(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a3e7c6", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedAfterAD = z;
        }
    }

    public boolean needAfterAD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2350f994", new Object[]{this})).booleanValue() : this.mNeedAfterAD;
    }

    public boolean needCloseUT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("431eb12c", new Object[]{this})).booleanValue() : this.mNeedCloseUT;
    }

    public void setNeedCloseUT(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8d232e", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedCloseUT = z;
        }
    }

    public boolean needFirstPlayUT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c38bf38", new Object[]{this})).booleanValue() : this.mNeedFirstPlayUT;
    }

    public void setNeedFirstPlayUT(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fec5a2", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedFirstPlayUT = z;
        }
    }

    public boolean isNeedBackCover() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed878a9b", new Object[]{this})).booleanValue() : this.mNeedBackCover;
    }

    public void setNeedBackCover(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b43cc55", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedBackCover = z;
        }
    }

    public void setBacktCover(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1183c7", new Object[]{this, aVar});
        } else {
            this.mBackCover = aVar;
        }
    }

    public a getBackCover() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5edf9f89", new Object[]{this}) : this.mBackCover;
    }

    public boolean isNeedFrontCover() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c956d99", new Object[]{this})).booleanValue() : this.mNeedFrontCover;
    }

    public void setNeedFrontCover(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9969cda7", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedFrontCover = z;
        }
    }

    public com.taobao.avplayer.interactivelifecycle.frontcover.model.a getFrontCoverData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.interactivelifecycle.frontcover.model.a) ipChange.ipc$dispatch("2a052d2b", new Object[]{this}) : this.mFrontCover;
    }

    public boolean needRequestFrontCoverData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f72e515c", new Object[]{this})).booleanValue() : this.mNeedFrontCover && this.mFrontCover == null;
    }

    public void setFrontCoverData(com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5ef765", new Object[]{this, aVar});
        } else {
            this.mFrontCover = aVar;
        }
    }

    public DWContext(Activity activity) {
        this.mMute = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
        this.mShowInteractive = true;
        this.whiteWeexCmpList = new HashMap<>();
        this.mShowNotWifiHint = true;
        this.mShowPlayWithCacheHint = true;
        this.mPauseInBackground = false;
        this.mInstanceType = DWInstanceType.VIDEO;
        this.mConnectTimeout = 0;
        this.mReadTimeout = 0;
        this.mRetryTime = 0;
        this.mShowWXBackCoverOrNot = true;
        this.mShowPlayRate = true;
        this.mInteractiveId = -1L;
        this.mUserId = -1L;
        this.mNeedScreenButton = true;
        this.mNeedCloseUT = true;
        this.mNeedFirstPlayUT = true;
        this.mVideoScreenType = DWVideoScreenType.NORMAL;
        this.mShowGoodsList = true;
        this.mScene = "";
        this.mMuteIconLeftMargin = -1;
        this.mMuteIconRightMargin = -1;
        this.mMuteIconBottomMargin = -1;
        this.mMuteIconTopMargin = -1;
        this.mPanoType = 0;
        this.mStartPos = 0;
        this.mNeedRequestAudio = true;
        this.mOrangeReportShown = "true";
        this.mOrangeGoodsListShown = "true";
        this.mVideoAspectRatio = DWAspectRatio.DW_FIT_CENTER;
        this.mVolume = -1.0f;
        this.mHttpHeader = null;
        this.mPrepareToFirstFrame = false;
        this.mUseShortAudioFocus = false;
        this.mReleaseShortFocusWhenPause = true;
        this.mActivity = activity;
        this.mDWComponentWrapperManager = new com.taobao.avplayer.core.component.d();
        this.mDwKeyBackController = new com.taobao.avplayer.playercontrol.c(this.mActivity);
        this.mDWDataManager = new g(this);
        this.mUtParams = new HashMap();
        this.mPlayExpUtParams = new HashMap();
        this.mEventSubscriberMap = new HashMap(8);
        this.mCustomParams = new HashMap();
        this.mControlParams = new HashMap();
        initExtra();
    }

    public DWContext(Activity activity, boolean z) {
        this.mMute = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
        this.mShowInteractive = true;
        this.whiteWeexCmpList = new HashMap<>();
        this.mShowNotWifiHint = true;
        this.mShowPlayWithCacheHint = true;
        this.mPauseInBackground = false;
        this.mInstanceType = DWInstanceType.VIDEO;
        this.mConnectTimeout = 0;
        this.mReadTimeout = 0;
        this.mRetryTime = 0;
        this.mShowWXBackCoverOrNot = true;
        this.mShowPlayRate = true;
        this.mInteractiveId = -1L;
        this.mUserId = -1L;
        this.mNeedScreenButton = true;
        this.mNeedCloseUT = true;
        this.mNeedFirstPlayUT = true;
        this.mVideoScreenType = DWVideoScreenType.NORMAL;
        this.mShowGoodsList = true;
        this.mScene = "";
        this.mMuteIconLeftMargin = -1;
        this.mMuteIconRightMargin = -1;
        this.mMuteIconBottomMargin = -1;
        this.mMuteIconTopMargin = -1;
        this.mPanoType = 0;
        this.mStartPos = 0;
        this.mNeedRequestAudio = true;
        this.mOrangeReportShown = "true";
        this.mOrangeGoodsListShown = "true";
        this.mVideoAspectRatio = DWAspectRatio.DW_FIT_CENTER;
        this.mVolume = -1.0f;
        this.mHttpHeader = null;
        this.mPrepareToFirstFrame = false;
        this.mUseShortAudioFocus = false;
        this.mReleaseShortFocusWhenPause = true;
        this.mActivity = activity;
        this.mDWDataManager = new g(this);
        this.mUtParams = new HashMap();
        this.mPlayExpUtParams = new HashMap();
        this.mCustomParams = new HashMap();
        this.mControlParams = new HashMap();
        this.mAnalysis = new com.taobao.taobaoavsdk.Tracer.e();
        initExtra();
    }

    private void initExtra() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d6dfd67", new Object[]{this});
        } else {
            this.mStatRemoveList = OrangeConfig.getInstance().getConfig("DWInteractive", "StatRemoveList", "[\"videoFirstPlay\", \"videoRealPlay\", \"videoClose\", \"videoShow\", \"videoComplete\"]");
        }
    }

    public boolean statInRemoveList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e53ae310", new Object[]{this, str})).booleanValue() : com.taobao.taobaoavsdk.util.b.b(str, this.mStatRemoveList);
    }

    public void handleKeyBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53144225", new Object[]{this});
        } else {
            this.mDwKeyBackController.a();
        }
    }

    public void unregisterKeyBackEventListener(com.taobao.avplayer.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e48eb6", new Object[]{this, bVar});
        } else {
            this.mDwKeyBackController.b(bVar);
        }
    }

    public void registerKeyBackEventListener(com.taobao.avplayer.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce2f5dd", new Object[]{this, bVar});
        } else {
            this.mDwKeyBackController.a(bVar);
        }
    }

    public void queryInteractiveData(com.taobao.avplayer.common.w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("332bf233", new Object[]{this, wVar, new Boolean(z)});
        } else {
            this.mDWDataManager.a(wVar, z);
        }
    }

    public void queryInteractiveDataFromHiv(com.taobao.avplayer.common.w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1e2ff0", new Object[]{this, wVar, new Boolean(z)});
        } else {
            this.mDWDataManager.b(wVar, z);
        }
    }

    public void queryConfigData(com.taobao.avplayer.common.w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7581bb03", new Object[]{this, wVar, new Boolean(z)});
        } else {
            this.mDWDataManager.e(wVar, z);
        }
    }

    public void queryVideoConfigData2(com.taobao.avplayer.common.w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b7fe84", new Object[]{this, wVar, new Boolean(z)});
        } else {
            this.mDWDataManager.c(wVar, z);
        }
    }

    public void queryVideoConfigData(com.taobao.avplayer.common.w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa83918", new Object[]{this, wVar, new Boolean(z)});
        } else {
            this.mDWDataManager.d(wVar, z);
        }
    }

    public void queryBackCoverData(com.taobao.avplayer.common.w wVar, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96a7e5e", new Object[]{this, wVar, map, new Boolean(z)});
        } else {
            this.mDWDataManager.a(wVar, map, z);
        }
    }

    public void sendTaokeRequest(Map<String, String> map, com.taobao.avplayer.common.w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeaa6699", new Object[]{this, map, wVar});
        } else {
            this.mDWDataManager.a(map, wVar);
        }
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else {
            this.mMute = z;
        }
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue() : this.mMute;
    }

    public void showInteractive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1cf72a8", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowInteractive = z;
        }
    }

    public boolean isShowInteractive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2753bc26", new Object[]{this})).booleanValue() : this.mShowInteractive;
    }

    public boolean isHideControllder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("93ad7361", new Object[]{this})).booleanValue() : this.mHideControllder;
    }

    public void hideControllerView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc697eca", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideControllder = z;
        }
    }

    public void addUtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e23998", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.mUtParams.putAll(map);
        }
    }

    public void addCustomParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7d0586", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.mCustomParams.putAll(map);
        }
    }

    public Map<String, String> getCustomParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("62345009", new Object[]{this}) : this.mCustomParams;
    }

    public void addPlayExpUtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3d2b71", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.mPlayExpUtParams.putAll(map);
        }
    }

    public void addIctAddWeexCallback(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d058dc", new Object[]{this, bdVar});
        } else {
            this.mIctAddWeexCallback = bdVar;
        }
    }

    public be getIctShowWeexCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (be) ipChange.ipc$dispatch("691437ce", new Object[]{this}) : this.mIctShowWeexCallback;
    }

    public void addIctShowWeexCallback(be beVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85f9469", new Object[]{this, beVar});
        } else {
            this.mIctShowWeexCallback = beVar;
        }
    }

    public bd getIctAddWeexCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bd) ipChange.ipc$dispatch("961bc613", new Object[]{this}) : this.mIctAddWeexCallback;
    }

    public void addIctUpdateWeexCmpAnchorCallback(bg bgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7ce08", new Object[]{this, bgVar});
        } else {
            this.mIctUpdateWeexCmpAnchorCallback = bgVar;
        }
    }

    public bg getIctUpdateWeexCmpAnchorCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bg) ipChange.ipc$dispatch("ff62801", new Object[]{this}) : this.mIctUpdateWeexCmpAnchorCallback;
    }

    public Map<String, String> getUTParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d81bf417", new Object[]{this}) : this.mUtParams;
    }

    public Map<String, String> getPlayExpUTParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("66adc894", new Object[]{this}) : this.mPlayExpUtParams;
    }

    public void addControlParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e2fabc", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.mControlParams.putAll(map);
        }
    }

    public Map<String, String> getControlParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ef0f02c9", new Object[]{this}) : this.mControlParams;
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : this.mActivity;
    }

    public void setVideo(at atVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69342ed6", new Object[]{this, atVar});
        } else {
            this.mVideo = atVar;
        }
    }

    public at getVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (at) ipChange.ipc$dispatch("1c6cb6e0", new Object[]{this}) : this.mVideo;
    }

    public void setVideoScreenType(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9049c6d3", new Object[]{this, dWVideoScreenType});
        } else {
            this.mVideoScreenType = dWVideoScreenType;
        }
    }

    public DWVideoScreenType screenType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWVideoScreenType) ipChange.ipc$dispatch("f79d40b6", new Object[]{this}) : this.mVideoScreenType;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.taobao.avplayer.core.component.d dVar = this.mDWComponentWrapperManager;
        if (dVar != null) {
            dVar.a();
        }
        com.taobao.avplayer.playercontrol.c cVar = this.mDwKeyBackController;
        if (cVar != null) {
            cVar.b();
        }
        g gVar = this.mDWDataManager;
        if (gVar != null) {
            gVar.a();
        }
        if (this.mEventSubscriberMap != null) {
            clearEventSubscribers();
        }
        this.mDynamicPlayEx = null;
        this.mSwitchScene = null;
        this.mSwitchSceneTime = 0L;
        this.mIsFloat = false;
    }

    public com.taobao.avplayer.core.component.d getDWComponentManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.core.component.d) ipChange.ipc$dispatch("b3162e5d", new Object[]{this}) : this.mDWComponentWrapperManager;
    }

    public void setRID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("614ded9c", new Object[]{this, str});
        } else {
            this.mRID = str;
        }
    }

    public String getRID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3b3a582", new Object[]{this}) : this.mRID;
    }

    public void initInteractiveOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913e9107", new Object[]{this});
            return;
        }
        ap apVar = this.mConfigAdapter;
        if (apVar == null) {
            return;
        }
        this.mOrangeGoodsListShown = apVar.getConfig("hiv_android", "showGoodsList", "true");
        this.mOrangeReportShown = this.mConfigAdapter.getConfig("hiv_android", "reportBtnShown", "true");
    }

    public void initVideoOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3c4760", new Object[]{this});
            return;
        }
        ap apVar = this.mConfigAdapter;
        if (apVar == null) {
            return;
        }
        this.mFirstRenderOptimize = apVar.getConfig("", "firstRenderOptimize", "true");
    }

    public synchronized void registerSubscriber(kbi kbiVar, kbl kblVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f09780b", new Object[]{this, kbiVar, kblVar});
        } else {
            this.mEventSubscriberMap.put(Integer.valueOf(kbiVar.a()), kblVar);
        }
    }

    public synchronized void unregisterSubscriber(kbi kbiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98a65889", new Object[]{this, kbiVar});
        } else {
            this.mEventSubscriberMap.remove(Integer.valueOf(kbiVar.a()));
        }
    }

    public synchronized void post(kbi kbiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1106565", new Object[]{this, kbiVar});
        } else {
            post(kbiVar, null);
        }
    }

    public synchronized void post(kbi kbiVar, kbj kbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8f5402", new Object[]{this, kbiVar, kbjVar});
        } else if (!this.mEventSubscriberMap.containsKey(Integer.valueOf(kbiVar.a()))) {
        } else {
            this.mEventSubscriberMap.get(Integer.valueOf(kbiVar.a())).a(kbiVar, kbjVar);
        }
    }

    public void clearEventSubscribers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa250805", new Object[]{this});
        } else {
            this.mEventSubscriberMap.clear();
        }
    }

    public void setNeedSmallWindow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e791dee", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedSmallWindow = z;
        }
    }

    public boolean isNeedSmallWindow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24ff3e2", new Object[]{this})).booleanValue() : this.mNeedSmallWindow;
    }

    public void setWXCmpUtilsCallback(bh bhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94b8afd", new Object[]{this, bhVar});
        } else {
            this.mIctWXCmpUtilsCallback = bhVar;
        }
    }

    public void setWXCmpUtilsCallback2(bi biVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729e9d48", new Object[]{this, biVar});
        } else {
            this.mIctWXCmpUtilsCallback2 = biVar;
        }
    }

    public bh getWXCmpUtilsCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bh) ipChange.ipc$dispatch("1a1edb6b", new Object[]{this}) : this.mIctWXCmpUtilsCallback;
    }

    public bi getWXCmpUtilsCallback2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bi) ipChange.ipc$dispatch("91572e86", new Object[]{this}) : this.mIctWXCmpUtilsCallback2;
    }

    public void setVideoToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bedad1", new Object[]{this, str});
        } else {
            this.mVideoToken = str;
        }
    }

    public void addViewToRightInteractiveView(View view, boolean z, LinearLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b6808a", new Object[]{this, view, new Boolean(z), layoutParams});
        } else if (z) {
            this.mRightUpIcon = view;
            this.mRightUpLp = layoutParams;
        } else {
            this.mRightBottomIcon = view;
            this.mRightBottomLp = layoutParams;
        }
    }

    public Pair<View, LinearLayout.LayoutParams> getRightIconAndLp(boolean z) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("40de7a3e", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            View view = this.mRightUpIcon;
            if (view != null && (layoutParams2 = this.mRightUpLp) != null) {
                return new Pair<>(view, layoutParams2);
            }
            return null;
        }
        View view2 = this.mRightBottomIcon;
        if (view2 != null && (layoutParams = this.mRightBottomLp) != null) {
            return new Pair<>(view2, layoutParams);
        }
        return null;
    }

    public boolean isFirstRenderOptimize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a947e3e4", new Object[]{this})).booleanValue() : "true".equalsIgnoreCase(this.mFirstRenderOptimize);
    }

    public void setShowCustomIconOrNotList(ArrayList<Boolean> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f04f6dde", new Object[]{this, arrayList});
        } else if (arrayList != null) {
            ArrayList<Boolean> arrayList2 = this.mShowCustomIconOrNotList;
            if (arrayList2 == null) {
                this.mShowCustomIconOrNotList = new ArrayList<>();
            } else {
                arrayList2.clear();
            }
            Iterator<Boolean> it = arrayList.iterator();
            while (it.hasNext()) {
                this.mShowCustomIconOrNotList.add(Boolean.valueOf(it.next().booleanValue()));
            }
        } else {
            this.mShowCustomIconOrNotList = null;
        }
    }

    public ArrayList<Boolean> getShowCustomIconOrNotList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("892eefb2", new Object[]{this}) : this.mShowCustomIconOrNotList;
    }

    public void addIctTempCallback(bf bfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd84957e", new Object[]{this, bfVar});
        } else {
            this.mIctTmpCallback = bfVar;
        }
    }

    public bf getIctTmpCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bf) ipChange.ipc$dispatch("e47a35c", new Object[]{this}) : this.mIctTmpCallback;
    }

    public void setBackCoverWXUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b279bd51", new Object[]{this, str});
        } else {
            this.mBackCoverWXUrl = str;
        }
    }

    public void setTaowaIsShare(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b85342", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsShare = z;
        }
    }

    public String getBackCoverWXUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7091fcc5", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mBackCoverWXUrl)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mBackCoverWXUrl);
        sb.append("&isShare=");
        sb.append(this.mIsShare ? "1" : "0");
        return sb.toString();
    }

    public void showWXBackCoverOrNot(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db841aef", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowWXBackCoverOrNot = z;
        }
    }

    public boolean getShowWXBackCoverOrNot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aabe39ff", new Object[]{this})).booleanValue() : this.mShowWXBackCoverOrNot;
    }

    public void predisplayInteractiveRightBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf5d5a1", new Object[]{this});
        } else {
            this.mPredisPlayInteractiveRightBar = true;
        }
    }

    public boolean needPredisplayInteractiveRightBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73f8b7af", new Object[]{this})).booleanValue() : this.mPredisPlayInteractiveRightBar;
    }

    public String getSourcePageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9611fee", new Object[]{this}) : this.mSourcePageName;
    }

    public void setSourcePageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338eff48", new Object[]{this, str});
        } else {
            this.mSourcePageName = str;
        }
    }

    public void showWeexLayer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fac438", new Object[]{this, view});
            return;
        }
        com.taobao.avplayer.playercontrol.h hVar = this.mDWToastContainer;
        if (hVar == null) {
            return;
        }
        hVar.a(view);
    }

    public com.taobao.avplayer.core.component.d getDWComponentWrapperManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.core.component.d) ipChange.ipc$dispatch("3ed4c928", new Object[]{this}) : this.mDWComponentWrapperManager;
    }

    public void setPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            this.mPlayScenes = str;
        }
    }

    public void setPauseInBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7aa86", new Object[]{this, new Boolean(z)});
        } else {
            this.mPauseInBackground = z;
        }
    }

    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
        } else {
            this.mVolume = f;
        }
    }

    public float getVolume() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("91a40687", new Object[]{this})).floatValue() : this.mVolume;
    }

    public String getPanoTyeStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0173b00", new Object[]{this});
        }
        int i = this.mPanoType;
        return i == 1 ? "ERP" : i == 2 ? "EAC" : "";
    }
}
