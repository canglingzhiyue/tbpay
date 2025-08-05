package com.o2o.ad.expo;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f8107a = new HashMap();
    private String b;

    static {
        kge.a(-1345357793);
    }

    public a(String str) {
        this.b = str;
    }

    public a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("45e45284", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.f8107a.put("namespace", str);
        }
        return this;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : new O2OExpoCommitter(this.b, this.f8107a).a();
    }
}
