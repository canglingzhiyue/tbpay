package com.taobao.phenix.cache.disk;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.ImageStatistics;
import tb.kge;
import tb.njd;
import tb.nmv;

/* loaded from: classes.dex */
public class d extends a<njd, njd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f18868a;

    static {
        kge.a(-1400072977);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(e eVar, c cVar) {
        super(1, 0, eVar);
        this.f18868a = cVar;
    }

    private boolean a(com.taobao.phenix.request.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71690dc7", new Object[]{this, bVar})).booleanValue();
        }
        c cVar = this.f18868a;
        return cVar != null && cVar.b(bVar.p());
    }

    private void a(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef635127", new Object[]{this, imageStatistics});
        } else if (com.taobao.phenix.intf.b.h().m() == null) {
        } else {
            com.taobao.phenix.intf.b.h().m().b(imageStatistics);
        }
    }

    @Override // tb.nmy
    public boolean a(nmv<njd, com.taobao.phenix.request.b> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f680a8e5", new Object[]{this, nmvVar})).booleanValue();
        }
        com.taobao.phenix.request.b e = nmvVar.e();
        a(nmvVar.e().b());
        if (!e.h()) {
            return a(nmvVar, e);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(tb.nmv<tb.njd, com.taobao.phenix.request.b> r22, com.taobao.phenix.request.b r23) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.phenix.cache.disk.d.a(tb.nmv, com.taobao.phenix.request.b):boolean");
    }
}
