package com.alipay.android.msp.framework.cache;

import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.JsonUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspMemoryCache implements ICache<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LruCache<String, String> f4687a = new LruCache<String, String>(100000) { // from class: com.alipay.android.msp.framework.cache.MspMemoryCache.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.util.LruCache
        public /* synthetic */ void entryRemoved(boolean z, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), str, str2, str3});
            } else {
                a(z, str, str2, str3);
            }
        }

        @Override // android.util.LruCache
        public /* synthetic */ int sizeOf(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33c6036a", new Object[]{this, str, str2})).intValue() : a(str, str2);
        }

        public int a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue() : str2.getBytes().length;
        }

        public void a(boolean z, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2e4c4a", new Object[]{this, new Boolean(z), str, str2, str3});
            } else if (!z || MspMemoryCache.a(MspMemoryCache.this) == null) {
            } else {
                MspMemoryCache.a(MspMemoryCache.this).handleEvictEntry(str, str2);
            }
        }
    };
    private EvictedListener b;

    /* loaded from: classes3.dex */
    public interface EvictedListener {
        void handleEvictEntry(String str, String str2);
    }

    public static /* synthetic */ EvictedListener a(MspMemoryCache mspMemoryCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EvictedListener) ipChange.ipc$dispatch("7849730", new Object[]{mspMemoryCache}) : mspMemoryCache.b;
    }

    public void setEvictedListener(EvictedListener evictedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710148d7", new Object[]{this, evictedListener});
        } else {
            this.b = evictedListener;
        }
    }

    public boolean hasEvictedListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("845af10d", new Object[]{this})).booleanValue() : this.b != null;
    }

    @Override // com.alipay.android.msp.framework.cache.ICache
    public String get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.f4687a.get(str);
        }
        return null;
    }

    public String getTwoLevel(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5dcf2000", new Object[]{this, str, strArr});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.f4687a.get(str);
        if (StringUtils.isEmpty(str2)) {
            return null;
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (strArr == null || strArr.length == 0) {
            return parseObject.toJSONString();
        }
        if (parseObject == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str3 : strArr) {
            jSONObject.put(str3, (Object) parseObject.getString(str3));
        }
        return jSONObject.toJSONString();
    }

    @Override // com.alipay.android.msp.framework.cache.ICache
    public void put(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fc7a2a", new Object[]{this, str, str2});
        } else {
            this.f4687a.put(str, str2);
        }
    }

    public String putTwoLevel(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8deeb4fe", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return "{}";
        }
        JSONObject parseObject = JSONObject.parseObject(this.f4687a.get(str));
        JSONObject parseObject2 = JSONObject.parseObject(str2);
        if (parseObject != null) {
            parseObject2 = JsonUtil.merge(parseObject, parseObject2);
        }
        String jSONObject = parseObject2.toString();
        put(str, jSONObject);
        return jSONObject;
    }

    @Override // com.alipay.android.msp.framework.cache.ICache
    public String remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccd9492b", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.f4687a.remove(str);
        }
        return null;
    }

    @Override // com.alipay.android.msp.framework.cache.ICache
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.f4687a.evictAll();
        }
    }
}
