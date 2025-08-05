package com.etao.feimagesearch.pipline.node;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.NodeType;
import com.etao.feimagesearch.util.w;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.crj;
import tb.crl;
import tb.crq;
import tb.kge;

/* loaded from: classes3.dex */
public final class f extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6944a;
    private String b;
    private String c;
    private boolean d;

    static {
        kge.a(170091701);
    }

    public f() {
        this(null, null, null, false, 15, null);
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : NodeType.NODE_IMAGE_MOCK_SEARCH;
    }

    public /* synthetic */ f(String str, String str2, String str3, boolean z, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? com.etao.feimagesearch.config.b.I() : str2, (i & 4) != 0 ? com.etao.feimagesearch.config.b.J() : str3, (i & 8) != 0 ? true : z);
    }

    public f(String str, String str2, String str3, boolean z) {
        this.f6944a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("45632432", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (pipLineDS.f() != null) {
            Map<String, String> f = pipLineDS.f();
            if (f == null) {
                q.a();
            }
            if (!f.isEmpty()) {
                Map<String, String> a2 = w.a(pipLineDS.n(), pipLineDS.f());
                q.a((Object) a2, "MtopUtil.preHandleReques…neDS.pageParams\n        )");
                linkedHashMap.putAll(a2);
            }
        }
        if (this.d && !pipLineDS.o()) {
            linkedHashMap.putAll(pipLineDS.s());
            String str = pipLineDS.i().get();
            if (str != null) {
                linkedHashMap.put("universalCardFeature", str);
            }
            linkedHashMap.put(com.etao.feimagesearch.util.o.KEY_IMG, pipLineDS.h());
            linkedHashMap.put("full_region_size", pipLineDS.p());
        }
        if (!TextUtils.isEmpty(pipLineDS.e())) {
            linkedHashMap.put("region", pipLineDS.e());
        }
        com.etao.feimagesearch.util.o.a(linkedHashMap);
        com.etao.feimagesearch.util.o.b(linkedHashMap);
        a((Map<String, String>) linkedHashMap);
        d();
        return a((Object) linkedHashMap);
    }
}
