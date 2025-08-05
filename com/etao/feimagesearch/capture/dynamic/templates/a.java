package com.etao.feimagesearch.capture.dynamic.templates;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6572a;
    private String b;
    private JSONObject c;

    static {
        kge.a(-129508540);
    }

    public a(String pageKey, String templateUrl, JSONObject templateInfo) {
        q.c(pageKey, "pageKey");
        q.c(templateUrl, "templateUrl");
        q.c(templateInfo, "templateInfo");
        this.f6572a = pageKey;
        this.b = templateUrl;
        this.c = templateInfo;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f6572a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.c;
    }
}
