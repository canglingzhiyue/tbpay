package tv.danmaku.ijk.media.player;

import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public interface IMediaPlayer {
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_MEDIACODEC_DECODE_ERROR = -111;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SEAMLESS_SWITCH_ENTER_ERROR = -112;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_INFO_ARTP_END_TO_END_DELAY = 820;
    public static final int MEDIA_INFO_ATTACHED_BUT_NO_SURFACE_CALLBACK = 12120;
    public static final int MEDIA_INFO_AUDIO_ONLY_STATE_NOTIFY = 12160;
    public static final int MEDIA_INFO_AUDIO_RENDERING_START = 10002;
    public static final int MEDIA_INFO_AUDIO_TRACK_BUFFERING_END = 744;
    public static final int MEDIA_INFO_AUDIO_TRACK_BUFFERING_START = 743;
    public static final int MEDIA_INFO_AVFORMAT_TIME = 711;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_CODEC_PARAM_CHANGED = 907;
    public static final int MEDIA_INFO_FACE_DETECT_INFO = 716;
    public static final int MEDIA_INFO_FETCH_SO_SUCC = 811;
    public static final int MEDIA_INFO_FRAME_QUEUE_NULL = 713;
    public static final int MEDIA_INFO_HEAD_REQUEST = 13001;
    public static final int MEDIA_INFO_HTTPDNS_CONNECT_FAIL = 720;
    public static final int MEDIA_INFO_KEYFRAME_PTS = 704;
    public static final int MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START = 12003;
    public static final int MEDIA_INFO_LIVE_MUTLI_CHAT_INFO = 12130;
    public static final int MEDIA_INFO_LIVE_RTC_DEGRADE_FLV = 12150;
    public static final int MEDIA_INFO_LIVE_RTC_DEGRADE_RTC = 12140;
    public static final int MEDIA_INFO_LIVE_SELECT_SCHEME = 810;
    public static final int MEDIA_INFO_METADATA_UPDATE = 802;
    public static final int MEDIA_INFO_NETWORK_BANDWIDTH = 703;
    public static final int MEDIA_INFO_NETWORK_SHAKE = 710;
    public static final int MEDIA_INFO_NETWORK_TRAFFIC = 714;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_P2FF_SUCCESS = 13000;
    public static final int MEDIA_INFO_PLAYER_ACTIVE_VIDEO_PLAY_ERROR = 2030;
    public static final int MEDIA_INFO_PLAYER_DEGRADE_ERROR = 2010;
    public static final int MEDIA_INFO_PLAYER_INIT_FAILED_ERROR = 2020;
    public static final int MEDIA_INFO_PLAY_CONTORL_FAILED_ERROR = 2000;
    public static final int MEDIA_INFO_RECOM_DEFINIITON = 12001;
    public static final int MEDIA_INFO_RTC_ADAPTION_TRACE_DATA = 746;
    public static final int MEDIA_INFO_RTC_AUDIO_FIRST_PACKET_TIME = 752;
    public static final int MEDIA_INFO_RTC_BUFFER_LOADING_BEGIN = 748;
    public static final int MEDIA_INFO_RTC_BUFFER_LOADING_ENG = 749;
    public static final int MEDIA_INFO_RTC_COMMON_TRACE_INFO = 750;
    public static final int MEDIA_INFO_RTC_VIDEO_FIRST_FRAME_TIME = 751;
    public static final int MEDIA_INFO_SEI_USERDEFINED_STRUCT = 715;
    public static final int MEDIA_INFO_SHOULD_SWITCH_TO_LOW_QUALITY_STREAM = 903;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
    public static final int MEDIA_INFO_STREAM_ABNORMAL_ADJOIN = 705;
    public static final int MEDIA_INFO_STREAM_ABNORMAL_AUDIO = 707;
    public static final int MEDIA_INFO_STREAM_ABNORMAL_AVSTREAM = 708;
    public static final int MEDIA_INFO_STREAM_ABNORMAL_VIDEO = 706;
    public static final int MEDIA_INFO_STREAM_ABNORMAL_VIDEO_DTS = 709;
    public static final int MEDIA_INFO_STREAM_START_TIME = 739;
    public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
    public static final int MEDIA_INFO_SWITCH_LIVE_LEVEL = 12002;
    public static final int MEDIA_INFO_SWITCH_PATH_SYNC_FRAME = 717;
    public static final int MEDIA_INFO_SWITCH_PATH_SYNC_FRAME_FAIL = 718;
    public static final int MEDIA_INFO_SWITCH_PATH_SYNC_FRAME_SUCCESS = 719;
    public static final int MEDIA_INFO_SWITCH_TO_NEW_DEFITION = 12110;
    public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
    public static final int MEDIA_INFO_UNKNOWN = 1;
    public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
    public static final int MEDIA_INFO_VIDEO_CODEC_ID_CHANGE = 10003;
    public static final int MEDIA_INFO_VIDEO_DECODE_ERROR = 712;
    public static final int MEDIA_INFO_VIDEO_FIRST_RENDER_SURFACE_UPDATE = 12101;
    public static final int MEDIA_INFO_VIDEO_FOV_CHANGE = 11000;
    public static final int MEDIA_INFO_VIDEO_MEDIACODEC_DECODE_ERROR = 10004;
    public static final int MEDIA_INFO_VIDEO_MEDIACODEC_INIT_EGL_ERROR = 10005;
    public static final int MEDIA_INFO_VIDEO_MEDIACODEC_PROCESS_ERROR = 10007;
    public static final int MEDIA_INFO_VIDEO_PLAY_BUTTON_CLICK = 18;
    public static final int MEDIA_INFO_VIDEO_RENDERING_EVERY_FRAME = 740;
    public static final int MEDIA_INFO_VIDEO_RENDERING_NORMAL = 722;
    public static final int MEDIA_INFO_VIDEO_RENDERING_SECOND_START = 4;
    public static final int MEDIA_INFO_VIDEO_RENDERING_STALLED = 721;
    public static final int MEDIA_INFO_VIDEO_RENDERING_STALLED_NEW = 17;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START_IN_RENDER_THREAD = 12100;
    public static final int MEDIA_INFO_VIDEO_REPLAY_AFTER_NET_STATE_ERROR = 12102;
    public static final int MEDIA_INFO_VIDEO_ROTATION_CHANGED = 10001;
    public static final int MEDIA_INFO_VIDEO_RTC_SWITCH_ERROR = 747;
    public static final int MEDIA_INFO_VIDEO_RTC_SWITCH_START = 745;
    public static final int MEDIA_INFO_VIDEO_SIZE_CHANGED = 10008;
    public static final int MEDIA_INFO_VIDEO_SURFACE_INIT_EGL_ERROR = 10006;
    public static final int MEDIA_INFO_VIDEO_SWITCH_DONE = 723;
    public static final int MEDIA_INFO_VIDEO_SWITCH_FAILED = 724;
    public static final int MEDIA_INFO_VIDEO_SWITCH_ROTATE = 728;
    public static final int MEDIA_INFO_VIDEO_SWITCH_SAR = 729;
    public static final int MEDIA_INFO_VIDEO_SWITCH_SIZE = 727;
    public static final int MEDIA_INFO_VIDEO_TRACK_BUFFERING_END = 742;
    public static final int MEDIA_INFO_VIDEO_TRACK_BUFFERING_START = 741;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
    public static final int MEDIA_INFO_WARMUP = 12000;
    public static final int MEDIA_INFO_WARMUP_LEVEL_CREATED = 11002;
    public static final int MEDIA_INFO_WARMUP_LEVEL_LOCAL_COMPOMENT = 11001;
    public static final int MEDIA_INFO_WARMUP_LEVEL_REMOTE_RESOURCE = 12000;
    public static final int MEDIA_OUT_OF_BUFFERING = 300;
    public static final int MEDIA_RESUME_BUFFERING = 301;
    public static final int MEDIA_VIDEO_SIZE_UPDATE = 302;

    /* loaded from: classes9.dex */
    public interface OnAudioCompletionListener {
        void onCompletion(IMediaPlayer iMediaPlayer, String str);
    }

    /* loaded from: classes9.dex */
    public interface OnAudioErrorListener {
        boolean onError(IMediaPlayer iMediaPlayer, int i, int i2, String str);
    }

    /* loaded from: classes9.dex */
    public interface OnAudioInfoListener {
        boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj, String str);
    }

    /* loaded from: classes9.dex */
    public interface OnAudioLoopCompletionListener {
        void onLoopCompletion(IMediaPlayer iMediaPlayer, String str);
    }

    /* loaded from: classes9.dex */
    public interface OnAudioPauseListener {
        void onPause(String str);
    }

    /* loaded from: classes9.dex */
    public interface OnAudioPreCompletionListener {
        void onPreCompletion(IMediaPlayer iMediaPlayer, String str);
    }

    /* loaded from: classes9.dex */
    public interface OnAudioPreparedListener {
        void onPrepared(IMediaPlayer iMediaPlayer, String str);
    }

    /* loaded from: classes9.dex */
    public interface OnAudioSeekCompletionListener {
        void onSeekComplete(IMediaPlayer iMediaPlayer, String str);
    }

    /* loaded from: classes9.dex */
    public interface OnAudioSeekStartListener {
        void onSeekStart(IMediaPlayer iMediaPlayer, String str);
    }

    /* loaded from: classes9.dex */
    public interface OnAudioStartListener {
        void onStart(String str);
    }

    /* loaded from: classes.dex */
    public interface OnBufferingUpdateListener {
        void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i);
    }

    /* loaded from: classes.dex */
    public interface OnCompletionListener {
        void onCompletion(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes.dex */
    public interface OnErrorListener {
        boolean onError(IMediaPlayer iMediaPlayer, int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface OnInfoListener {
        boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj);
    }

    /* loaded from: classes.dex */
    public interface OnLoopCompletionListener {
        void onLoopCompletion(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes.dex */
    public interface OnPlayerEventListener {
        int onEvent(IMediaPlayer iMediaPlayer, int i);
    }

    /* loaded from: classes.dex */
    public interface OnPreCompletionListener {
        void onPreCompletion(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes.dex */
    public interface OnPreparedListener {
        void onPrepared(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes.dex */
    public interface OnSeekCompletionListener {
        void onSeekComplete(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes.dex */
    public interface OnVFPluginListener {
        void onRenderFinish(IMediaPlayer iMediaPlayer);

        int onRenderOes(IMediaPlayer iMediaPlayer, int i, int i2, int i3, float[] fArr);

        int onRenderYUV(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4, int i5);
    }

    /* loaded from: classes.dex */
    public interface OnVideoClickListener {
        void onClick(int i, int i2, int i3, int i4, int i5, String str);
    }

    /* loaded from: classes.dex */
    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4);
    }

    float getCurCachePosition();

    long getCurrentPosition();

    long getDuration();

    Map<String, String> getQos();

    long getVPMSessioinId();

    int getVideoHeight();

    float getVideoRenderPts();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    void instantSeekTo(long j);

    boolean isPlaying();

    void pause() throws IllegalStateException;

    void prepareAsync() throws IllegalStateException;

    void release();

    void releasePrefixInUIThread();

    void reset();

    void seekTo(long j) throws IllegalStateException;

    void seekTo(long j, boolean z, boolean z2) throws IllegalStateException;

    void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDisplay(SurfaceHolder surfaceHolder);

    void setLooping(boolean z);

    void setMuted(boolean z);

    void setPlayRate(float f);

    void setScreenOnWhilePlaying(boolean z);

    void setSurface(Surface surface);

    void setSurfaceSize(int i, int i2);

    void setVolume(float f, float f2);

    void start() throws IllegalStateException;

    void stop() throws IllegalStateException;
}
