package com.alipay.mobile.common.netsdkextdependapi.monitorinfo;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MonitorLoggerModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_LEVEL_DEBUG = "DEBUG";
    public static final String LOG_LEVEL_FATAL = "FATAL";
    public static final int LOG_LEVEL_HIGH = 1;
    public static final String LOG_LEVEL_INFO = "INFO";
    public static final int LOG_LEVEL_LOW = 3;
    public static final int LOG_LEVEL_MEDIUM = 2;

    /* renamed from: a  reason: collision with root package name */
    private String f5489a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f = 2;
    private Map<String, String> g = new HashMap();

    public String getSubType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d565815", new Object[]{this}) : this.f5489a;
    }

    public void setSubType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94783369", new Object[]{this, str});
        } else {
            this.f5489a = str;
        }
    }

    public String getParam1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b57edaff", new Object[]{this}) : this.c;
    }

    public void setParam1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a067257", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getParam2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c04959e", new Object[]{this}) : this.d;
    }

    public void setParam2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4380b98", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getParam3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c28a503d", new Object[]{this}) : this.e;
    }

    public void setParam3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e69a4d9", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public Map<String, String> getExtPramas() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e211cee7", new Object[]{this}) : getExtParams();
    }

    public Map<String, String> getExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this}) : this.g;
    }

    public void setExtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccea8b39", new Object[]{this, map});
        } else {
            this.g = map;
        }
    }

    public void addExtParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc7c8", new Object[]{this, str, str2});
        } else {
            this.g.put(str, str2);
        }
    }

    public void removeExtParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4459221", new Object[]{this, str});
        } else {
            this.g.remove(str);
        }
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.b;
    }

    public void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public int getLoggerLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66e4fc18", new Object[]{this})).intValue() : this.f;
    }

    public void setLoggerLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b7908a", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getSubType());
        stringBuffer.append(",");
        stringBuffer.append(getParam1());
        stringBuffer.append(",");
        stringBuffer.append(getParam2());
        stringBuffer.append(",");
        stringBuffer.append(getParam3());
        stringBuffer.append(",");
        for (String str : getExtPramas().keySet()) {
            stringBuffer.append(str + "=" + getExtPramas().get(str) + "^");
        }
        return stringBuffer.toString();
    }
}
