package com.alibaba.triver.base.taobao;

import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class TriverRemoteMonitorData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f3632a;
    private String b;
    private boolean c = true;
    private ITriverRemoteProxy.DependenceMode d = ITriverRemoteProxy.DependenceMode.TRIVER_ONLY;
    private InstallType e = InstallType.EXPLICIT;

    /* loaded from: classes3.dex */
    public enum InstallType {
        SILENCE,
        EXPLICIT
    }

    /* loaded from: classes3.dex */
    public enum Status {
        Success,
        Fail,
        UserCancel
    }

    static {
        kge.a(-1935069907);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f3632a = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void a(ITriverRemoteProxy.DependenceMode dependenceMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bff17f", new Object[]{this, dependenceMode});
        } else {
            this.d = dependenceMode;
        }
    }

    public void a(InstallType installType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811ff879", new Object[]{this, installType});
        } else {
            this.e = installType;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void a(long j, Status status, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2239e6", new Object[]{this, new Long(j), status, str});
        } else if (status == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            InstallType installType = this.e;
            jSONObject.put("installType", (Object) (installType != null ? installType.name() : ""));
            String str2 = this.f3632a;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("bizType", (Object) str2);
            String str3 = this.b;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("bizId", (Object) str3);
            ITriverRemoteProxy.DependenceMode dependenceMode = this.d;
            jSONObject.put("installMode", (Object) (dependenceMode != null ? dependenceMode.name() : ""));
            jSONObject.put("installResult", (Object) status.name());
            if (str == null) {
                str = "";
            }
            jSONObject.put("errorMsg", (Object) str);
            jSONObject.put("needLoad", (Object) String.valueOf(this.c));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timeCost", (Object) Long.valueOf(j));
            a("Triver", "TriverRemote", jSONObject, jSONObject2);
        }
    }

    public static void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04f5c7c", new Object[]{str, str2, jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            try {
                if (jSONObject.size() > 0 && jSONObject2 != null) {
                    DimensionSet create = DimensionSet.create();
                    DimensionValueSet create2 = DimensionValueSet.create();
                    for (String str3 : jSONObject.keySet()) {
                        create.addDimension(new Dimension(str3));
                        create2.setValue(str3, jSONObject.getString(str3));
                    }
                    MeasureSet create3 = MeasureSet.create();
                    MeasureValueSet create4 = MeasureValueSet.create();
                    for (String str4 : jSONObject2.keySet()) {
                        create3.addMeasure(new Measure(str4));
                        create4.setValue(str4, jSONObject2.getDoubleValue(str4));
                    }
                    AppMonitor.register(str, str2, create3, create, true);
                    AppMonitor.Stat.commit(str, str2, create2, create4);
                }
            } catch (Throwable th) {
                RVLogger.e("TriverRemoteMonitorData", th);
            }
        }
    }
}
