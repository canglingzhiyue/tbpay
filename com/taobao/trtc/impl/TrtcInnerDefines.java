package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public interface TrtcInnerDefines {

    /* loaded from: classes9.dex */
    public enum CallState {
        E_CALL_IDLE,
        E_CALL_ING,
        E_CALL_SETUP,
        E_CALL_ERROR
    }

    /* loaded from: classes9.dex */
    public enum ChannelNotifyAction {
        E_INVITE,
        E_CANCEL_INVITE,
        E_AGREE,
        E_DISAGREE
    }

    /* loaded from: classes9.dex */
    public enum EventType {
        ON_TRTC_LIVE_SUCCESS,
        ON_TRTC_MEDIA_CONNECTION_STATE,
        ON_TRTC_CALL_NOTIFY,
        ON_TRTC_CALL_RSP,
        ON_TRTC_ANSWER_NOTIFY,
        ON_TRTC_ANSWER_RSP,
        ON_TRTC_CANCEL_CALL_NOTIFY,
        ON_TRTC_HANGUP_NOTIFY,
        ON_TRTC_JOIN_CHANNEL_RSP,
        ON_TRTC_PEER_JOINED_CHANNEL,
        ON_TRTC_PEER_LEFT_CHANNEL,
        ON_TRTC_NOTIFY_CHANNEL_RSP,
        ON_TRTC_NOTIFY_CHANNEL,
        ON_TRTC_CALL_TIMEOUT,
        ON_TRTC_LINK_CONFIG_UPDATE,
        ON_TRTC_FIRST_MEDIA_FRAME,
        ON_TRTC_STATISTICS_UT,
        ON_TRTC_STATS,
        ON_TRTC_ERROR,
        ON_TRTC_STREAM_PROCESS_RESULT,
        ON_TRTC_CUSTOM_MESSAGE,
        ON_TRTC_STREAM_UPDATED,
        ON_TRTC_WRITE_LOCAL_CONFIG,
        ON_TRTC_UPDATE_HTTPDNS_AMDC,
        ON_TRTC_CANCEL_GET_HTTPDNS,
        ON_TRTC_CHANNEL_CLOSED,
        ON_TRTC_SPEECH_DETECT,
        ON_TRTC_BANDWIDTH_NOT_ENOUGH,
        ON_TRTC_MUTE_REMOTE_AUDIO_STREAMS,
        ON_TRTC_LOCAL_STREAM_STATUS_UPDATE,
        ON_TRTC_DEGRADE_TO_TCP,
        ON_TRTC_LIVE_CHANNEL_ID_SUCCESS,
        ON_TRTC_VIDEO_RESOLUTION_UPDATE,
        ON_TRTC_CHANNEL_MSG_BROADCAST_RSP,
        ON_TRTC_CHANNEL_MSG_BROADCAST_NOTIFY
    }

    /* loaded from: classes9.dex */
    public enum LiveState {
        E_LIVE_STATE_NON,
        E_LIVE_STATE_STARTING,
        E_LIVE_STATE_STARTED,
        E_LIVE_STATE_STOPPING,
        E_LIVE_STATE_STOPPED
    }

    /* loaded from: classes9.dex */
    public static class RemoteMediaConfig {
        public String audioMsid;
        public String dataMsid;
        public String url;
        public boolean videoFec;
        public String videoMsid;

        static {
            kge.a(24136971);
        }
    }

    /* loaded from: classes9.dex */
    public static class StartLiveParams {
        public String bizId;
        public Map<String, String> customInfo;
        public String extInfo;
        public String liveUrl;
        public LocalMediaConfig mediaConfig;

        static {
            kge.a(-1043692737);
        }

        public StartLiveParams(TrtcDefines.h hVar) {
            this.mediaConfig = TrtcEngineImpl.a(hVar.e);
            this.mediaConfig.audioEnable = hVar.f;
            this.mediaConfig.videoEnable = hVar.g;
            this.mediaConfig.dataEnable = hVar.h;
            String str = "";
            this.liveUrl = hVar.f23040a == null ? str : hVar.f23040a;
            this.bizId = hVar.b == null ? str : hVar.b;
            this.extInfo = hVar.c != null ? hVar.c : str;
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcAnswerCallParams {
        public int answerType;
        public String extension;
        public ITrtcInputStream inputStream;
        public LocalMediaConfig mediaConfig;
        public String remoteUserId;
        public int audioTransProfile = TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_SEND_RECV.ordinal();
        public int videoTransProfile = TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_SEND_RECV.ordinal();
        public boolean isMultiChatMode = false;
        public String subType = "";

        static {
            kge.a(85047972);
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcCallUserInfo {
        public Map<String, String> customInfo;
        public String deviceId;
        public String extension;
        public int role;
        public String userId;

        static {
            kge.a(55266137);
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcCancelCallParams {
        public ArrayList<TrtcCallUserInfo> userInfos;

        static {
            kge.a(-1356632480);
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcHangUpCallParams {
        public ArrayList<TrtcCallUserInfo> userInfos;
        public boolean isMultiChatMode = false;
        public String subType = "";
        public String extension = "";

        static {
            kge.a(-1451142445);
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcJoinChannelParams {
        public int channelDestroyType;
        public String channelId;
        public int channelRoleType;
        public boolean enableLive;
        public String extInfo;
        public boolean isMutliChatMode;
        public LocalMediaConfig mediaConfig;
        public String subType;

        static {
            kge.a(-1104731939);
        }

        public TrtcJoinChannelParams(TrtcDefines.g gVar) {
            this.isMutliChatMode = false;
            this.subType = "";
            this.mediaConfig = TrtcEngineImpl.a(gVar.c);
            this.mediaConfig.audioEnable = gVar.d;
            this.mediaConfig.videoEnable = gVar.e;
            this.mediaConfig.dataEnable = gVar.f;
            this.channelId = gVar.f23039a;
            this.extInfo = gVar.b;
            this.enableLive = gVar.g;
            this.isMutliChatMode = gVar.h;
            this.subType = gVar.i;
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcLocalVideoFreezeInfo {
        public boolean freeze;
        public int sendVideoType;

        static {
            kge.a(121330071);
        }

        public TrtcLocalVideoFreezeInfo(boolean z, int i) {
            this.freeze = z;
            this.sendVideoType = i;
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcMakeCallParams {
        public ITrtcInputStream inputStream;
        public LocalMediaConfig mediaConfig;
        public ArrayList<TrtcCallUserInfo> userInfos;
        public int callTimeout = 60;
        public int audioTransProfile = TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_SEND_RECV.ordinal();
        public int videoTransProfile = TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_SEND_RECV.ordinal();
        public boolean isMultiChatMode = false;
        public String subType = "";
        public String extension = "";
        public int maxChatUserNumber = 0;

        static {
            kge.a(560352596);
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcRemoteVideoFreezeInfo {
        public boolean freeze;
        public String remoteUserId;

        static {
            kge.a(1500546072);
        }

        public TrtcRemoteVideoFreezeInfo(String str, boolean z) {
            this.remoteUserId = str;
            this.freeze = z;
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcRemoteVideoFreezeParams {
        public ArrayList<TrtcRemoteVideoFreezeInfo> userInfos;

        static {
            kge.a(-895490448);
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcStreamProcessParams {
        public String extension;
        public LocalMediaConfig mediaConfig;
        public String processInfo;
        public RemoteMediaConfig remoteMediaConfig;
        public String streamId;
        public String subSfuIp;
        public int subSfuPort;

        static {
            kge.a(1410933555);
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcUpdateStreamParams {
        public String extInfo = "";
        public LocalMediaConfig mediaConfig;
        public String streamId;

        static {
            kge.a(-1914657071);
        }

        public TrtcUpdateStreamParams(String str, ITrtcInputStream iTrtcInputStream) {
            this.mediaConfig = TrtcEngineImpl.a(iTrtcInputStream);
            this.streamId = str;
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcVideoLayoutBackground {
        public int bB;
        public int bG;
        public int bHeight;
        public int bImageType;
        public int bR;
        public int bWidth;
        public int bType = 0;
        public String bImageUrl = "";

        static {
            kge.a(-387507951);
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcVideoLayoutParams {
        public TrtcVideoLayoutBackground backgroundInfo;
        public String extension = "";
        public ArrayList<TrtcVideoLayoutRect> rects;
        public int subHeight;
        public int subWidth;

        static {
            kge.a(-362469655);
        }
    }

    /* loaded from: classes9.dex */
    public static class TrtcVideoLayoutRect {
        public int height;
        public String userId;
        public int width;
        public int xPos;
        public int yPos;
        public int zPos;

        static {
            kge.a(-1135508473);
        }
    }

    /* loaded from: classes9.dex */
    public static class LocalMediaConfig {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean audioEnable = true;
        public boolean videoEnable = true;
        public boolean dataEnable = false;
        public int videoMaxWidth = 720;
        public int videoMaxHeight = 1280;
        public int videoMaxFps = 20;
        public boolean audioMusicEnable = false;
        public int audioDenoiseDegree = 0;
        public int audioBitrate = 0;

        static {
            kge.a(-2128436848);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "localMediaConfig: { a=" + this.audioEnable + ", v=" + this.videoEnable + ", d=" + this.dataEnable + " }";
        }
    }
}
