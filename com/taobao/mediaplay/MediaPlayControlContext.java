package com.taobao.mediaplay;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.model.TBLiveMSGInfo;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.ddg;
import tb.kge;
import tb.mjz;
import tb.oyu;
import tb.ozr;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes7.dex */
public class MediaPlayControlContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] PRIORITY_OF_NEW_DEFINITION;
    public static final String[] PRIORITY_OF_NEW_DEFINITION_REVERT;
    public static final int SELECT_DEFINITION_REASON_DEFAULT = 0;
    public static final int SELECT_DEFINITION_REASON_INIT_NEW_DEFINITION = 16;
    public static final int SELECT_DEFINITION_REASON_LOW_DEVICE = 1;
    public static final int SELECT_DEFINITION_REASON_LOW_NET = 2;
    public static final int SELECT_DEFINITION_REASON_NETWORK_TYPE = 128;
    public static final int SELECT_DEFINITION_REASON_NEW_DECISION = 32;
    public static final int SELECT_DEFINITION_REASON_NEW_DEFINITION = 8;
    public static final int SELECT_DEFINITION_REASON_ONE_DEFINITION = 64;
    public static final int SELECT_DEFINITION_REASON_RECOM = 4;
    public static final int SELECT_DEFINITION_REASON_RTC_WEAK_NET_FLAG = 1024;
    public static final int SELECT_DEFINITION_REASON_SUPPORT_60FPS_DEVICE_LEVEL = 256;
    public static final int SELECT_DEFINITION_REASON_SUPPORT_60FPS_DEVICE_MODEL = 512;
    public boolean isRtcVVC;
    public String mAccountId;
    private float mAudioGainCoef;
    public boolean mAutoDegradedWhenError;
    private int mAvdataBufferedMaxMBytes;
    private int mAvdataBufferedMaxTime;
    private String mBackupCacheKey;
    private String mBackupVideoDefinition;
    private int mBackupVideoLength;
    private String mBackupVideoUrl;
    public String mBusinessId;
    private String mCacheKey;
    public String mConfigGroup;
    public Context mContext;
    private int mCurrentBitRate;
    private int mCurrentLevel;
    public boolean mDegradeToFlvByArtoSoNoReady;
    private String mDevicePerformanceLevel;
    private boolean mDisableS266CountLimit;
    public boolean mDropFrameForH265;
    public boolean mEnableAdaptiveLiveSwitch;
    public boolean mEnableLiveRateAdapteUrlByNewPolicy;
    private boolean mEnableS266;
    private String mEnableS266Devices;
    private boolean mEnableS266InstanceErrorCondition;
    private String mEnableS266SBTForLive;
    private String mEnableS266SBTForVideo;
    public String mFrom;
    private double mGlobalCurrentBandWidth;
    private double mGlobalPredictBandWidth;
    private boolean mHandlingVVCError;
    public boolean mHasChooseS266;
    private boolean mHasInitS266Param;
    public boolean mHasVVCErrorEver;
    public String mHighCachePath;
    public String mHighVideoDefinition;
    public String mInitDefinition;
    public boolean mIsForPreDownload;
    private boolean mIsLiveRoom;
    public int mLastPlayError;
    public TBLiveMSGInfo mLiveMSGInfo;
    public HashMap<String, a> mLiveRateAdapteUrlNewPolicyMap;
    public boolean mLocalVideo;
    public boolean mLowDeviceSVC;
    private boolean mLowPerformance;
    public String mLowQualityUrl;
    public String mLowSpeedArtpCommonParamsJson;
    public String mLowSpeedPolicyABConfigValue;
    public boolean mLowSpeedPolicyOperator;
    private int mMaxLevel;
    public JSONObject mMediaInfoParams;
    public MediaLiveInfo mMediaLiveInfo;
    public String mMediaSourceType;
    private int mNetSpeed;
    private int mNetWorkQuality;
    public boolean mOnlyVideoEnable;
    private int mPlayableBytes;
    public PlayerQualityItem mPlayerQualityItem;
    public QualityLiveItem mQualityLiveItem;
    private String mRateAdaptePriority;
    public int mRuntimeLevel;
    public boolean mSVCEnable;
    public String mSeamlessSwitchingSelectName;
    public String mSeamlessSwitchingVideoPath;
    public int mSeekWhenPrepared;
    public String mSelectDefinition;
    public int mSelectFlvUrlReason;
    public String mSelectedUrlName;
    public PlayerQualityItem mSwitchingPlayerQualityItem;
    public boolean mTBLive;
    public mjz mTBVideoSourceAdapter;
    public ddg mTLogAdapter;
    private boolean mUseTBNet;
    private String mVideoDefinition;
    private boolean mVideoDeviceMeaseureEnable;
    public String mVideoId;
    private int mVideoLength;
    public String mVideoSource;
    private String mVideoToken;
    private String mVideoUrl;
    public boolean mH265Enable = true;
    private boolean mTransH265 = true;
    private boolean mRateAdapte = false;
    private boolean mTopAnchor = false;
    private boolean mHardwareHevc = true;
    private boolean mForceMuteMode = false;
    private boolean mH265 = false;
    public boolean mUseMiniBfrtc = false;
    public boolean mSwitchingLower = false;
    private int mPlayerType = 1;
    public HashSet<Long> mExperienceIdSet = new HashSet<>();
    public HashSet<Long> mExperienceReleaseIdSet = new HashSet<>();
    public HashSet<Long> mExperienceBucketIdSet = new HashSet<>();
    private boolean mHardwareAvc = true;
    public boolean mUseArtp = false;
    public boolean mUseBfrtc = false;
    public boolean mUseRtcLive = false;
    public boolean mUseTransCodeRtcLive = true;
    public int mDegradeCode = 0;
    public String mOriginSelectedUrlName = "";
    public boolean mHighPerformancePlayer = false;
    public boolean mBackgroundMode = true;
    public boolean mSeekIgnorePauseStateWhenPrepared = false;
    public boolean mEnableAutoPauseInBackground = true;
    public int mSelectDefinitionReason = 0;
    public int mSelectDefinitionSpeed = 0;
    public long mLiveDefinition1080AvgBitrate = -1;
    public long mLiveDefinition1080MaxBitrate = -1;
    public long mLiveMaxBitrate = -1;
    public boolean mRequestShortAudioFocus = false;
    public boolean mNeedInitLowSpeedPolicyAB = true;
    public boolean mEnableLowSpeedPolicy = true;
    public boolean mHasLowSpeedPolicy = false;
    public boolean mUseLowSpeedPolicy = false;
    public boolean mLowSpeedPolicy = false;
    public boolean mEnableLowSpeedPolicyAB = false;
    public int mLowSpeedPolicyABId = 0;
    public boolean mEnableLiveRtcWeakNetFlag = false;
    public boolean mLiveRtcWeakNetFlag = false;
    public boolean mEnableLiveRtcWeakNetSVCDrop = false;
    public boolean mLiveRtcWeakNetSVCDrop = false;
    public boolean mEnableLiveRtcHomePageCardSVCDrop = false;
    public boolean mEnableCdnStartPlaySpeed = true;
    public int mDefinitionDeciseWindow = 180000;
    public boolean mSetPauseFrameLock = false;
    public String mLowSpeedNewPolicyConfigValue = "{\"ud\":{\"max_rtt\":\"40\",\"max_v_loss_rate\":\"0.2\",\"max_stall_time_msps\":\"50\",\"network_type_black_list\":[\"2G\",\"3G\",\"4G\",\"*\"]},\"hd\":{}}";
    public boolean mNeedInitVodSelectPolicyAB = true;
    public boolean mEnableVodABRbyOrange = true;
    public boolean mEnableUdFirstWhenNetSatisfied = true;
    public boolean mEnableCacheFirstByAB = true;
    public boolean mEnableQualityFirstByAB = false;
    public double mBetaForVodSelect = 0.5d;
    public String mBitRateMapStr = "";
    public int mSelectReasonForPreDownload = -1;
    public double mNetSpeedForPreDownload = -1.0d;
    public double mNetSpeedByRobustAtPreDL = -1.0d;
    public int mNetSpeedCalReasonForPreDL = -1;
    public boolean mUseRecDataTime = false;
    public int mDefDegradeReason = -1;
    public int mUD265BitRate = -1;
    public int mHD265BitRate = -1;
    public int mHD264BitRate = -1;
    public int mUD266BitRate = -1;
    public int mHD266BitRate = -1;
    public VVC_CHOOSE_REASON mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_INIT;
    public boolean mCheckInvalidCalBitRateByAB = true;
    public boolean mForceUseSurfaceView = false;
    private boolean mLowDeviceFirstRender = true;
    public boolean mEmbed = false;
    private boolean mMute = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
    private boolean mRtcLiveAutoSwitch = false;
    public H265AuthenStrategy mH265AuthenStrategy = H265AuthenStrategy.BLACKLIST;
    public H264AuthenStrategy mH264AuthenStrategy = H264AuthenStrategy.BLACKLIST;
    private boolean mSupportAudioGain = false;
    public Map<String, String> mHttpHeader = null;
    private boolean mAudioOff = false;
    public boolean mReleaseByCustom = false;

    /* loaded from: classes7.dex */
    public enum VVC_CHOOSE_REASON {
        VVC_CHOOSE_REASON_INIT(0),
        VVC_CHOOSE_REASON_INSTANCE_ERROR(1),
        VVC_CHOOSE_REASON_HANDLING_ERROR(2),
        VVC_CHOOSE_REASON_SO_NOT_READY(3),
        VVC_CHOOSE_REASON_PLAYING(4),
        VVC_CHOOSE_REASON_PRELOADING(5),
        VVC_CHOOSE_REASON_NOT_WHITE_DEVICE(6),
        VVC_CHOOSE_REASON_NOT_LIVE_SBT(7),
        VVC_CHOOSE_REASON_NOT_VOD_SBT(8);
        
        private int value;

        VVC_CHOOSE_REASON(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f18012a = -1;
        public float b = -1.0f;
        public int c = -1;
        public int d = 2;
        public float e = 1.5f;
        public List<String> f = new LinkedList();

        static {
            kge.a(105035214);
        }

        public a() {
        }
    }

    static {
        kge.a(-774934272);
        kge.a(1028243835);
        PRIORITY_OF_NEW_DEFINITION = new String[]{MediaConstant.DEFINITION_UD_60, "ud", MediaConstant.DEFINITION_HD_60, "hd", MediaConstant.DEFINITION_MD, "sd", "ld", MediaConstant.DEFINITION_LLD};
        PRIORITY_OF_NEW_DEFINITION_REVERT = new String[]{MediaConstant.DEFINITION_LLD, "ld", "sd", MediaConstant.DEFINITION_MD, "hd", MediaConstant.DEFINITION_HD_60, "ud", MediaConstant.DEFINITION_UD_60};
    }

    public void setH265AuthenStrategy(H265AuthenStrategy h265AuthenStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c909054", new Object[]{this, h265AuthenStrategy});
        } else {
            this.mH265AuthenStrategy = h265AuthenStrategy;
        }
    }

    public void setH264AuthenStrategy(H264AuthenStrategy h264AuthenStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fae2d6", new Object[]{this, h264AuthenStrategy});
        } else {
            this.mH264AuthenStrategy = h264AuthenStrategy;
        }
    }

    public void setMediaInfoParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f34241", new Object[]{this, jSONObject});
        } else {
            this.mMediaInfoParams = jSONObject;
        }
    }

    public JSONObject getMediaInfoParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("41ec4697", new Object[]{this});
        }
        if (!com.taobao.mediaplay.model.c.a(this.mMediaInfoParams)) {
            return null;
        }
        return this.mMediaInfoParams;
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

    public void setLiveDefinitionAutoSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d128a9", new Object[]{this, new Boolean(z)});
        } else {
            this.mRtcLiveAutoSwitch = z;
        }
    }

    public boolean isLiveDefinitionAutoSwitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edfd057", new Object[]{this})).booleanValue() : this.mRtcLiveAutoSwitch;
    }

    public void setHighCachePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166f1854", new Object[]{this, str});
        } else {
            this.mHighCachePath = str;
        }
    }

    public String getHighCachePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38d522ca", new Object[]{this}) : this.mHighCachePath;
    }

    public MediaPlayControlContext(Context context) {
        this.mContext = context;
        setHardwareAvc(canUseHardwardDecodeOf264());
        setHardwareHevc(canUseHardwardDecodeOf265());
        initS266ParamIfNeeded();
    }

    public static boolean canUseHardwardDecodeOf264() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42249478", new Object[0])).booleanValue() : checkDefaultValueAndList(MediaConstant.ORANGE_HARDWARD_H264_DEFAULT, MediaConstant.ORANGE_HARDWARD_H264_BLACK_LIST, com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H26X_DEFAULT_HARDWARE, "true")));
    }

    public static boolean canUseHardwardDecodeOf265() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4232abf9", new Object[0])).booleanValue() : checkDefaultValueAndList(MediaConstant.ORANGE_HARDWARD_H265_DEFAULT, MediaConstant.ORANGE_HARDWARD_H265_BLACK_LIST, com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H26X_DEFAULT_HARDWARE, "true")));
    }

    private static boolean checkDefaultValueAndList(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7cec1a0", new Object[]{str, str2, new Boolean(z)})).booleanValue() : (MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", str, "true"))) ? (TextUtils.isEmpty(oyu.d()) || !com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_HARDWARD_IN_HARMONY, "false"))) && !com.taobao.taobaoavsdk.util.b.b(Build.MODEL, MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", str2, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)) : z;
    }

    public boolean isUseTBNet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9ff21fd", new Object[]{this})).booleanValue() : this.mUseTBNet;
    }

    public void setUseTBNet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34dc9bc3", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseTBNet = z;
        }
    }

    public String getVideoSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("534d0fb9", new Object[]{this}) : this.mVideoSource;
    }

    public int getPlayerType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec3a41ab", new Object[]{this})).intValue() : this.mPlayerType;
    }

    public void setPlayerType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e501bf", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayerType = i;
        }
    }

    public String getVideoDefinition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5fe3c001", new Object[]{this}) : this.mVideoDefinition;
    }

    public void setVideoDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bc14fd", new Object[]{this, str});
        } else {
            this.mVideoDefinition = str;
        }
    }

    public void setCacheKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c476ef50", new Object[]{this, str});
        } else {
            this.mCacheKey = str;
        }
    }

    public String getCacheKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this}) : this.mCacheKey;
    }

    public void setBackupCacheKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e2a832", new Object[]{this, str});
        } else {
            this.mBackupCacheKey = str;
        }
    }

    public String getBackupCacheKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3adfb1c4", new Object[]{this}) : this.mBackupCacheKey;
    }

    public boolean isHardwareHevc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("443eaf47", new Object[]{this})).booleanValue() : this.mHardwareHevc;
    }

    public void setHardwareHevc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3393b9", new Object[]{this, new Boolean(z)});
        } else {
            this.mHardwareHevc = z;
        }
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this}) : this.mVideoUrl;
    }

    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
        } else {
            this.mVideoUrl = str;
        }
    }

    public int getPlayableBytes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("164bd7c1", new Object[]{this})).intValue() : this.mPlayableBytes;
    }

    public void setPlayableBytes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5b1701", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayableBytes = i;
        }
    }

    public boolean isVideoDeviceMeaseureEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2e79a2", new Object[]{this})).booleanValue() : this.mVideoDeviceMeaseureEnable;
    }

    public void setVdeoDeviceMeaseureEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b171f2d", new Object[]{this, new Boolean(z)});
        } else {
            this.mVideoDeviceMeaseureEnable = z;
        }
    }

    public boolean isH265() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b84f885e", new Object[]{this})).booleanValue() : this.mH265;
    }

    public void setH265(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67262582", new Object[]{this, new Boolean(z)});
        } else {
            this.mH265 = z;
        }
    }

    public void setCurrentBitRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39418046", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentBitRate = i;
        }
    }

    public int getCurrentBitRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("626b3c44", new Object[]{this})).intValue() : this.mCurrentBitRate;
    }

    public void setMaxLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d7ad9a", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxLevel = i;
        }
    }

    public int getMaxLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9529b70", new Object[]{this})).intValue() : this.mMaxLevel;
    }

    public void setCurrentLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709ae06f", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentLevel = i;
        }
    }

    public int getCurrentLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88ef9ffb", new Object[]{this})).intValue() : this.mCurrentLevel;
    }

    public void setVideoLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb0a93d", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoLength = i;
        }
    }

    public int getVideoLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("72dc8105", new Object[]{this})).intValue() : this.mVideoLength;
    }

    public void setDevicePerformanceLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f4f43d", new Object[]{this, str});
        } else {
            this.mDevicePerformanceLevel = str;
        }
    }

    public String getDevicePerformanceLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("10e2ec59", new Object[]{this}) : this.mDevicePerformanceLevel;
    }

    public void setNetSpeed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e69bb0", new Object[]{this, new Integer(i)});
        } else {
            this.mNetSpeed = i;
        }
    }

    public void setNetWorkQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a03f69", new Object[]{this, new Integer(i)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setNetWorkQuality=" + i);
        this.mNetWorkQuality = i;
    }

    public void setGlobalCurrentBandWidth(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38cceda", new Object[]{this, new Double(d)});
        } else {
            this.mGlobalCurrentBandWidth = d;
        }
    }

    public void setGlobalPredictBandWidth(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402d5e3a", new Object[]{this, new Double(d)});
        } else {
            this.mGlobalPredictBandWidth = d;
        }
    }

    public int getNetSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3442929a", new Object[]{this})).intValue() : this.mNetSpeed;
    }

    public int getNetWorkQuality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb768cc1", new Object[]{this})).intValue() : this.mNetWorkQuality;
    }

    public double getGlobalCurrentBandWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("205e97c6", new Object[]{this})).doubleValue() : this.mGlobalCurrentBandWidth;
    }

    public double getGlobalPredictBandWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bfbe9c66", new Object[]{this})).doubleValue() : this.mGlobalPredictBandWidth;
    }

    public int getAvdataBufferedMaxMBytes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed48208", new Object[]{this})).intValue() : this.mAvdataBufferedMaxMBytes;
    }

    public boolean isHardwareAvc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("827c16c7", new Object[]{this})).booleanValue() : this.mHardwareAvc;
    }

    public void setHardwareAvc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef3b3a9", new Object[]{this, new Boolean(z)});
        } else {
            this.mHardwareAvc = z;
        }
    }

    public void setAvdataBufferedMaxMBytes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a5969a", new Object[]{this, new Integer(i)});
        } else {
            this.mAvdataBufferedMaxMBytes = i;
        }
    }

    public int getAvdataBufferedMaxTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2b0ad57", new Object[]{this})).intValue() : this.mAvdataBufferedMaxTime;
    }

    public void setAvdataBufferedMaxTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6324282b", new Object[]{this, new Integer(i)});
        } else {
            this.mAvdataBufferedMaxTime = i;
        }
    }

    public String getRateAdaptePriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8fa15bdc", new Object[]{this}) : this.mRateAdaptePriority;
    }

    public void setRateAdaptePriority(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85bdb1a", new Object[]{this, str});
        } else {
            this.mRateAdaptePriority = str;
        }
    }

    public void setBackupVideoDetail(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfce363", new Object[]{this, str, str2});
            return;
        }
        this.mBackupVideoUrl = str;
        this.mBackupVideoDefinition = str2;
    }

    public String getBackupVideoDefinition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b684063", new Object[]{this}) : this.mBackupVideoDefinition;
    }

    public void setBackupVideoLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa2b59f", new Object[]{this, new Integer(i)});
        } else {
            this.mBackupVideoLength = i;
        }
    }

    public int getBackupVideoLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34ea4763", new Object[]{this})).intValue() : this.mBackupVideoLength;
    }

    public String getVideoToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this}) : this.mVideoToken;
    }

    public void setVideoToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bedad1", new Object[]{this, str});
        } else {
            this.mVideoToken = str;
        }
    }

    public String getBackupVideoUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7c7dead", new Object[]{this}) : this.mBackupVideoUrl;
    }

    public void setUseArtp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5989b", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseArtp = z;
        }
    }

    public void setUseBfrtc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7977a955", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseBfrtc = z;
        }
    }

    public void setUseMiniBfrtc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec720e8c", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseMiniBfrtc = z;
        }
    }

    public boolean useMiniBfrtc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ac350ca", new Object[]{this})).booleanValue() : this.mUseMiniBfrtc;
    }

    public void setUseRtcLive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d482b6c5", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseRtcLive = z;
        }
    }

    public void setUseTransCodeRtcLive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bd20f0", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseTransCodeRtcLive = z;
        }
    }

    public void setDegradeCode(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318e63c5", new Object[]{this, new Integer(i), str});
            return;
        }
        this.mDegradeCode = i;
        this.mOriginSelectedUrlName = str;
    }

    public int getDegradeCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a4ceafc7", new Object[]{this})).intValue() : this.mDegradeCode;
    }

    public void setTransH265(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cfd2fe", new Object[]{this, new Boolean(z)});
        } else {
            this.mTransH265 = z;
        }
    }

    public boolean useArtp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3680b1f", new Object[]{this})).booleanValue() : this.mUseArtp;
    }

    public boolean useBfrtc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf4427e1", new Object[]{this})).booleanValue() : this.mUseBfrtc;
    }

    public boolean useTransCodeRtcLive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("17ff112a", new Object[]{this})).booleanValue() : this.mUseTransCodeRtcLive;
    }

    public boolean useRtcLive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("799704f1", new Object[]{this})).booleanValue() : this.mUseRtcLive;
    }

    public void setBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
            return;
        }
        this.mBusinessId = str;
        this.mTBLive = MediaConstant.LBLIVE_SOURCE.equals(this.mBusinessId);
    }

    public boolean useTransH265() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a3bed95", new Object[]{this})).booleanValue() : this.mTransH265;
    }

    public void setTopAnchor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1eca05", new Object[]{this, new Boolean(z)});
        } else {
            this.mTopAnchor = z;
        }
    }

    public boolean getTopAnchor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7443583f", new Object[]{this})).booleanValue() : this.mTopAnchor;
    }

    public boolean getLowDeviceFirstRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a320db3d", new Object[]{this})).booleanValue() : this.mLowDeviceFirstRender;
    }

    public void setLowDeviceFirstRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7972f", new Object[]{this, new Boolean(z)});
        } else {
            this.mLowDeviceFirstRender = z;
        }
    }

    public void setRateAdapte(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e7a5c8", new Object[]{this, new Boolean(z)});
        } else {
            this.mRateAdapte = z;
        }
    }

    public boolean getRateAdapte() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5bbe7684", new Object[]{this})).booleanValue() : this.mRateAdapte;
    }

    public boolean getForceMuteMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27611fbc", new Object[]{this})).booleanValue() : this.mForceMuteMode;
    }

    public void setForceMuteMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bef0c28", new Object[]{this, new Boolean(z)});
        } else {
            this.mForceMuteMode = z;
        }
    }

    public void setLowPerformance(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7ca8af", new Object[]{this, new Boolean(z)});
        } else {
            this.mLowPerformance = z;
        }
    }

    public boolean isLowPerformance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bb71191", new Object[]{this})).booleanValue() : this.mLowPerformance;
    }

    public String getLowSpeedArtpCommonParamsJson() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8721618a", new Object[]{this}) : this.mLowSpeedArtpCommonParamsJson;
    }

    public float getAudioGainCoef() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69fb8ae3", new Object[]{this})).floatValue() : this.mAudioGainCoef;
    }

    public void setAudioGainCoef(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca1bd39", new Object[]{this, new Float(f)});
        } else {
            this.mAudioGainCoef = f;
        }
    }

    public void setAudioGainEnble(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc860ee", new Object[]{this, new Boolean(z)});
        } else {
            this.mSupportAudioGain = z;
        }
    }

    public boolean getAudioGainEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("279f1bad", new Object[]{this})).booleanValue() : this.mSupportAudioGain;
    }

    public void setRequestHeader(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39f9d24", new Object[]{this, map});
        } else {
            this.mHttpHeader = map;
        }
    }

    public void setAudioOffFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d41546", new Object[]{this, new Boolean(z)});
        } else {
            this.mAudioOff = z;
        }
    }

    public boolean getAudioOffFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("54e0f246", new Object[]{this})).booleanValue() : this.mAudioOff;
    }

    public List<PlayerQualityItem> getDefinitionList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1c16f81", new Object[]{this, new Boolean(z)});
        }
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.mMediaLiveInfo.liveUrlList.size(); i++) {
            QualityLiveItem qualityLiveItem = this.mMediaLiveInfo.liveUrlList.get(i);
            if (!TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl) || !TextUtils.isEmpty(qualityLiveItem.bfrtcUrl)) {
                String str = qualityLiveItem.newDefinition;
                if (!TextUtils.isEmpty(str)) {
                    if (str != null && MediaConstant.DEFINITION_UD_60.equals(str)) {
                        String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_60FPS_DEVICE_LEVEL, "[0]");
                        boolean z2 = !TextUtils.isEmpty(config) && config.contains(String.valueOf(oyu.c()));
                        String config2 = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_60FPS_DEVICE_LIST, "");
                        com.taobao.taobaoavsdk.util.d dVar = new com.taobao.taobaoavsdk.util.d();
                        dVar.a("model", "" + Build.MODEL);
                        dVar.a(config2);
                        if (!TextUtils.isEmpty(config2) && dVar.b()) {
                            z2 = true;
                        }
                        if (!z2) {
                        }
                    }
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, Integer.valueOf(i));
                    } else {
                        PlayerQualityItem playerQualityItem = this.mPlayerQualityItem;
                        if (playerQualityItem != null && playerQualityItem.index == i) {
                            hashMap.put(str, Integer.valueOf(i));
                        }
                    }
                } else if (!z) {
                    PlayerQualityItem create = PlayerQualityItem.create(qualityLiveItem.name, qualityLiveItem.newName, qualityLiveItem.definition, qualityLiveItem.newDefinition, i);
                    create.current = create.equals(this.mPlayerQualityItem);
                    linkedList.add(create);
                }
            }
        }
        String[] strArr = PRIORITY_OF_NEW_DEFINITION;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (hashMap.containsKey(strArr[i2])) {
                int intValue = ((Integer) hashMap.get(strArr[i2])).intValue();
                QualityLiveItem qualityLiveItem2 = this.mMediaLiveInfo.liveUrlList.get(intValue);
                PlayerQualityItem create2 = PlayerQualityItem.create(qualityLiveItem2.name, qualityLiveItem2.newName, qualityLiveItem2.definition, qualityLiveItem2.newDefinition, intValue);
                create2.current = this.mPlayerQualityItem.index == intValue;
                linkedList.add(create2);
            }
        }
        return linkedList;
    }

    public void pauseFrameLock(QualityLiveItem qualityLiveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c0276a", new Object[]{this, qualityLiveItem});
        } else if (qualityLiveItem == null || !isLiveRoom()) {
        } else {
            oyu.h(this.mContext);
            if (!oyu.bD) {
                return;
            }
            if (MediaConstant.DEFINITION_UD_60.equals(qualityLiveItem.newDefinition) || MediaConstant.DEFINITION_HD_60.equals(qualityLiveItem.newDefinition)) {
                if (this.mSetPauseFrameLock) {
                    return;
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " CurrentPlayerQualityItem: " + qualityLiveItem.name + ",pauseFrameLock, definition=" + qualityLiveItem.newDefinition + "， mSetPauseFrameLock=" + this.mSetPauseFrameLock);
                ADaemon.pauseFrameLock(3);
                this.mSetPauseFrameLock = true;
                return;
            }
            resumeFrameLock();
        }
    }

    public void resumeFrameLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc5e592", new Object[]{this});
            return;
        }
        boolean z = oyu.bD;
        if (!this.mSetPauseFrameLock || !z) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " CurrentPlayerQualityItem: " + this.mPlayerQualityItem.name + ",resumeFrameLock , definition=" + this.mPlayerQualityItem.newDefinition + "， mSetPauseFrameLock=" + this.mSetPauseFrameLock);
        ADaemon.resumeFrameLock(3);
        this.mSetPauseFrameLock = false;
    }

    public void setCurrentPlayerQualityItem(QualityLiveItem qualityLiveItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdde5a1", new Object[]{this, qualityLiveItem, new Integer(i)});
            return;
        }
        this.mPlayerQualityItem = PlayerQualityItem.create(qualityLiveItem.name, qualityLiveItem.newName, qualityLiveItem.definition, qualityLiveItem.newDefinition, i);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setCurrentPlayerQualityItem name=" + qualityLiveItem.name + ",  newName=" + qualityLiveItem.newName + " ,definition=" + qualityLiveItem.definition + " ,newDefinition=" + qualityLiveItem.newDefinition);
        this.mPlayerQualityItem.current = true;
        this.mSelectDefinition = qualityLiveItem.newDefinition;
        pauseFrameLock(qualityLiveItem);
    }

    public void initLowSpeedPolicyABIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533a1a4f", new Object[]{this});
            return;
        }
        oyu.S();
        this.mEnableLowSpeedPolicy = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_LOW_SPEED_POLICY, "true"));
        this.mEnableLowSpeedPolicyAB = oyu.bh;
        this.mLowSpeedPolicyABId = oyu.bi;
        this.mLowSpeedPolicyABConfigValue = oyu.bj;
        this.mLowSpeedPolicyOperator = oyu.bk;
        this.mEnableLiveRateAdapteUrlByNewPolicy = oyu.bm;
        this.mEnableLiveRtcWeakNetFlag = oyu.bn;
        this.mEnableLiveRtcWeakNetSVCDrop = oyu.bq;
        this.mLowSpeedNewPolicyConfigValue = oyu.bu;
        this.mDefinitionDeciseWindow = oyu.bt;
        this.mEnableCdnStartPlaySpeed = oyu.bs;
        this.mLowSpeedArtpCommonParamsJson = oyu.bl;
        this.mEnableLiveRtcHomePageCardSVCDrop = oyu.br;
        addExperienceInfo(oyu.b("lowspeed"), oyu.d("lowspeed"), oyu.c("lowspeed"));
        this.mLiveRateAdapteUrlNewPolicyMap = new HashMap<>();
        if (TextUtils.isEmpty(this.mLowSpeedNewPolicyConfigValue)) {
            return;
        }
        try {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(this.mLowSpeedNewPolicyConfigValue);
            if (parseObject == null) {
                return;
            }
            String[] strArr = PRIORITY_OF_NEW_DEFINITION;
            for (int i = 0; i < strArr.length; i++) {
                com.alibaba.fastjson.JSONObject jSONObject = parseObject.getJSONObject(strArr[i]);
                if (jSONObject != null) {
                    a aVar = new a();
                    Integer integer = jSONObject.getInteger("max_rtt");
                    int i2 = -1;
                    aVar.f18012a = integer == null ? -1 : integer.intValue();
                    Float f = jSONObject.getFloat("max_v_loss_rate");
                    aVar.b = f == null ? -1.0f : f.floatValue();
                    Integer integer2 = jSONObject.getInteger("max_stall_time_msps");
                    if (integer2 != null) {
                        i2 = integer2.intValue();
                    }
                    aVar.c = i2;
                    Integer integer3 = jSONObject.getInteger("version");
                    aVar.d = integer3 == null ? 2 : integer3.intValue();
                    JSONArray jSONArray = jSONObject.getJSONArray("network_type_black_list");
                    if (jSONArray != null && jSONArray.size() > 0) {
                        for (int i3 = 0; i3 < jSONArray.size(); i3++) {
                            aVar.f.add(jSONArray.getString(i3));
                        }
                    }
                    this.mLiveRateAdapteUrlNewPolicyMap.put(strArr[i], aVar);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private boolean isLowNetSpeedByVpm(String str) {
        try {
            Class<?> cls = Class.forName("com.taobao.vpm.VPMManagerInstance");
            return ((Boolean) cls.getMethod("filterHAMetricsWithCriteria", String.class, Boolean.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str, Boolean.valueOf(this.mLowSpeedPolicyOperator))).booleanValue();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaPlayControlManager: class not found error:" + e.toString());
            return false;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaPlayControlManager: vpmha ill:" + e2.toString());
            return false;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaPlayControlManager: vpmha no such method:" + e3.toString());
            return false;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaPlayControlManager: vpmha invocation excaption:" + e4.toString());
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaPlayControlManager: vpmha exception:" + e5.toString());
            return false;
        }
    }

    public boolean isLowNetSpeedByVpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15e17d73", new Object[]{this})).booleanValue();
        }
        if (this.mHasLowSpeedPolicy) {
            return this.mLowSpeedPolicy;
        }
        initLowSpeedPolicyABIfNeeded();
        if (!this.mEnableLowSpeedPolicy || !this.mEnableLowSpeedPolicyAB || TextUtils.isEmpty(this.mLowSpeedPolicyABConfigValue)) {
            return false;
        }
        this.mHasLowSpeedPolicy = true;
        this.mLowSpeedPolicy = isLowNetSpeedByVpm(this.mLowSpeedPolicyABConfigValue);
        return this.mLowSpeedPolicy;
    }

    private int getCurrentNewDefinitionIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6219a79c", new Object[]{this})).intValue();
        }
        if (this.mPlayerQualityItem == null) {
            return -1;
        }
        String[] strArr = PRIORITY_OF_NEW_DEFINITION;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(this.mPlayerQualityItem.newDefinition)) {
                return i;
            }
        }
        return -1;
    }

    public QualityLiveItem getQualityLiveItemByNewDefinitionIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QualityLiveItem) ipChange.ipc$dispatch("2c7908d9", new Object[]{this, new Integer(i)});
        }
        int currentNewDefinitionIndex = getCurrentNewDefinitionIndex();
        if (currentNewDefinitionIndex == -1) {
            return null;
        }
        String[] strArr = PRIORITY_OF_NEW_DEFINITION;
        int i2 = currentNewDefinitionIndex - i;
        if (i2 >= 0 && i2 < strArr.length) {
            for (int i3 = 0; i3 < this.mMediaLiveInfo.liveUrlList.size(); i3++) {
                QualityLiveItem qualityLiveItem = this.mMediaLiveInfo.liveUrlList.get(i3);
                if (strArr[i2].equals(qualityLiveItem.newDefinition) && !TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl) && !TextUtils.isEmpty(qualityLiveItem.newName)) {
                    return qualityLiveItem;
                }
            }
        }
        return null;
    }

    public Pair<String, String> getNewDefintionByIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9f8f4d5f", new Object[]{this, new Integer(i)});
        }
        QualityLiveItem qualityLiveItemByNewDefinitionIndex = getQualityLiveItemByNewDefinitionIndex(i);
        if (qualityLiveItemByNewDefinitionIndex == null) {
            return null;
        }
        return new Pair<>(qualityLiveItemByNewDefinitionIndex.newDefinition, qualityLiveItemByNewDefinitionIndex.newName);
    }

    public boolean isLiveRoom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35ab7b3c", new Object[]{this})).booleanValue() : this.mIsLiveRoom;
    }

    public void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setFrom=" + str + " by client.");
        this.mFrom = str;
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_LIVE_ROOM_BIZ_CODE, "LiveRoom");
        if (!TextUtils.isEmpty(config) && config.equals(this.mFrom)) {
            this.mIsLiveRoom = true;
        } else {
            this.mIsLiveRoom = false;
        }
    }

    public String getFrom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this}) : this.mFrom;
    }

    private Pair<Integer, Integer> getNewDefintionByAvgNetSpeed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1b9aa115", new Object[]{this, new Integer(i)});
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < this.mMediaLiveInfo.liveUrlList.size(); i2++) {
            QualityLiveItem qualityLiveItem = this.mMediaLiveInfo.liveUrlList.get(i2);
            if (!TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl) || !TextUtils.isEmpty(qualityLiveItem.bfrtcUrl)) {
                String str = qualityLiveItem.newDefinition;
                String str2 = qualityLiveItem.newName;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    hashMap.put(str, Integer.valueOf(i2));
                }
            }
        }
        String[] strArr = PRIORITY_OF_NEW_DEFINITION;
        Pair<Integer, Integer> pair = null;
        for (int length = strArr.length - 1; length >= 0; length--) {
            if (hashMap.containsKey(strArr[length])) {
                int intValue = ((Integer) hashMap.get(strArr[length])).intValue();
                QualityLiveItem qualityLiveItem2 = this.mMediaLiveInfo.liveUrlList.get(intValue);
                if (pair == null) {
                    pair = new Pair<>(Integer.valueOf(length), Integer.valueOf(intValue));
                }
                long streamAvgBitrate = qualityLiveItem2.getStreamAvgBitrate();
                if (streamAvgBitrate > 0 && i > streamAvgBitrate) {
                    return new Pair<>(Integer.valueOf(length), Integer.valueOf(intValue));
                }
            }
        }
        return pair;
    }

    public Pair<String, String> getNewDefintionByNetSpeed(int i, int i2, int i3) {
        PlayerQualityItem playerQualityItem;
        int currentNewDefinitionIndex;
        int i4;
        Pair<Integer, Integer> newDefintionByAvgNetSpeed;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("460d3db1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        MediaLiveInfo mediaLiveInfo = this.mMediaLiveInfo;
        if (mediaLiveInfo == null || mediaLiveInfo.liveUrlList == null || (playerQualityItem = this.mPlayerQualityItem) == null || playerQualityItem.index >= this.mMediaLiveInfo.liveUrlList.size() || this.mPlayerQualityItem.index < 0 || (currentNewDefinitionIndex = getCurrentNewDefinitionIndex()) == -1) {
            return null;
        }
        QualityLiveItem qualityLiveItem = this.mMediaLiveInfo.liveUrlList.get(this.mPlayerQualityItem.index);
        if (i == 1) {
            long j = -1;
            QualityLiveItem qualityLiveItemByNewDefinitionIndex = getQualityLiveItemByNewDefinitionIndex(i);
            if (qualityLiveItemByNewDefinitionIndex != null) {
                j = qualityLiveItemByNewDefinitionIndex.getStreamMaxBitrate();
            }
            if (i3 > j && j > 0) {
                return getNewDefintionByIndex(i);
            }
            return null;
        } else if (i != -1) {
            return null;
        } else {
            long streamMinBitrate = qualityLiveItem.getStreamMinBitrate();
            int i5 = (i2 > streamMinBitrate ? 1 : (i2 == streamMinBitrate ? 0 : -1));
            if (i5 >= 0 || streamMinBitrate <= 0) {
                return getNewDefintionByIndex(i);
            }
            if (i5 >= 0 || i4 <= 0 || (newDefintionByAvgNetSpeed = getNewDefintionByAvgNetSpeed(i2)) == null || ((Integer) newDefintionByAvgNetSpeed.first).intValue() < 0 || currentNewDefinitionIndex >= ((Integer) newDefintionByAvgNetSpeed.first).intValue() || ((Integer) newDefintionByAvgNetSpeed.first).intValue() >= PRIORITY_OF_NEW_DEFINITION.length || ((Integer) newDefintionByAvgNetSpeed.second).intValue() > this.mMediaLiveInfo.liveUrlList.size()) {
                return null;
            }
            QualityLiveItem qualityLiveItem2 = this.mMediaLiveInfo.liveUrlList.get(((Integer) newDefintionByAvgNetSpeed.second).intValue());
            return new Pair<>(qualityLiveItem2.newDefinition, qualityLiveItem2.newName);
        }
    }

    public String getRtcSwitchLiveInfo(MediaLiveInfo mediaLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ce166df", new Object[]{this, mediaLiveInfo});
        }
        if (mediaLiveInfo == null || mediaLiveInfo.liveUrlList.size() == 0 || this.mPlayerQualityItem == null) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i = 0; i < mediaLiveInfo.liveUrlList.size(); i++) {
            QualityLiveItem qualityLiveItem = mediaLiveInfo.liveUrlList.get(i);
            if (!TextUtils.isEmpty(qualityLiveItem.newDefinition) && !TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("streamBitate", qualityLiveItem.getStreamAvgBitrate() == 0 ? "-1" : "" + qualityLiveItem.getStreamAvgBitrate());
                    jSONObject.put("streamDefinition", qualityLiveItem.newDefinition);
                    jSONObject.put("currentStream", qualityLiveItem.newDefinition.equals(this.mPlayerQualityItem.newDefinition) ? "1" : "0");
                    jSONObject.put("streamTopic", i.a(qualityLiveItem.rtcLiveUrl));
                    oyu.v();
                    if (oyu.D && qualityLiveItem.newDefinition != null && qualityLiveItem.newDefinition.contains("_60")) {
                        jSONObject.put("streamFps", "60");
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "60fpsSupports: send streamFps=60 to rtc.");
                    }
                } catch (Exception e) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getRtcSwitchLiveInfo " + e.toString());
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray.toString();
    }

    public void addExperienceInfo(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fe0204", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        this.mExperienceIdSet.add(Long.valueOf(j));
        this.mExperienceReleaseIdSet.add(Long.valueOf(j2));
        this.mExperienceBucketIdSet.add(Long.valueOf(j3));
    }

    public void initVodSelectPolicyABIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23e2e64", new Object[]{this});
        } else if (!this.mNeedInitVodSelectPolicyAB) {
        } else {
            try {
                this.mEnableVodABRbyOrange = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_VOD_SELECT, "true"));
                this.mEnableUdFirstWhenNetSatisfied = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_VOD_ABR_UD_FIRST_WHEN_NET_STATISFIED, "true"));
                if (oyu.a("vodSelect")) {
                    this.mEnableCacheFirstByAB = oyu.D();
                    this.mEnableQualityFirstByAB = oyu.E();
                    this.mBetaForVodSelect = oyu.F();
                    addExperienceInfo(oyu.b("vodSelect"), oyu.d("vodSelect"), oyu.c("vodSelect"));
                }
                this.mNeedInitVodSelectPolicyAB = false;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initVodSelectPolicyABIfNeed error: " + th.toString());
            }
        }
    }

    private void initS266ParamIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad15c157", new Object[]{this});
            return;
        }
        if (!oyu.ad && com.taobao.taobaoavsdk.c.d()) {
            String m = ozr.e().m();
            if (!TextUtils.isEmpty(m)) {
                if (!TaobaoMediaPlayer.loadS266Decoder(m)) {
                    return;
                }
                oyu.ad = true;
            }
        }
        if (this.mHasInitS266Param) {
            return;
        }
        this.mHasInitS266Param = true;
        this.mEnableS266 = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enS266", "true"));
        this.mEnableS266Devices = OrangeConfig.getInstance().getConfig("DWInteractive", "enS266Devices", "[\"V2227A\",\"2211133C\",\"2210132C\",\"PGEM10\",\"PGT-AN10\",\"22127RK46C\"]");
        this.mEnableS266SBTForVideo = OrangeConfig.getInstance().getConfig("DWInteractive", "enS266SBTForVideo", "[\"guangguang_pick\"]");
        this.mEnableS266SBTForLive = OrangeConfig.getInstance().getConfig("DWInteractive", "enS266SBTForLive", "[\"LiveRoom\"]");
        this.mDisableS266CountLimit = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "disS266CountLimit", "false"));
        this.mEnableS266InstanceErrorCondition = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enS266InstError", "true"));
    }

    public void setHandleVVCError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948cbe76", new Object[]{this});
        } else {
            this.mHandlingVVCError = true;
        }
    }

    private boolean canSelectS266Url() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("611defcf", new Object[]{this})).booleanValue();
        }
        if (this.mHandlingVVCError) {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_HANDLING_ERROR;
            return false;
        } else if (this.mHasVVCErrorEver && this.mEnableS266InstanceErrorCondition) {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_INSTANCE_ERROR;
            return false;
        } else if (!oyu.ad) {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_SO_NOT_READY;
            return false;
        } else if (oyu.ac > 0 && !this.mDisableS266CountLimit) {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_PLAYING;
            return false;
        } else if (this.mIsForPreDownload && oyu.ab > 0) {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_PRELOADING;
            return false;
        } else if (com.taobao.taobaoavsdk.util.b.b(Build.MODEL, this.mEnableS266Devices)) {
            return true;
        } else {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_NOT_WHITE_DEVICE;
            return false;
        }
    }

    public boolean canSelectS266UrlForLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cabbf7c", new Object[]{this})).booleanValue();
        }
        if (!canSelectS266Url()) {
            return false;
        }
        if (!TextUtils.isEmpty(this.mEnableS266SBTForLive) && com.taobao.taobaoavsdk.util.b.b(getFrom(), this.mEnableS266SBTForLive)) {
            return true;
        }
        this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_NOT_LIVE_SBT;
        return false;
    }

    public boolean canSelectS266UrlForVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edf0421", new Object[]{this})).booleanValue();
        }
        if (!canSelectS266Url()) {
            return false;
        }
        if (!TextUtils.isEmpty(this.mEnableS266SBTForVideo) && com.taobao.taobaoavsdk.util.b.b(getFrom(), this.mEnableS266SBTForVideo)) {
            return true;
        }
        this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_NOT_VOD_SBT;
        return false;
    }

    public void selecte266ToPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a82d1f", new Object[]{this});
        } else if (this.mHasChooseS266) {
        } else {
            if (this.mIsForPreDownload) {
                oyu.ab++;
            } else {
                oyu.ac++;
            }
            this.mHasChooseS266 = true;
        }
    }

    public void unselectS266OfPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c10ab66", new Object[]{this});
        } else if (!this.mHasChooseS266) {
        } else {
            this.mHasChooseS266 = false;
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_INIT;
            if (this.mIsForPreDownload) {
                if (oyu.ab <= 0) {
                    return;
                }
                oyu.ab--;
            } else if (oyu.ac <= 0) {
            } else {
                oyu.ac--;
            }
        }
    }
}
