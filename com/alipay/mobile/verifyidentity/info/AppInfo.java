package com.alipay.mobile.verifyidentity.info;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.uitl.PlatformUtils;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AppInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5870a = "AppInfo";
    private static volatile AppInfo b;
    private static Map<String, String> e;
    private AppDataProvider c;
    private AppDataProvider d = new AppDataProvider() { // from class: com.alipay.mobile.verifyidentity.info.AppInfo.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getAppName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
            }
            Context context = MicroModuleContext.getInstance().getContext();
            if (context == null) {
                VerifyLogCat.e(AppInfo.access$000(), "getAppName failed!");
                return "";
            }
            return context.getPackageName();
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getAppVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
            }
            Context context = MicroModuleContext.getInstance().getContext();
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Throwable th) {
                VerifyLogCat.e(AppInfo.access$000(), th);
                return "";
            }
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getApdid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a23faff", new Object[]{this});
            }
            String apdid = PlatformUtils.getApdid(MicroModuleContext.getInstance().getContext());
            String access$000 = AppInfo.access$000();
            VerifyLogCat.i(access$000, "apdid: " + apdid);
            return apdid;
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getApdidToken() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e63dfe7a", new Object[]{this});
            }
            String apdidToken = PlatformUtils.getApdidToken(MicroModuleContext.getInstance().getContext());
            String access$000 = AppInfo.access$000();
            VerifyLogCat.i(access$000, "apdidToken: " + apdidToken);
            return apdidToken;
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getTid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this});
            }
            String tid = VIUtils.getTid();
            String access$000 = AppInfo.access$000();
            VerifyLogCat.i(access$000, "tid: " + tid);
            return tid;
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getAppKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
            }
            Context context = MicroModuleContext.getInstance().getContext();
            if (context == null) {
                VerifyLogCat.e(AppInfo.access$000(), "can't get Default AppKey because context is null! ");
                return "";
            }
            String str = (String) AppInfo.access$100().get(context.getPackageName());
            String access$000 = AppInfo.access$000();
            VerifyLogCat.i(access$000, "Default AppKey for this app: " + str);
            return str;
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getUmidToken() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("db4aa3a9", new Object[]{this});
            }
            String umidToken = PlatformUtils.getUmidToken(MicroModuleContext.getInstance().getContext());
            String access$000 = AppInfo.access$000();
            VerifyLogCat.i(access$000, "兜底umidToken: " + umidToken);
            return umidToken;
        }
    };

    public String getDeviceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("37b43413", new Object[]{this}) : "android";
    }

    public String getViSdkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41802492", new Object[]{this}) : CommonConstant.VI_SDK_VERSION;
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f5870a;
    }

    public static /* synthetic */ Map access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]) : e;
    }

    public static AppInfo getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfo) ipChange.ipc$dispatch("57b4fd93", new Object[0]);
        }
        if (b == null) {
            synchronized (AppInfo.class) {
                if (b == null) {
                    b = new AppInfo();
                }
            }
        }
        return b;
    }

    public void setDataProvider(AppDataProvider appDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ca9a53", new Object[]{this, appDataProvider});
        } else {
            this.c = appDataProvider;
        }
    }

    public String getAppName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.c;
        if (appDataProvider != null && !StringUtils.isEmpty(appDataProvider.getAppName())) {
            return this.c.getAppName();
        }
        return this.d.getAppName();
    }

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.c;
        if (appDataProvider != null && !StringUtils.isEmpty(appDataProvider.getAppVersion())) {
            return this.c.getAppVersion();
        }
        return this.d.getAppVersion();
    }

    public String getApdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a23faff", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.c;
        if (appDataProvider != null && !StringUtils.isEmpty(appDataProvider.getApdid())) {
            return this.c.getApdid();
        }
        return this.d.getApdid();
    }

    public String getApdidToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e63dfe7a", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.c;
        if (appDataProvider != null && !StringUtils.isEmpty(appDataProvider.getApdidToken())) {
            return this.c.getApdidToken();
        }
        return this.d.getApdidToken();
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this}) : this.d.getTid();
    }

    public String getMspTid() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa3c6e3e", new Object[]{this});
        }
        try {
            context = MicroModuleContext.getInstance().getContext();
            VerifyLogCat.i(f5870a, "loadTID getmspTio");
        } catch (Throwable th) {
            String str = f5870a;
            VerifyLogCat.i(str, "get loadTID error:" + th.getMessage());
        }
        if (context == null) {
            VerifyLogCat.e(f5870a, "loadTID failed!");
            return "";
        }
        VerifyLogCat.i(f5870a, "get loadTID start");
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.android.msp.framework.helper.TidHelper", "loadTID", new Class[]{Context.class}, new Object[]{context});
        if (invokeStaticMethod != null) {
            VerifyLogCat.i(f5870a, "get loadTID not null");
            Object invokeMethod = ReflectUtils.invokeMethod(invokeStaticMethod, "getTid");
            if (invokeMethod != null) {
                String str2 = f5870a;
                VerifyLogCat.i(str2, "get loadTID :" + String.valueOf(invokeMethod));
                return String.valueOf(invokeMethod);
            }
        }
        return "";
    }

    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.c;
        if (appDataProvider != null && !StringUtils.isEmpty(appDataProvider.getAppKey())) {
            return this.c.getAppKey();
        }
        return this.d.getAppKey();
    }

    public String getUmidToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db4aa3a9", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.c;
        if (appDataProvider != null && !StringUtils.isEmpty(appDataProvider.getUmidToken())) {
            return this.c.getUmidToken();
        }
        return this.d.getUmidToken();
    }

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("com.taobao.mobile.dipei", "21533232");
        e.put("com.alipay.m.portal", "23189718");
        e.put(MspGlobalDefine.PACKAGE_AFWEALTH, "23181530");
        e.put("com.antfortune.wealthrc", "23181530");
        e.put("com.eg.android.AlipayGphone", "12501616");
        e.put("com.eg.android.AlipayGphoneRC", "12501616");
    }
}
