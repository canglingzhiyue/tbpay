package com.alipay.mobile.common.logging.api.monitor;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class BatteryModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5420a;
    public String bundle;
    public String diagnose;
    public Map<String, String> params;
    public long power;
    public long time;
    public BatteryID type;

    public static BatteryModel obtain(BatteryID batteryID, long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BatteryModel) ipChange.ipc$dispatch("d8b3318a", new Object[]{batteryID, new Long(j), str, str2}) : obtain(batteryID, 0L, str2);
    }

    private BatteryModel() {
    }

    public BatteryModel cloneMirror() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BatteryModel) ipChange.ipc$dispatch("edb00090", new Object[]{this});
        }
        BatteryModel obtain = obtain(this.type, this.time, this.diagnose);
        obtain.power = this.power;
        obtain.bundle = this.bundle;
        obtain.f5420a = this.f5420a;
        if (this.params != null) {
            obtain.params = new HashMap();
            for (Map.Entry<String, String> entry : this.params.entrySet()) {
                obtain.params.put(entry.getKey(), entry.getValue());
            }
        }
        return obtain;
    }

    public void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
            return;
        }
        this.f5420a = false;
        this.type = BatteryID.UNKNOWN;
        this.time = 0L;
        this.power = 0L;
        this.bundle = null;
        this.diagnose = null;
        this.params = null;
    }

    public boolean isInUse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1363d7a3", new Object[]{this})).booleanValue() : this.f5420a;
    }

    public void report() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
        } else {
            LoggerFactory.getMonitorLogger().battery(this);
        }
    }

    public String getParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf0db78", new Object[]{this, str});
        }
        Map<String, String> map = this.params;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public BatteryModel putParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BatteryModel) ipChange.ipc$dispatch("346cf9e6", new Object[]{this, str, str2});
        }
        if (this.params == null) {
            this.params = new HashMap();
        }
        this.params.put(str, str2);
        return this;
    }

    public BatteryModel removeParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BatteryModel) ipChange.ipc$dispatch("7fb49407", new Object[]{this, str});
        }
        Map<String, String> map = this.params;
        if (map != null) {
            map.remove(str);
        }
        return this;
    }

    public static BatteryModel obtain(BatteryID batteryID, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BatteryModel) ipChange.ipc$dispatch("430adf00", new Object[]{batteryID, new Long(j), str});
        }
        BatteryModel batteryModel = new BatteryModel();
        batteryModel.recycle();
        batteryModel.type = batteryID;
        batteryModel.time = j;
        batteryModel.diagnose = str;
        batteryModel.f5420a = true;
        return batteryModel;
    }
}
