package com.ali.user.mobile.info;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.harmony.i.IHarmonyLoginBackup;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.utils.NetworkUtil;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.init.loginbar.LoginBarController;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.ut.device.UTDevice;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
public class AppInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INITED_ACTION = "com.ali.user.sdk.biz.inited.action";
    public static final String INIT_TAG = "init.login-tag";
    private static AppInfo INSTANCE = null;
    private static final String TAG = "login.AppInfo";
    private boolean isRoot = false;
    private String mAppVersion;
    private String mUmidToken;
    private String mUtdid;

    static {
        kge.a(-824944874);
    }

    public static /* synthetic */ String access$000(AppInfo appInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5ceaed0", new Object[]{appInfo}) : appInfo.mUmidToken;
    }

    public static /* synthetic */ String access$002(AppInfo appInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10d6d884", new Object[]{appInfo, str});
        }
        appInfo.mUmidToken = str;
        return str;
    }

    private AppInfo() {
    }

    public void init(DataCallback<String> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60a6159", new Object[]{this, dataCallback});
            return;
        }
        LoginTLogAdapter.trace("init.login-tag", "AppInfo init: start");
        try {
            if (StringUtils.isEmpty(this.mUtdid)) {
                this.mUtdid = UTDevice.getUtdid(DataProviderFactory.getApplicationContext());
            }
            this.isRoot = NetworkUtil.isSuEnable();
            Properties properties = new Properties();
            properties.setProperty("isRoot", String.valueOf(this.isRoot));
            UserTrackAdapter.sendUT("isRoot", properties);
            generateUmidToken(dataCallback);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        LoginTLogAdapter.trace("init.login-tag", "AppInfo init: end");
    }

    public static synchronized AppInfo getInstance() {
        synchronized (AppInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AppInfo) ipChange.ipc$dispatch("7fb73dd", new Object[0]);
            }
            if (INSTANCE == null) {
                INSTANCE = new AppInfo();
            }
            return INSTANCE;
        }
    }

    public String getSdkVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a69c45", new Object[]{this});
        }
        String str = "6.4.3";
        if (!StringUtils.isEmpty(str)) {
            String[] split = str.split("-");
            if (split != null && split.length > 0) {
                str = split[0];
                if (!StringUtils.isEmpty(str)) {
                    String[] split2 = str.split("_");
                    if (split2 != null && split2.length > 0) {
                        str = split2[0];
                    }
                }
            }
            str = "";
        }
        if (StringUtils.isEmpty(str)) {
            str = "5.3.15";
        }
        return "android_" + str;
    }

    public boolean isRoot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue() : this.isRoot;
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        if (!StringUtils.isEmpty(DataProviderFactory.getDataProvider().getUtdid())) {
            return DataProviderFactory.getDataProvider().getUtdid();
        }
        if (this.mUtdid == null) {
            this.mUtdid = UTDevice.getUtdid(DataProviderFactory.getApplicationContext());
        }
        String str = this.mUtdid;
        return str == null ? "" : str;
    }

    public String getUmidToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db4aa3a9", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.mUmidToken)) {
            generateUmidToken(null);
        }
        return this.mUmidToken;
    }

    public void setUmidToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10478d55", new Object[]{this, str});
            return;
        }
        this.mUmidToken = str;
        IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
        if (harmonyLoginBackup == null) {
            return;
        }
        harmonyLoginBackup.backupUmidToken(this.mUmidToken, null);
    }

    public void getUmidToken(DataCallback<String> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62664119", new Object[]{this, dataCallback});
        } else if (StringUtils.isEmpty(this.mUmidToken)) {
            generateUmidToken(dataCallback);
            UserTrackAdapter.sendUT("Event_InitApdidToken");
        } else {
            dataCallback.result(this.mUmidToken);
        }
    }

    private void generateUmidToken(final DataCallback<String> dataCallback) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edefde38", new Object[]{this, dataCallback});
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ali.user.mobile.info.AppInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                DataCallback dataCallback2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!atomicBoolean.compareAndSet(false, true) || (dataCallback2 = dataCallback) == null) {
                } else {
                    dataCallback2.result(AppInfo.access$000(AppInfo.this));
                }
            }
        }, 2000L);
        int envType = DataProviderFactory.getDataProvider().getEnvType();
        if (envType != 0 && envType != 1 && (envType == 2 || envType == 3 || envType != 4)) {
            i = 0;
        }
        SecurityGuardManager securityGuardManager = SecurityGuardManagerWraper.getSecurityGuardManager();
        if (securityGuardManager == null) {
            if (dataCallback == null) {
                return;
            }
            dataCallback.result(this.mUmidToken);
            return;
        }
        IUMIDComponent uMIDComp = securityGuardManager.getUMIDComp();
        if (uMIDComp == null) {
            if (dataCallback == null) {
                return;
            }
            dataCallback.result(this.mUmidToken);
            return;
        }
        try {
            uMIDComp.initUMID(i, new IUMIDInitListenerEx() { // from class: com.ali.user.mobile.info.AppInfo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx
                public void onUMIDInitFinishedEx(String str, int i2) {
                    DataCallback dataCallback2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1c2fc40b", new Object[]{this, str, new Integer(i2)});
                        return;
                    }
                    if (i2 == 200) {
                        AppInfo.access$002(AppInfo.this, str);
                        if (LoginSwitch.isInABTestRegion("clearCacheGetUmid", 10000)) {
                            LoginTLogAdapter.e(LoginBarController.TAG, "clearCacheData");
                            AliUserLogin.clearCacheData("getAppLaunch_first");
                        }
                        IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
                        if (harmonyLoginBackup != null) {
                            harmonyLoginBackup.backupUmidToken(AppInfo.access$000(AppInfo.this), null);
                        }
                    } else {
                        UserTrackAdapter.sendUT("initUMID_failure", i2 + "");
                    }
                    LoginTLogAdapter.e(AppInfo.TAG, "resultCode=" + i2 + " onInitFinished umidToken = " + str);
                    if (!atomicBoolean.compareAndSet(false, true) || (dataCallback2 = dataCallback) == null) {
                        return;
                    }
                    dataCallback2.result(AppInfo.access$000(AppInfo.this));
                }
            });
        } catch (SecException e) {
            UserTrackAdapter.sendUT("initUMID_failure", e.getErrorCode() + "");
            if (dataCallback == null) {
                return;
            }
            dataCallback.result(this.mUmidToken);
        }
    }

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        if (this.mAppVersion == null) {
            try {
                PackageInfo packageInfo = DataProviderFactory.getApplicationContext().getPackageManager().getPackageInfo(DataProviderFactory.getApplicationContext().getPackageName(), 0);
                if (packageInfo != null) {
                    this.mAppVersion = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.mAppVersion;
    }

    public String getAndroidAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28488a69", new Object[]{this});
        }
        return "android_" + getAppVersion();
    }

    public String getLocale() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3440efa9", new Object[]{this}) : Locale.getDefault().getCountry();
    }
}
