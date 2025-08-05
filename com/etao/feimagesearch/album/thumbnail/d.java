package com.etao.feimagesearch.album.thumbnail;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f6507a;
    private a b;

    static {
        kge.a(1248045773);
    }

    public d(a thumbnailExecutor) {
        q.c(thumbnailExecutor, "thumbnailExecutor");
        this.b = thumbnailExecutor;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e eVar = this.f6507a;
        if (eVar == null) {
            return;
        }
        this.b.b(eVar);
        this.f6507a = null;
    }

    public final void a(o oVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f5a7d1", new Object[]{this, oVar, imageView});
        } else if (oVar == null || imageView == null) {
        } else {
            a();
            e eVar = new e(oVar, imageView);
            this.b.a(eVar);
            this.f6507a = eVar;
        }
    }
}
