package com.taobao.phenix.cache.disk;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.ImageStatistics;
import tb.kge;
import tb.nhx;
import tb.njd;
import tb.nje;
import tb.nmq;
import tb.nmv;

/* loaded from: classes7.dex */
public class j extends a<nje, njd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1801626759);
    }

    @Override // tb.nmx
    public /* bridge */ /* synthetic */ void a(nmv nmvVar, boolean z, nmq nmqVar) {
        a((nmv<nje, com.taobao.phenix.request.b>) nmvVar, z, (njd) nmqVar);
    }

    public j(e eVar) {
        super(1, 1, eVar);
    }

    @Override // tb.nmy
    public boolean a(nmv<nje, com.taobao.phenix.request.b> nmvVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f680a8e5", new Object[]{this, nmvVar})).booleanValue();
        }
        com.taobao.phenix.request.b e = nmvVar.e();
        nhx.b(e.b());
        if (com.taobao.phenix.intf.b.h().m() != null) {
            com.taobao.phenix.intf.b.h().m().b(nmvVar.e().b());
        }
        if (e.h()) {
            return false;
        }
        d(nmvVar);
        long a2 = a(e.l(), e.w(), e.x());
        if (a2 > 0) {
            z = true;
        }
        a(nmvVar, z);
        if (z) {
            e.b().j = a2;
            nhx.c(e.b());
            nhx.e(e.b());
            nje njeVar = new nje();
            njeVar.c = true;
            njeVar.b = a2;
            njeVar.f31497a = e.p();
            nmvVar.b(njeVar, true);
        }
        if (z || !e.g()) {
            return z;
        }
        nmvVar.b(new OnlyCacheFailedException("PrefetchDiskCache"));
        return true;
    }

    public void a(nmv<nje, com.taobao.phenix.request.b> nmvVar, boolean z, njd njdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a064125b", new Object[]{this, nmvVar, new Boolean(z), njdVar});
            return;
        }
        com.taobao.phenix.request.b e = nmvVar.e();
        ImageStatistics b = e.b();
        b.a(njdVar.c());
        b.b(njdVar.l);
        int a2 = a(e, njdVar, true);
        if (a2 == 1 || a2 == 2 || a2 == 0) {
            nje njeVar = new nje();
            njeVar.c = njdVar.e;
            njeVar.b = njdVar.l;
            njeVar.f31497a = njdVar.c;
            nhx.e(e.b());
            nmvVar.b(njeVar, z);
            return;
        }
        b a3 = a(e.l());
        String p = e.p();
        if (a2 == 3) {
            nmvVar.b(new CacheUnavailableException(a3, p));
        } else {
            nmvVar.b(new CacheWriteFailedException(a3, p));
        }
    }
}
