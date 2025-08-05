package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.c;
import tb.ijd;
import tb.ikq;

/* loaded from: classes6.dex */
public class g implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f14829a;
    private final e b;
    private final i c;

    @Override // com.taobao.android.remoteso.resolver2.c
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "diffpatch";
    }

    public static /* synthetic */ void a(g gVar, j jVar, c.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1129958", new Object[]{gVar, jVar, aVar, rSoException});
        } else {
            gVar.a(jVar, aVar, rSoException);
        }
    }

    public g(ijd ijdVar, e eVar, i iVar) {
        this.f14829a = ijdVar;
        this.b = eVar;
        this.c = iVar;
    }

    @Override // com.taobao.android.remoteso.resolver2.c
    public void a(j jVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d284eb2", new Object[]{this, jVar, aVar});
            return;
        }
        SoInfo2 f = jVar.f();
        if (f == null) {
            RSoLog.c("DiffResolver -> fallback , soInfo2 == null");
            a(jVar, aVar, RSoException.error(6302));
            return;
        }
        RemoteResolver.RemoteAdvancedInfo a2 = l.a(f);
        if (a2 == null) {
            RSoLog.c("DiffResolver -> fallback , advancedInfo == null");
            a(jVar, aVar, RSoException.error(6302));
            return;
        }
        try {
            a(jVar, f.ext, a2, aVar);
        } catch (Throwable th) {
            ikq.a("DiffResolver -> tryRemoteDiffPatchResolve error", th);
            a(jVar, aVar, RSoException.error(6300));
        }
    }

    private void a(final j jVar, SoInfo2.Ext ext, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f52c35", new Object[]{this, jVar, ext, remoteAdvancedInfo, aVar});
            return;
        }
        RSoLog.c("DiffResolver -> tryDiffPatchResolve start, lib=" + jVar.a());
        c.a aVar2 = new c.a() { // from class: com.taobao.android.remoteso.resolver2.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.resolver2.c.a
            public void a(k kVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                    return;
                }
                RSoException e = kVar.e();
                if (e != null) {
                    RSoLog.c("DiffResolver -> tryDiffPatchResolve failed, will tryRemoteCompressedResolve");
                    g.a(g.this, jVar, aVar, e);
                    return;
                }
                RSoLog.c("DiffResolver -> tryDiffPatchResolve succ, lib=" + jVar.a());
                aVar.a(kVar.b("diff-patch-resolver"));
            }
        };
        if (ext.remoteDiffPatch) {
            this.c.a(jVar, remoteAdvancedInfo, aVar2);
        } else if (ext.inApkDiffPatch) {
            this.b.a(jVar, remoteAdvancedInfo, aVar2);
        } else {
            RSoLog.c("DiffResolver -> skip diff patch;  ext.*DiffPatch all disabled, lib=" + jVar.a());
            a(jVar, aVar, RSoException.error(6301));
        }
    }

    private void a(j jVar, c.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be45a51", new Object[]{this, jVar, aVar, rSoException});
        } else {
            aVar.a(k.a(jVar, "diff-patch-resolver", rSoException));
        }
    }
}
