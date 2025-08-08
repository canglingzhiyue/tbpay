package com.alipay.mobile.intelligentdecision.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.util.LruCache;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class IDCacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile IDCacheManager d;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f5743a;
    private Context e;
    private LruCache<String, JSONObject> f = new LruCache<>(9);
    public ConcurrentHashMap<String, Object> b = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, Object> c = new ConcurrentHashMap<>();

    private IDCacheManager(Context context) {
        this.e = context;
        this.f5743a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static IDCacheManager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDCacheManager) ipChange.ipc$dispatch("2c042fab", new Object[]{context});
        }
        if (d == null) {
            synchronized (IDCacheManager.class) {
                if (d == null) {
                    d = new IDCacheManager(context);
                }
            }
        }
        return d;
    }

    public final void a(String str, JSONObject jSONObject) {
        LruCache<String, JSONObject> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (jSONObject == null || (lruCache = this.f) == null) {
        } else {
            lruCache.put(str, jSONObject);
        }
    }

    public final JSONObject a(String str) {
        LruCache<String, JSONObject> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (lruCache = this.f) == null) {
            return null;
        }
        return lruCache.get(str);
    }

    public final void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = this.b;
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.put(str, obj);
    }
}
