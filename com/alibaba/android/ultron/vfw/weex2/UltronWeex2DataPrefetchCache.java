package com.alibaba.android.ultron.vfw.weex2;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import java.util.HashMap;
import tb.cew;
import tb.jqd;
import tb.jqg;
import tb.jqh;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronWeex2DataPrefetchCache {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXPIRED_TIME = "expiredTime";
    public static final String KEY_PREFETCH_TIME_MILLIS = "prefetchTimeMillis";

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, LruCache<String, JSONObject>> f2751a = new HashMap<>();
    private jqd b;

    /* loaded from: classes2.dex */
    public enum CacheType {
        VALID,
        EXPIRED,
        UNREQUESTED,
        EXCEPTION
    }

    static {
        kge.a(-1207136828);
    }

    public static /* synthetic */ HashMap a(UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("52a189f8", new Object[]{ultronWeex2DataPrefetchCache}) : ultronWeex2DataPrefetchCache.f2751a;
    }

    public static /* synthetic */ jqd b(UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jqd) ipChange.ipc$dispatch("8eb3d2f5", new Object[]{ultronWeex2DataPrefetchCache}) : ultronWeex2DataPrefetchCache.a();
    }

    public void a(final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
        } else {
            jqh.a(new Runnable() { // from class: com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        LruCache lruCache = (LruCache) UltronWeex2DataPrefetchCache.a(UltronWeex2DataPrefetchCache.this).get(str);
                        if (lruCache == null) {
                            lruCache = new LruCache(10);
                        }
                        String e = UltronWeex2DataPrefetchCache.b(UltronWeex2DataPrefetchCache.this).e(str);
                        JSONObject parseObject = !TextUtils.isEmpty(e) ? JSONObject.parseObject(e) : new JSONObject();
                        for (String str2 : jSONObject.keySet()) {
                            if (!TextUtils.isEmpty(str2) && (jSONObject2 = jSONObject.getJSONObject(str2)) != null) {
                                lruCache.put(str2, jSONObject2);
                                parseObject.put(str2, (Object) jSONObject2);
                            }
                        }
                        UltronWeex2DataPrefetchCache.a(UltronWeex2DataPrefetchCache.this).put(str, lruCache);
                        UltronWeex2DataPrefetchCache.b(UltronWeex2DataPrefetchCache.this).a(str, parseObject.toString());
                    } catch (Throwable th) {
                        jqg.b("UltronWeex2DataPrefetchCache.setCache", th.toString());
                    }
                }
            });
        }
    }

    public Pair<JSONObject, String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("7c4398c6", new Object[]{this, str, str2});
        }
        try {
        } catch (Throwable th) {
            jqg.b("UltronWeex2DataPrefetchCache.getCache", th.toString());
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Pair<JSONObject, String> c = c(str, str2);
            if (c != null && c.first != null) {
                return c;
            }
            Pair<JSONObject, String> d = d(str, str2);
            if (d != null) {
                if (d.first != null) {
                    return d;
                }
            }
            return null;
        }
        return null;
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            e(str, str2);
            f(str, str2);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f2751a.remove(str);
            a().c(str);
        }
    }

    private jqd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqd) ipChange.ipc$dispatch("f0688c1", new Object[]{this});
        }
        jqd jqdVar = this.b;
        if (jqdVar != null) {
            return jqdVar;
        }
        Config config = new Config();
        config.walSize = 1048576;
        this.b = jqd.a("UltronWeex2DataPrefetchCache", config);
        return this.b;
    }

    private Pair<JSONObject, String> c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9daf3248", new Object[]{this, str, str2});
        }
        if (!this.f2751a.containsKey(str)) {
            return new Pair<>(null, CacheType.UNREQUESTED.name());
        }
        LruCache<String, JSONObject> lruCache = this.f2751a.get(str);
        if (lruCache == null) {
            return new Pair<>(null, CacheType.UNREQUESTED.name());
        }
        JSONObject jSONObject = lruCache.get(str2);
        if (jSONObject == null) {
            return new Pair<>(null, CacheType.UNREQUESTED.name());
        }
        if (System.currentTimeMillis() - (jSONObject.getLong(KEY_PREFETCH_TIME_MILLIS) == null ? 0L : jSONObject.getLong(KEY_PREFETCH_TIME_MILLIS).longValue()) < (jSONObject.getLong("expiredTime") == null ? cew.a.CONFIG_TRACK_1022_INTERVAL_TIME : jSONObject.getLong("expiredTime").longValue())) {
            return new Pair<>(jSONObject, CacheType.VALID.name());
        }
        lruCache.remove(str2);
        this.f2751a.put(str, lruCache);
        return new Pair<>(null, CacheType.EXPIRED.name());
    }

    private Pair<JSONObject, String> d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ae64ff09", new Object[]{this, str, str2});
        }
        if (!a().b(str)) {
            return new Pair<>(null, CacheType.UNREQUESTED.name());
        }
        String e = a().e(str);
        if (TextUtils.isEmpty(e)) {
            return new Pair<>(null, CacheType.UNREQUESTED.name());
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(e);
            if (parseObject == null) {
                return new Pair<>(null, CacheType.UNREQUESTED.name());
            }
            JSONObject jSONObject = parseObject.getJSONObject(str2);
            if (jSONObject == null) {
                return new Pair<>(null, CacheType.UNREQUESTED.name());
            }
            if (System.currentTimeMillis() - (jSONObject.getLong(KEY_PREFETCH_TIME_MILLIS) == null ? 0L : jSONObject.getLong(KEY_PREFETCH_TIME_MILLIS).longValue()) < (jSONObject.getLong("expiredTime") == null ? cew.a.CONFIG_TRACK_1022_INTERVAL_TIME : jSONObject.getLong("expiredTime").longValue())) {
                return new Pair<>(jSONObject, CacheType.VALID.name());
            }
            parseObject.remove(str2);
            a().a(str, parseObject.toString());
            return new Pair<>(null, CacheType.EXPIRED.name());
        } catch (Throwable th) {
            jqg.b("UltronWeex2DataPrefetchCache.getLSDBCache", th.toString());
            return new Pair<>(null, CacheType.EXCEPTION.name());
        }
    }

    private void e(String str, String str2) {
        LruCache<String, JSONObject> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else if (!this.f2751a.containsKey(str) || (lruCache = this.f2751a.get(str)) == null) {
        } else {
            lruCache.remove(str2);
            this.f2751a.put(str, lruCache);
        }
    }

    private void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{this, str, str2});
        } else if (!a().b(str)) {
        } else {
            String e = a().e(str);
            if (TextUtils.isEmpty(e)) {
                return;
            }
            try {
                JSONObject parseObject = JSONObject.parseObject(e);
                if (parseObject != null && parseObject.containsKey(str2)) {
                    parseObject.remove(str2);
                    a().a(str, parseObject.toString());
                }
            } catch (Throwable th) {
                jqg.b("UltronWeex2DataPrefetchCache.removeLSDBCache", th.toString());
            }
        }
    }
}
