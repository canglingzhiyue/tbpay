package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a[] f12962a;
    public Map<String, String> b;
    public Map<String, String> c;

    public j a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("e2ed8f2", new Object[]{this, str, str2});
        }
        if (this.b == null) {
            this.b = new ConcurrentHashMap();
        }
        this.b.put(str, str2);
        return this;
    }

    public j a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("5b932f1", new Object[]{this, map});
        }
        this.c = map;
        return this;
    }
}
