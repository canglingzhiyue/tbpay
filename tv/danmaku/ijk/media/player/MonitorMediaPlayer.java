package tv.danmaku.ijk.media.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import android.util.LogPrinter;
import android.view.Surface;
import anet.channel.util.HttpConstant;
import anet.channel.util.Inet64Util;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.application.common.IApmEventListener;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.H264AuthenStrategy;
import com.taobao.mediaplay.H265AuthenStrategy;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.view.b;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import com.taobao.taobaoavsdk.cache.library.i;
import com.taobao.taobaoavsdk.g;
import com.taobao.taobaoavsdk.util.f;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.ut.mini.l;
import dt.c;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import tb.ddb;
import tb.ddc;
import tb.dde;
import tb.ddf;
import tb.ddg;
import tb.ipw;
import tb.keu;
import tb.kge;
import tb.mto;
import tb.oyu;
import tb.oyw;
import tb.ozf;
import tb.ozi;
import tb.ozm;
import tb.riy;
import tb.sii;
import tb.snv;
import tb.tmz;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes.dex */
public abstract class MonitorMediaPlayer extends c {
    public static final String ABTEST_USE_CACHE_COMOPONENT = "useCacheComponent";
    public static final String ABTEST_USE_CACHE_ENABLE = "useCache";
    public static final String ABTEST_USE_CACHE_MODULE = "useCacheModule";
    public static final String ABTEST_USE_CDNIP_COMOPONENT = "useCDNIPComponent";
    public static final String ABTEST_USE_CDNIP_ENABLE = "useCDNIP";
    public static final String ABTEST_USE_CDNIP_MODULE = "useCDNIPModule";
    private static final int CACHE_REASON_CACHE_KEY = 1;
    private static final int CACHE_REASON_OTHER = 99;
    private static final int CACHE_REASON_UNKNOWN = 0;
    private static final int CACHE_REASON_URL = 2;
    public static final String DEFAULT_NO_TRAFFIC_HOST = "";
    public static final int FFP_PROP_INT64_IS_LOCALHOST = 11405;
    public static final String HTTPDNS_IPV6_TOTAL_DISABLE = "disableTotalHttpDnsIPV6";
    public static final String KEY_NO_TRAFFIC_HOST = "PolicyHost";
    public static final String LIVE_BACKUP_CDNIP_ENABLE = "LiveBackupCDNIpEnable";
    public static final int MAX_EVENT_NUM = 30;
    public static final int MAX_RTC_ABR_REASON_NUM = 80;
    public static final String MUSIC_URL_CACHE_BLACK_BIZCODE = "musicUrlCacheBlackFromList";
    public static final String MUSIC_URL_CACHE_BLACK_URL = "musicUrlCacheBlackUrlList";
    public static final String MUSIC_URL_CACHE_CONFIG = "musicUrlCacheConfig";
    public static final String MUSIC_URL_CACHE_ENABLE_FORCE = "enMusicUrlCacheForce";
    public static final String MUSIC_URL_CACHE_PATTERN = "musicUrlCachePattern";
    public static final String MornitorBufferingNew = "stalled";
    private static final int NET_UNUSE_PROXY_CONFIG_LIVE = 3;
    private static final int NET_UNUSE_PROXY_CONFIG_NULL = 2;
    private static final int NET_UNUSE_PROXY_FORMAT_ERROR = 5;
    private static final int NET_UNUSE_PROXY_FORMAT_HTTP_ERROR = 6;
    private static final int NET_UNUSE_PROXY_PROXTFAILED = 1;
    private static final int NET_UNUSE_PROXY_TIMEOUT_ERROR_CODE = 7;
    private static final int NET_UNUSE_PROXY_UNKNOWN = 0;
    private static final int NET_UNUSE_PROXY_URL_NULL = 4;
    public static final String ORANGE_DISABLE_HDR_TO_SDR_DEVICE_LIST = "disableHdrToSdrDevices";
    public static final String ORANGE_DYNAMIC_CHECK_VIDEO_CHNAGE = "dynamicCheckVideoChange";
    public static final String ORANGE_ENABLE_ENABLE_MOV_FFMPEG_FORMAT_TO_SOURCER = "enMovFFFormatToSou";
    public static final String ORANGE_ENABLE_ENABLE_REALTIME_SET_FFMPEG_STTRING = "enRtFFString";
    public static final String ORANGE_ENABLE_FIX_MEMORY_LEAK_WITH_MFORMATOPTS = "enFixMemoryLeakWithmFormatOpts";
    public static final String ORANGE_ENABLE_HDR_TO_SDR = "enableHdrToSdr";
    public static final String ORANGE_ENABLE_HTTPS_FROM_HTTPDNS = "enableHttpsFromHttpDns";
    public static final String ORANGE_ENABLE_PLAYBACK_FALLBACK_TO_ST = "enableFallbackToST";
    public static final String ORANGE_ENABLE_RENDER_STALL_CAL_NEW = "enRenderStallCalNew";
    public static final String ORANGE_ENABLE_SUPPORT_GET_CDN_IP_NEW_STRAGY = "getCdnIpNewStragy";
    public static final String ORANGE_ENABLE_USE_SOUND_TOUCH_LIST = "useSTList";
    public static final String ORANGE_ENABLE_VF_PLUGIN_LIVE = "enableVfPluginList";
    public static final String ORANGE_ENABLE_VPM = "VPMEnabled";
    public static final String ORANGE_ENABLE_VPM_ALGO_CONFIG = "AlgoConfig";
    public static final String ORANGE_ENABLE_VPM_AUDIO_ALGO = "EnableAudioAlgo";
    public static final String ORANGE_ENABLE_VPM_HEARTBEAT_REPORT_SUB_BUSINESS_WHITE_LIST = "VPMHeartBeatReportSubBusinessWhiteList";
    public static final String ORANGE_ENABLE_VPM_SUB_BUSINESS_TYPE = "VPMEnabledSubBusinessType";
    public static final String ORANGE_USE_EVENTID_19997 = "useEventId19997";
    public static final String ORANGE_VPM_ADAPTER_COLLECT_V_TWO_API = "VPMCollectNewApiSupport";
    public static final String ORANGE_VPM_ENABLE_ALGO = "VPMEnableAlgo";
    public static final String ORANGE_VPM_HEARTBEAT_COMMIT_FIRST = "VPMHeartBeatCommitFirst";
    public static final String ORANGE_VPM_HEARTBEAT_INTERVAL_FOR_SCENARIO = "VPMHeartBeatIntervalForPlayScenario";
    public static final String ORANGE_VPM_HEARTBEAT_PLAY_SCENARIO_BLACK_LIST = "VPMHeartBeatPlayScenarioBlackList";
    public static final String ORANGE_VPM_HEARTBEAT_REPORT_PLAY_SCENARIOBLACKLIST = "VPMHeartBeatReportPlayScenarioBlackList";
    public static final String ORANGE_VPM_HEARTBEAT_SUB_BUSINESS_BLACK_LIST = "VPMHeartBeatSubBusinessBlackList";
    public static final String ORANGE_VPM_SUMMARY_SUB_BUSINESS_BLACK_LIST = "VPMSummarySubBusinessBlackList";
    public static final int PLAYER_AUDIO_OFF = 25;
    public static final int PLAYER_AUDIO_ON = 26;
    public static final int PLAYER_EVENT_CODEC_PARAM_CHANGED = 35;
    public static final int PLAYER_EVENT_COMPLETE = 6;
    public static final int PLAYER_EVENT_ERROR = 7;
    public static final int PLAYER_EVENT_FIRST_RENDER = 8;
    public static final int PLAYER_EVENT_LIVE_DOWN_SHIFT_INFO = 37;
    public static final int PLAYER_EVENT_LIVE_UP_SHIFT_INFO = 36;
    public static final int PLAYER_EVENT_PAUSE = 3;
    public static final int PLAYER_EVENT_PLAYING = 10;
    public static final int PLAYER_EVENT_PREPARED = 1;
    public static final int PLAYER_EVENT_SEEK = 5;
    public static final int PLAYER_EVENT_STALLED = 4;
    public static final int PLAYER_EVENT_START = 2;
    public static final int PLAYER_EVENT_SWITCH_FAIL = 31;
    public static final int PLAYER_EVENT_SWITCH_SUCC = 30;
    public static final int PLAYER_EVENT_TRIGGER_SWITCH_BY_RTC = 41;
    public static final int PLAYER_EVENT_VIDEO_BUFFER_STALL = 40;
    public static final int PLAYER_EVENT_VIDEO_RENDER_STALLED = 9;
    protected static final int RTCLIVE_SWITCH_STATUS_END = 1;
    protected static final int RTCLIVE_SWITCH_STATUS_START = 0;
    public static final String RTCSTREAM_MAIDIAN_DETAIL = "RtcStreamStats_Detail";
    public static final String RTCSTREAM_MAIDIAN_DOUDI = "RtcStreamStats_Degrade";
    public static final String RTCSTREAM_MAIDIAN_INFO = "RtcStreamStats_Info";
    public static final int SPEED_STATUS_NORMAL_PLAY = 0;
    public static final int SPEED_STATUS_QUICK_PLAY = 2;
    public static final int SPEED_STATUS_SLOW_PLAY = 1;
    public static final int STALL_REASON_DELAY = 1;
    public static final int STALL_REASON_FRAME_OUT_OF_ORDER = 4;
    public static final int STALL_REASON_INTERVAL = 2;
    public static final int STALL_REASON_STATE_CHANGE = 3;
    public static final int STALL_REASON_STATE_CHANGE_REASON_1 = 0;
    public static final int STALL_REASON_STATE_CHANGE_REASON_2 = 1;
    public static final int STALL_REASON_STATE_CHANGE_REASON_3 = 2;
    public static final int STALL_REASON_STATE_CHANGE_REASON_END = 3;
    public static final int STALL_REASON_STATE_CHANGE_REASON_START = 0;
    public static final int STALL_REASON_UNDEFINED = 0;
    public static final String VIDEO_CACHE_BLACK = "videoCacheBlackList";
    public static final String VIDEO_CACHE_ENABLE = "videoCacheEnable3";
    public static final String VIDEO_CDNIP_ENABLE = "videoCDNIpEnable3";
    public static final String VIDEO_CLIP_CDNIP_ENABLE = "videoClipCDNIpEnable3";
    private static final String VIDEO_RESOLUTION_1080P = "1080p";
    private static final String VIDEO_RESOLUTION_2k = "2k";
    private static final String VIDEO_RESOLUTION_360P = "360p";
    private static final String VIDEO_RESOLUTION_540P = "540p";
    private static final String VIDEO_RESOLUTION_720P = "720p";
    private static final String VIDEO_RESOLUTION_over2k = "over2k";
    public static final String VIDEO_URL_CACHE_BLACK_BIZCODE = "videoUrlCacheBlackFromList";
    public static final String VIDEO_URL_CACHE_BLACK_URL = "videoUrlCacheBlackUrlList";
    public static final String VIDEO_URL_CACHE_CONFIG = "videoUrlCacheConfig";
    private static final int WATCH_MESSAGE_ID = 100;
    private static boolean bSupportHDR = false;
    private static boolean isGetHdrResult = false;
    protected static volatile AtomicReference<String> mArtcSoMajorVersion = null;
    protected static volatile AtomicReference<String> mArtcSoMinorVersion = null;
    protected static volatile AtomicReference<String> mArtcSoPath = null;
    protected static volatile AtomicReference<String> mFFMpegSoPath = null;
    protected static boolean mGlobalCommitAdaptation = false;
    protected static long mGlogalPlayerIndex = 0;
    protected static volatile boolean mHasSetLogPrinter = false;
    protected static volatile boolean mIs266DecoderLoadedGlobal = false;
    protected static volatile boolean mIsDecoderLoadedGlobal = false;
    protected static boolean mIsVPMLibLoaded = false;
    protected static volatile int mMediaCodecAsyncOrCacheErrorCount = 0;
    static String mOutputSampleRate = null;
    protected static volatile AtomicReference<String> mS266SoPath = null;
    protected static boolean mVPMLibLoadError = false;
    private static final int maxCongestBuffer = 1000;
    private static ThreadLocal<StringBuilder> monitorReleaseBuilder = null;
    public static final String mornitorPlayerError = "playerError";
    private static ThreadLocal<StringBuilder> playExperienceBuilder;
    protected String AppMonitor_Module;
    private final long MIN_FRAME_COUNT_IN_DELAY_STATE;
    private final long MIN_TIME_IN_DELAY_STATE;
    protected final long TIME_OF_COMMIT_FETCH_SO;
    private final long UNINITIALIZED_MIN_VAL;
    protected boolean bFirstFrameRendered;
    protected boolean bIgnoreAbnormalAfterVideoComplete;
    public boolean bInitEglError;
    protected boolean bInstantSeeked;
    protected volatile boolean bIsCompleteHitCache;
    protected volatile boolean bLooping;
    public boolean bMediacodeError;
    public boolean bNeedCommitPlayExperience;
    protected boolean bPauseInBackground;
    protected volatile boolean bPaused;
    protected boolean bSecondFrameRendered;
    protected boolean bSeeked;
    protected volatile boolean bUseVideoCache;
    protected volatile boolean calledReleaseBeforeCommitPlayex;
    protected volatile long duplicateFrameCount;
    private String end2endDelay;
    int index;
    private boolean isFirstFrameRendered;
    protected int mAbIdOfSyncAfterSeek;
    protected ddb mAbTestAdapter;
    protected long mAbnormalPlayDuration;
    protected int mAbnormalPlayFrameCount;
    protected float mAbnormalPlaySpeedThreshold;
    private g mActiveDataSource;
    protected boolean mAlwaysMutePlay;
    public BaseAnalysis mAnalysis;
    protected IApmEventListener mApmEventListener;
    protected long mArtcAbrRedundantRequestSwitchDownCount;
    protected long mArtcAbrRedundantRequestSwitchUpCount;
    protected long mArtcAbrRequestSwitchDownCount;
    protected long mArtcAbrRequestSwitchUpCount;
    protected long mArtcAbrSwitchDownCount;
    protected long mArtcAbrSwitchUpCount;
    protected long mArtcAbrTotalRequestSwitchDownCount;
    protected long mArtcAbrTotalRequestSwitchUpCount;
    protected long mArtcSwitchCount;
    protected long mArtcSwitchDownCount;
    protected long mArtcSwitchDownSucCount;
    protected long mArtcSwitchDownSucTotalTime;
    protected long mArtcSwitchDownSyncErrCount;
    protected long mArtcSwitchDownSyncSucCount;
    protected long mArtcSwitchDownTsDelta;
    protected long mArtcSwitchSucCount;
    protected long mArtcSwitchSucTotalTime;
    protected long mArtcSwitchUpCount;
    protected long mArtcSwitchUpSucCount;
    protected long mArtcSwitchUpSucTotalTime;
    protected long mArtcSwitchUpSyncErrCount;
    protected long mArtcSwitchUpSyncSucCount;
    protected long mArtcSwitchUpTsDelta;
    private int mArtcTraceDataIndex;
    long mAudioBytes;
    private float mAudioGainCoef;
    protected long mAudioStartTime;
    public volatile int mBeatCount;
    protected long mBufferingCountNew;
    protected long mBufferingHeartBeatCount;
    protected StringBuilder mBufferingHeartBeatMsg;
    protected long mBufferingHeartBeatTotalTime;
    protected long mBufferingStart;
    protected long mBufferingTotalTimeNew;
    protected long mCacheLengthAtStart;
    private int mCacheReason;
    private boolean mCalRenderStalledByDivided;
    protected int mCheckMp4PatternWhenUseUrlCache;
    protected boolean mCodeClean;
    protected String mCodeUsageCount;
    protected boolean mCommitLivePushControlInfo;
    protected boolean mCommitPlayError;
    protected ddc mConfigAdapter;
    protected String mConfigParams;
    protected WeakReference<Context> mContextRef;
    protected boolean mCreateInBackground;
    protected int mCurrRenderingStatus;
    protected String mCurrentPageName;
    protected String mDebugStatus;
    protected int mDegradeCode;
    protected volatile long mDelayTimeAtDelayBegin;
    protected boolean mDisableFixSeekCount;
    protected int mDisablePullAudio;
    private boolean mDisableSeparateSeekAbnormalTime;
    protected volatile long mDisorderFrameCountNew;
    protected HashMap<String, String> mDynamicPlayExMap;
    protected boolean mEnableAddUnorderedStall;
    private boolean mEnableAudioClip;
    private boolean mEnableAudioGain;
    protected boolean mEnableChangeCurPositionToVideoPosition;
    protected boolean mEnableDecodeAACDSE;
    protected boolean mEnableFixAbnormalStatForFirstRender;
    protected boolean mEnableFixAbnormalStatForLoop;
    protected boolean mEnableMediaCodecAsync;
    protected boolean mEnableMediaCodecAsyncLooseSize;
    protected boolean mEnableMediaCodecCache;
    protected boolean mEnableMediacodecOpengl;
    protected volatile boolean mEnableRenderStallCalNew;
    protected boolean mEnableRtcSwitch;
    private boolean mEnableSeekFlushBuffer;
    protected boolean mEnableSeekInPause;
    protected boolean mEnableStatRenderStallInNative;
    protected boolean mEnableStatRenderStallInNonSurface;
    protected boolean mEnableStatRenderStallInNonVisible;
    protected boolean mEnableSyncAfterSeek;
    protected boolean mEnableVFPlugin;
    protected boolean mEnableVPM;
    protected boolean mEnableVPMAudioAlgo;
    protected boolean mEnableWatch;
    String mEncodeType;
    boolean mExit;
    protected boolean mFetchArtcSoAfterSelect;
    protected boolean mFetchArtcSoReadyInit;
    protected boolean mFetchFFMpegSoReadyInit;
    protected boolean mFetchS266SoReadyInit;
    protected long mFetchSoStartTime;
    protected long mFetchSoTime;
    protected long mFirstFrameSurfaceUpdateTime;
    protected long mFirstFrameSurfaceUpdateTs;
    protected long mFirstPlayTime;
    protected long mFirstRenderRecvTime;
    protected long mFirstRenderStalledPts;
    public long mFirstRenderTime;
    protected long mFirstSetSurfaceTime;
    protected int mFirstSwitchDownReason;
    protected long mFirstUpdateTimeFromPlayerStart;
    protected boolean mForceMuteMode;
    protected volatile long mFrameCountInDelayState;
    protected volatile long mFrameCountRecoverInDelayState;
    protected int mFrameInfoLevel;
    protected int mFrameInfoTop1Position;
    protected int mFrameInfoTop2Position;
    protected boolean mFromNotValid;
    protected int mGenerateCacheKeyModeWhenUseUrlCache;
    private H264AuthenStrategy mH264AuthenStrategy;
    private H265AuthenStrategy mH265AuthenStrategy;
    Handler mHandler;
    protected boolean mHasCommitFetchSoFinish;
    protected boolean mHasEverClose;
    protected boolean mHasEverEnableBluetooth;
    protected boolean mHasSetSurface;
    protected volatile boolean mHasUpdateSourceFps;
    private long mHeartBeatCount;
    StringBuilder mHeartBeatDecodeFPS;
    StringBuilder mHeartBeatDownloadFPS;
    StringBuilder mHeartBeatFPS;
    protected long mHeartBeatInterval;
    protected int mHeartBeatIntervalForLive;
    protected int mHeartBeatIntervalForVod;
    protected String mHeartBeatIntervalStr;
    StringBuilder mHeartBeatNetSpeed;
    private final Object mHttpDnsOriginLock;
    protected long mHttpOpenTime;
    protected List<String> mIgnoreParamListWhenGenerateCacheKeyMode;
    long mInnerStartTime;
    protected String mInterfaceUsageCount;
    protected boolean mIsBackground;
    protected volatile boolean mIsDecoderLoaded;
    private volatile boolean mIsFirstFrameRenderedNewUpdate;
    protected boolean mIsFirstRenderStalledPtsRecorded;
    protected boolean mIsFloatWindow;
    protected volatile boolean mIsInDelayStallInterval;
    protected boolean mIsPlayingFlv;
    protected boolean mIsPlayingInBackground;
    protected boolean mIsPlayingInBackgroundNew;
    protected boolean mIsPlayingWhenInvisible;
    protected boolean mIsPrerelease;
    protected long mLastBgPlayTime;
    protected long mLastBufferDuration;
    protected long mLastBuffering;
    protected long mLastCommitPlaying;
    int mLastErrorCode;
    int mLastExtra;
    protected long mLastFloatWindowsPlayTime;
    private volatile long mLastFramePts;
    private volatile long mLastFrameRenderSystemTime;
    int mLastIsConnected;
    protected volatile long mLastMonitorRenderSystemTime;
    protected boolean mLastMuteState;
    protected int mLastPlayError;
    protected volatile long mLastPlayTime;
    protected long mLastPlayTimeInBackground;
    protected long mLastRenderVideoEveryFrame;
    private volatile long mLastStalledFrameFramePts;
    private volatile long mLastStalledFrameRenderSystemTime;
    private String mLastVideoResolution;
    private long mLastVideoSizePlayTime;
    protected float mLastVolume;
    private int mLivePlayerNum;
    protected String mLivePushControlInfo;
    private int mLiveWarmupNum;
    String mLocalIP;
    private final Object mLock;
    protected int mLoopCount;
    protected String mLowQualityUrl;
    protected volatile float mMaxFpsAtStalledCal;
    protected int mMaxPlayerInstanceCount;
    protected int mMaxRenderAbnormalInRenderThread;
    protected volatile long mMaxStalledCountInDelay;
    protected volatile double mMaxStalledCountInInterval;
    protected int mMediaCodecABId;
    protected int mMediaCodecErrorReason;
    protected int mMediaCodecInputErrorCode;
    protected int mMediaCodecOutputErrorCode;
    protected int mMediaCodecProcessError;
    protected int mMessageWasteExceedThreshold;
    protected boolean mMuteAudio;
    protected List<Integer> mMuteStateNodes;
    protected volatile boolean mNeedRegisterFetchCallback;
    private AtomicInteger mNetCounter;
    protected int mNetStackType;
    protected ddf mNetworkUtilsAdapter;
    protected boolean mNotSetH26XInConfig;
    private long mOpenFileTime;
    private boolean mOrangeForceStaticConfigVPMInfo;
    private boolean mOrangeForceUseCache;
    protected String mOriginSelectedUrlName;
    protected String mPageUrl;
    protected int mPanoType;
    protected PhoneStateListener mPhoneStateListener;
    protected StringBuffer mPlayExperienceStatValue;
    protected String mPlayExperienceStaticStatValue;
    protected boolean mPlayInPIP;
    protected float mPlayRate;
    private int mPlayStartVideoHeight;
    private int mPlayStartVideoWidth;
    protected String mPlayStatStaticValue;
    protected long mPlayTimeHd;
    protected long mPlayTimeInBackground;
    protected long mPlayTimeUd;
    protected LinkedList<Integer> mPlayerEventList;
    protected long mPlayerIndex;
    protected LinkedList<Integer> mPlayerPullAudioEventList;
    protected String mPlayingLiveDefinition;
    protected long mPrepareStartTime;
    private long mReceiveFramesInRendering;
    protected int mReleaseReason;
    long mRendedTimeInRenderThread;
    private String mRenderStallStatInfoForFirstTime;
    private final Object mRenderStatLock;
    long mRenderTimeFromInnerStart;
    volatile int mReportBitrateTimes;
    private long mRequestBytesInRendering;
    private long mResumeTs;
    private volatile long mResumeTsNew;
    protected boolean mReuseFlag;
    protected int mRotate;
    protected long mRtcAudioFirstPacketTime;
    protected volatile long mRtcAudioTrackBufferCount;
    protected volatile long mRtcAudioTrackBufferStart;
    protected volatile long mRtcAudioTrackBufferTotalTime;
    protected long mRtcCongestionMode;
    protected LinkedList<Integer> mRtcLiveAbrReasonList;
    protected boolean mRtcLiveAutoSwitch;
    protected int mRtcPacketBufferClearToKeyDiasble;
    protected float mRtcPlayRate;
    protected long mRtcStrategicAbnormalCount;
    protected long mRtcStrategicAbnormalTime;
    protected int mRtcTotalCount;
    protected float mRtcTotalRate;
    protected long mRtcVideoFirstFrameTime;
    protected long mRtcVideoFirstPacketTime;
    protected int mRtcVideoNackBackoffDisable;
    protected volatile long mRtcVideoTrackBufferCount;
    protected volatile long mRtcVideoTrackBufferStart;
    protected volatile long mRtcVideoTrackBufferTotalTime;
    StringBuilder mRtpBitrate;
    StringBuilder mSampleAudioLossRate;
    StringBuilder mSampleVideoLossRate;
    protected boolean mSeamlessSwitchCanUsingSingleDecoder;
    protected long mSeamlessSwitchEndTime;
    protected boolean mSeamlessSwitchForcedly;
    protected int mSeamlessSwitchIndex;
    protected int mSeamlessSwitchMode;
    protected String mSeamlessSwitchPath;
    protected String mSeamlessSwitchSelectName;
    protected long mSeamlessSwitchStartTime;
    protected int mSeamlessSwitchStatus;
    protected String mSeamlessSwitchStatusAll;
    long mSecondEndtime;
    public long mSecondRenderTime;
    protected long mSeekCount;
    protected boolean mSeekFastMode;
    protected long mSeekStart;
    protected long mSeekTime;
    protected int mSelectFlvUrlReason;
    protected boolean mSendLogToken;
    protected String mServerIPJson;
    protected boolean mShouldStatRenderStallInNative;
    protected volatile float mSourceFpsInterval;
    protected volatile long mStalledCountInDelayState;
    protected long mStartTime;
    private int mState;
    public LinkedList<Integer> mStreamSelectReasonList;
    protected Surface mSurface;
    protected long mSurfaceTime;
    protected int mSwitchFailCounter;
    protected int mSwitchForceSuccCounter;
    protected int mSwitchRotate;
    protected String mSwitchScene;
    protected long mSwitchSceneTime;
    protected int mSwitchSuccCounter;
    protected String mSwitchTargetLiveDefinition;
    protected String mSwitchToBackKey;
    protected String mSwitchToFrontKey;
    protected boolean mSyncNotifyHttpDns;
    protected volatile long mSystemTimeAtDelayBegin;
    private long mT;
    private long mTD;
    private long mTDn;
    protected TelephonyManager mTelephonyManager;
    private final Object mTimeLock;
    protected ddg mTlogAdapter;
    protected boolean mTmpEnableGetStartTimeInRelease;
    private long mTn;
    protected int mTotalBgCount;
    protected long mTotalBgPlayTime;
    protected volatile long mTotalDelayTime;
    protected int mTotalFloatWindowsCount;
    protected long mTotalFloatWindowsPlayTime;
    protected volatile long mTotalPlayTime;
    protected long mTotalQuickFrameCountAll;
    protected long mTotalQuickPlayFrameCount;
    protected long mTotalQuickPlayTime;
    protected long mTotalQuickPlayTimeAll;
    protected long mTotalRenderIntervalDiff;
    protected long mTotalSlowFrameCountAll;
    protected long mTotalSlowPlayFrameCount;
    protected long mTotalSlowPlayTime;
    protected long mTotalSlowPlayTimeAll;
    private Runnable mUTRun;
    private int mUnuseProxyReason;
    protected boolean mUseEventId19997;
    protected boolean mUseMediacodec;
    protected boolean mUsePlayRateCalSubStall;
    protected int mUseSoftwareByPolicy;
    protected boolean mUseSurfaceView;
    public long mUserFirstFrameTime;
    protected String mUsingInterface;
    protected String mVPMAlgoConfig;
    protected int mValidAbnormalFrameCount;
    private String mValidDynamicPlayList;
    String mVia;
    long mVideoBytes;
    private long mVideoCacheBytesInRendering;
    private long mVideoCacheFramesInRendering;
    long mVideoDuration;
    protected long mVideoRenderStalledDurationThreshold;
    protected volatile long mVideoRenderingStalledCountNewUpdate;
    protected volatile long mVideoRenderingStalledCountNewUpdate_r1;
    protected volatile long mVideoRenderingStalledCountNewUpdate_r2;
    protected volatile long mVideoRenderingStalledCountNewUpdate_r3;
    protected volatile long mVideoRenderingStalledCountNewUpdate_r4;
    private Map<String, Long> mVideoResolutionPlayTimeMap;
    private Map<String, Long> mVideoResolutionRenderingStalledCountMap;
    protected long mVideoStartTime;
    protected int mVideoSwitchHeight;
    protected int mVideoSwitchSarDen;
    protected int mVideoSwitchSarNum;
    protected int mVideoSwitchWidth;
    private String mVideoToken;
    protected boolean mViewIsVisible;
    private int mVodPlayerNum;
    protected float mVolume;
    protected List<Float> mVolumeStateNodes;
    protected long mWarmupEndTime;
    protected long mWarmupReceiveBytes;
    protected long mWarmupStartTime;
    private long mWatchExceedNum1;
    private long mWatchExceedNum2;
    protected long mWatchExceedThreshold;
    private long mWatchExceedTime1;
    private long mWatchExceedTime2;
    private Handler mWatchHandler;
    protected long mWatchInterval;
    private long mWatchLastMessageTime;
    private final Object mWatchLock;
    private final long mWatchMinTime;
    protected int mWatchPhase;
    public long maxSeekTime;
    protected boolean monitorNewStalled;
    boolean pauseByTelephone;
    public List<Long> seekTimeList;
    protected long videoRenderingStalledCount;
    protected long videoRenderingStalledCountInRenderThread;
    protected volatile long videoRenderingStalledCountNewWithResolution;
    protected volatile long videoRenderingStalledCountNew_43833053;
    protected volatile long videoRenderingStalledCountNew_43833053_LastForVpm;
    protected volatile long videoRenderingStalledCountNew_43833053_r1;
    protected volatile long videoRenderingStalledCountNew_43833053_r2;
    protected long[] videoRenderingStalledCountNew_43833053_reasons;
    private long videoRenderingStalledCount_live;
    protected long videoRenderingStalledTotalDuration;
    protected long videoRenderingStalledTotalDurationInRenderThread;
    protected volatile long videoRenderingStalledTotalDurationNew_43833053;
    protected volatile long videoRenderingStalledTotalDurationNew_43833053_LastForVpm;
    protected volatile long videoRenderingStalledTotalDurationNew_43833053_r1;
    protected volatile long videoRenderingStalledTotalDurationNew_43833053_r2;
    private long videoRenderingStalledTotalDuration_live;

