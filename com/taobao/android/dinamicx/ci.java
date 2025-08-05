package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class ci {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f11837a = new ConcurrentHashMap();
    private Map<String, Long> b = new ConcurrentHashMap();

    static {
        kge.a(1472766505);
    }

    public void a(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3975ad05", new Object[]{this, str, num});
            return;
        }
        if (this.f11837a == null) {
            this.f11837a = new ConcurrentHashMap();
        }
        this.f11837a.put(str, num);
    }

    public void a(String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597be071", new Object[]{this, str, l});
            return;
        }
        if (this.b == null) {
            this.b = new ConcurrentHashMap();
        }
        this.b.put(str, l);
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f11837a;
    }

    public Map<String, Long> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
    }
}
