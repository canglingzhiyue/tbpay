package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.transport.http.HttpContextExtend;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.riy;

/* loaded from: classes3.dex */
public class MpaasPropertiesUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_KEY_DEBUG = "rpc-sdk";
    public static final String APP_KEY_ONLINE = "rpc-sdk-online";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f5628a;
    private static String b;

    public static final Map<String, String> getMpaasProperties(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ca4e9489", new Object[]{context});
        }
        Map<String, String> map = f5628a;
        if (map != null) {
            return map;
        }
        synchronized (MpaasPropertiesUtil.class) {
            if (f5628a == null) {
                f5628a = a(context);
            }
        }
        return f5628a;
    }

    public static final String getWorkspaceId(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7050fb79", new Object[]{context});
        }
        try {
            String str = getMpaasProperties(context).get("WorkspaceId");
            return str != null ? str : "";
        } catch (Throwable th) {
            LogCatUtil.error("MpaasPropertiesUtil", "getWorkspaceId. error: " + th.toString());
            return "";
        }
    }

    public static final String getAppId(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43190085", new Object[]{context}) : getAppId(context, getAppKeyFromMetaData(TransportEnvUtil.getContext()));
    }

    public static final String getAppId(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad2414bb", new Object[]{context, str});
        }
        String appIdFromMetaData = getAppIdFromMetaData(context);
        return !StringUtils.isEmpty(appIdFromMetaData) ? appIdFromMetaData : !StringUtils.isEmpty(str) ? str : getProductId(context);
    }

    public static final String getAppIdFromMetaData(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("723b10fe", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        String str = b;
        if (str != null) {
            return str;
        }
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("mobilegw.appid");
            String obj2 = obj != null ? obj.toString() : null;
            if (StringUtils.isEmpty(obj2)) {
                LogCatUtil.info("MpaasPropertiesUtil", "getAppIdFromMetaData. mobilegw.appid is empty.");
                b = "";
                return "";
            }
            LogCatUtil.info("MpaasPropertiesUtil", "getAppIdFromMetaData. config appId=[" + obj2 + riy.ARRAY_END_STR);
            if (obj2.equals("[product_id]")) {
                obj2 = getProductId(context);
                LogCatUtil.info("MpaasPropertiesUtil", "getAppIdFromMetaData. getAppIdFromProductID appId=[" + obj2 + riy.ARRAY_END_STR);
            }
            b = obj2;
            return obj2;
        } catch (Throwable th) {
            LogCatUtil.warn("MpaasPropertiesUtil", "getAppIdFromMetaData get mobilegw.appid fail", th);
            return "";
        }
    }

    public static final String getAppkey(String str, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe011b67", new Object[]{str, new Boolean(z), context});
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                if (MiscUtils.isDebugger(context)) {
                    LogCatUtil.debug("MpaasPropertiesUtil", "[getAppkey] appKey=" + str + ",externalAppKey=" + str + ",isReqOnline=" + z);
                }
                return str;
            } else if (z) {
                if (MiscUtils.isDebugger(context)) {
                    LogCatUtil.debug("MpaasPropertiesUtil", "[getAppkey] appKey=rpc-sdk-online,externalAppKey=" + str + ",isReqOnline=" + z);
                }
                return "rpc-sdk-online";
            } else {
                if (MiscUtils.isDebugger(context)) {
                    LogCatUtil.debug("MpaasPropertiesUtil", "[getAppkey] appKey=rpc-sdk,externalAppKey=" + str + ",isReqOnline=" + z);
                }
                return "rpc-sdk";
            }
        } catch (Throwable th) {
            if (MiscUtils.isDebugger(context)) {
                LogCatUtil.debug("MpaasPropertiesUtil", "[getAppkey] appKey=,externalAppKey=" + str + ",isReqOnline=" + z);
            }
            throw th;
        }
    }

    public static String getAppKeyFromMetaData(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35462d8c", new Object[]{context});
        }
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("appkey");
            String obj2 = obj != null ? obj.toString() : null;
            if (StringUtils.isEmpty(obj2)) {
                return "";
            }
            LogCatUtil.info("MpaasPropertiesUtil", "getAppKeyFromMetaData. appkey=[" + obj2 + riy.ARRAY_END_STR);
            return obj2;
        } catch (Throwable th) {
            LogCatUtil.warn("MpaasPropertiesUtil", "getAppKeyFromMetaData get appkey fail", th);
            return "";
        }
    }

    public static String getProductId(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7797ca53", new Object[]{context});
        }
        HttpContextExtend createInstance = HttpContextExtend.createInstance(context);
        if (createInstance != null) {
            return createInstance.getProductId();
        }
        return AppInfoUtil.getProductId();
    }

    private static final Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context});
        }
        try {
            InputStream open = context.getAssets().open("mpaas.properties");
            Properties properties = new Properties();
            properties.load(open);
            if (properties.size() <= 0) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap(properties.size());
            for (Map.Entry entry : properties.entrySet()) {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
            LogCatUtil.info("MpaasPropertiesUtil", "Mpaas properties loaded, size: " + hashMap.size());
            return hashMap;
        } catch (IOException e) {
            LogCatUtil.warn("MpaasPropertiesUtil", "Mpaas properties load fail. " + e.toString());
            return Collections.emptyMap();
        } catch (Throwable th) {
            LogCatUtil.error("MpaasPropertiesUtil", "Mpaas properties load fail. ", th);
            return Collections.emptyMap();
        }
    }
}
