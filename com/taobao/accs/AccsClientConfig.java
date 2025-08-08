package com.taobao.accs;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.NoTraceTriggerHelper;
import com.taobao.accs.utl.o;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class AccsClientConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACCS_VER_V1 = 1;
    public static final int ACCS_VER_V2 = 2;
    public static final String[] DEFAULT_CENTER_HOSTS;
    public static final String DEFAULT_CONFIGTAG = "default";
    public static final int SECURITY_OFF = 2;
    public static final int SECURITY_OPEN = 1;
    public static final int SECURITY_TAOBAO = 0;
    private static final String TAG = "AccsClientConfig";
    public static final String V2_EXCLUSIVE_CONFIGTAG = "accs_v2_exclusive";
    public static boolean loadedStaticConfig;
    private static Context mContext;
    public static Map<String, AccsClientConfig> mDebugConfigs;
    public static volatile int mEnv;
    public static Map<String, AccsClientConfig> mPreviewConfigs;
    public static Map<String, AccsClientConfig> mReleaseConfigs;
    private String connType;
    private boolean mAccsHeartbeatEnable;
    private String mAppKey;
    private String mAppSecret;
    private String mAuthCode;
    private boolean mAutoUnit;
    private int mConfigEnv;
    private boolean mForePingEnable;
    private String mInappHost;
    private int mInappPubKey;
    private boolean mKeepalive;
    private int mPingTimeout;
    private boolean mPullUpEnable;
    private boolean mQuickReconnect;
    private int mSecurity;
    private String mStoreId;
    private String mTag;
    private int version = 1;

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface ENV {
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface SECURITY_TYPE {
    }

    public static /* synthetic */ String access$002(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9eaa7377", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mAppKey = str;
        return str;
    }

    public static /* synthetic */ String access$100(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c4eb47a2", new Object[]{accsClientConfig}) : accsClientConfig.mAppSecret;
    }

    public static /* synthetic */ boolean access$1002(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a27a42ea", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mQuickReconnect = z;
        return z;
    }

    public static /* synthetic */ String access$102(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0c1a0d6", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mAppSecret = str;
        return str;
    }

    public static /* synthetic */ boolean access$1102(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9df7809", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mAccsHeartbeatEnable = z;
        return z;
    }

    public static /* synthetic */ boolean access$1202(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b144ad28", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mPullUpEnable = z;
        return z;
    }

    public static /* synthetic */ boolean access$1302(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8a9e247", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mForePingEnable = z;
        return z;
    }

    public static /* synthetic */ int access$1402(AccsClientConfig accsClientConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c00ed784", new Object[]{accsClientConfig, new Integer(i)})).intValue();
        }
        accsClientConfig.mPingTimeout = i;
        return i;
    }

    public static /* synthetic */ String access$1502(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b72f4683", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.connType = str;
        return str;
    }

    public static /* synthetic */ int access$1602(AccsClientConfig accsClientConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ced941c2", new Object[]{accsClientConfig, new Integer(i)})).intValue();
        }
        accsClientConfig.version = i;
        return i;
    }

    public static /* synthetic */ int access$1702(AccsClientConfig accsClientConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d63e76e1", new Object[]{accsClientConfig, new Integer(i)})).intValue();
        }
        accsClientConfig.mSecurity = i;
        return i;
    }

    public static /* synthetic */ String access$202(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22d8ce35", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mAuthCode = str;
        return str;
    }

    public static /* synthetic */ boolean access$302(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b7295d6", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mKeepalive = z;
        return z;
    }

    public static /* synthetic */ boolean access$402(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d7caf5", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mAutoUnit = z;
        return z;
    }

    public static /* synthetic */ int access$502(AccsClientConfig accsClientConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa3cc032", new Object[]{accsClientConfig, new Integer(i)})).intValue();
        }
        accsClientConfig.mInappPubKey = i;
        return i;
    }

    public static /* synthetic */ String access$600(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("858cbb3d", new Object[]{accsClientConfig}) : accsClientConfig.mInappHost;
    }

    public static /* synthetic */ String access$602(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b3583b1", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mInappHost = str;
        return str;
    }

    public static /* synthetic */ String access$700(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1279d25c", new Object[]{accsClientConfig}) : accsClientConfig.mTag;
    }

    public static /* synthetic */ String access$702(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d4cb110", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mTag = str;
        return str;
    }

    public static /* synthetic */ String access$802(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af63de6f", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mStoreId = str;
        return str;
    }

    public static /* synthetic */ int access$900(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4b25d8b9", new Object[]{accsClientConfig})).intValue() : accsClientConfig.mConfigEnv;
    }

    public static /* synthetic */ int access$902(AccsClientConfig accsClientConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7d194ae", new Object[]{accsClientConfig, new Integer(i)})).intValue();
        }
        accsClientConfig.mConfigEnv = i;
        return i;
    }

    static {
        kge.a(1326542921);
        kge.a(1028243835);
        DEFAULT_CENTER_HOSTS = new String[]{"msgacs.m.taobao.com", "msgacs.wapa.taobao.com", "msgacs.waptest.taobao.com"};
        loadedStaticConfig = false;
        mEnv = 0;
        mReleaseConfigs = new ConcurrentHashMap(1);
        mPreviewConfigs = new ConcurrentHashMap(1);
        mDebugConfigs = new ConcurrentHashMap(1);
    }

    public static Context getContext() {
        Context context = mContext;
        if (context != null) {
            return context;
        }
        synchronized (AccsClientConfig.class) {
            if (mContext != null) {
                return mContext;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                mContext = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return mContext;
        }
    }

    @Deprecated
    public static AccsClientConfig getConfig(String str) {
        Map<String, AccsClientConfig> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsClientConfig) ipChange.ipc$dispatch("7259c633", new Object[]{str});
        }
        int i = mEnv;
        if (i == 1) {
            map = mPreviewConfigs;
        } else if (i == 2) {
            map = mDebugConfigs;
        } else {
            map = mReleaseConfigs;
        }
        for (AccsClientConfig accsClientConfig : map.values()) {
            if (accsClientConfig.mAppKey.equals(str) && accsClientConfig.mConfigEnv == mEnv) {
                return accsClientConfig;
            }
        }
        ALog.e(TAG, "getConfigByTag return null", "appkey", str);
        return null;
    }

    public static AccsClientConfig getConfigByTag(String str) {
        AccsClientConfig accsClientConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsClientConfig) ipChange.ipc$dispatch("2b9c5aa0", new Object[]{str});
        }
        int i = mEnv;
        if (i == 0) {
            accsClientConfig = mReleaseConfigs.get(str);
        } else if (i == 1) {
            accsClientConfig = mPreviewConfigs.get(str);
        } else if (i == 2) {
            accsClientConfig = mDebugConfigs.get(str);
        } else {
            accsClientConfig = mReleaseConfigs.get(str);
        }
        if (accsClientConfig == null) {
            ALog.e(TAG, "getConfigByTag return null", Constants.KEY_CONFIG_TAG, str);
        }
        return accsClientConfig;
    }

    public int getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue() : this.version;
    }

    public void setVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a3706", new Object[]{this, new Integer(i)});
        } else {
            this.version = i;
        }
    }

    public String getConnType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc970a7d", new Object[]{this}) : this.connType;
    }

    public void setConnType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61279f99", new Object[]{this, str});
        } else {
            this.connType = str;
        }
    }

    public String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : this.mAppKey;
    }

    public String getAppSecret() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96a305e", new Object[]{this}) : this.mAppSecret;
    }

    public String getInappHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c0f63cb", new Object[]{this}) : this.mInappHost;
    }

    public int getSecurity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("910cee30", new Object[]{this})).intValue() : this.mSecurity;
    }

    public String getAuthCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4213feae", new Object[]{this}) : this.mAuthCode;
    }

    public int getInappPubKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf11c362", new Object[]{this})).intValue() : this.mInappPubKey;
    }

    public boolean isKeepalive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5bd13fe9", new Object[]{this})).booleanValue() : this.mKeepalive;
    }

    public boolean isAutoUnit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6be1128", new Object[]{this})).booleanValue() : this.mAutoUnit;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this}) : this.mTag;
    }

    public int getConfigEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3f9bd18f", new Object[]{this})).intValue() : this.mConfigEnv;
    }

    public boolean isQuickReconnect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f6d5023f", new Object[]{this})).booleanValue() : this.mQuickReconnect;
    }

    public String getStoreId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f5844913", new Object[]{this}) : this.mStoreId;
    }

    public boolean isAccsHeartbeatEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("300550ae", new Object[]{this})).booleanValue() : this.mAccsHeartbeatEnable;
    }

    public boolean isPullUpEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed7b55b8", new Object[]{this})).booleanValue() : this.mPullUpEnable;
    }

    public boolean isForePingEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8bf95a46", new Object[]{this})).booleanValue() : this.mForePingEnable;
    }

    public void setForePingEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1683769a", new Object[]{this, new Boolean(z)});
        } else {
            this.mForePingEnable = z;
        }
    }

    public int getPingTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("55353653", new Object[]{this})).intValue() : this.mPingTimeout;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AccsClientConfig{mAppKey='" + this.mAppKey + "', mAppSecret='" + this.mAppSecret + "', mInappHost='" + this.mInappHost + "', mStoreId='" + this.mStoreId + "', mSecurity=" + this.mSecurity + ", mAuthCode='" + this.mAuthCode + "', mInappPubKey=" + this.mInappPubKey + ", mKeepalive=" + this.mKeepalive + ", mAutoUnit=" + this.mAutoUnit + ", mTag='" + this.mTag + "', mConfigEnv=" + this.mConfigEnv + ", mQuickReconnect=" + this.mQuickReconnect + ", mAccsHeartbeatEnable=" + this.mAccsHeartbeatEnable + ", mPullUpEnable=" + this.mPullUpEnable + ", mForePingEnable=" + this.mForePingEnable + ", mPingTimeout=" + this.mPingTimeout + '}';
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccsClientConfig)) {
            return false;
        }
        AccsClientConfig accsClientConfig = (AccsClientConfig) obj;
        return this.mSecurity == accsClientConfig.mSecurity && this.mInappPubKey == accsClientConfig.mInappPubKey && this.mKeepalive == accsClientConfig.mKeepalive && this.mAutoUnit == accsClientConfig.mAutoUnit && this.mConfigEnv == accsClientConfig.mConfigEnv && this.mQuickReconnect == accsClientConfig.mQuickReconnect && this.mAccsHeartbeatEnable == accsClientConfig.mAccsHeartbeatEnable && this.mPullUpEnable == accsClientConfig.mPullUpEnable && this.mForePingEnable == accsClientConfig.mForePingEnable && this.mPingTimeout == accsClientConfig.mPingTimeout && o.a(this.mAppKey, accsClientConfig.mAppKey) && o.a(this.mAppSecret, accsClientConfig.mAppSecret) && o.a(this.mInappHost, accsClientConfig.mInappHost) && o.a(this.mStoreId, accsClientConfig.mStoreId) && o.a(this.mAuthCode, accsClientConfig.mAuthCode) && o.a(this.mTag, accsClientConfig.mTag);
    }

    public static void setAccsConfig(int i, AccsClientConfig accsClientConfig) {
        Map<String, AccsClientConfig> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941ff3ac", new Object[]{new Integer(i), accsClientConfig});
            return;
        }
        if (i == 1) {
            map = mPreviewConfigs;
        } else if (i == 2) {
            map = mDebugConfigs;
        } else {
            map = mReleaseConfigs;
        }
        AccsClientConfig accsClientConfig2 = map.get(accsClientConfig.getTag());
        if (accsClientConfig2 != null) {
            ALog.w(TAG, "build conver", "old config", accsClientConfig2);
        }
        map.put(accsClientConfig.getTag(), accsClientConfig);
    }

    /* loaded from: classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String connType;
        private String mAppKey = "";
        private String mTag = "";
        private String mAppSecret = "";
        private String mInappHost = "";
        private String mAuthCode = "";
        private String mStoreId = "";
        private int mInappPubKey = -1;
        private boolean mKeepalive = true;
        private boolean mAutoUnit = true;
        private int mConfigEnv = -1;
        private boolean mQuickReconnect = false;
        private boolean mAccsHeartbeatEnable = false;
        private boolean mPullUpEnable = true;
        private boolean mForePingEnable = false;
        private int mPingTimeout = 0;
        private int version = 1;
        private int mTriggerChannel = 0;

        static {
            kge.a(-221516256);
        }

        public int getVersion() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue() : this.version;
        }

        public Builder setVersion(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("947caa9f", new Object[]{this, new Integer(i)});
            }
            this.version = i;
            return this;
        }

        public String getConnType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc970a7d", new Object[]{this}) : this.connType;
        }

        public Builder setConnType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3af1c36c", new Object[]{this, str});
            }
            this.connType = str;
            return this;
        }

        public Builder setAppKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e2e3abf4", new Object[]{this, str});
            }
            this.mAppKey = str;
            return this;
        }

        public Builder setAppSecret(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f26753a5", new Object[]{this, str});
            }
            this.mAppSecret = str;
            return this;
        }

        public Builder setInappHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ccb8eed2", new Object[]{this, str});
            }
            this.mInappHost = str;
            return this;
        }

        public Builder setAutoCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ab85d0f6", new Object[]{this, str});
            }
            this.mAuthCode = str;
            return this;
        }

        public Builder setInappPubKey(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8a84e065", new Object[]{this, new Integer(i)});
            }
            this.mInappPubKey = i;
            return this;
        }

        public Builder setKeepAlive(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("17dbb9de", new Object[]{this, new Boolean(z)});
            }
            this.mKeepalive = z;
            return this;
        }

        public Builder setAutoUnit(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a044c7ed", new Object[]{this, new Boolean(z)});
            }
            this.mAutoUnit = z;
            return this;
        }

        public Builder setConfigEnv(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f20d7352", new Object[]{this, new Integer(i)});
            }
            this.mConfigEnv = i;
            return this;
        }

        public Builder setStoreId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("400b8d1a", new Object[]{this, str});
            }
            this.mStoreId = str;
            return this;
        }

        public Builder setTag(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6f80ac9c", new Object[]{this, str});
            }
            this.mTag = str;
            return this;
        }

        public Builder setQuickReconnect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("63f8a244", new Object[]{this, new Boolean(z)});
            }
            this.mQuickReconnect = z;
            return this;
        }

        public Builder setAccsHeartbeatEnable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e5e42283", new Object[]{this, new Boolean(z)});
            }
            this.mAccsHeartbeatEnable = z;
            return this;
        }

        public Builder setPullUpEnable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("267dfc7d", new Object[]{this, new Boolean(z)});
            }
            this.mPullUpEnable = z;
            return this;
        }

        public Builder setForePingEnable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ef9018b", new Object[]{this, new Boolean(z)});
            }
            this.mForePingEnable = z;
            return this;
        }

        public Builder setPingTimeout(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("bad31616", new Object[]{this, new Integer(i)});
            }
            this.mPingTimeout = i;
            return this;
        }

        public Builder setTriggerChannel(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b595c976", new Object[]{this, new Integer(i)});
            }
            this.mTriggerChannel = i;
            return this;
        }

        public AccsClientConfig build() throws AccsException {
            Map<String, AccsClientConfig> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccsClientConfig) ipChange.ipc$dispatch("89319e87", new Object[]{this});
            }
            if (StringUtils.isEmpty(this.mAppKey)) {
                throw new AccsException("appkey null");
            }
            AccsClientConfig accsClientConfig = new AccsClientConfig();
            AccsClientConfig.access$002(accsClientConfig, this.mAppKey);
            AccsClientConfig.access$102(accsClientConfig, this.mAppSecret);
            AccsClientConfig.access$202(accsClientConfig, this.mAuthCode);
            AccsClientConfig.access$302(accsClientConfig, this.mKeepalive);
            AccsClientConfig.access$402(accsClientConfig, this.mAutoUnit);
            AccsClientConfig.access$502(accsClientConfig, this.mInappPubKey);
            AccsClientConfig.access$602(accsClientConfig, this.mInappHost);
            AccsClientConfig.access$702(accsClientConfig, this.mTag);
            AccsClientConfig.access$802(accsClientConfig, this.mStoreId);
            AccsClientConfig.access$902(accsClientConfig, this.mConfigEnv);
            AccsClientConfig.access$1002(accsClientConfig, this.mQuickReconnect);
            AccsClientConfig.access$1102(accsClientConfig, this.mAccsHeartbeatEnable);
            AccsClientConfig.access$1202(accsClientConfig, this.mPullUpEnable);
            AccsClientConfig.access$1302(accsClientConfig, this.mForePingEnable);
            AccsClientConfig.access$1402(accsClientConfig, this.mPingTimeout);
            AccsClientConfig.access$1502(accsClientConfig, this.connType);
            AccsClientConfig.access$1602(accsClientConfig, this.version);
            NoTraceTriggerHelper.b = this.mTriggerChannel;
            if (AccsClientConfig.access$900(accsClientConfig) < 0) {
                AccsClientConfig.access$902(accsClientConfig, AccsClientConfig.mEnv);
            }
            if (StringUtils.isEmpty(AccsClientConfig.access$100(accsClientConfig))) {
                AccsClientConfig.access$1702(accsClientConfig, 0);
            } else {
                AccsClientConfig.access$1702(accsClientConfig, 2);
            }
            if (StringUtils.isEmpty(AccsClientConfig.access$600(accsClientConfig))) {
                AccsClientConfig.access$602(accsClientConfig, AccsClientConfig.DEFAULT_CENTER_HOSTS[AccsClientConfig.access$900(accsClientConfig)]);
            }
            if (StringUtils.isEmpty(AccsClientConfig.access$700(accsClientConfig))) {
                AccsClientConfig.access$702(accsClientConfig, "default");
            }
            int access$900 = AccsClientConfig.access$900(accsClientConfig);
            if (access$900 == 1) {
                map = AccsClientConfig.mPreviewConfigs;
            } else if (access$900 == 2) {
                map = AccsClientConfig.mDebugConfigs;
            } else {
                map = AccsClientConfig.mReleaseConfigs;
            }
            ALog.d(AccsClientConfig.TAG, CartRecommendRefreshScene.build, "config", accsClientConfig);
            AccsClientConfig accsClientConfig2 = map.get(accsClientConfig.getTag());
            if (accsClientConfig2 != null) {
                ALog.w(AccsClientConfig.TAG, "build conver", "old config", accsClientConfig2);
            }
            map.put(accsClientConfig.getTag(), accsClientConfig);
            return accsClientConfig;
        }
    }
}
