package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Error f23648a;

    static {
        kge.a(386381803);
    }

    public abstract int a();

    public abstract String a(String str);

    public abstract Map<String, List<String>> c();

    public abstract InputStream d();

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    public Map<String, String> b() {
        List<String> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        Map<String, List<String>> c = c();
        if (c == null) {
            return null;
        }
        HashMap hashMap = new HashMap(c.size());
        for (Map.Entry<String, List<String>> entry : c.entrySet()) {
            String key = entry.getKey();
            if (key != null && (value = entry.getValue()) != null && value.size() != 0) {
                hashMap.put(key, value.get(0));
            }
        }
        return hashMap;
    }

    public void a(int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8183f3a", new Object[]{this, new Integer(i), th});
        } else if (th == null) {
        } else {
            this.f23648a = new Error(i, th.toString());
        }
    }
}
