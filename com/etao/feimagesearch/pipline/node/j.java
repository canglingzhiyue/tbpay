package com.etao.feimagesearch.pipline.node;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.NodeType;
import kotlin.jvm.internal.q;
import tb.crj;
import tb.crl;
import tb.crq;
import tb.jex;
import tb.kge;

/* loaded from: classes3.dex */
public final class j extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Integer f6947a;

    static {
        kge.a(2016396499);
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : NodeType.NODE_IMAGE_CODE_DETECT;
    }

    public j(Integer num) {
        this.f6947a = num;
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("45632432", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        Integer num = this.f6947a;
        a("codeDetectToken", String.valueOf(num));
        if (num == null) {
            a(-18, "DetectToken非法");
            return crj.a(this, -18, "DetectToken非法", false, 4, null);
        }
        return new jex(new ImageCodeDetectNode$process$1(this, num));
    }
}
