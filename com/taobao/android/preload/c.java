package com.taobao.android.preload;

import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, LruCache<String, g>> f14675a = new ConcurrentHashMap();
    private a b;

    /* loaded from: classes6.dex */
    public interface a {
        int a(String str, String str2);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf66310", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public LruCache<String, g> a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("bae9d9ad", new Object[]{this, gVar});
        }
        String str = gVar.b;
        String str2 = gVar.c;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = "preload";
            str2 = "low";
        }
        return a(str, str2);
    }

    public LruCache<String, g> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("837f263a", new Object[]{this, str, str2});
        }
        String c = c(str, str2);
        LruCache<String, g> lruCache = this.f14675a.get(c);
        if (lruCache != null) {
            return lruCache;
        }
        LruCache<String, g> b = b(str, str2);
        this.f14675a.put(c, b);
        return b;
    }

    private LruCache<String, g> b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("9df01f59", new Object[]{this, str, str2}) : new LruCache<>(d(str, str2));
    }

    private int d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f180e72", new Object[]{this, str, str2})).intValue();
        }
        a aVar = this.b;
        if (aVar != null) {
            return aVar.a(str, str2);
        }
        if ("preload".equals(str)) {
            if ("high".equals(str2)) {
            }
            return 30;
        }
        if (!"refresh".equals(str) || !"low".equals(str2)) {
        }
        return 10;
    }

    private String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{this, str, str2});
        }
        return str + str2;
    }
}
