package com.alipay.security.mobile.api;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.security.mobile.agent.AuthenticatorLock;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.alipay.security.mobile.util.LogCollect;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* loaded from: classes3.dex */
public class AuthenticatorApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int TYPE_FINGERPRINT = Constants.TYPE_FINGERPRINT;
    public static int TYPE_BRACELET = Constants.TYPE_BRACELET;
    public static int sSystemFingerPrintNumber = 0;
    public static int sSystemFaceNumber = 0;
    private static String sCacheAAID = "";
    private static String sSecDataCache = "";
    private static long sSecDataValid = 0;

    /* loaded from: classes3.dex */
    public static class FpServiceErrItem {
        public String err;
        public String errLog;
        public String extend;
        public String func;

        public FpServiceErrItem(String str, String str2, String str3, String str4) {
            this.func = str == null ? "" : str;
            this.err = str2 == null ? "" : str2;
            this.errLog = str3 == null ? "" : str3;
            this.extend = str4 == null ? "" : str4;
        }
    }

    private static BICDataModel getAuthModelByAuthType(Context context, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BICDataModel) ipChange.ipc$dispatch("64631c8b", new Object[]{context, new Integer(i), new Integer(i2), str});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            Context applicationContext = context.getApplicationContext();
            try {
                IAuthenticator create = create(applicationContext, i);
                int init = create.init(applicationContext, new AuthenticatorCallback() { // from class: com.alipay.security.mobile.api.AuthenticatorApi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                    public void callback(AuthenticatorResponse authenticatorResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                        }
                    }
                }, str);
                if (init != 111 && init != 105 && init != 106 && init != 126) {
                    if (i == 1) {
                        sSystemFingerPrintNumber = create.registedFingerPrintNumber();
                    }
                    if (i == Constants.TYPE_FACE) {
                        sSystemFaceNumber = create.registedFingerPrintNumber();
                    }
                    AuthInfo authInfo = create.getAuthInfo();
                    String deviceId = create.getDeviceId();
                    int checkUserStatus = !CommonUtils.isBlank(str) ? create.checkUserStatus(str) : 2;
                    int i3 = init == 127 ? 5 : 6;
                    int parseInt = Integer.parseInt(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_IFAA_DI_MAX_LENGTH, "100"));
                    if (parseInt > 0 && (StringUtils.isEmpty(deviceId) || deviceId.length() > parseInt)) {
                        TrackEvent.getIns().event(null, "di为空 或者 di超长,替换为\"null\"占位");
                        deviceId = "null";
                    }
                    return new BICDataModel(checkUserStatus, authInfo.getType(), i2, authInfo.getProtocolType(), authInfo.getProtocolVersion(), authInfo.getVendor(), i3, deviceId, authInfo.getPhoneModle());
                }
                return null;
            } catch (Exception unused) {
                TrackEvent.getIns().event(null, "AuthenticatorApi :: getAuthModelByAuthType error!");
                return null;
            }
        }
    }

    public static String getRegAuthData(Context context, int i, int i2, String str) {
        String secData2Json;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cb5d025", new Object[]{context, new Integer(i), new Integer(i2), str});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            AuthenticatorLOG.fpInfo("getRegAuthData enter [userID:" + str + riy.ARRAY_END_STR);
            long currentTimeMillis = System.currentTimeMillis();
            Context applicationContext = context.getApplicationContext();
            ArrayList arrayList = new ArrayList();
            BICDataModel authModelByAuthType = getAuthModelByAuthType(applicationContext, 1, 0, str);
            buildBiModel(applicationContext, authModelByAuthType, false);
            if (authModelByAuthType != null) {
                arrayList.add(authModelByAuthType);
            }
            BICDataModel authModelByAuthType2 = getAuthModelByAuthType(applicationContext, Constants.TYPE_FACE, 0, str);
            buildFaceBiModel(authModelByAuthType2, false);
            if (authModelByAuthType2 != null) {
                arrayList.add(authModelByAuthType2);
            }
            BICDataModel authModelByAuthType3 = getAuthModelByAuthType(applicationContext, 2, 1, str);
            if (authModelByAuthType3 != null) {
                arrayList.add(authModelByAuthType3);
            }
            if (authModelByAuthType3 != null) {
                arrayList.add(new BICDataModel(authModelByAuthType3.getClientStatus(), 2, 2, authModelByAuthType3.getProtocalType(), authModelByAuthType3.getProtocalVersion(), authModelByAuthType3.getVendor(), authModelByAuthType3.getServiceVersion(), authModelByAuthType3.getDeviceId(), authModelByAuthType3.getPhoneModel()));
            }
            secData2Json = BICDataUtil.secData2Json(arrayList, applicationContext);
            AuthenticatorLOG.fpInfo("getRegAuthData exit [result:" + secData2Json + "] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + riy.ARRAY_END_STR);
        }
        return secData2Json;
    }

    public static String getFpAAID(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2831e25a", new Object[]{context});
        }
        if (!CommonUtils.isBlank(sCacheAAID)) {
            AuthenticatorLOG.fpInfo("getFpAAID exit [cache result:" + sCacheAAID + riy.ARRAY_END_STR);
            return sCacheAAID;
        }
        String deviceMode = AuthenticatorFactory.getDeviceMode(context);
        sCacheAAID = deviceMode;
        if (deviceMode != null) {
            sCacheAAID = sCacheAAID.replace("-", "#");
        }
        AuthenticatorLOG.fpInfo("getFpAAID exit [new result:" + sCacheAAID + riy.ARRAY_END_STR);
        return sCacheAAID;
    }

    public static String getPayAuthData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9116059", new Object[]{context, str});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            AuthenticatorLOG.fpInfo("getPayAuthData enter [userID:" + str + riy.ARRAY_END_STR);
            long currentTimeMillis = System.currentTimeMillis();
            if (!CommonUtils.isBlank(sSecDataCache) && sSecDataValid > System.currentTimeMillis()) {
                AuthenticatorLOG.fpInfo("getPayAuthData exit [result:" + sSecDataCache + "] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + riy.ARRAY_END_STR);
                return sSecDataCache;
            }
            Context applicationContext = context.getApplicationContext();
            ArrayList arrayList = new ArrayList();
            BICDataModel authModelByAuthType = getAuthModelByAuthType(applicationContext, 1, 0, str);
            buildBiModel(applicationContext, authModelByAuthType, false);
            if (authModelByAuthType != null) {
                arrayList.add(authModelByAuthType);
            }
            BICDataModel authModelByAuthType2 = getAuthModelByAuthType(applicationContext, Constants.TYPE_FACE, 0, str);
            buildFaceBiModel(authModelByAuthType2, true);
            if (authModelByAuthType2 != null) {
                arrayList.add(authModelByAuthType2);
            }
            BICDataModel authModelByAuthType3 = getAuthModelByAuthType(applicationContext, 2, 0, str);
            if (authModelByAuthType3 != null && authModelByAuthType3.getClientStatus() == 2) {
                arrayList.add(authModelByAuthType3);
            }
            sSecDataCache = BICDataUtil.secData2Json(arrayList, applicationContext);
            sSecDataValid = System.currentTimeMillis() + 5000;
            AuthenticatorLOG.fpInfo("getPayAuthData exit [result:" + sSecDataCache + "] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + riy.ARRAY_END_STR);
            return sSecDataCache;
        }
    }

    public static String getFastPayAuthDataWithNoLog(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bdfc5aca", new Object[]{context, str}) : getFastPayAuthData(context, str);
    }

    public static String getFastPayAuthData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f0d095d", new Object[]{context, str});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            AuthenticatorLOG.fpInfo("getFastPayAuthData enter [userID:" + str + riy.ARRAY_END_STR);
            long currentTimeMillis = System.currentTimeMillis();
            if (!CommonUtils.isBlank(sSecDataCache) && sSecDataValid > System.currentTimeMillis()) {
                return sSecDataCache;
            }
            Context applicationContext = context.getApplicationContext();
            ArrayList arrayList = new ArrayList();
            BICDataModel authModelByAuthType = getAuthModelByAuthType(applicationContext, 1, 0, null);
            buildBiModel(applicationContext, authModelByAuthType, false);
            if (authModelByAuthType != null) {
                arrayList.add(authModelByAuthType);
            }
            BICDataModel authModelByAuthType2 = getAuthModelByAuthType(applicationContext, Constants.TYPE_FACE, 0, str);
            buildFaceBiModel(authModelByAuthType2, true);
            if (authModelByAuthType2 != null) {
                arrayList.add(authModelByAuthType2);
            }
            BICDataModel authModelByAuthType3 = getAuthModelByAuthType(applicationContext, 2, 0, str);
            if (authModelByAuthType3 != null && authModelByAuthType3.getClientStatus() == 2) {
                arrayList.add(authModelByAuthType3);
            }
            sSecDataCache = BICDataUtil.secData2Json(arrayList, applicationContext);
            sSecDataValid = System.currentTimeMillis() + 5000;
            AuthenticatorLOG.fpInfo("getFastPayAuthData exit [result:" + sSecDataCache + "] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + riy.ARRAY_END_STR);
            return sSecDataCache;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x0020, B:10:0x002a, B:12:0x0034, B:14:0x003a, B:16:0x0042, B:18:0x0048, B:20:0x0051, B:25:0x005a, B:28:0x0060, B:30:0x0066, B:33:0x006e, B:31:0x0069, B:32:0x006c), top: B:38:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x0020, B:10:0x002a, B:12:0x0034, B:14:0x003a, B:16:0x0042, B:18:0x0048, B:20:0x0051, B:25:0x005a, B:28:0x0060, B:30:0x0066, B:33:0x006e, B:31:0x0069, B:32:0x006c), top: B:38:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void buildBiModel(android.content.Context r6, com.alipay.security.mobile.api.BICDataModel r7, boolean r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.security.mobile.api.AuthenticatorApi.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r1[r3] = r7
            r6 = 2
            java.lang.Boolean r7 = new java.lang.Boolean
            r7.<init>(r8)
            r1[r6] = r7
            java.lang.String r6 = "6224decd"
            r0.ipc$dispatch(r6, r1)
            return
        L1d:
            if (r7 != 0) goto L20
            return
        L20:
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Exception -> L7b
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L7b
            r1 = 23
            if (r0 < r1) goto L39
            java.lang.String r0 = "fingerprint"
            java.lang.Object r0 = r6.getSystemService(r0)     // Catch: java.lang.Exception -> L7b
            android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L39
            boolean r0 = r0.isHardwareDetected()     // Catch: java.lang.Exception -> L7b
            goto L3a
        L39:
            r0 = 0
        L3a:
            int r1 = com.alipay.security.mobile.api.AuthenticatorApi.sSystemFingerPrintNumber     // Catch: java.lang.Exception -> L7b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L7b
            r5 = 21
            if (r4 < r5) goto L57
            org.ifaa.android.manager.IFAAManager r4 = com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFactory.getIFAAManager(r6)     // Catch: java.lang.Exception -> L7b
            if (r4 == 0) goto L57
            int r6 = r4.getSupportBIOTypes(r6)     // Catch: java.lang.Exception -> L7b
            int r4 = com.alipay.security.mobile.auth.Constants.TYPE_FINGERPRINT     // Catch: java.lang.Exception -> L7b
            r4 = r4 & r6
            if (r4 == 0) goto L57
            r6 = r6 & 16
            if (r6 == 0) goto L57
            r6 = 1
            goto L58
        L57:
            r6 = 0
        L58:
            if (r8 == 0) goto L6c
            int r8 = com.alipay.security.mobile.api.AuthenticatorApi.sSystemFingerPrintNumber     // Catch: java.lang.Exception -> L7b
            if (r8 <= 0) goto L69
            if (r7 == 0) goto L69
            int r8 = r7.getClientStatus()     // Catch: java.lang.Exception -> L7b
            if (r8 == r3) goto L69
            r7.hasAi = r3     // Catch: java.lang.Exception -> L7b
            goto L6e
        L69:
            r7.hasAi = r2     // Catch: java.lang.Exception -> L7b
            goto L6e
        L6c:
            r7.hasAi = r3     // Catch: java.lang.Exception -> L7b
        L6e:
            r7.setSensorSupport(r0)     // Catch: java.lang.Exception -> L7b
            r7.setBioInput(r1)     // Catch: java.lang.Exception -> L7b
            r7.setAccessPermission(r3)     // Catch: java.lang.Exception -> L7b
            r7.setHardwareInfo(r6)     // Catch: java.lang.Exception -> L7b
            return
        L7b:
            r6 = move-exception
            com.alipay.security.mobile.auth.AuthenticatorLOG.error(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.api.AuthenticatorApi.buildBiModel(android.content.Context, com.alipay.security.mobile.api.BICDataModel, boolean):void");
    }

    private static void buildFaceBiModel(BICDataModel bICDataModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a945b3fe", new Object[]{bICDataModel, new Boolean(z)});
        } else if (bICDataModel == null) {
        } else {
            try {
                int i = sSystemFaceNumber;
                if (z) {
                    if (sSystemFaceNumber > 0 && bICDataModel != null && bICDataModel.getClientStatus() != 1) {
                        bICDataModel.hasAi = true;
                    } else {
                        bICDataModel.hasAi = false;
                    }
                } else {
                    bICDataModel.hasAi = true;
                }
                bICDataModel.setSensorSupport(1);
                bICDataModel.setBioInput(i);
                bICDataModel.setAccessPermission(1);
                bICDataModel.setHardwareInfo(0);
            } catch (Throwable th) {
                AuthenticatorLOG.error(th);
            }
        }
    }

    public static IAuthenticator create(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAuthenticator) ipChange.ipc$dispatch("8b63650b", new Object[]{context, new Integer(i)}) : AuthenticatorFactory.create(context.getApplicationContext(), i);
    }

    public static List<FpServiceErrItem> getFpServiceErr() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("52f1d390", new Object[0]) : LogCollect.getErr();
    }

    public static String getFingerprintExtInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1010eec0", new Object[]{context});
        }
        try {
            return IFAAManagerAdaptor.getFingerprintExtInfo(context);
        } catch (Throwable th) {
            AuthenticatorLOG.fpInfo(th.toString());
            return null;
        }
    }
}
