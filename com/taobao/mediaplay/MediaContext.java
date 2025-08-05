package com.taobao.mediaplay;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.kge;
import tb.mjv;

/* loaded from: classes7.dex */
public class MediaContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BaseAnalysis mAnalysis;
    public AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener;
    private boolean mAudioOnly;
    private WeakReference<Context> mContextRef;
    private Map<String, String> mControlParams;
    private Map<String, String> mCustomParams;
    public boolean mDisableSurfaceView;
    public String mDynamicPlayEx;
    public boolean mHiddenGestureView;
    public boolean mHiddenLoading;
    public boolean mHiddenMiniProgressBar;
    public boolean mHiddenNetworkErrorView;
    public boolean mHiddenPlayErrorView;
    public boolean mHiddenPlayingIcon;
    public boolean mHiddenThumbnailPlayBtn;
    public boolean mHiddenToastView;
    private boolean mHideControllder;
    public boolean mHookKeyBackToggleEvent;
    public boolean mIsFloat;
    private com.taobao.mediaplay.playercontrol.c mKeyBackController;
    public String mLivePushControlInfo;
    public boolean mLoop;
    private a mMedia;
    public MediaPlayControlContext mMediaPlayContext;
    public MediaType mMediaType;
    private boolean mNeedGesture;
    private Map<String, String> mPlayExpUtParams;
    public String mPlayScenes;
    public String mPlayToken;
    private String mRID;
    public String mSwitchScene;
    public long mSwitchSceneTime;
    public String mUserId;
    public String mUsingInterface;
    private Map<String, String> mUtParams;
    public int mVRLat;
    public int mVRLng;
    public int mVRRenderType;
    private String mVideoToken;
    private Window mWindow;
    public boolean mbShowNoWifiToast;
    public boolean mVRLive = false;
    public int mSwitchStreamABId = 0;
    public boolean mSwitchStreamEnable = true;
    public int mEnablePlayInBackground = -1;
    public int mEnterVoiceRoom = -1;
    public int mConnectTimeout = 0;
    public int mReadTimeout = 0;
    public int mRetryTime = 0;
    public boolean mNeedScreenButton = true;
    private boolean mNeedCloseUT = true;
    private boolean mNeedFirstPlayUT = true;
    private MediaPlayScreenType mVideoScreenType = MediaPlayScreenType.NORMAL;
    private boolean mNeedCommitUserToFirstFrame = true;
    private boolean mNeedPlayControlView = true;
    private boolean mPrepareToFirstFrame = false;
    private boolean mWarmupFlag = false;
    private int mWarmupLevel = 1;
    public int mScenarioType = 0;
    public boolean mRequestLandscape = true;
    private MediaAspectRatio mAspectRatio = MediaAspectRatio.DW_FIT_CENTER;
    private int mStartPos = 0;
    public boolean mUseCache = false;
    private Surface mExternSurface = null;
    public boolean mEnableNewTBPlayer = false;

    static {
        kge.a(523629269);
        kge.a(1028243835);
    }

    public MediaType getMediaType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaType) ipChange.ipc$dispatch("8cfeb342", new Object[]{this}) : this.mMediaType;
    }

    public void setMediaType(MediaType mediaType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb6a3de", new Object[]{this, mediaType});
        } else {
            this.mMediaType = mediaType;
        }
    }

    public void genPlayToken(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8339e98", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.mPlayToken) && !z) {
                return;
            }
            this.mPlayToken = com.taobao.taobaoavsdk.util.b.c() + new Random().nextInt(100000);
        } catch (Throwable unused) {
            this.mPlayToken = System.currentTimeMillis() + "_";
        }
    }

    public a getVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("945d2b02", new Object[]{this}) : this.mMedia;
    }

    public void setVideo(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d82278", new Object[]{this, aVar});
        } else {
            this.mMedia = aVar;
        }
    }

    public Window getWindow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Window) ipChange.ipc$dispatch("7f59f544", new Object[]{this}) : this.mWindow;
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

    public MediaAspectRatio getVideoAspectRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaAspectRatio) ipChange.ipc$dispatch("13c7669d", new Object[]{this}) : this.mAspectRatio;
    }

    public void setMediaAspectRatio(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e63654", new Object[]{this, mediaAspectRatio});
        } else {
            this.mAspectRatio = mediaAspectRatio;
        }
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

    public MediaContext(Context context) {
        Context context2 = null;
        this.mContextRef = null;
        this.mContextRef = new WeakReference<>(context);
        WeakReference<Context> weakReference = this.mContextRef;
        context2 = weakReference != null ? weakReference.get() : context2;
        if (context instanceof Activity) {
            this.mKeyBackController = new com.taobao.mediaplay.playercontrol.c((Activity) context2);
        }
        this.mUtParams = new HashMap();
        this.mPlayExpUtParams = new HashMap();
        this.mCustomParams = new HashMap();
        this.mControlParams = new HashMap();
        this.mAnalysis = new com.taobao.taobaoavsdk.Tracer.d();
    }

    public void handleKeyBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53144225", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.c cVar = this.mKeyBackController;
        if (cVar == null) {
            return;
        }
        cVar.a();
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

    public void addPlayExpUtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3d2b71", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.mPlayExpUtParams.putAll(map);
        }
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

    public void addCustomParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18497403", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.mCustomParams.putAll(map);
        }
    }

    public Map<String, String> getCustomParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("62345009", new Object[]{this}) : this.mCustomParams;
    }

    public Map<String, String> getUTParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d81bf417", new Object[]{this}) : this.mUtParams;
    }

    public Map<String, String> getPlayExpUTParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("66adc894", new Object[]{this}) : this.mPlayExpUtParams;
    }

    public Map<String, String> getControlParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ef0f02c9", new Object[]{this}) : this.mControlParams;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setVideoScreenType(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595ab2a1", new Object[]{this, mediaPlayScreenType});
        } else {
            this.mVideoScreenType = mediaPlayScreenType;
        }
    }

    public MediaPlayScreenType screenType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaPlayScreenType) ipChange.ipc$dispatch("10ccfea4", new Object[]{this}) : this.mVideoScreenType;
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.mDisableSurfaceView = false;
        com.taobao.mediaplay.playercontrol.c cVar = this.mKeyBackController;
        if (cVar != null) {
            cVar.b();
        }
        MediaPlayControlContext mediaPlayControlContext = this.mMediaPlayContext;
        mediaPlayControlContext.mMediaSourceType = "";
        if (mediaPlayControlContext != null) {
            mediaPlayControlContext.mDropFrameForH265 = false;
            mediaPlayControlContext.mSVCEnable = false;
            mediaPlayControlContext.mLowQualityUrl = "";
            mediaPlayControlContext.mOnlyVideoEnable = false;
            mediaPlayControlContext.setAvdataBufferedMaxMBytes(0);
            MediaPlayControlContext mediaPlayControlContext2 = this.mMediaPlayContext;
            mediaPlayControlContext2.mHasLowSpeedPolicy = false;
            mediaPlayControlContext2.mNeedInitLowSpeedPolicyAB = true;
            mediaPlayControlContext2.mEnableLowSpeedPolicyAB = false;
            mediaPlayControlContext2.mInitDefinition = null;
            mediaPlayControlContext2.mSelectedUrlName = "";
            mediaPlayControlContext2.mEnableAdaptiveLiveSwitch = false;
            mediaPlayControlContext2.mExperienceIdSet.clear();
            this.mMediaPlayContext.mExperienceReleaseIdSet.clear();
            this.mMediaPlayContext.mExperienceBucketIdSet.clear();
            MediaPlayControlContext mediaPlayControlContext3 = this.mMediaPlayContext;
            mediaPlayControlContext3.mDegradeToFlvByArtoSoNoReady = false;
            mediaPlayControlContext3.mReleaseByCustom = true;
        }
        this.mSwitchStreamABId = 0;
        this.mSwitchStreamEnable = true;
        this.mUsingInterface = null;
        this.mPlayScenes = null;
        this.mAudioOnly = false;
        this.mCustomParams.clear();
        this.mPlayExpUtParams.clear();
        this.mControlParams.clear();
        this.mLivePushControlInfo = null;
        this.mDynamicPlayEx = null;
        this.mSwitchScene = null;
        this.mSwitchSceneTime = 0L;
        this.mIsFloat = false;
        this.mEnterVoiceRoom = -1;
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

    public void setVideoToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bedad1", new Object[]{this, str});
        } else {
            this.mVideoToken = str;
        }
    }

    public void unregisterKeyBackEventListener(mjv mjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d38662", new Object[]{this, mjvVar});
            return;
        }
        com.taobao.mediaplay.playercontrol.c cVar = this.mKeyBackController;
        if (cVar == null) {
            return;
        }
        cVar.b(mjvVar);
    }

    public void registerKeyBackEventListener(mjv mjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6bfc4c9", new Object[]{this, mjvVar});
            return;
        }
        com.taobao.mediaplay.playercontrol.c cVar = this.mKeyBackController;
        if (cVar == null) {
            return;
        }
        cVar.a(mjvVar);
    }

    public void setNeedPlayControlView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b4ae57", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedPlayControlView = z;
        }
    }

    public boolean isNeedPlayControlView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d0c5659", new Object[]{this})).booleanValue() : this.mNeedPlayControlView;
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

    public void setWarmupFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa34567f", new Object[]{this, new Boolean(z)});
        } else {
            this.mWarmupFlag = z;
        }
    }

    public boolean getWarmupFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64d52ed", new Object[]{this})).booleanValue() : this.mWarmupFlag;
    }

    public void setWarmupLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de70ada", new Object[]{this, new Integer(i)});
        } else {
            this.mWarmupLevel = i;
        }
    }

    public int getWarmupLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcb4f7c8", new Object[]{this})).intValue() : this.mWarmupLevel;
    }

    public void setStartPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f9eac8", new Object[]{this, new Integer(i)});
        } else {
            this.mStartPos = i;
        }
    }

    public int getStartPos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("417d0082", new Object[]{this})).intValue() : this.mStartPos;
    }

    public void setAudioOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29a34cd", new Object[]{this, new Boolean(z)});
        } else {
            this.mAudioOnly = z;
        }
    }

    public boolean getAudioOnly() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cecb7477", new Object[]{this})).booleanValue() : this.mAudioOnly;
    }

    public Surface getExternSurface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Surface) ipChange.ipc$dispatch("11eb1424", new Object[]{this}) : this.mExternSurface;
    }

    public void setExternSurface(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7980fefe", new Object[]{this, surface});
        } else {
            this.mExternSurface = surface;
        }
    }
}
