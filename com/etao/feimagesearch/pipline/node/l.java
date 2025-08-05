package com.etao.feimagesearch.pipline.node;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.NodeType;
import com.etao.feimagesearch.util.am;
import com.taobao.android.searchbaseframe.util.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.util.ErrorConstant;
import tb.crj;
import tb.crl;
import tb.crq;
import tb.kge;

/* loaded from: classes3.dex */
public final class l extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6949a;
    private String b;
    private String c;
    private Map<String, String> d;
    private String e;
    private boolean f;

    static {
        kge.a(174313804);
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : NodeType.NODE_COMMON_REQUEST;
    }

    public l(String str, String str2, String str3, Map<String, String> map, String str4, boolean z) {
        this.f6949a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = str4;
        this.f = z;
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("45632432", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        if (!o.d()) {
            a(-10, ErrorConstant.ERRMSG_NO_NETWORK);
            return a(-10, ErrorConstant.ERRMSG_NO_NETWORK, this.f);
        } else if (TextUtils.isEmpty(this.f6949a) || TextUtils.isEmpty(this.b)) {
            a(-18, "无效请求");
            return a(-18, "无效请求", this.f);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> map = this.d;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            a("apiName", this.b);
            a("appId", this.f6949a);
            a((Map<String, String>) linkedHashMap);
            am a2 = com.etao.feimagesearch.util.o.a(this.f6949a, this.b, this.c, this.e, linkedHashMap);
            a("mtopTraceId", a2.e());
            a("eagleeyeTraceId", a2.f());
            if (a2.a()) {
                d();
                return a(a2);
            }
            Integer b = a2.b();
            int intValue = b != null ? b.intValue() : -14;
            String c = a2.c();
            if (c == null) {
                c = "请求失败，原因未知";
            }
            a(intValue, c);
            return a(Integer.valueOf(intValue), c, this.f, a2);
        }
    }
}
