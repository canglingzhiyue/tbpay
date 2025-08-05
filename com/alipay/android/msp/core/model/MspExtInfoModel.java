package com.alipay.android.msp.core.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspExtInfoModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "VIData")
    private String VIData;
    private String ap_link_token;
    private Context context;
    private Device device;
    private Env env;
    private String insideEnv;
    private String lang;
    private String userToken;
    private String userTokenType;
    private String utdid;

    public String getVIData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60c5cd06", new Object[]{this}) : this.VIData;
    }

    public void setVIData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579dc130", new Object[]{this, str});
        } else {
            this.VIData = str;
        }
    }

    public String getAp_link_token() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("893befeb", new Object[]{this}) : this.ap_link_token;
    }

    public void setAp_link_token(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e1ef53", new Object[]{this, str});
        } else {
            this.ap_link_token = str;
        }
    }

    public Env getEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Env) ipChange.ipc$dispatch("4173cf5c", new Object[]{this}) : this.env;
    }

    public void setEnv(Env env) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("817a4abc", new Object[]{this, env});
        } else {
            this.env = env;
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6cfd041c", new Object[]{this}) : this.context;
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9b5838", new Object[]{this, context});
        } else {
            this.context = context;
        }
    }

    public Device getDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Device) ipChange.ipc$dispatch("7f6e8402", new Object[]{this}) : this.device;
    }

    public void setDevice(Device device) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34c307e", new Object[]{this, device});
        } else {
            this.device = device;
        }
    }

    public String getUserTokenType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2c34a0a7", new Object[]{this}) : this.userTokenType;
    }

    public void setUserTokenType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eff5617", new Object[]{this, str});
        } else {
            this.userTokenType = str;
        }
    }

    public String getUserToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3254cbc1", new Object[]{this}) : this.userToken;
    }

    public void setUserToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a82683d", new Object[]{this, str});
        } else {
            this.userToken = str;
        }
    }

    public String getInsideEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dea54d3e", new Object[]{this}) : this.insideEnv;
    }

    public void setInsideEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78421660", new Object[]{this, str});
        } else {
            this.insideEnv = str;
        }
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : this.utdid;
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.utdid = str;
        }
    }

    public String getLang() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cae65b15", new Object[]{this}) : this.lang;
    }

    public void setLang(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26644801", new Object[]{this, str});
        } else {
            this.lang = str;
        }
    }

    /* loaded from: classes3.dex */
    public static class Env {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String alipayTopAppId;
        private boolean fromWallet;
        private String invokeFromApi;
        private String invokeFromAppName;
        private String invokeFromAppSign;
        private String invokeFromClientAppId;
        private String invokeFromReferUrl;
        private String invokeFromSource;
        private String supported3rdPay;

        public String getInvokeFromApi() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("17977177", new Object[]{this}) : this.invokeFromApi;
        }

        public void setInvokeFromApi(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff69f47", new Object[]{this, str});
            } else {
                this.invokeFromApi = str;
            }
        }

        public String getInvokeFromSource() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3678ee66", new Object[]{this}) : this.invokeFromSource;
        }

        public void setInvokeFromSource(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4e76cd0", new Object[]{this, str});
            } else {
                this.invokeFromSource = str;
            }
        }

        public String getInvokeFromClientAppId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("681341e0", new Object[]{this}) : this.invokeFromClientAppId;
        }

        public void setInvokeFromClientAppId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0b027fe", new Object[]{this, str});
            } else {
                this.invokeFromClientAppId = str;
            }
        }

        public String getInvokeFromReferUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5fff432", new Object[]{this}) : this.invokeFromReferUrl;
        }

        public void setInvokeFromReferUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd04d84", new Object[]{this, str});
            } else {
                this.invokeFromReferUrl = str;
            }
        }

        public String getInvokeFromAppName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6c285", new Object[]{this}) : this.invokeFromAppName;
        }

        public void setInvokeFromAppName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fa095f9", new Object[]{this, str});
            } else {
                this.invokeFromAppName = str;
            }
        }

        public String getInvokeFromAppSign() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a73eb293", new Object[]{this}) : this.invokeFromAppSign;
        }

        public void setInvokeFromAppSign(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e16a7ab", new Object[]{this, str});
            } else {
                this.invokeFromAppSign = str;
            }
        }

        public String getSupported3rdPay() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be70491e", new Object[]{this}) : this.supported3rdPay;
        }

        public void setSupported3rdPay(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9c0af80", new Object[]{this, str});
            } else {
                this.supported3rdPay = str;
            }
        }

        public boolean isFromWallet() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a09ea318", new Object[]{this})).booleanValue() : this.fromWallet;
        }

        public void setFromWallet(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fa96c08", new Object[]{this, new Boolean(z)});
            } else {
                this.fromWallet = z;
            }
        }

        public String getAlipayTopAppId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2ed1132", new Object[]{this}) : this.alipayTopAppId;
        }

        public void setAlipayTopAppId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b813684", new Object[]{this, str});
            } else {
                this.alipayTopAppId = str;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Context {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String codeExtInfo;
        private String expDisableConfig;
        private String tcVerifyToken;
        private String terminalCustomInfo;
        private String terminalSource;

        public String getExpDisableConfig() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2ae51a36", new Object[]{this}) : this.expDisableConfig;
        }

        public void setExpDisableConfig(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e00bb00", new Object[]{this, str});
            } else {
                this.expDisableConfig = str;
            }
        }

        public String getCodeExtInfo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc5277ed", new Object[]{this}) : this.codeExtInfo;
        }

        public void setCodeExtInfo(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5b3b491", new Object[]{this, str});
            } else {
                this.codeExtInfo = str;
            }
        }

        public String getTcVerifyToken() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6d11f67e", new Object[]{this}) : this.tcVerifyToken;
        }

        public void setTcVerifyToken(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69ccbb20", new Object[]{this, str});
            } else {
                this.tcVerifyToken = str;
            }
        }

        public String getTerminalCustomInfo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc4cb248", new Object[]{this}) : this.terminalCustomInfo;
        }

        public void setTerminalCustomInfo(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("211b522e", new Object[]{this, str});
            } else {
                this.terminalCustomInfo = str;
            }
        }

        public String getTerminalSource() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1702266c", new Object[]{this}) : this.terminalSource;
        }

        public void setTerminalSource(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da0ec88a", new Object[]{this, str});
            } else {
                this.terminalSource = str;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Device {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean accessibility;
        private boolean agednessVersion;
        private String appMode;
        private String brand;
        private String cpuCore;
        private String density;
        private String drmVersion;
        private boolean foldable;
        private boolean lowPerf;
        private String model;
        private boolean pad;
        private String screenHeight;
        private String screenWidth;

        public String getScreenWidth() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("443ea1f5", new Object[]{this}) : this.screenWidth;
        }

        public void setScreenWidth(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b4ccb89", new Object[]{this, str});
            } else {
                this.screenWidth = str;
            }
        }

        public String getScreenHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2316a370", new Object[]{this}) : this.screenHeight;
        }

        public void setScreenHeight(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d05c3f06", new Object[]{this, str});
            } else {
                this.screenHeight = str;
            }
        }

        public String getCpuCore() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f03a68", new Object[]{this}) : this.cpuCore;
        }

        public void setCpuCore(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b1a9b76", new Object[]{this, str});
            } else {
                this.cpuCore = str;
            }
        }

        public String getDensity() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f2f2187", new Object[]{this}) : this.density;
        }

        public void setDensity(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7db89837", new Object[]{this, str});
            } else {
                this.density = str;
            }
        }

        public boolean isLowPerf() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("71866ade", new Object[]{this})).booleanValue() : this.lowPerf;
        }

        public void setLowPerf(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83e43e72", new Object[]{this, new Boolean(z)});
            } else {
                this.lowPerf = z;
            }
        }

        public boolean isAgednessVersion() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("563f931d", new Object[]{this})).booleanValue() : this.agednessVersion;
        }

        public void setAgednessVersion(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b87d6613", new Object[]{this, new Boolean(z)});
            } else {
                this.agednessVersion = z;
            }
        }

        public String getDrmVersion() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a140c2a", new Object[]{this}) : this.drmVersion;
        }

        public void setDrmVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f57008c", new Object[]{this, str});
            } else {
                this.drmVersion = str;
            }
        }

        public boolean isFoldable() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6ac4a30", new Object[]{this})).booleanValue() : this.foldable;
        }

        public void setFoldable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd479f0", new Object[]{this, new Boolean(z)});
            } else {
                this.foldable = z;
            }
        }

        public boolean isAccessibility() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8d12dacf", new Object[]{this})).booleanValue() : this.accessibility;
        }

        public void setAccessibility(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed2282a1", new Object[]{this, new Boolean(z)});
            } else {
                this.accessibility = z;
            }
        }

        public String getAppMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3a3c2c8b", new Object[]{this}) : this.appMode;
        }

        public void setAppMode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("144cedb3", new Object[]{this, str});
            } else {
                this.appMode = str;
            }
        }

        public boolean isPad() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad47fb14", new Object[]{this})).booleanValue() : this.pad;
        }

        public void setPad(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a19310fc", new Object[]{this, new Boolean(z)});
            } else {
                this.pad = z;
            }
        }

        public String getBrand() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("935139c8", new Object[]{this}) : this.brand;
        }

        public void setBrand(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83ae9516", new Object[]{this, str});
            } else {
                this.brand = str;
            }
        }

        public String getModel() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a78b0366", new Object[]{this}) : this.model;
        }

        public void setModel(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6adff38", new Object[]{this, str});
            } else {
                this.model = str;
            }
        }
    }
}
