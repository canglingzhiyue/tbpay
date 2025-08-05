package tv.danmaku.ijk.media.player;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.g4;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.player.c;
import com.taobao.mediaplay.player.l;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.p;
import com.taobao.taobaoavsdk.e;
import com.taobao.taobaoavsdk.f;
import com.taobao.taobaoavsdk.util.BluetoothStateBroadcastReceive;
import com.taobao.taobaoavsdk.util.a;
import com.taobao.taobaoavsdk.util.b;
import com.taobao.taobaoavsdk.util.d;
import com.taobao.taobaoavsdk.util.g;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ddc;
import tb.ddd;
import tb.kge;
import tb.oyu;
import tb.oyw;
import tb.ozm;
import tb.ozq;
import tb.ozs;
import tb.riy;
import tb.snv;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes.dex */
public final class TaobaoMediaPlayer extends MonitorMediaPlayer implements c, l, ozq {
    public static final String AUDIO_OFF_KEY = "audioOff";
    public static final String AUDIO_ON_KEY = "audioOn";
    public static final int FFP_PROP_ENABLE_FALLBACK_TO_SOUNDTOUCH = 20144;
    public static final int FFP_PROP_ENABLE_SOUNDTOUCH = 20139;
    public static final int FFP_PROP_FLOAT_AUDIO_GAIN_COEF = 12002;
    public static final int FFP_PROP_FLOAT_AUDIO_GAIN_INPUT_LOUDNESS = 90001;
    public static final int FFP_PROP_FLOAT_AUDIO_GAIN_OUTPUT_LOUDNESS = 90002;
    public static final int FFP_PROP_FLOAT_AUDIO_GAIN_VALUE = 90000;
    public static final int FFP_PROP_FLOAT_AVG_FPS_DIFF_THRESHOLD = 22244;
    public static final int FFP_PROP_FLOAT_CDN_BITRATE_FACTOR = 140201;
    public static final int FFP_PROP_FLOAT_CDN_PLAYING_SPEED_FACTOR = 140200;
    public static final int FFP_PROP_FLOAT_DROP_PKT_COUNT_ADVANCED_THRESHOLD = 22242;
    public static final int FFP_PROP_FLOAT_DROP_PKT_COUNT_BASE_THRESHOLD = 22241;
    public static final int FFP_PROP_FLOAT_DROP_PKT_COUNT_RESUME_STEP = 22240;
    public static final int FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_1080 = 140102;
    public static final int FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_720 = 140103;
    public static final int FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_DEFAULT = 140101;
    public static final int FFP_PROP_FLOAT_PANO_FOV = 14001;
    public static final int FFP_PROP_FLOAT_PANO_FOV_PARAM_CHANGE = 14004;
    public static final int FFP_PROP_FLOAT_PANO_LATITUDE = 14002;
    public static final int FFP_PROP_FLOAT_PANO_LONGITUDE = 14003;
    public static final int FFP_PROP_FLOAT_PLAYBACK_RATE = 10003;
    public static final int FFP_PROP_FLOAT_RESUME_PKT_COUNT_BASE_THRESHOLD = 22243;
    public static final int FFP_PROP_FLOAT_SYNC_PTS = 10006;
    public static final int FFP_PROP_FLOAT_VIDEO_DECODE_FPS_INTERVAL = 22225;
    public static final int FFP_PROP_FLOAT_VIDEO_DOWNLOAD_FPS_INTERVAL = 22224;
    public static final int FFP_PROP_FLOAT_VIDEO_FORMAT_FPS = 22230;
    public static final int FFP_PROP_FLOAT_VIDEO_RENDER_FPS_INTERVAL = 22226;
    public static final int FFP_PROP_FLOAT_VOLUME = 12001;
    public static final int FFP_PROP_INT64_ALLOW_LIVE_VIDEO_STREAM_INDEX_CHANGE = 11030;
    public static final int FFP_PROP_INT64_ANDROID_SW_RENDER_RGB = 11019;
    public static final int FFP_PROP_INT64_ARTC_SUPPORT_AUDIO_ONLY = 60006;
    public static final int FFP_PROP_INT64_ARTP_BITRATE = 21995;
    public static final int FFP_PROP_INT64_ARTP_COMMON_TRACE_INFO = 21996;
    public static final int FFP_PROP_INT64_ARTP_DLIB_PATH = 21802;
    public static final int FFP_PROP_INT64_ARTP_RECV_LOSS_RATE = 21904;
    public static final int FFP_PROP_INT64_ARTP_USE_RELATIVE_PTS = 21908;
    public static final int FFP_PROP_INT64_ARTP_USE_WEAK_NET_FLAG = 21997;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_BYTES = 20008;
    public static final int FFP_PROP_INT64_AUDIO_DECODER_TYPE = 11011;
    public static final int FFP_PROP_INT64_AUDIO_DISABLE = 50001;
    public static final int FFP_PROP_INT64_AUDIO_PROCESSOR_TYPE = 11013;
    public static final int FFP_PROP_INT64_AUDIO_RENDERER_TYPE = 11015;
    public static final int FFP_PROP_INT64_AUDIO_RENDERING_STALL_TIME = 80054;
    public static final int FFP_PROP_INT64_AUDIO_RENDER_FRAME_LENGTH = 80059;
    public static final int FFP_PROP_INT64_AUDIO_RENDER_SAMPLE_RATE = 80060;
    public static final int FFP_PROP_INT64_AUDIO_STATE_NOTIFY_GAP = 22902;
    public static final int FFP_PROP_INT64_AUDIO_TIMESTAMP_MIN_POLL_TIME = 80042;
    public static final int FFP_PROP_INT64_AVFORMAT_OPEN_COUNT = 20126;
    public static final int FFP_PROP_INT64_AVFORMAT_OPEN_TIME = 20122;
    public static final int FFP_PROP_INT64_AVFORMAT_OPEN_TOTAL_TIME = 20125;
    public static final int FFP_PROP_INT64_AVFORMAT_STREAM_INFO_TIME = 20123;
    public static final int FFP_PROP_INT64_AVG_BITRATE = 20115;
    public static final int FFP_PROP_INT64_AVG_BITRATE_BY_ESTIMATED = 20118;
    public static final int FFP_PROP_INT64_AVG_BITRATE_FROM_MEDIA = 20117;
    public static final int FFP_PROP_INT64_AVG_DECODER_VIDEO_FPS = 20113;
    public static final int FFP_PROP_INT64_AVG_DOWNLOAD_SPEED = 21009;
    public static final int FFP_PROP_INT64_AVG_DOWNLOAD_TIME = 21010;
    public static final int FFP_PROP_INT64_AVG_DOWNLOAD_VIDEO_FPS = 20112;
    public static final int FFP_PROP_INT64_AVG_VIDEO_FPS = 20114;
    public static final int FFP_PROP_INT64_BLUETOOTH_CONNECT = 80045;
    public static final int FFP_PROP_INT64_BUFFER_MONITOR_IGNORE_BUFFERING = 11026;
    public static final int FFP_PROP_INT64_CHECK_INPUTBUF_SIZE = 60005;
    public static final int FFP_PROP_INT64_COLOR_PRIMARIES = 15001;
    public static final int FFP_PROP_INT64_COLOR_RANGE = 15002;
    public static final int FFP_PROP_INT64_COLOR_SPACE = 15003;
    public static final int FFP_PROP_INT64_COMPLETE_DONE_SEEK = 60004;
    public static final int FFP_PROP_INT64_CPU_IS_QTI_CHIP = 18000;
    public static final int FFP_PROP_INT64_CREATE_AUDIO_DECODER_ERROR = 22200;
    public static final int FFP_PROP_INT64_CURRENT_AUDIO_BITRATE = 20143;
    public static final int FFP_PROP_INT64_CURRENT_VIDEO_BITRATE = 20142;
    public static final int FFP_PROP_INT64_DECODER_ENABLE_DYNAMIC_RELOAD = 11022;
    public static final int FFP_PROP_INT64_DECODE_SETUP_TIME = 22007;
    public static final int FFP_PROP_INT64_DISABLE_ARTC_RTT_STATISTIC = 11054;
    public static final int FFP_PROP_INT64_DISABLE_AUDIO_CNT_STATISTIC = 11053;
    public static final int FFP_PROP_INT64_DISABLE_AUDIO_SLOW_PLAY = 80063;
    public static final int FFP_PROP_INT64_DISABLE_COLLECT_HA_METRICS = 11209;
    public static final int FFP_PROP_INT64_DISABLE_CONN_REPORT = 11211;
    public static final int FFP_PROP_INT64_DISABLE_FIX_FFCB_CRASH = 11203;
    public static final int FFP_PROP_INT64_DISABLE_FIX_HLS_EOF = 16000;
    public static final int FFP_PROP_INT64_DISABLE_FIX_SEEK_COMPLETE = 80001;
    public static final int FFP_PROP_INT64_DISABLE_FIX_START_TIME = 11207;
    public static final int FFP_PROP_INT64_DISABLE_HLS_DISCON = 17000;
    public static final int FFP_PROP_INT64_DISABLE_HTTP_CACHE_SPEED = 11210;
    public static final int FFP_PROP_INT64_DISABLE_RENDER_INVISIBLE_DROP_BY_TID = 80037;
    public static final int FFP_PROP_INT64_DYNAMIC_CHECK_VIDEO_CHANGE = 60102;
    public static final int FFP_PROP_INT64_ENABLEAVSYNC_INFO = 11208;
    public static final int FFP_PROP_INT64_ENABLE_ACCURATE_SEEK = 20131;
    public static final int FFP_PROP_INT64_ENABLE_AUDIO_CLIP = 32001;
    public static final int FFP_PROP_INT64_ENABLE_AUDIO_GAIN_COEF = 22901;
    public static final int FFP_PROP_INT64_ENABLE_AUDIO_GAIN_COEF_AB = 80061;
    public static final int FFP_PROP_INT64_ENABLE_BT709_FULL_RANGE_SUPPORT = 80048;
    public static final int FFP_PROP_INT64_ENABLE_CHANGE_POSITION_TO_VIDEO_POSITION = 11070;
    public static final int FFP_PROP_INT64_ENABLE_CHECK_AVG_FPS = 80036;
    public static final int FFP_PROP_INT64_ENABLE_DECODE_AAC_DSE = 80044;
    public static final int FFP_PROP_INT64_ENABLE_DECODE_USING_VIDEO_STREAM_START_TIME = 80039;
    public static final int FFP_PROP_INT64_ENABLE_DECODE_USING_VIDEO_STREAM_START_TIME_VVC = 80040;
    public static final int FFP_PROP_INT64_ENABLE_DETECT_TID_AND_ACTIVE_DROP_FRAME = 80031;
    public static final int FFP_PROP_INT64_ENABLE_FIX_MEMORY_LEAK_WITH_MFORMATOPTS = 80003;
    public static final int FFP_PROP_INT64_ENABLE_FIX_ROTATE_VIDEO = 80041;
    public static final int FFP_PROP_INT64_ENABLE_FIX_SEI_NOTIFY = 80052;
    public static final int FFP_PROP_INT64_ENABLE_FIX_SET_SURFACE = 80049;
    public static final int FFP_PROP_INT64_ENABLE_GLOBAL_AUDIO_OUTPUT_BYTEARRAY = 80007;
    public static final int FFP_PROP_INT64_ENABLE_LOOP = 11004;
    public static final int FFP_PROP_INT64_ENABLE_MEDIACODEC_FIRST_FRAME_FLUSH_OPT = 16001;
    public static final int FFP_PROP_INT64_ENABLE_MOV_FFMPEG_FORMAT_TO_SOURCER = 22221;
    public static final int FFP_PROP_INT64_ENABLE_POST_WHEN_RESOLUTION_CHANGE = 11069;
    public static final int FFP_PROP_INT64_ENABLE_REALTIME_SET_FFMPEG_STRING = 22220;
    public static final int FFP_PROP_INT64_ENABLE_RENDER_CALLBACK = 20000;
    public static final int FFP_PROP_INT64_ENABLE_RTC_COMMON_SIDE_DATA = 80043;
    public static final int FFP_PROP_INT64_ENABLE_RTC_DECODE_WAIT_TIME = 80009;
    public static final int FFP_PROP_INT64_ENABLE_RTC_NEW_BUFFER_STRATEGY = 80062;
    public static final int FFP_PROP_INT64_ENABLE_RTC_SWITCH = 80002;
    public static final int FFP_PROP_INT64_ENABLE_SEEK_FAST_MODE = 60310;
    public static final int FFP_PROP_INT64_ENABLE_SEEK_IN_PAUSE = 80006;
    public static final int FFP_PROP_INT64_ENABLE_SEEK_PKT_DROP = 80032;
    public static final int FFP_PROP_INT64_ENABLE_SEEK_PKT_TID_DROP = 80033;
    public static final int FFP_PROP_INT64_ENABLE_STAT_RENDER_FRAME = 11060;
    public static final int FFP_PROP_INT64_ENABLE_STAT_STALL_ATTR_REASON = 80046;
    public static final int FFP_PROP_INT64_ENABLE_VIDEO_DELAY_STATS = 11029;
    public static final int FFP_PROP_INT64_ENABLE_VIDEO_FRAME_PLUGIN = 60002;
    public static final int FFP_PROP_INT64_ENABLE_VIDEO_RENDER_STATS = 20141;
    public static final int FFP_PROP_INT64_ENABLE_VPM = 11040;
    public static final int FFP_PROP_INT64_ENABLE_VPM_AUDIO_ALGO = 11041;
    public static final int FFP_PROP_INT64_ENABLE_VPM_COLLECTOR_V2 = 11046;
    public static final int FFP_PROP_INT64_ENABLE_VPM_HEART_INTERVAL = 11042;
    public static final int FFP_PROP_INT64_ERROR_CODE_NEW = 60500;
    public static final int FFP_PROP_INT64_ERROR_CODE_SUB = 60501;
    public static final int FFP_PROP_INT64_EXTEND_ADAPTIVE_DECISION_WINDOW = 80004;
    public static final int FFP_PROP_INT64_EXTEND_DEFINITION_DECISION_WINDOW = 80005;
    public static final int FFP_PROP_INT64_EXTEND_DISABLE_CDN_SPEED = 80008;
    public static final int FFP_PROP_INT64_EXTEND_DRAW_FRAME_INFO_PTR = 80014;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_CDN_START_PLAY_SPEED = 80011;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_DECODE_WITHOUT_DATA_IN_SYNC_MODE = 80016;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_DROP_RENDER = 80035;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_EXTERN_CACHE = 80000;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_OPENGL_ALPHA = 80020;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_OPENGL_CROP = 80021;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_RTC_SYNC = 80015;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_START_DECODEC_THREAD_OPT = 80030;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_STAT_RENDER_STALL = 80012;
    public static final int FFP_PROP_INT64_EXTEND_FFMPEG_EXTRADATA_DELAY = 80026;
    public static final int FFP_PROP_INT64_EXTEND_FFMPEG_PROBESIZE = 80025;
    public static final int FFP_PROP_INT64_EXTEND_FFMPEG_VIDEO_INFO_DELAY = 80027;
    public static final int FFP_PROP_INT64_EXTEND_LOAD_DECODER = 80024;
    public static final int FFP_PROP_INT64_EXTEND_MAX_HEIGHT_FOR_MEDIACODEC = 80051;
    public static final int FFP_PROP_INT64_EXTEND_MAX_WIDTH_FOR_MEDIACODEC = 80050;
    public static final int FFP_PROP_INT64_EXTEND_MIN_SYNC_TIME_IN_ARTC = 80017;
    public static final int FFP_PROP_INT64_EXTEND_OPENGL_OPEN_DEVICE_MAX_ERROR_COUNT = 80029;
    public static final int FFP_PROP_INT64_EXTEND_SHOULD_STAT_RENDER_STALL = 80013;
    public static final int FFP_PROP_INT64_EXTEND_VIDEO_ASPECT_RATIO = 80022;
    public static final int FFP_PROP_INT64_FAST_FRAME_AUDIO_COUNT = 80068;
    public static final int FFP_PROP_INT64_FAST_FRAME_TIME = 80066;
    public static final int FFP_PROP_INT64_FAST_FRAME_VIDEO_COUNT = 80067;
    public static final int FFP_PROP_INT64_FAST_PLAY = 11028;
    public static final int FFP_PROP_INT64_FIND_STREAM_INFO_OPT = 11023;
    public static final int FFP_PROP_INT64_FINISH_READ_SOURCE_TIME = 22011;
    public static final int FFP_PROP_INT64_FINISH_SETUP_DECODER_TIME = 22013;
    public static final int FFP_PROP_INT64_FIRST_DECODE_PACKET_NUM = 22002;
    public static final int FFP_PROP_INT64_FIRST_DECODE_PACKET_TIME = 22005;
    public static final int FFP_PROP_INT64_FIRST_DECODE_TIME = 22001;
    public static final int FFP_PROP_INT64_FIRST_RENDER_TIME = 22006;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_1080 = 60206;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_720 = 60209;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_DEFAULT = 60203;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_1080 = 60207;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_720 = 60210;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_DEFAULT = 60204;
    public static final int FFP_PROP_INT64_FLV_PARAM_MAX_QUEUE_TIME_MS_1080 = 60205;
    public static final int FFP_PROP_INT64_FLV_PARAM_MAX_QUEUE_TIME_MS_720 = 60208;
    public static final int FFP_PROP_INT64_FLV_PARAM_MQX_QUEUE_TIME_MS_DEFAULT = 60202;
    public static final int FFP_PROP_INT64_FORBIDDEN_SMOOTH_SYNC = 80023;
    public static final int FFP_PROP_INT64_FPS_LIST_COLLECT_MAX_COUNT = 80019;
    public static final int FFP_PROP_INT64_FPS_LIST_COLLECT_TIME_INTERVAL = 80018;
    public static final int FFP_PROP_INT64_GET_AV_MAX_PTS_DIFF = 22118;
    public static final int FFP_PROP_INT64_GET_AV_MAX_PTS_DIFF_COUNT = 22119;
    public static final int FFP_PROP_INT64_GET_LATENCE_LEVEL = 80047;
    public static final int FFP_PROP_INT64_GRTN_GLOBAL_DELAY_INFO = 22800;
    public static final int FFP_PROP_INT64_HANDLE_SURFACE_DESTROY = 60101;
    public static final int FFP_PROP_INT64_HARDWARE_DECODER_ERROR_COUNT = 22201;
    public static final int FFP_PROP_INT64_HDRTOSDR_ENABLE = 15000;
    public static final int FFP_PROP_INT64_HEVC_DECODE_OPT = 20101;
    public static final int FFP_PROP_INT64_HEVC_SOFT_DECODE_MAX_FPS = 20137;
    public static final int FFP_PROP_INT64_IS_WAITING_SYNC = 20136;
    public static final int FFP_PROP_INT64_LAST_VIDEO_RENDER_TIME = 11300;
    public static final int FFP_PROP_INT64_LIVE_PAUSE_TIMESTAMP = 22009;
    public static final int FFP_PROP_INT64_LIVE_RESUME_TIME = 22008;
    public static final int FFP_PROP_INT64_MAX_BUFFER_SIZE = 40001;
    public static final int FFP_PROP_INT64_MAX_BUFFER_SIZE_REAL_PLAY = 40002;
    public static final int FFP_PROP_INT64_MAX_BUFFER_TIME_MS = 11008;
    public static final int FFP_PROP_INT64_MAX_FAST_PLAY_COUNT = 20135;
    public static final int FFP_PROP_INT64_MAX_VALID_NET_SPEED = 11221;
    public static final int FFP_PROP_INT64_MEDIACODEC_ACTION_CODE_WHHEN_ASYNC_ERROR = 22215;
    public static final int FFP_PROP_INT64_MEDIACODEC_ASYNC_ERROR = 22214;
    public static final int FFP_PROP_INT64_MEDIACODEC_ASYNC_ERROR_COUNT = 22213;
    public static final int FFP_PROP_INT64_MEDIACODEC_BUFFER_SIZE = 22216;
    public static final int FFP_PROP_INT64_MEDIACODEC_BUFFER_SIZE_CHANGE = 22217;
    public static final int FFP_PROP_INT64_MEDIACODEC_HIT = 22210;
    public static final int FFP_PROP_INT64_MEDIACODEC_HIT_CACHE_NUM = 22212;
    public static final int FFP_PROP_INT64_MEDIACODEC_HIT_REASON = 22211;
    public static final int FFP_PROP_INT64_MUTED = 21008;
    public static final int FFP_PROP_INT64_MUTED_AUDIO_RESET_DATA = 21017;
    public static final int FFP_PROP_INT64_NET_SPEED_COLLECT_INTERVAL = 11220;
    public static final int FFP_PROP_INT64_NONSTANDARD_PIXEL_SUPPROT = 20116;
    public static final int FFP_PROP_INT64_NTP_START_OFFSET = 15004;
    public static final int FFP_PROP_INT64_PANO_TYPE = 14000;
    public static final int FFP_PROP_INT64_PLAYING_VVC = 80038;
    public static final int FFP_PROP_INT64_PLAY_SCENARIO = 21007;
    public static final int FFP_PROP_INT64_PREPARE_TO_FIRST_FRAME = 11031;
    public static final int FFP_PROP_INT64_RECV_FIRST_DECODE_PACKET_TIME = 22004;
    public static final int FFP_PROP_INT64_RECV_FIRST_PACKET_TIME = 22003;
    public static final int FFP_PROP_INT64_RTC_CONNECT_ONLY_AT_WARM_UP = 80070;
    public static final int FFP_PROP_INT64_RTC_DECODE_WAIT_TIME = 80010;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_AVFORMAT_OPEN_TIME = 22111;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_FIND_STREAM_INFO_TIME = 22112;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_PTS_LATENCY_INIT = 22104;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_READ_BYTES = 22113;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_VIDEO_HEIGHT = 22110;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_VIDEO_WIDTH = 22109;
    public static final int FFP_PROP_INT64_SEEK_FLSUH_MODE = 31001;
    public static final int FFP_PROP_INT64_SEND_SEI = 20111;
    public static final int FFP_PROP_INT64_SET_DEFAULT_START_TIME = 11212;
    public static final int FFP_PROP_INT64_SHOULD_INIT_DECODER_EARLY = 80055;
    public static final int FFP_PROP_INT64_SHOULD_OPEN_DEVICE_EARLY = 80056;
    public static final int FFP_PROP_INT64_SHOULD_PAUSE_RTC_EARLY_AT_WARM_UP = 80053;
    public static final int FFP_PROP_INT64_SOURCER_AUDIO_PIPE_MAX_COUNT = 11017;
    public static final int FFP_PROP_INT64_SOURCER_AUDIO_PIPE_START_COUNT = 11021;
    public static final int FFP_PROP_INT64_SOURCER_PIPE_FORCE_POP_DATA_COUNT = 80065;
    public static final int FFP_PROP_INT64_SOURCER_PIPE_MAX_BUFFER_RATIO = 80064;
    public static final int FFP_PROP_INT64_SOURCER_TYPE = 11009;
    public static final int FFP_PROP_INT64_SOURCER_VIDEO_PIPE_MAX_COUNT = 11016;
    public static final int FFP_PROP_INT64_SOURCER_VIDEO_PIPE_START_COUNT = 11020;
    public static final int FFP_PROP_INT64_START_ON_PREPARED = 11007;
    public static final int FFP_PROP_INT64_START_POSITION = 60000;
    public static final int FFP_PROP_INT64_START_POSITION_ACCUSEEK = 60003;
    public static final int FFP_PROP_INT64_START_READ_SOURCE_TIME = 22010;
    public static final int FFP_PROP_INT64_START_SETUP_DECODER_TIME = 22012;
    public static final int FFP_PROP_INT64_STAT_MAX_FRAME_PER_SEC = 11061;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_DETAIL_1 = 60225;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_DETAIL_2 = 60226;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_DETAIL_3 = 60227;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_RENDER = 60220;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_RENDER_REASON_1 = 60221;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_RENDER_REASON_2 = 60222;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_RENDER_REASON_3 = 60223;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_RENDER_REASON_4 = 60224;
    public static final int FFP_PROP_INT64_SUPPORT_OUT_LAST_FRAME_NEW = 50002;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_FORCEDLY = 22101;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_HEIGHT_LEVEL = 22114;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_IMMEDIATELY_FOR_DOUBLE_DECODER = 22102;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_LOW_LEVEL = 22115;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_MAX_FIRST_PTS_TIMEOUT = 22116;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_TIMEOUT = 22100;
    public static final int FFP_PROP_INT64_SYNC_BY_DRIFT_PTS = 11027;
    public static final int FFP_PROP_INT64_SYNC_DIFF_TIME_AFTER_SEEK = 22206;
    public static final int FFP_PROP_INT64_SYNC_THRESHOLD = 80028;
    public static final int FFP_PROP_INT64_TMP_DISABLE_FIX_VIDEO_RESOLUTION2 = 11068;
    public static final int FFP_PROP_INT64_TOTAL_ASYNC_TIME = 60400;
    public static final int FFP_PROP_INT64_TOTAL_DROP_FRAME_COUNT_AT_60FPS = 22251;
    public static final int FFP_PROP_INT64_TOTAL_DROP_FRAME_COUNT_AT_RENDER_INVISIBLE = 22252;
    public static final int FFP_PROP_INT64_TOTAL_DROP_FRAME_COUNT_AT_SEEK = 22250;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_BYTES = 20007;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_COUNTS = 20009;
    public static final int FFP_PROP_INT64_VIDEO_DECODER_TYPE = 11010;
    public static final int FFP_PROP_INT64_VIDEO_DECODE_DELAY_MS = 21013;
    public static final int FFP_PROP_INT64_VIDEO_DECODE_IN_COUNT = 22203;
    public static final int FFP_PROP_INT64_VIDEO_DECODE_OUT_COUNT = 22204;
    public static final int FFP_PROP_INT64_VIDEO_DOWNLOAD_COUNT = 22202;
    public static final int FFP_PROP_INT64_VIDEO_PROCESSOR_TYPE = 11012;
    public static final int FFP_PROP_INT64_VIDEO_RENDERER_TYPE = 11014;
    public static final int FFP_PROP_INT64_VIDEO_RENDER_COUNT = 22205;
    public static final int FFP_PROP_INT64_VIDEO_RENDER_DELAY_MS = 21015;
    public static final int FFP_PROP_INT64_VIDEO_RENDER_STALLED_THRESHOLD = 20140;
    public static final int FFP_PROP_INT64_VIDEO_SOURCE_DELAY_MS = 21011;
    public static final int FFP_PROP_INT64_VIDEO_TOTAL_DECODE_DELAY_MS = 21014;
    public static final int FFP_PROP_INT64_VIDEO_TOTAL_RENDER_DELAY_MS = 21016;
    public static final int FFP_PROP_INT64_VIDEO_TOTAL_SOURCE_DELAY_MS = 21012;
    public static final int FFP_PROP_INT64_VPM_ENABLE_ALGO = 11044;
    public static final int FFP_PROP_INT64_VPM_ENABLE_HB_REPORT = 11048;
    public static final int FFP_PROP_INT64_VPM_ENABLE_SUMMARY_REPORT = 11049;
    public static final int FFP_PROP_INT64_VPM_NETWORK_COLLECTOR_TOKEN = 11043;
    public static final int FFP_PROP_INT64_VPM_SERIAL_TOKEN = 11045;
    public static final int FFP_PROP_INT64_VVC_DECODE_PERIOD_DURATION = 80058;
    public static final int FFP_PROP_INT64_VVC_DECODE_STATISTICS_ENABLE = 80057;
    public static final int FFP_PROP_INT64_WARMUP_FLAG = 11032;
    public static final int FFP_PROP_INT64_WARMUP_LEVEL = 11033;
    public static final int FFP_PROP_STRING_BACKUP_CDNIP = 21005;
    public static final int FFP_PROP_STRING_ENCODE_TYPE = 13001;
    public static final int FFP_PROP_STRING_FAST_PLAY_AV_STAT = 21008;
    public static final int FFP_PROP_STRING_PLAYEXPERIENCE_STAT_VALUE = 21007;
    public static final int FFP_PROP_STRING_PLAYING_RTC_LIVE_INFO = 21011;
    public static final int FFP_PROP_STRING_PLAYING_STAT_VALUE = 21006;
    public static final int FFP_PROP_STRING_PLAY_STALL_STAT = 21009;
    public static final int FFP_PROP_STRING_RENDER_STALL_ATTR_REASONS = 22234;
    public static final int FFP_PROP_STRING_SEI_BITRATE = 21004;
    public static final int FFP_PROP_STRING_SERVER_IP = 21003;
    public static final int FFP_PROP_STRING_VIDEO_DECODE_FPS_LIST = 22228;
    public static final int FFP_PROP_STRING_VIDEO_DECODE_FPS_LIST_WITHOUT_SLOW_START = 22232;
    public static final int FFP_PROP_STRING_VIDEO_DOWNLOAD_FPS_LIST = 22227;
    public static final int FFP_PROP_STRING_VIDEO_DOWNLOAD_FPS_LIST_WITHOUT_SLOW_START = 22231;
    public static final int FFP_PROP_STRING_VIDEO_RENDER_FPS_LIST = 22229;
    public static final int FFP_PROP_STRING_VIDEO_RENDER_FPS_LIST_WITHOUT_SLOW_START = 22233;
    public static final int FFP_PROP_STRING_VVC_DECODE_AVG_TIME_LIST = 20200;
    public static final int FFP_PROP_STRING_VVC_DECODE_MAX_TIME_LIST = 20201;
    public static final int FFP_PROP_SUPPORT_OUT_LAST_FRAME = 50000;
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_ERROR = 100;
    private static final int MEDIA_ERROR_DEGRADE_TO_FLV_BY_NO_ARTC_SO = -70000;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_OUT_OF_BUFFERING = 300;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_RESUME_BUFFERING = 301;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    private static final int MEDIA_SEEK_START = 400;
    protected static final int MEDIA_SET_VIDEO_SAR = 10001;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_TIMED_TEXT = 99;
    private static final int MEDIA_WARMUP = 6;
    public static final int MediaAudioDecoder_FFmpeg = 1;
    public static final int MediaAudioDecoder_MediaCodec = 2;
    public static final int MediaAudioDecoder_None = 0;
    public static final int MediaAudioRenderer_AudioTrack = 2;
    public static final int MediaAudioRenderer_None = 0;
    public static final int MediaAudioRenderer_OpenSLES = 4;
    public static final int MediaVideoDecoder_FFmpeg = 1;
    public static final int MediaVideoDecoder_MediaCodec = 32;
    public static final int MediaVideoDecoder_MediaCodec_EGL = 64;
    public static final int MediaVideoDecoder_MediaCodec_H264 = 8;
    public static final int MediaVideoDecoder_MediaCodec_HEVC = 16;
    public static final int MediaVideoDecoder_None = 0;
    public static final int MediaVideoRenderer_EGL = 8;
    public static final int MediaVideoRenderer_None = 0;
    public static final int MediaVideoRenderer_Surface = 4;
    public static final String ON_VIDEO_MUTE_STATE_CHANGED_ACTION = "com.taobao.avplayer.muteStateChanged";
    public static final int OPT_ARTP_SOURCE = 2;
    public static final int OPT_CATEGORY_CODEC = 2;
    public static final int OPT_CATEGORY_FORMAT = 1;
    public static final int OPT_CATEGORY_PLAYER = 4;
    public static final int OPT_CATEGORY_SWS = 3;
    public static final String ORANGE_ACCURATE_SEEK = "ijkAccurateSeekWhiteList";
    public static final String ORANGE_ACCURATE_SEEK_NEW = "accurateSeekNew";
    public static final String ORANGE_ACCURATE_SEEK_NEW_BLACK = "accurateSeekWBlackList";
    public static final String ORANGE_ALLOW_LIVE_VIDEO_STREAM_INDEX_CHANGE = "allowLiveVideoStreamIndexChange";
    public static final String ORANGE_AUDIO_CLIP_MODE_BUSSINESSTYPE = "AudioForceEofModeSubBusinessTypes";
    public static final String ORANGE_AUDIO_SOURCER_PIPE_SIZE = "audioSourcerPipeSize";
    public static final String ORANGE_CDN_BITRATE_FACTOR = "cdnBitrateF";
    public static final String ORANGE_CDN_PLAYING_SPEED_FACTOR = "cdnPlayingSpeedF";
    public static final String ORANGE_COMMON_HEARTBEAT_INTERVAL = "commonHeartBeatInterval";
    public static final String ORANGE_DISABLE_ARTC_RTT_STAT = "disableArtcRttStat";
    public static final String ORANGE_DISABLE_AUDIO_CNT_STATISTIC = "disableAudioCntStatistic";
    public static final String ORANGE_DISABLE_AUDIO_MUTE_RESET_DATA = "disableAudioMuteResetData";
    public static final String ORANGE_DISABLE_CDN_SPEED = "disaCdnSpeed";
    public static final String ORANGE_DISABLE_COLLECT_HA_METRICS = "disableCollectHaMetrics";
    public static final String ORANGE_DISABLE_COLLECT_VPMHA_LIVE_STAT = "disableCollectVPMHALiveStat";
    public static final String ORANGE_DISABLE_CONN_REPORT = "disableConnReport";
    public static final String ORANGE_DISABLE_DECODER = "disaDecoder";
    public static final String ORANGE_DISABLE_FIX_SEEK_COUNTER = "disableFixSeekCounter";
    public static final String ORANGE_DISABLE_HARDWARE_DECODER_LIST = "disableHardwareDecoderList2";
    public static final String ORANGE_DISABLE_HARDWARE_DECODER_STRATEGY = "disaHardwareStrategy";
    public static final String ORANGE_DISABLE_HTTP_CACHE_SPEED = "disableHttpCacheSpeed";
    public static final String ORANGE_DISABLE_NETWORK_ERROR_HLS_SEND_EOF = "disableNetworkErrorHLSEof";
    public static final String ORANGE_DISABLE_PROCESS_NUMBER_SIGN = "disableNumberSign";
    public static final String ORANGE_DISABLE_SUPPORT_HLS_DISCONTINUITY = "disableSupportHLSDiscontinuity";
    public static final String ORANGE_DISABLE_SUPPORT_SET_TRACK_MIN_START_TIME = "disableSetTrackMinStartTimeNewSwitch";
    public static final String ORANGE_DISABLE_VIDEO_PROGRESS = "disVideoProgress";
    public static final String ORANGE_DISALBE_TMP_DISABLE_FIX_VIDEO_RESOLUTION2 = "disableFixVideoResolution2";
    public static final String ORANGE_ENABLE_ALL_LIVE_HEARTBEAT = "enableAllLiveHeartBeat";
    public static final String ORANGE_ENABLE_ALL_VOD_HEARTBEAT = "enableAllVodHeartBeat";
    public static final String ORANGE_ENABLE_BLUETOOTH_AVSYNC_DEBUG_LOG = "disableBlueConnectAVsyncDebugLog";
    public static final String ORANGE_ENABLE_BLUETOOTH_AVSYNC_MODE = "enabelBluetoothAvsyncMode3";
    public static final String ORANGE_ENABLE_COMMIT_LIVE_PUSH_CONTROL_INFO = "enLivePushContrInfo";
    public static final String ORANGE_ENABLE_COMPLETE_SEEKTO = "enableCompleteSeekTo";
    public static final String ORANGE_ENABLE_DECODE_WITHOUT_DATA_IN_SYNC_MODE = "enDecodeOptInRtc";
    public static final String ORANGE_ENABLE_ENABLE_SEEK_IN_PAUSE = "enSeekInPause";
    public static final String ORANGE_ENABLE_FIRST_HEARTBEAT = "enableFirstHeartBeat";
    public static final String ORANGE_ENABLE_FORCE_MUTE_MODE = "enableForceMuteMode";
    public static final String ORANGE_ENABLE_GET_OUT_START_TIME_IN_RELEASE = "enableGetOstInRelease";
    public static final String ORANGE_ENABLE_GLOBAL_AUDIO_JAVA_BYTE_ARRAY = "enGlobalAudioByteArray";
    public static final String ORANGE_ENABLE_GLOBAL_RTC_SYNC = "enGlobalRtcSync";
    public static final String ORANGE_ENABLE_MEDIACODEC_AB = "enCodecAb1";
    public static final String ORANGE_ENABLE_MEDIACODEC_ASYNC = "enCodecAsync2";
    public static final String ORANGE_ENABLE_MEDIACODEC_ASYNC_LOOSE_SIZE = "enCodecAsyncLooseSize";
    public static final String ORANGE_ENABLE_MEDIACODEC_CACHE = "enCodecCache2";
    public static final String ORANGE_ENABLE_MEDIACODEC_INPUT_BUF_CHECK = "enableMediacodecInputBufferCheck";
    public static final String ORANGE_ENABLE_POST_WHEN_RESOLUTION_CHANGE = "enablePostWhenResolutionChange";
    public static final String ORANGE_ENABLE_RTC_DECODE_WAIT_TIME = "enRtcDecodeWaitTime";
    public static final String ORANGE_ENABLE_RTC_SYNC = "enRtcSync";
    public static final String ORANGE_ENABLE_SEEK_FAST_MODE = "enSeekFastMode";
    public static final String ORANGE_ENABLE_SEND_LOG_TOKEN = "enSendLogToken3";
    public static final String ORANGE_ENABLE_SET_CUS_HTTP_HEADER = "enableCusHttpHeader";
    public static final String ORANGE_ENABLE_STAT_RENDER_FRAME = "enStatRenderFrame";
    public static final String ORANGE_ENABLE_STAT_STALL_RENDER_IN_NON_SURFACE = "enStatStallRenderInNonSurface";
    public static final String ORANGE_ENABLE_STAT_STALL_RENDER_IN_NON_VISIBLE = "enStatStallRenderInNonVisible";
    public static final String ORANGE_ENABLE_SURFACEVIEW_REBUILD_BUSINESSTYPE_LIST = "svRebuildList";
    public static final String ORANGE_ENABLE_SYNC_AFTER_SEEK = "enSyncAfterSeek";
    public static final String ORANGE_ENABLE_VIDEO_REDNER_STALLED_DURATION_THRESHOLD = "VideoRenderStalledDurationThreshold";
    public static final String ORANGE_ENABLE_VIDEO_REDNER_STALLED_STATS = "enableVideoRenderStalledStats";
    public static final String ORANGE_ENABLE_VPM_ALGO = "enableVPMAlgo";
    public static final String ORANGE_ENABLE_VPM_HEADR_BEAT_INTERAVL = "heartBeatInterval";
    public static final String ORANGE_ENABLE_VPM_HEADR_BEAT_OLD_SWITCH = "vpmHeartBeatOldSwitch";
    public static final String ORANGE_FIND_STREAM_INFO_OPT = "findStreamInfoOpt";
    public static final String ORANGE_FIX_ABNORMAL_STAT_FOR_FIRST_RENDER = "enableFixAbnormalStatForFirstRender2";
    public static final String ORANGE_FIX_ABNORMAL_STAT_FOR_LOOP = "enableFixAbnormalStatForLoop";
    public static final String ORANGE_GET_LATENCE_LEVEL = "getLatenceLevel";
    public static final String ORANGE_HARDWARE_AUDIO = "audioHardwareDecode";
    public static final String ORANGE_HARDWARE_AUDIO_BLACK = "audioHardwareDecodeBlackList";
    public static final String ORANGE_KEY_MAX_VALID_NET_SPEED = "MaxValidNetSpeed";
    public static final String ORANGE_KEY_NET_SPEED_COLLECT_INTERVAL = "NetSpeedCollectInterval";
    public static final String ORANGE_LIVEROOM_SWITCH_TO_BACKGROUND_KEY = "liveRoomSwitchToBackGroundKey";
    public static final String ORANGE_LIVEROOM_SWITCH_TO_FRONT_KEY = "liveRoomSwitchToFrontKey";
    public static final String ORANGE_LIVE_FAST_PLAY = "enableLiveFastPlay";
    public static final String ORANGE_MAX_NORMAL_PLAY_AUDIO_FRAME_COUNT = "maxNormalPlayAudioFrameCount";
    public static final String ORANGE_MAX_PLAYER_NUM_32 = "maxPlayerNums32";
    public static final String ORANGE_MAX_RENDER_ABNORMAL_IN_RENDER_THREAD = "maxRenderAbnormal";
    public static final String ORANGE_MIN_NORMAL_PLAY_AUDIO_FRAME_COUNT = "minNormalPlayAudioFrameCount";
    public static final String ORANGE_MIN_SYNC_TIME_IN_ARTC = "minSyncTimeInArtc";
    public static final String ORANGE_OPT_BUFFER_CALLBACK = "optBufferCallback";
    public static final String ORANGE_OPT_SOURCER_PIPE_SIZE_LIST = "optSourcerPipeSizeList";
    public static final String ORANGE_OUT_PUT_LAST_FRAME = "outputLastVideoFrame";
    public static final String ORANGE_OUT_PUT_LAST_FRAME_NEW = "outputLastVideoFrameNew";
    public static final String ORANGE_PANO_MAX_POLAR_DEGREES = "panoMaxPolarDegree";
    public static final String ORANGE_PROBESIZE_OF_FLV_OR_M3U8_WITHOUT_DECODER = "probesizeWithoutDec";
    public static final String ORANGE_RTC_DECODE_WAIT_TIME = "rtcDecodeWaitTime";
    public static final String ORANGE_SET_START_POS_DO_ACCUESEEK = "startPosDoAccuSeek";
    public static final String ORANGE_SET_START_TIME_DEFAULT_VALUE = "setStartTimeDefaulteValue";
    public static final String ORANGE_STAT_MAX_FRAME_PER_SEC = "statRenderFramePerSec";
    public static final String ORANGE_SUPPORT_SET_START_POSITION = "setStartPosition";
    public static final String ORANGE_SWITCH_STREAM_CAN_USE_SINGLE_DECODE = "switchStreamCanUsingSingleDecode";
    public static final String ORANGE_SWITCH_STREAM_HIGHER_TIMEOUT = "switchStreamHigherTimeout";
    public static final String ORANGE_SWITCH_STREAM_LOWER_TIMEOUT = "switchStreamLowerTimeout";
    public static final String ORANGE_SWITCH_STREAM_NEW_DEFIINITION_TIMEOUT = "switchNewDefTimeout";
    public static final String ORANGE_SW_RENDER_RGB = "swRenderRGB";
    public static final String ORANGE_SW_STD_PIXEL_YUV = "swStdPixelYUVRender";
    public static final String ORANGE_SYNC_BY_DRIFT_PTS = "syncByDriftPts";
    public static final String ORANGE_UI_THREAD_ENABLE_WATCH = "enableWatch";
    public static final String ORANGE_UI_THREAD_WATCH_EXCEED_THRESHOLD = "watchExceedThreshold";
    public static final String ORANGE_UI_THREAD_WATCH_INTERVAL = "watchInterval";
    public static final String ORANGE_USENEWHEVC = "UseNewHEVC2";
    public static final String ORANGE_USE_ENABLE_AUDIO_CLIP = "EnableAudioForceEosControl";
    public static final String ORANGE_USE_ENABLE_SEEK_FLUSH_BUFFER = "EnableSeekFlushControl";
    public static final String ORANGE_USE_SEEK_FLUSH_MODE_BUSSINESSTYPE = "SeekFlushModeSubBusinessTypes";
    public static final String ORANGE_VIDEO_SOURCER_PIPE_SIZE = "videoSourcerPipeSize";
    public static final int RTCSTREAM_TRANSPORT_STREAM_INFO = 21990;
    public static final int SWITCH_NEW_DEFINITION_BY_ABR = 2;
    public static final int SWITCH_NEW_DEFINITION_BY_ABR_WITH_INTERACTIVE = 3;
    public static final int SWITCH_NEW_DEFINITION_BY_USER = 1;
    public static final int SWITCH_STATUS_FAIL = 2;
    public static final int SWITCH_STATUS_START = 0;
    public static final int SWITCH_STATUS_SUCCESS = 1;
    public static final int SWITCH_VIEW_SIZE_CHANGED = 0;
    private static final String TAG = "AVSDK";
    private static Context mApplicationContext;
    private static volatile d mDisableHardwareUtil;
    private static volatile boolean mIsLibLoaded;
    private static BluetoothStateBroadcastReceive mReceiveInstance;
    private static HashMap<Long, TaobaoMediaPlayer> mTaobaoMediaPlayerMap;
    private boolean isFirstFrameRenderedFlag;
    private AdaptiveLiveController mAdapitveLiveController;
    private boolean mAudioOff;
    private int mCurrNetworkQuality;
    private long mDuration;
    private boolean mEnableBroadcastWhenMuteChanged;
    private boolean mEnableCallPreRelease;
    private boolean mEnableNetworkQuality;
    private EventHandler mEventHandler;
    private HashSet<Long> mExperienceBucketIdSet;
    private HashSet<Long> mExperienceIdSet;
    private HashSet<Long> mExperienceReleaseIdSet;
    private boolean mFixStartOnPrepared;
    private TextureView mFrameInfoBaseView;
    private SurfaceView mFrameInfoSurfaceView;
    private TextureView mFrameInfoTextureView;
    private boolean mHasPostRenderFirstMesasgeInReuseState;
    private boolean mIsReceiverRegistered;
    private long mLastPoorNetStartTs;
    private long mNativeMediaPlayer;
    private List<Integer> mNetworkQualityStateNodes;
    private float mPanoMaxPolarToleranceDegrees;
    private long mPlayerCreatTs;
    private long mPoorNetworkTime;
    public HashMap<String, String> mRequestHeader;
    private long mRtcAudioFakeDisable;
    private boolean mStartDisableAudio;
    private long mTextureVideoViewNativeToken;
    private int mVideoHeight;
    private int mVideoSarDen;
    private int mVideoSarNum;
    private int mVideoWidth;
    private ViewGroup mViewGroup;
    private String statRecentBufPerMs;
    private String statRecentFFLive;
    private String statRecentLiveSpeedMax;
    private String statRecentLiveSpeedMean;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class CommitFetchSoStatRunnable implements Runnable {
        final TaobaoMediaPlayer mediaPayer;

        static {
            kge.a(-960812750);
            kge.a(-1390502639);
        }

        private CommitFetchSoStatRunnable() {
            this.mediaPayer = TaobaoMediaPlayer.this;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException unused) {
            }
            TaobaoMediaPlayer.this.commitFetchSoEvent(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class EventHandler extends Handler {
        private boolean bFirstFrameRendered;
        private WeakReference<TaobaoMediaPlayer> mWeakPlayer;

        static {
            kge.a(258268046);
        }

        public EventHandler(TaobaoMediaPlayer taobaoMediaPlayer, Looper looper) {
            super(looper);
            this.bFirstFrameRendered = false;
            this.mWeakPlayer = new WeakReference<>(taobaoMediaPlayer);
        }

        /* JADX WARN: Removed duplicated region for block: B:221:0x04e4  */
        /* JADX WARN: Removed duplicated region for block: B:393:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r25) {
            /*
                Method dump skipped, instructions count: 1959
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.EventHandler.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class UnregisterFetchSoRunnable implements Runnable {
        final TaobaoMediaPlayer mediaPayer;

        static {
            kge.a(1256539289);
            kge.a(-1390502639);
        }

        private UnregisterFetchSoRunnable() {
            this.mediaPayer = TaobaoMediaPlayer.this;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.taobao.taobaoavsdk.c.d(this.mediaPayer);
        }
    }

    static {
        kge.a(1147662278);
        kge.a(100453237);
        kge.a(-10520708);
        kge.a(1650324184);
        mIsLibLoaded = false;
        mApplicationContext = null;
        mTaobaoMediaPlayerMap = new HashMap<>();
    }

    public TaobaoMediaPlayer() {
        this.mPanoMaxPolarToleranceDegrees = 20.0f;
        this.mRequestHeader = null;
        this.isFirstFrameRenderedFlag = false;
        this.mExperienceIdSet = new HashSet<>();
        this.mExperienceReleaseIdSet = new HashSet<>();
        this.mExperienceBucketIdSet = new HashSet<>();
        this.mIsReceiverRegistered = false;
        this.mFixStartOnPrepared = true;
        this.mEnableCallPreRelease = true;
        this.mEnableBroadcastWhenMuteChanged = true;
        this.mAudioOff = false;
        this.mStartDisableAudio = false;
        this.mRtcAudioFakeDisable = 0L;
        this.mAdapitveLiveController = null;
        this.mTextureVideoViewNativeToken = 0L;
        this.mPoorNetworkTime = -1L;
        this.mNetworkQualityStateNodes = new LinkedList();
        this.mLastPoorNetStartTs = -1L;
        this.mCurrNetworkQuality = 0;
        this.mEnableNetworkQuality = false;
        this.mPlayerCreatTs = -1L;
        initPlayer(null);
    }

    public TaobaoMediaPlayer(Context context) {
        super(context);
        this.mPanoMaxPolarToleranceDegrees = 20.0f;
        this.mRequestHeader = null;
        this.isFirstFrameRenderedFlag = false;
        this.mExperienceIdSet = new HashSet<>();
        this.mExperienceReleaseIdSet = new HashSet<>();
        this.mExperienceBucketIdSet = new HashSet<>();
        this.mIsReceiverRegistered = false;
        this.mFixStartOnPrepared = true;
        this.mEnableCallPreRelease = true;
        this.mEnableBroadcastWhenMuteChanged = true;
        this.mAudioOff = false;
        this.mStartDisableAudio = false;
        this.mRtcAudioFakeDisable = 0L;
        this.mAdapitveLiveController = null;
        this.mTextureVideoViewNativeToken = 0L;
        this.mPoorNetworkTime = -1L;
        this.mNetworkQualityStateNodes = new LinkedList();
        this.mLastPoorNetStartTs = -1L;
        this.mCurrNetworkQuality = 0;
        this.mEnableNetworkQuality = false;
        this.mPlayerCreatTs = -1L;
        initPlayer(null);
    }

    public TaobaoMediaPlayer(Context context, ddc ddcVar) {
        super(context, ddcVar);
        this.mPanoMaxPolarToleranceDegrees = 20.0f;
        this.mRequestHeader = null;
        this.isFirstFrameRenderedFlag = false;
        this.mExperienceIdSet = new HashSet<>();
        this.mExperienceReleaseIdSet = new HashSet<>();
        this.mExperienceBucketIdSet = new HashSet<>();
        this.mIsReceiverRegistered = false;
        this.mFixStartOnPrepared = true;
        this.mEnableCallPreRelease = true;
        this.mEnableBroadcastWhenMuteChanged = true;
        this.mAudioOff = false;
        this.mStartDisableAudio = false;
        this.mRtcAudioFakeDisable = 0L;
        this.mAdapitveLiveController = null;
        this.mTextureVideoViewNativeToken = 0L;
        this.mPoorNetworkTime = -1L;
        this.mNetworkQualityStateNodes = new LinkedList();
        this.mLastPoorNetStartTs = -1L;
        this.mCurrNetworkQuality = 0;
        this.mEnableNetworkQuality = false;
        this.mPlayerCreatTs = -1L;
        initPlayer(null);
    }

    public TaobaoMediaPlayer(Context context, ddc ddcVar, ddd dddVar) {
        super(context, ddcVar);
        this.mPanoMaxPolarToleranceDegrees = 20.0f;
        this.mRequestHeader = null;
        this.isFirstFrameRenderedFlag = false;
        this.mExperienceIdSet = new HashSet<>();
        this.mExperienceReleaseIdSet = new HashSet<>();
        this.mExperienceBucketIdSet = new HashSet<>();
        this.mIsReceiverRegistered = false;
        this.mFixStartOnPrepared = true;
        this.mEnableCallPreRelease = true;
        this.mEnableBroadcastWhenMuteChanged = true;
        this.mAudioOff = false;
        this.mStartDisableAudio = false;
        this.mRtcAudioFakeDisable = 0L;
        this.mAdapitveLiveController = null;
        this.mTextureVideoViewNativeToken = 0L;
        this.mPoorNetworkTime = -1L;
        this.mNetworkQualityStateNodes = new LinkedList();
        this.mLastPoorNetStartTs = -1L;
        this.mCurrNetworkQuality = 0;
        this.mEnableNetworkQuality = false;
        this.mPlayerCreatTs = -1L;
        initPlayer(dddVar);
        initProxyOnce(context);
    }

    private native void _audioOff();

    private native void _audioOn();

    private native void _disableOnRenderCallback();

    private native void _enableOnRenderCallback();

    private static native long _getCdnSpeed();

    private native long _getDuration();

    public static native String _getLastCdnPlayingSpeedNodesStr();

    private static native boolean _getRtcWeakNetFlag();

    private native long _getVPMSessioinId();

    private native float[] _hitTest(float f, float f2);

    private native void _initExternCache(String str);

    public static native void _initFFmpegDecoder(String str);

    public static native void _initS266Decoder(String str);

    private boolean _isVPMLibLoaded() {
        Context context = this.mContextRef == null ? null : this.mContextRef.get();
        if (context == null || !"com.taobao.avsdk.test".equals(context.getPackageName())) {
            return isVPMLibLoaded();
        }
        return true;
    }

    private native void _onRenderingHung();

    private native void _onRenderingResumed();

    private native void _pause() throws IllegalStateException;

    private native void _preRelease();

    private native void _refreshScreen();

    private native void _release();

    private native void _releaseAlphaBitmap();

    private native void _releaseSurface();

    private native void _seekTo(long j) throws IllegalStateException;

    private native void _seekToPause(long j, boolean z);

    private native void _setAlphaBitmap(Bitmap bitmap);

    private native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setSeamlessSwitchMode(int i);

    private native void _setSeamlessSwitchUrl(String str);

    private native void _setVideoSurface(Object obj);

    private native void _setVideoSurfaceSize(int i, int i2);

    private native void _start() throws IllegalStateException;

    private native void _startRtcAdaption(String str);

    private native void _stop() throws IllegalStateException;

    private native void _stopExternCache(String str);

    private native void _stopRtcAdaption();

    private native void _stopSeamlessSwitch();

    private native void _switchStream(Surface surface);

    private native void _updateAlphaBitmap(Bitmap bitmap);

    private native void _updateNetWorkInfo(String str);

    private native void _uploadRecvBytes();

    private void addFrameInfoView() {
        Context context = this.mContextRef == null ? null : this.mContextRef.get();
        if (this.mFrameInfoBaseView != null || this.mViewGroup == null) {
            return;
        }
        this.mFrameInfoBaseView = new TextureView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(500, 150);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = this.mFrameInfoTop1Position;
        this.mViewGroup.addView(this.mFrameInfoBaseView, -1, layoutParams);
        this.mFrameInfoBaseView.bringToFront();
        if (this.mFrameInfoLevel == 1 || this.mFrameInfoLevel == 99) {
            this.mFrameInfoTextureView = new TextureView(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(800, 150);
            layoutParams2.leftMargin = 0;
            layoutParams2.topMargin = this.mFrameInfoTop2Position;
            this.mViewGroup.addView(this.mFrameInfoTextureView, -1, layoutParams2);
            this.mFrameInfoTextureView.bringToFront();
        }
        if (this.mFrameInfoLevel != 2 && this.mFrameInfoLevel != 99) {
            return;
        }
        this.mFrameInfoSurfaceView = new SurfaceView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(800, 150);
        layoutParams3.leftMargin = 0;
        layoutParams3.topMargin = this.mFrameInfoTop2Position + 150;
        this.mViewGroup.addView(this.mFrameInfoSurfaceView, -1, layoutParams3);
        this.mFrameInfoSurfaceView.bringToFront();
    }

    private void callWithMsgInner(String str, String str2) {
        HashMap<String, String> b;
        if ("audioOn".equals(str)) {
            if (0 != this.mRtcAudioFakeDisable) {
                setMuted(false);
                return;
            }
            this.mAudioOff = false;
            _audioOn();
            monitorSetAudioOn();
        } else if ("audioOff".equals(str)) {
            if (0 != this.mRtcAudioFakeDisable) {
                setMuted(true);
                return;
            }
            this.mAudioOff = true;
            _audioOff();
            if (this.mStartDisableAudio) {
                monitorSetAudiOff();
            } else {
                initDisableAudio(true);
            }
        } else if (MediaConstant.CMD_LIVE_PUSH_CONTROL_INFO.equals(str)) {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.mLivePushControlInfo = str2;
            generateRtcLiveControllInfoAndSetToCore();
        } else if (MediaConstant.CMD_LIVE_REMOVE_CONTROL_INFO.equals(str)) {
            this.mLivePushControlInfo = null;
        } else if (MediaConstant.CMD_UPDATE_PLAY_EX.equals(str)) {
            if (TextUtils.isEmpty(str2) || (b = b.b(str2, ",", "=")) == null || b.size() <= 0) {
                return;
            }
            if (this.mDynamicPlayExMap == null) {
                this.mDynamicPlayExMap = new HashMap<>();
            }
            this.mDynamicPlayExMap.putAll(b);
        } else if (MediaConstant.CMD_ENTER_FLOATING.equals(str)) {
            this.mIsFloatWindow = "1".equals(str2);
            if (this.mIsFloatWindow) {
                monitorStartPlayWithFloatWindow();
            } else {
                monitorEndPlayWithFloatWindow();
            }
            checkStatRenderStallFlag();
        } else if (MediaConstant.CMD_SWITCH_SCENE.equals(str)) {
            if (this.mSwitchSceneTime == 0) {
                this.mSwitchScene = str2;
                this.mSwitchSceneTime = System.currentTimeMillis();
            }
            if (str2.equals(this.mSwitchToBackKey)) {
                monitorStartPlayInBackground();
            } else if (!str2.equals(this.mSwitchToFrontKey)) {
            } else {
                monitorEndPlayInBackground();
            }
        } else if (MediaConstant.CMD_SET_VIEW_VISIBLE.equals(str)) {
            boolean equals = "1".equals(str2);
            if (!equals && isPlaying()) {
                AVSDKLog.e("AVSDK", "checkInvisible/BG playing: sbt=" + this.mConfig.y + "," + this + " still playing when viewInVisible");
                this.mIsPlayingWhenInvisible = true;
                if (this.mConfigAdapter != null && b.b(this.mConfig.y, this.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_SHOULD_PAUSE_WHEN_INVISIBLE_SBT, ""))) {
                    AVSDKLog.e("AVSDK", "yezo:pause in callWithMsgInner");
                    pause();
                }
            }
            if (this.mViewIsVisible == equals) {
                return;
            }
            this.mViewIsVisible = equals;
            if (this.mViewIsVisible) {
                onRenderingResumed();
                if (this.mEnableRenderStallCalNew) {
                    onRenderingResumedV2();
                }
            } else {
                onRenderingHung();
                if (this.mEnableRenderStallCalNew) {
                    onRenderingHungV2();
                }
            }
            checkStatRenderStallFlag();
        } else if (MediaConstant.CMD_SET_RECYCEL_REASON.equals(str)) {
            this.mReleaseReason = b.b(str2);
        } else if (MediaConstant.CMD_SET_SURFACE_TIME.equals(str)) {
            this.mSurfaceTime = b.c(str2);
        } else if (MediaConstant.CMD_SET_FIRST_FRAME_UPDATE_TIME.equals(str)) {
            this.mFirstFrameSurfaceUpdateTs = b.c(str2);
            if (getConfig() == null) {
                return;
            }
            AVSDKLog.e("AVSDK", "playToken=" + getConfig().t + ",yezo: set mFirstFrameSurfaceUpdateTs=" + this.mFirstFrameSurfaceUpdateTs);
            this.isFirstFrameRenderedFlag = true;
        } else if (!MediaConstant.CMD_SET_ENTER_VOICE_ROOM.equals(str)) {
        } else {
            int b2 = b.b(str2);
            this.mConfig.aZ = b2;
            if (!this.mIsPlayingFlv || !this.mEnableDecodeAACDSE) {
                return;
            }
            if (b2 == 1) {
                _setPropertyLong(FFP_PROP_INT64_ENABLE_DECODE_AAC_DSE, 1L);
            } else if (b2 != 0) {
            } else {
                _setPropertyLong(FFP_PROP_INT64_ENABLE_DECODE_AAC_DSE, 0L);
            }
        }
    }

    private boolean checkUseMediaCodec() {
        boolean z;
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_DISABLE_HARDWARE_DECODER_STRATEGY, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        if (TextUtils.isEmpty(config) || MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264.equals(config)) {
            z = !b.b(this.mConfig.y, OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_DISABLE_HARDWARE_DECODER_LIST, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264));
        } else {
            if (mDisableHardwareUtil == null) {
                d dVar = new d();
                mDisableHardwareUtil = dVar;
                dVar.a("model", "" + Build.MODEL);
                mDisableHardwareUtil.a(g4.a.f3423a, "" + Build.VERSION.SDK_INT);
                mDisableHardwareUtil.a("cpu_name", b.a());
                mDisableHardwareUtil.a("brand", Build.BRAND);
                long _getUsingSoType = _getUsingSoType();
                mDisableHardwareUtil.a("armeabi", "" + _getUsingSoType);
            }
            mDisableHardwareUtil.a(config);
            mDisableHardwareUtil.a();
            mDisableHardwareUtil.b(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TYPE, this.mConfig.x);
            mDisableHardwareUtil.b(snv.EXP_KEY_SUB_BUSINESS_TYPE, this.mConfig.y);
            mDisableHardwareUtil.b("component", this.mUsingInterface);
            mDisableHardwareUtil.b(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, this.mConfig.B);
            z = !mDisableHardwareUtil.b();
        }
        if (oyu.i()) {
            return false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        if (r16.mConfig.f == 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void chooseDecodeAndRender(com.taobao.taobaoavsdk.widget.media.c r17) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.chooseDecodeAndRender(com.taobao.taobaoavsdk.widget.media.c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void commitFetchSoEvent(boolean z) {
        if (this.mHasCommitFetchSoFinish) {
            return;
        }
        this.mHasCommitFetchSoFinish = z;
        this.mFetchSoTime = System.currentTimeMillis() - this.mFetchSoStartTime;
        String[] strArr = new String[3];
        int i = 0;
        strArr[0] = "ver=1,";
        strArr[1] = "fetch_time=" + this.mFetchSoTime;
        StringBuilder sb = new StringBuilder();
        sb.append("end=");
        if (z) {
            i = 1;
        }
        sb.append(i);
        strArr[2] = sb.toString();
        TBS.Adv.ctrlClicked("Page_Video", CT.Button, "AVSDKFetchSo", strArr);
    }

    private static String computeMD5(String str) {
        return p.e(str);
    }

    private String convertSetToString(HashSet<Long> hashSet, String str) {
        StringBuilder sb;
        Iterator<Long> it = hashSet.iterator();
        String str2 = "";
        while (it.hasNext()) {
            Long next = it.next();
            if (TextUtils.isEmpty(str2)) {
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                str2 = "_";
            }
            sb.append(str2);
            sb.append(next.longValue());
            str2 = sb.toString();
        }
        return str2;
    }

    private static boolean deleteFile(File file) {
        if (!file.isDirectory()) {
            if (!file.exists()) {
                return false;
            }
            return file.delete();
        }
        for (File file2 : file.listFiles()) {
            deleteFile(file2);
        }
        return file.delete();
    }

    private static void drawFrame(long j, String str) {
        TaobaoMediaPlayer taobaoMediaPlayerFromToken = getTaobaoMediaPlayerFromToken(j);
        if (taobaoMediaPlayerFromToken == null) {
            return;
        }
        taobaoMediaPlayerFromToken.drawFrameInfo(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void drawFrameInfo(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.drawFrameInfo(java.lang.String):void");
    }

    private void generateRtcLiveControllInfoAndSetToCore() {
        JSONObject optJSONObject;
        if (TextUtils.isEmpty(this.mLivePushControlInfo) || !this.mEnableRtcSwitch) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(this.mLivePushControlInfo);
            if (jSONObject2.has("ntpStartLiveOffset")) {
                long j = jSONObject2.getLong("ntpStartLiveOffset");
                if (j > 0) {
                    _callWithMsgLong(FFP_PROP_INT64_NTP_START_OFFSET, j);
                }
            }
            jSONObject.put("width", "" + jSONObject2.optInt("width"));
            if (jSONObject2.has("dataChannelMsId") && jSONObject2.has("streamLevelPriorityList") && jSONObject2.has("streamLevelInfo")) {
                if (jSONObject2.has("dataChannelMsId")) {
                    jSONObject.put("dataChannelMsId", "" + jSONObject2.optString("dataChannelMsId"));
                }
                if (jSONObject2.has("streamLevelPriorityList")) {
                    JSONArray optJSONArray = jSONObject2.optJSONArray("streamLevelPriorityList");
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        jSONArray.put(optJSONArray.optInt(i) + "");
                    }
                    jSONObject.put("streamLevelPriorityList", jSONArray);
                }
                if (jSONObject2.has("streamLevelInfo")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("streamLevelInfo");
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("streamIndex", next);
                        jSONObject4.put("streamLevel", jSONObject3.optJSONObject(next).has("streamLevel") ? "" + optJSONObject.optInt("streamLevel") : "-1");
                        jSONObject4.put("streamId", "" + optJSONObject.optString("streamId"));
                        jSONArray2.put(jSONObject4);
                    }
                    jSONObject.put("streamLevelInfo", jSONArray2);
                }
                String jSONObject5 = jSONObject.toString();
                AVSDKLog.e("AVSDK", this + " generateRtcLiveControllInfoAndSetToCore: " + jSONObject5);
                _setPropertyString(21011, jSONObject5);
            }
        } catch (Exception e) {
            AVSDKLog.e("AVSDK", "generateRtcLiveControllInfoAndSetToCore exception " + e.toString());
        }
    }

    private static synchronized long generateTextVideoViewToken(TaobaoMediaPlayer taobaoMediaPlayer) {
        long currentTimeMillis;
        synchronized (TaobaoMediaPlayer.class) {
            currentTimeMillis = System.currentTimeMillis() - new Random().nextInt();
            mTaobaoMediaPlayerMap.put(Long.valueOf(currentTimeMillis), taobaoMediaPlayer);
        }
        return currentTimeMillis;
    }

    private Context getApplicationContext() {
        if (mApplicationContext == null) {
            mApplicationContext = (this.mContextRef == null ? null : this.mContextRef.get()).getApplicationContext();
        }
        return mApplicationContext;
    }

    public static long getCdnSpeed() {
        if (mIsLibLoaded) {
            return _getCdnSpeed();
        }
        return 0L;
    }

    public static boolean getRtcWeakNetFlag() {
        if (mIsLibLoaded) {
            return _getRtcWeakNetFlag();
        }
        return false;
    }

    private static synchronized TaobaoMediaPlayer getTaobaoMediaPlayerFromToken(long j) {
        synchronized (TaobaoMediaPlayer.class) {
            if (j == 0) {
                return null;
            }
            return mTaobaoMediaPlayerMap.get(Long.valueOf(j));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int initFetchSo() {
        /*
            r12 = this;
            boolean r0 = com.taobao.taobaoavsdk.c.b()
            r12.mFetchArtcSoReadyInit = r0
            boolean r0 = r12.mFetchArtcSoReadyInit
            java.lang.String r1 = "disableFetchInfo"
            r2 = 0
            java.lang.String r3 = "false"
            java.lang.String r4 = "DWInteractive"
            r5 = 1
            if (r0 == 0) goto L5f
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = tv.danmaku.ijk.media.player.TaobaoMediaPlayer.mArtcSoPath
            tb.ozr r6 = tb.ozr.e()
            java.lang.String r6 = r6.a()
            r0.set(r6)
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = tv.danmaku.ijk.media.player.TaobaoMediaPlayer.mArtcSoMajorVersion
            tb.ozr r6 = tb.ozr.e()
            java.lang.String r6 = r6.c()
            r0.set(r6)
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = tv.danmaku.ijk.media.player.TaobaoMediaPlayer.mArtcSoMinorVersion
            tb.ozr r6 = tb.ozr.e()
            java.lang.String r6 = r6.d()
            r0.set(r6)
            com.taobao.orange.OrangeConfig r0 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r0 = r0.getConfig(r4, r1, r3)
            boolean r0 = com.taobao.taobaoavsdk.util.b.a(r0)
            if (r0 == 0) goto L51
            r7 = 811(0x32b, double:4.007E-321)
            r9 = 1
            r11 = 0
            r6 = r12
            r6.notifyVideoInfo(r7, r9, r11)
        L51:
            com.taobao.taobaoavsdk.widget.media.c r0 = r12.mConfig
            if (r0 == 0) goto L78
            com.taobao.taobaoavsdk.widget.media.c r0 = r12.mConfig
            boolean r0 = r0.aQ
            if (r0 == 0) goto L78
            r12.mFetchArtcSoAfterSelect = r5
            r0 = -1
            goto L79
        L5f:
            com.taobao.orange.OrangeConfig r0 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r0 = r0.getConfig(r4, r1, r3)
            boolean r0 = com.taobao.taobaoavsdk.util.b.a(r0)
            if (r0 == 0) goto L76
            r7 = 811(0x32b, double:4.007E-321)
            r9 = 0
            r11 = 0
            r6 = r12
            r6.notifyVideoInfo(r7, r9, r11)
        L76:
            r12.mNeedRegisterFetchCallback = r5
        L78:
            r0 = 0
        L79:
            boolean r1 = com.taobao.taobaoavsdk.c.c()
            r12.mFetchFFMpegSoReadyInit = r1
            com.taobao.orange.OrangeConfig r1 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r6 = "disaDecoder"
            java.lang.String r1 = r1.getConfig(r4, r6, r3)
            boolean r1 = com.taobao.taobaoavsdk.util.b.a(r1)
            if (r1 == 0) goto L91
            r12.mFetchFFMpegSoReadyInit = r2
        L91:
            boolean r1 = r12.mFetchFFMpegSoReadyInit
            if (r1 == 0) goto Lbf
            boolean r1 = tv.danmaku.ijk.media.player.TaobaoMediaPlayer.mIsDecoderLoadedGlobal
            if (r1 != 0) goto Lbf
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = tv.danmaku.ijk.media.player.TaobaoMediaPlayer.mFFMpegSoPath
            tb.ozr r2 = tb.ozr.e()
            java.lang.String r2 = r2.b()
            r1.set(r2)
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = tv.danmaku.ijk.media.player.TaobaoMediaPlayer.mFFMpegSoPath
            java.lang.Object r1 = r1.get()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lbf
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = tv.danmaku.ijk.media.player.TaobaoMediaPlayer.mFFMpegSoPath
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            loadDecoder(r1)
        Lbf:
            boolean r1 = r12.mFetchFFMpegSoReadyInit
            if (r1 == 0) goto Ld2
            boolean r1 = tv.danmaku.ijk.media.player.TaobaoMediaPlayer.mIsDecoderLoadedGlobal
            if (r1 == 0) goto Ld2
            r12.mIsDecoderLoaded = r5
            r1 = 80024(0x13898, float:1.12138E-40)
            r2 = 1
            r12._setPropertyLong(r1, r2)
            goto Ld4
        Ld2:
            r12.mNeedRegisterFetchCallback = r5
        Ld4:
            boolean r1 = r12.mNeedRegisterFetchCallback
            if (r1 == 0) goto Le8
            com.taobao.taobaoavsdk.c.c(r12)
            java.util.concurrent.ExecutorService r1 = com.taobao.taobaoavsdk.util.a.a()
            tv.danmaku.ijk.media.player.TaobaoMediaPlayer$CommitFetchSoStatRunnable r2 = new tv.danmaku.ijk.media.player.TaobaoMediaPlayer$CommitFetchSoStatRunnable
            r3 = 0
            r2.<init>()
            r1.submit(r2)
        Le8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.initFetchSo():int");
    }

    private void initPlayer(ddd dddVar) {
        com.taobao.taobaoavsdk.Tracer.b.a(this.mAnalysis, "INIT_PLAYER");
        this.mPlayerCreatTs = System.currentTimeMillis();
        loadLibrariesOnce(dddVar);
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.mEventHandler = new EventHandler(this, mainLooper);
        } else {
            this.mEventHandler = null;
        }
        native_setup(new WeakReference(this));
        _setOption(1, "timeout", 4000000L);
        this.mFixStartOnPrepared = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "fixStartOnPrepared", "true"));
        this.mEnableCallPreRelease = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enPrerelease2", "true"));
        this.mEnableBroadcastWhenMuteChanged = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enBroadcastWhenMuteChanged", "true"));
        com.taobao.taobaoavsdk.Tracer.b.c(this.mAnalysis, "INIT_PLAYER");
    }

    private static void initProxyOnce(Context context) {
        synchronized (TaobaoMediaPlayer.class) {
            try {
                oyw.a(context);
            }
        }
    }

    public static synchronized boolean isDecoderLoaded() {
        boolean z;
        synchronized (TaobaoMediaPlayer.class) {
            z = mIsDecoderLoadedGlobal;
        }
        return z;
    }

    public static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static boolean isVPMLibLoaded() {
        boolean e = com.taobao.taobaoavsdk.c.e();
        mIsVPMLibLoaded = e;
        return e;
    }

    public static synchronized void loadDecoder(String str) {
        synchronized (TaobaoMediaPlayer.class) {
            if (mIsLibLoaded && !mIsDecoderLoadedGlobal) {
                AVSDKLog.e("AVSDK", "loadDecoder " + str);
                mIsDecoderLoadedGlobal = true;
            }
        }
    }

    public static void loadLibrariesOnce(ddd dddVar) {
        loadVPMSoOnce();
        synchronized (TaobaoMediaPlayer.class) {
            if (!mIsLibLoaded) {
                if (dddVar == null) {
                    System.loadLibrary("c++_shared");
                    System.loadLibrary("tbffmpeg");
                    System.loadLibrary("taobaoplayer");
                }
                mIsLibLoaded = true;
            }
        }
    }

    public static synchronized boolean loadS266Decoder(String str) {
        synchronized (TaobaoMediaPlayer.class) {
            loadLibrariesOnce(null);
            if (!mIsLibLoaded) {
                AVSDKLog.e("AVSDK", "loadS266Decoder fail by loading other so fail");
                return false;
            }
            if (!mIs266DecoderLoadedGlobal) {
                AVSDKLog.e("AVSDK", "loadS266Decoder " + str);
                mIs266DecoderLoadedGlobal = true;
                _initS266Decoder(str);
            }
            return true;
        }
    }

    private static void loadVPMSoOnce() {
        synchronized (TaobaoMediaPlayer.class) {
            if (!mIsVPMLibLoaded && !mVPMLibLoadError) {
                if (b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "fixVPMLockANR", "false"))) {
                    try {
                        try {
                            try {
                                Class.forName("com.taobao.vpm.VPMManagerInstance").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                            } catch (ClassNotFoundException e) {
                                mVPMLibLoadError = true;
                                e.printStackTrace();
                            } catch (IllegalAccessException e2) {
                                mVPMLibLoadError = true;
                                e2.printStackTrace();
                            }
                        } catch (InvocationTargetException e3) {
                            mVPMLibLoadError = true;
                            e3.printStackTrace();
                        }
                    } catch (NoSuchMethodException e4) {
                        mVPMLibLoadError = true;
                        e4.printStackTrace();
                    }
                }
                mIsVPMLibLoaded = com.taobao.taobaoavsdk.c.e();
            }
        }
    }

    private native void native_setup(Object obj);

    private void notifyVideoInfo(long j, long j2, Object obj) {
        EventData eventData = new EventData();
        eventData.arg1 = j;
        eventData.arg2 = j2;
        eventData.obj = obj;
        notifyVideoInfo(eventData);
    }

    private static void onRenderFinish(Object obj) {
        TaobaoMediaPlayer taobaoMediaPlayer;
        if (obj == null || (taobaoMediaPlayer = (TaobaoMediaPlayer) ((WeakReference) obj).get()) == null) {
            return;
        }
        synchronized (TaobaoMediaPlayer.class) {
            if (taobaoMediaPlayer.mVFPluginListener != null) {
                for (IMediaPlayer.OnVFPluginListener onVFPluginListener : taobaoMediaPlayer.mVFPluginListener) {
                    onVFPluginListener.onRenderFinish(taobaoMediaPlayer);
                }
            }
        }
    }

    private static int onRenderOesTextureCallback(Object obj, int i, int i2, int i3, float[] fArr) {
        TaobaoMediaPlayer taobaoMediaPlayer;
        if (obj == null || (taobaoMediaPlayer = (TaobaoMediaPlayer) ((WeakReference) obj).get()) == null) {
            return -1;
        }
        synchronized (TaobaoMediaPlayer.class) {
            if (taobaoMediaPlayer.mVFPluginListener != null) {
                for (IMediaPlayer.OnVFPluginListener onVFPluginListener : taobaoMediaPlayer.mVFPluginListener) {
                    int onRenderOes = onVFPluginListener.onRenderOes(taobaoMediaPlayer, i, i2, i3, fArr);
                    if (onRenderOes >= 0) {
                        return onRenderOes;
                    }
                }
            }
            return -1;
        }
    }

    private static int onRenderYuvTextureCallback(Object obj, int i, int i2, int i3, int i4, int i5) {
        TaobaoMediaPlayer taobaoMediaPlayer;
        if (obj == null || (taobaoMediaPlayer = (TaobaoMediaPlayer) ((WeakReference) obj).get()) == null) {
            return -1;
        }
        synchronized (TaobaoMediaPlayer.class) {
            if (taobaoMediaPlayer.mVFPluginListener != null) {
                for (IMediaPlayer.OnVFPluginListener onVFPluginListener : taobaoMediaPlayer.mVFPluginListener) {
                    int onRenderYUV = onVFPluginListener.onRenderYUV(taobaoMediaPlayer, i, i2, i3, i4, i5);
                    if (onRenderYUV >= 0) {
                        return onRenderYUV;
                    }
                }
            }
            return -1;
        }
    }

    private void onVideoVolumeChangeBroadcast(boolean z, String str) {
        Intent intent = new Intent("com.taobao.avplayer.muteStateChanged");
        intent.putExtra("isMute", z);
        intent.putExtra("subBussinessType", str);
        Context context = this.mContextRef == null ? null : this.mContextRef.get();
        if (context != null) {
            context.sendBroadcast(intent);
        }
    }

    private static void postEventFromNative(Object obj, int i, long j, long j2, long j3, Object obj2) {
        if (obj == null) {
            return;
        }
        int i2 = (j > 3L ? 1 : (j == 3L ? 0 : -1));
        if (i2 == 0) {
            AVSDKLog.e("AVSDK", "postEventFromNative: before mp create");
        }
        TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) ((WeakReference) obj).get();
        if (taobaoMediaPlayer == null) {
            return;
        }
        if (i2 == 0) {
            AVSDKLog.e("AVSDK", "postEventFromNative: after mp create");
        }
        synchronized (TaobaoMediaPlayer.class) {
            if (taobaoMediaPlayer.mEventHandler != null) {
                if (i2 == 0) {
                    AVSDKLog.e("AVSDK", "postEventFromNative: real get in synchronized");
                }
                Message obtainMessage = taobaoMediaPlayer.mEventHandler.obtainMessage(i);
                EventData eventData = new EventData();
                eventData.arg1 = j;
                eventData.arg2 = j2;
                eventData.arg3 = j3;
                eventData.obj = obj2;
                obtainMessage.obj = eventData;
                if (taobaoMediaPlayer.mUseSurfaceView && j == 740) {
                    if (b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "disableSendMessageWhenSurfaceView", "true")) && taobaoMediaPlayer.mConfig != null && taobaoMediaPlayer.mConfig.b != 2) {
                        int i3 = (int) eventData.arg3;
                        if (i3 > 0) {
                            taobaoMediaPlayer.mRtcTotalRate += i3 / 100.0f;
                            taobaoMediaPlayer.mRtcTotalCount++;
                        }
                        taobaoMediaPlayer.monitorVideoRenderEveryFrame(j2);
                        if (taobaoMediaPlayer.mEnableRenderStallCalNew) {
                            taobaoMediaPlayer.monitorVideoRenderEveryFrameNew(j2);
                        }
                        return;
                    }
                    taobaoMediaPlayer.monitorVideoRenderEveryFrame(j2);
                    if (taobaoMediaPlayer.mEnableRenderStallCalNew) {
                        taobaoMediaPlayer.monitorVideoRenderEveryFrameNew(j2);
                    }
                }
                if (i != 1 && (i != 200 || i2 != 0)) {
                    if (i2 == 0) {
                        AVSDKLog.e("AVSDK", "postEventFromNative: before mp.mEventHandler.sendMessage(m)");
                    }
                    taobaoMediaPlayer.mEventHandler.sendMessage(obtainMessage);
                    if (i2 == 0) {
                        AVSDKLog.e("AVSDK", "postEventFromNative: after mp.mEventHandler.sendMessage(m)");
                    }
                }
                taobaoMediaPlayer.mEventHandler.sendMessageAtFrontOfQueue(obtainMessage);
            }
        }
    }

    private void postRenderingStartMesageInReuseState() {
        EventHandler eventHandler;
        if (!this.mReuseFlag || this.mHasPostRenderFirstMesasgeInReuseState || (eventHandler = this.mEventHandler) == null) {
            return;
        }
        this.mHasPostRenderFirstMesasgeInReuseState = true;
        Message obtainMessage = eventHandler.obtainMessage(200);
        EventData eventData = new EventData();
        eventData.arg1 = 3L;
        eventData.arg2 = System.currentTimeMillis();
        eventData.arg3 = 0L;
        obtainMessage.obj = eventData;
        this.mEventHandler.sendMessageAtFrontOfQueue(obtainMessage);
        AVSDKLog.e("AVSDK", "post another onInfo_MEDIA_INFO_VIDEO_RENDERING_START event");
    }

    private void recordFirstSetSurfaceTime(Surface surface) {
        if (surface == null || this.mFirstSetSurfaceTime != 0) {
            return;
        }
        this.mFirstSetSurfaceTime = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void registerBluetoothReceiver() {
        if ((this.mContextRef == null ? null : this.mContextRef.get()) == null) {
            AVSDKLog.e("AVSDK", this + " registerBluetoothReceiver fail index=" + this.mPlayerIndex);
            return;
        }
        if (mReceiveInstance == null) {
            mReceiveInstance = new BluetoothStateBroadcastReceive();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.media.SCO_AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_OFF");
            intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_ON");
            try {
                Context applicationContext = getApplicationContext();
                if (applicationContext != null) {
                    applicationContext.registerReceiver(mReceiveInstance, intentFilter);
                    this.mIsReceiverRegistered = true;
                }
            } catch (Exception unused) {
                AVSDKLog.e("AVSDK", "registerReceiver failed");
            }
        }
        mReceiveInstance.a(this);
        AVSDKLog.e("AVSDK", this + " registerBluetoothReceiver suc index=" + this.mPlayerIndex);
    }

    private synchronized void registerNetworkStateReceiver() {
        if (!this.mEnableNetworkQuality) {
            return;
        }
        try {
            g.a().a(this);
        } catch (Exception unused) {
            AVSDKLog.e("AVSDK", this + " registerNetworkStateReceiver failed index=" + this.mPlayerIndex);
        }
        AVSDKLog.e("AVSDK", this + " registerNetworkStateReceiver suc index=" + this.mPlayerIndex);
    }

    private static void removeDir(String str) {
        deleteFile(new File(str));
    }

    private void removeFrameInfoView() {
        ViewGroup viewGroup = this.mViewGroup;
        if (viewGroup == null) {
            return;
        }
        TextureView textureView = this.mFrameInfoBaseView;
        if (textureView != null) {
            viewGroup.removeView(textureView);
            this.mFrameInfoBaseView = null;
        }
        if (this.mFrameInfoBaseView != null) {
            this.mViewGroup.removeView(this.mFrameInfoTextureView);
            this.mFrameInfoTextureView = null;
        }
        if (this.mFrameInfoBaseView != null) {
            this.mViewGroup.removeView(this.mFrameInfoSurfaceView);
            this.mFrameInfoSurfaceView = null;
        }
        this.mViewGroup = null;
    }

    private static synchronized void removeTextureVideoViewByToken(long j) {
        synchronized (TaobaoMediaPlayer.class) {
            if (j != 0) {
                mTaobaoMediaPlayerMap.remove(Long.valueOf(j));
            }
        }
    }

    private void resizePlayerNum() {
        if (Build.VERSION.SDK_INT < 21 || _getUsingSoType() != 2) {
            return;
        }
        ozm.h().a(b.b(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_MAX_PLAYER_NUM_32, "3")));
    }

    private void setFlvExtraConfig() {
        if (!b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "enableFlvConfig", "true"))) {
            _setPropertyLong(FFP_PROP_INT64_FAST_PLAY, 0L);
            return;
        }
        oyu.Q();
        String str = oyu.aW;
        if (TextUtils.isEmpty(str)) {
            str = MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "flvConfigTest", "");
            if (TextUtils.isEmpty(str)) {
                return;
            }
        }
        setFlvExtraConfigInner(str);
    }

    private void setFlvExtraConfigInner(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("flvLiveControl_720");
            if (optJSONObject != null) {
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_MAX_QUEUE_TIME_MS_720, optJSONObject.optInt("maxQueueTimeMs"));
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_720, optJSONObject.optInt("fastPlayEnterMs"));
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_720, optJSONObject.optInt("fastPlayExitMs"));
                _setPropertyFloat(FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_720, (float) optJSONObject.optDouble("fastPlayRate"));
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("flvLiveControl_1080");
            if (optJSONObject2 != null) {
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_MAX_QUEUE_TIME_MS_1080, optJSONObject2.optInt("maxQueueTimeMs"));
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_1080, optJSONObject2.optInt("fastPlayEnterMs"));
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_1080, optJSONObject2.optInt("fastPlayExitMs"));
                _setPropertyFloat(FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_1080, (float) optJSONObject2.optDouble("fastPlayRate"));
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("flvLiveControl");
            if (optJSONObject3 == null) {
                return;
            }
            _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_MQX_QUEUE_TIME_MS_DEFAULT, optJSONObject3.optInt("maxQueueTimeMs"));
            _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_DEFAULT, optJSONObject3.optInt("fastPlayEnterMs"));
            _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_DEFAULT, optJSONObject3.optInt("fastPlayExitMs"));
            _setPropertyFloat(FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_DEFAULT, (float) optJSONObject3.optDouble("fastPlayRate"));
        } catch (JSONException e) {
            AVSDKLog.e("AVSDK", "setFlvExtraConfigInner " + str + ", error: " + e.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setGrtnRtcConfig(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.setGrtnRtcConfig(java.lang.String):void");
    }

    private void setHasSurface(Surface surface) {
        if (surface != null) {
            this.mHasSetSurface = true;
        }
    }

    private boolean showFrameInfo() {
        return this.mFrameInfoLevel >= 0;
    }

    private void stopAdaptiveLiveController() {
        AdaptiveLiveController adaptiveLiveController = this.mAdapitveLiveController;
        if (adaptiveLiveController != null) {
            adaptiveLiveController.stop();
            unregisterOnInfoListener(this.mAdapitveLiveController);
            unregisterOnPlayerEventListener(this.mAdapitveLiveController);
            this.mAdapitveLiveController = null;
        }
    }

    private void unregisterFetchCallback() {
        if (this.mNeedRegisterFetchCallback) {
            this.mNeedRegisterFetchCallback = false;
            a.a().submit(new UnregisterFetchSoRunnable());
        }
    }

    private synchronized void unregisterNetworkStateReceiver() {
        if (!this.mEnableNetworkQuality) {
            return;
        }
        try {
            g.a().b(this);
        } catch (Exception unused) {
            AVSDKLog.e("AVSDK", this + " unregisterNetworkStateReceiver failed index=" + this.mPlayerIndex);
        }
        AVSDKLog.e("AVSDK", this + " unregisterNetworkStateReceiver suc index=" + this.mPlayerIndex);
    }

    public native void _callWithMsgFloat(int i, float f);

    public native void _callWithMsgLong(int i, long j);

    public native void _callWithMsgString(int i, String str);

    public native float _getCurCachePosition();

    public native float _getPropertyFloat(int i, float f);

    public native long _getPropertyLong(int i, long j);

    public native String _getPropertyString(int i);

    public native long _getUsingSoType();

    public native float _getVideoRenderPts();

    public native void _notifyVideoRenderStateChange();

    public native void _prepareAsync() throws IllegalStateException;

    public native String _sendDebugCommand(String str);

    public native void _setBluetoothConnectStatus(int i);

    public native void _setOption(int i, String str, long j);

    public native void _setOption(int i, String str, String str2);

    public native void _setPropertyFloat(int i, float f);

    public native void _setPropertyLong(int i, long j);

    public native void _setPropertyString(int i, String str);

    public native int _switchPathSyncFrame(String str);

    public void addExperienceInfo(long j, long j2, long j3) {
        this.mExperienceIdSet.add(Long.valueOf(j));
        this.mExperienceReleaseIdSet.add(Long.valueOf(j2));
        this.mExperienceBucketIdSet.add(Long.valueOf(j3));
    }

    public void addExperienceInfo(HashSet<Long> hashSet, HashSet<Long> hashSet2, HashSet<Long> hashSet3) {
        this.mExperienceIdSet.addAll(hashSet);
        this.mExperienceReleaseIdSet.addAll(hashSet2);
        this.mExperienceBucketIdSet.addAll(hashSet3);
    }

    public void audioOff() {
        if (0 != this.mRtcAudioFakeDisable) {
            setMuted(true);
            return;
        }
        this.mAudioOff = true;
        _audioOff();
        if (this.mStartDisableAudio) {
            monitorSetAudiOff();
        } else {
            initDisableAudio(true);
        }
    }

    public void audioOn() {
        if (0 != this.mRtcAudioFakeDisable) {
            setMuted(false);
            return;
        }
        this.mAudioOff = false;
        _audioOn();
        monitorSetAudioOn();
    }

    public void callWithMsg(Map<String, String> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            callWithMsgInner(entry.getKey(), entry.getValue());
        }
    }

    public void disableOnRenderCallback() {
        _disableOnRenderCallback();
    }

    public void enableOnRenderCallback() {
        _enableOnRenderCallback();
    }

    public BluetoothStateBroadcastReceive.BLUESTATUS getBlueConnectStatus() {
        BluetoothStateBroadcastReceive bluetoothStateBroadcastReceive = mReceiveInstance;
        return bluetoothStateBroadcastReceive != null ? bluetoothStateBroadcastReceive.a() : BluetoothStateBroadcastReceive.BLUESTATUS.NOTOPEN;
    }

    public void getBlueToothState() {
        BluetoothStateBroadcastReceive bluetoothStateBroadcastReceive = mReceiveInstance;
        if (bluetoothStateBroadcastReceive != null) {
            if (bluetoothStateBroadcastReceive.a() == BluetoothStateBroadcastReceive.BLUESTATUS.CONNECT) {
                setBluetoothStatus(true);
            } else {
                setBluetoothStatus(false);
            }
        }
    }

    public boolean getBuleRegisterSattus() {
        return this.mIsReceiverRegistered;
    }

    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public float getCurCachePosition() {
        return _getCurCachePosition();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native long getCurrentPosition();

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
        if (this.mDuration <= 0) {
            this.mDuration = _getDuration();
        }
        return this.mDuration;
    }

    public boolean getEnableRtcSwitch() {
        return this.mEnableRtcSwitch;
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    protected String getExperienceBuctetId() {
        return convertSetToString(this.mExperienceBucketIdSet, "_");
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    protected String getExperienceId() {
        return convertSetToString(this.mExperienceIdSet, "_");
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    protected String getExperienceReleaseId() {
        return convertSetToString(this.mExperienceReleaseIdSet, "_");
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    protected String getExterntPlayEx() {
        AdaptiveLiveController adaptiveLiveController = this.mAdapitveLiveController;
        return adaptiveLiveController != null ? adaptiveLiveController.getPlayExStat() : "";
    }

    public HashMap<String, String> getLiveControlInfoForPlayEx() {
        Set<Map.Entry<String, Object>> entrySet;
        if (TextUtils.isEmpty(this.mLivePushControlInfo)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            com.alibaba.fastjson.JSONObject jSONObject = (com.alibaba.fastjson.JSONObject) JSON.parse(this.mLivePushControlInfo);
            if (jSONObject != null && (entrySet = jSONObject.entrySet()) != null && entrySet.size() > 0) {
                for (Map.Entry<String, Object> entry : entrySet) {
                    String str = entry.getKey().toString();
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(str, entry.getValue().toString());
                    }
                }
            }
        } catch (Exception e) {
            AVSDKLog.e("AVSDK", "getLiveControlInfoForPlayEx error " + e.toString());
        }
        return hashMap;
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public List<Integer> getNetworkQualityStateNodes() {
        return this.mNetworkQualityStateNodes;
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public long getPoorNetworkTime() {
        return this.mPoorNetworkTime;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public Map<String, String> getQos() {
        float f;
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", String.valueOf(this.mLastErrorCode));
        hashMap.put("abnormal_count", String.valueOf(this.mBufferingCount));
        hashMap.put("abnormal_total_time", String.valueOf(this.mBufferingTotalTime));
        hashMap.put("video_rendering_stalled_count", String.valueOf(this.videoRenderingStalledCount));
        hashMap.put("first_frame_rendering_time", String.valueOf(this.mFirstRenderTime));
        hashMap.put("first_frame_update_ts", String.valueOf(this.mFirstFrameSurfaceUpdateTs));
        if (this instanceof TaobaoMediaPlayer) {
            this.mHttpOpenTime = _getPropertyLong(FFP_PROP_INT64_AVFORMAT_OPEN_TIME, 0L);
            f = (((float) _getPropertyLong(21009, 0L)) / 1024.0f) / 1000.0f;
        } else {
            f = 0.0f;
        }
        hashMap.put("realtimeBandWidth", String.valueOf(f));
        hashMap.put("open_time", String.valueOf(this.mHttpOpenTime));
        if (this.mConfigClone != null) {
            hashMap.put("net_speed", String.valueOf(this.mConfigClone.K));
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getVPMHAStatString() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.getVPMHAStatString():java.lang.String");
    }

    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public long getVPMSessioinId() {
        return _getVPMSessioinId();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return (this.mRotate == 90 || this.mRotate == 270) ? this.mVideoWidth : this.mVideoHeight;
    }

    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public float getVideoRenderPts() {
        return _getVideoRenderPts();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return this.mVideoSarDen;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return this.mVideoSarNum;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return (this.mRotate == 90 || this.mRotate == 270) ? this.mVideoHeight : this.mVideoWidth;
    }

    public List<f> hitTest(List<e> list) {
        if (this.mPanoType == 0 || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (e eVar : list) {
            float[] _hitTest = _hitTest(eVar.b, eVar.c);
            if (_hitTest != null) {
                float[] fArr = _hitTest;
                if (fArr.length == 2) {
                    f fVar = new f();
                    fVar.f21338a = eVar;
                    fVar.b = fArr[0];
                    fVar.c = fArr[1];
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    public void initAdapitveLiveController(boolean z, int i, int i2, float f, float f2) {
        if (this.mConfig == null) {
            return;
        }
        boolean z2 = false;
        boolean z3 = (this.mConfig.b == 0) | (this.mConfig.b == 1);
        if (MediaConstant.RTCLIVE_URL_NAME.equals(this.mConfig.R) || MediaConstant.BFRTC_URL_NAME.equals(this.mConfig.R)) {
            z2 = true;
        }
        if (!z3 || !z2) {
            return;
        }
        this.mAdapitveLiveController = new AdaptiveLiveController(this);
        this.mAdapitveLiveController.initParam(z, i, i2, f, f2);
        registerOnPlayerEventListener(this.mAdapitveLiveController);
        registerOnInfoListener(this.mAdapitveLiveController);
        _setPropertyLong(80004, this.mAdapitveLiveController.getDeciseWindow());
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void instantSeekTo(long j) {
        if (this.mVolume != 0.0f && !this.bInstantSeeked) {
            this.mMuteAudio = true;
            _setPropertyLong(21008, 1L);
        }
        this.bInstantSeeked = true;
        monitorSeek();
        _seekTo(j);
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public boolean isAudioHardwareDecode() {
        return _getPropertyLong(FFP_PROP_INT64_AUDIO_DECODER_TYPE, 0L) == 2;
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public boolean isHardwareDecode() {
        long _getPropertyLong = _getPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, 0L);
        return _getPropertyLong == 32 || _getPropertyLong == 64;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native boolean isPlaying();

    public void monitorRtcLiveAbrReason(int i) {
        AVSDKLog.e("AVSDK", "monitorRtcLiveAbrReason reason: " + i);
        this.mRtcLiveAbrReasonList.offer(Integer.valueOf(i));
        if (this.mRtcLiveAbrReasonList.size() > 80) {
            this.mRtcLiveAbrReasonList.poll();
        }
    }

    public void notifySwitchLiveLevel(int i) {
        monitorSwitchLiveLevel(i);
        EventData eventData = new EventData();
        eventData.arg1 = 12002L;
        eventData.arg2 = i;
        notifyVideoInfo(eventData);
    }

    public void notifyVideoInfo(EventData eventData) {
        if (eventData == null) {
            return;
        }
        if (this.mOnInfoListeners != null) {
            for (IMediaPlayer.OnInfoListener onInfoListener : this.mOnInfoListeners) {
                onInfoListener.onInfo(this, eventData.arg1, eventData.arg2, eventData.arg3, eventData.obj);
            }
        }
        if (this.mOnInfoListener == null) {
            return;
        }
        this.mOnInfoListener.onInfo(this, eventData.arg1, eventData.arg2, eventData.arg3, eventData.obj);
    }

    @Override // tb.ozq
    public void onFetchFinished(ozs ozsVar) {
        mArtcSoPath.set(ozsVar.b);
        mArtcSoMajorVersion.set(ozsVar.c);
        mArtcSoMinorVersion.set(ozsVar.d);
        mFFMpegSoPath.set(ozsVar.f);
        boolean z = !TextUtils.isEmpty(mArtcSoPath.get());
        TextUtils.isEmpty(mFFMpegSoPath.get());
        if (z) {
            if (b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "disableFetchInfo", "false"))) {
                notifyVideoInfo(811L, 1L, null);
            }
            commitFetchSoEvent(true);
        }
        unregisterFetchCallback();
    }

    public void onNetworkStateUpdate(int i, double d) {
        if (!this.mEnableNetworkQuality) {
            return;
        }
        this.mNetworkQualityStateNodes.add(Integer.valueOf(i));
        int i2 = this.mCurrNetworkQuality;
        this.mCurrNetworkQuality = i;
        if (i2 == 1 && this.mCurrNetworkQuality != 1 && this.mLastPoorNetStartTs > 0) {
            this.mPoorNetworkTime += System.currentTimeMillis() - this.mLastPoorNetStartTs;
            this.mLastPoorNetStartTs = -1L;
        }
        if (i2 != 1 && this.mCurrNetworkQuality == 1) {
            this.mLastPoorNetStartTs = System.currentTimeMillis();
        }
        if (this.mConfig == null || this.mConfig.b != 0) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("ANetWorkLevel", String.valueOf(i));
            hashMap.put("ANetWorkBWCurrent", String.valueOf((float) com.taobao.taobaoavsdk.util.f.d()));
            hashMap.put("ANetworkBWPredict", String.valueOf(d));
            String jSONString = JSON.toJSONString(hashMap);
            _updateNetWorkInfo(jSONString);
            AVSDKLog.e("AVSDK", "taobaomediaplayer: onNetworkStateUpdate: networkJson=" + jSONString);
        } catch (Exception unused) {
            AVSDKLog.e("AVSDK", "onNetworkStateUpdate to native rtc failed.");
        }
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    protected void onRenderingHung() {
        super.onRenderingHung();
        _onRenderingHung();
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    protected void onRenderingResumed() {
        super.onRenderingResumed();
        _onRenderingResumed();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        AVSDKLog.e("AVSDK", this + " pause index=" + this.mPlayerIndex);
        monitorPause();
        _pause();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        com.taobao.taobaoavsdk.Tracer.b.a(this.mAnalysis, "PREPARE");
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mVideoSarNum = 0;
        this.mVideoSarDen = 0;
        this.mDuration = 0L;
        monitorPrepare();
        _prepareAsync();
    }

    public void refreshScreen() {
        _refreshScreen();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
        com.taobao.taobaoavsdk.Tracer.b.a(this.mAnalysis, InstantPatchChangeInfo.TYPE_RELEASE);
        this.mDebugStatus = "Release";
        AVSDKLog.e("AVSDK", this + " release index=" + this.mPlayerIndex);
        stopAdaptiveLiveController();
        monitorPlayExperience();
        _uploadRecvBytes();
        monitorRelease();
        if (!this.mSyncNotifyHttpDns) {
            notifyHttpDnsAdapterConnectionEvent();
        }
        synchronized (TaobaoMediaPlayer.class) {
            if (this.mEventHandler != null) {
                this.mEventHandler.removeCallbacksAndMessages(null);
                this.mEventHandler = null;
            }
            this.mVideoWidth = 0;
            this.mVideoHeight = 0;
            this.mDuration = 0L;
            this.mIsFloatWindow = false;
            this.mSwitchScene = null;
            this.mSwitchSceneTime = 0L;
            this.mLivePushControlInfo = null;
            if (this.mConfigClone != null && this.mConfigClone.b != 0) {
                this.mDynamicPlayExMap = null;
            }
            this.mSwitchSceneTime = 0L;
            this.mSwitchScene = null;
            this.mSeamlessSwitchStatusAll = null;
        }
        _release();
        unregisterFetchCallback();
        com.taobao.taobaoavsdk.Tracer.b.c(this.mAnalysis, InstantPatchChangeInfo.TYPE_RELEASE);
        if (this.mConfig != null) {
            com.taobao.taobaoavsdk.Tracer.b.a(this.mAnalysis, this.mConfig.b);
        }
    }

    public void releaseAlphaBitmap() {
        AVSDKLog.e("AVSDK", this + ", releaseAlphaBitmap");
        _releaseAlphaBitmap();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void releasePrefixInUIThread() {
        if (this.mSyncNotifyHttpDns) {
            notifyHttpDnsAdapterConnectionEvent();
        }
        if (this.mEnableCallPreRelease) {
            _preRelease();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
        monitorPlayExperience();
        monitorReset();
        if (this.mConfig != null) {
            com.taobao.taobaoavsdk.Tracer.b.a(this.mAnalysis, this.mConfig.b);
        }
        synchronized (TaobaoMediaPlayer.class) {
            if (this.mEventHandler != null) {
                this.mEventHandler.removeCallbacksAndMessages(null);
            }
        }
        _release();
    }

    public void seamlessSwitchStream(Surface surface) {
        if (this.mEnableRtcSwitch) {
            this.mArtcSwitchCount++;
        }
        this.mSeamlessSwitchStartTime = System.currentTimeMillis();
        this.mSeamlessSwitchStatus = 0;
        this.mSeamlessSwitchIndex++;
        AVSDKLog.e("AVSDK", "SeamlessSwitch change Stream " + surface);
        _switchStream(surface);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j) throws IllegalStateException {
        if (this.mVolume != 0.0f && this.bInstantSeeked) {
            this.mMuteAudio = false;
            _setPropertyLong(21008, 0L);
        }
        this.bInstantSeeked = false;
        monitorSeek();
        _seekTo(j);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j, boolean z, boolean z2) throws IllegalStateException {
        long j2 = 0;
        if (this.mVolume != 0.0f && this.bInstantSeeked) {
            _setPropertyLong(21008, 0L);
        }
        if (this.mEnableSeekInPause) {
            if (z2) {
                j2 = 1;
            }
            _setPropertyLong(80006, j2);
        }
        this.bInstantSeeked = false;
        monitorSeek();
        _seekToPause(j, z);
    }

    public void setAlphaBitmap(Bitmap bitmap) {
        AVSDKLog.e("AVSDK", this + ", setAlphaBitmap " + bitmap);
        _setAlphaBitmap(bitmap);
    }

    public void setBluetoothStatus(boolean z) {
        AVSDKLog.e("AVSDK", this + ", setBluetoothStatus " + z);
        if (!z) {
            _setPropertyLong(FFP_PROP_INT64_BLUETOOTH_CONNECT, 0L);
            return;
        }
        _setBluetoothConnectStatus(1);
        _setPropertyLong(FFP_PROP_INT64_BLUETOOTH_CONNECT, 1L);
        this.mHasEverEnableBluetooth = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0afe  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b2a  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:366:? A[RETURN, SYNTHETIC] */
    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int setConfig(com.taobao.taobaoavsdk.widget.media.c r19) {
        /*
            Method dump skipped, instructions count: 2935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.setConfig(com.taobao.taobaoavsdk.widget.media.c):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (r7 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDataSource(java.lang.String r17) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.setDataSource(java.lang.String):void");
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        Surface surface;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
            setHasSurface(surface);
        } else {
            surface = null;
        }
        AVSDKLog.e("AVSDK", this + " setDisplay surface=" + surface + ", mSurface=" + this.mSurface);
        AVSDKLog.e("AVSDK", this + " setDisplay surface=" + surface + ", mSurface=" + this.mSurface);
        if ((this.mSurface == null && surface == null) || this.mSurface == surface) {
            return;
        }
        recordFirstSetSurfaceTime(surface);
        this.mSurface = surface;
        if (this.mSurface != null) {
            _setVideoSurface(surface);
            return;
        }
        if (!this.mEnableStatRenderStallInNonSurface) {
            this.mLastRenderVideoEveryFrame = 0L;
            this.mLastMonitorRenderSystemTime = 0L;
        }
        _releaseSurface();
    }

    public void setEnableRtcSwitch(boolean z) {
        this.mEnableRtcSwitch = z;
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public void setFov(float f, float f2, float f3) {
        if (this.mPanoType > 0) {
            _setPropertyLong(FFP_PROP_FLOAT_PANO_FOV_PARAM_CHANGE, 1L);
            _setPropertyFloat(FFP_PROP_FLOAT_PANO_FOV, f);
            float max = Math.max(Math.min(f2, 90.0f - this.mPanoMaxPolarToleranceDegrees), this.mPanoMaxPolarToleranceDegrees - 90.0f);
            float f4 = f3 % 360.0f;
            if (f4 > 180.0f) {
                f4 -= 360.0f;
            }
            if (f4 < -180.0f) {
                f4 += 360.0f;
            }
            _setPropertyFloat(FFP_PROP_FLOAT_PANO_LATITUDE, max);
            _setPropertyFloat(FFP_PROP_FLOAT_PANO_LONGITUDE, f4);
        }
    }

    public void setHttpRequestHeader(HashMap<String, String> hashMap) {
        if (!hashMap.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":");
                if (!TextUtils.isEmpty(entry.getValue())) {
                    sb.append(entry.getValue());
                }
                sb.append("\r\n");
                _setOption(1, "headers", sb.toString());
                sb.setLength(0);
            }
        }
    }

    public void setLiveDefinitionAutoSwitch(boolean z) {
        AVSDKLog.e("AVSDK", "TaobaoMediaPlayer:" + this + " rtcLiveAutoSwitch: " + this.mRtcLiveAutoSwitch + " => " + z);
        this.mRtcLiveAutoSwitch = z;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setMuted(boolean z) {
        if (this.mEnableBroadcastWhenMuteChanged && this.mConfig != null && this.mConfig.b == 2 && this.mLastMuteState != z) {
            onVideoVolumeChangeBroadcast(z, this.mConfig.y);
        }
        this.mMuteStateNodes.add(Integer.valueOf(z ? 1 : 0));
        this.mMuteAudio = z;
        _setPropertyLong(21008, z ? 1L : 0L);
        if (!z) {
            this.mAlwaysMutePlay = false;
        }
        this.mLastMuteState = z;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setPlayRate(float f) {
        this.mPlayRate = f;
        _setPropertyFloat(10003, f);
    }

    public void setPlayingLiveDefinition(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.mPlayingLiveDefinition) || this.mPlayingLiveDefinition.equals(str)) {
            this.mPlayingLiveDefinition = str;
            return;
        }
        computePlayTimeForRtcSwitch();
        this.mLastPlayTime = System.currentTimeMillis();
        if (this.mIsBackground) {
            this.mLastPlayTimeInBackground = this.mLastPlayTime;
        }
        this.mPlayingLiveDefinition = str;
    }

    public void setRequestHeader(Map<String, String> map) {
        if (MediaAdapteManager.mConfigAdapter == null) {
            return;
        }
        boolean a2 = b.a(MediaAdapteManager.mConfigAdapter.getConfig("", ORANGE_ENABLE_SET_CUS_HTTP_HEADER, "true"));
        if (map == null || !a2) {
            return;
        }
        this.mRequestHeader = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.mRequestHeader.put(entry.getKey(), entry.getValue());
        }
    }

    public void setReuseFlag(boolean z) {
        this.mReuseFlag = z;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
    }

    public void setSeamlessSwitchOption(int i, boolean z, boolean z2) {
        OrangeConfig orangeConfig;
        String str;
        String str2;
        if (z2) {
            orangeConfig = OrangeConfig.getInstance();
            str = ORANGE_SWITCH_STREAM_LOWER_TIMEOUT;
            str2 = "15000";
        } else {
            orangeConfig = OrangeConfig.getInstance();
            str = ORANGE_SWITCH_STREAM_HIGHER_TIMEOUT;
            str2 = IDecisionResult.ENGINE_ERROR;
        }
        _setPropertyLong(FFP_PROP_INT64_SWITCH_STREAM_TIMEOUT, b.b(orangeConfig.getConfig("DWInteractive", str, str2)));
        _setPropertyLong(FFP_PROP_INT64_SWITCH_STREAM_FORCEDLY, z ? 1L : 0L);
        _setPropertyLong(FFP_PROP_INT64_SOURCER_VIDEO_PIPE_START_COUNT, 8L);
        _setSeamlessSwitchMode(1);
    }

    public void setSeamlessSwitchOption(boolean z, int i, boolean z2) {
        _setPropertyLong(FFP_PROP_INT64_SWITCH_STREAM_TIMEOUT, i);
        _setPropertyLong(FFP_PROP_INT64_SWITCH_STREAM_FORCEDLY, z ? 1L : 0L);
        _setPropertyLong(FFP_PROP_INT64_SOURCER_VIDEO_PIPE_START_COUNT, 8L);
        _setSeamlessSwitchMode(1);
    }

    public void setSeamlessSwitchUrl(String str) {
        AVSDKLog.e("AVSDK", "SeamlessSwitch setSeamlessSwitchUrl " + str);
        setGrtnRtcConfig(str);
        this.mSeamlessSwitchPath = str;
        _setSeamlessSwitchUrl(str);
    }

    public void setSeamlessSwitchUrl(String str, String str2) {
        this.mSeamlessSwitchSelectName = str2;
        setSeamlessSwitchUrl(str);
    }

    public void setShowViewParant(ViewGroup viewGroup) {
        if (!showFrameInfo()) {
            return;
        }
        long j = this.mTextureVideoViewNativeToken;
        if (j == 0) {
            AVSDKLog.e("AVSDK", this + " setShowViewParant add");
            this.mViewGroup = viewGroup;
            this.mTextureVideoViewNativeToken = generateTextVideoViewToken(this);
            _setPropertyLong(FFP_PROP_INT64_EXTEND_DRAW_FRAME_INFO_PTR, this.mTextureVideoViewNativeToken);
            addFrameInfoView();
        } else if (j == 0 || viewGroup != null) {
        } else {
            AVSDKLog.e("AVSDK", this + " setShowViewParant remove");
            removeTextureVideoViewByToken(this.mTextureVideoViewNativeToken);
            this.mTextureVideoViewNativeToken = 0L;
            _setPropertyLong(FFP_PROP_INT64_EXTEND_DRAW_FRAME_INFO_PTR, 0L);
            this.mFrameInfoSurfaceView = null;
            this.mFrameInfoTextureView = null;
            this.mFrameInfoBaseView = null;
            this.mViewGroup = null;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
        AVSDKLog.e("AVSDK", this + " setSurface surface=" + surface + ", mSurface=" + this.mSurface);
        AVSDKLog.e("AVSDK", this + " setSurface surface=" + surface + ", mSurface=" + this.mSurface);
        if ((this.mSurface == null && surface == null) || this.mSurface == surface) {
            return;
        }
        recordFirstSetSurfaceTime(surface);
        setHasSurface(surface);
        this.mSurface = surface;
        AVSDKLog.e("AVSDK", this + ", setSurface surface=" + surface);
        AVSDKLog.e("AVSDK", this + ", setSurface surface=" + surface);
        if (this.mSurface != null) {
            if (!this.mEnableStatRenderStallInNonSurface) {
                onRenderingResumed();
                if (this.mEnableRenderStallCalNew) {
                    onRenderingResumedV2();
                }
                checkStatRenderStallFlag();
            }
            _setVideoSurface(surface);
            return;
        }
        if (!this.mEnableStatRenderStallInNonSurface) {
            this.mLastRenderVideoEveryFrame = 0L;
            this.mLastMonitorRenderSystemTime = 0L;
            checkStatRenderStallFlag();
            onRenderingHung();
            if (this.mEnableRenderStallCalNew) {
                onRenderingHungV2();
            }
        }
        _releaseSurface();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurfaceSize(int i, int i2) {
        AVSDKLog.e("AVSDK", this + ", setSurfaceSize width=" + i + ", height=" + i2);
        AVSDKLog.e("AVSDK", this + ", setSurfaceSize width=" + i + ", height=" + i2);
        _setVideoSurfaceSize(i, i2);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
        this.mLastVolume = this.mVolume;
        this.mVolume = f;
        if (this.mEnableBroadcastWhenMuteChanged && this.mConfig != null && this.mConfig.b == 2 && ((this.mLastVolume > 0.0f && this.mVolume == 0.0f) || (this.mLastVolume == 0.0f && this.mVolume > 0.0f))) {
            onVideoVolumeChangeBroadcast(this.mVolume == 0.0f, this.mConfig.y);
        }
        this.mVolumeStateNodes.add(Float.valueOf(this.mVolume));
        _setPropertyFloat(12001, f);
        if (f == 0.0f && f2 == 0.0f) {
            this.mMuteAudio = true;
            _setPropertyLong(21008, 1L);
            return;
        }
        this.mMuteAudio = false;
        _setPropertyLong(21008, 0L);
        this.mAlwaysMutePlay = false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        AVSDKLog.e("AVSDK", this + " start index=" + this.mPlayerIndex);
        monitorStart();
        if (this.mFixStartOnPrepared) {
            _setPropertyLong(11007, 1L);
        }
        _start();
        postRenderingStartMesageInReuseState();
    }

    public void startRtcAdaption(String str) {
        AVSDKLog.e("AVSDK", "TaobaoMediaPlayer:" + this + " startRtcAdaption " + str);
        if (!TextUtils.isEmpty(str)) {
            _startRtcAdaption(str);
            return;
        }
        AVSDKLog.e("AVSDK", "TaobaoMediaPlayer:" + this + " startRtcAdaption empty param");
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        AVSDKLog.e("AVSDK", this + " stop");
        _pause();
        if (this.mApmEventListener != null) {
            com.taobao.application.common.c.b(this.mApmEventListener);
            this.mApmEventListener = null;
        }
        unregisterBluetoothReceiver();
        if (this.mEnableNetworkQuality) {
            unregisterNetworkStateReceiver();
        }
    }

    public void stopRtcAdaption() {
        AVSDKLog.e("AVSDK", "TaobaoMediaPlayer:" + this + " stopRtcAdaption ");
        _stopRtcAdaption();
    }

    public void stopSwitch() {
        AVSDKLog.e("AVSDK", this + ", stopSwitch");
        _stopSeamlessSwitch();
    }

    public void switchToNewDefinition(int i, String str) {
        if (this.mEnableRtcSwitch) {
            this.mArtcSwitchCount++;
            if ("ud".equals(str) || MediaConstant.DEFINITION_UD_60.equals(str)) {
                this.mArtcSwitchUpCount++;
                if (i == 2) {
                    this.mArtcAbrSwitchUpCount++;
                }
            } else {
                this.mArtcSwitchDownCount++;
                if (this.mFirstSwitchDownReason == -1) {
                    this.mFirstSwitchDownReason = i;
                }
                if (i == 2) {
                    this.mArtcAbrSwitchDownCount++;
                }
            }
        }
        this.mSwitchTargetLiveDefinition = str;
        this.mSeamlessSwitchStartTime = System.currentTimeMillis();
        this.mSeamlessSwitchStatus = 0;
        this.mSeamlessSwitchIndex++;
        AVSDKLog.e("AVSDK", "switchToNewDefinition:" + this + " definition: " + str);
        _switchStream(null);
    }

    public synchronized void unregisterBluetoothReceiver() {
        if ((this.mContextRef == null ? null : this.mContextRef.get()) == null || mReceiveInstance == null) {
            AVSDKLog.e("AVSDK", this + " unregisterBluetoothReceiver fail index=" + this.mPlayerIndex);
            return;
        }
        mReceiveInstance.b(this);
        AVSDKLog.e("AVSDK", this + " unregisterBluetoothReceiver suc index=" + this.mPlayerIndex);
    }

    public void updateAbrRedundantRequestSwitchCount(boolean z) {
        if (!this.mEnableRtcSwitch) {
            return;
        }
        AVSDKLog.e("AVSDK", "updateAbrRedundantRequestSwitchCount:" + this + " upSwitch: " + z);
        if (z) {
            this.mArtcAbrRedundantRequestSwitchUpCount++;
        } else {
            this.mArtcAbrRedundantRequestSwitchDownCount++;
        }
    }

    public void updateAbrRequestSwitchCount(boolean z, boolean z2) {
        if (!this.mEnableRtcSwitch) {
            return;
        }
        if (z2) {
            if (z) {
                this.mArtcAbrRequestSwitchUpCount++;
            } else {
                this.mArtcAbrRequestSwitchDownCount++;
            }
        }
        if (z) {
            this.mArtcAbrTotalRequestSwitchUpCount++;
        } else {
            this.mArtcAbrTotalRequestSwitchDownCount++;
        }
    }

    public void updateAlphaBitmap(Bitmap bitmap) {
        AVSDKLog.e("AVSDK", this + ", updateAlphaBitmap " + bitmap);
        _updateAlphaBitmap(bitmap);
    }

    public void updateLastStreamSelectReason(int i) {
        if (this.mStreamSelectReasonList.size() >= 2) {
            this.mStreamSelectReasonList.removeFirst();
        }
        this.mStreamSelectReasonList.add(Integer.valueOf(i));
    }

    public void updateMuteNodes(boolean z) {
        List<Integer> list;
        int i;
        if (z) {
            list = this.mMuteStateNodes;
            i = 1;
        } else {
            list = this.mMuteStateNodes;
            i = 0;
        }
        list.add(Integer.valueOf(i));
    }

    public void updateSeamlessSwitchStatus(int i, String str) {
        String str2 = "" + i + riy.BRACKET_START_STR + str + riy.BRACKET_END_STR;
        if (TextUtils.isEmpty(this.mSeamlessSwitchStatusAll)) {
            this.mSeamlessSwitchStatusAll = str2;
            return;
        }
        this.mSeamlessSwitchStatusAll += "_" + str2;
    }

    public void useAdaptiveLiveDeciseResult() {
        AdaptiveLiveController adaptiveLiveController = this.mAdapitveLiveController;
        if (adaptiveLiveController != null) {
            adaptiveLiveController.useDeciseResult();
        }
    }
}
