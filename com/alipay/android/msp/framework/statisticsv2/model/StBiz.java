package com.alipay.android.msp.framework.statisticsv2.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class StBiz implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4863a;
    private String b;

    public StBiz(String str, String str2) {
        this.f4863a = str;
        this.b = str2;
    }

    @Override // com.alipay.android.msp.framework.statisticsv2.model.IModel
    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("key", this.f4863a);
        hashMap.put("value", this.b);
        return hashMap;
    }
}
