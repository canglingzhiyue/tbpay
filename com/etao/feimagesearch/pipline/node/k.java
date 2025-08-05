package com.etao.feimagesearch.pipline.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.NodeType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.q;
import tb.crj;
import tb.crl;
import tb.crq;
import tb.kge;

/* loaded from: classes3.dex */
public final class k extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Integer f6948a;

    static {
        kge.a(-912323257);
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : NodeType.NODE_IMAGE_CHANNEL_DETECT;
    }

    public k(Integer num) {
        this.f6948a = num;
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("45632432", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        com.etao.feimagesearch.mnn.channel.b a2 = com.etao.feimagesearch.capture.scan.irp.c.Companion.a().a(this.f6948a);
        if (a2 == null) {
            a2 = new com.etao.feimagesearch.mnn.channel.b(-4, "detect timeout", 0L);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("imgClientChannel", String.valueOf(a2.a()));
        linkedHashMap.put("imgClientDetectExtraInfo", a2.b());
        Integer a3 = a2.a();
        com.etao.feimagesearch.newresult.perf.a.b(a3 != null ? a3.intValue() : -1);
        pipLineDS.b(linkedHashMap);
        a("channelDetectResult", JSONObject.toJSONString(a2));
        a("channelDetectTime", String.valueOf(a2.c()));
        if (a2.c() > 0) {
            com.etao.feimagesearch.newresult.perf.a.l(Long.valueOf(a2.c()));
        }
        return a((Object) pipLineDS.g());
    }
}
