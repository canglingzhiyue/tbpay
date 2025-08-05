package com.taobao.pha.core.controller;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class a extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f18716a;

    static {
        kge.a(-1867907031);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1841236574) {
            return super.b();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f18716a++;
        }
    }

    @Override // com.taobao.pha.core.controller.c
    public Map<String, Serializable> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        Map<String, Serializable> b = super.b();
        b.put("count", Integer.valueOf(this.f18716a));
        return b;
    }
}
