package com.ali.user.mobile.info;

import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.alipay.apmobilesecuritysdk.face.APSecDirInterface;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.face.IDeviceInfo;
import com.alipay.apmobilesecuritysdk.face.IPermissionInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.io.File;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class AlipayInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static AlipayInfo INSTANCE = null;
    private static final String TAG = "login.AlipayInfo";
    private APSecuritySdk alipaySecuritySdk;
    private String mApdid;
    private String mApdidToken;

    static {
        kge.a(-907510767);
    }

    private int getEnvModeConfig(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf31c8f3", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 1) {
            return 1;
        }
        return i != 2 ? 0 : 2;
    }

    public static /* synthetic */ String access$002(AlipayInfo alipayInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("810b01ff", new Object[]{alipayInfo, str});
        }
        alipayInfo.mApdid = str;
        return str;
    }

    public static /* synthetic */ String access$100(AlipayInfo alipayInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df397dc8", new Object[]{alipayInfo}) : alipayInfo.mApdidToken;
    }

    public static /* synthetic */ String access$102(AlipayInfo alipayInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8833e440", new Object[]{alipayInfo, str});
        }
        alipayInfo.mApdidToken = str;
        return str;
    }

    private AlipayInfo() {
    }

    public static synchronized AlipayInfo getInstance() {
        synchronized (AlipayInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AlipayInfo) ipChange.ipc$dispatch("49d57b52", new Object[0]);
            }
            if (INSTANCE == null) {
                INSTANCE = new AlipayInfo();
            }
            return INSTANCE;
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            try {
                if (needInject()) {
                    LoginTLogAdapter.trace(TAG, "inject alipay sec info");
                    APSecuritySdk.registerDeviceInfo(new IDeviceInfo() { // from class: com.ali.user.mobile.info.AlipayInfo.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.apmobilesecuritysdk.face.IDeviceInfo
                        public String getAndroidId() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (String) ipChange2.ipc$dispatch("3b8fe645", new Object[]{this});
                            }
                            return null;
                        }

                        @Override // com.alipay.apmobilesecuritysdk.face.IDeviceInfo
                        public String getHardwareAddress() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("10ccf203", new Object[]{this}) : "";
                        }

                        @Override // com.alipay.apmobilesecuritysdk.face.IDeviceInfo
                        public String getImei() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("7fb5387b", new Object[]{this}) : "";
                        }

                        @Override // com.alipay.apmobilesecuritysdk.face.IDeviceInfo
                        public String getSubscriberId() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9ede3a80", new Object[]{this}) : "";
                        }
                    });
                    APSecuritySdk.registerDirGetter(new APSecDirInterface() { // from class: com.ali.user.mobile.info.AlipayInfo.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.apmobilesecuritysdk.face.APSecDirInterface
                        public File getExternalStorageDirectory() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (File) ipChange2.ipc$dispatch("f15f32b3", new Object[]{this});
                            }
                            return null;
                        }

                        @Override // com.alipay.apmobilesecuritysdk.face.APSecDirInterface
                        public String getExternalStorageState() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (String) ipChange2.ipc$dispatch("53e9d4a2", new Object[]{this});
                            }
                            return null;
                        }
                    });
                    APSecuritySdk.registerPermissionInfo(new IPermissionInfo() { // from class: com.ali.user.mobile.info.AlipayInfo.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.apmobilesecuritysdk.face.IPermissionInfo
                        public boolean canGetLocation() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("a36e7246", new Object[]{this})).booleanValue();
                            }
                            return false;
                        }
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.alipaySecuritySdk = APSecuritySdk.getInstance(DataProviderFactory.getApplicationContext());
            initApdid();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean needInject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("493d1ed2", new Object[]{this})).booleanValue() : DataProviderFactory.getApplicationContext().getSharedPreferences("login_alipay_security", 0).getBoolean("alipay_security_inject_enabled", true);
    }

    private void initApdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fbdcf47", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.mApdid)) {
        } else {
            generateAlipayTokens(null);
        }
    }

    public String getApdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a23faff", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mApdid) && this.alipaySecuritySdk != null) {
            generateAlipayTokens(null);
        }
        return this.mApdid;
    }

    public String getApdidToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e63dfe7a", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mApdidToken) && this.alipaySecuritySdk != null) {
            generateAlipayTokens(null);
            UserTrackAdapter.sendUT("Event_InitApdidToken");
        }
        LoginTLogAdapter.e(TAG, "mApdidToken=" + this.mApdidToken);
        return this.mApdidToken;
    }

    public void getApdidToken(DataCallback<String> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eabc8aa", new Object[]{this, dataCallback});
        } else if (TextUtils.isEmpty(this.mApdidToken)) {
            if (this.alipaySecuritySdk == null) {
                try {
                    this.alipaySecuritySdk = APSecuritySdk.getInstance(DataProviderFactory.getApplicationContext());
                } catch (Throwable th) {
                    th.printStackTrace();
                    LoginTLogAdapter.e(TAG, th.getMessage());
                }
            }
            generateAlipayTokens(dataCallback);
            UserTrackAdapter.sendUT("Event_InitApdidToken");
        } else {
            dataCallback.result(this.mApdidToken);
        }
    }

    private void generateAlipayTokens(final DataCallback<String> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705ce8b0", new Object[]{this, dataCallback});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("utdid", AppInfo.getInstance().getUtdid());
            int envModeConfig = getEnvModeConfig(DataProviderFactory.getDataProvider().getEnvType());
            if (this.alipaySecuritySdk != null) {
                LoginTLogAdapter.e(TAG, "generateAlipayTokens");
                this.alipaySecuritySdk.initToken(envModeConfig, hashMap, new APSecuritySdk.InitResultListener() { // from class: com.ali.user.mobile.info.AlipayInfo.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
                    public void onResult(APSecuritySdk.TokenResult tokenResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6ac8d236", new Object[]{this, tokenResult});
                            return;
                        }
                        if (tokenResult != null) {
                            AlipayInfo.access$002(AlipayInfo.this, tokenResult.apdid);
                            AlipayInfo.access$102(AlipayInfo.this, tokenResult.apdidToken);
                        } else {
                            LoginTLogAdapter.e(AlipayInfo.TAG, "generateAlipayTokens Failed!");
                        }
                        DataCallback dataCallback2 = dataCallback;
                        if (dataCallback2 == null) {
                            return;
                        }
                        dataCallback2.result(AlipayInfo.access$100(AlipayInfo.this));
                    }
                });
                LoginTLogAdapter.e(TAG, "init mApdid=" + this.mApdid);
                return;
            }
            LoginTLogAdapter.e(TAG, "generateAlipayTokens Failed: alipaySecuritySdk null");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
