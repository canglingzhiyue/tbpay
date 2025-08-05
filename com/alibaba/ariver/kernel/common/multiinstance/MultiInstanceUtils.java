package com.alibaba.ariver.kernel.common.multiinstance;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class MultiInstanceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static InstanceType f2908a;

    static {
        kge.a(1727299833);
    }

    public static InstanceType getInstanceTypeFromParam(JSONObject jSONObject) {
        InstanceType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstanceType) ipChange.ipc$dispatch("96545c37", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("platformType");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        for (InstanceType instanceType : InstanceType.values()) {
            if (string.equalsIgnoreCase(instanceType.getValue())) {
                return instanceType;
            }
        }
        return null;
    }

    public static InstanceType getInstanceTypeFromParam(Bundle bundle) {
        InstanceType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstanceType) ipChange.ipc$dispatch("cb85bb5b", new Object[]{bundle});
        }
        if (bundle == null) {
            return getDefaultInstanceType();
        }
        String string = bundle.getString(RVStartParams.KEY_INSTANCE_TYPE);
        if (TextUtils.isEmpty(string)) {
            return getDefaultInstanceType();
        }
        for (InstanceType instanceType : InstanceType.values()) {
            if (string.equalsIgnoreCase(instanceType.getValue())) {
                return instanceType;
            }
        }
        return getDefaultInstanceType();
    }

    public static InstanceType getDefaultInstanceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstanceType) ipChange.ipc$dispatch("38abe86d", new Object[0]);
        }
        if (f2908a == null) {
            String defaultPlatform = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).defaultPlatform();
            if (RVEnvironmentService.PLATFORM_AP.equals(defaultPlatform)) {
                f2908a = InstanceType.ALIPAY;
            } else if (RVEnvironmentService.PLATFORM_TB.equals(defaultPlatform)) {
                f2908a = InstanceType.TAOBAO;
            } else {
                return InstanceType.ALIPAY;
            }
        }
        return f2908a;
    }
}
