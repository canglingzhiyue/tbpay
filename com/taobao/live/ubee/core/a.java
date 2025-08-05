package com.taobao.live.ubee.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17802a;
    public String b;
    public Map<String, String> c;

    static {
        kge.a(967202303);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "EventEntity{scene='" + this.f17802a + "', action='" + this.b + "', bizArgsMap=" + this.c + '}';
    }
}
