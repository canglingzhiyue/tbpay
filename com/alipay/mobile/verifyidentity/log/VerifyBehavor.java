package com.alipay.mobile.verifyidentity.log;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class VerifyBehavor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5876a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Map<String, String> f = new HashMap();
    private int g = 2;
    private String h = VerifyBehavorLogger.LOG_BIZ_TYPE;

    public String getUserCaseID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d90d568d", new Object[]{this}) : this.f5876a;
    }

    public void setUserCaseID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf870289", new Object[]{this, str});
        } else {
            this.f5876a = str;
        }
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

    public String getParam1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b57edaff", new Object[]{this}) : this.c;
    }

    public String getParam2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c04959e", new Object[]{this}) : this.d;
    }

    public String getParam3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c28a503d", new Object[]{this}) : this.e;
    }

    public Map<String, String> getExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this}) : this.f;
    }
}
