package com.taobao.android.fluid.core;

import tb.snd;

/* loaded from: classes5.dex */
public interface FluidInstance extends FluidContext, snd {
    public static final b INSTANCE_PARSE_INSTANCE_CONFIG_ERROR = new b("INSTANCE-1", "FluidInstanceConfig 解析失败");
    public static final b INSTANCE_NEW_INSTANCE_ERROR = new b("INSTANCE-2", "FluidInstance 初始化实例失败");
    public static final b INSTANCE_ANDROID_CONTEXT_NOT_ACTIVITY = new b("INSTANCE-3", "Android 上下文 Context 不是 Activity");
    public static final b INSTANCE_LISTENER_CALLBACK_EXECUTE_ERROR = new b("INSTANCE-4", "监听器回调执行异常");
    public static final b INSTANCE_CREATE_INSTANCE_ERROR = new b("INSTANCE-5", "FluidInstance 创建实例失败");
    public static final b INSTANCE_DESTROY_INSTANCE_ERROR = new b("INSTANCE-6", "FluidInstance 销毁实例失败");

    boolean isDestroyed();
}
