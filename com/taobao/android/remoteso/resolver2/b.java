package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.c;
import tb.iir;
import tb.iis;
import tb.ijv;
import tb.ikw;
import tb.rgg;

/* loaded from: classes.dex */
public class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iis f14823a;
    private final ijv b;

    @Override // com.taobao.android.remoteso.resolver2.c
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "Compressed-assets";
    }

    public b(iis iisVar, ijv ijvVar) {
        this.f14823a = iisVar;
        this.b = ijvVar;
    }

    @Override // com.taobao.android.remoteso.resolver2.c
    public void a(final j jVar, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d284eb2", new Object[]{this, jVar, aVar});
            return;
        }
        RSoLog.c("PeekResolver ->  ExtractResolver, enter " + jVar.a());
        this.f14823a.a(jVar.a(), jVar.i(), this.b.a(jVar.e().provideStorageKey()), jVar.e(), new iis.a() { // from class: com.taobao.android.remoteso.resolver2.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iis.a
            public void a(iir iirVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("edbe3e46", new Object[]{this, iirVar});
                    return;
                }
                RSoLog.c("PeekResolver ->  ExtractResolver, onFinished " + iirVar.a() + ", " + iirVar.g());
                String c = iirVar.c();
                RSoException f = iirVar.f();
                if (f != null) {
                    aVar.a(k.a(jVar, rgg.ARG_EXTRAT, f));
                } else if (ikw.a((CharSequence) c)) {
                    aVar.a(k.a(jVar, rgg.ARG_EXTRAT, RSoException.error(5004)));
                } else {
                    aVar.a(k.a(jVar, c, rgg.ARG_EXTRAT));
                }
            }
        });
    }
}
