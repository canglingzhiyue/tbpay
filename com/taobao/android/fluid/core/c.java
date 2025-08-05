package com.taobao.android.fluid.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, FluidInstance> f12440a = new HashMap();

    static {
        kge.a(-427633274);
    }

    public FluidInstance a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("13180d1c", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        FluidInstance fluidInstance = this.f12440a.get(str);
        spz.c("FluidInstanceManager", fluidInstance + " 视频流实例获取，bizName：" + str + "，当前保存 FluidInstance 个数: " + this.f12440a.size());
        return fluidInstance;
    }

    public void a(String str, FluidInstance fluidInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba79c8", new Object[]{this, str, fluidInstance});
        } else if (str == null || fluidInstance == null) {
        } else {
            this.f12440a.put(str, fluidInstance);
            spz.c("FluidInstanceManager", fluidInstance + " 视频流实例已保存，bizName：" + str + "，当前保存 FluidInstance 个数: " + this.f12440a.size());
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (str == null) {
        } else {
            spz.c("FluidInstanceManager", this.f12440a.remove(str) + " 视频流已移除，bizName：" + str + "，当前保存 FluidInstance 个数: " + this.f12440a.size());
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (Map.Entry<String, FluidInstance> entry : this.f12440a.entrySet()) {
            FluidInstance value = entry.getValue();
            if (value != null && !value.isDestroyed()) {
                value.cI_();
            }
        }
        this.f12440a.clear();
        spz.c("FluidInstanceManager", "清空全部视频流实例，当前缓存 FluidInstance 个数: " + this.f12440a.size());
    }
}
