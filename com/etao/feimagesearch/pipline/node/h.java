package com.etao.feimagesearch.pipline.node;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.NodeType;
import com.etao.feimagesearch.util.am;
import com.etao.feimagesearch.util.w;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.util.ErrorConstant;
import tb.crj;
import tb.crk;
import tb.crl;
import tb.crq;
import tb.kge;

/* loaded from: classes3.dex */
public final class h extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6946a;
    private Map<String, String> b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;

    static {
        kge.a(-69649397);
    }

    public h() {
        this(null, null, null, null, null, false, false, 127, null);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : NodeType.NODE_IMAGE_SEARCH;
    }

    public /* synthetic */ h(String str, String str2, String str3, Map map, String str4, boolean z, boolean z2, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? com.etao.feimagesearch.config.b.I() : str2, (i & 4) != 0 ? com.etao.feimagesearch.config.b.J() : str3, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    public h(String str, String str2, String str3, Map<String, String> map, String str4, boolean z, boolean z2) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.b = map;
        this.f = str4;
        this.g = z;
        this.f6946a = z2;
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("45632432", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        if (!com.taobao.android.searchbaseframe.util.o.d()) {
            a(-10, ErrorConstant.ERRMSG_NO_NETWORK);
            return a(-10, ErrorConstant.ERRMSG_NO_NETWORK, this.f6946a);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = this.b;
        if (map == null) {
            Map<String, String> f = pipLineDS.f();
            if (f != null && !f.isEmpty()) {
                z = false;
            }
            if (!z) {
                Map<String, String> a2 = w.a(pipLineDS.n(), pipLineDS.f());
                q.a((Object) a2, "MtopUtil.preHandleReques…neDS.pageParams\n        )");
                linkedHashMap.putAll(a2);
            }
            if (!pipLineDS.o()) {
                linkedHashMap.putAll(pipLineDS.s());
                String str = pipLineDS.i().get();
                if (str != null) {
                    linkedHashMap.put("universalCardFeature", str);
                }
                linkedHashMap.put(com.etao.feimagesearch.util.o.KEY_IMG, pipLineDS.h());
                linkedHashMap.put("full_region_size", pipLineDS.p());
            }
            if (!StringUtils.isEmpty(pipLineDS.e())) {
                linkedHashMap.put("region", pipLineDS.e());
            }
            com.etao.feimagesearch.util.o.a(linkedHashMap);
            com.etao.feimagesearch.util.o.b(linkedHashMap);
            if (pipLineDS.d() == null && pipLineDS.t()) {
                linkedHashMap.put("component", "plt_text_search_api");
            }
        } else {
            linkedHashMap.putAll(map);
        }
        String c = c(pipLineDS);
        a("apiName", this.d);
        a("appId", c);
        a((Map<String, String>) linkedHashMap);
        return a(c, linkedHashMap);
    }

    private final crl a(String str, Map<String, String> map) {
        crk a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("71ca5fd6", new Object[]{this, str, map});
        }
        String str2 = this.d;
        String str3 = this.e;
        am b = com.etao.feimagesearch.util.o.b(str, str2, str3, this.f, map);
        a("mtopTraceId", b.e());
        a("eagleeyeTraceId", b.f());
        com.etao.feimagesearch.newresult.base.c a3 = com.etao.feimagesearch.newresult.base.c.Companion.a(b.d());
        a3.f(map.remove(com.etao.feimagesearch.util.o.KEY_IMG));
        map.put("appId", str);
        map.put("apiName", str2);
        map.put("apiVersion", str3);
        a3.a(map);
        a3.f(this.g);
        if (b.a() && a3.r()) {
            d();
            a2 = a(a3);
        } else {
            Integer b2 = b.b();
            int intValue = b2 != null ? b2.intValue() : -14;
            String c = b.c();
            if (c == null) {
                c = "请求失败，原因未知";
            }
            a(intValue, c);
            a2 = a(Integer.valueOf(intValue), c, this.f6946a, a3);
        }
        com.etao.feimagesearch.newresult.perf.a.j(Long.valueOf(SystemClock.elapsedRealtime() - b()));
        com.etao.feimagesearch.newresult.perf.a.ah();
        return a2;
    }

    private final String c(crq crqVar) {
        String i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d62da4e8", new Object[]{this, crqVar});
        }
        String chituDebugAppId = com.etao.feimagesearch.config.b.k("irpMockAppId");
        if (!StringUtils.isEmpty(chituDebugAppId)) {
            q.a((Object) chituDebugAppId, "chituDebugAppId");
            return chituDebugAppId;
        }
        if (crqVar.d() != null || !crqVar.t()) {
            String str = this.c;
            if (str == null || StringUtils.isEmpty(str)) {
                String u = crqVar.u();
                if (u == null) {
                    u = "";
                }
                i = com.etao.feimagesearch.config.b.i(u);
            } else {
                i = str;
            }
        } else {
            i = "37747";
        }
        q.a((Object) i, "if (pipLineDS.pendingBit…urAppId\n        }\n      }");
        return i;
    }
}
