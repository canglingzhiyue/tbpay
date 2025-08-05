package com.taobao.trtc.api;

import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public interface TrtcDefines {

    /* loaded from: classes9.dex */
    public enum TrtcAnswerType {
        E_ANSWER_TYPE_NONE,
        E_ANSWER_TYPE_AGREE,
        E_ANSWER_TYPE_REJECT
    }

    /* loaded from: classes9.dex */
    public enum TrtcAudioFocusState {
        E_AUDIO_FOCUS_LOSS,
        E_AUDIO_FOCUS_GAINED
    }

    /* loaded from: classes9.dex */
    public enum TrtcAudioRouteDevice {
        E_AUDIO_ROUTE_NONE,
        E_AUDIO_ROUTE_EARPIECE,
        E_AUDIO_ROUTE_SPEAKER,
        E_AUDIO_ROUTE_WIRED_HEADSET,
        E_AUDIO_ROUTE_BLUETOOTH_HEADSET
    }

    /* loaded from: classes9.dex */
    public enum TrtcBackgroundImageType {
        E_BACKGROUND_FROM_LOCAL,
        E_BACKGROUND_FROM_SERVER
    }

    /* loaded from: classes9.dex */
    public enum TrtcChannelAction {
        E_CHANNEL_NOTIFY_INVITE,
        E_CHANNEL_NOTIFY_CANCELED,
        E_CHANNEL_NOTIFY_AGREE,
        E_CHANNEL_NOTIFY_DIS_AGREE,
        E_CHANNEL_NOTIFY_UNKNOWN
    }

    /* loaded from: classes9.dex */
    public enum TrtcErrorEvent {
        E_ERROR_EVENT_INITIALIZE,
        E_ERROR_EVENT_LIVE,
        E_ERROR_EVENT_MEDIA_CONNECTION,
        E_ERROR_EVENT_NEED_RETRY,
        E_ERROR_EVENT_NEED_STOP,
        E_ERROR_EVENT_MEDIA_DEVICE,
        E_ERROR_EVENT_DNS_FAILD,
        E_ERROR_EVENT_LINK_LIVE,
        E_ERROR_EVENT_LINKLIVE_MEDIA_CONNECTION
    }

    /* loaded from: classes9.dex */
    public enum TrtcFrameType {
        E_FRAME_PRI,
        E_FRAME_SUB,
        E_FRAME_STREAM
    }

    /* loaded from: classes9.dex */
    public enum TrtcMediaConnectionState {
        E_MEDIA_CONNECTION_NOT_USE,
        E_MEDIA_CONNECTION_CONNECTED,
        E_MEDIA_CONNECTION_TIMEOUT,
        E_MEDIA_CONNECTION_DISCONNECTED
    }

    /* loaded from: classes9.dex */
    public enum TrtcMediaTransportProfile {
        E_MEDIA_INACTIVE,
        E_MEDIA_SEND_ONLY,
        E_MEDIA_RECV_ONLY,
        E_MEDIA_SEND_RECV
    }

    /* loaded from: classes9.dex */
    public enum TrtcMixMode {
        MIX_NONE,
        MIX_LOCAL,
        MiX_SERVER
    }

    /* loaded from: classes9.dex */
    public enum TrtcNetWorkQuality {
        E_NETWORK_QUALITY_GOOD,
        E_NETWORK_QUALITY_NORMAL,
        E_NETWORK_QUALITY_BAD
    }

    /* loaded from: classes9.dex */
    public enum TrtcSendVideoType {
        E_SEND_VIDEO_TYPE_SEND_VIDEO,
        E_SEND_VIDEO_TYPE_NO_SEND,
        E_SEND_VIDEO_TYPE_SEND_PIC
    }

    /* loaded from: classes9.dex */
    public enum TrtcUserRole {
        E_ROLE_NONE,
        E_ROLE_ANCHOR,
        E_ROLE_FANS_OR_CALL
    }

    /* loaded from: classes9.dex */
    public enum TrtcVideoLayoutBgType {
        E_VIDEO_LAYOUT_BG_COLOR,
        E_VIDEO_LAYOUT_BG_IMAGE
    }

    /* loaded from: classes9.dex */
    public enum TrtcWorkMode {
        E_TRTC_WORK_MODE_UNKOWN,
        E_TRTC_WORK_MODE_LIVE,
        E_TRTC_WORK_MODE_CHAT,
        E_TRTC_WORK_MODE_MEETING
    }

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23033a;
        public int b;
        public int c;
        public int d;
        public int e;

        static {
            kge.a(407447731);
        }
    }

    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f23034a;
        public TrtcUserRole b;
        public TrtcMediaTransportProfile c;
        public TrtcMediaTransportProfile d;
        public String e;
        public String g;
        public String h = "";
        public boolean f = false;

        static {
            kge.a(670562550);
        }
    }

    /* loaded from: classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f23035a;
        public int b;
        public String c;
        public String d;

        static {
            kge.a(384989781);
        }
    }

    /* loaded from: classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public TrtcChannelAction f23036a;
        public String b;
        public String c;
        public boolean d;
        public boolean e;
        public String f;

        static {
            kge.a(-890268816);
        }
    }

    /* loaded from: classes9.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f23037a;
        public int b;
        public String c;
        public String d;
        public boolean e = false;

        static {
            kge.a(-1609983388);
        }
    }

    /* loaded from: classes9.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f23038a;
        public int b = -1;

        static {
            kge.a(-7366567);
        }
    }

    /* loaded from: classes9.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public String f23039a;
        public String b;
        public ITrtcInputStream c;
        public boolean d = true;
        public boolean e = true;
        public boolean f = false;
        public boolean g = false;
        public String i = "";
        public boolean h = false;

        static {
            kge.a(-246638123);
        }
    }

    /* loaded from: classes9.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public String f23040a;
        public String b;
        public String c;
        public Map<String, String> d;
        public ITrtcInputStream e;
        public boolean f = true;
        public boolean g = true;
        public boolean h = false;

        static {
            kge.a(-363450404);
        }
    }

    /* loaded from: classes9.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public String f23041a;
        public int b;
        public int c;
        public int d;
        public a e;
        public j f;

        static {
            kge.a(892618972);
        }
    }

    /* loaded from: classes9.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public String f23042a;
        public String b;
        public int c;
        public int d;
        public int e;
        public double f;
        public double g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;

        static {
            kge.a(1629874853);
        }
    }

    /* loaded from: classes9.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public long f23043a;
        public long b;
        public int c;
        public int d;
        public int e;

        static {
            kge.a(1637278648);
        }
    }

    /* loaded from: classes9.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public String f23044a;
        public String b;
        public boolean c;
        public boolean d;
        public String e;

        static {
            kge.a(-21314410);
        }
    }

    /* loaded from: classes9.dex */
    public static class m {

        /* renamed from: a  reason: collision with root package name */
        public String f23045a;
        public TrtcUserRole b;
        public String c;

        static {
            kge.a(912444922);
        }
    }

    /* loaded from: classes9.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public String f23046a;
        public int b;
        public a c;
        public o d;

        static {
            kge.a(-1404501301);
        }
    }

    /* loaded from: classes9.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public String f23047a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        static {
            kge.a(-667245420);
        }
    }

    /* loaded from: classes9.dex */
    public static class p {

        /* renamed from: a  reason: collision with root package name */
        public String f23048a;
        public boolean b;

        static {
            kge.a(448839952);
        }
    }

    /* loaded from: classes9.dex */
    public static class q {

        /* renamed from: a  reason: collision with root package name */
        public boolean f23049a;
        public TrtcSendVideoType b;

        static {
            kge.a(-51143265);
        }
    }
}
