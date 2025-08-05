package com.alipay.mobile.security.bio.log;

import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class VerifyBehavior {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5788a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Map<String, String> g = new HashMap();
    private int h = 2;
    private String i = VerifyBehavorLogger.LOG_BIZ_TYPE;

    public String getUserCaseID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d90d568d", new Object[]{this}) : this.f5788a;
    }

    public void setUserCaseID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf870289", new Object[]{this, str});
        } else {
            this.f5788a = str;
        }
    }

    public String getAppID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c34c3173", new Object[]{this}) : this.b;
    }

    @Deprecated
    public void setAppID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531292cb", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getSeedID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("335b69f7", new Object[]{this}) : this.c;
    }

    public void setSeedID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7bbc25f", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getParam1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b57edaff", new Object[]{this}) : this.d;
    }

    public void setParam1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a067257", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getParam2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c04959e", new Object[]{this}) : this.e;
    }

    public void setParam2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4380b98", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String getParam3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c28a503d", new Object[]{this}) : this.f;
    }

    public void setParam3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e69a4d9", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public Map<String, String> getExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this}) : this.g;
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

    public int getLoggerLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66e4fc18", new Object[]{this})).intValue() : this.h;
    }

    public void setLoggerLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b7908a", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.i;
    }

    public void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }
}
