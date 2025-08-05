package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.security.ccrc.service.build.za  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1268za {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3339a;
    public int b;
    public Map<String, Object> c;

    public C1268za() {
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        return this.c;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b == 0;
    }

    public C1268za(String str, int i) {
        this.f3339a = str;
        this.b = i;
    }
}
