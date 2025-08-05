package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.c;
import tb.ijv;

/* loaded from: classes6.dex */
public class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijv f14821a;

    public a(ijv ijvVar) {
        this.f14821a = ijvVar;
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public k a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("4c517c4f", new Object[]{this, jVar});
        }
        RSoLog.c("DefaultResolveHook, peek(), " + jVar.a());
        SoIndexData.SoFileInfo e = jVar.e();
        String b = this.f14821a.b(jVar.i(), e.provideStorageKey());
        if (l.a(b, e.getLength()) != null) {
            return l.a(jVar, b, "manager-peek");
        }
        return l.a(jVar, RSoException.error(6306), "manager-peek");
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public void a(c cVar, j jVar, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af9ed67d", new Object[]{this, cVar, jVar, aVar});
            return;
        }
        RSoLog.c("DefaultResolveHook, resolve(), " + jVar.a());
        cVar.a(jVar, new c.a() { // from class: com.taobao.android.remoteso.resolver2.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.resolver2.c.a
            public void a(k kVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                } else {
                    aVar.a(kVar);
                }
            }
        });
    }
}
