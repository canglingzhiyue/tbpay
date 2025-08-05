package com.taobao.mediaplay;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile l f18041a;
    private Map<String, Map<String, String>> b = new HashMap();

    static {
        kge.a(-1120018996);
    }

    private l() {
    }

    public static l a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("c8453b", new Object[0]);
        }
        if (f18041a == null) {
            synchronized (l.class) {
                if (f18041a == null) {
                    f18041a = new l();
                }
            }
        }
        return f18041a;
    }

    public synchronized void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (map != null) {
                this.b.put(str, map);
            } else {
                this.b.remove(str);
            }
        }
    }

    public synchronized Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return this.b.get(str);
        }
    }

    public synchronized boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            Map<String, String> map = this.b.get(str);
            if (map == null) {
                return false;
            }
            return (map.get("url") == null || map.get("cacheKey") == null) ? false : true;
        }
    }
}
