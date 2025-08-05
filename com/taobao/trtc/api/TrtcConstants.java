package com.taobao.trtc.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public interface TrtcConstants {
    public static final int DEFAULT_CALL_TIMEOUT = 60;
    public static final int DEFAULT_VIDEO_FPS = 20;
    public static final int DEFAULT_VIDEO_HEIGHT = 1280;
    public static final int DEFAULT_VIDEO_WIDTH = 720;
    public static final int TRTC_ERROR_CODE_ABTEST_START_FAIL = 6000;
    public static final int TRTC_ERROR_CODE_AUDIO_DEVICE_ERROR = 2300;
    public static final int TRTC_ERROR_CODE_CALLEE_NOT_SUPPORT_CALL = 4111;
    public static final int TRTC_ERROR_CODE_CALLEE_SDK_VERSION_IS_LOW = 4104;
    public static final int TRTC_ERROR_CODE_CALLER_NOT_SUPPORT_CALL = 4110;
    public static final int TRTC_ERROR_CODE_CALLER_SDK_VERSION_IS_LOW = 4103;
    public static final int TRTC_ERROR_CODE_CAN_NOT_CALL_SELF = 4101;
    public static final int TRTC_ERROR_CODE_ENGINE_INACTIVE = 2005;
    public static final int TRTC_ERROR_CODE_GETCONFIG_TIMEOUT = 2001;
    public static final int TRTC_ERROR_CODE_INIT_ERROR = 2000;
    public static final int TRTC_ERROR_CODE_JOINCHANNEL_ERROR = 4001;
    public static final int TRTC_ERROR_CODE_JOINCHANNEL_TIMEOUT = 2100;
    public static final int TRTC_ERROR_CODE_MEDIA_CONNECTION_LOST = 2200;
    public static final int TRTC_ERROR_CODE_PARAMS_ERROR = 2002;
    public static final int TRTC_ERROR_CODE_SIGNALING_CHANNEL_ERROR = 2101;
    public static final int TRTC_ERROR_CODE_SIGNALING_TIMEOUT = 2004;
    public static final int TRTC_ERROR_CODE_START_FAIL_WITH_RTMP = 6002;
    public static final int TRTC_ERROR_CODE_STATUS_ERROR = 2003;
    public static final int TRTC_ERROR_CODE_SUCCESS = 0;
    public static final int TRTC_ERROR_CODE_USER_HAS_JOINED = 4128;
    public static final int TRTC_ERROR_CODE_USER_IS_OFFLINE = 4102;
    public static final int TRTC_ERROR_CODE_VIDEO_DEVICE_ERROR = 2301;
    public static final int TRTC_EVENT_ANSWER_RSP = 503;
    public static final int TRTC_EVENT_AUDIO_BLUETOOTH_CONNECTED = 403;
    public static final int TRTC_EVENT_AUDIO_BLUETOOTH_DISCONNECTED = 404;
    public static final int TRTC_EVENT_AUDIO_FOCUS_CHANGED = 406;
    public static final int TRTC_EVENT_AUDIO_RECORD_INIT_ERROR = 400;
    public static final int TRTC_EVENT_AUDIO_RECORD_READ_ERROR = 402;
    public static final int TRTC_EVENT_AUDIO_RECORD_START_ERROR = 401;
    public static final int TRTC_EVENT_AUDIO_ROUTE_CHANGED = 405;
    public static final int TRTC_EVENT_CALL_TIMEOUT = 505;
    public static final int TRTC_EVENT_CAMERA_CLOSED = 305;
    public static final int TRTC_EVENT_CAMERA_DISCONNECT = 301;
    public static final int TRTC_EVENT_CAMERA_FIRST_FRAME = 304;
    public static final int TRTC_EVENT_CAMERA_FREEZE = 302;
    public static final int TRTC_EVENT_CAMERA_OPENING = 303;
    public static final int TRTC_EVENT_CAMERA_OPEN_ERROR = 300;
    public static final int TRTC_EVENT_CAMERA_SWITCH_DONE = 306;
    public static final int TRTC_EVENT_CAMERA_SWITCH_ERROR = 307;
    public static final int TRTC_EVENT_ENGINE_INITIALIZE = 100;
    public static final int TRTC_EVENT_ERROR = 104;
    public static final int TRTC_EVENT_FIRST_REMOTE_AUDIO_FRAME = 107;
    public static final int TRTC_EVENT_FIRST_REMOTE_VIDEO_FRAME = 106;
    public static final int TRTC_EVENT_JOIN_CHANNEL_RSP = 600;
    public static final int TRTC_EVENT_LINK_LIVE_NEED_MIX = 201;
    public static final int TRTC_EVENT_LOCAL_STREAM_UPDATED = 108;
    public static final int TRTC_EVENT_MAKE_CALL_RSP = 500;
    public static final int TRTC_EVENT_MEDIA_CONNECTION_CHANGE = 103;
    public static final int TRTC_EVENT_NETWORK_QUALITY = 101;
    public static final int TRTC_EVENT_NETWORK_STATS = 102;
    public static final int TRTC_EVENT_NEW_CALL = 501;
    public static final int TRTC_EVENT_PHONE_STATE = 105;
    public static final int TRTC_EVENT_PHONE_STATE_IDLE = 110;
    public static final int TRTC_EVENT_PHONE_STATE_OFFHOOK = 113;
    public static final int TRTC_EVENT_PHONE_STATE_RINGING = 112;
    public static final int TRTC_EVENT_REMOTE_ANSWER = 502;
    public static final int TRTC_EVENT_REMOTE_CANCEL = 506;
    public static final int TRTC_EVENT_REMOTE_HANGUP = 504;
    public static final int TRTC_EVENT_REMOTE_JOINED_CHANNEL = 601;
    public static final int TRTC_EVENT_REMOTE_LEFT_CHANNEL = 602;
    public static final int TRTC_EVENT_REMOTE_NOTIFY_CHANNEL = 603;
    public static final int TRTC_EVENT_REMOTE_STREAM_UPDATED = 109;
    public static final int TRTC_EVENT_START_LIVE_SUCCESS = 200;
    public static final String TRTC_PARAMS_ACTION = "action";
    public static final String TRTC_PARAMS_ANSWER_TYPE = "answerType";
    public static final String TRTC_PARAMS_AUDIO_ENABLE = "audioEnable";
    public static final String TRTC_PARAMS_AUDIO_FOCUS = "audioFocus";
    public static final String TRTC_PARAMS_AUDIO_ROUTE = "audioRoute";
    public static final String TRTC_PARAMS_AUDIO_TRANS = "audioTransProfile";
    public static final String TRTC_PARAMS_AVAILABLE_BANDWIDTH = "availableBandwidth";
    public static final String TRTC_PARAMS_CAMERA_IS_FRONT = "cameraIsFront";
    public static final String TRTC_PARAMS_CAMERA_NAME = "cameraName";
    public static final String TRTC_PARAMS_CHANNEL_ID = "channelId";
    public static final String TRTC_PARAMS_DATA_ENABLE = "dataEnable";
    public static final String TRTC_PARAMS_ELAPSED = "elapsed";
    public static final String TRTC_PARAMS_ERROR_CODE = "errorCode";
    public static final String TRTC_PARAMS_ERROR_EVENT = "errorEvent";
    public static final String TRTC_PARAMS_ERROR_MSG = "errorMsg";
    public static final String TRTC_PARAMS_EXTENSION = "extension";
    public static final String TRTC_PARAMS_HEIGHT = "height";
    public static final String TRTC_PARAMS_MEDIA_CONNECTION_STATE = "state";
    public static final String TRTC_PARAMS_NEED_MIX = "needMix";
    public static final String TRTC_PARAMS_PEER_LIST = "peerList";
    public static final String TRTC_PARAMS_PHONE_NUMBER = "phoneNumber";
    public static final String TRTC_PARAMS_PHONE_STATE = "phoneState";
    public static final String TRTC_PARAMS_QUALITY = "quality";
    public static final String TRTC_PARAMS_ROLE = "role";
    public static final String TRTC_PARAMS_STREAM_ID = "streamId";
    public static final String TRTC_PARAMS_SUCCESS = "success";
    public static final String TRTC_PARAMS_TOTAL_RX_BYTES = "totalRxBytes";
    public static final String TRTC_PARAMS_TOTAL_RX_KBPS = "totalRxKbps";
    public static final String TRTC_PARAMS_TOTAL_TX_BYTES = "totalTxBytes";
    public static final String TRTC_PARAMS_TOTAL_TX_KBPS = "totalTxKbps";
    public static final String TRTC_PARAMS_USER_ID = "userId";
    public static final String TRTC_PARAMS_VIDEO_ENABLE = "videoEnable";
    public static final String TRTC_PARAMS_VIDEO_TRANS = "videoTransProfile";
    public static final String TRTC_PARAMS_WIDTH = "width";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface TrtcEventType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface TrtcPhoneStat {
    }
}
