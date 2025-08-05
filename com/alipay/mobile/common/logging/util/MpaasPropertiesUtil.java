package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class MpaasPropertiesUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f5463a = new HashMap();

    private static Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context});
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream open = context.getAssets().open("mpaas.properties");
                Properties properties = new Properties();
                properties.load(open);
                if (properties.size() <= 0) {
                    Map<String, String> emptyMap = Collections.emptyMap();
                    try {
                        open.close();
                    } catch (IOException unused) {
                    }
                    return emptyMap;
                }
                HashMap hashMap = new HashMap(properties.size());
                for (Map.Entry entry : properties.entrySet()) {
                    hashMap.put((String) entry.getKey(), (String) entry.getValue());
                }
                try {
                    open.close();
                } catch (IOException unused2) {
                }
                return hashMap;
            } catch (Throwable unused3) {
                inputStream.close();
                return Collections.emptyMap();
            }
        } catch (IOException unused4) {
            return Collections.emptyMap();
        }
    }

    public static String getAppKey(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("40f00213", new Object[]{context}) : getKeyFromManifest(context, "appkey");
    }

    public static String getAppID(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93d43865", new Object[]{context}) : getKeyFromManifest(context, "ALIPUSH_APPID");
    }

    public static String getKeyFromManifest(Context context, String str) {
        ApplicationInfo applicationInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f199d17", new Object[]{context, str});
        }
        if (f5463a.containsKey(str)) {
            return f5463a.get(str);
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            try {
                if (applicationInfo.metaData != null) {
                    String string = applicationInfo.metaData.getString(str);
                    f5463a.put(str, string);
                    return string;
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static String getWorkSpaceId(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8facb59", new Object[]{context}) : getKeyFromMpaasProperties(context, "WorkspaceId");
    }

    public static String getMpaasapi(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("874f5f", new Object[]{context}) : getKeyFromManifest(context, "mpaasapi");
    }

    public static String getKeyFromMpaasProperties(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97026d85", new Object[]{context, str});
        }
        if (f5463a.containsKey(str)) {
            return f5463a.get(str);
        }
        String str2 = null;
        try {
            Map<String, String> a2 = a(context);
            f5463a.putAll(a2);
            if (a2 != null) {
                str2 = a2.get(str);
            }
            if (str2 != null) {
                f5463a.put(str, str2);
            }
        } catch (Throwable unused) {
        }
        return str2;
    }

    public static String getProductId(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7797ca53", new Object[]{context});
        }
        return getAppKey(context) + "-" + getWorkSpaceId(context);
    }
}
