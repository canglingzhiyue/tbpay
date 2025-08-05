package com.alipay.android.msp.framework.statisticsv2.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class StWindow implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NET_TYPE = "netType";
    public static final String STATUS = "status";
    public static final String UPDATE_TIME = "updateTime";
    public static final String UPDATE_TYPE = "updateType";
    public static final String WINDOW_TIME = "windowTime";
    public static final String WIN_NAME = "winName";

    /* renamed from: a  reason: collision with root package name */
    private String f4866a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public StWindow(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f4866a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.e = str5;
        this.d = str6;
    }

    @Override // com.alipay.android.msp.framework.statisticsv2.model.IModel
    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WIN_NAME, this.f4866a);
        hashMap.put("netType", this.b);
        hashMap.put(UPDATE_TYPE, this.c);
        hashMap.put("status", this.f);
        hashMap.put(UPDATE_TIME, this.e);
        hashMap.put(WINDOW_TIME, this.d);
        return hashMap;
    }
}
