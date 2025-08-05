package com.taobao.pha.core.controller;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f18718a = 0;
    private volatile Map<String, Serializable> b;

    static {
        kge.a(-1566816486);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f18718a++;
        }
    }

    public void a(String str, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbedb2c6", new Object[]{this, str, serializable});
            return;
        }
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = new HashMap();
                }
            }
        }
        this.b.put(str, serializable);
    }

    public Map<String, Serializable> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("matchCount", Integer.valueOf(this.f18718a));
        if (this.b != null) {
            hashMap.putAll(this.b);
        }
        return hashMap;
    }
}
