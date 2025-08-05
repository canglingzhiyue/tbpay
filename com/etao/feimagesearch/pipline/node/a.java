package com.etao.feimagesearch.pipline.node;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.NodeType;
import kotlin.jvm.internal.q;
import tb.crj;
import tb.crl;
import tb.crq;
import tb.kge;

/* loaded from: classes3.dex */
public final class a extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RectF f6937a;

    static {
        kge.a(-1678771917);
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : NodeType.NODE_IMAGE_CROP;
    }

    public a(RectF rectF) {
        this.f6937a = rectF;
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        String str;
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
        RectF rectF = this.f6937a;
        if (rectF == null || (str = rectF.toString()) == null) {
            str = "null";
        }
        a("cropRectF", str);
        RectF rectF2 = this.f6937a;
        Bitmap a2 = rectF2 == null ? c : com.etao.feimagesearch.util.d.a(c, rectF2);
        if (a2 == null) {
            a("crop", "Crop Failure");
        } else {
            a("crop", "Crop Success");
            c = a2;
        }
        pipLineDS.b(c);
        d();
        com.etao.feimagesearch.newresult.perf.a.b(Long.valueOf(SystemClock.elapsedRealtime() - b()));
        return a(c);
    }
}
