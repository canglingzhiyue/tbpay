package com.taobao.tbdeviceevaluator.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGConstantsTypeInfo;
import com.taobao.browser.utils.i;
import org.json.JSONObject;
import tb.aks;
import tb.akt;
import tb.eoe;

/* loaded from: classes8.dex */
public class AliHADeviceEvaluationBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AliHADeviceEvaluationBridge aliHADeviceEvaluationBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"getPerformanceInfo".equals(str)) {
            return false;
        }
        return getPerformanceInfo(str2, wVCallBackContext);
    }

    private boolean getPerformanceInfo(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2563341a", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        try {
            str2 = new JSONObject(str).getString("filter");
        } catch (Throwable th) {
            th.printStackTrace();
            str2 = "";
        }
        try {
            if (StringUtils.isEmpty(str2)) {
                z = true;
            } else if ("all".equalsIgnoreCase(str2)) {
                z = false;
                z2 = true;
                if (!str2.contains("outline") || z || z2) {
                    rVar.a("deviceLevel", Integer.valueOf(akt.a() + 1));
                    rVar.a("deviceLevelEasy", Integer.valueOf(aks.a().g().b + 1));
                    rVar.a("deviceScore", Float.valueOf(akt.b()));
                }
                if (!str2.contains("memory") || z2) {
                    JSONObject jSONObject = new JSONObject();
                    aks.c f = aks.a().f();
                    jSONObject.put("jvmUsedMemory", f.d);
                    jSONObject.put("jvmTotalMemory", f.c);
                    jSONObject.put("nativeUsedMemory", f.f);
                    jSONObject.put("nativeTotalMemory", f.e);
                    jSONObject.put("deviceUsedMemory", f.b);
                    jSONObject.put(i.KEY_MONITOR_DEVICE_TOTAL_MEMORY, f.f25406a);
                    jSONObject.put("dalvikPSSMemory", f.g);
                    jSONObject.put("nativePSSMemory", f.h);
                    jSONObject.put("totalPSSMemory", f.i);
                    jSONObject.put("deviceLevel", f.j);
                    jSONObject.put("runtimeLevel", f.k);
                    rVar.a("memoryInfo", jSONObject);
                }
                if (!str2.contains(eoe.TYPE_CPU) || z2) {
                    JSONObject jSONObject2 = new JSONObject();
                    aks.a e = aks.a().e();
                    jSONObject2.put("frequency", e.b);
                    jSONObject2.put("cpuUsageOfApp", e.c);
                    jSONObject2.put("cpuUsageOfDevice", e.d);
                    jSONObject2.put(RGConstantsTypeInfo.CPU_CORE_NUM, e.f25404a);
                    jSONObject2.put("deviceLevel", e.f);
                    jSONObject2.put("runtimeLevel", e.g);
                    rVar.a("cpuInfo", jSONObject2);
                }
                if (!str2.contains("opengl") || z2) {
                    rVar.a("openGLVersion", aks.a().d().d);
                }
                wVCallBackContext.success(rVar);
                return true;
            } else {
                z = false;
            }
            z2 = false;
            if (!str2.contains("outline")) {
            }
            rVar.a("deviceLevel", Integer.valueOf(akt.a() + 1));
            rVar.a("deviceLevelEasy", Integer.valueOf(aks.a().g().b + 1));
            rVar.a("deviceScore", Float.valueOf(akt.b()));
            if (!str2.contains("memory")) {
            }
            JSONObject jSONObject3 = new JSONObject();
            aks.c f2 = aks.a().f();
            jSONObject3.put("jvmUsedMemory", f2.d);
            jSONObject3.put("jvmTotalMemory", f2.c);
            jSONObject3.put("nativeUsedMemory", f2.f);
            jSONObject3.put("nativeTotalMemory", f2.e);
            jSONObject3.put("deviceUsedMemory", f2.b);
            jSONObject3.put(i.KEY_MONITOR_DEVICE_TOTAL_MEMORY, f2.f25406a);
            jSONObject3.put("dalvikPSSMemory", f2.g);
            jSONObject3.put("nativePSSMemory", f2.h);
            jSONObject3.put("totalPSSMemory", f2.i);
            jSONObject3.put("deviceLevel", f2.j);
            jSONObject3.put("runtimeLevel", f2.k);
            rVar.a("memoryInfo", jSONObject3);
            if (!str2.contains(eoe.TYPE_CPU)) {
            }
            JSONObject jSONObject22 = new JSONObject();
            aks.a e2 = aks.a().e();
            jSONObject22.put("frequency", e2.b);
            jSONObject22.put("cpuUsageOfApp", e2.c);
            jSONObject22.put("cpuUsageOfDevice", e2.d);
            jSONObject22.put(RGConstantsTypeInfo.CPU_CORE_NUM, e2.f25404a);
            jSONObject22.put("deviceLevel", e2.f);
            jSONObject22.put("runtimeLevel", e2.g);
            rVar.a("cpuInfo", jSONObject22);
            if (!str2.contains("opengl")) {
            }
            rVar.a("openGLVersion", aks.a().d().d);
            wVCallBackContext.success(rVar);
            return true;
        } catch (Throwable th2) {
            rVar.a("errMsg", th2.getMessage());
            wVCallBackContext.error(rVar);
            return false;
        }
    }
}
