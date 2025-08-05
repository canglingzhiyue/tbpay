package com.taobao.trtc.api;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcDefines;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String accsCfgTag;
    private String appKey;
    private String appVersion;
    @Deprecated
    private ITrtcObserver.b callEventObserver;
    @Deprecated
    private ITrtcObserver.c channelEventObserver;
    private String deviceId;
    private boolean enableSpeechDetect;
    @Deprecated
    private ITrtcObserver.e engineObserver;
    private int environment;
    private b eventHandler;
    private boolean initAccs;
    private boolean isChatroom;
    private int localAudioLevelMs;
    private boolean preferFrontCamera;
    private boolean preferHandset;
    private String regId;
    private String serverName;
    private boolean useBlueTooth;
    private boolean useExternalVideoCapture;
    private boolean useExternalVideoRender;
    private boolean useMusicMode;
    private boolean useTaoAudio;
    private String userId;
    private boolean videoFecEnable;
    private TrtcDefines.TrtcWorkMode workMode;

    static {
        kge.a(1707386387);
    }

    public static /* synthetic */ String access$002(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8af4e9c1", new Object[]{trtcConfig, str});
        }
        trtcConfig.serverName = str;
        return str;
    }

    public static /* synthetic */ boolean access$1002(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daa1d3f4", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.useTaoAudio = z;
        return z;
    }

    public static /* synthetic */ String access$102(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a565e2e0", new Object[]{trtcConfig, str});
        }
        trtcConfig.appKey = str;
        return str;
    }

    public static /* synthetic */ boolean access$1102(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31bfc4d3", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.initAccs = z;
        return z;
    }

    public static /* synthetic */ boolean access$1202(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88ddb5b2", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.preferFrontCamera = z;
        return z;
    }

    public static /* synthetic */ int access$1302(TrtcConfig trtcConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dffb66af", new Object[]{trtcConfig, new Integer(i)})).intValue();
        }
        trtcConfig.environment = i;
        return i;
    }

    public static /* synthetic */ String access$1402(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfa16ae", new Object[]{trtcConfig, str});
        }
        trtcConfig.accsCfgTag = str;
        return str;
    }

    public static /* synthetic */ b access$1502(TrtcConfig trtcConfig, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9146166d", new Object[]{trtcConfig, bVar});
        }
        trtcConfig.eventHandler = bVar;
        return bVar;
    }

    public static /* synthetic */ ITrtcObserver.e access$1602(TrtcConfig trtcConfig, ITrtcObserver.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcObserver.e) ipChange.ipc$dispatch("a6ca75f6", new Object[]{trtcConfig, eVar});
        }
        trtcConfig.engineObserver = eVar;
        return eVar;
    }

    public static /* synthetic */ ITrtcObserver.b access$1702(TrtcConfig trtcConfig, ITrtcObserver.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcObserver.b) ipChange.ipc$dispatch("af7cccdb", new Object[]{trtcConfig, bVar});
        }
        trtcConfig.callEventObserver = bVar;
        return bVar;
    }

    public static /* synthetic */ ITrtcObserver.c access$1802(TrtcConfig trtcConfig, ITrtcObserver.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcObserver.c) ipChange.ipc$dispatch("14a6e7b8", new Object[]{trtcConfig, cVar});
        }
        trtcConfig.channelEventObserver = cVar;
        return cVar;
    }

    public static /* synthetic */ boolean access$1902(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaaf4bcb", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.videoFecEnable = z;
        return z;
    }

    public static /* synthetic */ int access$2002(TrtcConfig trtcConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6741bf13", new Object[]{trtcConfig, new Integer(i)})).intValue();
        }
        trtcConfig.localAudioLevelMs = i;
        return i;
    }

    public static /* synthetic */ String access$202(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfd6dbff", new Object[]{trtcConfig, str});
        }
        trtcConfig.userId = str;
        return str;
    }

    public static /* synthetic */ String access$2102(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2555612", new Object[]{trtcConfig, str});
        }
        trtcConfig.appVersion = str;
        return str;
    }

    public static /* synthetic */ boolean access$2202(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("157de0b3", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.preferHandset = z;
        return z;
    }

    public static /* synthetic */ boolean access$2302(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c9bd192", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.enableSpeechDetect = z;
        return z;
    }

    public static /* synthetic */ boolean access$2402(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3b9c271", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.isChatroom = z;
        return z;
    }

    public static /* synthetic */ String access$302(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da47d51e", new Object[]{trtcConfig, str});
        }
        trtcConfig.deviceId = str;
        return str;
    }

    public static /* synthetic */ String access$402(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4b8ce3d", new Object[]{trtcConfig, str});
        }
        trtcConfig.regId = str;
        return str;
    }

    public static /* synthetic */ boolean access$502(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("365d39e", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.useExternalVideoCapture = z;
        return z;
    }

    public static /* synthetic */ boolean access$602(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a83c47d", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.useExternalVideoRender = z;
        return z;
    }

    public static /* synthetic */ boolean access$702(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a1b55c", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.useBlueTooth = z;
        return z;
    }

    public static /* synthetic */ boolean access$802(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bfa63b", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.useMusicMode = z;
        return z;
    }

    public static /* synthetic */ TrtcDefines.TrtcWorkMode access$902(TrtcConfig trtcConfig, TrtcDefines.TrtcWorkMode trtcWorkMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.TrtcWorkMode) ipChange.ipc$dispatch("75554b78", new Object[]{trtcConfig, trtcWorkMode});
        }
        trtcConfig.workMode = trtcWorkMode;
        return trtcWorkMode;
    }

    public String ToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("572a47ed", new Object[]{this});
        }
        return "{ serviceName:" + this.serverName + ", appkey:" + this.appKey + ", uid:" + this.userId + ", did: " + this.deviceId + ", rid: " + this.regId + ", musicMode:" + this.useMusicMode + ", BT:" + this.useBlueTooth + ", taoAudio:" + this.useTaoAudio + ", workMode:" + this.workMode + ", extVCapture:" + this.useExternalVideoCapture + ", extVRender:" + this.useExternalVideoRender + ", initAccs:" + this.initAccs + ", fromtCamera:" + this.preferFrontCamera + ", vfec: " + this.videoFecEnable + ", appVersion: " + this.appVersion + ", eventHandler: " + this.eventHandler + ", engineObserver: " + this.engineObserver + ", channelObserver:" + this.channelEventObserver + ", callObserver:" + this.callEventObserver + ", env: " + this.environment + ", accsTag: " + this.accsCfgTag + ", localAudioLevelMs: " + this.localAudioLevelMs + ", preferHandset: " + this.preferHandset + ", enableSpeechDetect: " + this.enableSpeechDetect + ", isChatroom: " + this.isChatroom + " }";
    }

    public String getServerName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9851915", new Object[]{this}) : this.serverName;
    }

    public String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : this.appKey;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
    }

    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this}) : this.deviceId;
    }

    public String getRegId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2950b580", new Object[]{this}) : this.regId;
    }

    public void setDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fc2e4", new Object[]{this, str});
        } else {
            this.deviceId = str;
        }
    }

    public void setRegId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9e905e", new Object[]{this, str});
        } else {
            this.regId = str;
        }
    }

    public void setWorkMode(TrtcDefines.TrtcWorkMode trtcWorkMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e3d62e", new Object[]{this, trtcWorkMode});
        } else {
            this.workMode = trtcWorkMode;
        }
    }

    public void setPreferFrontCamera(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557f9a71", new Object[]{this, new Boolean(z)});
        } else {
            this.preferFrontCamera = z;
        }
    }

    public TrtcDefines.TrtcWorkMode getWorkMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcDefines.TrtcWorkMode) ipChange.ipc$dispatch("ba7b30f6", new Object[]{this}) : this.workMode;
    }

    public boolean isUseExternalVideoCapture() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8580e85e", new Object[]{this})).booleanValue() : this.useExternalVideoCapture;
    }

    public boolean isUseExternalVideoRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3252b5f4", new Object[]{this})).booleanValue() : this.useExternalVideoRender;
    }

    public boolean isUseBlueTooth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d288fb1c", new Object[]{this})).booleanValue() : this.useBlueTooth;
    }

    public boolean isUseMusicMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7682cf6", new Object[]{this})).booleanValue() : this.useMusicMode;
    }

    public boolean isInitAccs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da716f17", new Object[]{this})).booleanValue() : this.initAccs;
    }

    public boolean isPreferFrontCamera() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f4acff", new Object[]{this})).booleanValue() : this.preferFrontCamera;
    }

    public boolean isUseTaoAudio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2fc1947c", new Object[]{this})).booleanValue() : this.useTaoAudio;
    }

    public int getEnvironment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue() : this.environment;
    }

    public String getAccsCfgTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e139e7b", new Object[]{this}) : this.accsCfgTag;
    }

    public b getEventHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c3077600", new Object[]{this}) : this.eventHandler;
    }

    public boolean getVideoFecEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("efe06d", new Object[]{this})).booleanValue() : this.videoFecEnable;
    }

    public boolean isPreferHandset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("78f2ec64", new Object[]{this})).booleanValue() : this.preferHandset;
    }

    public boolean isChatroom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fda9cd88", new Object[]{this})).booleanValue() : this.isChatroom;
    }

    @Deprecated
    public ITrtcObserver.e getEngineObserver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcObserver.e) ipChange.ipc$dispatch("715711dd", new Object[]{this}) : this.engineObserver;
    }

    @Deprecated
    public ITrtcObserver.b getCallEventObserver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcObserver.b) ipChange.ipc$dispatch("ae17646e", new Object[]{this}) : this.callEventObserver;
    }

    @Deprecated
    public ITrtcObserver.c getChannelEventObserver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcObserver.c) ipChange.ipc$dispatch("c915d834", new Object[]{this}) : this.channelEventObserver;
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f23032a = "";
        private String b = "";
        private String c = "";
        private String d = "";
        private String e = "";
        private boolean f = true;
        private boolean g = false;
        private boolean h = false;
        private boolean i = true;
        private boolean j = false;
        private boolean k = false;
        private TrtcDefines.TrtcWorkMode l = TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_LIVE;
        private boolean m = false;
        private boolean n = true;
        private b o = null;
        private boolean p = false;
        private boolean w = false;
        private boolean x = false;
        @Deprecated
        private ITrtcObserver.e q = null;
        @Deprecated
        private ITrtcObserver.b r = null;
        @Deprecated
        private ITrtcObserver.c s = null;
        private int t = 1;
        private String u = "";
        private int v = 0;
        private String y = "";

        static {
            kge.a(-814106134);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7384a903", new Object[]{this, str});
            }
            this.f23032a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("74bafbe2", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("75f14ec1", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7727a1a0", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a a(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9a07170d", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            this.g = z;
            this.h = z2;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("14087109", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dd09684a", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a60a5f8b", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6f0b56cc", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("380c4e0d", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5bd5b2ba", new Object[]{this, new Integer(i)});
            }
            this.t = i;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("785df47f", new Object[]{this, str});
            }
            this.u = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7994475e", new Object[]{this, str});
            }
            this.y = str;
            return this;
        }

        @Deprecated
        public a a(ITrtcObserver.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1e82a165", new Object[]{this, eVar});
            }
            this.q = eVar;
            return this;
        }

        @Deprecated
        public a a(ITrtcObserver.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e38b26e2", new Object[]{this, bVar});
            }
            this.r = bVar;
            return this;
        }

        @Deprecated
        public a a(ITrtcObserver.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f732fa63", new Object[]{this, cVar});
            }
            this.s = cVar;
            return this;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fe77d27a", new Object[]{this, bVar});
            }
            this.o = bVar;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("24d6a9fb", new Object[]{this, new Integer(i)});
            }
            this.v = i;
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ca0e3c8f", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("10d454e", new Object[]{this, new Boolean(z)});
            }
            this.w = z;
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("930f33d0", new Object[]{this, new Boolean(z)});
            }
            this.x = z;
            return this;
        }

        public TrtcConfig a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcConfig) ipChange.ipc$dispatch("fc8da46a", new Object[]{this});
            }
            TrtcConfig trtcConfig = new TrtcConfig();
            TrtcConfig.access$002(trtcConfig, this.f23032a);
            TrtcConfig.access$102(trtcConfig, this.b);
            TrtcConfig.access$202(trtcConfig, this.c);
            TrtcConfig.access$302(trtcConfig, this.d);
            TrtcConfig.access$402(trtcConfig, this.e);
            TrtcConfig.access$502(trtcConfig, this.g);
            TrtcConfig.access$602(trtcConfig, this.h);
            TrtcConfig.access$702(trtcConfig, this.i);
            TrtcConfig.access$802(trtcConfig, this.j);
            TrtcConfig.access$902(trtcConfig, this.l);
            TrtcConfig.access$1002(trtcConfig, this.k);
            TrtcConfig.access$1102(trtcConfig, this.m);
            TrtcConfig.access$1202(trtcConfig, this.n);
            TrtcConfig.access$1302(trtcConfig, this.t);
            TrtcConfig.access$1402(trtcConfig, this.u);
            TrtcConfig.access$1502(trtcConfig, this.o);
            TrtcConfig.access$1602(trtcConfig, this.q);
            TrtcConfig.access$1702(trtcConfig, this.r);
            TrtcConfig.access$1802(trtcConfig, this.s);
            TrtcConfig.access$1902(trtcConfig, this.f);
            TrtcConfig.access$2002(trtcConfig, this.v);
            TrtcConfig.access$2102(trtcConfig, this.y);
            TrtcConfig.access$2202(trtcConfig, this.p);
            TrtcConfig.access$2302(trtcConfig, this.w);
            TrtcConfig.access$2402(trtcConfig, this.x);
            return trtcConfig;
        }
    }
}
