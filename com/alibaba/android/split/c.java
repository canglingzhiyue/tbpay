package com.alibaba.android.split;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class c implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f2430a = new ConcurrentHashMap();

    static {
        kge.a(-1371962088);
        kge.a(569882020);
    }

    @Override // com.alibaba.android.split.h
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : this.f2430a.containsKey(str) ? this.f2430a.get(str) : str2;
    }

    @Override // com.alibaba.android.split.h
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            this.f2430a.put(str, str2);
        }
    }
}
