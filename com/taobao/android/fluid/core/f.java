package com.taobao.android.fluid.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class f<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<T> f12441a = new ArrayList();

    static {
        kge.a(1493411820);
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else if (b(t)) {
            spz.c("ObserverList", "监听器 " + t.getClass().getSimpleName() + " 已经注册");
        } else {
            this.f12441a.add(t);
        }
    }

    public List<T> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f12441a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f12441a.size();
    }

    public boolean b(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, t})).booleanValue() : this.f12441a.contains(t);
    }

    public void c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, t});
        } else {
            this.f12441a.remove(t);
        }
    }
}
