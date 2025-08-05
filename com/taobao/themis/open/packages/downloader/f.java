package com.taobao.themis.open.packages.downloader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.l;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class f implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ruw f22677a;

    public f(ruw ruwVar) {
        this.f22677a = ruwVar;
    }

    @Override // com.taobao.zcache.l
    public final /* synthetic */ void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            q.b(this.f22677a.mo2423invoke(Long.valueOf(j), Long.valueOf(j2)), "invoke(...)");
        }
    }
}
