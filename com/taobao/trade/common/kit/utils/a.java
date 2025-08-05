package com.taobao.trade.common.kit.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CONFIG_NAME_SPACE = "newUltron_container";
    public static final String KEY_MTOP_CALLBACK_IN_WORKERTHREAD = "mtopCallbackInWorkerThread";
    public static final String KEY_NEW_FEATURE = "newFeature";
    public static final String KEY_STAGE_PERFORMANCE_CONFIG = "stagePerformanceConfig";
    public static final String KEY_TRACE_MTOP = "traceMtop";
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static AliConfigInterface f22981a;

    static {
        kge.a(569364530);
        f22981a = com.taobao.android.e.a();
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue() : e.a("newUltron_container", str, f);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : e.a("newUltron_container", str, z);
    }
}
