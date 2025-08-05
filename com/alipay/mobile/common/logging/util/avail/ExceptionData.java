package com.alipay.mobile.common.logging.util.avail;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ExceptionData implements Comparable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String E_LAUNCH_TIME = "LAUNCH_TIME";
    public static final String E_TYPE = "TYPE";
    public static final String TYPE_ANR = "ANR";
    public static final String TYPE_CRASH = "CRASH";
    public static final String TYPE_START_APP_FAIL = "START_APP_FAIL";
    public static final String TYPE_START_UP_DEAD = "START_UP_DEAD";

    /* renamed from: a  reason: collision with root package name */
    private String f5468a;
    private long b = 0;

    public String getExceptionType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec373466", new Object[]{this}) : this.f5468a;
    }

    public void setExceptionType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4f3a38", new Object[]{this, str});
        } else {
            this.f5468a = str;
        }
    }

    public long getClientLaunchTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("44534abc", new Object[]{this})).longValue() : this.b;
    }

    public void setClientLaunchTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16293770", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public void parse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293bdc44", new Object[]{this, jSONObject});
            return;
        }
        try {
            setExceptionType(jSONObject.optString("TYPE"));
            setClientLaunchTime(jSONObject.optLong(E_LAUNCH_TIME));
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ExceptionData", th);
        }
    }

    public JSONObject toJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c9c52117", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("TYPE", getExceptionType());
            jSONObject.putOpt(E_LAUNCH_TIME, Long.valueOf(getClientLaunchTime()));
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ExceptionData", th);
        }
        return jSONObject;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, obj})).intValue();
        }
        int i = (this.b > ((ExceptionData) obj).b ? 1 : (this.b == ((ExceptionData) obj).b ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    public static boolean isValidExceptionType(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d29b6fac", new Object[]{str})).booleanValue() : str == null || TYPE_CRASH.equals(str) || TYPE_START_UP_DEAD.equals(str) || TYPE_ANR.equals(str) || TYPE_START_APP_FAIL.equals(str);
    }
}
