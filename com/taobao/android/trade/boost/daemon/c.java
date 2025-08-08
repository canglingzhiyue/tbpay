package com.taobao.android.trade.boost.daemon;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class c implements com.taobao.android.trade.boost.request.mtop.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f15591a = "apiName";
    private static String b = "apiVersion";
    private static String c = "stacktrace";
    private static String d = "extendInfo";
    private String e;
    private String f;
    private String g;
    private String h;

    public c(String str, String str2, String str3, String str4) {
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    @Override // com.taobao.android.trade.boost.request.mtop.b
    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(this.e)) {
            hashMap.put(f15591a, this.e);
        }
        if (!StringUtils.isEmpty(this.f)) {
            hashMap.put(b, this.f);
        }
        if (!StringUtils.isEmpty(this.h)) {
            hashMap.put(d, this.h);
        }
        if (!StringUtils.isEmpty(this.g)) {
            hashMap.put(c, this.g);
        }
        return hashMap;
    }
}