    static {
        kge.a(1913811484);
        mArtcSoPath = new AtomicReference<>("");
        mS266SoPath = new AtomicReference<>("");
        mFFMpegSoPath = new AtomicReference<>("");
        mArtcSoMajorVersion = new AtomicReference<>("");
        mArtcSoMinorVersion = new AtomicReference<>("");
        mGlogalPlayerIndex = 0L;
        mGlobalCommitAdaptation = false;
        mHasSetLogPrinter = false;
        isGetHdrResult = false;
        bSupportHDR = false;
        mIsVPMLibLoaded = false;
        mVPMLibLoadError = false;
        mIsDecoderLoadedGlobal = false;
        mIs266DecoderLoadedGlobal = false;
        monitorReleaseBuilder = new ThreadLocal<StringBuilder>() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public StringBuilder initialValue() {
                return new StringBuilder(1024);
            }
        };
        playExperienceBuilder = new ThreadLocal<StringBuilder>() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public StringBuilder initialValue() {
                return new StringBuilder(1024);
            }
        };
    }

    public MonitorMediaPlayer() {
        this.mContextRef = null;
        this.AppMonitor_Module = "";
        this.mDegradeCode = 0;
        this.mOriginSelectedUrlName = "";
        this.mBufferingStart = 0L;
        this.mLastBuffering = 0L;
        this.mLastCommitPlaying = 0L;
        this.mLastBufferDuration = 0L;
        this.mSeekStart = 0L;
        this.mSeekTime = 0L;
        this.mPrepareStartTime = 0L;
        this.mStartTime = 0L;
        this.mFirstPlayTime = 0L;
        this.mFirstFrameSurfaceUpdateTime = -1L;
        this.mFirstFrameSurfaceUpdateTs = 0L;
        this.mFirstUpdateTimeFromPlayerStart = -1L;
        this.mFirstRenderTime = 0L;
        this.mSecondRenderTime = 0L;
        this.mUserFirstFrameTime = -1L;
        this.mLastPlayTime = 0L;
        this.mTotalPlayTime = 0L;
        this.mBufferingCountNew = 0L;
        this.mBufferingTotalTimeNew = 0L;
        this.mBufferingHeartBeatCount = 0L;
        this.mBufferingHeartBeatTotalTime = 0L;
        this.videoRenderingStalledCount = 0L;
        this.videoRenderingStalledTotalDuration = 0L;
        this.videoRenderingStalledCountInRenderThread = 0L;
        this.videoRenderingStalledTotalDurationInRenderThread = 0L;
        this.videoRenderingStalledCountNew_43833053 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053 = 0L;
        this.videoRenderingStalledCountNew_43833053_LastForVpm = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_LastForVpm = 0L;
        this.videoRenderingStalledCountNew_43833053_r1 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_r1 = 0L;
        this.videoRenderingStalledCountNew_43833053_r2 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_r2 = 0L;
        this.videoRenderingStalledCountNewWithResolution = 0L;
        this.mEnableAddUnorderedStall = true;
        this.duplicateFrameCount = 0L;
        this.videoRenderingStalledCountNew_43833053_reasons = new long[]{0, 0, 0};
        this.mRtcStrategicAbnormalCount = 0L;
        this.mRtcStrategicAbnormalTime = 0L;
        this.mRtcTotalRate = 0.0f;
        this.mRtcPlayRate = 0.0f;
        this.mUsePlayRateCalSubStall = false;
        this.mRtcTotalCount = 0;
        this.videoRenderingStalledCount_live = 0L;
        this.videoRenderingStalledTotalDuration_live = 0L;
        this.mLock = new Object();
        this.mTimeLock = new Object();
        this.mRenderStatLock = new Object();
        this.mDebugStatus = b.PULL_INIT;
        this.bNeedCommitPlayExperience = false;
        this.bMediacodeError = false;
        this.bInitEglError = false;
        this.bFirstFrameRendered = false;
        this.bSecondFrameRendered = false;
        this.mCommitPlayError = false;
        this.mRtcVideoNackBackoffDisable = 0;
        this.mRtcPacketBufferClearToKeyDiasble = 0;
        this.mRtcCongestionMode = 0L;
        this.mServerIPJson = "";
        this.mNetStackType = 0;
        this.mPlayerEventList = new LinkedList<>();
        this.mPlayerPullAudioEventList = new LinkedList<>();
        this.mRtcLiveAbrReasonList = new LinkedList<>();
        this.mTmpEnableGetStartTimeInRelease = true;
        this.mSendLogToken = true;
        this.mFetchArtcSoReadyInit = false;
        this.mFetchS266SoReadyInit = false;
        this.mFetchFFMpegSoReadyInit = false;
        this.mFetchArtcSoAfterSelect = false;
        this.mFetchSoStartTime = 0L;
        this.mFetchSoTime = 0L;
        this.mHasCommitFetchSoFinish = false;
        this.TIME_OF_COMMIT_FETCH_SO = 10000L;
        this.mCommitLivePushControlInfo = true;
        this.mEnableSeekInPause = false;
        this.mIsFloatWindow = false;
        this.mSelectFlvUrlReason = 0;
        this.mLastPlayError = 0;
        this.mViewIsVisible = true;
        this.mEnableStatRenderStallInNonVisible = false;
        this.mEnableStatRenderStallInNonSurface = false;
        this.mEnableStatRenderStallInNative = true;
        this.mShouldStatRenderStallInNative = true;
        this.mIsBackground = false;
        this.mSeekFastMode = true;
        this.mCheckMp4PatternWhenUseUrlCache = 1;
        this.mGenerateCacheKeyModeWhenUseUrlCache = 1;
        this.mIgnoreParamListWhenGenerateCacheKeyMode = new LinkedList();
        this.mSeamlessSwitchMode = 0;
        this.mSeamlessSwitchStatus = -1;
        this.mForceMuteMode = false;
        this.bPauseInBackground = false;
        this.mLastMuteState = true;
        this.mLastErrorCode = 0;
        this.mLastExtra = 0;
        this.mLastIsConnected = 1;
        this.mReportBitrateTimes = 0;
        this.mHandler = null;
        this.mAudioBytes = 0L;
        this.mVideoBytes = 0L;
        this.mVideoDuration = 0L;
        this.pauseByTelephone = false;
        this.bPaused = false;
        this.mHeartBeatInterval = -1L;
        this.mState = 0;
        this.end2endDelay = null;
        this.mLastVideoSizePlayTime = 0L;
        this.mPlayStartVideoWidth = 0;
        this.mPlayStartVideoHeight = 0;
        this.mVodPlayerNum = 0;
        this.mLivePlayerNum = 0;
        this.mLiveWarmupNum = 0;
        this.mUseMediacodec = true;
        this.mUseSoftwareByPolicy = 0;
        this.mNotSetH26XInConfig = false;
        this.mUTRun = null;
        this.mVideoRenderStalledDurationThreshold = 200L;
        this.UNINITIALIZED_MIN_VAL = -9999L;
        this.isFirstFrameRendered = false;
        this.mT = -9999L;
        this.mTD = -9999L;
        this.mTn = -9999L;
        this.mTDn = -9999L;
        this.mResumeTs = -9999L;
        this.monitorNewStalled = false;
        this.mRenderStallStatInfoForFirstTime = "";
        this.mVideoCacheBytesInRendering = -1L;
        this.mVideoCacheFramesInRendering = -1L;
        this.mRequestBytesInRendering = -1L;
        this.mReceiveFramesInRendering = -1L;
        this.mHeartBeatIntervalForVod = -1;
        this.mHeartBeatIntervalForLive = -1;
        this.mUseEventId19997 = false;
        this.mHttpDnsOriginLock = new Object();
        this.mRtpBitrate = new StringBuilder(200);
        this.mSampleVideoLossRate = new StringBuilder(200);
        this.mSampleAudioLossRate = new StringBuilder(200);
        this.mPanoType = 0;
        this.mNetCounter = new AtomicInteger();
        this.mPlayerIndex = 0L;
        this.mCacheReason = 0;
        this.mUnuseProxyReason = 0;
        this.mEnableSyncAfterSeek = false;
        this.mAbIdOfSyncAfterSeek = -99;
        this.mMediaCodecInputErrorCode = 0;
        this.mMediaCodecOutputErrorCode = 0;
        this.mCurrentPageName = "";
        this.mIsPrerelease = false;
        this.mFromNotValid = false;
        this.mFrameInfoLevel = -1;
        this.mFrameInfoTop1Position = 0;
        this.mFrameInfoTop2Position = 0;
        this.mHeartBeatFPS = new StringBuilder(10);
        this.mHeartBeatDownloadFPS = new StringBuilder(10);
        this.mHeartBeatDecodeFPS = new StringBuilder(10);
        this.mHeartBeatNetSpeed = new StringBuilder(10);
        this.mDisableFixSeekCount = false;
        this.mEnableChangeCurPositionToVideoPosition = true;
        this.mIsPlayingFlv = false;
        this.mEnableDecodeAACDSE = false;
        this.mFirstRenderRecvTime = 0L;
        this.mRotate = 0;
        this.mH265AuthenStrategy = H265AuthenStrategy.WHITLIST;
        this.mH264AuthenStrategy = H264AuthenStrategy.WHITLIST;
        this.mAudioGainCoef = 1.0f;
        this.mEnableAudioGain = false;
        this.mLastRenderVideoEveryFrame = 0L;
        this.mMaxRenderAbnormalInRenderThread = 200;
        this.mEnableSeekFlushBuffer = true;
        this.mEnableAudioClip = false;
        this.mWarmupStartTime = 0L;
        this.mWarmupEndTime = 0L;
        this.mWarmupReceiveBytes = 0L;
        this.mOrangeForceStaticConfigVPMInfo = true;
        this.mWatchHandler = null;
        this.mWatchLastMessageTime = 0L;
        this.mWatchInterval = 0L;
        this.mWatchExceedThreshold = 0L;
        this.mMessageWasteExceedThreshold = 0;
        this.mWatchExceedTime1 = 0L;
        this.mWatchExceedNum1 = 0L;
        this.mWatchExceedTime2 = 0L;
        this.mWatchExceedNum2 = 0L;
        this.mWatchPhase = 0;
        this.mEnableWatch = false;
        this.mCodeClean = true;
        this.mWatchMinTime = 10L;
        this.mWatchLock = new Object();
        this.mEnableFixAbnormalStatForFirstRender = true;
        this.mEnableFixAbnormalStatForLoop = true;
        this.mDisablePullAudio = 0;
        this.mStreamSelectReasonList = new LinkedList<>();
        this.mIsDecoderLoaded = false;
        this.mMuteAudio = false;
        this.mPlayRate = 1.0f;
        this.mPlayInPIP = false;
        this.mTotalBgPlayTime = 0L;
        this.mLastBgPlayTime = 0L;
        this.mTotalFloatWindowsPlayTime = 0L;
        this.mLastFloatWindowsPlayTime = 0L;
        this.mTotalFloatWindowsCount = 0;
        this.mTotalBgCount = 0;
        this.mSwitchToBackKey = "smallWindow";
        this.mSwitchToFrontKey = "liveRoom";
        this.mMediaCodecErrorReason = 0;
        this.mMediaCodecProcessError = 0;
        this.mFirstSwitchDownReason = -1;
        this.mPlayingLiveDefinition = "";
        this.mSwitchTargetLiveDefinition = "";
        this.mArtcTraceDataIndex = 0;
        this.mRtcVideoFirstFrameTime = 0L;
        this.mRtcVideoFirstPacketTime = 0L;
        this.mRtcAudioFirstPacketTime = 0L;
        this.mAbnormalPlayDuration = 0L;
        this.mAbnormalPlayFrameCount = 0;
        this.mValidAbnormalFrameCount = 1;
        this.mAbnormalPlaySpeedThreshold = 0.2f;
        this.mCurrRenderingStatus = 0;
        this.mTotalQuickPlayTime = 0L;
        this.mTotalSlowPlayTime = 0L;
        this.mTotalQuickPlayFrameCount = 0L;
        this.mTotalSlowPlayFrameCount = 0L;
        this.mTotalQuickPlayTimeAll = 0L;
        this.mTotalSlowPlayTimeAll = 0L;
        this.mTotalQuickFrameCountAll = 0L;
        this.mTotalSlowFrameCountAll = 0L;
        this.mMaxPlayerInstanceCount = -1;
        this.mCalRenderStalledByDivided = false;
        this.seekTimeList = new LinkedList();
        this.maxSeekTime = -1L;
        this.mHasEverEnableBluetooth = false;
        this.mMuteStateNodes = new LinkedList();
        this.mVolumeStateNodes = new LinkedList();
        this.mAlwaysMutePlay = true;
        this.mIsPlayingWhenInvisible = false;
        this.mIsPlayingInBackground = false;
        this.mIsPlayingInBackgroundNew = false;
        this.mIsFirstRenderStalledPtsRecorded = false;
        this.mFirstRenderStalledPts = -1L;
        this.mCacheLengthAtStart = -1L;
        this.mVideoRenderingStalledCountNewUpdate = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r1 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r2 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r3 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r4 = 0L;
        this.mLastMonitorRenderSystemTime = 0L;
        this.mIsFirstFrameRenderedNewUpdate = false;
        this.mLastStalledFrameRenderSystemTime = -9999L;
        this.mLastStalledFrameFramePts = -9999L;
        this.mLastFrameRenderSystemTime = -9999L;
        this.mLastFramePts = -9999L;
        this.mResumeTsNew = -9999L;
        this.mDisorderFrameCountNew = 0L;
        this.mFrameCountInDelayState = 0L;
        this.mFrameCountRecoverInDelayState = 0L;
        this.mStalledCountInDelayState = 0L;
        this.mMaxStalledCountInDelay = 0L;
        this.mDelayTimeAtDelayBegin = 0L;
        this.mTotalDelayTime = 0L;
        this.mSystemTimeAtDelayBegin = 0L;
        this.mIsInDelayStallInterval = false;
        this.MIN_FRAME_COUNT_IN_DELAY_STATE = 10L;
        this.MIN_TIME_IN_DELAY_STATE = 500L;
        this.mEnableRenderStallCalNew = false;
        this.mHasUpdateSourceFps = false;
        this.mSourceFpsInterval = 0.0f;
        this.mMaxStalledCountInInterval = mto.a.GEO_NOT_SUPPORT;
        this.mMaxFpsAtStalledCal = 0.0f;
        this.calledReleaseBeforeCommitPlayex = false;
        this.index = 0;
    }

    public MonitorMediaPlayer(Context context) {
        this(context, null);
    }

    public MonitorMediaPlayer(Context context, ddc ddcVar) {
        Context context2 = null;
        this.mContextRef = null;
        this.AppMonitor_Module = "";
        this.mDegradeCode = 0;
        this.mOriginSelectedUrlName = "";
        this.mBufferingStart = 0L;
        this.mLastBuffering = 0L;
        this.mLastCommitPlaying = 0L;
        this.mLastBufferDuration = 0L;
        this.mSeekStart = 0L;
        this.mSeekTime = 0L;
        this.mPrepareStartTime = 0L;
        this.mStartTime = 0L;
        this.mFirstPlayTime = 0L;
        this.mFirstFrameSurfaceUpdateTime = -1L;
        this.mFirstFrameSurfaceUpdateTs = 0L;
        this.mFirstUpdateTimeFromPlayerStart = -1L;
        this.mFirstRenderTime = 0L;
        this.mSecondRenderTime = 0L;
        this.mUserFirstFrameTime = -1L;
        this.mLastPlayTime = 0L;
        this.mTotalPlayTime = 0L;
        this.mBufferingCountNew = 0L;
        this.mBufferingTotalTimeNew = 0L;
        this.mBufferingHeartBeatCount = 0L;
        this.mBufferingHeartBeatTotalTime = 0L;
        this.videoRenderingStalledCount = 0L;
        this.videoRenderingStalledTotalDuration = 0L;
        this.videoRenderingStalledCountInRenderThread = 0L;
        this.videoRenderingStalledTotalDurationInRenderThread = 0L;
        this.videoRenderingStalledCountNew_43833053 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053 = 0L;
        this.videoRenderingStalledCountNew_43833053_LastForVpm = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_LastForVpm = 0L;
        this.videoRenderingStalledCountNew_43833053_r1 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_r1 = 0L;
        this.videoRenderingStalledCountNew_43833053_r2 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_r2 = 0L;
        this.videoRenderingStalledCountNewWithResolution = 0L;
        this.mEnableAddUnorderedStall = true;
        this.duplicateFrameCount = 0L;
        this.videoRenderingStalledCountNew_43833053_reasons = new long[]{0, 0, 0};
        this.mRtcStrategicAbnormalCount = 0L;
        this.mRtcStrategicAbnormalTime = 0L;
        this.mRtcTotalRate = 0.0f;
        this.mRtcPlayRate = 0.0f;
        this.mUsePlayRateCalSubStall = false;
        this.mRtcTotalCount = 0;
        this.videoRenderingStalledCount_live = 0L;
        this.videoRenderingStalledTotalDuration_live = 0L;
        this.mLock = new Object();
        this.mTimeLock = new Object();
        this.mRenderStatLock = new Object();
        this.mDebugStatus = b.PULL_INIT;
        this.bNeedCommitPlayExperience = false;
        this.bMediacodeError = false;
        this.bInitEglError = false;
        this.bFirstFrameRendered = false;
        this.bSecondFrameRendered = false;
        this.mCommitPlayError = false;
        this.mRtcVideoNackBackoffDisable = 0;
        this.mRtcPacketBufferClearToKeyDiasble = 0;
        this.mRtcCongestionMode = 0L;
        this.mServerIPJson = "";
        this.mNetStackType = 0;
        this.mPlayerEventList = new LinkedList<>();
        this.mPlayerPullAudioEventList = new LinkedList<>();
        this.mRtcLiveAbrReasonList = new LinkedList<>();
        this.mTmpEnableGetStartTimeInRelease = true;
        this.mSendLogToken = true;
        this.mFetchArtcSoReadyInit = false;
        this.mFetchS266SoReadyInit = false;
        this.mFetchFFMpegSoReadyInit = false;
        this.mFetchArtcSoAfterSelect = false;
        this.mFetchSoStartTime = 0L;
        this.mFetchSoTime = 0L;
        this.mHasCommitFetchSoFinish = false;
        this.TIME_OF_COMMIT_FETCH_SO = 10000L;
        this.mCommitLivePushControlInfo = true;
        this.mEnableSeekInPause = false;
        this.mIsFloatWindow = false;
        this.mSelectFlvUrlReason = 0;
        this.mLastPlayError = 0;
        this.mViewIsVisible = true;
        this.mEnableStatRenderStallInNonVisible = false;
        this.mEnableStatRenderStallInNonSurface = false;
        this.mEnableStatRenderStallInNative = true;
        this.mShouldStatRenderStallInNative = true;
        this.mIsBackground = false;
        this.mSeekFastMode = true;
        this.mCheckMp4PatternWhenUseUrlCache = 1;
        this.mGenerateCacheKeyModeWhenUseUrlCache = 1;
        this.mIgnoreParamListWhenGenerateCacheKeyMode = new LinkedList();
        this.mSeamlessSwitchMode = 0;
        this.mSeamlessSwitchStatus = -1;
        this.mForceMuteMode = false;
        this.bPauseInBackground = false;
        this.mLastMuteState = true;
        this.mLastErrorCode = 0;
        this.mLastExtra = 0;
        this.mLastIsConnected = 1;
        this.mReportBitrateTimes = 0;
        this.mHandler = null;
        this.mAudioBytes = 0L;
        this.mVideoBytes = 0L;
        this.mVideoDuration = 0L;
        this.pauseByTelephone = false;
        this.bPaused = false;
        this.mHeartBeatInterval = -1L;
        this.mState = 0;
        this.end2endDelay = null;
        this.mLastVideoSizePlayTime = 0L;
        this.mPlayStartVideoWidth = 0;
        this.mPlayStartVideoHeight = 0;
        this.mVodPlayerNum = 0;
        this.mLivePlayerNum = 0;
        this.mLiveWarmupNum = 0;
        this.mUseMediacodec = true;
        this.mUseSoftwareByPolicy = 0;
        this.mNotSetH26XInConfig = false;
        this.mUTRun = null;
        this.mVideoRenderStalledDurationThreshold = 200L;
        this.UNINITIALIZED_MIN_VAL = -9999L;
        this.isFirstFrameRendered = false;
        this.mT = -9999L;
        this.mTD = -9999L;
        this.mTn = -9999L;
        this.mTDn = -9999L;
        this.mResumeTs = -9999L;
        this.monitorNewStalled = false;
        this.mRenderStallStatInfoForFirstTime = "";
        this.mVideoCacheBytesInRendering = -1L;
        this.mVideoCacheFramesInRendering = -1L;
        this.mRequestBytesInRendering = -1L;
        this.mReceiveFramesInRendering = -1L;
        this.mHeartBeatIntervalForVod = -1;
        this.mHeartBeatIntervalForLive = -1;
        this.mUseEventId19997 = false;
        this.mHttpDnsOriginLock = new Object();
        this.mRtpBitrate = new StringBuilder(200);
        this.mSampleVideoLossRate = new StringBuilder(200);
        this.mSampleAudioLossRate = new StringBuilder(200);
        this.mPanoType = 0;
        this.mNetCounter = new AtomicInteger();
        this.mPlayerIndex = 0L;
        this.mCacheReason = 0;
        this.mUnuseProxyReason = 0;
        this.mEnableSyncAfterSeek = false;
        this.mAbIdOfSyncAfterSeek = -99;
        this.mMediaCodecInputErrorCode = 0;
        this.mMediaCodecOutputErrorCode = 0;
        this.mCurrentPageName = "";
        this.mIsPrerelease = false;
        this.mFromNotValid = false;
        this.mFrameInfoLevel = -1;
        this.mFrameInfoTop1Position = 0;
        this.mFrameInfoTop2Position = 0;
        this.mHeartBeatFPS = new StringBuilder(10);
        this.mHeartBeatDownloadFPS = new StringBuilder(10);
        this.mHeartBeatDecodeFPS = new StringBuilder(10);
        this.mHeartBeatNetSpeed = new StringBuilder(10);
        this.mDisableFixSeekCount = false;
        this.mEnableChangeCurPositionToVideoPosition = true;
        this.mIsPlayingFlv = false;
        this.mEnableDecodeAACDSE = false;
        this.mFirstRenderRecvTime = 0L;
        this.mRotate = 0;
        this.mH265AuthenStrategy = H265AuthenStrategy.WHITLIST;
        this.mH264AuthenStrategy = H264AuthenStrategy.WHITLIST;
        this.mAudioGainCoef = 1.0f;
        this.mEnableAudioGain = false;
        this.mLastRenderVideoEveryFrame = 0L;
        this.mMaxRenderAbnormalInRenderThread = 200;
        this.mEnableSeekFlushBuffer = true;
        this.mEnableAudioClip = false;
        this.mWarmupStartTime = 0L;
        this.mWarmupEndTime = 0L;
        this.mWarmupReceiveBytes = 0L;
        this.mOrangeForceStaticConfigVPMInfo = true;
        this.mWatchHandler = null;
        this.mWatchLastMessageTime = 0L;
        this.mWatchInterval = 0L;
        this.mWatchExceedThreshold = 0L;
        this.mMessageWasteExceedThreshold = 0;
        this.mWatchExceedTime1 = 0L;
        this.mWatchExceedNum1 = 0L;
        this.mWatchExceedTime2 = 0L;
        this.mWatchExceedNum2 = 0L;
        this.mWatchPhase = 0;
        this.mEnableWatch = false;
        this.mCodeClean = true;
        this.mWatchMinTime = 10L;
        this.mWatchLock = new Object();
        this.mEnableFixAbnormalStatForFirstRender = true;
        this.mEnableFixAbnormalStatForLoop = true;
        this.mDisablePullAudio = 0;
        this.mStreamSelectReasonList = new LinkedList<>();
        this.mIsDecoderLoaded = false;
        this.mMuteAudio = false;
        this.mPlayRate = 1.0f;
        this.mPlayInPIP = false;
        this.mTotalBgPlayTime = 0L;
        this.mLastBgPlayTime = 0L;
        this.mTotalFloatWindowsPlayTime = 0L;
        this.mLastFloatWindowsPlayTime = 0L;
        this.mTotalFloatWindowsCount = 0;
        this.mTotalBgCount = 0;
        this.mSwitchToBackKey = "smallWindow";
        this.mSwitchToFrontKey = "liveRoom";
        this.mMediaCodecErrorReason = 0;
        this.mMediaCodecProcessError = 0;
        this.mFirstSwitchDownReason = -1;
        this.mPlayingLiveDefinition = "";
        this.mSwitchTargetLiveDefinition = "";
        this.mArtcTraceDataIndex = 0;
        this.mRtcVideoFirstFrameTime = 0L;
        this.mRtcVideoFirstPacketTime = 0L;
        this.mRtcAudioFirstPacketTime = 0L;
        this.mAbnormalPlayDuration = 0L;
        this.mAbnormalPlayFrameCount = 0;
        this.mValidAbnormalFrameCount = 1;
        this.mAbnormalPlaySpeedThreshold = 0.2f;
        this.mCurrRenderingStatus = 0;
        this.mTotalQuickPlayTime = 0L;
        this.mTotalSlowPlayTime = 0L;
        this.mTotalQuickPlayFrameCount = 0L;
        this.mTotalSlowPlayFrameCount = 0L;
        this.mTotalQuickPlayTimeAll = 0L;
        this.mTotalSlowPlayTimeAll = 0L;
        this.mTotalQuickFrameCountAll = 0L;
        this.mTotalSlowFrameCountAll = 0L;
        this.mMaxPlayerInstanceCount = -1;
        this.mCalRenderStalledByDivided = false;
        this.seekTimeList = new LinkedList();
        this.maxSeekTime = -1L;
        this.mHasEverEnableBluetooth = false;
        this.mMuteStateNodes = new LinkedList();
        this.mVolumeStateNodes = new LinkedList();
        this.mAlwaysMutePlay = true;
        this.mIsPlayingWhenInvisible = false;
        this.mIsPlayingInBackground = false;
        this.mIsPlayingInBackgroundNew = false;
        this.mIsFirstRenderStalledPtsRecorded = false;
        this.mFirstRenderStalledPts = -1L;
        this.mCacheLengthAtStart = -1L;
        this.mVideoRenderingStalledCountNewUpdate = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r1 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r2 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r3 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r4 = 0L;
        this.mLastMonitorRenderSystemTime = 0L;
        this.mIsFirstFrameRenderedNewUpdate = false;
        this.mLastStalledFrameRenderSystemTime = -9999L;
        this.mLastStalledFrameFramePts = -9999L;
        this.mLastFrameRenderSystemTime = -9999L;
        this.mLastFramePts = -9999L;
        this.mResumeTsNew = -9999L;
        this.mDisorderFrameCountNew = 0L;
        this.mFrameCountInDelayState = 0L;
        this.mFrameCountRecoverInDelayState = 0L;
        this.mStalledCountInDelayState = 0L;
        this.mMaxStalledCountInDelay = 0L;
        this.mDelayTimeAtDelayBegin = 0L;
        this.mTotalDelayTime = 0L;
        this.mSystemTimeAtDelayBegin = 0L;
        this.mIsInDelayStallInterval = false;
        this.MIN_FRAME_COUNT_IN_DELAY_STATE = 10L;
        this.MIN_TIME_IN_DELAY_STATE = 500L;
        this.mEnableRenderStallCalNew = false;
        this.mHasUpdateSourceFps = false;
        this.mSourceFpsInterval = 0.0f;
        this.mMaxStalledCountInInterval = mto.a.GEO_NOT_SUPPORT;
        this.mMaxFpsAtStalledCal = 0.0f;
        this.calledReleaseBeforeCommitPlayex = false;
        this.index = 0;
        this.mContextRef = new WeakReference<>(context);
        WeakReference<Context> weakReference = this.mContextRef;
        context2 = weakReference != null ? weakReference.get() : context2;
        mGlogalPlayerIndex++;
        this.mPlayerIndex = mGlogalPlayerIndex;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", new player index=" + this.mPlayerIndex);
        if (context2 != null && context2.getApplicationContext() != null) {
            oyu.a((Application) context2.getApplicationContext());
        }
        this.mConfigAdapter = ddcVar;
        if (this.mHandler == null) {
            this.mHandler = Looper.myLooper() == Looper.getMainLooper() ? new Handler() : new Handler(Looper.getMainLooper());
        }
        if (this.mVideoResolutionPlayTimeMap == null) {
            this.mVideoResolutionPlayTimeMap = new HashMap();
        }
        if (this.mVideoResolutionRenderingStalledCountMap == null) {
            this.mVideoResolutionRenderingStalledCountMap = new HashMap();
        }
        if (context2 != null && context2.getApplicationContext() != null) {
            oyu.b((Application) context2.getApplicationContext());
            oyu.c(context2);
        }
        ddc ddcVar2 = this.mConfigAdapter;
        if (ddcVar2 != null) {
            this.mOrangeForceUseCache = com.taobao.taobaoavsdk.util.b.a(ddcVar2.getConfig("DWInteractive", MediaConstant.ORANGE_FORCE_USE_CACHE, "false"));
            this.mOrangeForceStaticConfigVPMInfo = com.taobao.taobaoavsdk.util.b.a(this.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_STATIC_CONFIG_VPM_INFO, "true"));
            this.mDisableSeparateSeekAbnormalTime = com.taobao.taobaoavsdk.util.b.a(this.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_SEEK_ABNORMAL_TIME, "false"));
            this.mUsePlayRateCalSubStall = com.taobao.taobaoavsdk.util.b.a(this.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_CALCULATE_STALL_WITH_RTC_PLAY_RATE, "true"));
            this.mSyncNotifyHttpDns = com.taobao.taobaoavsdk.util.b.a(this.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SYNC_NOTIFY_HTTP_DNS, "true"));
        }
        this.mValidAbnormalFrameCount = com.taobao.taobaoavsdk.util.b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_MIN_VALID_ABNORMAL_FRAME_COUNT, "1"));
        this.mAbnormalPlaySpeedThreshold = com.taobao.taobaoavsdk.util.b.d(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ABNORMAL_PLAY_SPEED_THRESHOLD, "0.2"));
        this.mEnableAddUnorderedStall = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_ADD_UNDORDERED_STALL, "true"));
        this.mIsPrerelease = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_IS_PRE_RELEASE, "false"));
        this.mFrameInfoLevel = com.taobao.taobaoavsdk.util.b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_FRAME_INFO_LEVEL, "-1"));
        this.mFrameInfoTop1Position = com.taobao.taobaoavsdk.util.b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_FRAME_INFO_LEVEL1, "0"));
        this.mFrameInfoTop2Position = com.taobao.taobaoavsdk.util.b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_FRAME_INFO_LEVEL2, "200"));
        this.mCalRenderStalledByDivided = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_CAL_RENDER_STALLED_NEW_BY_DIVIDED, "true"));
        this.mEnableRenderStallCalNew = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_ENABLE_RENDER_STALL_CAL_NEW, "true"));
        this.mCreateInBackground = oyu.a();
    }

    static /* synthetic */ long access$208(MonitorMediaPlayer monitorMediaPlayer) {
        long j = monitorMediaPlayer.mWatchExceedNum1;
        monitorMediaPlayer.mWatchExceedNum1 = 1 + j;
        return j;
    }

    static /* synthetic */ long access$408(MonitorMediaPlayer monitorMediaPlayer) {
        long j = monitorMediaPlayer.mWatchExceedNum2;
        monitorMediaPlayer.mWatchExceedNum2 = 1 + j;
        return j;
    }

    private void appendExtraQueryToPath(StringBuilder sb) {
        if (this.mConfig.ac > 0) {
            if (!StringUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("connTimeout=" + this.mConfig.ac);
        }
        if (this.mConfig.ad > 0) {
            if (!StringUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("readTimeout=" + this.mConfig.ad);
        }
        if (this.mConfig.ae > 0) {
            if (!StringUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("RetryTime=" + this.mConfig.ae);
        }
        String bizGroupCode = getBizGroupCode();
        if (!StringUtils.isEmpty(bizGroupCode)) {
            if (!StringUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("bizCode=" + bizGroupCode);
        }
        if (!StringUtils.isEmpty(this.mConfig.B)) {
            if (!StringUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("videoId=" + this.mConfig.B);
        }
        if (!StringUtils.isEmpty(this.mConfig.D)) {
            if (!StringUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("videoDefine=" + this.mConfig.D);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (com.taobao.taobaoavsdk.util.b.d(r6.mUsingInterface, r3) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkFromIsValid(com.taobao.taobaoavsdk.widget.media.c r7) {
        /*
            r6 = this;
            boolean r0 = r6.mIsPrerelease
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkFromIsValid sub_business_type="
            r0.append(r1)
            java.lang.String r1 = r7.y
            r0.append(r1)
            java.lang.String r1 = ", videoId="
            r0.append(r1)
            java.lang.String r1 = r7.B
            r0.append(r1)
            java.lang.String r1 = ", mUsingInterface="
            r0.append(r1)
            java.lang.String r1 = r7.as
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AVSDK"
            com.taobao.taobaoavsdk.AVSDKLog.e(r1, r0)
            r0 = 0
            r6.mFromNotValid = r0
            java.lang.String r0 = r7.y
            boolean r0 = android.text.StringUtils.isEmpty(r0)
            java.lang.String r1 = "DWInteractive"
            r2 = 1
            if (r0 != 0) goto L87
            java.lang.String r0 = r7.B
            boolean r0 = android.text.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L48
            goto L87
        L48:
            int r0 = r7.b
            r3 = 2
            if (r0 != r3) goto L89
            java.lang.String r0 = r7.W
            boolean r3 = android.text.StringUtils.isEmpty(r0)
            if (r3 == 0) goto L6c
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.aa
            if (r3 == 0) goto L6c
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.aa
            int r3 = r3.size()
            if (r3 <= 0) goto L6c
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.aa
            java.lang.String r3 = "vod_scenario"
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
        L6c:
            com.taobao.orange.OrangeConfig r3 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r4 = "ignoreToastListOfPlayScenes"
            java.lang.String r5 = "[\"MyTBVideoEmbedView\", \"WXInteractiveComponent\"]"
            java.lang.String r3 = r3.getConfig(r1, r4, r5)
            boolean r0 = android.text.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L89
            java.lang.String r0 = r6.mUsingInterface
            boolean r0 = com.taobao.taobaoavsdk.util.b.d(r0, r3)
            if (r0 != 0) goto L89
        L87:
            r6.mFromNotValid = r2
        L89:
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.mContextRef
            if (r0 != 0) goto L8f
            r0 = 0
            goto L95
        L8f:
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
        L95:
            boolean r3 = r6.mFromNotValid
            if (r3 == 0) goto La3
            java.lang.String r3 = "全场景videoId、bizCode/from与点播videoPlayScene不能为空，请联系播放器SDK同学获取值"
            android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r2)
            r3.show()
        La3:
            if (r7 == 0) goto Lc2
            java.lang.String r3 = r7.B
            boolean r3 = android.text.StringUtils.isEmpty(r3)
            if (r3 != 0) goto Lc2
            java.lang.String r7 = r7.B
            java.lang.String r3 = "http"
            boolean r7 = r7.startsWith(r3)
            if (r7 == 0) goto Lc2
            java.lang.String r7 = "请正确设置VideoId/FeedId（不要设置为url），有问题请联系播放器SDK同学"
            android.widget.Toast r7 = android.widget.Toast.makeText(r0, r7, r2)
            r7.show()
        Lc2:
            com.taobao.orange.OrangeConfig r7 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r0 = "msgWasteTimeThreshold"
            java.lang.String r2 = "10"
            java.lang.String r7 = r7.getConfig(r1, r0, r2)
            int r7 = com.taobao.taobaoavsdk.util.b.b(r7)
            r6.mMessageWasteExceedThreshold = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.checkFromIsValid(com.taobao.taobaoavsdk.widget.media.c):void");
    }

    private void colloectMoreRenderStallInfo() {
        i a2;
        if (this instanceof TaobaoMediaPlayer) {
            WeakReference<Context> weakReference = this.mContextRef;
            Context context = weakReference == null ? null : weakReference.get();
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this;
            this.mVideoCacheFramesInRendering = taobaoMediaPlayer._getPropertyLong(20009, -2L);
            this.mVideoCacheBytesInRendering = taobaoMediaPlayer._getPropertyLong(20007, -2L);
            if (!this.bUseVideoCache || this.bIsCompleteHitCache || (a2 = oyw.a(context)) == null) {
                return;
            }
            this.mReceiveFramesInRendering = a2.g(this.mPlayUrl);
            this.mRequestBytesInRendering = a2.h(this.mPlayUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void commitPlaying() {
        String host;
        String scheme;
        boolean z;
        boolean z2;
        double d;
        String str;
        String str2;
        Context context = null;
        HashMap hashMap = !this.mOrangeForceStaticConfigVPMInfo ? new HashMap() : null;
        if (this.mUTRun == null || StringUtils.isEmpty(this.mPlayUrl)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "can't commit player vpm info\n");
            return;
        }
        if (!(this.mConfig.b == 0 || (this.mConfig.b == 2 && this.mEnableVPM))) {
            return;
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        if (!StringUtils.isEmpty(currentPageName)) {
            this.mCurrentPageName = currentPageName;
        }
        synchronized (this.mLock) {
            double d2 = mto.a.GEO_NOT_SUPPORT;
            if (this.mLastCommitPlaying != 0) {
                d2 = (System.currentTimeMillis() - this.mLastCommitPlaying) / 1000.0d;
            }
            this.mLastCommitPlaying = System.currentTimeMillis();
            try {
                if (this.mContextRef != null) {
                    context = this.mContextRef.get();
                }
                if (context != null && MediaAdapteManager.mMediaNetworkUtilsAdapter != null) {
                    this.mLastIsConnected = f.b(MediaAdapteManager.mMediaNetworkUtilsAdapter, context) ? 1 : 0;
                }
                if (this instanceof TaobaoMediaPlayer) {
                    this.mServerIP = ((TaobaoMediaPlayer) this)._getPropertyString(21003);
                }
                Uri parse = Uri.parse(this.mPlayUrl);
                host = parse.getHost();
                scheme = parse.getScheme();
                z = this.mPreparedTime > 0;
                z2 = (this.mConfigClone.al || this.mConfigClone.ai) && this.mFirstEndtime <= 0;
            } catch (Throwable unused) {
            }
            if (hashMap != null) {
                hashMap.put("encode_type", String.valueOf(this.mEncodeType));
                hashMap.put("hbver", String.valueOf(1.2d));
                hashMap.put("host", host);
                hashMap.put("is_bg", String.valueOf(oyu.a() ? 1 : 0));
                hashMap.put("last_status", String.valueOf(this.mState));
                hashMap.put("last_status_en", getStateString());
                hashMap.put("source", String.valueOf(scheme));
                hashMap.put("vpm_algo_enabled", String.valueOf(isVPMAlgoEnabled() ? 1 : 0));
                hashMap.put("vpm_time_interval", String.format("%.2f", Double.valueOf(d2)));
                hashMap.put("is_last", String.valueOf(this.mExit ? 1 : 0));
                hashMap.put("is_prepared", String.valueOf(z ? 1 : 0));
                hashMap.put("is_preload", String.valueOf(z2 ? 1 : 0));
                hashMap.put("media_source_type", String.valueOf(this.mConfigClone.F));
                hashMap.put("video_renderer", getRenderType());
                hashMap.put("anchor_account_id", String.valueOf(this.mConfigClone.C));
                hashMap.put("switch_id", String.valueOf(this.mConfigClone.ap));
                hashMap.put("media_url", URLEncoder.encode(this.mPlayUrl, "utf-8"));
                hashMap.put("spm-cnt", this.mConfigClone.az);
                if (this instanceof TaobaoMediaPlayer) {
                    float _getPropertyFloat = ((TaobaoMediaPlayer) this)._getPropertyFloat(10003, 1.0f);
                    if (Math.abs(_getPropertyFloat - 1.0f) > 0.001d) {
                        hashMap.put("playrate", String.format("%.2f", Float.valueOf(_getPropertyFloat)));
                    }
                }
                StringBuffer stringBuffer = new StringBuffer();
                for (Map.Entry entry : hashMap.entrySet()) {
                    stringBuffer.append((String) entry.getKey());
                    stringBuffer.append("=");
                    stringBuffer.append((String) entry.getValue());
                    stringBuffer.append(",");
                }
                if (this.mEnableVPM) {
                    ((TaobaoMediaPlayer) this)._setPropertyString(21006, stringBuffer.toString());
                } else {
                    TBS.Adv.ctrlClicked("Page_Video", CT.Button, "Playing", stringBuffer.toString().split(","));
                }
                if (MediaSystemUtils.isApkDebuggable()) {
                    str = com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE;
                    str2 = "commit heartbeat play msg:" + stringBuffer.toString();
                    AVSDKLog.d(str, str2);
                }
                this.mBufferingHeartBeatCount = 0L;
                this.mBufferingHeartBeatTotalTime = 0L;
                this.mHeartBeatFPS.setLength(0);
                this.mHeartBeatDecodeFPS.setLength(0);
                this.mHeartBeatDownloadFPS.setLength(0);
                this.mHeartBeatNetSpeed.setLength(0);
                this.mBufferingHeartBeatMsg.setLength(0);
                this.mHeartBeatCount++;
                this.videoRenderingStalledCount_live = 0L;
                this.videoRenderingStalledTotalDuration_live = 0L;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("is_last=");
                sb.append(this.mExit ? 1 : 0);
                String sb2 = sb.toString();
                if (this instanceof TaobaoMediaPlayer) {
                    float _getPropertyFloat2 = ((TaobaoMediaPlayer) this)._getPropertyFloat(10003, 1.0f);
                    d = d2;
                    if (Math.abs(_getPropertyFloat2 - 1.0f) > 0.001d) {
                        sb2 = sb2 + ",playrate=" + String.format("%.2f", Float.valueOf(_getPropertyFloat2));
                    }
                } else {
                    d = d2;
                }
                if (this.mSeamlessSwitchIndex > 0) {
                    sb2 = (((((sb2 + ",switch_num=" + this.mSeamlessSwitchIndex) + ",switch_mode=" + this.mSeamlessSwitchMode) + ",seamless_switch_status=" + this.mSeamlessSwitchStatus) + ",seamless_switch_index=" + this.mSeamlessSwitchIndex) + ",seamless_switch_start_time=" + this.mSeamlessSwitchStartTime) + ",seamless_switch_end_time=" + this.mSeamlessSwitchEndTime;
                }
                String[] strArr = new String[28];
                strArr[0] = "anchor_account_id=" + this.mConfigClone.C;
                strArr[1] = "business_type=" + this.mConfigClone.x;
                strArr[2] = "encode_type=" + this.mEncodeType;
                strArr[3] = "feed_id=" + this.mConfigClone.B;
                strArr[4] = "hbver=1.2";
                strArr[5] = "host=" + host;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("is_bg=");
                sb3.append(oyu.a() ? 1 : 0);
                strArr[6] = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("is_prepared=");
                sb4.append(z ? 1 : 0);
                strArr[7] = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("is_preload=");
                sb5.append(z2 ? 1 : 0);
                strArr[8] = sb5.toString();
                strArr[9] = "last_status=" + this.mState;
                strArr[10] = "last_status_en=" + getStateString();
                strArr[11] = "media_source_type=" + this.mConfigClone.F;
                strArr[12] = "page_name=" + this.mCurrentPageName;
                strArr[13] = "play_scenario=" + this.mConfigClone.b;
                strArr[14] = "play_token=" + this.mConfigClone.t;
                strArr[15] = "source=" + scheme;
                strArr[16] = "server_ip=" + this.mServerIP;
                strArr[17] = "sub_business_type=" + this.mConfigClone.y;
                strArr[18] = "video_width=" + getVideoWidth();
                strArr[19] = "video_height=" + getVideoHeight();
                strArr[20] = "video_renderer=" + getRenderType();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("vpm_algo_enabled=");
                sb6.append(isVPMAlgoEnabled() ? 1 : 0);
                strArr[21] = sb6.toString();
                strArr[22] = "vpm_time_interval=" + String.format("%.2f", Double.valueOf(d));
                strArr[23] = "switch_id=" + this.mConfigClone.ap;
                strArr[24] = "media_url=" + URLEncoder.encode(this.mPlayUrl, "utf-8");
                strArr[25] = ",video_rendering_stalled_time_new=" + (this.videoRenderingStalledTotalDurationNew_43833053 - this.videoRenderingStalledTotalDurationNew_43833053_LastForVpm);
                strArr[26] = ",video_rendering_stalled_count_new=" + (this.videoRenderingStalledCountNew_43833053 - this.videoRenderingStalledCountNew_43833053_LastForVpm);
                strArr[27] = sb2;
                this.videoRenderingStalledTotalDurationNew_43833053_LastForVpm = this.videoRenderingStalledTotalDurationNew_43833053;
                this.videoRenderingStalledCountNew_43833053_LastForVpm = this.videoRenderingStalledCountNew_43833053;
                if (this.mEnableVPM) {
                    this.mPlayStatStaticValue = StringUtils.join(",", strArr);
                    ((TaobaoMediaPlayer) this)._setPropertyString(21006, this.mPlayStatStaticValue);
                } else {
                    TBS.Adv.ctrlClicked("Page_Video", CT.Button, "Playing", strArr);
                }
                if (MediaSystemUtils.isApkDebuggable()) {
                    str = com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE;
                    str2 = "commit heartbeat play msg:" + Arrays.toString(strArr);
                    AVSDKLog.d(str, str2);
                }
                this.mBufferingHeartBeatCount = 0L;
                this.mBufferingHeartBeatTotalTime = 0L;
                this.mHeartBeatFPS.setLength(0);
                this.mHeartBeatDecodeFPS.setLength(0);
                this.mHeartBeatDownloadFPS.setLength(0);
                this.mHeartBeatNetSpeed.setLength(0);
                this.mBufferingHeartBeatMsg.setLength(0);
                this.mHeartBeatCount++;
                this.videoRenderingStalledCount_live = 0L;
                this.videoRenderingStalledTotalDuration_live = 0L;
            }
        }
    }

    private void commitSeamlessSwitchStats(long j, long j2, boolean z) {
        if (this.mSeamlessSwitchIndex == 0 || !(this instanceof TaobaoMediaPlayer) || this.mSeamlessSwitchStartTime == 0) {
            return;
        }
        this.mSeamlessSwitchEndTime = System.currentTimeMillis();
        try {
            long _getPropertyLong = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_PTS_LATENCY_INIT, 0L);
            long _getPropertyLong2 = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_AVFORMAT_OPEN_TIME, 0L);
            long _getPropertyLong3 = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_FIND_STREAM_INFO_TIME, 0L);
            long _getPropertyLong4 = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_VIDEO_WIDTH, 0L);
            long _getPropertyLong5 = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_VIDEO_HEIGHT, 0L);
            long _getPropertyLong6 = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_READ_BYTES, 0L);
            String[] strArr = new String[21];
            strArr[0] = "page_name=" + l.getInstance().getCurrentPageName();
            strArr[1] = "play_token=" + this.mConfigClone.t;
            strArr[2] = "sub_business_type=" + this.mConfigClone.y;
            strArr[3] = "pts_latency_init=" + _getPropertyLong;
            strArr[4] = "error_code=" + j2;
            strArr[5] = "url=" + this.mSeamlessSwitchPath;
            strArr[6] = "mode=" + this.mSeamlessSwitchMode;
            strArr[7] = "index=" + this.mSeamlessSwitchIndex;
            StringBuilder sb = new StringBuilder();
            sb.append("forced=");
            sb.append(this.mSeamlessSwitchForcedly ? 1 : 0);
            strArr[8] = sb.toString();
            strArr[9] = "select_name=" + this.mSeamlessSwitchSelectName;
            strArr[10] = "switch_time=" + (this.mSeamlessSwitchEndTime - this.mSeamlessSwitchStartTime);
            strArr[11] = "open_time=" + _getPropertyLong2;
            strArr[12] = "find_stream_time=" + _getPropertyLong3;
            strArr[13] = HttpConstant.RANGE_PRE + _getPropertyLong6;
            strArr[14] = "seamless_switch_status=" + this.mSeamlessSwitchStatus;
            strArr[15] = "width=" + _getPropertyLong4;
            strArr[16] = "height=" + _getPropertyLong5;
            strArr[17] = "anchor_account_id=" + this.mConfigClone.C;
            strArr[18] = "feed_id=" + this.mConfigClone.B;
            strArr[19] = "switch_id=" + this.mConfigClone.ap;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("force=");
            sb2.append(z ? 1 : 0);
            strArr[20] = sb2.toString();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "TaobaoMediaPlayer:" + this + " commitSeamlessSwitchStats: " + StringUtils.join(",", strArr));
            TBS.Adv.ctrlClicked("Page_Video", CT.Button, "SeamLessSwitchVideo", strArr);
            commitPlaying();
        } catch (Throwable unused) {
        }
        this.mSeamlessSwitchStartTime = 0L;
    }

    private void commitStat19997(String str, CT ct, String str2, String... strArr) {
        if (!this.mUseEventId19997) {
            TBS.Adv.ctrlClicked(str, ct, str2, strArr);
            return;
        }
        TBS.Ext.commitEvent(str, 19997, str + "_Button-" + str2, "", "", strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.HashMap<java.lang.String, java.lang.String> getBaseDimensionValues() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.getBaseDimensionValues():java.util.HashMap");
    }

    private int getCdnCacheValue(Map<String, String> map) {
        if (map != null) {
            String str = map.get(HttpConstant.X_CACHE);
            if (!StringUtils.isEmpty(str)) {
                if (str.startsWith("HIT")) {
                    return 1;
                }
                if (str.startsWith("MISS")) {
                    return 0;
                }
            }
        }
        return -1;
    }

    private long getColorPrimaries() {
        if (this instanceof TaobaoMediaPlayer) {
            return ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_COLOR_PRIMARIES, -1L);
        }
        return -1L;
    }

    private long getColorRange() {
        if (this instanceof TaobaoMediaPlayer) {
            return ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_COLOR_RANGE, -1L);
        }
        return -1L;
    }

    private long getColorSpace() {
        if (this instanceof TaobaoMediaPlayer) {
            return ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_COLOR_SPACE, -1L);
        }
        return -1L;
    }

    private String getGrtnDelayUrlParams() {
        long a2 = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter, "tblivertc", this.mConfig.x, this.mConfig.y);
        if (a2 >= 10 && a2 <= 10000) {
            long c = com.taobao.taobaoavsdk.util.b.c(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "GrtnMaxDelayMs", "6000"));
            if (c >= a2 && c <= 30000) {
                return StringUtils.join("&", new String[]{"rtc_delay=" + a2, "mbdfu=" + c, "max_delay=" + c, "pidm=0"});
            }
        }
        return null;
    }

    private static boolean getHDRSupportInfo(Context context) {
        if (!isGetHdrResult && context != null) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    bSupportHDR = context.getResources().getConfiguration().isScreenWideColorGamut();
                    isGetHdrResult = true;
                }
            } catch (Exception e) {
                AVSDKLog.e("AVDSK", "can't get screen wide color gamnut info " + e.getMessage());
            }
            return bSupportHDR;
        }
        return bSupportHDR;
    }

    private String getHttpDnsOriginIP(String str, boolean z) {
        synchronized (this.mHttpDnsOriginLock) {
            this.mHttpDnsOrigin = f.b(str, z);
            if (this.mHttpDnsOrigin != null) {
                return this.mHttpDnsOrigin.getOriginIP();
            }
            return null;
        }
    }

    private int getLastStreamSelectReason() {
        Integer last;
        if (this.mStreamSelectReasonList.isEmpty()) {
            return -1;
        }
        int i = this.mLastErrorCode;
        if (i == 0 || i != -10900) {
            last = this.mStreamSelectReasonList.getLast();
        } else if (this.mStreamSelectReasonList.size() <= 1) {
            return -1;
        } else {
            last = this.mStreamSelectReasonList.getFirst();
        }
        return last.intValue();
    }

    private static String getMobileOutputSamplerRate(Context context) {
        if (context == null) {
            return "";
        }
        if (!StringUtils.isEmpty(mOutputSampleRate)) {
            return mOutputSampleRate;
        }
        try {
            mOutputSampleRate = ((AudioManager) context.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        } catch (Exception unused) {
        }
        return mOutputSampleRate;
    }

    private String getPlayerEvent() {
        StringBuilder sb = new StringBuilder(50);
        for (int i = 0; i < this.mPlayerEventList.size(); i++) {
            if (i != 0) {
                sb.append("_");
            }
            int intValue = this.mPlayerEventList.get(i).intValue();
            if (intValue != 40 || !(this instanceof TaobaoMediaPlayer)) {
                sb.append(intValue);
            } else {
                sb.append(intValue + riy.BRACKET_START_STR + TaobaoMediaPlayer._getLastCdnPlayingSpeedNodesStr() + riy.BRACKET_END_STR);
            }
        }
        AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getPlayerEvent size is :" + sb.length());
        return sb.toString();
    }

    public static String getProxyVideoUrl(Context context, com.taobao.taobaoavsdk.widget.media.c cVar, String str) {
        if (context != null && cVar != null) {
            try {
                if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(cVar.r) && !str.contains(".m3u8") && str.startsWith("http")) {
                    StringBuilder sb = new StringBuilder(100);
                    if (!StringUtils.isEmpty(cVar.t)) {
                        if (!StringUtils.isEmpty(sb)) {
                            sb.append("&");
                        }
                        sb.append("playTokenId=" + cVar.t);
                    }
                    if (!StringUtils.isEmpty(cVar.r)) {
                        if (!StringUtils.isEmpty(sb)) {
                            sb.append("&");
                        }
                        sb.append("videoCacheId=" + cVar.r);
                    }
                    String a2 = com.taobao.taobaoavsdk.util.b.a(str, sb);
                    if (cVar.o) {
                        StringBuilder sb2 = new StringBuilder(20);
                        sb2.append("useTBNetProxy=" + cVar.o);
                        a2 = com.taobao.taobaoavsdk.util.b.a(a2, sb2);
                    }
                    return oyw.a(context).c(a2);
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private String getRenderType() {
        if (!(this instanceof TaobaoMediaPlayer)) {
            return this instanceof NativeMediaPlayer ? "native-player" : "unknown";
        }
        TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this;
        long _getPropertyLong = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_DECODER_TYPE, 0L);
        if (_getPropertyLong == 32) {
            return "mediacodec";
        }
        if (_getPropertyLong == 64) {
            return "mediacodec_egl";
        }
        long _getPropertyLong2 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_RENDERER_TYPE, 0L);
        return _getPropertyLong2 == 4 ? UltronTradeHybridInstanceRenderMode.SURFACE : _getPropertyLong2 == 8 ? "egl" : "unknown";
    }

    private String getRtcLiveAbrReason() {
        StringBuilder sb = new StringBuilder(20);
        for (int i = 0; i < this.mRtcLiveAbrReasonList.size(); i++) {
            if (i != 0) {
                sb.append("_");
            }
            sb.append(this.mRtcLiveAbrReasonList.get(i).intValue());
        }
        AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getRtcLiveAbrReason size is :" + sb.length());
        return sb.toString();
    }

    private String getRtcSfuIP() {
        if (this instanceof TaobaoMediaPlayer) {
            return ((TaobaoMediaPlayer) this)._getPropertyString(21003);
        }
        return null;
    }

    private String getStateNodes(List<Integer> list) {
        StringBuilder sb = new StringBuilder(20);
        for (int i = 0; i < list.size() - 1; i++) {
            sb.append(list.get(i) + "_");
        }
        if (list.size() > 0) {
            sb.append(list.get(list.size() - 1));
        }
        AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getStateNodes size is :" + sb.length());
        return sb.toString();
    }

    private String getStateString() {
        int i = this.mState;
        if (i != 35) {
            switch (i) {
                case 1:
                    return "prepared";
                case 2:
                    return "start";
                case 3:
                    return "paused";
                case 4:
                    return MornitorBufferingNew;
                case 5:
                    return "seek";
                case 6:
                    return "ended";
                case 7:
                    return "error";
                case 8:
                    return "first_render";
                case 9:
                    return "render_stalled";
                case 10:
                    return AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING;
                default:
                    return "no-name";
            }
        }
        return "codec_param_changed";
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean getUrlCacheConfig(java.lang.String r12, java.lang.String r13, java.lang.Integer[] r14, java.util.List<java.lang.String> r15) {
        /*
            r11 = this;
            java.lang.String r0 = "AVSDK"
            boolean r1 = android.text.StringUtils.isEmpty(r12)
            r2 = 1
            r3 = 0
            com.alibaba.fastjson.JSONArray r13 = com.alibaba.fastjson.JSON.parseArray(r13)     // Catch: java.lang.Throwable -> Lbd
            r4 = 0
            r5 = 0
            r6 = 0
        Lf:
            int r7 = r13.size()     // Catch: java.lang.Throwable -> Lbd
            if (r4 >= r7) goto La7
            java.lang.Object r5 = r13.get(r4)     // Catch: java.lang.Throwable -> Lbd
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r6 = "business"
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r7 = "checkMp4"
            java.lang.Integer r7 = r5.getInteger(r7)     // Catch: java.lang.Throwable -> Lbd
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r8 = "cacheKeyMode"
            java.lang.Integer r8 = r5.getInteger(r8)     // Catch: java.lang.Throwable -> Lbd
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r9 = "*"
            boolean r9 = r9.equals(r6)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r10 = "ignoreParams"
            if (r9 == 0) goto L5b
            com.alibaba.fastjson.JSONArray r12 = r5.getJSONArray(r10)     // Catch: java.lang.Throwable -> L57
            r13 = 0
        L45:
            int r15 = r12.size()     // Catch: java.lang.Throwable -> L57
            if (r13 >= r15) goto L55
            java.lang.Object r15 = r12.get(r13)     // Catch: java.lang.Throwable -> L57
            r12.add(r15)     // Catch: java.lang.Throwable -> L57
            int r13 = r13 + 1
            goto L45
        L55:
            r12 = 1
            goto Laa
        L57:
            r12 = move-exception
            r3 = 1
            goto Lbe
        L5b:
            if (r1 != 0) goto La1
            java.lang.String r9 = "TRIVER_*"
            boolean r9 = r9.equals(r6)     // Catch: java.lang.Throwable -> Lbd
            if (r9 == 0) goto L6d
            java.lang.String r9 = "TRIVER_"
            boolean r9 = r12.startsWith(r9)     // Catch: java.lang.Throwable -> Lbd
            if (r9 != 0) goto L83
        L6d:
            java.lang.String r9 = "SPM_*"
            boolean r9 = r9.equals(r6)     // Catch: java.lang.Throwable -> Lbd
            if (r9 == 0) goto L7d
            java.lang.String r9 = "SPM_"
            boolean r9 = r12.startsWith(r9)     // Catch: java.lang.Throwable -> Lbd
            if (r9 != 0) goto L83
        L7d:
            boolean r6 = r6.equals(r12)     // Catch: java.lang.Throwable -> Lbd
            if (r6 == 0) goto La1
        L83:
            com.alibaba.fastjson.JSONArray r12 = r5.getJSONArray(r10)     // Catch: java.lang.Throwable -> L57
            if (r12 != 0) goto L90
            java.lang.String r12 = "ignoreParams is null"
            com.taobao.taobaoavsdk.AVSDKLog.e(r0, r12)     // Catch: java.lang.Throwable -> L57
            goto L55
        L90:
            r13 = 0
        L91:
            int r1 = r12.size()     // Catch: java.lang.Throwable -> L57
            if (r13 >= r1) goto L55
            java.lang.String r1 = r12.getString(r13)     // Catch: java.lang.Throwable -> L57
            r15.add(r1)     // Catch: java.lang.Throwable -> L57
            int r13 = r13 + 1
            goto L91
        La1:
            int r4 = r4 + 1
            r5 = r7
            r6 = r8
            goto Lf
        La7:
            r7 = r5
            r8 = r6
            r12 = 0
        Laa:
            if (r12 == 0) goto Ld8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lb9
            r14[r3] = r13     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lb9
            r14[r2] = r13     // Catch: java.lang.Throwable -> Lb9
            goto Ld8
        Lb9:
            r13 = move-exception
            r3 = r12
            r12 = r13
            goto Lbe
        Lbd:
            r12 = move-exception
        Lbe:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "getUrlCacheConfig error "
            r13.append(r14)
            java.lang.String r12 = r12.toString()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r0, r12)
            r12 = r3
        Ld8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.getUrlCacheConfig(java.lang.String, java.lang.String, java.lang.Integer[], java.util.List):boolean");
    }

    private String getVPMSummary() {
        StringBuilder sb = new StringBuilder(400);
        sb.append("play_token=");
        sb.append(this.mConfigClone.t);
        sb.append(",");
        sb.append("feed_id=");
        sb.append(this.mConfigClone.B);
        sb.append(",");
        sb.append("sub_business_type=");
        sb.append(this.mConfigClone.y);
        sb.append(",");
        sb.append("play_scenario=");
        sb.append(this.mConfigClone.b);
        sb.append(",");
        sb.append("quit_time=");
        sb.append(System.currentTimeMillis() - this.mPrepareStartTime);
        sb.append(",");
        sb.append("error_code=");
        sb.append(this.mLastErrorCode);
        sb.append(",");
        sb.append("first_frame_rendering_time=");
        sb.append(this.mFirstRenderTime);
        sb.append(",");
        sb.append("abnormal_total_time_new=");
        sb.append(this.mBufferingTotalTimeNew);
        sb.append(",");
        sb.append("play_time=");
        sb.append(this.mTotalPlayTime);
        sb.append(",");
        sb.append("vod_scenario=");
        sb.append(this.mConfigClone.W);
        sb.append(",");
        sb.append("video_width=");
        sb.append(getVideoWidth());
        sb.append(",");
        sb.append("video_height=");
        sb.append(getVideoHeight());
        sb.append(",");
        AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getVPMSummary size is :" + sb.length());
        return sb.toString();
    }

    private String getVolumeStateNodes() {
        StringBuilder sb = new StringBuilder(50);
        for (int i = 0; i < this.mVolumeStateNodes.size() - 1; i++) {
            sb.append(String.format("%.2f", this.mVolumeStateNodes.get(i)) + "_");
        }
        if (this.mVolumeStateNodes.size() > 0) {
            List<Float> list = this.mVolumeStateNodes;
            sb.append(list.get(list.size() - 1));
        }
        AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getVolumeStateNodes size is :" + sb.length());
        return sb.toString();
    }

    private void heartBeatMonitorStart() {
        synchronized (this.mLock) {
            if (this.mHandler != null && this.mHeartBeatInterval > -1 && this.mUTRun == null) {
                this.mUTRun = new Runnable() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MonitorMediaPlayer.this.commitPlaying();
                        if (MonitorMediaPlayer.this.mHandler != null) {
                            MonitorMediaPlayer.this.mHandler.postDelayed(MonitorMediaPlayer.this.mUTRun, MonitorMediaPlayer.this.mHeartBeatInterval);
                        }
                    }
                };
                if (getCommitFirstHeartBeat()) {
                    commitPlaying();
                }
                this.mLastCommitPlaying = System.currentTimeMillis();
                this.mHandler.postDelayed(this.mUTRun, this.mHeartBeatInterval);
            }
        }
    }

    private void initWatchHandler() {
        if (!this.mEnableWatch || this.mWatchHandler != null || this.mWatchExceedThreshold <= 10 || this.mWatchInterval <= 10) {
            return;
        }
        this.mWatchPhase = 1;
        this.mWatchHandler = new Handler() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 100) {
                    return;
                }
                if (MonitorMediaPlayer.this.mWatchLastMessageTime > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - MonitorMediaPlayer.this.mWatchLastMessageTime;
                    if (currentTimeMillis > MonitorMediaPlayer.this.mWatchExceedThreshold) {
                        long j = currentTimeMillis - MonitorMediaPlayer.this.mWatchInterval;
                        if (MonitorMediaPlayer.this.mWatchPhase == 1) {
                            MonitorMediaPlayer.this.mWatchExceedTime1 += j;
                            MonitorMediaPlayer.access$208(MonitorMediaPlayer.this);
                        } else if (MonitorMediaPlayer.this.mWatchPhase == 2) {
                            MonitorMediaPlayer.this.mWatchExceedTime2 += j;
                            MonitorMediaPlayer.access$408(MonitorMediaPlayer.this);
                        }
                    }
                }
                MonitorMediaPlayer.this.sendWatchMessage();
            }
        };
        sendWatchMessage();
    }

    private void monitorPlayerEvent(int i) {
        try {
            this.mState = i;
            if (i == 2) {
                this.mLastPlayTime = System.currentTimeMillis();
                if (this.mIsBackground) {
                    this.mLastPlayTimeInBackground = this.mLastPlayTime;
                }
                updateVideoResolutionInfoForStart();
                removeWatchMessage();
                sendWatchMessage();
                setMessageLogging();
            } else if (this.mLastPlayTime > 0 && (i == 6 || i == 7 || i == 3)) {
                computePlayTimeForRtcSwitch();
                updateVideoResolutionInfoForEnd();
                removeWatchMessage();
                resetMessageLogging();
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "monitorPlayerEvent " + i + ":" + getStateString());
            this.mPlayerEventList.offer(Integer.valueOf(i));
            if (this.mPlayerEventList.size() > 30) {
                this.mPlayerEventList.poll();
            }
            if (this.mPlayerEventListener == null) {
                return;
            }
            for (IMediaPlayer.OnPlayerEventListener onPlayerEventListener : this.mPlayerEventListener) {
                onPlayerEventListener.onEvent(this, i);
            }
        } catch (Exception unused) {
        }
    }

    private void monitorVideoRenderEveryFrameOld(long j) {
        long j2 = this.mLastRenderVideoEveryFrame;
        if (j2 > 0) {
            long j3 = j - j2;
            if (j3 > this.mMaxRenderAbnormalInRenderThread) {
                this.videoRenderingStalledCountInRenderThread++;
                this.videoRenderingStalledTotalDurationInRenderThread += j3;
            }
        }
        this.mLastRenderVideoEveryFrame = j;
    }

    private void registerMonitor() {
        try {
            if (StringUtils.isEmpty(this.AppMonitor_Module)) {
                return;
            }
            DimensionSet create = DimensionSet.create();
            create.addDimension("player_type", "");
            create.addDimension("media_url", "");
            create.addDimension("server_ip", "");
            create.addDimension("local_ip", "");
            create.addDimension("feed_id", "");
            create.addDimension("anchor_account_id", "");
            create.addDimension("user_id", "");
            create.addDimension("play_scenario", "");
            create.addDimension("error_code", "");
            create.addDimension("video_width", "");
            create.addDimension("video_height", "");
            create.addDimension("encode_type", "");
            create.addDimension("screen_size", "");
            create.addDimension("video_definition", "");
            create.addDimension("route_nodes", "");
            create.addDimension(d.BUNDLE_BUSINESS_TYPE, "");
            create.addDimension(snv.EXP_KEY_SUB_BUSINESS_TYPE, "");
            create.addDimension("player_status_nodes", "");
            create.addDimension("video_duration", "");
            create.addDimension("extra", "");
            create.addDimension("page_url", "");
            MeasureSet create2 = MeasureSet.create();
            Measure measure = new Measure("buffering_start_time");
            measure.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure2 = new Measure("buffering_end_time");
            measure2.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure3 = new Measure("buffering_duration");
            measure3.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(10000.0d));
            Measure measure4 = new Measure("buffering_interval");
            measure4.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure5 = new Measure("video_decode_fps");
            measure5.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure6 = new Measure("video_cache");
            measure6.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure7 = new Measure("audio_cache");
            measure7.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            create2.addMeasure(measure);
            create2.addMeasure(measure2);
            create2.addMeasure(measure3);
            create2.addMeasure(measure4);
            create2.addMeasure(measure5);
            create2.addMeasure(measure6);
            create2.addMeasure(measure7);
            AppMonitor.register(this.AppMonitor_Module, MornitorBufferingNew, create2, create);
            MeasureSet create3 = MeasureSet.create();
            Measure measure8 = new Measure("time_stamp");
            measure8.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure9 = new Measure("is_connected");
            measure9.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure10 = new Measure("is_tbnet");
            measure10.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure11 = new Measure("hardware_hevc");
            measure11.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure12 = new Measure("hardware_avc");
            Measure measure13 = new Measure("is_usecache");
            measure13.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            measure12.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure14 = new Measure("video_interval_bit_rate");
            measure14.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            Measure measure15 = new Measure("cur_position");
            measure15.setRange(Double.valueOf((double) mto.a.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
            create3.addMeasure(measure8);
            create3.addMeasure(measure9);
            create3.addMeasure(measure14);
            create3.addMeasure(measure15);
            create3.addMeasure(measure10);
            create3.addMeasure(measure11);
            create3.addMeasure(measure12);
            create3.addMeasure(measure13);
            AppMonitor.register(this.AppMonitor_Module, "playerError", create3, create);
        } catch (Throwable unused) {
        }
    }

    private void releaseWatchHandler() {
        synchronized (this.mWatchLock) {
            if (this.mWatchHandler != null) {
                this.mWatchHandler.removeMessages(100);
                this.mWatchHandler = null;
            }
        }
    }

    private void removeWatchMessage() {
        synchronized (this.mWatchLock) {
            if (this.mWatchHandler != null) {
                this.mWatchHandler.removeMessages(100);
            }
        }
    }

    private void resetMessageLogging() {
        if (!this.mIsPrerelease || !mHasSetLogPrinter) {
            return;
        }
        mHasSetLogPrinter = false;
        Looper.myLooper().setMessageLogging(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWatchMessage() {
        synchronized (this.mWatchLock) {
            if (this.mWatchHandler != null) {
                this.mWatchLastMessageTime = System.currentTimeMillis();
                this.mWatchHandler.sendEmptyMessageDelayed(100, this.mWatchInterval);
            }
        }
    }

    private void setMessageLogging() {
        if (!this.mIsPrerelease || mHasSetLogPrinter) {
            return;
        }
        mHasSetLogPrinter = true;
        Looper.myLooper().setMessageLogging(new LogPrinter(1, com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE) { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.2
            long startTime = 0;

            @Override // android.util.LogPrinter, android.util.Printer
            public void println(String str) {
                if (StringUtils.isEmpty(str)) {
                    return;
                }
                if (str.startsWith(">>>>> Dispatching to")) {
                    this.startTime = System.currentTimeMillis();
                } else if (!str.startsWith("<<<<< Finished to")) {
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - this.startTime;
                    if (currentTimeMillis <= MonitorMediaPlayer.this.mMessageWasteExceedThreshold) {
                        return;
                    }
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "the message waste " + currentTimeMillis + ", and message is that " + str);
                }
            }
        });
    }

    private void setUseLocalHostUrl() {
        if (this instanceof TaobaoMediaPlayer) {
            ((TaobaoMediaPlayer) this)._setPropertyLong(FFP_PROP_INT64_IS_LOCALHOST, 1L);
        }
    }

    private int unUseProxyReason() {
        if (this.mConfig == null) {
            return 2;
        }
        if (this.mConfig.b == 2) {
            return 3;
        }
        if (this.mPlayUrl == null) {
            return 4;
        }
        if (this.mPlayUrl.contains(".m3u8")) {
            return 5;
        }
        return !this.mPlayUrl.startsWith("http") ? 6 : 0;
    }

    private boolean useCache() {
        String str;
        String str2;
        if (this.mConfig == null || this.mConfig.b != 2 || StringUtils.isEmpty(this.mConfig.r) || this.mPlayUrl == null || this.mPlayUrl.contains(".m3u8") || !this.mPlayUrl.startsWith("http")) {
            if (this.mConfig == null) {
                str = "useCache false for null config";
            } else {
                str = "useCache false for type=" + this.mConfig.b + ", cacheKey=" + this.mConfig.r;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, str);
            return false;
        }
        ddc ddcVar = this.mConfigAdapter;
        String str3 = "true";
        if (ddcVar != null) {
            str3 = ddcVar.getConfig(this.mConfig.q, VIDEO_CACHE_ENABLE, str3);
        }
        boolean a2 = com.taobao.taobaoavsdk.util.b.a(str3);
        if (!a2) {
            str2 = "useCache false for orange";
        } else if (this.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.b(this.mConfig.y, this.mConfigAdapter.getConfig(this.mConfig.q, VIDEO_CACHE_BLACK, ""))) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("useCache false for mSubBusinessType=");
            sb.append(this.mConfigAdapter != null ? this.mConfig.y : "NullConfig");
            str2 = sb.toString();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, str2);
        return a2;
    }

    private boolean useUrlAudioCache() {
        String str;
        if (this.mConfig == null || !this.mConfig.ah || !this.mConfig.at || StringUtils.isEmpty(this.mPlayUrl)) {
            return false;
        }
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MUSIC_URL_CACHE_ENABLE_FORCE, "true")) && this.mConfig.ah) {
            this.mCheckMp4PatternWhenUseUrlCache = 1;
            int b = com.taobao.taobaoavsdk.util.b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MUSIC_URL_CACHE_PATTERN, "1"));
            if (b == 1 || b == 2) {
                this.mCheckMp4PatternWhenUseUrlCache = b;
            }
            return true;
        }
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", MUSIC_URL_CACHE_CONFIG, "");
        Integer[] numArr = {1, 1};
        LinkedList linkedList = new LinkedList();
        boolean urlCacheConfig = getUrlCacheConfig(this.mConfig.y, config, numArr, linkedList);
        if (urlCacheConfig) {
            this.mIgnoreParamListWhenGenerateCacheKeyMode.clear();
            boolean c = com.taobao.taobaoavsdk.util.b.c(this.mConfig.y, this.mConfigAdapter.getConfig("DWInteractive", MUSIC_URL_CACHE_BLACK_BIZCODE, ""));
            boolean c2 = com.taobao.taobaoavsdk.util.b.c(this.mConfig.y, this.mConfigAdapter.getConfig("DWInteractive", MUSIC_URL_CACHE_BLACK_URL, ""));
            if (c || c2) {
                str = "useUrlCache false for matching black list";
            } else {
                this.mCheckMp4PatternWhenUseUrlCache = numArr[0].intValue();
                if (1 != this.mCheckMp4PatternWhenUseUrlCache || this.mPlayUrl.contains(keu.SUFFIX_MP4)) {
                    this.mGenerateCacheKeyModeWhenUseUrlCache = numArr[1].intValue();
                    if (this.mGenerateCacheKeyModeWhenUseUrlCache == 1 && linkedList.size() > 0) {
                        this.mIgnoreParamListWhenGenerateCacheKeyMode.addAll(linkedList);
                    }
                } else {
                    str = "useUrlCache false for matching not mp4.";
                }
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, str);
            return false;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "useUrlCache false for not in white list");
        return urlCacheConfig;
    }

    private boolean useUrlCache() {
        String str;
        String str2;
        if (this.mConfig == null || this.mConfig.b != 2 || this.mConfigAdapter == null || this.mPlayUrl == null || this.mPlayUrl.contains(".m3u8") || !this.mPlayUrl.startsWith("http")) {
            if (this.mConfig == null) {
                str = "useUrlCache false for null config";
            } else {
                str = "useUrlCache false for type=" + this.mConfig.b;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, str);
            return false;
        }
        String config = this.mConfigAdapter.getConfig("DWInteractive", VIDEO_URL_CACHE_CONFIG, "");
        Integer[] numArr = {1, 1};
        LinkedList linkedList = new LinkedList();
        boolean urlCacheConfig = getUrlCacheConfig(this.mConfig.y, config, numArr, linkedList);
        if (urlCacheConfig) {
            this.mIgnoreParamListWhenGenerateCacheKeyMode.clear();
            boolean c = com.taobao.taobaoavsdk.util.b.c(this.mConfig.y, this.mConfigAdapter.getConfig("DWInteractive", VIDEO_URL_CACHE_BLACK_BIZCODE, ""));
            boolean c2 = com.taobao.taobaoavsdk.util.b.c(this.mConfig.y, this.mConfigAdapter.getConfig("DWInteractive", VIDEO_URL_CACHE_BLACK_URL, ""));
            if (c || c2) {
                str2 = "useUrlCache false for matching black list";
            } else {
                this.mCheckMp4PatternWhenUseUrlCache = numArr[0].intValue();
                if (1 != this.mCheckMp4PatternWhenUseUrlCache || this.mPlayUrl.contains(keu.SUFFIX_MP4)) {
                    this.mGenerateCacheKeyModeWhenUseUrlCache = numArr[1].intValue();
                    if (this.mGenerateCacheKeyModeWhenUseUrlCache == 1 && linkedList.size() > 0) {
                        this.mIgnoreParamListWhenGenerateCacheKeyMode.addAll(linkedList);
                    }
                } else {
                    str2 = "useUrlCache false for matching not mp4.";
                }
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, str2);
            return false;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "useUrlCache false for not in white list");
        return urlCacheConfig;
    }

    public void artpEndtoEndDelayMsg(String str) {
        this.end2endDelay = str;
    }

    protected void changeToBackground(String str, boolean z) {
        if (this.mIsBackground == z) {
            return;
        }
        this.mIsBackground = z;
        checkStatRenderStallFlag();
        if (!this.mIsBackground) {
            return;
        }
        if (!isPlaying()) {
            if (this.mLastPlayTimeInBackground <= 0) {
                return;
            }
            this.mPlayTimeInBackground += System.currentTimeMillis() - this.mLastPlayTimeInBackground;
            this.mLastPlayTimeInBackground = 0L;
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "checkInvisible/BG playing:sbt=" + this.mConfig.y + "," + this + " still playing when changeToBackground");
        this.mIsPlayingInBackground = true;
        if ("NOTIFY_FOR_IN_BACKGROUND".equals(str)) {
            this.mIsPlayingInBackgroundNew = true;
        }
        if (this.bPauseInBackground || (this.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.b(this.mConfig.y, this.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_SHOULD_PAUSE_IN_BACKGROUND_SBT, "")))) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "yezo:pause in onMediaPrepared");
            pause();
        }
        if (this.mLastPlayTime <= 0) {
            return;
        }
        this.mLastPlayTimeInBackground = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void checkStatRenderStallFlag() {
        long j = 0;
        boolean z = this.mSurface != null && !this.bPaused && this.mSeekStart <= 0 && this.mLastErrorCode == 0 && (!this.mIsBackground || this.mIsFloatWindow) && (this.mEnableStatRenderStallInNonVisible || this.mViewIsVisible);
        if (this.mShouldStatRenderStallInNative != z) {
            this.mShouldStatRenderStallInNative = z;
            if (!(this instanceof TaobaoMediaPlayer)) {
                return;
            }
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this;
            if (this.mShouldStatRenderStallInNative) {
                j = 1;
            }
            taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_EXTEND_SHOULD_STAT_RENDER_STALL, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void computePlayTimeForRtcSwitch() {
        synchronized (this.mTimeLock) {
            if (this.mLastPlayTime > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.mLastPlayTime;
                if (currentTimeMillis > 0) {
                    this.mTotalPlayTime += currentTimeMillis;
                    this.mLastPlayTime = 0L;
                    if (this.mLastPlayTimeInBackground > 0) {
                        this.mPlayTimeInBackground += System.currentTimeMillis() - this.mLastPlayTimeInBackground;
                        this.mLastPlayTimeInBackground = 0L;
                    }
                    if (!"ud".equals(this.mPlayingLiveDefinition) && !MediaConstant.DEFINITION_UD_60.equals(this.mPlayingLiveDefinition)) {
                        if ("hd".equals(this.mPlayingLiveDefinition) || MediaConstant.DEFINITION_HD_60.equals(this.mPlayingLiveDefinition)) {
                            this.mPlayTimeHd += currentTimeMillis;
                        }
                    }
                    this.mPlayTimeUd += currentTimeMillis;
                }
            }
        }
    }

    public boolean getAutoPause() {
        return this.pauseByTelephone;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getBizGroupCode() {
        if (this.mConfigClone == null || this.mConfigClone.ab == null) {
            return null;
        }
        String str = this.mConfigClone.ab.get("bizGroup");
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        String str2 = (this.mConfigClone.aa == null || this.mConfigClone.aa.size() <= 0) ? "" : this.mConfigClone.aa.get("vod_scenario");
        if (StringUtils.isEmpty(str2)) {
            return this.mConfigClone.y;
        }
        return this.mConfigClone.y + "_" + str2;
    }

    protected String getCdnIp() {
        try {
            Context context = this.mContextRef == null ? null : this.mContextRef.get();
            this.mNetStackType = Inet64Util.getStackType();
            boolean a2 = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_ENABLE_SUPPORT_GET_CDN_IP_NEW_STRAGY, "true"));
            boolean z = false;
            boolean a3 = MediaAdapteManager.mConfigAdapter != null ? com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "disableTotalHttpDnsIPV6", "false")) : false;
            boolean startsWith = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_ENABLE_HTTPS_FROM_HTTPDNS, "true")) ? this.mPlayUrl.startsWith(com.taobao.vessel.utils.b.HTTPS_SCHEMA) : false;
            if (this.mPlayUrl == null || ((!this.mPlayUrl.startsWith("http:") && !startsWith) || context == null)) {
                if (isGrtnUrl(this.mPlayUrl) && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblive", "GRTNHTTPDNSEnabled", "true"))) {
                    boolean a4 = a3 ? false : com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "GRTNEnableIPV6", "true"));
                    if (this.mNetStackType == 1) {
                        a4 = false;
                    }
                    if (com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "GrtnRtcLiveMultipleIPEnable", "true"))) {
                        try {
                            ArrayList<String> a5 = f.a(this.mPlayUrl, a4);
                            if (!a5.isEmpty()) {
                                JSONArray jSONArray = new JSONArray();
                                Iterator<String> it = a5.iterator();
                                while (it.hasNext()) {
                                    jSONArray.add(it.next());
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(DnsPreference.KEY_IPS, (Object) jSONArray);
                                this.mServerIPJson = jSONObject.toJSONString();
                                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCdnIp get serverIPList is " + this.mServerIPJson);
                            }
                        } catch (Exception e) {
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCdnIp get srverIPList exception " + e.toString());
                        }
                    }
                    return com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "HttpDNSIpCacheEnabled", "true")) ? getHttpDnsOriginIP(this.mPlayUrl, a4) : f.c(this.mPlayUrl, a4);
                }
            } else if (this.mConfig != null && this.mConfig.b != 2 && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", VIDEO_CDNIP_ENABLE, "true"))) {
                boolean a6 = a3 ? false : com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "LiveEnableIPV6", "true"));
                if (this.mNetStackType == 1) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "only support ipv4 cdn ip");
                    a6 = false;
                }
                if (MediaAdapteManager.mConfigAdapter != null && !com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", LIVE_BACKUP_CDNIP_ENABLE, "false"))) {
                    return f.c(this.mPlayUrl, a6);
                }
                StringBuilder sb = new StringBuilder(128);
                String a7 = f.a(this.mPlayUrl, a6, sb);
                if (!StringUtils.isEmpty(sb.toString())) {
                    this.mBackupCdnIp = sb.toString();
                }
                return a7;
            } else if (this.mConfig != null && this.mConfig.b == 2 && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "videoClipCDNIpEnable3", "true"))) {
                if (this.mNetStackType == 1 && a2) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "only support ipv4 cdn_ip");
                    return f.c(this.mPlayUrl, false);
                }
                if (!a3) {
                    z = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "VideoEnableIPV6", "true"));
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "support ipv6 cdn_ip=" + z);
                return getHttpDnsOriginIP(this.mPlayUrl, z);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public String getCdnIpForDebug() {
        return this.mCdnIp;
    }

    public com.taobao.taobaoavsdk.widget.media.c getCloneConfig() {
        return this.mConfigClone;
    }

    protected boolean getCommitFirstHeartBeat() {
        return com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_VPM_HEARTBEAT_COMMIT_FIRST, "false"));
    }

    public com.taobao.taobaoavsdk.widget.media.c getConfig() {
        return this.mConfig;
    }

    protected long getConsumedData() {
        return 0L;
    }

    protected String getDynamicPlayExParam(String str) {
        HashMap<String, String> hashMap;
        if (!StringUtils.isEmpty(str) && (hashMap = this.mDynamicPlayExMap) != null && hashMap.size() > 0) {
            for (Map.Entry<String, String> entry : this.mDynamicPlayExMap.entrySet()) {
                if (str.equals(entry.getKey())) {
                    return entry.getValue();
                }
            }
        }
        return "";
    }

    public String getEncodeType() {
        return this.mEncodeType;
    }

    protected String getExperienceBuctetId() {
        return "";
    }

    protected String getExperienceId() {
        return "";
    }

    protected String getExperienceReleaseId() {
        return "";
    }

    protected String getExterntPlayEx() {
        return "";
    }

    protected String getHeartBeatIntervalString() {
        if (this.mHeartBeatIntervalStr == null) {
            this.mHeartBeatIntervalStr = OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_VPM_HEARTBEAT_INTERVAL_FOR_SCENARIO, "{\"0\":30, \"2\": 30} ");
        }
        return this.mHeartBeatIntervalStr;
    }

    public int getLastErrorCode() {
        return this.mLastErrorCode;
    }

    protected void getMoreRenderStallInfoIfNeeded() {
        if (this.videoRenderingStalledCountNew_43833053 == 1) {
            StringBuilder sb = playExperienceBuilder.get();
            sb.setLength(0);
            sb.append(",_vst_time=");
            sb.append(System.currentTimeMillis());
            sb.append(",_vst_video_bytes=");
            sb.append(this.mVideoCacheBytesInRendering);
            sb.append(",_vst_video_frames=");
            sb.append(this.mVideoCacheFramesInRendering);
            sb.append(",_vst_recv_byte=");
            sb.append(this.mReceiveFramesInRendering);
            sb.append(",_vst_req_byte=");
            sb.append(this.mRequestBytesInRendering);
            this.mRenderStallStatInfoForFirstTime = sb.toString();
            AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "_vst_video_bytes size is :" + this.mRenderStallStatInfoForFirstTime.length());
        }
    }

    protected List<Integer> getNetworkQualityStateNodes() {
        return new ArrayList();
    }

    protected long getPlayTimeByVideoResolution(String str) {
        if (StringUtils.isEmpty(str) || !this.mVideoResolutionPlayTimeMap.containsKey(str)) {
            return 0L;
        }
        return this.mVideoResolutionPlayTimeMap.get(str).longValue();
    }

    public String getPlayUrl() {
        return this.mPlayUrl;
    }

    public LinkedList<Integer> getPlayerEventListForDebug() {
        return this.mPlayerEventList;
    }

    public String getPlayingLiveDefinition() {
        return this.mPlayingLiveDefinition;
    }

    protected long getPoorNetworkTime() {
        return -1L;
    }

    protected long getRecData() {
        return 0L;
    }

    protected long getRenderingStalledCountNewByVideoResolution(String str) {
        if (StringUtils.isEmpty(str) || !this.mVideoResolutionRenderingStalledCountMap.containsKey(str)) {
            return 0L;
        }
        return this.mVideoResolutionRenderingStalledCountMap.get(str).longValue();
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getVPMEnableAlgo() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_VPM_ENABLE_ALGO, "true"));
    }

    protected String getVideoResolution(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        return (min > 360 || max > 640) ? (min > 540 || max > 960) ? (min > 720 || max > 1280) ? (min > 1080 || max > 1920) ? (min > 1440 || max > 2560) ? (min > 1440 || max > 2560) ? VIDEO_RESOLUTION_over2k : "other" : "2k" : VIDEO_RESOLUTION_1080P : VIDEO_RESOLUTION_720P : VIDEO_RESOLUTION_540P : VIDEO_RESOLUTION_360P;
    }

    public void initDisableAudio(boolean z) {
        this.mDisablePullAudio = z ? 1 : 0;
    }

    protected boolean isArtpUrl(String str) {
        return !StringUtils.isEmpty(str) && str.contains(TaoLiveVideoView.TBLIVE_ARTP_SCHEMA);
    }

    public boolean isAudioHardwareDecode() {
        return true;
    }

    public boolean isCompleteHitCache() {
        return this.bIsCompleteHitCache;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isGrtnRtcLiveUrl(String str) {
        return isGrtnUrl(str) && MediaConstant.RTCLIVE_URL_NAME.equals(this.mConfigClone.R);
    }

    protected boolean isGrtnUrl(String str) {
        return !StringUtils.isEmpty(str) && str.contains(TaoLiveVideoView.TBLIVE_GRTN_SCHEMA);
    }

    public boolean isHardwareDecode() {
        return true;
    }

    public boolean isHitCache() {
        return this.bIsHitCache;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isOptSourcerPipeSizeByExtern() {
        if (this.mConfigClone == null || this.mConfigClone.ab == null) {
            return false;
        }
        return com.taobao.taobaoavsdk.util.b.a(this.mConfigClone.ab.get("optSourcerPipeSize"));
    }

    public boolean isRtcUrl(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(TaoLiveVideoView.TBLIVE_ARTP_SCHEMA) || str.contains(TaoLiveVideoView.TBLIVE_GRTN_SCHEMA);
    }

    public boolean isUseVideoCache() {
        return this.bUseVideoCache;
    }

    public boolean isUserIdHitRate(String str, long j) {
        if (j == 10000) {
            return true;
        }
        if (j != 0 && !StringUtils.isEmpty(str)) {
            long c = com.taobao.taobaoavsdk.util.b.c(str);
            if (c == 0) {
                return false;
            }
            long j2 = c % 10000;
            if (j2 >= 0 && j2 < j) {
                return true;
            }
        }
        return false;
    }

    protected boolean isVPMAlgoEnabled() {
        if (getVPMEnableAlgo() && (this instanceof TaobaoMediaPlayer)) {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this;
            long _getPropertyLong = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_DECODER_TYPE, 0L);
            long _getPropertyLong2 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_RENDERER_TYPE, 0L);
            if (_getPropertyLong == 1 && _getPropertyLong2 == 4) {
                return true;
            }
        }
        return false;
    }

    protected void monitorAbnormalRenderSpeed(long j, long j2) {
        long j3 = j - this.mTn;
        long j4 = j2 - this.mTDn;
        float f = ((float) (j3 - j4)) / ((float) j4);
        if (j4 != 0) {
            float f2 = this.mAbnormalPlaySpeedThreshold;
            if (f >= f2) {
                if (this.mCurrRenderingStatus == 2) {
                    int i = this.mAbnormalPlayFrameCount;
                    if (i >= this.mValidAbnormalFrameCount) {
                        this.mTotalQuickPlayTime += this.mAbnormalPlayDuration;
                        this.mTotalQuickPlayFrameCount += i;
                    }
                    this.mTotalQuickFrameCountAll += this.mAbnormalPlayFrameCount;
                    this.mTotalQuickPlayTimeAll += this.mAbnormalPlayDuration;
                    this.mAbnormalPlayFrameCount = 0;
                    this.mAbnormalPlayDuration = 0L;
                }
                this.mCurrRenderingStatus = 1;
            } else if (f > f2 * (-1.0f)) {
                int i2 = this.mCurrRenderingStatus;
                if (i2 == 1) {
                    long j5 = this.mTotalSlowFrameCountAll;
                    int i3 = this.mAbnormalPlayFrameCount;
                    this.mTotalSlowFrameCountAll = j5 + i3;
                    long j6 = this.mTotalSlowPlayTimeAll;
                    long j7 = this.mAbnormalPlayDuration;
                    this.mTotalSlowPlayTimeAll = j6 + j7;
                    if (i3 >= this.mValidAbnormalFrameCount) {
                        this.mTotalSlowPlayTime += j7;
                        this.mTotalSlowPlayFrameCount += i3;
                    }
                } else if (i2 == 2) {
                    long j8 = this.mTotalQuickFrameCountAll;
                    int i4 = this.mAbnormalPlayFrameCount;
                    this.mTotalQuickFrameCountAll = j8 + i4;
                    long j9 = this.mTotalQuickPlayTimeAll;
                    long j10 = this.mAbnormalPlayDuration;
                    this.mTotalQuickPlayTimeAll = j9 + j10;
                    if (i4 >= this.mValidAbnormalFrameCount) {
                        this.mTotalQuickPlayTime += j10;
                        this.mTotalQuickPlayFrameCount += i4;
                    }
                }
                this.mCurrRenderingStatus = 0;
                this.mAbnormalPlayDuration = 0L;
                this.mAbnormalPlayFrameCount = 0;
                return;
            } else {
                if (this.mCurrRenderingStatus == 1) {
                    int i5 = this.mAbnormalPlayFrameCount;
                    if (i5 >= this.mValidAbnormalFrameCount) {
                        this.mTotalSlowPlayTime += this.mAbnormalPlayDuration;
                        this.mTotalSlowPlayFrameCount += i5;
                    }
                    this.mTotalSlowFrameCountAll += this.mAbnormalPlayFrameCount;
                    this.mTotalSlowPlayTimeAll += this.mAbnormalPlayDuration;
                    this.mAbnormalPlayFrameCount = 0;
                    this.mAbnormalPlayDuration = 0L;
                }
                this.mCurrRenderingStatus = 2;
            }
            this.mAbnormalPlayFrameCount++;
            this.mAbnormalPlayDuration += j3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorAfterPrepared(long j, String str) {
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = weakReference == null ? null : weakReference.get();
        this.mEncodeType = str;
        ozf.a().a(context);
        registerMonitor();
        this.mIsBackground = oyu.a();
        this.mApmEventListener = new IApmEventListener() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.3
            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                String str2;
                if (i != 1) {
                    if (i == 2) {
                        str2 = "NOTIFY_BACKGROUND_2_FOREGROUND";
                        MonitorMediaPlayer.this.changeToBackground(str2, false);
                    } else if (i != 50) {
                        str2 = "unknown";
                    } else {
                        str2 = "NOTIFY_FOR_IN_BACKGROUND";
                    }
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " Apm event " + str2 + "， is playing " + MonitorMediaPlayer.this.isPlaying());
                }
                str2 = "NOTIFY_FOREGROUND_2_BACKGROUND";
                MonitorMediaPlayer.this.changeToBackground(str2, true);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " Apm event " + str2 + "， is playing " + MonitorMediaPlayer.this.isPlaying());
            }
        };
        com.taobao.application.common.c.a(this.mApmEventListener);
        if (oyu.N()) {
            ipw.a(context).a(this);
        } else if (context == null || Looper.myLooper() == null) {
        } else {
            try {
                if (this.mPhoneStateListener == null) {
                    this.mPhoneStateListener = new PhoneStateListener() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.4
                        @Override // android.telephony.PhoneStateListener
                        public void onCallStateChanged(int i, String str2) {
                            super.onCallStateChanged(i, str2);
                            if (!(MonitorMediaPlayer.this instanceof TaobaoMediaPlayer) || TaobaoMediaPlayer.isLibLoaded()) {
                                if (i == 0) {
                                    if (!MonitorMediaPlayer.this.pauseByTelephone) {
                                        return;
                                    }
                                    MonitorMediaPlayer monitorMediaPlayer = MonitorMediaPlayer.this;
                                    monitorMediaPlayer.pauseByTelephone = false;
                                    try {
                                        monitorMediaPlayer.start();
                                    } catch (Exception unused) {
                                    }
                                } else if (i != 1) {
                                    if (i == 2) {
                                    }
                                } else if (!MonitorMediaPlayer.this.isPlaying()) {
                                } else {
                                    MonitorMediaPlayer.this.pauseByTelephone = true;
                                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "yezo:pause in monitorAfterPrepared");
                                    MonitorMediaPlayer.this.pause();
                                }
                            }
                        }
                    };
                }
                this.mTelephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (this.mTelephonyManager == null || this.mPhoneStateListener == null) {
                    return;
                }
                this.mTelephonyManager.listen(this.mPhoneStateListener, 32);
            } catch (Throwable th) {
                AVSDKLog.e("AVDSK", "TELEPHONY_SERVICE listen LISTEN_CALL_STATE error: " + th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorBufferEnd(long j) {
        if (this.mConfig == null || !this.bFirstFrameRendered || this.mBufferingStart <= 0) {
            return;
        }
        if (this.bSeeked) {
            this.bSeeked = false;
        } else if (this.bIgnoreAbnormalAfterVideoComplete && this.mEnableFixAbnormalStatForLoop) {
            this.bIgnoreAbnormalAfterVideoComplete = false;
        } else {
            if (j <= 0) {
                j = System.currentTimeMillis();
            }
            long j2 = j - this.mBufferingStart;
            if (j2 < 0 || j2 > 10000) {
                return;
            }
            this.mLastBufferDuration = j2;
            this.mLastBuffering = j;
            if ((this.mDisableSeparateSeekAbnormalTime || this.mSeekStart == 0) && this.mBufferingStart > this.mRendedTimeInRenderThread) {
                this.mBufferingCountNew++;
                this.mBufferingTotalTimeNew += j2;
            }
            this.mBufferingCount++;
            this.mBufferingTotalTime += j2;
            this.mBufferingHeartBeatCount++;
            this.mBufferingHeartBeatMsg.append(System.currentTimeMillis() + ":" + j2 + "#");
            this.mBufferingHeartBeatTotalTime = this.mBufferingHeartBeatTotalTime + j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorBufferStart(long j) {
        boolean z = this.mEnableFixAbnormalStatForFirstRender;
        boolean z2 = !z || (z && j > this.mRendedTimeInRenderThread);
        if (this.bFirstFrameRendered && z2) {
            if (j <= 0) {
                j = System.currentTimeMillis();
            }
            this.mBufferingStart = j;
        }
        monitorPlayerEvent(4);
        this.mLastBufferDuration = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorCodecParamChanged() {
        monitorPlayerEvent(35);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorComplete() {
        this.bPaused = true;
        checkStatRenderStallFlag();
        monitorPlayerEvent(6);
        this.mLoopCount++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0407, code lost:
        if (android.text.StringUtils.isEmpty(r1) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x045a, code lost:
        if (android.text.StringUtils.isEmpty(r1) == false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String monitorDataSource(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.monitorDataSource(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorEndPlayInBackground() {
        if (this.mLastBgPlayTime != 0) {
            this.mTotalBgPlayTime += System.currentTimeMillis() - this.mLastBgPlayTime;
            this.mLastBgPlayTime = 0L;
        }
        this.mPlayInPIP = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorEndPlayWithFloatWindow() {
        if (this.mLastFloatWindowsPlayTime != 0) {
            this.mTotalFloatWindowsPlayTime += System.currentTimeMillis() - this.mLastFloatWindowsPlayTime;
            this.mLastFloatWindowsPlayTime = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorError(int i, int i2) {
        if (this.mConfig == null || StringUtils.isEmpty(this.AppMonitor_Module) || this.mCommitPlayError) {
            return;
        }
        com.taobao.taobaoavsdk.Tracer.b.a(this.mAnalysis, "VIDEO_ERROR", String.valueOf(i));
        if (com.taobao.taobaoavsdk.util.b.a(i, oyu.aH)) {
            f.f();
        }
        int i3 = 0;
        onRenderStalledWhenStateChanged(0);
        if (this.mEnableRenderStallCalNew) {
            onRenderStalledWhenStateChangedNew();
        }
        this.mLastRenderVideoEveryFrame = 0L;
        this.mLastMonitorRenderSystemTime = 0L;
        this.bPaused = true;
        checkStatRenderStallFlag();
        if (isRtcUrl(this.mPlayUrl) && -10611 == i) {
            return;
        }
        if (this instanceof TaobaoMediaPlayer) {
            this.mServerIP = ((TaobaoMediaPlayer) this)._getPropertyString(21003);
        }
        monitorPlayerEvent(7);
        try {
            this.mCommitPlayError = true;
            this.mLastErrorCode = i;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "monitorError and set mLastErrorCode=" + this.mLastErrorCode);
            this.mLastExtra = i2;
            HashMap<String, String> baseDimensionValues = getBaseDimensionValues();
            baseDimensionValues.put("error_code", String.valueOf(i));
            baseDimensionValues.put("extra", String.valueOf(i2));
            Context context = this.mContextRef == null ? null : this.mContextRef.get();
            if (context != null && (context instanceof Activity) && ((Activity) context).getIntent() != null && ((Activity) context).getIntent().getData() != null && !StringUtils.isEmpty(((Activity) context).getIntent().getData().toString())) {
                baseDimensionValues.put("page_url", ((Activity) context).getIntent().getData().toString());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("timestamp", Double.valueOf(System.currentTimeMillis()));
            double d = 1.0d;
            hashMap.put("is_tbnet", Double.valueOf(this.mConfig.o ? 1.0d : 0.0d));
            hashMap.put("hardware_hevc", Double.valueOf(this.mConfig.g));
            hashMap.put("hardware_avc", Double.valueOf(this.mConfig.f));
            if (!this.bUseVideoCache) {
                d = 0.0d;
            }
            hashMap.put("is_usecache", Double.valueOf(d));
            if (context != null) {
                if (f.b(this.mNetworkUtilsAdapter, context)) {
                    i3 = 1;
                }
                this.mLastIsConnected = i3;
                hashMap.put("is_connected", Double.valueOf(this.mLastIsConnected));
            }
            hashMap.put("cur_position", Double.valueOf(getCurrentPosition() / 1000));
            AppMonitor.Stat.commit(this.AppMonitor_Module, "playerError", DimensionValueSet.fromStringMap(baseDimensionValues), MeasureValueSet.create(hashMap));
        } catch (Throwable unused) {
        }
        synchronized (this.mLock) {
            if (this.mHandler != null) {
                this.mHandler.removeCallbacksAndMessages(null);
            }
        }
    }

    protected void monitorFirstFrameSurfaceUpdateNew(long j) {
        if (j > 0) {
            dde ddeVar = this.mFirstRenderAdapterRef == null ? null : this.mFirstRenderAdapterRef.get();
            if (ddeVar == null || ddeVar.getStartTime() <= 0) {
                this.mFirstFrameSurfaceUpdateTime = 0L;
            } else {
                this.mFirstFrameSurfaceUpdateTime = j - ddeVar.getStartTime();
                this.mFirstFrameSurfaceUpdateTime = Math.max(0L, this.mFirstFrameSurfaceUpdateTime);
            }
            long j2 = this.mStartTime;
            if (j2 <= 0 || j - j2 < 0) {
                this.mFirstUpdateTimeFromPlayerStart = j - this.mPrepareStartTime;
            } else {
                this.mFirstUpdateTimeFromPlayerStart = this.mPreparedTime + (j - this.mStartTime);
            }
        }
    }

    synchronized void monitorHWContinousDecodeError() {
        oyu.m++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorInitEglError() {
        this.bInitEglError = true;
        oyu.g = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorMediacodecError() {
        this.bMediacodeError = true;
        monitorHWContinousDecodeError();
        ddc ddcVar = this.mConfigAdapter;
        String str = "true";
        if (ddcVar != null) {
            str = ddcVar.getConfig("DWInteractive", MediaConstant.ORANGE_USE_SW_DECODER_AFTER_HW_ERROR, str);
        }
        boolean a2 = com.taobao.taobaoavsdk.util.b.a(str);
        ddc ddcVar2 = this.mConfigAdapter;
        String str2 = "2";
        if (ddcVar2 != null) {
            str2 = ddcVar2.getConfig("DWInteractive", MediaConstant.ORANGE_MAX_HARDWARE_CONTINOUS_DECODE_ERROR_COUNT, str2);
        }
        int b = com.taobao.taobaoavsdk.util.b.b(str2);
        if (a2 && "HEVC".equals(this.mEncodeType) && oyu.m >= b) {
            setForceSelectH264ForH265HWFailed(true);
            resetHWContinousDecodeErrorCount();
        } else if (!a2 || oyu.m < b) {
        } else {
            String str3 = "false";
            if (!com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_USE_HW_TAG_FOR_PLAY_SCENARIO, str3))) {
                oyu.d = false;
            }
            oyu.e = false;
            ddc ddcVar3 = this.mConfigAdapter;
            if (ddcVar3 != null) {
                str3 = ddcVar3.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SELECT_H265_WHEN_DEGRADE_SW, str3);
            }
            if (com.taobao.taobaoavsdk.util.b.a(str3)) {
                setForceSelectH264ForH265HWFailed(false);
            }
            resetHWContinousDecodeErrorCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorPause() {
        com.taobao.taobaoavsdk.Tracer.b.a(this.mAnalysis, "PAUSE");
        this.mDebugStatus = sii.CARD_MISS_VIDEO_STATUS_PAUSE;
        onRenderStalledWhenStateChanged(1);
        if (this.mEnableRenderStallCalNew) {
            onRenderStalledWhenStateChangedNew();
        }
        this.mLastRenderVideoEveryFrame = 0L;
        this.mLastMonitorRenderSystemTime = 0L;
        this.bPaused = true;
        monitorPlayerEvent(3);
        checkStatRenderStallFlag();
        onRenderingHung();
        if (this.mEnableRenderStallCalNew) {
            onRenderingHungV2();
        }
        com.taobao.taobaoavsdk.Tracer.b.c(this.mAnalysis, "PAUSE");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(130:8|9|10|(4:478|479|(1:481)(1:483)|482)|12|(1:14)|15|16|(1:20)|21|(1:23)(1:477)|24|(1:27)|28|29|(2:31|32)(2:440|(125:442|(124:447|(1:449)(1:474)|450|(1:452)(2:470|(1:472)(1:473))|453|(3:455|456|457)(1:469)|458|(2:460|(116:464|465|466|34|(2:36|(108:38|39|(2:41|(1:43))(1:437)|44|(1:436)(3:47|48|(1:56))|57|(1:59)(1:435)|60|(3:68|(1:70)|71)|72|(1:76)|77|(1:81)|82|83|(4:403|404|(7:407|408|409|410|(1:427)(2:412|(2:414|415)(2:417|(2:419|420)(2:421|(2:423|424)(2:425|426))))|416|405)|432)|85|86|87|88|(4:90|(1:401)(1:94)|95|(1:97))(1:402)|98|(3:100|(1:102)(1:104)|103)|105|(1:107)|108|(1:110)|111|(4:113|(1:115)(1:399)|116|(1:118))(1:400)|119|(1:123)|124|(1:126)|127|(4:129|(1:131)|132|(1:134))|135|(1:137)|138|139|(4:141|(1:397)(1:145)|146|147)(1:398)|148|(1:396)(2:152|(1:154))|155|(1:157)|158|(2:162|(1:164))|165|(1:167)(1:395)|168|(1:170)|171|172|173|175|176|177|(1:179)|180|(1:182)|183|184|(1:186)|187|(1:390)(22:193|(1:195)|196|(1:198)|199|(1:201)|202|(1:204)|205|(1:207)|208|(1:210)|211|(1:213)|214|(1:216)|217|(1:219)|220|221|222|(1:224))|226|(3:228|(1:230)(1:232)|231)|233|(1:241)|242|(1:245)|247|(32:249|(1:251)(1:383)|252|253|254|255|(1:257)(1:377)|258|(1:260)(1:376)|261|(1:263)(1:375)|264|(1:266)(1:374)|267|(1:269)(1:373)|270|(1:272)(1:372)|273|(1:275)(1:371)|276|(1:278)(1:370)|279|(1:281)(1:369)|282|(1:284)(1:368)|285|(1:287)(1:367)|288|(1:290)(1:366)|291|(1:293)(1:365)|294)(1:384)|295|(1:297)(1:364)|298|(1:300)(1:363)|301|(1:303)(1:362)|304|(1:306)(1:361)|307|(1:309)(1:360)|310|(1:312)(1:359)|313|(1:315)(1:358)|316|(1:318)(1:357)|319|(1:321)(1:356)|322|(1:324)(1:355)|325|(1:327)(1:354)|328|(1:330)(1:353)|331|(1:333)(1:352)|334|(1:336)(1:351)|337|(1:339)(1:350)|340|(1:342)|343|(1:345)|346|347))(1:439)|438|39|(0)(0)|44|(0)|436|57|(0)(0)|60|(6:62|64|66|68|(0)|71)|72|(2:74|76)|77|(2:79|81)|82|83|(0)|85|86|87|88|(0)(0)|98|(0)|105|(0)|108|(0)|111|(0)(0)|119|(2:121|123)|124|(0)|127|(0)|135|(0)|138|139|(0)(0)|148|(1:150)|396|155|(0)|158|(3:160|162|(0))|165|(0)(0)|168|(0)|171|172|173|175|176|177|(0)|180|(0)|183|184|(0)|187|(1:189)|390|226|(0)|233|(4:235|237|239|241)|242|(1:245)|247|(0)(0)|295|(0)(0)|298|(0)(0)|301|(0)(0)|304|(0)(0)|307|(0)(0)|310|(0)(0)|313|(0)(0)|316|(0)(0)|319|(0)(0)|322|(0)(0)|325|(0)(0)|328|(0)(0)|331|(0)(0)|334|(0)(0)|337|(0)(0)|340|(0)|343|(0)|346|347))(1:468)|467|465|466|34|(0)(0)|438|39|(0)(0)|44|(0)|436|57|(0)(0)|60|(0)|72|(0)|77|(0)|82|83|(0)|85|86|87|88|(0)(0)|98|(0)|105|(0)|108|(0)|111|(0)(0)|119|(0)|124|(0)|127|(0)|135|(0)|138|139|(0)(0)|148|(0)|396|155|(0)|158|(0)|165|(0)(0)|168|(0)|171|172|173|175|176|177|(0)|180|(0)|183|184|(0)|187|(0)|390|226|(0)|233|(0)|242|(0)|247|(0)(0)|295|(0)(0)|298|(0)(0)|301|(0)(0)|304|(0)(0)|307|(0)(0)|310|(0)(0)|313|(0)(0)|316|(0)(0)|319|(0)(0)|322|(0)(0)|325|(0)(0)|328|(0)(0)|331|(0)(0)|334|(0)(0)|337|(0)(0)|340|(0)|343|(0)|346|347)|475|450|(0)(0)|453|(0)(0)|458|(0)(0)|467|465|466|34|(0)(0)|438|39|(0)(0)|44|(0)|436|57|(0)(0)|60|(0)|72|(0)|77|(0)|82|83|(0)|85|86|87|88|(0)(0)|98|(0)|105|(0)|108|(0)|111|(0)(0)|119|(0)|124|(0)|127|(0)|135|(0)|138|139|(0)(0)|148|(0)|396|155|(0)|158|(0)|165|(0)(0)|168|(0)|171|172|173|175|176|177|(0)|180|(0)|183|184|(0)|187|(0)|390|226|(0)|233|(0)|242|(0)|247|(0)(0)|295|(0)(0)|298|(0)(0)|301|(0)(0)|304|(0)(0)|307|(0)(0)|310|(0)(0)|313|(0)(0)|316|(0)(0)|319|(0)(0)|322|(0)(0)|325|(0)(0)|328|(0)(0)|331|(0)(0)|334|(0)(0)|337|(0)(0)|340|(0)|343|(0)|346|347)(1:476))|33|34|(0)(0)|438|39|(0)(0)|44|(0)|436|57|(0)(0)|60|(0)|72|(0)|77|(0)|82|83|(0)|85|86|87|88|(0)(0)|98|(0)|105|(0)|108|(0)|111|(0)(0)|119|(0)|124|(0)|127|(0)|135|(0)|138|139|(0)(0)|148|(0)|396|155|(0)|158|(0)|165|(0)(0)|168|(0)|171|172|173|175|176|177|(0)|180|(0)|183|184|(0)|187|(0)|390|226|(0)|233|(0)|242|(0)|247|(0)(0)|295|(0)(0)|298|(0)(0)|301|(0)(0)|304|(0)(0)|307|(0)(0)|310|(0)(0)|313|(0)(0)|316|(0)(0)|319|(0)(0)|322|(0)(0)|325|(0)(0)|328|(0)(0)|331|(0)(0)|334|(0)(0)|337|(0)(0)|340|(0)|343|(0)|346|347) */
    /* JADX WARN: Can't wrap try/catch for region: R(132:5|(1:7)(1:486)|8|9|10|(4:478|479|(1:481)(1:483)|482)|12|(1:14)|15|16|(1:20)|21|(1:23)(1:477)|24|(1:27)|28|29|(2:31|32)(2:440|(125:442|(124:447|(1:449)(1:474)|450|(1:452)(2:470|(1:472)(1:473))|453|(3:455|456|457)(1:469)|458|(2:460|(116:464|465|466|34|(2:36|(108:38|39|(2:41|(1:43))(1:437)|44|(1:436)(3:47|48|(1:56))|57|(1:59)(1:435)|60|(3:68|(1:70)|71)|72|(1:76)|77|(1:81)|82|83|(4:403|404|(7:407|408|409|410|(1:427)(2:412|(2:414|415)(2:417|(2:419|420)(2:421|(2:423|424)(2:425|426))))|416|405)|432)|85|86|87|88|(4:90|(1:401)(1:94)|95|(1:97))(1:402)|98|(3:100|(1:102)(1:104)|103)|105|(1:107)|108|(1:110)|111|(4:113|(1:115)(1:399)|116|(1:118))(1:400)|119|(1:123)|124|(1:126)|127|(4:129|(1:131)|132|(1:134))|135|(1:137)|138|139|(4:141|(1:397)(1:145)|146|147)(1:398)|148|(1:396)(2:152|(1:154))|155|(1:157)|158|(2:162|(1:164))|165|(1:167)(1:395)|168|(1:170)|171|172|173|175|176|177|(1:179)|180|(1:182)|183|184|(1:186)|187|(1:390)(22:193|(1:195)|196|(1:198)|199|(1:201)|202|(1:204)|205|(1:207)|208|(1:210)|211|(1:213)|214|(1:216)|217|(1:219)|220|221|222|(1:224))|226|(3:228|(1:230)(1:232)|231)|233|(1:241)|242|(1:245)|247|(32:249|(1:251)(1:383)|252|253|254|255|(1:257)(1:377)|258|(1:260)(1:376)|261|(1:263)(1:375)|264|(1:266)(1:374)|267|(1:269)(1:373)|270|(1:272)(1:372)|273|(1:275)(1:371)|276|(1:278)(1:370)|279|(1:281)(1:369)|282|(1:284)(1:368)|285|(1:287)(1:367)|288|(1:290)(1:366)|291|(1:293)(1:365)|294)(1:384)|295|(1:297)(1:364)|298|(1:300)(1:363)|301|(1:303)(1:362)|304|(1:306)(1:361)|307|(1:309)(1:360)|310|(1:312)(1:359)|313|(1:315)(1:358)|316|(1:318)(1:357)|319|(1:321)(1:356)|322|(1:324)(1:355)|325|(1:327)(1:354)|328|(1:330)(1:353)|331|(1:333)(1:352)|334|(1:336)(1:351)|337|(1:339)(1:350)|340|(1:342)|343|(1:345)|346|347))(1:439)|438|39|(0)(0)|44|(0)|436|57|(0)(0)|60|(6:62|64|66|68|(0)|71)|72|(2:74|76)|77|(2:79|81)|82|83|(0)|85|86|87|88|(0)(0)|98|(0)|105|(0)|108|(0)|111|(0)(0)|119|(2:121|123)|124|(0)|127|(0)|135|(0)|138|139|(0)(0)|148|(1:150)|396|155|(0)|158|(3:160|162|(0))|165|(0)(0)|168|(0)|171|172|173|175|176|177|(0)|180|(0)|183|184|(0)|187|(1:189)|390|226|(0)|233|(4:235|237|239|241)|242|(1:245)|247|(0)(0)|295|(0)(0)|298|(0)(0)|301|(0)(0)|304|(0)(0)|307|(0)(0)|310|(0)(0)|313|(0)(0)|316|(0)(0)|319|(0)(0)|322|(0)(0)|325|(0)(0)|328|(0)(0)|331|(0)(0)|334|(0)(0)|337|(0)(0)|340|(0)|343|(0)|346|347))(1:468)|467|465|466|34|(0)(0)|438|39|(0)(0)|44|(0)|436|57|(0)(0)|60|(0)|72|(0)|77|(0)|82|83|(0)|85|86|87|88|(0)(0)|98|(0)|105|(0)|108|(0)|111|(0)(0)|119|(0)|124|(0)|127|(0)|135|(0)|138|139|(0)(0)|148|(0)|396|155|(0)|158|(0)|165|(0)(0)|168|(0)|171|172|173|175|176|177|(0)|180|(0)|183|184|(0)|187|(0)|390|226|(0)|233|(0)|242|(0)|247|(0)(0)|295|(0)(0)|298|(0)(0)|301|(0)(0)|304|(0)(0)|307|(0)(0)|310|(0)(0)|313|(0)(0)|316|(0)(0)|319|(0)(0)|322|(0)(0)|325|(0)(0)|328|(0)(0)|331|(0)(0)|334|(0)(0)|337|(0)(0)|340|(0)|343|(0)|346|347)|475|450|(0)(0)|453|(0)(0)|458|(0)(0)|467|465|466|34|(0)(0)|438|39|(0)(0)|44|(0)|436|57|(0)(0)|60|(0)|72|(0)|77|(0)|82|83|(0)|85|86|87|88|(0)(0)|98|(0)|105|(0)|108|(0)|111|(0)(0)|119|(0)|124|(0)|127|(0)|135|(0)|138|139|(0)(0)|148|(0)|396|155|(0)|158|(0)|165|(0)(0)|168|(0)|171|172|173|175|176|177|(0)|180|(0)|183|184|(0)|187|(0)|390|226|(0)|233|(0)|242|(0)|247|(0)(0)|295|(0)(0)|298|(0)(0)|301|(0)(0)|304|(0)(0)|307|(0)(0)|310|(0)(0)|313|(0)(0)|316|(0)(0)|319|(0)(0)|322|(0)(0)|325|(0)(0)|328|(0)(0)|331|(0)(0)|334|(0)(0)|337|(0)(0)|340|(0)|343|(0)|346|347)(1:476))|33|34|(0)(0)|438|39|(0)(0)|44|(0)|436|57|(0)(0)|60|(0)|72|(0)|77|(0)|82|83|(0)|85|86|87|88|(0)(0)|98|(0)|105|(0)|108|(0)|111|(0)(0)|119|(0)|124|(0)|127|(0)|135|(0)|138|139|(0)(0)|148|(0)|396|155|(0)|158|(0)|165|(0)(0)|168|(0)|171|172|173|175|176|177|(0)|180|(0)|183|184|(0)|187|(0)|390|226|(0)|233|(0)|242|(0)|247|(0)(0)|295|(0)(0)|298|(0)(0)|301|(0)(0)|304|(0)(0)|307|(0)(0)|310|(0)(0)|313|(0)(0)|316|(0)(0)|319|(0)(0)|322|(0)(0)|325|(0)(0)|328|(0)(0)|331|(0)(0)|334|(0)(0)|337|(0)(0)|340|(0)|343|(0)|346|347) */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0b3e, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0b3f, code lost:
        com.taobao.taobaoavsdk.AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "set decoder strategy exception");
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x075e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x07b5 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x07c9 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x07e2 A[Catch: Throwable -> 0x00ac, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0807 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x081c A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x08d9 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0926 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0945 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0951 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x095d A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x099a A[Catch: Throwable -> 0x226e, TRY_ENTER, TryCatch #6 {Throwable -> 0x226e, blocks: (B:11:0x0023, B:22:0x00b1, B:29:0x017b, B:35:0x0200, B:39:0x020f, B:43:0x0223, B:86:0x0721, B:93:0x073c, B:99:0x0756, B:114:0x07a5, B:119:0x07c5, B:131:0x07f2, B:136:0x0818, B:141:0x0829, B:168:0x08d1, B:182:0x0922, B:189:0x093f, B:192:0x094b, B:195:0x0957, B:206:0x09a0, B:211:0x09b4, B:214:0x09d1, B:222:0x09f0, B:226:0x0a02, B:237:0x0a77, B:246:0x0aa6, B:249:0x0ab3, B:256:0x0acd, B:261:0x0adc, B:264:0x0aed, B:270:0x0b45, B:273:0x0b65, B:276:0x0b77, B:280:0x0b8a, B:323:0x0cc1, B:330:0x0d7c, B:339:0x0dad, B:343:0x0dbf, B:345:0x0dc3, B:349:0x0dcf, B:269:0x0b3f, B:205:0x099a, B:48:0x0292, B:38:0x0206), top: B:492:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x09ba A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x09fa A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0a08 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0a81 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0aae A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0ab7 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0aca A[Catch: Throwable -> 0x00ac, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ad8 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0ae8 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0b5b A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0b6d A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0b7e A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0b90 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0cc5 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0d95 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0db1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0dc3 A[Catch: Throwable -> 0x226e, TryCatch #6 {Throwable -> 0x226e, blocks: (B:11:0x0023, B:22:0x00b1, B:29:0x017b, B:35:0x0200, B:39:0x020f, B:43:0x0223, B:86:0x0721, B:93:0x073c, B:99:0x0756, B:114:0x07a5, B:119:0x07c5, B:131:0x07f2, B:136:0x0818, B:141:0x0829, B:168:0x08d1, B:182:0x0922, B:189:0x093f, B:192:0x094b, B:195:0x0957, B:206:0x09a0, B:211:0x09b4, B:214:0x09d1, B:222:0x09f0, B:226:0x0a02, B:237:0x0a77, B:246:0x0aa6, B:249:0x0ab3, B:256:0x0acd, B:261:0x0adc, B:264:0x0aed, B:270:0x0b45, B:273:0x0b65, B:276:0x0b77, B:280:0x0b8a, B:323:0x0cc1, B:330:0x0d7c, B:339:0x0dad, B:343:0x0dbf, B:345:0x0dc3, B:349:0x0dcf, B:269:0x0b3f, B:205:0x099a, B:48:0x0292, B:38:0x0206), top: B:492:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x12e4  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x1310  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x1312  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x135b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x135d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x191a  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x191c  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x1967  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x1969  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x19e3  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x19e5  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1a00  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x1a02  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x1a1f  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x1a21  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x1a3c  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x1a3e  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x1c70  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1c72  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x1fcf  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1fd1  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x2051  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x2053  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x206e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x2070  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x20a3  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x20a5  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x216a  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x216c  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x21cc  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x21ce  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x2220  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x224e A[Catch: Throwable -> 0x226c, TryCatch #3 {Throwable -> 0x226c, blocks: (B:351:0x0e17, B:355:0x0e35, B:359:0x0e9a, B:363:0x0ebf, B:367:0x0f9e, B:371:0x0fd1, B:375:0x0fe0, B:379:0x100b, B:383:0x107c, B:387:0x109c, B:391:0x117c, B:395:0x1199, B:399:0x11a8, B:403:0x1242, B:405:0x12e5, B:409:0x1313, B:413:0x135e, B:417:0x191d, B:421:0x196a, B:425:0x19e6, B:429:0x1a03, B:433:0x1a22, B:437:0x1a3f, B:441:0x1c73, B:445:0x1fd2, B:449:0x2054, B:453:0x2071, B:457:0x20a6, B:461:0x216d, B:465:0x21cf, B:468:0x2221, B:470:0x224e, B:471:0x225e), top: B:486:0x0e17 }] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0833 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x050d A[Catch: Throwable -> 0x00ac, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0616 A[Catch: Throwable -> 0x00ac, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0729 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0744 A[Catch: Throwable -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00ac, blocks: (B:14:0x002a, B:16:0x0076, B:18:0x0088, B:17:0x0086, B:32:0x01ee, B:34:0x01f2, B:42:0x0215, B:88:0x0729, B:95:0x0744, B:103:0x0762, B:105:0x0766, B:107:0x076f, B:109:0x077c, B:111:0x0791, B:116:0x07b5, B:121:0x07c9, B:123:0x07cd, B:125:0x07d6, B:127:0x07dc, B:129:0x07e2, B:130:0x07eb, B:133:0x0807, B:135:0x0811, B:138:0x081c, B:140:0x0824, B:144:0x0833, B:145:0x083b, B:147:0x0841, B:149:0x0853, B:151:0x085b, B:153:0x0868, B:154:0x0871, B:156:0x087e, B:157:0x0887, B:159:0x0894, B:160:0x089d, B:164:0x08c0, B:171:0x08d9, B:173:0x08e3, B:175:0x08e9, B:177:0x08ee, B:179:0x08fc, B:184:0x0926, B:188:0x0932, B:191:0x0945, B:194:0x0951, B:197:0x095d, B:199:0x0965, B:201:0x0987, B:203:0x098f, B:210:0x09aa, B:213:0x09ba, B:218:0x09db, B:221:0x09e6, B:224:0x09fa, B:228:0x0a08, B:230:0x0a11, B:232:0x0a15, B:234:0x0a35, B:239:0x0a81, B:241:0x0a87, B:243:0x0a9b, B:248:0x0aae, B:251:0x0ab7, B:253:0x0abd, B:255:0x0aca, B:258:0x0ad8, B:263:0x0ae8, B:265:0x0b02, B:266:0x0b24, B:272:0x0b5b, B:275:0x0b6d, B:279:0x0b7e, B:282:0x0b90, B:284:0x0b98, B:286:0x0b9c, B:288:0x0bb1, B:289:0x0bb9, B:291:0x0bc5, B:292:0x0bcd, B:294:0x0bd9, B:295:0x0be1, B:297:0x0bed, B:298:0x0bf5, B:300:0x0c02, B:301:0x0c0a, B:303:0x0c17, B:304:0x0c1f, B:306:0x0c33, B:307:0x0c3b, B:309:0x0c41, B:310:0x0c49, B:312:0x0c58, B:313:0x0c60, B:314:0x0c88, B:316:0x0c9a, B:325:0x0cc5, B:329:0x0d79, B:332:0x0d95, B:334:0x0d9b, B:336:0x0da3, B:338:0x0da7, B:342:0x0db3, B:320:0x0ca5, B:200:0x0970, B:50:0x0296, B:60:0x04e6, B:67:0x0505, B:69:0x050d, B:71:0x051b, B:73:0x0520, B:75:0x0616, B:77:0x062c, B:79:0x0632, B:82:0x0639, B:24:0x00bb), top: B:488:0x002a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0754  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void monitorPlayExperience() {
        /*
            Method dump skipped, instructions count: 8844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.monitorPlayExperience():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorPrepare() {
        this.bNeedCommitPlayExperience = true;
        this.bFirstFrameRendered = false;
        this.bSecondFrameRendered = false;
        this.mBufferingHeartBeatCount = 0L;
        this.mBufferingHeartBeatTotalTime = 0L;
        this.mBufferingHeartBeatMsg = new StringBuilder(20);
        this.mBufferingCount = 0L;
        this.mBufferingTotalTime = 0L;
        this.mBufferingCountNew = 0L;
        this.mBufferingTotalTimeNew = 0L;
        this.videoRenderingStalledCount = 0L;
        this.videoRenderingStalledTotalDuration = 0L;
        this.videoRenderingStalledCount_live = 0L;
        this.videoRenderingStalledTotalDuration_live = 0L;
        this.mFirstRenderTime = 0L;
        this.mSecondRenderTime = 0L;
        this.mPreparedTime = 0L;
        this.mLastBuffering = 0L;
        this.mPrepareStartTime = System.currentTimeMillis();
        this.mCommitPlayError = false;
        this.mLastErrorCode = 0;
        this.mLastExtra = 0;
        this.mLastIsConnected = 1;
        this.mHeartBeatCount = 0L;
        this.mUserStartTime = 0L;
        if (StringUtils.isEmpty(this.mPlayUrl) || ((this.mConfig.b != 0 && (this.mConfig.b != 2 || !this.mEnableVPM)) || MediaAdapteManager.mConfigAdapter == null || !com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.mConfig.q, "startHeartBeat", "true")))) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "heartBeatMonitorStart failed, mEnableVPM is " + this.mEnableVPM);
        } else {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "heartBeatMonitorStart ");
            heartBeatMonitorStart();
        }
        this.mVodPlayerNum = ozm.h().e();
        this.mLivePlayerNum = ozi.g().e();
        this.mLiveWarmupNum = tmz.g().e();
        this.mMaxPlayerInstanceCount = ozm.h().a() + ozi.g().a() + tmz.g().a();
        initWatchHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorPrepared(long j) {
        com.taobao.taobaoavsdk.Tracer.b.c(this.mAnalysis, "PREPARE");
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        this.mPreparedTime = j - this.mPrepareStartTime;
        Context context = null;
        dde ddeVar = this.mFirstRenderAdapterRef == null ? null : this.mFirstRenderAdapterRef.get();
        this.mUserPreparedTime = (ddeVar == null || ddeVar.getStartTime() <= 0) ? this.mPreparedTime : j - ddeVar.getStartTime();
        this.mStartTime = j;
        this.mVideoDuration = getDuration() / 1000;
        if (this.mConfig != null) {
            this.mConfigClone = this.mConfig.a();
        }
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            context = weakReference.get();
        }
        if (context != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (activity.getIntent() != null && activity.getIntent().getData() != null && !StringUtils.isEmpty(activity.getIntent().getData().toString())) {
                this.mPageUrl = activity.getIntent().getData().toString();
            }
        }
        monitorPlayerEvent(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorRelease() {
        boolean z;
        long j;
        long j2;
        long j3;
        float f;
        float f2;
        long j4;
        long j5;
        commitSeamlessSwitchStats(0L, -1L, false);
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = weakReference == null ? null : weakReference.get();
        if (this.bUseVideoCache && !this.bIsCompleteHitCache) {
            oyw.a(context).a(this.mPlayUrl);
        }
        try {
            if (oyu.N()) {
                ipw.a(context).b(this);
            } else if (this.mTelephonyManager != null && this.mPhoneStateListener != null) {
                this.mTelephonyManager.listen(this.mPhoneStateListener, 0);
                this.mPhoneStateListener = null;
            }
        } catch (Throwable th) {
            AVSDKLog.e("AVDSK", "TELEPHONY_SERVICE listen LISTEN_NONE error: " + th.getMessage());
        }
        boolean a2 = MediaAdapteManager.mConfigAdapter != null ? com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "EnableStandaloneGrtnStat", "true")) : false;
        this.mBackupCdnIp = null;
        if (a2 && isRtcUrl(this.mPlayUrl) && this.mConfig != null && this.mConfig.f21365a != 2 && ((z = this instanceof TaobaoMediaPlayer))) {
            StringBuilder sb = monitorReleaseBuilder.get();
            sb.setLength(0);
            sb.append("SeqNO=9998");
            sb.append(",feed_id=");
            sb.append(this.mConfigClone.B);
            sb.append(",anchor_account_id=");
            sb.append(this.mConfigClone.C);
            float f3 = -1.0f;
            long j6 = -1;
            if (z) {
                TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this;
                j6 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_AVG_VIDEO_FPS, 0L);
                j = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_AVG_DECODER_VIDEO_FPS, 0L);
                j2 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_AVG_DOWNLOAD_VIDEO_FPS, 0L);
                f3 = taobaoMediaPlayer._getPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_VIDEO_RENDER_FPS_INTERVAL, 0.0f);
                float _getPropertyFloat = taobaoMediaPlayer._getPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_VIDEO_DECODE_FPS_INTERVAL, 0.0f);
                float _getPropertyFloat2 = taobaoMediaPlayer._getPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_VIDEO_DOWNLOAD_FPS_INTERVAL, 0.0f);
                long _getPropertyLong = taobaoMediaPlayer._getPropertyLong(21012, 0L);
                long _getPropertyLong2 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_TOTAL_DECODE_DELAY_MS, 0L);
                long _getPropertyLong3 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_TOTAL_RENDER_DELAY_MS, 0L);
                sb.append(",");
                sb.append(taobaoMediaPlayer._getPropertyString(21990));
                String _getPropertyString = taobaoMediaPlayer._getPropertyString(21008);
                if (!StringUtils.isEmpty(_getPropertyString)) {
                    sb.append(",");
                    sb.append(_getPropertyString);
                }
                String _getPropertyString2 = taobaoMediaPlayer._getPropertyString(21009);
                if (!StringUtils.isEmpty(_getPropertyString2)) {
                    sb.append(",");
                    sb.append(_getPropertyString2);
                }
                f2 = _getPropertyFloat2;
                j4 = _getPropertyLong;
                j5 = _getPropertyLong2;
                f = _getPropertyFloat;
                j3 = _getPropertyLong3;
            } else {
                j = -1;
                j2 = -1;
                j3 = 0;
                f = -1.0f;
                f2 = -1.0f;
                j4 = 0;
                j5 = 0;
            }
            int i = MediaConstant.RTCLIVE_URL_NAME.equals(this.mOriginSelectedUrlName) ? this.mDegradeCode : 0;
            sb.append(",media_url=");
            sb.append(this.mPlayUrl);
            sb.append(",abnormal_count=");
            sb.append(this.mBufferingCount);
            sb.append(",abnormal_total_time=");
            sb.append(this.mBufferingTotalTime);
            sb.append(",video_rendering_stalled_count_v2=");
            sb.append(this.mVideoRenderingStalledCountNewUpdate);
            sb.append(",video_rendering_stalled_count_new=");
            sb.append(this.videoRenderingStalledCountNew_43833053);
            sb.append(",video_rendering_stalled_count_new_r1=");
            sb.append(this.videoRenderingStalledCountNew_43833053_r1);
            sb.append(",video_rendering_stalled_count_new_r2=");
            sb.append(this.videoRenderingStalledCountNew_43833053_r2);
            sb.append(",new_video_rendering_stalled_count=");
            sb.append(this.videoRenderingStalledCountInRenderThread);
            sb.append(",video_rendering_stalled_count=");
            sb.append(this.videoRenderingStalledCount);
            sb.append(",artc_strategic_abnormal_count=");
            sb.append(this.mRtcStrategicAbnormalCount);
            sb.append(",video_rendering_stalled_time_new=");
            sb.append(this.videoRenderingStalledTotalDurationNew_43833053);
            sb.append(",video_rendering_stalled_time_new_r1=");
            sb.append(this.videoRenderingStalledTotalDurationNew_43833053_r1);
            sb.append(",video_rendering_stalled_time_new_r2=");
            sb.append(this.videoRenderingStalledTotalDurationNew_43833053_r2);
            sb.append(",new_video_rendering_stalled_time=");
            sb.append(this.videoRenderingStalledTotalDurationInRenderThread);
            sb.append(",video_rendering_stalled_time=");
            sb.append(this.videoRenderingStalledTotalDuration);
            sb.append(",artc_strategic_abnormal_time=");
            sb.append(this.mRtcStrategicAbnormalTime);
            sb.append(",play_time=");
            sb.append(this.mTotalPlayTime);
            sb.append(",bg_play_time=");
            sb.append(this.mTotalBgPlayTime);
            sb.append(",bg_play_count=");
            sb.append(this.mTotalBgCount);
            sb.append(",pip_windur=");
            sb.append(this.mTotalFloatWindowsPlayTime);
            sb.append(",pip_succcnt=");
            sb.append(this.mTotalFloatWindowsCount);
            sb.append(",player_type=");
            sb.append("taobaoplayer");
            sb.append(",first_frame_rendering_time=");
            sb.append(this.mFirstRenderTime);
            sb.append(",second_frame_rendering_time=");
            sb.append(this.mSecondRenderTime);
            sb.append(",user_first_frame_time=");
            sb.append(this.mUserFirstRenderTime);
            sb.append(",encode_type=");
            sb.append(this.mEncodeType);
            sb.append(",hardware_avc=");
            sb.append(this.mConfigClone.f);
            sb.append(",hardware_hevc=");
            sb.append(this.mConfigClone.g);
            sb.append(",videoAvgDownloadFps=");
            sb.append(j2);
            sb.append(",videoAvgDecodeFps=");
            sb.append(j);
            sb.append(",videoAvgFps=");
            sb.append(j6);
            sb.append(",video_render_fps_v0=");
            sb.append(String.format("%.2f", Float.valueOf(f3)));
            sb.append(",video_decode_fps_v0=");
            sb.append(String.format("%.2f", Float.valueOf(f)));
            sb.append(",video_read_fps_v0=");
            sb.append(String.format("%.2f", Float.valueOf(f2)));
            sb.append(",source_latency=");
            sb.append(j4);
            sb.append(",decode_latency=");
            sb.append(j5);
            sb.append(",render_latency=");
            sb.append(j3);
            sb.append(",error_code=");
            sb.append(this.mLastErrorCode);
            sb.append(",play_token=");
            sb.append(this.mConfigClone.t);
            sb.append(",media_source_type=");
            sb.append(this.mConfigClone.F);
            sb.append(",sub_business_type=");
            sb.append(this.mConfigClone.y);
            sb.append(",selected_url_name=");
            sb.append(this.mConfigClone.R);
            sb.append(",play_start_definition=");
            sb.append(this.mConfigClone.aD);
            sb.append(",last_select_definition=");
            sb.append(this.mPlayingLiveDefinition);
            sb.append(",last_select_stream_reason=");
            sb.append(getLastStreamSelectReason());
            sb.append(",rtclive_degrade_code=");
            sb.append(i);
            sb.append(",audioOnly=");
            sb.append(this.mConfig.at);
            sb.append(",netstack=");
            sb.append(this.mNetStackType);
            sb.append(",init_audio_off=");
            sb.append(this.mDisablePullAudio);
            sb.append(",video_nack_backoff_disable=");
            sb.append(this.mRtcVideoNackBackoffDisable);
            sb.append(",packet_buffer_clear_to_key_disable=");
            sb.append(this.mRtcPacketBufferClearToKeyDiasble);
            sb.append(",rtc_congestion_mode=");
            sb.append(this.mRtcCongestionMode);
            sb.append(",video_width=");
            sb.append(getVideoWidth());
            sb.append(",video_height=");
            sb.append(getVideoHeight());
            sb.append(",player_status_nodes=");
            sb.append(getPlayerEvent());
            sb.append(",play_start_resolution_code=");
            sb.append(this.mConfig.aI);
            sb.append(",exp_id=");
            sb.append(getExperienceId());
            sb.append(",exp_release_id=");
            sb.append(getExperienceReleaseId());
            sb.append(",exp_bucket_id=");
            sb.append(getExperienceBuctetId());
            sb.append(",play_start_video_width=");
            sb.append(this.mPlayStartVideoWidth);
            sb.append(",play_start_video_height=");
            sb.append(this.mPlayStartVideoHeight);
            sb.append(",play_time_1080p=");
            sb.append(getPlayTimeByVideoResolution(VIDEO_RESOLUTION_1080P));
            sb.append(",play_time_720p=");
            sb.append(getPlayTimeByVideoResolution(VIDEO_RESOLUTION_720P));
            sb.append(",play_time_2k=");
            sb.append(getPlayTimeByVideoResolution("2k"));
            sb.append(",play_time_over2k=");
            sb.append(getPlayTimeByVideoResolution(VIDEO_RESOLUTION_over2k));
            sb.append(",video_rendering_stalled_count_new_720p=");
            sb.append(getRenderingStalledCountNewByVideoResolution(VIDEO_RESOLUTION_720P));
            sb.append(",video_rendering_stalled_count_new_1080p=");
            sb.append(getRenderingStalledCountNewByVideoResolution(VIDEO_RESOLUTION_1080P));
            sb.append(",video_rendering_stalled_count_new_2k=");
            sb.append(getRenderingStalledCountNewByVideoResolution("2k"));
            sb.append(",video_rendering_stalled_count_new_over2k=");
            sb.append(getRenderingStalledCountNewByVideoResolution(VIDEO_RESOLUTION_over2k));
            if (!StringUtils.isEmpty(this.mSeamlessSwitchStatusAll)) {
                sb.append(",switch_status=");
                sb.append(this.mSeamlessSwitchStatusAll);
            }
            if (this.mEnableRtcSwitch) {
                sb.append(",play_time_ud=");
                sb.append(this.mPlayTimeUd);
                sb.append(",play_time_hd=");
                sb.append(this.mPlayTimeHd);
                sb.append(",first_switch_hd_reason=");
                sb.append(this.mFirstSwitchDownReason);
                sb.append(",artc_switch_count=");
                sb.append(this.mArtcSwitchCount);
                sb.append(",artc_abr_switch_up_count=");
                sb.append(this.mArtcAbrSwitchUpCount);
                sb.append(",artc_abr_switch_down_count=");
                sb.append(this.mArtcAbrSwitchDownCount);
                sb.append(",artc_abr_request_switch_up_count=");
                sb.append(this.mArtcAbrRequestSwitchUpCount - this.mArtcAbrRedundantRequestSwitchUpCount);
                sb.append(",artc_abr_request_switch_down_count=");
                sb.append(this.mArtcAbrRequestSwitchDownCount - this.mArtcAbrRedundantRequestSwitchDownCount);
                sb.append(",artc_abr_redundant_request_switch_up_count=");
                sb.append(this.mArtcAbrRedundantRequestSwitchUpCount);
                sb.append(",artc_abr_redundant_request_switch_down_count=");
                sb.append(this.mArtcAbrRedundantRequestSwitchDownCount);
                sb.append(",artc_abr_total_request_switch_up_count=");
                sb.append(this.mArtcAbrTotalRequestSwitchUpCount);
                sb.append(",artc_abr_total_request_switch_down_count=");
                sb.append(this.mArtcAbrTotalRequestSwitchDownCount);
                sb.append(",artc_switch_up_count=");
                sb.append(this.mArtcSwitchUpCount);
                sb.append(",artc_switch_down_count=");
                sb.append(this.mArtcSwitchDownCount);
                sb.append(",artc_switch_suc_count=");
                sb.append(this.mArtcSwitchSucCount);
                sb.append(",artc_switch_up_suc_count=");
                sb.append(this.mArtcSwitchUpSucCount);
                sb.append(",artc_switch_down_suc_count=");
                sb.append(this.mArtcSwitchDownSucCount);
                sb.append(",artc_switch_up_sync_suc_count=");
                sb.append(this.mArtcSwitchUpSyncSucCount);
                sb.append(",artc_switch_up_sync_err_count=");
                sb.append(this.mArtcSwitchUpSyncErrCount);
                sb.append(",artc_switch_down_sync_suc_count=");
                sb.append(this.mArtcSwitchDownSyncSucCount);
                sb.append(",artc_switch_down_sync_err_count=");
                sb.append(this.mArtcSwitchDownSyncErrCount);
                sb.append(",artc_switch_suc_total_time=");
                sb.append(this.mArtcSwitchSucTotalTime);
                sb.append(",artc_switch_up_suc_total_time=");
                sb.append(this.mArtcSwitchUpSucTotalTime);
                sb.append(",artc_switch_down_suc_total_time=");
                sb.append(this.mArtcSwitchDownSucTotalTime);
                sb.append(",artc_switch_up_ts_delta=");
                sb.append(this.mArtcSwitchUpTsDelta);
                sb.append(",artc_switch_down_ts_delta=");
                sb.append(this.mArtcSwitchDownTsDelta);
                sb.append(",artc_abr_switch_reasons=");
                sb.append(getRtcLiveAbrReason());
                sb.append(",artc_switch=");
                sb.append(this.mEnableRtcSwitch ? "1" : "0");
            }
            sb.append(",error_code_new=");
            TaobaoMediaPlayer taobaoMediaPlayer2 = (TaobaoMediaPlayer) this;
            sb.append(taobaoMediaPlayer2._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ERROR_CODE_NEW, 0L));
            sb.append(",error_code_sub=");
            sb.append(taobaoMediaPlayer2._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ERROR_CODE_SUB, 0L));
            if (this.mDynamicPlayExMap.size() > 0) {
                for (Map.Entry<String, String> entry : this.mDynamicPlayExMap.entrySet()) {
                    if (com.taobao.taobaoavsdk.util.b.b(entry.getKey(), this.mValidDynamicPlayList) && !snv.EXP_KEY_SUB_BUSINESS_TYPE.equals(entry.getKey()) && !"vod_scenario".equals(entry.getKey()) && !"videoActionType".equals(entry.getKey())) {
                        sb.append(",");
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(entry.getValue());
                    }
                }
            }
            if (this.mActiveDataSource != null && sb != null) {
                sb.append(",exp=");
                sb.append(this.mActiveDataSource.c);
            }
            try {
                commitStat19997("Page_Video", CT.Button, RTCSTREAM_MAIDIAN_INFO, sb.toString());
            } catch (Throwable unused) {
            }
        }
        synchronized (this.mLock) {
            this.mBeatCount = 0;
            if (this.mHandler != null) {
                this.bPaused = false;
                this.mExit = true;
                commitPlaying();
                this.bPaused = true;
                this.mExit = false;
                this.mHandler.removeCallbacksAndMessages(null);
                this.mHandler = null;
                this.mUTRun = null;
                this.mHeartBeatCount = 0L;
            }
        }
        releaseWatchHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorRenderSecondStart(long j) {
        this.mWatchPhase = 2;
        this.bSecondFrameRendered = true;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        this.mSecondEndtime = j;
        long j2 = this.mStartTime;
        this.mSecondRenderTime = (j2 <= 0 || this.mSecondEndtime - j2 < 0) ? this.mSecondEndtime - this.mPrepareStartTime : this.mPreparedTime + (this.mSecondEndtime - this.mStartTime);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void monitorRenderStart(long r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.monitorRenderStart(long):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorReset() {
        this.mEnableVPM = false;
        this.mState = 0;
        this.mRotate = 0;
        this.mReuseFlag = false;
        this.mFirstRenderRecvTime = 0L;
        this.mLastCommitPlaying = 0L;
        this.mWarmupStartTime = 0L;
        this.mWarmupEndTime = 0L;
        this.mEnableVFPlugin = false;
        this.mEnableMediacodecOpengl = false;
        this.mWatchExceedNum1 = 0L;
        this.mWatchExceedTime1 = 0L;
        this.mWatchExceedNum2 = 0L;
        this.mWatchExceedTime2 = 0L;
        this.mSeamlessSwitchStatus = -1;
        this.mSeamlessSwitchIndex = 0;
        this.mSeekStart = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorRtcAdaptionTraceData(String str) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.mArtcTraceDataIndex++;
            commitStat19997("Page_Video", CT.Button, "RtcLiveAdaptionData", "playToken=" + this.mConfigClone.t, "feedId=" + this.mConfigClone.B, "traceData=" + str, "traceLocalTime=" + jSONObject.optString("localTime"), "traceIndex=" + this.mArtcTraceDataIndex, "switchUpCount=" + this.mArtcSwitchUpCount, "switchDownCount=" + this.mArtcSwitchDownCount, "abrSwitchUpCount=" + this.mArtcAbrSwitchUpCount, "abrSwitchDownCount=" + this.mArtcAbrSwitchDownCount);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "monitorRtcAdaptionTraceData " + str + ", error: " + th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorRtcAudioTrackBufferEnd() {
        synchronized (this.mTimeLock) {
            if (this.mRtcAudioTrackBufferStart > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.mRtcAudioTrackBufferStart;
                if (currentTimeMillis > 0) {
                    this.mRtcAudioTrackBufferCount++;
                    this.mRtcAudioTrackBufferTotalTime += currentTimeMillis;
                }
            }
            this.mRtcAudioTrackBufferStart = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorRtcAudioTrackBufferStart() {
        this.mRtcAudioTrackBufferStart = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorRtcCommonTraceInfo(String str) {
        String next;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            String optString = jSONObject.optString("traceType");
            if (StringUtils.isEmpty(optString)) {
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "monitorRtcCommonTraceInfo: " + str);
            String str2 = "pageName=" + l.getInstance().getCurrentPageName();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = str2 + ",";
                str2 = ((str3 + keys.next()) + "=") + jSONObject.get(next);
            }
            long j = this.mTotalPlayTime;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.mLastPlayTime) {
                j += currentTimeMillis - this.mLastPlayTime;
            }
            String[] strArr = new String[9];
            strArr[0] = "playToken=" + this.mConfigClone.t;
            strArr[1] = "accountId=" + this.mConfigClone.C;
            strArr[2] = "feedId=" + this.mConfigClone.B;
            strArr[3] = "playTime=" + j;
            strArr[4] = "subBusinessType=" + this.mConfigClone.y;
            strArr[5] = "switchReason=" + getLastStreamSelectReason();
            StringBuilder sb = new StringBuilder();
            sb.append("autoSwitch=");
            sb.append(this.mRtcLiveAutoSwitch ? "1" : "0");
            strArr[6] = sb.toString();
            strArr[7] = "abtestId=" + getDynamicPlayExParam("adaption_abtest_id");
            strArr[8] = str2;
            if (!StringUtils.equals(optString, "0")) {
                return;
            }
            commitStat19997("Page_Video", CT.Button, "RtcLiveSwitchStream", strArr);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "monitorRtcCommonTraceInfo " + str + ", error: " + th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: Throwable -> 0x01fd, TryCatch #0 {Throwable -> 0x01fd, blocks: (B:5:0x0007, B:7:0x0019, B:12:0x0028, B:16:0x0035, B:21:0x0048, B:22:0x0053, B:23:0x005d, B:24:0x007b, B:26:0x0081, B:27:0x00cc, B:29:0x00d8, B:30:0x00dc, B:34:0x0183, B:37:0x01cb), top: B:42:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[Catch: Throwable -> 0x01fd, TryCatch #0 {Throwable -> 0x01fd, blocks: (B:5:0x0007, B:7:0x0019, B:12:0x0028, B:16:0x0035, B:21:0x0048, B:22:0x0053, B:23:0x005d, B:24:0x007b, B:26:0x0081, B:27:0x00cc, B:29:0x00d8, B:30:0x00dc, B:34:0x0183, B:37:0x01cb), top: B:42:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: Throwable -> 0x01fd, LOOP:0: B:24:0x007b->B:26:0x0081, LOOP_END, TryCatch #0 {Throwable -> 0x01fd, blocks: (B:5:0x0007, B:7:0x0019, B:12:0x0028, B:16:0x0035, B:21:0x0048, B:22:0x0053, B:23:0x005d, B:24:0x007b, B:26:0x0081, B:27:0x00cc, B:29:0x00d8, B:30:0x00dc, B:34:0x0183, B:37:0x01cb), top: B:42:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8 A[Catch: Throwable -> 0x01fd, TryCatch #0 {Throwable -> 0x01fd, blocks: (B:5:0x0007, B:7:0x0019, B:12:0x0028, B:16:0x0035, B:21:0x0048, B:22:0x0053, B:23:0x005d, B:24:0x007b, B:26:0x0081, B:27:0x00cc, B:29:0x00d8, B:30:0x00dc, B:34:0x0183, B:37:0x01cb), top: B:42:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void monitorRtcSwitch(java.lang.String r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.monitorRtcSwitch(java.lang.String, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorRtcVideoTrackBufferEnd() {
        synchronized (this.mTimeLock) {
            if (this.mRtcVideoTrackBufferStart > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.mRtcVideoTrackBufferStart;
                if (currentTimeMillis > 0) {
                    this.mRtcVideoTrackBufferCount++;
                    this.mRtcVideoTrackBufferTotalTime += currentTimeMillis;
                }
            }
            this.mRtcVideoTrackBufferStart = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorRtcVideoTrackBufferStart() {
        this.mRtcVideoTrackBufferStart = System.currentTimeMillis();
        monitorPlayerEvent(40);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorSeamlessSwitchFailed(long j, long j2) {
        monitorPlayerEvent(31);
        this.mSwitchFailCounter++;
        this.mSeamlessSwitchStatus = 1;
        commitSeamlessSwitchStats(j, j2, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorSeamlessSwitchSucc(long j, long j2) {
        if (this.mEnableRtcSwitch) {
            boolean z = "ud".equals(this.mPlayingLiveDefinition) || MediaConstant.DEFINITION_UD_60.equals(this.mPlayingLiveDefinition);
            AVSDKLog.e("AVDSK", "monitorSeamlessSwitchSucc rtc_switch sync_code: " + j2 + ", use_time:" + j + ", downSwitch:" + z);
            this.mArtcSwitchSucCount = this.mArtcSwitchSucCount + 1;
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.mArtcSwitchSucTotalTime;
            long j4 = this.mSeamlessSwitchStartTime;
            this.mArtcSwitchSucTotalTime = j3 + (currentTimeMillis - j4);
            if (z) {
                this.mArtcSwitchDownSucCount++;
                this.mArtcSwitchDownSucTotalTime += currentTimeMillis - j4;
                int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i == 0) {
                    this.mArtcSwitchDownSyncSucCount++;
                } else if (i > 0) {
                    this.mArtcSwitchDownSyncErrCount++;
                }
            } else {
                this.mArtcSwitchUpSucCount++;
                this.mArtcSwitchUpSucTotalTime += currentTimeMillis - j4;
                int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i2 == 0) {
                    this.mArtcSwitchUpSyncSucCount++;
                } else if (i2 > 0) {
                    this.mArtcSwitchUpSyncErrCount++;
                }
            }
        }
        monitorPlayerEvent(30);
        this.mSwitchSuccCounter++;
        boolean z2 = j2 > 0;
        if (z2) {
            this.mSwitchForceSuccCounter++;
        }
        this.mSeamlessSwitchStatus = 1;
        commitSeamlessSwitchStats(j, 0L, z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorSeek() {
        if (this.mDisableFixSeekCount || !(this instanceof TaobaoMediaPlayer)) {
            this.mSeekCount++;
        }
        this.bSeeked = true;
        monitorPlayerEvent(5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorSeekEnd(long j) {
        com.taobao.taobaoavsdk.Tracer.b.c(this.mAnalysis, "SEEK");
        onRenderingResumed();
        if (this.mEnableRenderStallCalNew) {
            onRenderingResumedV2();
        }
        checkStatRenderStallFlag();
        long j2 = this.mSeekStart;
        if (j2 <= 0 || j <= j2) {
            return;
        }
        long j3 = j - j2;
        this.seekTimeList.add(Long.valueOf(j3));
        if (j3 > this.maxSeekTime) {
            this.maxSeekTime = j3;
        }
        this.mSeekTime += j3;
        this.mSeekStart = 0L;
        this.mLastRenderVideoEveryFrame = 0L;
        this.mLastMonitorRenderSystemTime = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorSeekStart(long j) {
        com.taobao.taobaoavsdk.Tracer.b.a(this.mAnalysis, "SEEK");
        if (this.bFirstFrameRendered) {
            this.mSeekStart = j;
            if (!this.mDisableFixSeekCount) {
                this.mSeekCount++;
            }
            onRenderStalledWhenStateChanged(2);
            if (this.mEnableRenderStallCalNew) {
                onRenderStalledWhenStateChangedNew();
            }
            this.mLastRenderVideoEveryFrame = 0L;
            this.mLastMonitorRenderSystemTime = 0L;
        }
        checkStatRenderStallFlag();
        onRenderingHung();
        if (this.mEnableRenderStallCalNew) {
            onRenderingHungV2();
        }
    }

    public void monitorSetAudiOff() {
        monitorPlayerEvent(25);
    }

    public void monitorSetAudioOn() {
        monitorPlayerEvent(26);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void monitorSoftwareByFallBack() {
        oyu.l++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorStart() {
        com.taobao.taobaoavsdk.Tracer.b.a(this.mAnalysis, "PLAYING");
        this.mDebugStatus = "Start";
        AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "monitorStart sys:" + System.currentTimeMillis());
        this.mStartTime = System.currentTimeMillis();
        if (this.mFirstPlayTime == 0) {
            this.mFirstPlayTime = this.mStartTime;
        }
        if (this.mCacheLengthAtStart == -1) {
            WeakReference<Context> weakReference = this.mContextRef;
            this.mCacheLengthAtStart = oyu.a(weakReference == null ? null : weakReference.get(), this.mConfig.r, this.mPlayUrl);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mCacheLengthAtStart=" + this.mCacheLengthAtStart + ", cachekey=" + this.mConfig.r + ", mPlayUrl=" + this.mPlayUrl);
        }
        monitorPlayerEvent(2);
        onRenderingResumed();
        if (this.mEnableRenderStallCalNew) {
            onRenderingResumedV2();
        }
        this.bPaused = false;
        checkStatRenderStallFlag();
        com.taobao.taobaoavsdk.Tracer.b.c(this.mAnalysis, "PLAYING");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorStartPlayInBackground() {
        this.mLastBgPlayTime = System.currentTimeMillis();
        this.mPlayInPIP = true;
        this.mTotalBgCount++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorStartPlayWithFloatWindow() {
        this.mLastFloatWindowsPlayTime = System.currentTimeMillis();
        this.mTotalFloatWindowsCount++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorSwitchLiveLevel(int i) {
        if (i == 1) {
            monitorPlayerEvent(36);
        } else if (i != -1) {
        } else {
            monitorPlayerEvent(37);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorTriggerSwitchFromRtc() {
        monitorPlayerEvent(41);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorVideoRenderEveryFrame(long j) {
        double d;
        int i;
        int i2;
        double d2;
        int i3;
        if (this.bPaused || this.mSeekStart > 0 || this.mLastErrorCode != 0 || ((oyu.a() && !this.mIsFloatWindow) || ((!this.mEnableStatRenderStallInNonVisible && !this.mViewIsVisible) || (!this.mEnableStatRenderStallInNonSurface && this.mSurface == null)))) {
            this.mLastRenderVideoEveryFrame = 0L;
            if (oyu.a() == this.mIsBackground) {
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " monitorVideoRenderEveryFrame ApplicationUtils.isRunBackground() is not equal!!!");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        monitorVideoRenderEveryFrameOld(currentTimeMillis);
        if (!this.isFirstFrameRendered) {
            this.mTD = j;
            this.mT = currentTimeMillis;
            this.isFirstFrameRendered = true;
            this.mTn = currentTimeMillis;
            this.mTDn = j;
            AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SYNC monitorVideoRenderEveryFrameT=" + this.mT + "TD=" + this.mTD);
            return;
        }
        long j2 = this.mT;
        if (j2 == -9999) {
            long j3 = currentTimeMillis - this.mResumeTs;
            this.mT = currentTimeMillis;
            this.mTD = j;
            d = j3 > ((long) this.mMaxRenderAbnormalInRenderThread) ? j3 : -1.0d;
            d2 = mto.a.GEO_NOT_SUPPORT;
            i2 = 0;
        } else {
            long abs = Math.abs((currentTimeMillis - j2) - (j - this.mTD));
            long j4 = this.mTDn;
            if (j > j4 || !this.mEnableAddUnorderedStall) {
                long j5 = this.mT;
                long j6 = this.mTD;
                int i4 = this.mMaxRenderAbnormalInRenderThread;
                if ((currentTimeMillis - j5) - (j - j6) > i4) {
                    this.mTotalRenderIntervalDiff += abs;
                    d = (currentTimeMillis - j5) - (j - j6);
                    if (this.mUsePlayRateCalSubStall) {
                        int i5 = this.mRtcTotalCount;
                        this.mRtcPlayRate = i5 != 0 ? this.mRtcTotalRate / i5 : 1.0f;
                        float f = this.mRtcPlayRate;
                        if (f == 0.0f) {
                            f = 1.0f;
                        }
                        this.mRtcPlayRate = f;
                        if (((float) (currentTimeMillis - this.mT)) - (((float) (j - this.mTD)) / this.mRtcPlayRate) < this.mMaxRenderAbnormalInRenderThread) {
                            this.mRtcStrategicAbnormalCount++;
                            this.mRtcStrategicAbnormalTime = (long) (this.mRtcStrategicAbnormalTime + d);
                            this.mRtcTotalRate = 0.0f;
                            this.mRtcTotalCount = 0;
                            this.mT = currentTimeMillis;
                            this.mTD = j;
                            d = mto.a.GEO_NOT_SUPPORT;
                        }
                    }
                    i = 1;
                } else {
                    long j7 = this.mTn;
                    if (currentTimeMillis - j7 > i4) {
                        d = currentTimeMillis - j7;
                        i = 2;
                    } else {
                        d = -1.0d;
                        i = 0;
                    }
                }
            } else {
                d = j4 - j;
                if (j == j4) {
                    this.duplicateFrameCount++;
                }
                i = 4;
            }
            if (this.mTn != -9999 && this.mTDn != -9999 && j > 0 && currentTimeMillis > 0) {
                monitorAbnormalRenderSpeed(currentTimeMillis, j);
            }
            i2 = i;
            d2 = mto.a.GEO_NOT_SUPPORT;
        }
        if (d > d2 || i2 == 4) {
            if (!this.mIsFirstRenderStalledPtsRecorded) {
                this.mFirstRenderStalledPts = j;
                this.mIsFirstRenderStalledPtsRecorded = true;
            }
            double abs2 = Math.abs(d);
            if (abs2 > currentTimeMillis - this.mLastPlayTime) {
                i3 = 0;
            } else if (this.mCalRenderStalledByDivided) {
                i3 = 0;
                onRenderStalledNew_43833053_byDivided((int) Math.ceil(abs2 / this.mMaxRenderAbnormalInRenderThread), abs2, i2, -1);
            } else {
                i3 = 0;
                onRenderStalledNew_43833053(abs2, i2, -1);
            }
            this.mT = currentTimeMillis;
            this.mTD = j;
            this.mRtcTotalRate = 0.0f;
            this.mRtcTotalCount = i3;
        }
        this.mTn = currentTimeMillis;
        this.mTDn = j;
        colloectMoreRenderStallInfo();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorVideoRenderEveryFrameNew(long j) {
        if (this.bPaused || this.mSeekStart > 0 || this.mLastErrorCode != 0 || ((oyu.a() && !this.mIsFloatWindow) || ((!this.mEnableStatRenderStallInNonVisible && !this.mViewIsVisible) || (!this.mEnableStatRenderStallInNonSurface && this.mSurface == null)))) {
            this.mLastMonitorRenderSystemTime = 0L;
            return;
        }
        updateFpsIntervalForStalledCal();
        long currentTimeMillis = System.currentTimeMillis();
        this.mLastMonitorRenderSystemTime = currentTimeMillis;
        if (!this.mIsFirstFrameRenderedNewUpdate) {
            this.mLastFrameRenderSystemTime = currentTimeMillis;
            this.mLastStalledFrameRenderSystemTime = currentTimeMillis;
            this.mLastFramePts = j;
            this.mLastStalledFrameFramePts = j;
            this.mIsFirstFrameRenderedNewUpdate = true;
            return;
        }
        if (this.mLastStalledFrameRenderSystemTime == -9999) {
            long j2 = currentTimeMillis - this.mResumeTsNew;
            this.mLastStalledFrameRenderSystemTime = currentTimeMillis;
            this.mLastStalledFrameFramePts = j;
            if (this.mResumeTsNew > 0 && j2 > this.mMaxRenderAbnormalInRenderThread && j2 < Math.min(System.currentTimeMillis() - this.mLastPlayTime, 1000000000L)) {
                long floor = ((long) Math.floor(j2 / this.mSourceFpsInterval)) - 1;
                this.mVideoRenderingStalledCountNewUpdate += floor;
                this.mVideoRenderingStalledCountNewUpdate_r2 += floor;
                double d = floor;
                if (d > this.mMaxStalledCountInInterval) {
                    this.mMaxStalledCountInInterval = d;
                }
            }
        } else {
            if (j <= this.mLastFramePts) {
                this.mDisorderFrameCountNew++;
                this.mVideoRenderingStalledCountNewUpdate += 30;
                this.mVideoRenderingStalledCountNewUpdate_r3 += 30;
            } else {
                long j3 = (currentTimeMillis - this.mLastStalledFrameRenderSystemTime) - (j - this.mLastStalledFrameFramePts);
                if (this.mIsInDelayStallInterval || (!this.mIsInDelayStallInterval && j3 > this.mMaxRenderAbnormalInRenderThread)) {
                    if (!this.mIsInDelayStallInterval) {
                        this.mDelayTimeAtDelayBegin = j3;
                        this.mSystemTimeAtDelayBegin = currentTimeMillis;
                        this.mIsInDelayStallInterval = true;
                    }
                    if (j3 > this.mMaxRenderAbnormalInRenderThread) {
                        this.mStalledCountInDelayState++;
                    } else {
                        this.mFrameCountRecoverInDelayState++;
                    }
                    this.mFrameCountInDelayState++;
                    if (currentTimeMillis - this.mSystemTimeAtDelayBegin > 500 && this.mFrameCountInDelayState >= 10) {
                        this.mTotalDelayTime += currentTimeMillis - this.mSystemTimeAtDelayBegin;
                        if (j3 * 1.1d <= this.mDelayTimeAtDelayBegin) {
                            this.mVideoRenderingStalledCountNewUpdate += this.mStalledCountInDelayState;
                            this.mVideoRenderingStalledCountNewUpdate_r1 += this.mStalledCountInDelayState;
                            if (this.mStalledCountInDelayState > this.mMaxStalledCountInDelay) {
                                this.mMaxStalledCountInDelay = this.mStalledCountInDelayState;
                            }
                            this.mStalledCountInDelayState = 0L;
                            this.mSystemTimeAtDelayBegin = 0L;
                            this.mDelayTimeAtDelayBegin = 0L;
                            this.mIsInDelayStallInterval = false;
                        } else {
                            this.mSystemTimeAtDelayBegin = currentTimeMillis;
                            this.mDelayTimeAtDelayBegin = j3;
                        }
                        this.mFrameCountInDelayState = 0L;
                    }
                } else if (currentTimeMillis - this.mLastFrameRenderSystemTime > this.mMaxRenderAbnormalInRenderThread && currentTimeMillis - this.mLastFrameRenderSystemTime < Math.min(System.currentTimeMillis() - this.mLastPlayTime, 1000000000L)) {
                    long floor2 = ((long) Math.floor((currentTimeMillis - this.mLastFrameRenderSystemTime) / this.mSourceFpsInterval)) - 1;
                    this.mVideoRenderingStalledCountNewUpdate += floor2;
                    this.mVideoRenderingStalledCountNewUpdate_r2 += floor2;
                    double d2 = floor2;
                    if (d2 > this.mMaxStalledCountInInterval) {
                        this.mMaxStalledCountInInterval = d2;
                    }
                } else if (j - this.mLastFramePts > this.mMaxRenderAbnormalInRenderThread) {
                    this.mVideoRenderingStalledCountNewUpdate++;
                    this.mVideoRenderingStalledCountNewUpdate_r4++;
                }
            }
            this.mLastStalledFrameFramePts = j;
            this.mLastStalledFrameRenderSystemTime = currentTimeMillis;
        }
        this.mLastFramePts = j;
        this.mLastFrameRenderSystemTime = currentTimeMillis;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorVideoRenderNormal() {
        if (this.mState != 10) {
            monitorPlayerEvent(10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorVideoRenderStalled(long j) {
        if (this.mConfig == null || !this.bFirstFrameRendered) {
            return;
        }
        com.taobao.taobaoavsdk.Tracer.b.b(this.mAnalysis, "VIDEO_STALL");
        monitorPlayerEvent(9);
        this.videoRenderingStalledCount++;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        this.videoRenderingStalledTotalDuration += i > 0 ? j : 0L;
        if (this.mConfig.b != 0) {
            return;
        }
        this.videoRenderingStalledCount_live++;
        long j2 = this.videoRenderingStalledTotalDuration_live;
        if (i <= 0) {
            j = 0;
        }
        this.videoRenderingStalledTotalDuration_live = j2 + j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorVideoRotateChange(int i) {
        this.mRotate = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void monitorWarmup(long j) {
        this.mWarmupEndTime = System.currentTimeMillis();
        this.mWarmupReceiveBytes = j;
        AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "monitorWarmup sys:" + this.mWarmupEndTime + ",receiveBytes=" + this.mWarmupReceiveBytes);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
        if (r8.mServerIP.contains(":") != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void notifyHttpDnsAdapterConnectionEvent() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.notifyHttpDnsAdapterConnectionEvent():void");
    }

    protected void onRenderStalledNew_43833053(double d, int i, int i2) {
        this.videoRenderingStalledCountNew_43833053++;
        this.videoRenderingStalledTotalDurationNew_43833053 = (long) (this.videoRenderingStalledTotalDurationNew_43833053 + d);
        if (i == 1 || i == 3) {
            this.videoRenderingStalledCountNew_43833053_r1++;
            this.videoRenderingStalledTotalDurationNew_43833053_r1 = (long) (this.videoRenderingStalledTotalDurationNew_43833053_r1 + d);
        } else if (i == 4) {
            this.videoRenderingStalledCountNew_43833053_r2++;
            this.videoRenderingStalledTotalDurationNew_43833053_r2 = (long) (this.videoRenderingStalledTotalDurationNew_43833053_r2 + d);
        }
        if (i2 >= 0 && i2 < 3) {
            long[] jArr = this.videoRenderingStalledCountNew_43833053_reasons;
            jArr[i2] = jArr[i2] + 1;
        }
        this.monitorNewStalled = true;
        getMoreRenderStallInfoIfNeeded();
    }

    protected void onRenderStalledNew_43833053_byDivided(int i, double d, int i2, int i3) {
        long j = i;
        this.videoRenderingStalledCountNew_43833053 += j;
        this.videoRenderingStalledTotalDurationNew_43833053 = (long) (this.videoRenderingStalledTotalDurationNew_43833053 + d);
        if (i2 == 1 || i2 == 3) {
            this.videoRenderingStalledCountNew_43833053_r1 += j;
            this.videoRenderingStalledTotalDurationNew_43833053_r1 = (long) (this.videoRenderingStalledTotalDurationNew_43833053_r1 + d);
        } else if (i2 == 4) {
            this.videoRenderingStalledCountNew_43833053_r2 += j;
            this.videoRenderingStalledTotalDurationNew_43833053_r2 = (long) (this.videoRenderingStalledTotalDurationNew_43833053_r2 + d);
        }
        if (i3 >= 0 && i3 < 3) {
            long[] jArr = this.videoRenderingStalledCountNew_43833053_reasons;
            jArr[i3] = jArr[i3] + j;
        }
        this.monitorNewStalled = true;
        getMoreRenderStallInfoIfNeeded();
    }

    protected void onRenderStalledWhenStateChanged(int i) {
        if (this instanceof TaobaoMediaPlayer) {
            ((TaobaoMediaPlayer) this)._notifyVideoRenderStateChange();
        }
        if (this.bPaused || this.mSeekStart > 0 || this.mLastErrorCode != 0 || oyu.a()) {
            AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "skip stat with pause/seekFlg/error, pts:" + System.currentTimeMillis());
        } else if (this.mLastRenderVideoEveryFrame <= 0) {
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.mLastRenderVideoEveryFrame;
            int i2 = this.mMaxRenderAbnormalInRenderThread;
            if (currentTimeMillis <= i2) {
                return;
            }
            this.videoRenderingStalledCountInRenderThread++;
            this.videoRenderingStalledTotalDurationInRenderThread += currentTimeMillis;
            if (this.mCalRenderStalledByDivided) {
                onRenderStalledNew_43833053_byDivided(((int) currentTimeMillis) / i2, currentTimeMillis, 3, i);
            } else {
                onRenderStalledNew_43833053(currentTimeMillis, 3, i);
            }
        }
    }

    protected void onRenderStalledWhenStateChangedNew() {
        if (this.bPaused || this.mSeekStart > 0 || this.mLastErrorCode != 0 || oyu.a()) {
            AVSDKLog.d(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onRenderStalledWhenStateChangedNew skip stat with pause/seekFlg/error, pts:" + System.currentTimeMillis());
        } else if (this.mLastMonitorRenderSystemTime <= 0) {
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.mLastMonitorRenderSystemTime;
            if (currentTimeMillis <= this.mMaxRenderAbnormalInRenderThread || currentTimeMillis >= Math.min(System.currentTimeMillis() - this.mLastPlayTime, 1000000000L)) {
                return;
            }
            updateFpsIntervalForStalledCal();
            long floor = (long) (Math.floor(currentTimeMillis / this.mSourceFpsInterval) - 1.0d);
            this.mVideoRenderingStalledCountNewUpdate += floor;
            this.mVideoRenderingStalledCountNewUpdate_r2 += floor;
            double d = floor;
            if (d <= this.mMaxStalledCountInInterval) {
                return;
            }
            this.mMaxStalledCountInInterval = d;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRenderingHung() {
        if (!this.isFirstFrameRendered) {
            return;
        }
        this.mT = -9999L;
        this.mTD = -9999L;
        this.mTn = -9999L;
        this.mTDn = -9999L;
        this.mResumeTs = -9999L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRenderingHungV2() {
        if (!this.mIsFirstFrameRenderedNewUpdate) {
            return;
        }
        updateDelayStalledV2WhenEnd();
        this.mLastStalledFrameFramePts = -9999L;
        this.mLastStalledFrameRenderSystemTime = -9999L;
        this.mLastFramePts = -9999L;
        this.mLastFrameRenderSystemTime = -9999L;
        this.mResumeTsNew = -9999L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRenderingResumed() {
        if (!this.isFirstFrameRendered) {
            return;
        }
        this.mResumeTs = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRenderingResumedV2() {
        if (!this.mIsFirstFrameRenderedNewUpdate) {
            return;
        }
        this.mResumeTsNew = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String parseValueFromString(String str, String str2, String str3) {
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str) || StringUtils.isEmpty(str3)) {
            return null;
        }
        String[] split = str2.split(str3);
        for (String str4 : split) {
            if (str4.contains(str)) {
                return str4.substring(str4.indexOf("=") + 1);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String replaceValueForKey(String str, String str2, String str3, String str4, int i) {
        if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str) || StringUtils.isEmpty(str4)) {
            return str3;
        }
        String[] split = str3.split(str4);
        StringBuilder sb = i > 0 ? new StringBuilder(i) : new StringBuilder();
        boolean z = false;
        for (int i2 = 0; i2 < split.length; i2++) {
            String str5 = split[i2];
            if (str5.contains(str) && str5.indexOf("=") != -1) {
                if (str5.startsWith(str + "=")) {
                    str5 = str + "=" + str2;
                    z = true;
                }
            }
            sb.append(str5);
            if (i2 < split.length - 1) {
                sb.append(str4);
            }
        }
        if (!z) {
            if (sb.length() > 0) {
                sb.append(str4);
            }
            sb.append(str);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }

    synchronized void resetHWContinousDecodeErrorCount() {
        if (oyu.m > 0) {
            oyu.m = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void resetSoftwareByFallBackCount() {
        if (oyu.l > 0) {
            oyu.l = 0;
        }
    }

    public void setABtestAdapter(ddb ddbVar) {
        this.mAbTestAdapter = ddbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setActiveDataSource(g gVar) {
        this.mActiveDataSource = gVar;
    }

    public void setAudioClip(boolean z) {
        this.mEnableAudioClip = z;
    }

    public void setAudioGainCoef(float f) {
        this.mAudioGainCoef = f;
    }

    public void setAudioGainEnable(boolean z) {
        this.mEnableAudioGain = z;
    }

    public void setAutoPause(boolean z) {
        this.pauseByTelephone = z;
    }

    public int setConfig(com.taobao.taobaoavsdk.widget.media.c cVar) {
        this.mConfig = cVar;
        this.mConfigClone = cVar;
        this.bPauseInBackground = cVar.X;
        if (this.mConfig != null && this.mConfig.x != null) {
            this.AppMonitor_Module = this.mConfig.x.replaceAll(" ", "").equals(MediaConstant.LBLIVE_SOURCE) ? "TBMediaPlayerBundle-android" : "TBMediaPlayerBundle-video";
        }
        this.mAnalysis = this.mConfig.bi;
        this.mUsingInterface = cVar.as;
        checkFromIsValid(cVar);
        this.mValidDynamicPlayList = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_VALID_DYNAMIC_PLAYEX_LIST, "*");
        return 0;
    }

    public void setDegradeCode(int i, String str) {
        this.mDegradeCode = i;
        this.mOriginSelectedUrlName = str;
    }

    public void setDegradeFlvReason(int i) {
        this.mSelectFlvUrlReason = i;
    }

    public void setDynamicPlayExParam(String str) {
        HashMap<String, String> b;
        if (!StringUtils.isEmpty(str) && (b = com.taobao.taobaoavsdk.util.b.b(str, ",", "=")) != null && b.size() > 0) {
            if (this.mDynamicPlayExMap == null) {
                this.mDynamicPlayExMap = new HashMap<>();
            }
            this.mDynamicPlayExMap.putAll(b);
        }
    }

    public void setExtInfo(Map<String, String> map) {
        this.mExtInfo = map;
    }

    public void setFirstRenderAdapter(dde ddeVar) {
        if (ddeVar != null) {
            this.mFirstRenderAdapterRef = new WeakReference<>(ddeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void setForceSelectH264ForH265HWFailed(boolean z) {
        if (com.taobao.taobaoavsdk.util.b.a(this.mConfigAdapter != null ? this.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SELECT_H264_WHEN_H265_HW_FAILED, "true") : "true")) {
            oyu.n = z;
        }
    }

    public void setFov(float f, float f2, float f3) {
    }

    public void setH264AuthenStrategy(H264AuthenStrategy h264AuthenStrategy) {
        this.mH264AuthenStrategy = h264AuthenStrategy;
    }

    public void setH265AuthenStrategy(H265AuthenStrategy h265AuthenStrategy) {
        this.mH265AuthenStrategy = h265AuthenStrategy;
    }

    public void setInnerStartFuncListener(InnerStartFuncListener innerStartFuncListener) {
        this.mInnerStartFuncListener = innerStartFuncListener;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z) {
        this.bLooping = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMediaCodeError(int i, int i2) {
        if (this.mMediaCodecInputErrorCode == 0 && this.mMediaCodecOutputErrorCode == 0) {
            this.mMediaCodecInputErrorCode = i;
            this.mMediaCodecOutputErrorCode = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMediaCodecProcessError(int i) {
        this.mMediaCodecErrorReason = i;
        this.mMediaCodecProcessError = 1;
        if (this.mConfigClone != null && this.mConfigClone.aR) {
            oyu.p++;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setMediaCodecProcessError " + i);
    }

    public void setNetworkUtilsAdapter(ddf ddfVar) {
        this.mNetworkUtilsAdapter = ddfVar;
    }

    public void setSeekMode(boolean z) {
        this.mEnableSeekFlushBuffer = z;
    }

    public void setTlogAdapter(ddg ddgVar) {
        this.mTlogAdapter = ddgVar;
    }

    protected void updateDelayStalledV2WhenEnd() {
        if (this.mIsInDelayStallInterval) {
            this.mVideoRenderingStalledCountNewUpdate += this.mStalledCountInDelayState;
            this.mVideoRenderingStalledCountNewUpdate_r1 += this.mStalledCountInDelayState;
            if (this.mStalledCountInDelayState > this.mMaxStalledCountInDelay) {
                this.mMaxStalledCountInDelay = this.mStalledCountInDelayState;
            }
            this.mStalledCountInDelayState = 0L;
            this.mSystemTimeAtDelayBegin = 0L;
            this.mDelayTimeAtDelayBegin = 0L;
            this.mIsInDelayStallInterval = false;
        }
    }

    protected void updateFpsIntervalForStalledCal() {
        if (this.mConfig.b == 2 && !this.mHasUpdateSourceFps) {
            this.mSourceFpsInterval = 1000.0f / ((TaobaoMediaPlayer) this)._getPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_VIDEO_FORMAT_FPS, 30.0f);
            this.mHasUpdateSourceFps = true;
        } else if (this.mConfig.b == 0) {
            this.mSourceFpsInterval = 1000.0f / ((TaobaoMediaPlayer) this)._getPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_VIDEO_RENDER_FPS_INTERVAL, 30.0f);
        }
        if (this.mSourceFpsInterval <= 0.0f || this.mSourceFpsInterval > 60.0f) {
            this.mSourceFpsInterval = 30.0f;
        }
        if (this.mMaxFpsAtStalledCal < this.mSourceFpsInterval) {
            this.mMaxFpsAtStalledCal = this.mSourceFpsInterval;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateVideoInfoWhenVideoResolutionSwitch(int i, int i2) {
        StringBuilder sb;
        if (this.mVideoResolutionPlayTimeMap == null) {
            this.mVideoResolutionPlayTimeMap = new HashMap();
        }
        long currentTimeMillis = System.currentTimeMillis();
        String videoResolution = getVideoResolution(i, i2);
        long j = 0;
        if (this.mPlayStartVideoWidth == 0 && this.mPlayStartVideoHeight == 0) {
            long j2 = this.mLastVideoSizePlayTime;
            if (j2 > 0) {
                j = currentTimeMillis - j2;
                updateVideoResolutionPlayTimeMap(j, videoResolution);
            }
            updateVideoResolutionRenderStalledCountMap(this.mLastVideoResolution);
            this.mLastVideoSizePlayTime = currentTimeMillis;
            this.mPlayStartVideoWidth = i;
            this.mPlayStartVideoHeight = i2;
            this.mLastVideoResolution = videoResolution;
            sb = new StringBuilder();
            sb.append("MonitorMediaPlayer::updateVideoInfoWhenVideoResolutionSwitch start_play_video_width:");
            sb.append(i);
            sb.append(", start_play_video_height:");
            sb.append(i2);
            sb.append(", last_play_time:");
            sb.append(j);
            sb.append(", total_play_time:");
            sb.append(this.mTotalPlayTime);
        } else {
            long j3 = this.mLastVideoSizePlayTime;
            if (j3 <= 0) {
                return;
            }
            long j4 = currentTimeMillis - j3;
            updateVideoResolutionPlayTimeMap(j4, this.mLastVideoResolution);
            updateVideoResolutionRenderStalledCountMap(this.mLastVideoResolution);
            this.mLastVideoSizePlayTime = currentTimeMillis;
            this.mLastVideoResolution = videoResolution;
            sb = new StringBuilder();
            sb.append("MonitorMediaPlayer::updateVideoInfoWhenVideoResolutionSwitch new video_width:");
            sb.append(i);
            sb.append(", video_height:");
            sb.append(i2);
            sb.append(", last_play_time:");
            sb.append(j4);
            sb.append(", total_play_time:");
            sb.append(this.mTotalPlayTime);
            sb.append(", play_time_map: ");
            sb.append(this.mVideoResolutionPlayTimeMap.toString());
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
    }

    protected void updateVideoResolutionInfoForEnd() {
        if (this.mVideoResolutionPlayTimeMap == null) {
            this.mVideoResolutionPlayTimeMap = new HashMap();
        }
        if (this.mLastVideoSizePlayTime > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.mLastVideoSizePlayTime;
            updateVideoResolutionPlayTimeMap(currentTimeMillis, this.mLastVideoResolution);
            this.mLastVideoSizePlayTime = 0L;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MonitorMediaPlayer::updateVideoResolutionInfoForEnd last_play_time:" + currentTimeMillis + ", total_play_time:" + this.mTotalPlayTime + ", play_time_map: " + this.mVideoResolutionPlayTimeMap.toString());
        }
        updateVideoResolutionRenderStalledCountMap(this.mLastVideoResolution);
    }

    protected void updateVideoResolutionInfoForStart() {
        if (this.mVideoResolutionPlayTimeMap == null) {
            this.mVideoResolutionPlayTimeMap = new HashMap();
        }
        if (this.mVideoResolutionRenderingStalledCountMap == null) {
            this.mVideoResolutionRenderingStalledCountMap = new HashMap();
        }
        int videoWidth = getVideoWidth();
        int videoHeight = getVideoHeight();
        if (this.mPlayStartVideoWidth == 0 && videoWidth != 0) {
            this.mPlayStartVideoWidth = videoWidth;
        }
        if (this.mPlayStartVideoHeight == 0 && videoHeight != 0) {
            this.mPlayStartVideoHeight = videoHeight;
        }
        this.mLastVideoSizePlayTime = System.currentTimeMillis();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MonitorMediaPlayer::updateVideoResolutionInfoForStart video_width:" + videoWidth + ", video_heigth:" + videoHeight);
    }

    protected void updateVideoResolutionPlayTimeMap(long j, String str) {
        if (j <= 0 || StringUtils.isEmpty(str)) {
            return;
        }
        if (this.mVideoResolutionPlayTimeMap.containsKey(str)) {
            j += this.mVideoResolutionPlayTimeMap.get(str).longValue();
        }
        this.mVideoResolutionPlayTimeMap.put(str, Long.valueOf(j));
    }

    protected void updateVideoResolutionRenderStalledCountMap(String str) {
        if (this.mVideoResolutionRenderingStalledCountMap == null) {
            this.mVideoResolutionRenderingStalledCountMap = new HashMap();
        }
        long j = this.videoRenderingStalledCountNew_43833053 - this.videoRenderingStalledCountNewWithResolution;
        if (j <= 0 || StringUtils.isEmpty(str)) {
            return;
        }
        this.mVideoResolutionRenderingStalledCountMap.put(str, Long.valueOf(j));
        this.videoRenderingStalledCountNewWithResolution = this.videoRenderingStalledCountNew_43833053;
    }

    protected boolean useNoTraffic() {
        return false;
    }
}
