package com.etao.feimagesearch.capture.dynamic.bottom.album;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class CaptureAlbumView$folderAdapter$1 extends Lambda implements rul<k, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureAlbumView$folderAdapter$1(d dVar) {
        super(1);
        this.this$0 = dVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(k kVar) {
        invoke2(kVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(k it) {
        com.etao.feimagesearch.album.b e;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43ffdf2", new Object[]{this, it});
            return;
        }
        q.c(it, "it");
        d.d(this.this$0).setText(it.a());
        a e2 = d.e(this.this$0);
        c b = d.b(this.this$0);
        e2.a(it, (b == null || (e = b.e()) == null) ? null : e.b());
        d dVar = this.this$0;
        if (d.e(dVar).getItemCount() != 0) {
            z = false;
        }
        d.c(dVar, z);
        d.b(this.this$0, false);
    }
}
