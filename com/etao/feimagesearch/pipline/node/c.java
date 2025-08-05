package com.etao.feimagesearch.pipline.node;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.NodeType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.q;
import tb.crj;
import tb.crl;
import tb.crq;
import tb.kge;

/* loaded from: classes3.dex */
public final class c extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Integer f6942a;

    static {
        kge.a(1828496526);
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : NodeType.NODE_IMAGE_FEATURE_EXTRACT;
    }

    public c(Integer num) {
        this.f6942a = num;
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("45632432", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        Bitmap c = pipLineDS.c();
        if (c == null) {
            a(-8, "需要处理的图片资源不存在");
            return crj.a(this, -8, "需要处理的图片资源不存在", false, 4, null);
        }
        Integer num = this.f6942a;
        com.etao.feimagesearch.mnn.featureextract.b b = com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.b(num);
        if (b == null || b.c() == -5) {
            if (num == null) {
                Bitmap copy = c.copy(c.getConfig(), true);
                q.a((Object) copy, "originalBitmap.copy(originalBitmap.config, true)");
                com.etao.feimagesearch.mnn.featureextract.a aVar = new com.etao.feimagesearch.mnn.featureextract.a(copy);
                com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.a(aVar);
                num = Integer.valueOf(aVar.a());
            }
            return a(num);
        }
        if (b.f()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("imgExtractInfo", b.d());
            linkedHashMap.put("imgRongzaiExtraInfo", b.e());
            pipLineDS.f(linkedHashMap);
        }
        com.etao.feimagesearch.newresult.perf.a.i(b.b());
        a("imgFeatureExtractResult", b.toString());
        a("imgFeatureExtractTime", String.valueOf(b.a()));
        a("imgFeatureExtractTime", String.valueOf(b.b()));
        return a((Object) pipLineDS.v());
    }
}
