package com.taobao.android.fluid.launcher.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.q;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NO_GROUP = "NO_GROUP";

    static {
        kge.a(-1863726756);
        kge.a(-195320069);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        q.b("FluidTask", this + " 已提交");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        q.b("FluidTask", this + " 已启动");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        q.b("FluidTask", this + " 已结束");
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        q.b("FluidTask", this + " 已取消");
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        q.b("FluidTask", this + " 执行错误");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return f() + "@" + hashCode();
    }
}
