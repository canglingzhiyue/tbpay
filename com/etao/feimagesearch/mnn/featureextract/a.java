package com.etao.feimagesearch.mnn.featureextract;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f6771a;

    static {
        kge.a(1496965964);
    }

    public a(Bitmap bitmap) {
        q.c(bitmap, "bitmap");
        this.f6771a = bitmap;
    }

    public final Bitmap b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("e5c3e7c7", new Object[]{this}) : this.f6771a;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f6771a.hashCode();
    }
}
