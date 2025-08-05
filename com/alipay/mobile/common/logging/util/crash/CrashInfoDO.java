package com.alipay.mobile.common.logging.util.crash;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import org.json.JSONObject;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class CrashInfoDO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mCrashType = 0;
    public int mSdkVersion = 0;
    public String mCrashProcessName = "";
    public String mCrashThreadName = "";
    public String mCrashProductVersion = "";
    public boolean mStartupCrash = false;
    public int mSignal = -1;
    public int mCode = -1;
    public int mCrashTimes = 1;
    public long mLastCrashTime = System.currentTimeMillis();

    public int getCrashType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a611d3c5", new Object[]{this})).intValue() : this.mCrashType;
    }

    public void setCrashType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41f817d", new Object[]{this, new Integer(i)});
        } else {
            this.mCrashType = i;
        }
    }

    public int getSdkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("541225ae", new Object[]{this})).intValue() : this.mSdkVersion;
    }

    public void setSdkVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65099e1c", new Object[]{this, new Integer(i)});
        } else {
            this.mSdkVersion = i;
        }
    }

    public String getCrashProcessName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8785fb0", new Object[]{this}) : this.mCrashProcessName;
    }

    public void setCrashProcessName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d624c6", new Object[]{this, str});
        } else {
            this.mCrashProcessName = str;
        }
    }

    public String getCrashThreadName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a4e8a33", new Object[]{this}) : this.mCrashThreadName;
    }

    public void setCrashThreadName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79aa910b", new Object[]{this, str});
        } else {
            this.mCrashThreadName = str;
        }
    }

    public String getCrashProductVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8bafadff", new Object[]{this}) : this.mCrashProductVersion;
    }

    public void setCrashProductVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21b8cbf", new Object[]{this, str});
        } else {
            this.mCrashProductVersion = str;
        }
    }

    public boolean isStartupCrash() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cfdbd3ff", new Object[]{this})).booleanValue() : this.mStartupCrash;
    }

    public void setStartupCrash(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73b0601", new Object[]{this, new Boolean(z)});
        } else {
            this.mStartupCrash = z;
        }
    }

    public int getSignal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad641718", new Object[]{this})).intValue() : this.mSignal;
    }

    public void setSignal(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9584b3f2", new Object[]{this, new Integer(i)});
        } else {
            this.mSignal = i;
        }
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.mCode;
    }

    public void setCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15beaf4d", new Object[]{this, new Integer(i)});
        } else {
            this.mCode = i;
        }
    }

    public int getCrashTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3322dcf", new Object[]{this})).intValue() : this.mCrashTimes;
    }

    public void setCrashTimes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ea9a1b", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = Math.abs(i);
        }
        this.mCrashTimes = i;
    }

    public long getLastCrashTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4e0261e3", new Object[]{this})).longValue() : this.mLastCrashTime;
    }

    public void setLastCrashTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975d4c1", new Object[]{this, new Long(j)});
        } else {
            this.mLastCrashTime = j;
        }
    }

    public void parse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293bdc44", new Object[]{this, jSONObject});
            return;
        }
        try {
            setCrashType(jSONObject.optInt("CrashType"));
            setCrashProcessName(jSONObject.optString("CrashProcessName"));
            setCrashThreadName(jSONObject.optString("CrashThreadName"));
            setCrashProductVersion(jSONObject.optString("CrashProductVersion"));
            setSdkVersion(jSONObject.optInt("SdkVersion"));
            setStartupCrash(jSONObject.optBoolean("StartupCrash"));
            setSignal(jSONObject.optInt(DXMonitorConstant.DX_MONITOR_SIGNAL));
            setCode(jSONObject.optInt("Code"));
            setCrashTimes(jSONObject.optInt("CrashTimes", 1));
            setLastCrashTime(jSONObject.optLong("LastCrashTime", System.currentTimeMillis()));
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("CrashInfoDO", th);
        }
    }

    public void merge(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca8a25f", new Object[]{this, jSONObject});
            return;
        }
        try {
            setCrashType(jSONObject.optInt("CrashType"));
            setCrashProcessName(jSONObject.optString("CrashProcessName"));
            setCrashThreadName(jSONObject.optString("CrashThreadName"));
            setCrashProductVersion(jSONObject.optString("CrashProductVersion"));
            setSdkVersion(jSONObject.optInt("SdkVersion"));
            setStartupCrash(jSONObject.optBoolean("StartupCrash"));
            setSignal(jSONObject.optInt(DXMonitorConstant.DX_MONITOR_SIGNAL));
            setCode(jSONObject.optInt("Code"));
            setCrashTimes(getCrashTimes() + jSONObject.optInt("CrashTimes", 1));
            setLastCrashTime(jSONObject.optLong("LastCrashTime", System.currentTimeMillis()));
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("CrashInfoDO", th);
        }
    }

    public JSONObject toJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c9c52117", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("CrashType", Integer.valueOf(getCrashType()));
            jSONObject.putOpt("CrashProcessName", getCrashProcessName());
            jSONObject.putOpt("CrashThreadName", getCrashThreadName());
            jSONObject.putOpt("CrashProductVersion", getCrashProductVersion());
            jSONObject.putOpt("SdkVersion", Integer.valueOf(getSdkVersion()));
            jSONObject.putOpt("StartupCrash", Boolean.valueOf(isStartupCrash()));
            jSONObject.putOpt(DXMonitorConstant.DX_MONITOR_SIGNAL, Integer.valueOf(getSignal()));
            jSONObject.putOpt("Code", Integer.valueOf(getCode()));
            jSONObject.putOpt("CrashTimes", Integer.valueOf(getCrashTimes()));
            jSONObject.putOpt("LastCrashTime", Long.valueOf(getLastCrashTime()));
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("CrashInfoDO", th);
        }
        return jSONObject;
    }
}
