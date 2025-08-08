package com.alipay.android.msp.network;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.mobile.common.rpc.EmptyRpcInvokeContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class APNetSwitchUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<Boolean> f4916a = new AtomicReference<>(null);

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        Boolean bool = f4916a.get();
        if (bool == null) {
            boolean equals = StringUtils.equals(context.getPackageName(), "com.taobao.taobao");
            f4916a.set(Boolean.valueOf(equals));
            return equals;
        }
        return bool.booleanValue();
    }

    public static boolean shouldIUseAPNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8715e77", new Object[]{context})).booleanValue();
        }
        if (!a(context)) {
            return DrmManager.getInstance(context).isGray(DrmKey.GRAY_ENABLE_AP_RPC, false, context);
        }
        return !DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_AP_RPC_SOME_APP, false, context);
    }

    public static boolean shouldIUseAPHttpDns(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("866aa604", new Object[]{context})).booleanValue();
        }
        if (!a(context)) {
            return DrmManager.getInstance(context).isGray(DrmKey.GRAY_ENABLE_AP_HTTPDNS, false, context);
        }
        return !DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_AP_HTTP_DNS_SOME_APP, false, context);
    }

    public static boolean shouldIUseStandaloneRpcLib(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc13830f", new Object[]{context})).booleanValue();
        }
        if (!DrmManager.getInstance(context).isGray(DrmKey.GRAY_NET_IDENTITY_OPTIMIZE, false, context)) {
            return false;
        }
        return a();
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            EmptyRpcInvokeContext.getInstance().setAppKey("");
            return true;
        } catch (Throwable unused) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "np", "NoStandaloneRpc", "");
            return false;
        }
    }
}
