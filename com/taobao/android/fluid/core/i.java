package com.taobao.android.fluid.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME_RECOMMEND_TAB;
    public static final String TAG = "FluidPreloadInstanceManager";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, FluidInstance> f12444a = new HashMap();

    static {
        kge.a(1061123105);
        BIZ_NAME_RECOMMEND_TAB = FluidInstanceConfig.appendBizName(FluidInstanceConfig.CONTAINER_NAME_GG_TAG3, "video");
    }

    public FluidInstance a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("13180d1c", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        FluidInstance fluidInstance = this.f12444a.get(str);
        spz.c(TAG, fluidInstance + " 预加载实例获取，bizName：" + str + "，当前保存 FluidInstance 个数: " + this.f12444a.size());
        return fluidInstance;
    }

    public void a(String str, FluidInstance fluidInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba79c8", new Object[]{this, str, fluidInstance});
        } else if (str == null || fluidInstance == null) {
        } else {
            this.f12444a.put(str, fluidInstance);
            spz.c(TAG, fluidInstance + " 预加载实例已缓存，bizName：" + str + "，当前保存 FluidInstance 个数: " + this.f12444a.size());
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (str == null) {
        } else {
            spz.c(TAG, this.f12444a.remove(str) + " 预加载实例已移除，bizName：" + str + "，当前保存 FluidInstance 个数: " + this.f12444a.size());
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (Map.Entry<String, FluidInstance> entry : this.f12444a.entrySet()) {
            FluidInstance value = entry.getValue();
            if (value != null && !value.isDestroyed()) {
                value.cI_();
            }
        }
        this.f12444a.clear();
        spz.c(TAG, "清空全部预加载视频流实例，当前缓存 FluidInstance 个数: " + this.f12444a.size());
    }
}
