package com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.AppInfoCacheConfig;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final List<String> DEFAULT_CACHE_TIME_LIST;
    public static final long DEF_MAX_ASYNC_SECONDS = 1800;
    public static final long DEF_MAX_SYNC_SECONDS = 86400;
    public static final String TAG = "AppInfoCacheConfigManager";

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f22549a;
    private static volatile Map<String, AppInfoCacheConfig.ExpireConfig> b;
    private static volatile AppInfoCacheConfig.CacheTime c;

    static {
        kge.a(214868909);
        DEFAULT_CACHE_TIME_LIST = new ArrayList(Arrays.asList("tms_enginetype_mix"));
    }

    public a() {
        b = b();
        c = new AppInfoCacheConfig.CacheTime();
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("48ccb0a3", new Object[0]);
            }
            if (f22549a == null) {
                f22549a = new a();
            }
            return f22549a;
        }
    }

    public void a(AppInfoCacheConfig.CacheTime cacheTime) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b6302c", new Object[]{this, cacheTime});
        } else {
            c = cacheTime;
        }
    }

    public void a(List<AppInfoCacheConfig.ExpireConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            HashMap hashMap = new HashMap();
            if (b == null || b.isEmpty()) {
                for (AppInfoCacheConfig.ExpireConfig expireConfig : list) {
                    hashMap.put(expireConfig.appId, expireConfig);
                }
            } else {
                for (AppInfoCacheConfig.ExpireConfig expireConfig2 : list) {
                    AppInfoCacheConfig.ExpireConfig expireConfig3 = b.get(expireConfig2.appId);
                    if (expireConfig3 != null && expireConfig3.timeStamp == expireConfig2.timeStamp && !expireConfig3.expired) {
                        expireConfig2.expired = false;
                    }
                    hashMap.put(expireConfig2.appId, expireConfig2);
                }
            }
            b = hashMap;
            c();
        }
    }

    public AppInfoCacheConfig.CacheTime a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoCacheConfig.CacheTime) ipChange.ipc$dispatch("4a760254", new Object[]{this, str, str2, str3});
        }
        AppInfoCacheConfig.CacheTime cacheTime = null;
        if (!StringUtils.isEmpty(str)) {
            cacheTime = c("tms_app_" + str);
        }
        if (cacheTime == null && !StringUtils.isEmpty(str3)) {
            cacheTime = c("tms_enginetype_" + str3);
        }
        if (cacheTime == null && !StringUtils.isEmpty(str2)) {
            cacheTime = c("tms_biztype_" + str2);
        }
        return cacheTime == null ? c : cacheTime;
    }

    private AppInfoCacheConfig.CacheTime c(String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoCacheConfig.CacheTime) ipChange.ipc$dispatch("44272126", new Object[]{this, str});
        }
        try {
            String configByGroupAndName = ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndName(b.GROUP_TMS_APP_INFO_CONFIG, str, e(str));
            if (!StringUtils.isEmpty(configByGroupAndName) && (parseObject = JSON.parseObject(configByGroupAndName)) != null && !parseObject.isEmpty()) {
                long longValue = parseObject.getLongValue("maxSyncTime");
                long longValue2 = parseObject.getLongValue("maxAsyncTime");
                if (longValue > 0 && longValue2 > 0) {
                    AppInfoCacheConfig.CacheTime cacheTime = new AppInfoCacheConfig.CacheTime();
                    cacheTime.maxSyncTime = longValue;
                    cacheTime.maxAsyncTime = longValue2;
                    return cacheTime;
                }
            }
            return null;
        } catch (Exception e) {
            TMSLogger.b(TAG, "getCacheTimeByBizType error", e);
            return null;
        }
    }

    private String e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str}) : (!n.bH() || !DEFAULT_CACHE_TIME_LIST.contains(str)) ? "" : "{\"maxAsyncTime\": 300, \"maxSyncTime\": 2592000}";
    }

    public AppInfoCacheConfig.ExpireConfig a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoCacheConfig.ExpireConfig) ipChange.ipc$dispatch("ec92f75e", new Object[]{this, str});
        }
        if (b != null && !StringUtils.isEmpty(str)) {
            return b.get(str);
        }
        return null;
    }

    public void b(List<String> list) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        for (String str : list) {
            if (d(str)) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        c();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!d(str)) {
        } else {
            c();
        }
    }

    private boolean d(String str) {
        AppInfoCacheConfig.ExpireConfig expireConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (b == null || (expireConfig = b.get(str)) == null) {
            return false;
        }
        expireConfig.expired = false;
        return true;
    }

    private synchronized Map<String, AppInfoCacheConfig.ExpireConfig> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        try {
            String b2 = j.b(((IEnvironmentService) qpt.a(IEnvironmentService.class)).getApplicationContext(), "tms_appInfo_expire_config", (String) null);
            if (!StringUtils.isEmpty(b2)) {
                return (Map) JSONObject.parseObject(b2, new TypeReference<Map<String, AppInfoCacheConfig.ExpireConfig>>() { // from class: com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.a.1
                }, new Feature[0]);
            }
        } catch (Exception e) {
            TMSLogger.b(TAG, "getConfig error", e);
        }
        return null;
    }

    private synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            j.a(((IEnvironmentService) qpt.a(IEnvironmentService.class)).getApplicationContext(), "tms_appInfo_expire_config", JSONObject.toJSONString(b));
        } catch (Exception e) {
            TMSLogger.b(TAG, "saveConfig error", e);
        }
    }
}
