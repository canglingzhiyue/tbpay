package com.taobao.android.resourceguardian.data.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes6.dex */
public class RGConstantsTypeInfo {
    public static final int CONSTANTS_TYPE_CPU = 1;
    public static final int CONSTANTS_TYPE_MEMORY = 2;
    public static final int CONSTANTS_TYPE_STORAGE = 6;
    public static final String CPU_ARCH = "cpuArch";
    public static final String CPU_CORE_NUM = "cpuCoreNum";
    public static final String CPU_NAME = "cpuName";
    public static final String MEMORY_MAX_SIZE = "memoryMaxSize";
    public static final int PROCESS_ALL = 199;
    public static final int PROCESS_MAIN = 101;
    public static final int PROCESS_WEB_VIEW = 102;
    public static final String STORAGE_SIZE = "storageSize";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface RGConstantsType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface RGProcessType {
    }

    static {
        kge.a(-2016897292);
    }
}
