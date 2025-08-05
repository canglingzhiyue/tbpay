package com.taobao.artc.api;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.trtc.accs.a;
import tb.kge;

/* loaded from: classes6.dex */
public class ArtcConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ARTC_SDK_VERSION = "0.2.0";
    private static final String DEFAULT_CONFIT_UNKNOW = "unknow";
    private String accsCfgTag;
    private String alinnAuthCode;
    private Application appInstance;
    private String appKey;
    public String board;
    private int callTimeoutSec;
    public String carriers;
    private boolean checkAccsConnection;
    public String deviceId;
    private boolean enableMusicMode;
    private int environment;
    private ArtcExternalAudioProcess extAudioProcess;
    private ArtcExternalVideoProcess extVideoProcess;
    public String ip;
    private boolean isChatroom;
    private boolean isEnableSpeechDetect;
    private boolean isTmallCC;
    private boolean loadBeautyResource;
    private String localUserId;
    public String model;
    public String networkType;
    public String osVersion;
    private boolean preferBlueTooth;
    private boolean preferFrontCamera;
    public String protocal;
    public String sdkVersion;
    private String serviceName;
    private int signal_version;
    private boolean useExternalVideoCapturer;
    private boolean useExternalVideoRenderer;
    private AConstants.ArtcUtType utType;
    private int videoDecodeMode;
    private int videoEncodeMode;
    private String videoRawFilePath;

    static {
        kge.a(11272051);
    }

    public static /* synthetic */ int access$1002(ArtcConfig artcConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("957d3d72", new Object[]{artcConfig, new Integer(i)})).intValue();
        }
        artcConfig.signal_version = i;
        return i;
    }

    public static /* synthetic */ String access$102(ArtcConfig artcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("915f3440", new Object[]{artcConfig, str});
        }
        artcConfig.appKey = str;
        return str;
    }

    public static /* synthetic */ int access$1102(ArtcConfig artcConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec9b2e51", new Object[]{artcConfig, new Integer(i)})).intValue();
        }
        artcConfig.videoEncodeMode = i;
        return i;
    }

    public static /* synthetic */ int access$1202(ArtcConfig artcConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43b91f30", new Object[]{artcConfig, new Integer(i)})).intValue();
        }
        artcConfig.videoDecodeMode = i;
        return i;
    }

    public static /* synthetic */ boolean access$1302(ArtcConfig artcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ad74ff1", new Object[]{artcConfig, new Boolean(z)})).booleanValue();
        }
        artcConfig.checkAccsConnection = z;
        return z;
    }

    public static /* synthetic */ String access$1402(ArtcConfig artcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9f3680e", new Object[]{artcConfig, str});
        }
        artcConfig.videoRawFilePath = str;
        return str;
    }

    public static /* synthetic */ ArtcExternalVideoProcess access$1502(ArtcConfig artcConfig, ArtcExternalVideoProcess artcExternalVideoProcess) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArtcExternalVideoProcess) ipChange.ipc$dispatch("ce7f580d", new Object[]{artcConfig, artcExternalVideoProcess});
        }
        artcConfig.extVideoProcess = artcExternalVideoProcess;
        return artcExternalVideoProcess;
    }

    public static /* synthetic */ ArtcExternalAudioProcess access$1602(ArtcConfig artcConfig, ArtcExternalAudioProcess artcExternalAudioProcess) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArtcExternalAudioProcess) ipChange.ipc$dispatch("dfde72cc", new Object[]{artcConfig, artcExternalAudioProcess});
        }
        artcConfig.extAudioProcess = artcExternalAudioProcess;
        return artcExternalAudioProcess;
    }

    public static /* synthetic */ int access$1702(ArtcConfig artcConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f74ed38b", new Object[]{artcConfig, new Integer(i)})).intValue();
        }
        artcConfig.callTimeoutSec = i;
        return i;
    }

    public static /* synthetic */ Application access$1802(ArtcConfig artcConfig, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("a9a20722", new Object[]{artcConfig, application});
        }
        artcConfig.appInstance = application;
        return application;
    }

    public static /* synthetic */ AConstants.ArtcUtType access$1902(ArtcConfig artcConfig, AConstants.ArtcUtType artcUtType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AConstants.ArtcUtType) ipChange.ipc$dispatch("aca320c9", new Object[]{artcConfig, artcUtType});
        }
        artcConfig.utType = artcUtType;
        return artcUtType;
    }

    public static /* synthetic */ String access$2002(ArtcConfig artcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3ddae53", new Object[]{artcConfig, str});
        }
        artcConfig.alinnAuthCode = str;
        return str;
    }

    public static /* synthetic */ int access$202(ArtcConfig artcConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e76a7f", new Object[]{artcConfig, new Integer(i)})).intValue();
        }
        artcConfig.environment = i;
        return i;
    }

    public static /* synthetic */ boolean access$2102(ArtcConfig artcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("793b9934", new Object[]{artcConfig, new Boolean(z)})).booleanValue();
        }
        artcConfig.useExternalVideoRenderer = z;
        return z;
    }

    public static /* synthetic */ boolean access$2202(ArtcConfig artcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0598a13", new Object[]{artcConfig, new Boolean(z)})).booleanValue();
        }
        artcConfig.useExternalVideoCapturer = z;
        return z;
    }

    public static /* synthetic */ boolean access$2302(ArtcConfig artcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27777af2", new Object[]{artcConfig, new Boolean(z)})).booleanValue();
        }
        artcConfig.enableMusicMode = z;
        return z;
    }

    public static /* synthetic */ boolean access$2402(ArtcConfig artcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e956bd1", new Object[]{artcConfig, new Boolean(z)})).booleanValue();
        }
        artcConfig.isEnableSpeechDetect = z;
        return z;
    }

    public static /* synthetic */ boolean access$2502(ArtcConfig artcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5b35cb0", new Object[]{artcConfig, new Boolean(z)})).booleanValue();
        }
        artcConfig.isChatroom = z;
        return z;
    }

    public static /* synthetic */ String access$302(ArtcConfig artcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c641267e", new Object[]{artcConfig, str});
        }
        artcConfig.localUserId = str;
        return str;
    }

    public static /* synthetic */ String access$402(ArtcConfig artcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0b21f9d", new Object[]{artcConfig, str});
        }
        artcConfig.serviceName = str;
        return str;
    }

    public static /* synthetic */ String access$502(ArtcConfig artcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb2318bc", new Object[]{artcConfig, str});
        }
        artcConfig.accsCfgTag = str;
        return str;
    }

    public static /* synthetic */ boolean access$602(ArtcConfig artcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155f6ddd", new Object[]{artcConfig, new Boolean(z)})).booleanValue();
        }
        artcConfig.loadBeautyResource = z;
        return z;
    }

    public static /* synthetic */ boolean access$702(ArtcConfig artcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c7d5ebc", new Object[]{artcConfig, new Boolean(z)})).booleanValue();
        }
        artcConfig.preferBlueTooth = z;
        return z;
    }

    public static /* synthetic */ boolean access$802(ArtcConfig artcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c39b4f9b", new Object[]{artcConfig, new Boolean(z)})).booleanValue();
        }
        artcConfig.preferFrontCamera = z;
        return z;
    }

    public static /* synthetic */ boolean access$902(ArtcConfig artcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ab9407a", new Object[]{artcConfig, new Boolean(z)})).booleanValue();
        }
        artcConfig.isTmallCC = z;
        return z;
    }

    private ArtcConfig() {
        this.deviceId = DEFAULT_CONFIT_UNKNOW;
        this.carriers = DEFAULT_CONFIT_UNKNOW;
        this.model = DEFAULT_CONFIT_UNKNOW;
        this.board = DEFAULT_CONFIT_UNKNOW;
        this.networkType = DEFAULT_CONFIT_UNKNOW;
        this.sdkVersion = ARTC_SDK_VERSION;
        this.osVersion = DEFAULT_CONFIT_UNKNOW;
        this.ip = DEFAULT_CONFIT_UNKNOW;
        this.protocal = DEFAULT_CONFIT_UNKNOW;
        this.appKey = "";
        this.environment = 0;
        this.localUserId = "";
        this.serviceName = "";
        this.accsCfgTag = "";
        this.loadBeautyResource = false;
        this.preferBlueTooth = true;
        this.checkAccsConnection = false;
        this.videoRawFilePath = "";
        this.videoEncodeMode = 2;
        this.videoDecodeMode = 1;
        this.extVideoProcess = null;
        this.extAudioProcess = null;
        this.callTimeoutSec = 60;
        this.preferFrontCamera = true;
        this.isTmallCC = false;
        this.signal_version = 1;
        this.appInstance = null;
        this.utType = AConstants.ArtcUtType.ARTC_UT_TB;
        this.useExternalVideoCapturer = false;
        this.useExternalVideoRenderer = false;
        this.enableMusicMode = false;
        this.isEnableSpeechDetect = false;
        this.isChatroom = false;
    }

    public String appkey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42a5f91b", new Object[]{this}) : this.appKey;
    }

    public int environment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6419750d", new Object[]{this})).intValue() : this.environment;
    }

    public boolean isLoadBeautyResource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("433c8d85", new Object[]{this})).booleanValue() : this.loadBeautyResource;
    }

    public boolean isPreferBlueTooth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59017e5f", new Object[]{this})).booleanValue() : this.preferBlueTooth;
    }

    public boolean isPreferFrontCamera() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f4acff", new Object[]{this})).booleanValue() : this.preferFrontCamera;
    }

    public boolean isTmallCC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef031fe9", new Object[]{this})).booleanValue() : this.isTmallCC;
    }

    public int signalVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("20b8758a", new Object[]{this})).intValue() : this.signal_version;
    }

    public int videoEncodeMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("93e14e2e", new Object[]{this})).intValue() : this.videoEncodeMode;
    }

    public int videoDecodeMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f684a06", new Object[]{this})).intValue() : this.videoDecodeMode;
    }

    public boolean isCheckAccsConnection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3964bb9", new Object[]{this})).booleanValue() : this.checkAccsConnection;
    }

    public String protocal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ab5cdd3", new Object[]{this}) : this.protocal;
    }

    public String videoRawFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3640872b", new Object[]{this}) : this.videoRawFilePath;
    }

    public String alinnAuthCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4aa42326", new Object[]{this}) : this.alinnAuthCode;
    }

    public boolean verifyVaild() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b4e9e28", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.appKey) && !TextUtils.isEmpty(this.localUserId);
    }

    public String getLocalUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2df3417e", new Object[]{this}) : this.localUserId;
    }

    public String getServiceName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1300238f", new Object[]{this}) : this.serviceName;
    }

    public String getAccsCfgTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e139e7b", new Object[]{this}) : this.accsCfgTag;
    }

    public void setLocalUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82c1d20", new Object[]{this, str});
        } else {
            this.localUserId = str;
        }
    }

    public String getDeviceID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a8f07df2", new Object[]{this}) : this.deviceId;
    }

    public ArtcExternalVideoProcess externalVideoProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArtcExternalVideoProcess) ipChange.ipc$dispatch("2aa84e8f", new Object[]{this}) : this.extVideoProcess;
    }

    public ArtcExternalAudioProcess externalAudioProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArtcExternalAudioProcess) ipChange.ipc$dispatch("f79e0545", new Object[]{this}) : this.extAudioProcess;
    }

    public int callTimeoutSec() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("35f225a8", new Object[]{this})).intValue() : this.callTimeoutSec;
    }

    public AConstants.ArtcUtType getUtType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AConstants.ArtcUtType) ipChange.ipc$dispatch("48384029", new Object[]{this}) : this.utType;
    }

    public Application getApplicationInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("1cf5b1a5", new Object[]{this}) : this.appInstance;
    }

    public Boolean useExternalVideoCapturer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("72baeeb9", new Object[]{this}) : Boolean.valueOf(this.useExternalVideoCapturer);
    }

    public Boolean useExternalVideoRenderer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("8dd04250", new Object[]{this}) : Boolean.valueOf(this.useExternalVideoRenderer);
    }

    public Boolean musicModeEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("b2825d0f", new Object[]{this}) : Boolean.valueOf(this.enableMusicMode);
    }

    public boolean getEnableSpeechDetect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4844cec9", new Object[]{this})).booleanValue() : this.isEnableSpeechDetect;
    }

    public boolean getIsChatroom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec419a7e", new Object[]{this})).booleanValue() : this.isChatroom;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("ArtcConfig{");
        sb.append("appKey='");
        sb.append(this.appKey);
        sb.append('\'');
        sb.append(", localUserId='");
        sb.append(this.localUserId);
        sb.append('\'');
        sb.append(", deviceId='");
        sb.append(this.deviceId);
        sb.append('\'');
        sb.append(", carriers='");
        sb.append(this.carriers);
        sb.append('\'');
        sb.append(", model='");
        sb.append(this.model);
        sb.append('\'');
        sb.append(", board='");
        sb.append(this.board);
        sb.append('\'');
        sb.append(", osVersion='");
        sb.append(this.osVersion);
        sb.append('\'');
        sb.append(", networkType='");
        sb.append(this.networkType);
        sb.append('\'');
        sb.append(", sdkVersion='");
        sb.append(this.sdkVersion);
        sb.append('\'');
        sb.append(", ip='");
        sb.append(this.ip);
        sb.append('\'');
        sb.append(", accsCfgTag='");
        sb.append(this.accsCfgTag);
        sb.append('\'');
        sb.append(", external capture:" + this.useExternalVideoCapturer + ", render:" + this.useExternalVideoRenderer);
        sb.append(this.accsCfgTag);
        sb.append('\'');
        sb.append(", musicMode='");
        sb.append(this.enableMusicMode);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* loaded from: classes6.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean loadBeautyResource = false;
        private boolean preferBlueTooth = true;
        private boolean preferFrontCamera = true;
        private boolean isTmallCC = false;
        private String protocal = "accs";
        private int videoEncodeMode = 0;
        private int videoDecodeMode = 1;
        private boolean checkAccsConnection = true;
        private String appKey = "empty_app_key";
        private String localUserId = "empty_user_id";
        private String serviceName = "empty_service_name";
        private String accsCfgTag = "";
        private int environment = 0;
        private String videoRawFilePath = "";
        private ArtcExternalVideoProcess extVideoProcess = null;
        private ArtcExternalAudioProcess extAudioProcess = null;
        private int callTimeoutSec = 60;
        private int signal_version = 0;
        private Application appInstance = null;
        private AConstants.ArtcUtType utType = AConstants.ArtcUtType.ARTC_UT_UNKNOWN;
        private String alinnAuthCode = "";
        private boolean useExternalVideoCapturer = false;
        private boolean useExternalVideoRenderer = false;
        private boolean enableMusicMode = false;
        private boolean isEnableSpeechDetect = false;
        private boolean isChatroom = false;

        static {
            kge.a(-140397750);
        }

        public Builder setDeviceID(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("87bfde37", new Object[]{this, str}) : this;
        }

        public Builder setAccsConfigTag(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b0a61486", new Object[]{this, str});
            }
            a.a(str);
            this.accsCfgTag = str;
            return this;
        }

        public Builder setAppKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("46c42e4a", new Object[]{this, str});
            }
            a.b(str);
            this.appKey = str;
            return this;
        }

        public Builder setEnvironment(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a4f7f570", new Object[]{this, new Integer(i)});
            }
            a.a(i);
            this.environment = i;
            return this;
        }

        public Builder setLocalUserId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9bc4ac5b", new Object[]{this, str});
            }
            this.localUserId = str;
            return this;
        }

        public Builder setServiceName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("416a696c", new Object[]{this, str});
            }
            this.serviceName = str;
            return this;
        }

        public Builder setAccsCfgTag(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("66c534c0", new Object[]{this, str});
            }
            this.accsCfgTag = str;
            return this;
        }

        public Builder setLoadBeautyResource(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("de5f69e0", new Object[]{this, new Boolean(z)});
            }
            this.loadBeautyResource = z;
            return this;
        }

        public Builder setPreferBlueTooth(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9604094a", new Object[]{this, new Boolean(z)});
            }
            this.preferBlueTooth = z;
            return this;
        }

        public Builder setPreferFrontCamera(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9627c5ea", new Object[]{this, new Boolean(z)});
            }
            this.preferFrontCamera = z;
            return this;
        }

        public Builder setIsTmallCC(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("32fa77ca", new Object[]{this, new Boolean(z)});
            }
            this.isTmallCC = z;
            return this;
        }

        public Builder setSignalVersion(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b12b9d6d", new Object[]{this, new Integer(i)});
            }
            this.signal_version = i;
            return this;
        }

        public Builder setVideoEncodeMode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6e4f8a91", new Object[]{this, new Integer(i)});
            }
            this.videoEncodeMode = i;
            return this;
        }

        public Builder setVideoDecodeMode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5d23ce69", new Object[]{this, new Integer(i)});
            }
            this.videoDecodeMode = i;
            return this;
        }

        public Builder setProtocal(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fe564f62", new Object[]{this, str});
            }
            this.protocal = str;
            return this;
        }

        public Builder setCheckAccsConnection(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d5dad0a4", new Object[]{this, new Boolean(z)});
            }
            this.checkAccsConnection = z;
            return this;
        }

        public Builder setVideoRawFilePath(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1cfd32ba", new Object[]{this, str});
            }
            this.videoRawFilePath = str;
            return this;
        }

        public Builder setVideoCaptureExternalProcess(ArtcExternalVideoProcess artcExternalVideoProcess) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("aba7cc9e", new Object[]{this, artcExternalVideoProcess});
            }
            this.extVideoProcess = artcExternalVideoProcess;
            return this;
        }

        public Builder setAudioExternalProcess(ArtcExternalAudioProcess artcExternalAudioProcess) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e4f25c6a", new Object[]{this, artcExternalAudioProcess});
            }
            this.extAudioProcess = artcExternalAudioProcess;
            return this;
        }

        public Builder setCallTimeoutSec(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("947313cf", new Object[]{this, new Integer(i)});
            }
            this.callTimeoutSec = i;
            return this;
        }

        public Builder setUtType(AConstants.ArtcUtType artcUtType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9367739a", new Object[]{this, artcUtType});
            }
            this.utType = artcUtType;
            return this;
        }

        public Builder setApplicationInstance(Application application) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b6636f06", new Object[]{this, application});
            }
            this.appInstance = application;
            return this;
        }

        public Builder setAlinnAuthCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("77e6baf9", new Object[]{this, str});
            }
            this.alinnAuthCode = str;
            return this;
        }

        public Builder setUseExternalVideoDevice(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("672bdc13", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            this.useExternalVideoRenderer = z2;
            this.useExternalVideoCapturer = z;
            return this;
        }

        public Builder setMusicModeEnable(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("84c15de", new Object[]{this, bool});
            }
            this.enableMusicMode = bool.booleanValue();
            return this;
        }

        public Builder setEnableSpeechDetect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fec959f8", new Object[]{this, new Boolean(z)});
            }
            this.isEnableSpeechDetect = z;
            return this;
        }

        public Builder setChatroom(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("670dd0e3", new Object[]{this, new Boolean(z)});
            }
            this.isChatroom = z;
            return this;
        }

        public ArtcConfig build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcConfig) ipChange.ipc$dispatch("87e5cddd", new Object[]{this});
            }
            ArtcConfig artcConfig = new ArtcConfig();
            ArtcConfig.access$102(artcConfig, this.appKey);
            ArtcConfig.access$202(artcConfig, this.environment);
            ArtcConfig.access$302(artcConfig, this.localUserId);
            ArtcConfig.access$402(artcConfig, this.serviceName);
            ArtcConfig.access$502(artcConfig, this.accsCfgTag);
            ArtcConfig.access$602(artcConfig, this.loadBeautyResource);
            ArtcConfig.access$702(artcConfig, this.preferBlueTooth);
            ArtcConfig.access$802(artcConfig, this.preferFrontCamera);
            ArtcConfig.access$902(artcConfig, this.isTmallCC);
            ArtcConfig.access$1002(artcConfig, this.signal_version);
            artcConfig.protocal = this.protocal;
            ArtcConfig.access$1102(artcConfig, this.videoEncodeMode);
            ArtcConfig.access$1202(artcConfig, this.videoDecodeMode);
            ArtcConfig.access$1302(artcConfig, this.checkAccsConnection);
            ArtcConfig.access$1402(artcConfig, this.videoRawFilePath);
            ArtcConfig.access$1502(artcConfig, this.extVideoProcess);
            ArtcConfig.access$1602(artcConfig, this.extAudioProcess);
            ArtcConfig.access$1702(artcConfig, this.callTimeoutSec);
            ArtcConfig.access$1802(artcConfig, this.appInstance);
            ArtcConfig.access$1902(artcConfig, this.utType);
            ArtcConfig.access$2002(artcConfig, this.alinnAuthCode);
            ArtcConfig.access$2102(artcConfig, this.useExternalVideoRenderer);
            ArtcConfig.access$2202(artcConfig, this.useExternalVideoCapturer);
            ArtcConfig.access$2302(artcConfig, this.enableMusicMode);
            ArtcConfig.access$2402(artcConfig, this.isEnableSpeechDetect);
            ArtcConfig.access$2502(artcConfig, this.isChatroom);
            return artcConfig;
        }
    }
}
