package com.taobao.android.dinamicx.eventchain;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f11849a;
    private Map<String, a> b;

    static {
        kge.a(-1555858576);
    }

    public b(String str, int i) {
        this.f11849a = str;
        this.b = new HashMap(i);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f11849a;
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea149c15", new Object[]{this, str, aVar});
        } else {
            this.b.put(str, aVar);
        }
    }

    public a a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8650a687", new Object[]{this, str}) : this.b.get(str);
    }
}
