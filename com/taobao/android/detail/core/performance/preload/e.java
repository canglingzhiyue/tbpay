package com.taobao.android.detail.core.performance.preload;

import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, LruCache<String, h>> f9797a = new HashMap();
    private LruCache<String, h> b = new LruCache<>(10);

    static {
        kge.a(-755707506);
    }

    public e() {
        emu.a("com.taobao.android.detail.core.performance.preload.LruCacheProvider");
    }

    public LruCache<String, h> a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("af7c729d", new Object[]{this, hVar});
        }
        String str = hVar.f9800a;
        String str2 = hVar.b;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return this.b;
        }
        return a(str, str2);
    }

    public LruCache<String, h> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("837f263a", new Object[]{this, str, str2});
        }
        String c = c(str, str2);
        LruCache<String, h> lruCache = this.f9797a.get(c);
        if (lruCache != null) {
            return lruCache;
        }
        LruCache<String, h> b = b(str, str2);
        this.f9797a.put(c, b);
        return b;
    }

    private LruCache<String, h> b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("9df01f59", new Object[]{this, str, str2});
        }
        if ("preload".equals(str)) {
            if ("high".equals(str2)) {
                return new LruCache<>(10);
            }
            return new LruCache<>(10);
        } else if ("refresh".equals(str)) {
            if ("low".equals(str2)) {
                return new LruCache<>(10);
            }
            return new LruCache<>(10);
        } else {
            return new LruCache<>(10);
        }
    }

    private String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{this, str, str2});
        }
        return str + str2;
    }
}
