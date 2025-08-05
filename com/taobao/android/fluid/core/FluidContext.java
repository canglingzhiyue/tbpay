package com.taobao.android.fluid.core;

import android.content.Context;
import java.io.Serializable;

/* loaded from: classes5.dex */
public interface FluidContext extends Serializable {
    public static final String FLUID_APPLICATION = "fluid_application";
    public static final String FLUID_CONTEXT = "fluid_context";
    public static final String FLUID_INSTANCE = "fluid_instance";

    Context getContext();

    FluidInstanceConfig getInstanceConfig();

    String getInstanceId();

    <T extends FluidService> T getService(Class<T> cls);

    void updateInstanceConfig(FluidInstanceConfig fluidInstanceConfig);
}
