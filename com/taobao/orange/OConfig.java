package com.taobao.orange;

import android.os.Parcel;
import android.os.Parcelable;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import tb.kge;

/* loaded from: classes.dex */
public final class OConfig implements Parcelable {
    public static final Parcelable.Creator<OConfig> CREATOR;
    public String ackHost;
    public String[] ackVips;
    public String appKey;
    public String appSecret;
    public String appVersion;
    public String authCode;
    public boolean channelIndexUpdate;
    public String dcHost;
    public String[] dcVips;
    public boolean enableDiffIndex;
    public int env;
    public int indexUpdateMode;
    public String[] probeHosts;
    public boolean reportAck;
    public int serverType;
    public boolean statUsedConfig;
    public long time;
    public String userId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OConfig() {
        this.time = 2000L;
        this.channelIndexUpdate = false;
    }

    protected OConfig(Parcel parcel) {
        this.time = 2000L;
        boolean z = false;
        this.channelIndexUpdate = false;
        this.env = parcel.readInt();
        this.appKey = parcel.readString();
        this.appVersion = parcel.readString();
        this.appSecret = parcel.readString();
        this.authCode = parcel.readString();
        this.userId = parcel.readString();
        this.serverType = parcel.readInt();
        this.indexUpdateMode = parcel.readInt();
        this.reportAck = parcel.readByte() != 0;
        this.statUsedConfig = parcel.readByte() != 0;
        this.probeHosts = parcel.createStringArray();
        this.dcHost = parcel.readString();
        this.dcVips = parcel.createStringArray();
        this.ackHost = parcel.readString();
        this.ackVips = parcel.createStringArray();
        this.time = parcel.readLong();
        this.channelIndexUpdate = parcel.readByte() != 0;
        this.enableDiffIndex = parcel.readByte() != 0 ? true : z;
    }

    static {
        kge.a(569477763);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<OConfig>() { // from class: com.taobao.orange.OConfig.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.orange.OConfig] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ OConfig createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.orange.OConfig[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ OConfig[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public OConfig a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (OConfig) ipChange.ipc$dispatch("487310d3", new Object[]{this, parcel}) : new OConfig(parcel);
            }

            public OConfig[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (OConfig[]) ipChange.ipc$dispatch("f56fe7c4", new Object[]{this, new Integer(i)}) : new OConfig[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.env);
        parcel.writeString(this.appKey);
        parcel.writeString(this.appVersion);
        parcel.writeString(this.appSecret);
        parcel.writeString(this.authCode);
        parcel.writeString(this.userId);
        parcel.writeInt(this.serverType);
        parcel.writeInt(this.indexUpdateMode);
        parcel.writeByte(this.reportAck ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.statUsedConfig ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.probeHosts);
        parcel.writeString(this.dcHost);
        parcel.writeStringArray(this.dcVips);
        parcel.writeString(this.ackHost);
        parcel.writeStringArray(this.ackVips);
        parcel.writeLong(this.time);
        parcel.writeByte(this.channelIndexUpdate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableDiffIndex ? (byte) 1 : (byte) 0);
    }

    /* loaded from: classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String[] l;
        private String m;
        private String[] n;
        private String o;
        private String[] p;

        /* renamed from: a  reason: collision with root package name */
        private int f18558a = OConstant.ENV.ONLINE.getEnvMode();
        private String b = "";
        private String c = "";
        private String d = "";
        private String e = "";
        private String f = "";
        private int g = OConstant.SERVER.TAOBAO.ordinal();
        private int h = OConstant.UPDMODE.O_XMD.ordinal();
        private boolean i = false;
        private boolean j = false;
        private boolean k = false;
        private long q = 2000;

        static {
            kge.a(1886596698);
        }

        public Builder setEnv(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8465bc68", new Object[]{this, new Integer(i)});
            }
            this.f18558a = i;
            return this;
        }

        public Builder setAppKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("96dcb968", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public Builder setAppVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("72b08061", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public Builder setAppSecret(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("89ee6d7", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public Builder setAuthCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("325def1f", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public Builder setUserId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("25938330", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public Builder setServerType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("515f33f4", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public Builder setIndexUpdateMode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("79fee0b7", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public Builder setReportAck(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e176a7b1", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public Builder setStatUsedConfig(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1dc4460f", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public Builder setProbeHosts(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("324bfd72", new Object[]{this, strArr});
            }
            this.l = strArr;
            return this;
        }

        @Deprecated
        public Builder setOnlineHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f4f2bf85", new Object[]{this, str});
            }
            this.m = str;
            return this;
        }

        @Deprecated
        public Builder setOnlineAckHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("da9858a4", new Object[]{this, str});
            }
            this.o = str;
            return this;
        }

        public Builder setDcHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3daafcb1", new Object[]{this, str});
            }
            this.m = str;
            return this;
        }

        public Builder setDcVips(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ae28f698", new Object[]{this, strArr});
            }
            this.n = strArr;
            return this;
        }

        public Builder setAckHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("59e0fbf7", new Object[]{this, str});
            }
            this.o = str;
            return this;
        }

        public Builder setAckVips(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("18b2e012", new Object[]{this, strArr});
            }
            this.p = strArr;
            return this;
        }

        public Builder setTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ec422e45", new Object[]{this, new Long(j)});
            }
            this.q = j;
            return this;
        }

        public Builder setEnableDiffIndex(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("255e31bc", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public OConfig build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OConfig) ipChange.ipc$dispatch("d090ca43", new Object[]{this});
            }
            OConfig oConfig = new OConfig();
            oConfig.env = this.f18558a;
            oConfig.appKey = this.b;
            oConfig.appSecret = this.d;
            oConfig.authCode = this.e;
            oConfig.userId = this.f;
            oConfig.appVersion = this.c;
            oConfig.serverType = this.g;
            oConfig.indexUpdateMode = this.h;
            oConfig.reportAck = this.i;
            oConfig.statUsedConfig = this.j;
            oConfig.time = this.q;
            String[] strArr = this.l;
            if (strArr == null || strArr.length == 0) {
                oConfig.probeHosts = OConstant.PROBE_HOSTS[this.f18558a];
            } else {
                oConfig.probeHosts = strArr;
            }
            if (StringUtils.isEmpty(this.m)) {
                oConfig.dcHost = this.g == OConstant.SERVER.TAOBAO.ordinal() ? OConstant.DC_TAOBAO_HOSTS[this.f18558a] : OConstant.DC_YOUKU_HOSTS[this.f18558a];
            } else {
                oConfig.dcHost = this.m;
            }
            oConfig.dcVips = this.n;
            if (StringUtils.isEmpty(this.o)) {
                oConfig.ackHost = this.g == OConstant.SERVER.TAOBAO.ordinal() ? OConstant.ACK_TAOBAO_HOSTS[this.f18558a] : OConstant.ACK_YOUKU_HOSTS[this.f18558a];
            } else {
                oConfig.ackHost = this.o;
            }
            oConfig.ackVips = this.p;
            oConfig.enableDiffIndex = this.k;
            return oConfig;
        }
    }
}
