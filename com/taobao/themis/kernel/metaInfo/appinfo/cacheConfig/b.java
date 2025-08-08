package com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.AppInfoCacheConfig;
import com.taobao.themis.kernel.utils.n;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_TMS_APP_INFO_CONFIG = "themis_appinfo_cache_config";
    public static final String GROUP_UNI_APP_WEEX_THEMIS_CONFIG = "weexv2_themis_config";
    public static final String KEY_CACHE_TIME_BIZ_LIST = "bizTypeCacheTimeList";
    public static final String KEY_CACHE_TIME_GLOBAL = "globalCacheTime";
    public static final String KEY_CACHE_TIME_ID_LIST = "idCacheTimeList";
    public static final String KEY_EXPIRE_LIST = "expireList";
    public static final String KEY_UNI_APP_WEEX_LAYOUT_NG_WHITE_LIST = "weex_tms_layoutng_white_list";
    public static final String KEY_UNI_APP_WEEX_MODULE_WHITE_LIST = "weex_tms_module_white_list";
    public static final String TAG = "AppInfoCacheConfigSyncCenter";

    static {
        kge.a(794435280);
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            c();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        c();
        try {
            ((IConfigAdapter) qpt.a(IConfigAdapter.class)).registerListener(GROUP_TMS_APP_INFO_CONFIG, new IConfigAdapter.a() { // from class: com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.themis.kernel.adapter.IConfigAdapter.a
                public void a(Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else {
                        b.b();
                    }
                }
            });
        } catch (Throwable th) {
            TMSLogger.a(TAG, "init error", th);
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        String j = n.j();
        if (!StringUtils.isEmpty(j)) {
            a(j);
        }
        String k = n.k();
        if (StringUtils.isEmpty(k)) {
            return;
        }
        b(k);
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                List<AppInfoCacheConfig.ExpireConfig> list = (List) JSONObject.parseObject(str, new TypeReference<List<AppInfoCacheConfig.ExpireConfig>>() { // from class: com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.2
                }, new Feature[0]);
                if (list == null) {
                    return;
                }
                a.a().a(list);
            } catch (Throwable th) {
                TMSLogger.b(TAG, "updateConfig parse error", th);
            }
        }
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                AppInfoCacheConfig.CacheTime cacheTime = (AppInfoCacheConfig.CacheTime) JSONObject.parseObject(str, AppInfoCacheConfig.CacheTime.class);
                if (cacheTime == null) {
                    return;
                }
                a.a().a(cacheTime);
            } catch (Throwable th) {
                TMSLogger.b(TAG, "updateConfig parse error", th);
            }
        }
    }
}
