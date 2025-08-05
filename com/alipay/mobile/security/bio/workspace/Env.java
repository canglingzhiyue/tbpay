package com.alipay.mobile.security.bio.workspace;

import android.content.Context;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.security.bio.utils.DeviceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class Env {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BID_LOG_KEY_PUBLIC_KEY = "bid-log-key-public.key";
    public static final String BID_LOG_KEY_PUBLIC_T_KEY = "bid-log-key-public_t.key";
    public static final String KEY_PROTOCOL_FORMAT = "meta_serializer";
    public static final String NAME_DEV = "dev";
    public static final String NAME_ONLINE = "online";
    public static final String NAME_PRE = "pre";
    public static final String NAME_TEST = "test";
    public static final int PROTOCOL_FORMAT_JSON = 1;
    public static final int PROTOCOL_FORMAT_PB = 2;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Env> f5833a;
    public int appSecurityEnvConfig;
    public String gwUrl;
    public String loggingGatewayUrl;
    public String name;
    public String publicKeyAssetsName;
    public String zimInitializeUrl;
    public static final Env DEV = new Env("dev", "http://mobilegw.aaa.alipay.net/mgw.htm", "http://openapi.stable.alipay.net/gateway.do", "http://mdap-1-64.test.alipay.net", 4, "bid-log-key-public_t.key");
    public static final Env TEST = new Env("test", "http://mobilegw.test.alipay.net/mgw.htm", "http://openapi-1-64.test.alipay.net/gateway.do", "http://mdap-1-64.test.alipay.net", 3, "bid-log-key-public_t.key");
    public static final Env PRE = new Env("pre", "https://mobilegwpre.alipay.com/mgw.htm", "https://openapi.prefromoffice.alipay.net/gateway.do", LogContext.LOG_HOST_RELEASE, 2, "bid-log-key-public.key");
    public static final Env ONLINE = new Env("online", "https://mobilegw.alipay.com/mgw.htm", "https://openapi.alipay.com/gateway.do", LogContext.LOG_HOST_RELEASE, 0, "bid-log-key-public.key");
    public static final String NAME_PRE_ANT_CLOUD = "ant_cloud_pre";
    public static final Env PRE_ANT_CLOUD = new Env(NAME_PRE_ANT_CLOUD, "https://cn-hangzhou-mgs-gw.cloud.alipay.com/mgw.htm", "http://139.224.138.243/gateway/identification/simulate/face/initialize", "http://cn-hangzhou-mas-log.cloud.alipay.com/loggw/logUpload.do", 2, "bid-log-key-public.key");
    public static final String NAME_ONLINE_ANT_CLOUD = "ant_cloud_online";
    public static final Env ONLINE_ANT_CLOUD = new Env(NAME_ONLINE_ANT_CLOUD, "https://cn-hangzhou-mgs-gw.cloud.alipay.com/mgw.htm", "http://139.224.94.200/gateway/identification/simulate/face/initialize", "http://cn-hangzhou-mas-log.cloud.alipay.com/loggw/logUpload.do", 0, "bid-log-key-public.key");

    static {
        HashMap<String, Env> hashMap = new HashMap<>();
        f5833a = hashMap;
        Env env = DEV;
        hashMap.put(env.name, env);
        HashMap<String, Env> hashMap2 = f5833a;
        Env env2 = TEST;
        hashMap2.put(env2.name, env2);
        HashMap<String, Env> hashMap3 = f5833a;
        Env env3 = PRE;
        hashMap3.put(env3.name, env3);
        HashMap<String, Env> hashMap4 = f5833a;
        Env env4 = ONLINE;
        hashMap4.put(env4.name, env4);
        HashMap<String, Env> hashMap5 = f5833a;
        Env env5 = PRE_ANT_CLOUD;
        hashMap5.put(env5.name, env5);
        HashMap<String, Env> hashMap6 = f5833a;
        Env env6 = ONLINE_ANT_CLOUD;
        hashMap6.put(env6.name, env6);
    }

    public Env(String str, String str2, String str3, String str4, int i, String str5) {
        this.name = str;
        this.gwUrl = str2;
        this.zimInitializeUrl = str3;
        this.loggingGatewayUrl = str4;
        this.appSecurityEnvConfig = i;
        this.publicKeyAssetsName = str5;
    }

    public static Env getEnvByName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Env) ipChange.ipc$dispatch("df3fd668", new Object[]{str}) : f5833a.get(str);
    }

    public static void setProtocolFormat(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb9c3f3", new Object[]{context, new Integer(i)});
        } else if (!DeviceUtil.isDebug(context)) {
        } else {
            context.getSharedPreferences("biometric", 0).edit().putInt("meta_serializer", i).apply();
        }
    }

    public static int getProtocolFormat(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eec62d8f", new Object[]{context})).intValue();
        }
        if (!DeviceUtil.isDebug(context)) {
            return 1;
        }
        return context.getSharedPreferences("biometric", 0).getInt("meta_serializer", 1);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Env{name='" + this.name + "', publicKeyAssetsName='" + this.publicKeyAssetsName + "'}";
    }
}
