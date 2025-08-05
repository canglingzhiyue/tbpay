package com.alibaba.ut.abtest.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class a<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private EventType f4176a;
    private T b;
    private Object c;

    static {
        kge.a(-859248168);
    }

    public a() {
    }

    public a(EventType eventType, T t) {
        this.f4176a = eventType;
        this.b = t;
    }

    public a(EventType eventType, T t, Object obj) {
        this.f4176a = eventType;
        this.b = t;
        this.c = obj;
    }

    public EventType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventType) ipChange.ipc$dispatch("c9e61b27", new Object[]{this}) : this.f4176a;
    }

    public T b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b;
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.c;
    }
}
