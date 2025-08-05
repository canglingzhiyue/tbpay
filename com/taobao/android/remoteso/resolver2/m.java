package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.resolver2.c;
import java.io.File;
import java.util.HashMap;
import tb.ijv;
import tb.ikn;
import tb.ikq;
import tb.ikw;
import tb.iky;

/* loaded from: classes6.dex */
public class m implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f14839a;
    private final ijv b;

    public static /* synthetic */ k a(m mVar, k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("5f8eb0cd", new Object[]{mVar, kVar}) : mVar.a(kVar);
    }

    public static /* synthetic */ void a(m mVar, k kVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6f0991", new Object[]{mVar, kVar, cVar});
        } else {
            mVar.a(kVar, cVar);
        }
    }

    public m(ijv ijvVar, d dVar) {
        this.b = ijvVar;
        this.f14839a = dVar;
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public k a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("4c517c4f", new Object[]{this, jVar}) : this.f14839a.a(jVar);
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public void a(final c cVar, final j jVar, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af9ed67d", new Object[]{this, cVar, jVar, aVar});
            return;
        }
        jVar.h().a("begin");
        b(jVar);
        this.f14839a.a(cVar, jVar, new c.a() { // from class: com.taobao.android.remoteso.resolver2.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.resolver2.c.a
            public void a(k kVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                    return;
                }
                final k a2 = m.a(m.this, kVar);
                ikq.a("ResolverHookTracker.resolve", new Runnable() { // from class: com.taobao.android.remoteso.resolver2.m.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        jVar.h().a("end", "begin");
                        m.a(m.this, a2, cVar);
                    }
                });
                aVar.a(a2);
            }
        });
    }

    private void b(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a91beb", new Object[]{this, jVar});
            return;
        }
        String i = jVar.i();
        SoIndexData.SoFileInfo e = jVar.e();
        String b = this.b.b(i, e.provideStorageKey());
        if (!ikw.b((CharSequence) b)) {
            return;
        }
        File file = new File(b);
        iky.a(file);
        ikq.a("Resolver,clearWrongFile", "illegalLibFile = " + file + ", info.length = " + e.getLength() + ", file.length=" + file.length());
    }

    private k a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("f3de5ae", new Object[]{this, kVar});
        }
        j b = kVar.b();
        String c = kVar.c();
        if (kVar.e() == null) {
            return ikw.a((CharSequence) c) ? k.a(b, kVar.d(), RSoException.error(6097)) : kVar;
        }
        if (ikw.b((CharSequence) c)) {
            File file = new File(c);
            ikq.a("Resolver:deleteFileOnException", "illegalLibFile = " + file);
            iky.a(file);
        }
        return kVar;
    }

    private void a(k kVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a670d0", new Object[]{this, kVar, cVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ikn.ARGS_LIB_NAME, kVar.a());
        hashMap.put("arg_resolve_type", cVar.a());
        hashMap.put("arg_resolve_from", kVar.d());
        hashMap.put("arg_resolve_by", kVar.b().g());
        hashMap.putAll(kVar.b().h().a());
        if (kVar.e() == null) {
            ikq.b("remoteso-resolve-core", hashMap);
        } else {
            ikq.a("remoteso-resolve-core", hashMap, kVar.e());
        }
    }
}
