package com.alipay.mobile.security.zim.api;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;
import com.alipay.mobile.security.bio.api.BioDetectorBuilder;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.DeviceUtil;
import com.alipay.mobile.security.bio.workspace.Env;
import com.alipay.mobile.security.zim.biz.RecordProcessor;
import com.alipay.mobile.security.zim.biz.ZimActivityLifecycleCallbacks;
import com.alipay.mobile.security.zim.biz.ZimComponentCallbacks;
import com.alipay.mobile.security.zim.info.AppDataProvider;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ZIMFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMMAND_CANCLE = 4099;
    public static final int COMMAND_SERVER_CONTINUE = 4098;
    public static final int COMMAND_SERVER_FAIL = 8193;
    public static final int COMMAND_SERVER_RETRY = 8194;
    public static final int COMMAND_SERVER_SUCCESS = 4097;
    public static final int COMMAND_VALIDATE_FAIL = 4100;
    public static final String KEY_AUTO_CLOSE = "zimAutoClose";
    public static final String KEY_AVATAR = "avatar";
    public static final String KEY_BIO_ACTION = "zimAction";
    public static final String KEY_BIZ_DATA = "bizData";
    public static final String KEY_CERT_NAME = "certName";
    public static final String KEY_CERT_NO = "certNo";
    public static final String KEY_ENV_NAME = "env_name";
    public static final String KEY_FACE_PAY_INFO = "facepayInfoMap";
    public static final String KEY_FACE_TOKEN = "ftoken";
    public static final String KEY_INIT_RESP = "zimInitResp";
    public static final String KEY_INIT_RESP_OLD = "zim.init.resp";
    public static final String KEY_THIN_PROTOCOL = "isThinProtocol";
    public static final String KEY_USER_ID = "USER_ID";
    public static final String KEY_ZIM_MSG_CHANNEL = "zimMessageChannel";
    public static final String TAG = "ZimPlatform";

    /* renamed from: a  reason: collision with root package name */
    private static String f5840a = "1.0.0";

    public abstract void command(int i);

    public abstract void destroy();

    public abstract void init(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZIMCallback zIMCallback);

    public abstract void init(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZimMessageChannel zimMessageChannel, ZIMCallback zIMCallback);

    public abstract ZimInitGwResponse parse(String str);

    public abstract void retry();

    public abstract void retry(String str);

    public abstract void verify(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZIMCallback zIMCallback);

    public abstract void verify(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZimMessageChannel zimMessageChannel, ZIMCallback zIMCallback);

    public abstract void verify(String str, Map<String, String> map, ZIMCallback zIMCallback);

    public abstract void verify(String str, Map<String, String> map, ZimMessageChannel zimMessageChannel, ZIMCallback zIMCallback);

    public static /* synthetic */ String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : b(context);
    }

    public static void a(Context context, String str) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        if (!DeviceUtil.isDebug(context)) {
            BioLog.w("initEnv(). envName=[" + str + "] is ignored, because only debug apk can set env manually.");
            str = null;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    if (applicationInfo != null && applicationInfo.metaData != null) {
                        str = applicationInfo.metaData.getString(KEY_ENV_NAME);
                    }
                    sb = new StringBuilder();
                } catch (PackageManager.NameNotFoundException e) {
                    BioLog.w(e);
                    sb = new StringBuilder();
                }
                sb.append("ApplicationInfo.metaData.env_name == ");
                sb.append(str);
                BioLog.i(TAG, sb.toString());
            }
            if (StringUtils.isEmpty(str)) {
                str = "online";
            }
            BioLog.i(TAG, "initEnv() : env=" + str);
            Env envByName = Env.getEnvByName(str);
            if (envByName == null) {
                return;
            }
            BioServiceManager.setEnv(envByName);
        } catch (Throwable th) {
            BioLog.i(TAG, "ApplicationInfo.metaData.env_name == " + str);
            throw th;
        }
    }

    public static void install(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a29e15f", new Object[]{context, map});
            return;
        }
        if (map != null && map.containsKey(KEY_ENV_NAME)) {
            a(context, (String) map.remove(KEY_ENV_NAME));
        }
        install(context);
    }

    public static void install(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1c4166", new Object[]{context});
            return;
        }
        MonitorLogService monitorLogService = (MonitorLogService) BioServiceManager.getLocalService(context, MonitorLogService.class);
        if (monitorLogService != null) {
            monitorLogService.install(context);
        }
        ApSecurityService apSecurityService = (ApSecurityService) BioServiceManager.getLocalService(context, ApSecurityService.class);
        if (apSecurityService != null) {
            apSecurityService.init(context);
        }
        if (Runtime.isRunningOnQuinox(context)) {
            return;
        }
        Application application = (Application) context.getApplicationContext();
        ZimActivityLifecycleCallbacks.getInstance(application);
        ZimComponentCallbacks.getInstance(application);
    }

    public static ZIMMetaInfo getZimMetaInfo(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ZIMMetaInfo) ipChange.ipc$dispatch("2e994f4d", new Object[]{context}) : getZimMetaInfo(context, null);
    }

    public static ZIMMetaInfo getZimMetaInfo(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZIMMetaInfo) ipChange.ipc$dispatch("c23c24b4", new Object[]{context, map});
        }
        AppDataProvider appDataProvider = new AppDataProvider() { // from class: com.alipay.mobile.security.zim.api.ZIMFacade.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.security.zim.info.AppDataProvider
            public String getDeviceType() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("37b43413", new Object[]{this}) : "android";
            }

            @Override // com.alipay.mobile.security.zim.info.AppDataProvider
            public String getApdidToken(Context context2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("684513e", new Object[]{this, context2}) : ZIMFacade.a(context2);
            }

            @Override // com.alipay.mobile.security.zim.info.AppDataProvider
            public String getDeviceModel() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("fd868ddc", new Object[]{this}) : Build.MODEL;
            }

            @Override // com.alipay.mobile.security.zim.info.AppDataProvider
            public String getAppName(Context context2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("b8e75335", new Object[]{this, context2}) : context2 == null ? "" : context2.getPackageName();
            }

            @Override // com.alipay.mobile.security.zim.info.AppDataProvider
            public String getAppVersion(Context context2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("e616e24c", new Object[]{this, context2});
                }
                try {
                    return context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    BioLog.w(e);
                    return "";
                }
            }

            @Override // com.alipay.mobile.security.zim.info.AppDataProvider
            public String getOsVersion() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("5f114e1b", new Object[]{this}) : Build.VERSION.RELEASE;
            }
        };
        ZIMMetaInfo zIMMetaInfo = new ZIMMetaInfo();
        zIMMetaInfo.setApdidToken(appDataProvider.getApdidToken(context));
        zIMMetaInfo.setAppName(appDataProvider.getAppName(context));
        zIMMetaInfo.setAppVersion(appDataProvider.getAppVersion(context));
        zIMMetaInfo.setDeviceModel(appDataProvider.getDeviceModel());
        zIMMetaInfo.setDeviceType(appDataProvider.getDeviceType());
        zIMMetaInfo.setOsVersion(appDataProvider.getOsVersion());
        zIMMetaInfo.setBioMetaInfo(BioDetectorBuilder.getMetaInfos(context, map));
        zIMMetaInfo.setZimVer(f5840a);
        return zIMMetaInfo;
    }

    public static String getMetaInfos(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("23e7e3e9", new Object[]{context}) : getMetaInfos(context, null);
    }

    public static String getMetaInfos(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dfb26952", new Object[]{context, map}) : a(context, map, true);
    }

    public static String a(Context context, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0815031", new Object[]{context, map, new Boolean(z)});
        }
        if (z) {
            RecordProcessor.createInstance(context);
        }
        try {
            return JSON.toJSONString(getZimMetaInfo(context, map));
        } catch (Throwable th) {
            BioLog.e(th);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0133, code lost:
        if (android.text.StringUtils.isEmpty(r7) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0080, code lost:
        if (android.text.StringUtils.isEmpty(r7) == false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String b(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.zim.api.ZIMFacade.b(android.content.Context):java.lang.String");
    }
}
