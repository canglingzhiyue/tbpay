package com.alibaba.android.ultron.vfw.dataloader;

import com.alibaba.android.ultron.vfw.dataloader.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class l implements p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d f2703a;
    public o b;
    public i c;

    static {
        kge.a(200529302);
        kge.a(-1612684884);
    }

    public static l a(d dVar, o oVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("8fbba4e0", new Object[]{dVar, oVar, iVar});
        }
        l lVar = new l();
        lVar.f2703a = dVar;
        lVar.b = oVar;
        lVar.c = iVar;
        if (dVar != null && oVar != null) {
            return lVar;
        }
        throw new IllegalArgumentException("DataParserRequest params error");
    }

    @Override // com.alibaba.android.ultron.vfw.dataloader.p
    public void a(m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24be769f", new Object[]{this, aVar});
        } else {
            this.b.a(this.f2703a, new i() { // from class: com.alibaba.android.ultron.vfw.dataloader.l.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.dataloader.i
                public j a(j jVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (j) ipChange2.ipc$dispatch("bead3816", new Object[]{this, jVar}) : l.this.c.a(jVar);
                }
            });
        }
    }
}
