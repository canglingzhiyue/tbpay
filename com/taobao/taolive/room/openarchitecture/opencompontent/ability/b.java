package com.taobao.taolive.room.openarchitecture.opencompontent.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public OpenAbilityCompontentTypeEnum f21663a;
    public boolean b;
    public Object c;

    static {
        kge.a(-1991426391);
    }

    public b(OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum, boolean z, Object obj) {
        this.f21663a = openAbilityCompontentTypeEnum;
        this.b = z;
        this.c = obj;
    }

    public Map<OpenAbilityCompontentTypeEnum, b> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.f21663a, this);
        return hashMap;
    }
}
